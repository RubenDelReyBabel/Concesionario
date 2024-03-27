package org.example.repositories.test;

import org.example.model.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRepositoryImpl implements TestRepository {

    private final List<Test> tests = new ArrayList<>();

    @Override
    public void save(Test test) {
        tests.add(test);
    }

    @Override
    public List<Test> findAll() {
        return tests;
    }
}
