package com.hrproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IMailMapper {

    IMailMapper INSTANCE = Mappers.getMapper(IMailMapper.class);
}
