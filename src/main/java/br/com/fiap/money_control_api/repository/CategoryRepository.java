package br.com.fiap.money_control_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.money_control_api.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
