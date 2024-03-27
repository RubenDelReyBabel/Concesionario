package org.example.model;

import lombok.Data;

import java.util.UUID;

@Data
public class BaseEntity {

    private String id = UUID.randomUUID().toString();
}
