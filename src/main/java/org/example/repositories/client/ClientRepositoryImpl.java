package org.example.repositories.client;

import org.example.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void save(Client client) {
        clients.add(client);
    }

    @Override
    public void update(Client client) {
        for (Client c : clients) {
            if (c.getId() == client.getId()) {
                c.setNif(client.getNif());
                c.setName(client.getName());
                c.setSurname(client.getSurname());
                c.setPurchases(client.getPurchases());
                c.setTests(client.getTests());
                c.setRepairs(client.getRepairs());
            }
        }
    }

    @Override
    public List<Client> findAll() {
        return clients;
    }
}
