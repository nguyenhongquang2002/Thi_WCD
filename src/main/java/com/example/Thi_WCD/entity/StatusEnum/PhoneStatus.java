package com.example.Thi_WCD.entity.StatusEnum;

public enum PhoneStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1),
    UNDEFINE(2);

    private int value;

    PhoneStatus(int value){this.value = value;}

    public int getValue() {
        return value;
    }

    public static PhoneStatus of (int value){
        for (PhoneStatus productEN : PhoneStatus.values()){
            if(productEN.getValue() == value){
                return productEN;
            }
        }
        return PhoneStatus.UNDEFINE;
    }
}
