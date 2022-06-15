package com.spring.boot.flyway.service;

import com.spring.boot.flyway.projection.GetAllMinus;
import com.spring.boot.flyway.projection.GetAllPlus;

import java.util.List;

public interface MathService {

    int plus(int firstInput, int secondInput);

    int minus(int firstInput, int secondInput);

    List<GetAllPlus> getAllPlus();

    List<GetAllMinus> getAllMinus();
}
