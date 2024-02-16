package com.yasar.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Mall {
    private String id;
    private String name;
    private String address;
    private int storeCapacity;
    public static List<Store> storeList = new ArrayList<>();

    private Mall() {
        this.id = UUID.randomUUID().toString();
    }

    public Mall(String name, String address, int storeCapacity) {
        this();
        this.name = name;
        this.address = address;
        this.storeCapacity = storeCapacity;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mall{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", storeCapacity=").append(storeCapacity);
        sb.append('}');
        return sb.toString();
    }

    public static List<Store> getStoreList() {
        return storeList;
    }

    public static void setStoreList(List<Store> storeList) {
        Mall.storeList = storeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }
}
