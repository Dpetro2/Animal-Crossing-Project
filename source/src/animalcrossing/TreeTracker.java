/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcrossing;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author jauga
 */
public class TreeTracker
{

    ArrayList<Tree> forest = new ArrayList<>();
    final private int MAX_NUM_OF_WASP_TREES = 5;
    final private int MAX_NUM_OF_FRUIT_TREES = 3;
    final private int MAX_NUM_OF_TREAT_TREES = 5;
    private Random rd = new Random();

    
    public TreeTracker()
    {
        assignTreeProperties(10);
    }
    
    private void assignTreeProperties(int numOfTrees) //major method, assigns each trees hasWasp, hasFruit, hasTreat, and fruit value up to a set maximum
    {
        int numOfWasps = 0;
        int numOfFruits = 0;
        int numOfTreats = 0;
        for (int i = 0; i < numOfTrees; i++)
        {
            forest.add(new Tree());
        }
        boolean[] waspTrees = new boolean[forest.size()];
        while(numOfWasps <= MAX_NUM_OF_WASP_TREES)
        {
            int rand = rd.nextInt(waspTrees.length);
            if (waspTrees[rand] == false && forest.get(rand).doesHasWasps() == false)
            {
                waspTrees[rand] = true;
                forest.get(rand).setHasWasps(true);
                numOfWasps++;
            }
        }
        boolean[] fruitTrees = new boolean[forest.size()];
        while (numOfFruits < MAX_NUM_OF_FRUIT_TREES)
        {
            int rand = rd.nextInt(fruitTrees.length);
            if (fruitTrees[rand] == false && forest.get(rand).doesHasFruit() == false)
            {
                fruitTrees[rand] = true;
                forest.get(rand).setHasFruit(true);
                forest.get(rand).setFruit(Fruit.values()[rd.nextInt(Fruit.values().length)]);
                numOfFruits++;
            }
        }
        boolean[] treatTrees = new boolean[forest.size()];
        while (numOfTreats < MAX_NUM_OF_TREAT_TREES)
        {
            int rand = rd.nextInt(treatTrees.length);
            if (treatTrees[rand] == false && forest.get(rand).doesHasTreat() == false)
            {
                treatTrees[rand] = true;
                forest.get(rand).setHasTreat(true);
                numOfTreats++;
            }
        }
    }
}
