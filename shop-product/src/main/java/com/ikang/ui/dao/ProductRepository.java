package com.ikang.ui.dao;

import com.ikang.ui.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xuyang
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
