package org.example.repositories.seller;

import org.example.model.Seller;

import java.util.ArrayList;
import java.util.List;

public class SellerRepositoryImpl implements SellerRepository {

    private List<Seller> sellers = new ArrayList<>();

    @Override
    public void save(Seller seller) {
        sellers.add(seller);
    }

    @Override
    public void update(Seller seller) {
        for (Seller s : sellers) {
            if (s.getId() == seller.getId()) {
                s.setNif(seller.getNif());
                s.setName(seller.getName());
                s.setSurname(seller.getSurname());
                s.setPurchases(seller.getPurchases());
            }
        }
    }

    @Override
    public List<Seller> findAll() {
        return sellers;
    }
}
