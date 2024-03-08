package solid.srp;

import solid.srp.problem.Automobile;

public class ProblemUser {

    public static void main(String[] args){
        Automobile scooty = new Automobile("KA01HK2700", "NAk17672182JHA90", "Honda", "Gyanesh");
        scooty.startEngine();
        scooty.shiftGear(1);//not valid if the sccoty is without gear
        scooty.stopEngine();
    }
}
