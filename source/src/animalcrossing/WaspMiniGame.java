/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcrossing;

import java.lang.Math;
import java.util.Timer;

/**
 *
 * @author jauga
 */
public class WaspMiniGame extends javax.swing.JFrame
{

    WaspManager manager = new WaspManager();
    int numOfRounds = 3;
    int currentRound = 0;
    Player player;
    Timer clock = new Timer();
    long time1;
    long time2;
    int healthLoss = 1;
    long timeThreshHold = 800;//in milliseconds

    /**
     * Creates new form WaspMiniGame
     *
     * @param fruit
     * @param person
     */
    public WaspMiniGame(Fruit fruit, Player person)
    {
        checkFruit(fruit);
        initComponents();
        player = person;
    }

    /**
     *
     * @param person
     */
    public WaspMiniGame(Player person)
    {
        initComponents();
        player = person;
    }

    public void roundReset()
    {
        manager.randomizeArray();
        setPositionsIcons();
        getTime1();
    }

    public void gameOver()
    {
        setVisible(false);
    }

    public void lose()
    {
        player.setCurrentHealth(player.getCurrentHealth() - healthLoss);
        player.checkHealth();
        gameOver();
        System.out.println("The wasps stung you and you've lost health");
    }

    public void win()
    {
        System.out.println("You caught the wasps");
    }

    public int getCurrentRound()
    {
        return currentRound;
    }

    public void setCurrentRound(int currentRound)
    {
        this.currentRound = currentRound;
    }

    public void checkIfWasp(int index)
    {
        if (manager.amIWasp(index))
        {
            getTime2();
            if (compareTimes() < timeThreshHold)
            {
                roundReset();
                setCurrentRound(getCurrentRound() + 1);
                checkRoundLimit();
            } else
            {
                System.out.println("You were too slow to catch the wasps");
                lose();
            }
        }
        if (manager.amIWasp(index) == false)
        {
            System.out.println("You missed the wasp");
            lose();
        }
    }

    public void checkRoundLimit()
    {
        if (currentRound >= numOfRounds)
        {
            win();
            gameOver();
        }
    }

    public void checkFruit(Fruit fruit)
    {
        if (fruit == Fruit.Pear)
        {
            timeThreshHold = 3000;
        }
        if (fruit == Fruit.Cherry)
        {
            healthLoss = 0;
        }
        if (fruit == Fruit.Apple)
        {
            numOfRounds = 2;
        }
        if (fruit == Fruit.Peach)
        {
            manager.setNumOfWasps(2);
        }
    }

    public void getTime1()
    {
        time1 = java.lang.System.currentTimeMillis();
    }

    public void getTime2()
    {
        time2 = java.lang.System.currentTimeMillis();
    }

    public long compareTimes()
    {
        System.out.println("Your time was: " + (time2 - time1) + " The time required is " + timeThreshHold);
        return (time2 - time1);
    }

    public void setPositionsIcons()
    {
        if (manager.amIWasp(0) == false)
        {
            pos1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/miss.png")));
        } else if (manager.amIWasp(0) == true)
        {
            pos1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/wasps.png")));
        }

        if (manager.amIWasp(1) == false)
        {
            pos2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/miss.png")));
        } else if (manager.amIWasp(1) == true)
        {
            pos2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/wasps.png")));
        }

        if (manager.amIWasp(2) == false)
        {
            pos3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/miss.png")));
        } else if (manager.amIWasp(2) == true)
        {
            pos3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/wasps.png")));
        }

        if (manager.amIWasp(3) == false)
        {
            pos4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/miss.png")));
        } else if (manager.amIWasp(3) == true)
        {
            pos4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/wasps.png")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pos1Button = new javax.swing.JButton();
        pos2Button = new javax.swing.JButton();
        pos4Button = new javax.swing.JButton();
        pos3Button = new javax.swing.JButton();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pos1Button.setEnabled(false);
        pos1Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pos1ButtonActionPerformed(evt);
            }
        });

        pos2Button.setEnabled(false);
        pos2Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pos2ButtonActionPerformed(evt);
            }
        });

        pos4Button.setEnabled(false);
        pos4Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pos4ButtonActionPerformed(evt);
            }
        });

        pos3Button.setEnabled(false);
        pos3Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pos3ButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start!");
        startButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pos3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pos1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(pos2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pos1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(startButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pos2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pos4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void pos1ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pos1ButtonActionPerformed
    {//GEN-HEADEREND:event_pos1ButtonActionPerformed
        // TODO add your handling code here:
        int index = 0;
        checkIfWasp(index);
        TurnCounter.useTurn();
    }//GEN-LAST:event_pos1ButtonActionPerformed

    private void pos3ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pos3ButtonActionPerformed
    {//GEN-HEADEREND:event_pos3ButtonActionPerformed
        // TODO add your handling code here:
        int index = 2;
        checkIfWasp(index);
        TurnCounter.useTurn();
    }//GEN-LAST:event_pos3ButtonActionPerformed

    private void pos4ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pos4ButtonActionPerformed
    {//GEN-HEADEREND:event_pos4ButtonActionPerformed
        // TODO add your handling code here:
        int index = 3;
        checkIfWasp(index);
        TurnCounter.useTurn();
    }//GEN-LAST:event_pos4ButtonActionPerformed

    private void pos2ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pos2ButtonActionPerformed
    {//GEN-HEADEREND:event_pos2ButtonActionPerformed
        // TODO add your handling code here:
        int index = 1;
        checkIfWasp(index);
        TurnCounter.useTurn();
    }//GEN-LAST:event_pos2ButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_startButtonActionPerformed
    {//GEN-HEADEREND:event_startButtonActionPerformed
        // TODO add your handling code here:
        pos1Button.setEnabled(true);
        pos2Button.setEnabled(true);
        pos3Button.setEnabled(true);
        pos4Button.setEnabled(true);
        roundReset();
        startButton.setEnabled(false);
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton pos1Button;
    public javax.swing.JButton pos2Button;
    public javax.swing.JButton pos3Button;
    public javax.swing.JButton pos4Button;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

    private String wasp = "Wasp";
    private String miss = "Miss";

    public void resetRound()//major method to reset the wasps after each round
    {
        pos1Button.setText(miss);
        pos2Button.setText(miss);
        pos4Button.setText(miss);
        pos3Button.setText(miss);
    }
}
