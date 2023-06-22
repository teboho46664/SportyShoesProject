package com.api.sportyShoes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sportyShoes.model.Shoe;

public interface ShoesRepository extends JpaRepository<Shoe, Integer>{
	
}
