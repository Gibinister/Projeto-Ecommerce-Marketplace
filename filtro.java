/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitro_emporio_atado;

/**
 *
 * @author LUCAS KENZO
 */
public class filtro extends javax.swing.JFrame {

    /**
     * Creates new form filtro
     */
    public filtro() {
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

        text1 = new javax.swing.JLabel();
        dinheiro = new javax.swing.JComboBox<>();
        PROXIMIDADE = new javax.swing.JComboBox<>();
        tempo = new javax.swing.JComboBox<>();
        tag_1 = new javax.swing.JRadioButton();
        tag_2 = new javax.swing.JRadioButton();
        tag_3 = new javax.swing.JRadioButton();
        tag_4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        text1.setText("FILTRO");

        dinheiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DINHEIRO", "até 300 R$", "até 600 R$", "até 1000R$" }));
        dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinheiroActionPerformed(evt);
            }
        });

        PROXIMIDADE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROXIMIDADE", "até 10km", "até 40 km", "até 100 km" }));

        tempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEMPO", "até 1 semana", "até 1 mês", "até 1 ano" }));

        tag_1.setText("Eletronicos");
        tag_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tag_1ActionPerformed(evt);
            }
        });

        tag_2.setText("Eletrodomesticos");
        tag_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tag_2ActionPerformed(evt);
            }
        });

        tag_3.setText("Roupas");
        tag_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tag_3ActionPerformed(evt);
            }
        });

        tag_4.setText("Móveis ");
        tag_4.setActionCommand("Brinquedos");
        tag_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tag_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tag_1)
                            .addComponent(tag_3)
                            .addComponent(tag_2)
                            .addComponent(tag_4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PROXIMIDADE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dinheiro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tempo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PROXIMIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tag_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tag_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tag_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tag_4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dinheiroActionPerformed

    private void tag_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tag_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tag_1ActionPerformed

    private void tag_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tag_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tag_2ActionPerformed

    private void tag_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tag_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tag_3ActionPerformed

    private void tag_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tag_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tag_4ActionPerformed

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
            java.util.logging.Logger.getLogger(filtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filtro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filtro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PROXIMIDADE;
    private javax.swing.JComboBox<String> dinheiro;
    private javax.swing.JRadioButton tag_1;
    private javax.swing.JRadioButton tag_2;
    private javax.swing.JRadioButton tag_3;
    private javax.swing.JRadioButton tag_4;
    private javax.swing.JComboBox<String> tempo;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
