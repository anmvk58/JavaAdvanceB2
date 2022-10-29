package com.anmv.entity;

public enum StatusEnum {
    OPEN("O"), REVIEW("REV"), APPROVED("A"), REJECT("REJ");

    private String status;

    private StatusEnum(String status) {
        this.status = status;
    }

    //getter => get SQL value:
    public String getStatus(){
        return status;
    }

    //get Java Enum from SQL
    public static StatusEnum toEnum(String sqlValue){
        for(StatusEnum statusEnum : StatusEnum.values()){
            if(statusEnum.getStatus().equals(sqlValue)){
                return statusEnum;
            }
        }
        return null;
    }
}
