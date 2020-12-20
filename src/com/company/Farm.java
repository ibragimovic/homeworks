package com.company;

public class Farm {
    String address;
    Cow[] cow;
    Sheep[] flockSheep;
    Horse[] herdHorse;
    String nameOfFarmOwner;

    public Farm() {}

    public Farm(String address, int numberOfCow, int numberOfSheep, int numberOfHorse, String nameOfFarmOwner) {
        this.address = address;
        this.cow = new Cow[numberOfCow];
        this.flockSheep = new Sheep[numberOfSheep];
        this.herdHorse = new Horse[numberOfHorse];
        this.nameOfFarmOwner = nameOfFarmOwner;
    }


    public void printInfo() {
        System.out.println("Farm: ");
        System.out.println("address: " + address);
        for (int i = 0; i < cow.length; i++) {
            if (cow[i] != null) {
                cow[i].printInfo();
            }
        }
        for (int i = 0; i < flockSheep.length; i++) {
            if (flockSheep[i] != null) {
                flockSheep[i].printInfo();
            }
        }
        for (int i = 0; i < herdHorse.length; i++) {
            if (herdHorse[i] != null) {
                herdHorse[i].printInfo();
            }
        }
        System.out.println("Name of the farm owner - " + nameOfFarmOwner);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCow() {
        return cow;
    }

    public boolean addCow(Cow herdCow){
        for (int i = 0; i < this.cow.length; i++){
            if (this.cow[i] != null){
                this.cow[i] = herdCow;
                return true;
            }
        }
        return false;
    }
    

    public Sheep[] getFlockSheep() {
        return flockSheep;
    }

    public boolean addSheep(Sheep flockSheep) {
        for (int i = 0; i < this.flockSheep.length; i++) {
            if (this.flockSheep[i] != null) {
                this.flockSheep[i] = flockSheep;
                return true;
            }
        }
        return  false;
    }
    
    public Horse[] getHerdHorse() {
        return herdHorse;
    }
    public boolean addHorse(Horse herdHorse){
        for (int i = 0; i < this.herdHorse.length; i++){
            if (this.herdHorse[i] != null){
                this.herdHorse[i] = herdHorse;
                return true;
            }
        }
        return false;
    }
    
    public String getNameOfFarmOwner() {
        return nameOfFarmOwner;
    }

    public void setNameOfFarmOwner(String nameOfFarmOwner) {
        this.nameOfFarmOwner = nameOfFarmOwner;
    }
}

