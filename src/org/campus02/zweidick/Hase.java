package org.campus02.zweidick;

public class Hase
{
    protected String name;

    public Hase(String name)
    {
        this.name = name;
    }

    public void hoppeln()
    {
        System.out.println(name + " hoppelt!");
    }

    public void schlafen()
    {
        System.out.println(name + " schläft!");
    }

    public void fressen()
    {
        System.out.println(name + " frisst!");
    }

    public void verteilen()
    {
        System.out.println(name + " ist ein normaler Hase und verteilt nix!");
    }

}
