package com.yasar.entity;

import java.util.UUID;

public abstract class Store {
    private String id;
    private String name;
    private String type;
    private int floorNo;

    public Store() {
        this.id = UUID.randomUUID().toString();
    }

    public Store(String name, int floorNo) {
        this();
        this.name = name;
        this.floorNo = floorNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public abstract void importData();

    public abstract void shiftTime();

    public void sellProduct() {
        System.out.println(getClass().getSimpleName() + "'a ürünler satıldı.");
    }

    public void buyProduct() {
        System.out.println(getClass().getSimpleName() + "'dan ürünler alındı.");
    }
}