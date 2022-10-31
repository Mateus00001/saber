/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho;
import com.mycompany.projetoquiz.Quiz;
import com.mycompany.projetoquiz.PerguntaCSS;



/**
 *
 * @author User
 */
public class EscolhaHtml extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public EscolhaHtml() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMemorizar = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();
        btnEstudar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HTML/CSS");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 250, 40));

        btnMemorizar.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnMemorizar.setText("MEMORIZAR");
        btnMemorizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMemorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemorizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMemorizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 130, 30));

        btnJogar.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnJogar.setText("JOGAR");
        btnJogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJogar.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                btnJogarHierarchyChanged(evt);
            }
        });
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        jPanel1.add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 110, 30));

        btnEstudar.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        btnEstudar.setText("ESTUDAR");
        btnEstudar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEstudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstudar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/kisspng-white-download-light-5a9aab77ca8362.9682870515200858798295.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 670, 470));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/kisspng-line-black-and-white-angle-point-night-lights-5a6ae27fe42143.2736953715169542399344.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 320));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SABER +");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_btnJogarHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJogarHierarchyChanged

    private void btnEstudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudarActionPerformed
     MenuHtml t9=new MenuHtml();
        t9.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnEstudarActionPerformed

    private void btnMemorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemorizarActionPerformed
 PerguntaCSS t10=new PerguntaCSS();
        t10.setVisible(true);
        this.dispose();     }//GEN-LAST:event_btnMemorizarActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
       Quiz t3=new Quiz();
        t3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJogarActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaHtml.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaHtml().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstudar;
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnMemorizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
