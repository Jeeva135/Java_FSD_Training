package com.stackroute.oops;

public class Car extends AbstractManufacturer implements Vehicle {
    public Car(String name, String modelName, String carType) {
        this.setName(name);
        this.setType(carType);
        this.setModelName(modelName);
    }

    /*
    Method returns maximum speed depending upon their types
    For sports-250kmh
    For sedan-190kmh
     */
    @Override
    public int maxSpeed(String carType) {
        if ("Sports".equalsIgnoreCase(this.getType()))
        {
            return 250;
        }else {
            return 190;
        }

    }

    /*
    should return in the format : Car{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
        return "Car{Manufacturer name:"+this.getName()+",Model Name:"+getModelName()+",Type:"+getType()+"}";
    }
}
