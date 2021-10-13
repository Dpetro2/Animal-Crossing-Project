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
public class WaspManager
{
    Random rd = new Random();
    boolean[] isWasps = new boolean[4];
    int numOfWasps = 1;
    
    
    public void randomizeArray()
    {
        for (int i = 0; i < isWasps.length; i++)
        {
            isWasps[i] = false;
        }
        for(int i = 0; i < numOfWasps; i ++)
        {
        int waspPos = rd.nextInt(isWasps.length);
        isWasps[waspPos] = true;
        }
    }

    public boolean amIWasp(int index)
    {
        return isWasps[index];
    }
    public void setNumOfWasps(int num)
    {
        numOfWasps = num;
    }
}
