package org.example.repositories.repair;

import org.example.model.Repair;

import java.util.List;

public interface RepairRepository {

    void save(Repair repair);
    List<Repair> findAll();
}
