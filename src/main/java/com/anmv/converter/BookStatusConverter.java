package com.anmv.converter;

import com.anmv.entity.StatusEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class BookStatusConverter implements AttributeConverter<StatusEnum, String> {

    @Override
    public String convertToDatabaseColumn(StatusEnum statusEnum) {
        if(statusEnum == null){
            return null;
        }
        return statusEnum.getStatus();
    }

    @Override
    public StatusEnum convertToEntityAttribute(String sqlStatus) {
        if(sqlStatus == null){
            return null;
        }
        return StatusEnum.toEnum(sqlStatus);
    }
}
