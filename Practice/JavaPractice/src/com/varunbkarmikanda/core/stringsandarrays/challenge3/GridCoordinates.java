package com.varunbkarmikanda.core.stringsandarrays.challenge3;

public class GridCoordinates {

    private int row;
    private int column;

    public GridCoordinates(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "GridCoordinates{" +
                "\n\trow=" + row + "," +
                "\n\tcolumn=" + column + "," +
                "\n}";
    }
}
