package com.ikang.ui.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author xuyang
 */
@Data
@Entity(name = "shop_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    private String pname;

    private BigDecimal price;

    private Integer stock;

}
