package com.ecommerce.shop.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_feedback")
public class Feedback {
    @Id
    private Long id;
    private String comment;
    private String rating;

}
