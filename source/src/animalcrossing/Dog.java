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
public class Dog
{
    int numOfTreatsFed;
    private int actionsUntilLeave; //checks this against turn counter class

    public Dog(int turns)
    {
        setActionsUntilLeave(turns);
    }
    public int getActionsUntilLeave()
    {
        return actionsUntilLeave;
    }

    public void setActionsUntilLeave(int actionsUntilLeave)
    {
        this.actionsUntilLeave = actionsUntilLeave;
    }
    
    public void addActionsUntilLeave()
    {
        int treatBonus = 2;
        actionsUntilLeave = actionsUntilLeave + treatBonus;
    }
    
    public void decreaseActionsUntilLeave()
    {
        actionsUntilLeave = actionsUntilLeave-1;
    }
    public boolean shouldILeave()
    {
        return getActionsUntilLeave() <= 0;
    }

    public int getNumOfTreatsFed()
    {
        return numOfTreatsFed;
    }

    public void setNumOfTreatsFed(int numOfTreatsFed)
    {
        this.numOfTreatsFed = numOfTreatsFed;
    }
    
}
