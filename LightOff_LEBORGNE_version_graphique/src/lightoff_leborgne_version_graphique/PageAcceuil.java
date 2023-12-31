 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_leborgne_version_graphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bapti
 */
public class PageAcceuil extends javax.swing.JFrame {

    public PageAcceuil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Facile = new javax.swing.JButton();
        Moyen = new javax.swing.JButton();
        Difficile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        regles = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Facile.setText("Facile");
        Facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacileActionPerformed(evt);
            }
        });

        Moyen.setText("Moyen");
        Moyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoyenActionPerformed(evt);
            }
        });

        Difficile.setText("Difficle ");
        Difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DifficileActionPerformed(evt);
            }
        });

        regles.setColumns(20);
        regles.setRows(5);
        regles.setText("Bienvenue dans Light Off !\n\nLe but du jeu est simple : r�ussir � avoir un tableau enti�rement jaune.\nPour ce faire, tu peux activer des lignes, des colonnes ou une diagonale. \nAttention, cela change la couleur de chacune des pi�ces de la ligne\ns�lectionn�e.\n\nTu as le choix entre 3 niveaux de difficult�, ou la taille de la grille, \nle nombre de coups et le temps changent ( le temps d�marre lorsque\nvous activer votre premi�re cellule).\n\nBonne chance !\n\nVisualiser les caract�ristiques des niveaux en cliquant sur les boutons");
        jScrollPane2.setViewportView(regles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Facile)
                        .addGap(88, 88, 88)
                        .addComponent(Moyen)
                        .addGap(103, 103, 103)
                        .addComponent(Difficile)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Facile)
                    .addComponent(Moyen)
                    .addComponent(Difficile))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacileActionPerformed
      Facile f = new Facile();
         f.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_FacileActionPerformed

    private void MoyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoyenActionPerformed
         Moyen f = new Moyen();
         f.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_MoyenActionPerformed

    private void DifficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DifficileActionPerformed
         Difficile f = new Difficile();
         f.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_DifficileActionPerformed

    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(PageAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PageAcceuil().setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Difficile;
    private javax.swing.JButton Facile;
    private javax.swing.JButton Moyen;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea regles;
    // End of variables declaration//GEN-END:variables
}
