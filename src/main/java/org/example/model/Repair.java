package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Repair extends BaseEntity implements Article {

    private Car car;
    private Piece piece;
    private double price;
    private String name;
    private Date date;
}
