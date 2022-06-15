package com.spring.boot.flyway.repository;

import com.spring.boot.flyway.entity.Math;
import com.spring.boot.flyway.projection.GetAllMinus;
import com.spring.boot.flyway.projection.GetAllPlus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MathRepository extends CrudRepository<Math, Long> {

    @Query(value = "SELECT fnPlus(:firstInput, :secondInput);", nativeQuery = true)
    int plus(Long firstInput, Long secondInput);

    @Query(value = "CALL spGetAllPlus();", nativeQuery = true)
    List<GetAllPlus> getAllPlus();

    List<GetAllMinus> findTop10ByMinusNotOrderByIdDesc(int minus);
}
