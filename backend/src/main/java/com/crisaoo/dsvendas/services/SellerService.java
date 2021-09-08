package com.crisaoo.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisaoo.dsvendas.dto.SellerDTO;
import com.crisaoo.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		// Busco minha lista de sellers no banco de dados, converto para uma stream e utilizo o metodo map
		// para criar uma nova colecao. Depois, converto essa colecao para o tipo List novamente.
		return repository.findAll().stream().map(entity -> new SellerDTO(entity)).collect(Collectors.toList());
	}
	
}
