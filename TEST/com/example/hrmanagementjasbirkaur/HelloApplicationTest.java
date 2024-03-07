package com.example.hrmanagementjasbirkaur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void mysalary() {
        HelloApplication X= new HelloApplication();
        assertEquals(X.mysalary(3000), 36000);
    }
}