package com.azocar.josmer_pizzeria.persistence.repository;

import com.azocar.josmer_pizzeria.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PizzaPagSortRepository extends ListPagingAndSortingRepository<PizzaEntity, Integer> {
}
