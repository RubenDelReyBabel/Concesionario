package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Client extends BaseEntity {

    private String nif;
    private String name;
    private String surname;

    private List<Purchase> purchases;
    private List<Test> tests;
    private List<Repair> repairs;
}
