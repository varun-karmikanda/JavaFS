package com.varunbkarmikanda.innerclasses.localinnerclass.test;

public class Hotel {
    private String name;

    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRooms(String guestName, int numOfRooms){

        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be empty!");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("Number of rooms cannot be negative!");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms!");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator reservationValidator = new ReservationValidator();
        if(reservationValidator.validate()){
            System.out.println("Reservation confirmed for "+guestName+" for "+numOfRooms+" rooms.");
        } else {
            System.out.println("Reservation failed!!");
        }
    }
}
