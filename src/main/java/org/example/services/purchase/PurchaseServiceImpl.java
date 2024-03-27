package org.example.services.purchase;

import org.example.model.Car;
import org.example.model.Client;
import org.example.model.Purchase;
import org.example.model.Seller;
import org.example.repositories.purchase.PurchaseRepository;

import java.util.List;

public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase purchase(Client client, Car car, Seller seller, String date, double price) {
        Purchase purchase = new Purchase();
        purchase.setClient(client);
        purchase.setCar(car);
        purchase.setSeller(seller);
        purchase.setDate(date);
        purchase.setPrice(price);
        purchase.setName(client.getName() + "-" + car.getModel() + "-" + seller.getName() + "-" + date);
        purchaseRepository.save(purchase);
        return purchase;
    }

    @Override
    public List<Purchase> getPurchases() {
        return purchaseRepository.findAll();
    }
}
