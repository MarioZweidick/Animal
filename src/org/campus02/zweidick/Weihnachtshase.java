package org.campus02.zweidick;

public class Weihnachtshase extends Hase
{
    private int countGifts;

    public Weihnachtshase(String name, int countGifts)
    {
        super(name);
    }

    public Weihnachtshase(String name)
    {
        super(name);
        this.countGifts = 1;
    }

    @Override
    public void verteilen()
    {
        System.out.println( name + " legt die Geschenke unter dem Weihnachtsbaum!");
    }
}
