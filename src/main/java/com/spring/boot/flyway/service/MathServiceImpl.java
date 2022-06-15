package com.spring.boot.flyway.service;

import com.spring.boot.flyway.entity.Math;
import com.spring.boot.flyway.projection.GetAllMinus;
import com.spring.boot.flyway.projection.GetAllPlus;
import com.spring.boot.flyway.repository.MathRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathServiceImpl implements MathService {

    private final MathRepository mathRepository;

    public MathServiceImpl(MathRepository mathRepository) {
        this.mathRepository = mathRepository;
    }

    @Override
    public int plus(int firstInput, int secondInput) {

        Math math = new Math();
        math.setFirstInput(firstInput);
        math.setSecondInput(secondInput);
        math.setPlus(firstInput + secondInput);
        math.setMinus(0);

        Math createdMath = mathRepository.save(math);

        return createdMath.getPlus();
    }

    @Override
    public int minus(int firstInput, int secondInput) {

        Math math = new Math();
        math.setFirstInput(firstInput);
        math.setSecondInput(secondInput);
        math.setPlus(0);
        math.setMinus(firstInput - secondInput);

        Math createdMath = mathRepository.save(math);

        return createdMath.getMinus();
    }

    @Override
    public List<GetAllPlus> getAllPlus() {

        return mathRepository.getAllPlus();
    }

    @Override
    public List<GetAllMinus> getAllMinus() {

        return mathRepository.findTop10ByMinusNotOrderByIdDesc(0);
    }
}
