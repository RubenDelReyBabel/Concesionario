package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Purchase extends BaseEntity implements Article {

    private Car car;
    private Client client;
    private Seller seller;
    private double price;
    private String date;
    private String name;
}
