/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho;

import java.awt.Color;

/**
 *
 * @author User
 */
public class IDE extends javax.swing.JFrame {

    /**
     * Creates new form Estudar
     */
    public IDE() {
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

        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NETBEANS");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 510, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Trabalho\\src\\trabalho\\exemplojcreator.jpg")); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 180));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 580));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/GRD DEIT.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 600, 90));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/GRD DEIT.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 600, 90));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel56.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\icons 1\\arrow_redo.png")); // NOI18N
        jLabel56.setText("Voltar");
        jLabel56.setToolTipText("");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        jPanel20.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("O NetBeans IDE é um software de código aberto, disponível para Windows, Linux e Mac, que permite \ndesenvolver páginas de Internet e aplicações para dispositivos móveis em linguagens como \nJavaScript, C, C++, Ruby on Rails, PHP e outras. Seus recursos permitem que determinados códigos\n ganhem destaque sintática e semanticamente para melhor organização e mais rapidez do trabalho.\n\nA interface do NetBeans IDE é como qualquer outro software de desenvolvimento: um editor de \ntextos que aceitam linguagens de programação. O destaque dele, ficam nos recursos apresentados\nno menu superior.\n\nSeu recurso GUI Builder serve para a criação do design e posicionamento dos componentes na\ninterface, pois apresenta ao desenvolvedor todos os espaços alinhados automaticamente. Sem essa\npreocupação, você pode agilizar o prazo de entrega do projeto.\n\nFAÇA TESTES PARA EVITAR ERROS\nOutra facilidade oferecida é a criação de testes a fim de eliminar erros nas aplicações em \ndesenvolvimento para celulares, pois ele possui suporte com todos os componentes necessários \npara simular o ambiente. Além disso, seus diagramas e modelos podem ajuda-lo a acelerar o \ntrabalho.\n\nPara quem já desenvolve há muito tempo, poderá encontrar um ambiente avançado com modelos \nde projetos em C e C++, com bibliotecas de componentes dinâmicos e estáticos. É possível \naproveitá-los em novas composições para facilitar o processo.\n\nO NetBeans IDE é excelente ferramenta para desenvolvedores em qualquer nível de conhecimento, \npois suas ferramentas facilitam para os iniciantes e trazem recursos avançados para os profissionais. \nEle vem em inglês, possui versão gratuita para testes e é compatível com Mac OS X 10.5 ou superior,\n Linux e também, com o Windows 2000, 2003, XP, Vista, 7 e 8.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel20.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 460));

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 89, 630, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        menuJava t9=new menuJava();
        t9.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel56MouseClicked

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}