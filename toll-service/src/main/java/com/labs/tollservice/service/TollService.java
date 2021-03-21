package com.labs.tollservice.service;

import com.labs.common.dto.TollDto;
import com.labs.common.enums.VehicleType;
import com.labs.tollservice.dao.TollDao;
import com.labs.tollservice.mapper.TollMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class TollService {

    private final TollMapper mapper;
    private final TollDao dao;

    @Transactional(readOnly = true)
    public List<TollDto> getTollsByHighwayAndVehicle(String highwayCode, VehicleType vehicleType){
        return mapper.toTolls(dao.getByHighwayCodeAndVehicleType(highwayCode,vehicleType));
    }
}

