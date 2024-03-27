package org.example.repositories.repairman;

import org.example.model.Repairman;

import java.util.ArrayList;
import java.util.List;

public class RepairmanRepositoryImpl implements RepairmanRepository {

    private List<Repairman> repairmen = new ArrayList<>();

    @Override
    public void save(Repairman repairman) {
        repairmen.add(repairman);
    }

    @Override
    public void update(Repairman repairman) {
        for (Repairman r : repairmen) {
            if (r.getId() == repairman.getId()) {
                r.setNif(repairman.getNif());
                r.setName(repairman.getName());
                r.setSurname(repairman.getSurname());
                r.setRepairs(repairman.getRepairs());
            }
        }
    }

    @Override
    public List<Repairman> findAll() {
        return repairmen;
    }
}
