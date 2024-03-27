package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Repairman extends BaseEntity {

    private String nif;
    private String name;
    private String surname;

    private List<Repair> repairs;
}
