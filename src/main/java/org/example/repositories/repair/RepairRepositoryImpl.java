package org.example.repositories.repair;

import org.example.model.Repair;

import java.util.ArrayList;
import java.util.List;

public class RepairRepositoryImpl implements RepairRepository {

    private final List<Repair> repairs = new ArrayList<>();

    @Override
    public void save(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public List<Repair> findAll() {
        return repairs;
    }
}
