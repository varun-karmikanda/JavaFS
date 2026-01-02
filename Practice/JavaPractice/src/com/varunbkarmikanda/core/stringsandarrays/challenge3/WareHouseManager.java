package com.varunbkarmikanda.core.stringsandarrays.challenge3;

public class WareHouseManager {

    public GridCoordinates locateProduct(int[][] grid, int target){

        if(grid == null || grid.length ==0){
            return null;
        }

        int gridRowLength = grid.length;

        for (int i = 0; i < gridRowLength; i++) {

            int gridColumnLength = grid[i].length;

            for (int j = 0; j < gridColumnLength; j++) {

                if(grid[i][j] == target) return new GridCoordinates(i, j);

            }
        }
        return null;
    }
}
