package com.ikang.ui.dao;

import com.ikang.ui.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xuyang
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
