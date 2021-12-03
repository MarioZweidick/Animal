package org.campus02.zweidick;

public class Beagle extends Dog
{
    public String lovedFood;

    @Override
    public void doSomething()
    {
        System.out.println("This is a beagle!");
    }

    @Override
    public String toString()
    {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void bark()
    {
        System.out.println("This beagle sounds like: wau wau");

        //with super, the method of the basic-class can be called
        super.bark();
    }
}
