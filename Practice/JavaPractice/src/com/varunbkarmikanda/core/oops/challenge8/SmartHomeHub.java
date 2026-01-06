package com.varunbkarmikanda.core.oops.challenge8;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {

    private List<Operatable> devices = new ArrayList<>();

    public void addDevices(Operatable d){
        devices.add(d);
        System.out.println("Device added!");
    }

    public void sutDownAll(){
        for (Operatable d: devices){
            if(d instanceof Television tv){
                tv.changeChannel(101);
            }
            d.turnOff();
        }


    }


}
