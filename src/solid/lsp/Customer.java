package solid.lsp;

import solid.lsp.solution.*;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public static void main(String[] args){

        Automobile WagonR = new Car("HR23MN2300", "AKK762187677", "Wolkswagon", "Mahendra Singh");
        Automobile Pulsar250 = new Bike("KA01HJ4521", "237632KJ767677", "Bajaj", "Balbir Singh");
        Automobile Activa125 = new Scooter("GJ34UD8799", "HG713K0088989", "Honda", "Arifa Khanam");
        EVScooter OlaS1 = new EVScooter("EV12345", "YHAHJ", "Ola", "Satish Reddy");

        List<IAutomobile> autoList = new ArrayList<IAutomobile>();
        autoList.add(WagonR);
        autoList.add(Pulsar250);
        autoList.add(Activa125);
        autoList.add(OlaS1);

        for(IAutomobile a:autoList){
            a.start();
            a.shiftGear(1);
            a.accelerate();
            a.applyBrake("Back");
            a.blowHorn();
            a.stop();
        }

        OlaS1.chargeBattery();
    }
}
