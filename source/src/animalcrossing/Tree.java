/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcrossing;
import java.util.Random;
/**
 *
 * @author jauga
 */
public class Tree
{
    private boolean hasFruit;
    private boolean hasWasps;
    private boolean hasTreat;
    private Fruit fruit;
    
    public Tree()
    {
        
    }

    public Fruit getFruit()
    {
        return fruit;
    }

    public void setFruit(Fruit fruit)
    {
        this.fruit = fruit;
    }

    public boolean doesHasFruit()
    {
        return hasFruit;
    }

    public void setHasFruit(boolean hasFruit)
    {
        this.hasFruit = hasFruit;
    }

    public boolean doesHasWasps()
    {
        return hasWasps;
    }

    public void setHasWasps(boolean hasWasps)
    {
        this.hasWasps = hasWasps;
    }

    public boolean doesHasTreat()
    {
        return hasTreat;
    }

    public void setHasTreat(boolean hasTreat)
    {
        this.hasTreat = hasTreat;
    }
    
}
