package com.labs.common.dto;

import com.labs.common.enums.VehicleType;
import lombok.Data;

@Data
public class TollDto {

    private String highwayCode;
    private VehicleType vehicleType;
    private String name;
    private Long price;
}
