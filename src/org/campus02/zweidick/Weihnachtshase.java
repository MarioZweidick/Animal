package org.campus02.zweidick;

public class Weihnachtshase extends Hase
{
    String name;

    public Weihnachtshase(String name)
    {
        super(name);
        this.name = name;
    }

    @Override
    public void verteilen()
    {
        System.out.println(name + " verteilt die Geschenke unter dem Weihnachtsbaum!");
    }
}
