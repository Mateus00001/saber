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
public class Html extends javax.swing.JFrame {

    /**
     * Creates new form Estudar
     */
    public Html() {
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

        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\1200px-HTML5.svg.png")); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 360));

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("HTML");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 280, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalho/GRD EMPE.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 203));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 580));

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
        jTextArea1.setText("O que é HTML?\n\n HTML (HyperText Markup Language) não é uma linguagem de programação, é uma linguagem \n de marcação utilizada para dizer ao seu navegador como estruturar a página web que você visita.\n A página pode ser tanto complicada como simples quanto o desenvolvedor web desejar que seja.\n HTML consiste em uma série de elementos que você usa para anexar, ou marcar diferentes partes\n do conteúdo para que apareça ou aja de uma certa maneira. O fechamento das tags pode\n transformar uma parte do conteúdo dentro do elemento em um link para direcionar à uma \noutra página web, colocar as palavras em itálico, e assim por diante. Por exemplo, observe o \nconteúdo a seguir:\n<p>Meu gato é muito mal-humorado.</p>\nAs partes principais do elemento são:\n\nTag de abertura: Consiste no nome do elemento ( neste caso: p ), envolvido entre parênteses \nangulares de abertura e fechamento. Isso indica onde o elemento começa, ou inicia a produzir \nefeito — neste caso, onde o parágrafo se inicia.\n\nTag de fechamento: É o mesmo que a tag de abertura, exceto que este inclui uma barra diagonal\n antes do nome do elemento. Indica onde o elemento termina — neste caso, onde fica o fim do\n parágrafo. Falhar em incluir o fechamento de uma tag é um erro comum para iniciantes e pode\n levar a resultados estranhos.\n\nO conteúdo: Este é o conteúdo do elemento, que neste caso é somente texto.\n\nO elemento: A tag de abertura, mais a tag de fechamento, mais o conteúdo, é igual ao elemento.\n\nA estrutura básica de uma página HTML pode ser vista na Listagem 1, na qual podemos ver as\n principais tags que são necessárias para que o documento seja corretamente interpretado \npelos browsers.\n\n<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\"/>\n<title>Document</title>\n</head>\n<body>\n<!-- Conteúdo -->\n</body>\n</html>\n\nLinha 1: a instrução DOCTYPE deve ser sempre a primeira a aparecer em uma página HTML para\n indicar ao browser qual versão da linguagem usada. Nesse caso, estamos trabalhando com a \nHTML5, versão na qual a declaração do DOCTYPE é bastante simples, como podemos ver na \nlistagem;\n\nLinhas 2 e 10: abertura e fechamento da tag html, que delimita o documento. Sendo assim, todas\n as demais tags da página devem estar nesse espaço;\n\nLinhas 3 e 6: abertura e fechamento da tag head, que define o cabeçalho do documento. \nO conteúdo nesse espaço não é visível no browser, mas contém instruções sobre seu conteúdo \ne comportamento. Dentro dessa tag, por exemplo, podem ser inseridas folhas de estilo e scripts;\n\nLinha 4: a tag meta, nesse caso, especifica qual conjunto de caracteres (character set ou charset) \nserá usado para renderizar o texto da página. O UTF-8 contém todos os caracteres dos padrões\n Unicode e ASCII, sendo, portanto, o mais utilizado em páginas web. A mesma tag meta, porém \ncom outros atributos, pode ser utilizada para outros fins, como na SEO (Search Engine \nOptimization);\n\nLinha 5: a tag title define o título da página, aquele que aparece na janela/aba do navegador;\n\nLinhas 7 e 9: abertura e fechamento da tag body, marcando o espaço no qual deve estar contido\n o conteúdo visual da página. As demais tags que representam texto, botões etc. devem ser \nadicionadas nesse intervalo;\n\nLinha 8: nessa linha podemos observar a sintaxe para adição de comentários em HTML. Esse \ntrecho não é renderizado pelo browser.\n\nPara desenvolver páginas com HTML basicamente precisamos de um editor de texto, como o\n Bloco de Notas do Windows, Nano e Emacs no Linux, entre vários outros. Há, ainda, editores \ncom opções avançadas, como recursos de syntax hilghligt e autocomplete, como Sublime Text,\n Atom, Brackets e Visual Studio Code, que podem ser usados para editar documentos HTML.\n\nIndependentemente do editor utilizado, podemos simplesmente copiar o código da Listagem \n1 para um deles e salvar o arquivo com extensão .html. Em seguida, podemos abrir esse arquivo \nem um browser.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel20.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 89, 610, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        MenuHtml t9=new MenuHtml();
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
            java.util.logging.Logger.getLogger(Html.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Html.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Html.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Html.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Html().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
