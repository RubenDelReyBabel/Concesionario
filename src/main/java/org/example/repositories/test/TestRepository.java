package org.example.repositories.test;

import org.example.model.Test;

import java.util.List;

public interface TestRepository {

    void save(Test test);
    List<Test> findAll();
}
