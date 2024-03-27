package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Test extends BaseEntity implements Article {

    private Client client;
    private Car car;
    private Date date;
    private double price;
    private String name;
}
