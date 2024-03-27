package org.example.services.repair;

import org.example.model.Car;
import org.example.model.Piece;
import org.example.model.Repair;
import org.example.model.Repairman;
import org.example.repositories.repair.RepairRepository;

import java.util.Date;
import java.util.List;

public class RepairServiceImpl implements RepairService {

    private final RepairRepository repairRepository;

    public RepairServiceImpl(RepairRepository repairRepository) {
        this.repairRepository = repairRepository;
    }
    @Override
    public Repair repair(Car car, Piece piece, Repairman repairman, double price, Date date) {
        Repair repair = new Repair();
        repair.setCar(car);
        repair.setPiece(piece);
        repair.setPrice(price);
        repair.setDate(date);
        repair.setName(car.getModel() + "-" + piece.getName() + "-" + repair.getName() + "-" + date);
        return null;
    }

    @Override
    public List<Repair> getRepairs() {
        return repairRepository.findAll();
    }
}
