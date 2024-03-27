package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Invoice extends BaseEntity {

    private Client client;
    private Map<Article, Integer> articles = new HashMap<>();
    private Date date;

}
