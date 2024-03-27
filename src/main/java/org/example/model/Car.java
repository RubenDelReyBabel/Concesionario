package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Car extends BaseEntity {

    private String make;
    private String model;
    private int year;
    private double price;
    private List<Piece> pieces;
}
