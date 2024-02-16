package com.yasar.entity;

import java.util.Scanner;

public class ClothingStore extends Store implements IStore {
    private int fittingRoomNumber;
    private int hangerNumber;

    public ClothingStore() {
    }

    public ClothingStore(String name, int floorNo, int fittingRoomNumber, int hangerNumber) {
        super(name, floorNo);
        this.fittingRoomNumber = fittingRoomNumber;
        this.hangerNumber = hangerNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ClothingStore{");
        sb.append("id=").append(getId()).append('\'');
        sb.append("name=").append(getName()).append('\'');
        sb.append("type=").append(getClass().getSimpleName()).append('\'');
        sb.append("fittingRoomNumber=").append(fittingRoomNumber);
        sb.append(", hangerNumber=").append(hangerNumber);
        sb.append('}');
        return sb.toString();
    }

    public int getFittingRoomNumber() {
        return fittingRoomNumber;
    }

    public void setFittingRoomNumber(int fittingRoomNumber) {
        this.fittingRoomNumber = fittingRoomNumber;
    }

    public int getHangerNumber() {
        return hangerNumber;
    }

    public void setHangerNumber(int hangerNumber) {
        this.hangerNumber = hangerNumber;
    }

    @Override
    public void importData() {
        System.out.print("Lütfen mağaza adını giriniz ....... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen kapı numarasını giriniz .... : ");
        int floorNo = new Scanner(System.in).nextInt();
        System.out.print("Lütfen deneme kabini sayısını giriniz ...... : ");
        int fittingRoomNumber = new Scanner(System.in).nextInt();
        System.out.print("Lütfen askı sayısını giriniz ...... : ");
        int hangerNumber = new Scanner(System.in).nextInt();

        Store store = new ClothingStore(name, floorNo, fittingRoomNumber, hangerNumber);
        Mall.storeList.add(store);
    }

    @Override
    public void shiftTime() {
        System.out.println(getClass().getSimpleName() + " için Shift Time --> 08:00 - 12:00 / 13:00 - 21:00");
    }


    @Override
    public void stockTracking() {
        System.out.println(getClass().getSimpleName() + " için stokları takip ediliyor.");
    }
}
