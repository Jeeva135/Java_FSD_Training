package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements Vehicle {
    public Bike(String name, String modelName, String bikeType) {
        this.setName(name);
        this.setType(bikeType);
        this.setModelName(modelName);
    }

    /*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(String bikeType) {
        if ("Sports".equalsIgnoreCase(this.getType())){
            return 300;
        }else {
            return 170;
        }
    }

    /*
    should return in the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer name:"+this.getName()+",Model Name:"+getModelName()+",Type:"+getType()+"}";
    }
}
