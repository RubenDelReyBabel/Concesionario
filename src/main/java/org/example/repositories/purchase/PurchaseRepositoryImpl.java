package org.example.repositories.purchase;

import org.example.model.Purchase;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRepositoryImpl implements PurchaseRepository {

    private final List<Purchase> purchases = new ArrayList<>();

    @Override
    public void save(Purchase purchase) {
        purchases.add(purchase);
    }

    @Override
    public List<Purchase> findAll() {
        return purchases;
    }
}
