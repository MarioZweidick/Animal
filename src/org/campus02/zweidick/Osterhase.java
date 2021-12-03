package org.campus02.zweidick;

public class Osterhase extends Hase
{
    String name;

    public Osterhase(String name)
    {
        super(name);
        this.name = name;
    }

    @Override
    public void verteilen()
    {
        System.out.println(name + " versteckt Geschenke und Ostereier!");
    }
}
