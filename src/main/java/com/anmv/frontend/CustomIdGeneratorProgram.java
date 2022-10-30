package com.anmv.frontend;

import com.anmv.backend.CustomIdGeneratorRepository;
import com.anmv.entity.CustomId;

public class CustomIdGeneratorProgram {
    public static void main(String[] args) {
        CustomIdGeneratorRepository customIdGeneratorRepository = new CustomIdGeneratorRepository();

        CustomId customId = new CustomId();
        customId.setTitle("DataStage");
        customId.setType("SQL");

        customIdGeneratorRepository.createCustomId(customId);
    }
}
