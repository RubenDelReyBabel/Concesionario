package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Piece extends BaseEntity {

    private String name;
    private double price;
    private Car car;
}
