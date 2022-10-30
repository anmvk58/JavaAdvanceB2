package com.anmv.entity;

import java.io.Serializable;

import com.anmv.backend.CustomIdGeneratorRepository;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdCodeGenerator implements IdentifierGenerator {
    private CustomIdGeneratorRepository repository;

    public CustomIdCodeGenerator() {
        repository = new CustomIdGeneratorRepository();
    }

    public Serializable generate(SharedSessionContractImplementor session, Object object)
            throws HibernateException {
        CustomId customId = (CustomId) object;

        String type = customId.getType();
        int count = repository.getCountByType(type);

        return type.charAt(0) + "-" + (count + 1);
    }

}
