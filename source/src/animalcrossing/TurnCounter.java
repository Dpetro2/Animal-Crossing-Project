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
public class TurnCounter
{
    private static Dog sam;
    static int turnCounter = 5;
    public TurnCounter(Dog dog)
    {
        sam = dog;
        turnCounter = 0;
    }
    public static void incrementTurnCounter()
    {
        turnCounter = turnCounter + 5;
    }
    public static void incrementTurnCounter(int turns)
    {
        turnCounter = turnCounter + turns;
    }
    public static void useTurn()
    {
        turnCounter--;
    }

    public static int getTurnCounter()
    {
        return turnCounter;
    }
    
}
