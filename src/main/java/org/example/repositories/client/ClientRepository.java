package org.example.repositories.client;

import org.example.model.Client;

import java.util.List;

public interface ClientRepository {

    void save(Client client);
    void update(Client client);
    List<Client> findAll();
}
