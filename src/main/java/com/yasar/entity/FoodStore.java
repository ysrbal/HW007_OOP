package com.yasar.entity;

import java.util.Scanner;

public class FoodStore extends Store {
    private String menu;
    private int deskNumber;

    public FoodStore() {
    }

    public FoodStore(String name, int floorNo, int deskNumber, String menu) {
        super(name, floorNo);
        this.menu = menu;
        this.deskNumber = deskNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FoodStore{");
        sb.append("id=").append(getId()).append('\'');
        sb.append("name=").append(getName()).append('\'');
        sb.append("type=").append(getClass().getSimpleName()).append('\'');
        sb.append("floorNo=").append(getFloorNo()).append('\'');
        sb.append("menu='").append(menu).append('\'');
        sb.append(", deskNumber=").append(deskNumber);
        sb.append('}');
        return sb.toString();
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        this.deskNumber = deskNumber;
    }

    @Override
    public void importData() {
        System.out.print("Lütfen mağaza adını giriniz ....... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen kapı numarasını giriniz .... : ");
        int floorNo = new Scanner(System.in).nextInt();
        System.out.print("Lütfen menü içeriğini giriniz ..... : ");
        String menu = new Scanner(System.in).nextLine();
        System.out.print("Lütfen masa sayısını giriniz ...... : ");
        int deskNumber = new Scanner(System.in).nextInt();

        Store store = new FoodStore(name, floorNo, deskNumber, menu);
        Mall.storeList.add(store);
    }

    @Override
    public void shiftTime() {
        System.out.println(getClass().getSimpleName() + " için Shift Time --> 10:00 - 22:00");
    }


}
