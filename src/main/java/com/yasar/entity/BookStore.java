package com.yasar.entity;

import java.util.Scanner;

public class BookStore extends Store implements IStore {
    private int shelfNumber;

    public BookStore() {
    }

    public BookStore(String name, int floorNo, int shelfNumber) {
        super(name, floorNo);
        this.shelfNumber = shelfNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BookStore{");
        sb.append("id=").append(getId()).append('\'');
        sb.append("name=").append(getName()).append('\'');
        sb.append("type=").append(getClass().getSimpleName()).append('\'');
        sb.append("floorNo=").append(getFloorNo()).append('\'');
        sb.append("shelfNumber=").append(shelfNumber);
        sb.append('}');
        return sb.toString();
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    @Override
    public void importData() {
        System.out.print("Lütfen mağaza adını giriniz ....... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen kapı numarasını giriniz .... : ");
        int floorNo = new Scanner(System.in).nextInt();
        System.out.print("Lütfen raf sayısını giriniz ....... : ");
        int shelfNumber = new Scanner(System.in).nextInt();

        Store store = new BookStore(name, floorNo, shelfNumber);
        Mall.storeList.add(store);
    }

    @Override
    public void shiftTime() {
        System.out.println(getClass().getSimpleName() + " için Shift Time --> 09:00 - 12:00 / 13:00 - 20:00");
    }


    @Override
    public void stockTracking() {
        System.out.println(getClass().getSimpleName() + " için stoklar takip ediliyor.");
    }
}
