package com.varunbkarmikanda.core.stringsandarrays.challenge3;

public class Test {
    public static void main(String[] args) {

        int grid[][] = { {101, 102, 103},
                {201, 202, 203},
                {301, 302, 303}
        };

//        int grid[][] = {};

        int target = 202;

        WareHouseManager wareHouseManager = new WareHouseManager();
        GridCoordinates gridCoordinates = wareHouseManager.locateProduct(grid, target);
        System.out.println(gridCoordinates);

    }
}
