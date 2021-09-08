package com.crisaoo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisaoo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
