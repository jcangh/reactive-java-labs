package com.labs.tollservice.dao;

import com.labs.common.enums.VehicleType;
import com.labs.tollservice.entity.TollEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TollDao extends JpaRepository<TollEntity,Integer> {

    List<TollEntity> getByHighwayCodeAndVehicleType(String highwayCode, VehicleType vehicleType);
}

