package org.example.repositories.seller;

import org.example.model.Seller;

import java.util.List;

public interface SellerRepository {

    void save(Seller seller);
    void update(Seller seller);
    List<Seller> findAll();
}
