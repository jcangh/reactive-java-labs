package com.labs.tollservice.mapper;

import com.labs.common.dto.TollDto;
import com.labs.tollservice.entity.TollEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TollMapper {

    TollEntity toToll(TollDto tollDto);

    TollDto toTollDto(TollEntity toll);

    @IterableMapping(qualifiedByName = "toTolls")
    abstract List<TollDto> toTolls(Iterable<TollEntity> tollEntities);
}

