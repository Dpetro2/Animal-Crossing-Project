/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcrossing;

/**
 *
 * @author jauga
 */
public class Player
{

    private int currentHealth;
    private int maxHealth;
    private int numOfCherry;
    private int numOfPears;
    private int numOfApples;
    private int numOfPeaches;
    private int numOfTreats;
    private int numOfNests;

    public Player(int maxHP)
    {
        maxHealth = maxHP;
        currentHealth = maxHP;
    }

    public void shakeTree()
    {

    }

    public void takeMedicine()
    {
        currentHealth = currentHealth + 1;
    }

    public void checkHealth()
    {
        if (currentHealth == 0)
        {
            System.out.println("You've been stung too many times, and have faited.\n"
                    + "Game Over.");
            System.exit(0);
        }
    }

    public void eatFruit(Fruit fruit)
    {
        switch (fruit)
        {
            case Pear:
                setNumOfPears(getNumOfPears() - 1);
                break;
            case Cherry:
                setNumOfCherry(getNumOfCherry() - 1);
                break;
            case Apple:
                setNumOfApples(getNumOfApples() - 1);
                break;
            case Peach:
                setNumOfPeaches(getNumOfPeaches() - 1);
                break;
        }
    }

    public void addFruit(Fruit fruit) //major method adds fruit to player inventory depending on which Fruit is passed in
    {
        int fruitPerTree = 3;
        if (fruit == Fruit.Pear)
        {
            setNumOfPears(getNumOfPears() + fruitPerTree);
        }
        if (fruit == Fruit.Cherry)
        {
            setNumOfCherry(getNumOfCherry() + fruitPerTree);
        }
        if (fruit == Fruit.Apple)
        {
            setNumOfApples(getNumOfApples() + fruitPerTree);
        }
        if (fruit == Fruit.Peach)
        {
            setNumOfPeaches(getNumOfPeaches() + fruitPerTree);
        }
    }

    public void addTreat()
    {
        int treatsPerTree = 1;
        setNumOfTreats(getNumOfTreats() + treatsPerTree);
    }
    public void giveTreatToDog()
    {
        setNumOfTreats(getNumOfTreats()-1);
    }

    //getters and setters
    public int getNumOfTreats()
    {
        return numOfTreats;
    }

    public void setNumOfTreats(int numOfTreats)
    {
        this.numOfTreats = numOfTreats;
    }

    public int getCurrentHealth()
    {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth)
    {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public int getNumOfCherry()
    {
        return numOfCherry;
    }

    public void setNumOfCherry(int numOfCherry)
    {
        this.numOfCherry = numOfCherry;
    }

    public int getNumOfPears()
    {
        return numOfPears;
    }

    public void setNumOfPears(int numOfPears)
    {
        this.numOfPears = numOfPears;
    }

    public int getNumOfApples()
    {
        return numOfApples;
    }

    public void setNumOfApples(int numOfApples)
    {
        this.numOfApples = numOfApples;
    }

    public int getNumOfPeaches()
    {
        return numOfPeaches;
    }

    public void setNumOfPeaches(int numOfPeaches)
    {
        this.numOfPeaches = numOfPeaches;
    }

    public int getNumOfNests()
    {
        return numOfNests;
    }

    public void setNumOfNests(int numOfNests)
    {
        this.numOfNests = numOfNests;
    }

}
