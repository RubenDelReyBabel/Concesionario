package org.example.services.purchase;

import org.example.model.Car;
import org.example.model.Client;
import org.example.model.Purchase;
import org.example.model.Seller;

import java.util.List;

public interface PurchaseService {

    Purchase purchase(Client client, Car car, Seller seller, String date, double price);
    List<Purchase> getPurchases();
}
