package org.example.services.test;

import org.example.model.Car;
import org.example.model.Client;
import org.example.model.Test;
import org.example.repositories.test.TestRepository;

import java.util.Date;
import java.util.List;

public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test requestTest(Client client, Car car, Date date, double price) {
        Test test = new Test();
        test.setClient(client);
        test.setCar(car);
        test.setDate(date);
        test.setPrice(price);
        test.setName(client.getName() + "-" + car.getModel() + "-" + date);
        testRepository.save(test);
        return test;
    }

    @Override
    public List<Test> getTests() {
        return testRepository.findAll();
    }
}
