package com.yasar;



import com.yasar.entity.Mall;
import com.yasar.entity.MallManager;


public class Runner {
    public static void main(String[] args) {
        Mall mall = new Mall("Ankamall", "Ankara", 100);
        System.out.println(mall.toString());
        MallManager manager = new MallManager();
        manager.mainMenu();
    }
}
