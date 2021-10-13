/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcrossing;
import java.lang.Thread;
/**
 *
 * @author jauga
 */
public class TreeInteract extends javax.swing.JFrame
{
    Player player;
    Tree currentTree;
    Thread thread = new Thread();
    public TreeInteract(Player person, Tree thisTree) //major method to check the trees fields
    {
        player = person;
        currentTree = thisTree;
        initComponents();
        dogTreatLabel.setVisible(false);
        waspNestLabel.setVisible(false);
        waspNestLabel.setEnabled(false);
        doneButton.setEnabled(false);
    }
    public void checkCurrentTree()
    {
        if(currentTree.doesHasTreat())
        {
            dogTreatLabel.setVisible(true);//make jlabel visible
            player.addTreat();
            System.out.println("This tree had a treat!");
        }
        if(currentTree.getFruit() != null);
        {
            fruitLabel.setEnabled(true);
            if(currentTree.getFruit() == Fruit.Apple)
            {
                fruitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/Apple.png")));
            }
            if(currentTree.getFruit() == Fruit.Cherry)
            {
                fruitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/Cherry.png")));
            }
            if(currentTree.getFruit() == Fruit.Peach)
            {
                fruitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/Peach.png")));
            }
            if(currentTree.getFruit() == Fruit.Pear)
            {
                fruitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/Pear.png")));
            }
            player.addFruit(currentTree.getFruit());
            System.out.println("This tree had a fruit! it was a " + currentTree.getFruit());
        }
        if(currentTree.doesHasWasps())
        {
            doneButton.setEnabled(false);
            waspNestLabel.setVisible(true);
            waspNestLabel.setEnabled(true);
            player.setNumOfNests(player.getNumOfNests() + 1);
        }
        else
        {
            System.out.println("The Tree has nothing else");
        }
        
    }
    public void nothingThere()
    {
        setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton2 = new javax.swing.JButton();
        dogTreatLabel = new javax.swing.JLabel();
        fruitLabel = new javax.swing.JLabel();
        waspNestLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/ACTre.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        dogTreatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/dogTreat.png"))); // NOI18N

        fruitLabel.setEnabled(false);

        waspNestLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalcrossing/waspNest.png"))); // NOI18N
        waspNestLabel.setText("jLabel3");
        waspNestLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                waspNestLabelMouseMoved(evt);
            }
        });
        waspNestLabel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                waspNestLabelMouseClicked(evt);
            }
        });

        doneButton.setText("Done!");
        doneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dogTreatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(fruitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(waspNestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waspNestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fruitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dogTreatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doneButton)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        doneButton.setEnabled(true);
        checkCurrentTree();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void waspNestLabelMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_waspNestLabelMouseMoved
    {//GEN-HEADEREND:event_waspNestLabelMouseMoved
        
    }//GEN-LAST:event_waspNestLabelMouseMoved

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_doneButtonActionPerformed
    {//GEN-HEADEREND:event_doneButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_doneButtonActionPerformed

    private void waspNestLabelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_waspNestLabelMouseClicked
    {//GEN-HEADEREND:event_waspNestLabelMouseClicked
            FruitSelector uhoh = new FruitSelector(player);
            uhoh.setVisible(true);
            setVisible(false);
            doneButton.setEnabled(true);
    }//GEN-LAST:event_waspNestLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogTreatLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel fruitLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel waspNestLabel;
    // End of variables declaration//GEN-END:variables
}
