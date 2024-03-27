package org.example.services.repair;

import org.example.model.Car;
import org.example.model.Piece;
import org.example.model.Repair;
import org.example.model.Repairman;

import java.util.Date;
import java.util.List;

public interface RepairService {

    Repair repair(Car car, Piece piece, Repairman repairman, double price, Date date);
    List<Repair> getRepairs();
}
