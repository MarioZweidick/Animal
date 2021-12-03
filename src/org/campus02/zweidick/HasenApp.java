package org.campus02.zweidick;

public class HasenApp
{
    public static void main(String[] args)
    {
        Hase hase = new Hase("Gerhard");
        Osterhase oHase = new Osterhase("Rudolf");
        Weihnachtshase wHase = new Weihnachtshase("Renate");

        System.out.println("NORMALER HASE");
        //Normal rabbit
        hase.fressen();
        hase.schlafen();
        hase.hoppeln();
        hase.verteilen();

        System.out.println("WEIHNACHTSHASE");
        //christmas rabbit
        wHase.fressen();
        wHase.schlafen();
        wHase.hoppeln();
        wHase.verteilen();

        System.out.println("OSTERHASE");
        //easter rabbit
        oHase.fressen();
        oHase.schlafen();
        oHase.hoppeln();
        oHase.verteilen();

    }

}
