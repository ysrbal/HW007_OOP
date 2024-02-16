package com.yasar.entity;

import java.util.Scanner;

public class ElectronicStore extends Store implements IStore {
    public int technicalServiceNumber;
    public boolean isProductAssembly;

    public ElectronicStore() {
    }

    public ElectronicStore(String name, int floorNo, int technicalServiceNumber, boolean isProductAssembly) {
        super(name, floorNo);
        this.technicalServiceNumber = technicalServiceNumber;
        this.isProductAssembly = isProductAssembly;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ElectronicStore{");
        sb.append("id=").append(getId()).append('\'');
        sb.append("name=").append(getName()).append('\'');
        sb.append("type=").append(getClass().getSimpleName()).append('\'');
        sb.append("floorNo=").append(getFloorNo()).append('\'');
        sb.append("technicalServiceNumber=").append(technicalServiceNumber).append('\'');
        sb.append(", isProductAssembly=").append(isProductAssembly).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getTechnicalServiceNumber() {
        return technicalServiceNumber;
    }

    public void setTechnicalServiceNumber(int technicalServiceNumber) {
        this.technicalServiceNumber = technicalServiceNumber;
    }

    public boolean isProductAssembly() {
        return isProductAssembly;
    }

    public void setProductAssembly(boolean productAssembly) {
        isProductAssembly = productAssembly;
    }

    @Override
    public void importData() {
        System.out.print("Lütfen mağaza adını giriniz ....... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen kapı numarasını giriniz .... : ");
        int floorNo = new Scanner(System.in).nextInt();
        System.out.print("Lütfen teknik servis sayısını giriniz .... : ");
        int technicalServiceNumber = new Scanner(System.in).nextInt();
        System.out.print("Ürün montajı yapıyor musunuz ? .... : ");
        String isProductAssembly = new Scanner(System.in).nextLine();
        if (isProductAssembly.equalsIgnoreCase("evet")) {
            this.isProductAssembly = true;
        } else if (isProductAssembly.equalsIgnoreCase("hayır")) {
            this.isProductAssembly = false;
        } else {
            System.out.println("Hatalı giriş yapıldı.");
        }

        Store store = new ElectronicStore(name, floorNo, technicalServiceNumber, this.isProductAssembly);
        Mall.storeList.add(store);
    }

    @Override
    public void shiftTime() {
        System.out.println(getClass().getSimpleName() + " için Shift Time --> 8:30 - 12:30 / 13:30 -  18:00");
    }


    @Override
    public void stockTracking() {
        System.out.println(getClass().getSimpleName() + " stoklar takip ediliyor.");
    }
}
