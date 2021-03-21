package com.labs.tollservice.rest;

import com.labs.common.dto.TollDto;
import com.labs.common.enums.VehicleType;
import com.labs.tollservice.service.TollService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/v1/tolls")
public class TollController {

    private final TollService service;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<TollDto>> getTollsByHighwayAndVehicleType(@RequestParam(value = "highway-code")String highwayCode,
                                                                         @RequestParam(value = "vehicle-type") VehicleType vehicleType){
        log.info("::TollController highwayCode: {} vehicleType: {}",highwayCode,vehicleType);
        return ResponseEntity.ok(service.getTollsByHighwayAndVehicle(highwayCode,vehicleType));
    }
}
