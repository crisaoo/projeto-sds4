package com.crisaoo.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crisaoo.dsvendas.dto.SaleDTO;
import com.crisaoo.dsvendas.entities.Sale;
import com.crisaoo.dsvendas.repositories.SaleRepository;
import com.crisaoo.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		// Como sei que o numero de sellers eh um numero realtivamenet pequeno, irei busca-los no banco 
		// para que a JPA armazene esses dados em cache, evitando interacoes repetitivas ao banco de dados
		sellerRepository.findAll();
		Page<Sale> page = repository.findAll(pageable);
		return page.map(sale -> new SaleDTO(sale));
	}
}
