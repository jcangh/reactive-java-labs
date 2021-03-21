package com.labs.tollservice.entity;


import com.labs.common.enums.VehicleType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "toll")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TollEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String highwayCode;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private String name;
    private Long price;


}