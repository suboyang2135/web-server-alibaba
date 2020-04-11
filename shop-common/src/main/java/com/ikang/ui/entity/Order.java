package com.ikang.ui.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author xuyang
 */
@Data
@Entity(name = "shop_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    private Integer uid;

    private String username;

    private Integer pid;

    private String pname;

    private BigDecimal price;

    private Integer number;

}
