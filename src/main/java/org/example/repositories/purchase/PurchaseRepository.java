package org.example.repositories.purchase;

import org.example.model.Purchase;

import java.util.List;

public interface PurchaseRepository {

    void save(Purchase purchase);
    List<Purchase> findAll();
}
