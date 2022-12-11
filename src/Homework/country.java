package Homework;

import org.w3c.dom.ls.LSOutput;

public class country {
    public String name;
    public String continent;
    public double size;
    public int Citizens;

    public country(String name, String continent, double size, int citizens) {
        this.name = name;
        this.continent = continent;
        this.size = size;
        Citizens = citizens;
    }
    public void printCoutntrySize()
    {
        System.out.println(String.format("%s Covers an area of %.2f Square Kilometers",
                name,size));
    }
    public void printSizePerCitizens()
    {
        System.out.println("Size per citizen "+(size/Citizens+"square m"));
    }


}
