package org.example.services.test;

import org.example.model.Car;
import org.example.model.Client;
import org.example.model.Test;

import java.util.Date;
import java.util.List;

public interface TestService {

    Test requestTest(Client client, Car car, Date date, double price);
    List<Test> getTests();
}
