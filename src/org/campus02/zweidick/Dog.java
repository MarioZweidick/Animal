package org.campus02.zweidick;

public class Dog
{
    public String eyeColor;
    public int weight;

    public void doSomething() {
        System.out.println("This is a dog!");
    }

    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void bark()
    {
        System.out.println("This dog sounds like: wuff wuff");
    }
}
