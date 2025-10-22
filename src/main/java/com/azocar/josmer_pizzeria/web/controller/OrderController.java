package com.azocar.josmer_pizzeria.web.controller;

import com.azocar.josmer_pizzeria.persistence.entity.OrderEntity;
import com.azocar.josmer_pizzeria.persistence.projection.OrderSummary;
import com.azocar.josmer_pizzeria.service.OrderService;
import com.azocar.josmer_pizzeria.service.dto.RandomOrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<OrderEntity>> getAll(){
        return ResponseEntity.ok(this.orderService.getAll());
    }

    @GetMapping("/today")
    public ResponseEntity<List<OrderEntity>> getTodayOrders(){
        return ResponseEntity.ok(this.orderService.getTodayOrders());
    }

    @GetMapping("/outside")
    public ResponseEntity<List<OrderEntity>> getOutside(){
        return ResponseEntity.ok(this.orderService.getOutsideOrders());
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<List<OrderEntity>> getOutsideOrders(@PathVariable String id){
        return ResponseEntity.ok(this.orderService.getCustomerOrders(id));
    }

    @GetMapping("/summary/{id}")
    public ResponseEntity<OrderSummary> getOutsideOrders(@PathVariable int id){
        return ResponseEntity.ok(this.orderService.getSummary(id));
    }

    @PostMapping("/order/random")
    public ResponseEntity<Boolean> randomOrder(@RequestBody RandomOrderDto dto) {
        boolean result = orderService.saveRandomOrder(dto);
        return ResponseEntity.ok(result);
    }

}
