package org.example.repositories.repairman;

import org.example.model.Repairman;

import java.util.List;

public interface RepairmanRepository {

    void save(Repairman repairman);
    void update(Repairman repairman);
    List<Repairman> findAll();
}
