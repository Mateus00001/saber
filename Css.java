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
public class Css extends javax.swing.JFrame {

    /**
     * Creates new form Estudar
     */
    public Css() {
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
        jLabel14.setText("CSS");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 280, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\CSS.jpg")); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 220));

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
        jTextArea1.setText("CSS (Cascading Style Sheets) ?? uma linguagem de cria????o de estilos, que quando combinados \ndeterminam qual ser?? a apar??ncia de uma p??gina web. Enquanto o HTML cuida da estrutura\ncontida em uma p??gina, ?? o CSS quem diz ao navegador com o que cada parte da p??gina deve \nse parecer.\nUsamos a linguagem CSS para moldar a apar??ncia dos elementos em uma p??gina web atrav??s de\nregras.\nPor exemplo, com CSS podemos modificar os par??grafos p aumentando a sua fonte e peso \nadicionando negrito, os t??tulos h1 para que tenham a fonte Roboto Slab, mover uma parte da\np??gina para baixo de outra, entre muitos exemplos.\n\nTodas essas caracter??sticas visuais dos elementos s??o representadas por propriedades, de forma\nque aprender CSS consiste em tr??s etapas:\n\nEntender como ele funciona\nConhecer a sintaxe de uma regra\nDescobrir quais propriedades existem\n\nSintaxe de uma regra\nO trabalho do CSS ?? associar regras aos elementos em uma p??gina.\n\nUma regra CSS ?? composta de duas partes:\n\nSeletor\nDeclara????o\nSeletor ?? a parte da regra que informa a qual ou quais elementos ela deve ser aplicada.\n\nDeclara????o ?? a parte da regra que informa como os elementos referenciados pelo seletor devem \nser modificados.\n\nAs declara????es s??o compostas por pares de chave e valor separados por dois pontos :.\n\nPor exemplo, na regra apresentada no C??digo 1 p ?? o seletor e todo o conte??do entre chaves\n ?? a declara????o.\n\np {\n    font-family: Arial;\n}\n\nEssa regra informa para o navegador que todos os elementos p encontrados na p??gina devem \nter a fonte Arial.\n\nUma declara????o pode conter diversas propriedades separadas por ponto e v??rgula, conforme \nexemplificado no C??digo 2. As propriedades informam quais caracter??sticas visuais do elemento \ndesejamos modificar.\n\nh1, h2 {\n    font-family: Arial;\n    color: yellow;\n}\nC??digo 2. Regra com mais de uma propriedade\nEssa regra informa para o navegador que os elementos h1 e h2 devem ter a fonte Arial e a cor\n yellow.\n\nNote que a propriedade font-family recebe como valor o nome de uma fonte e que color recebe\n uma cor. Diferentes propriedades podem ter diferentes conjuntos de valores.\n\nExemplo pr??tico\nAbra o seu editor preferido para criar uma p??gina HTML e aplicar CSS a ela.\n\nNo arquivo HTML insira o C??digo 3.\n\n<!DOCTYPE html>\n<html>\n\n<head>\n    <title>Chapeuzinho Vermelho - Conto dos irm??os Grimm</title>\n</head>\n\n<body>\n    <h1>Chapeuzinho Vermelho</h1>\n\n    <p>Houve, uma vez uma graciosa menina;\n        quem a via ficava logo gostando dela,\n        assim como ela gostava de todos;\n        Particularmente, amava a avozinha, que n??o sabia o que dar e\n        o que fazer pela netinha.\n        Certa vez, presenteou-a com um chapeuzinho de\n        veludo vermelho e, porque lhe ficava muito bem,\n        a menina n??o mais quis usar outro e acabou ficando\n        com o apelido de Chapeuzinho Vermelho.\n        Um dia, a m??e chamou-a e disse-lhe:</p>\n\n    <blockquote>- Vem c??, Chapeuzinho Vermelho;\n        aqui tens um peda??o de bolo e uma garrafa de vinho;\n        leva tudo para a vov??; ela est?? doente e fraca e\n        com isso se restabelecer??.\n        P??e-te a caminho antes que o sol esquente muito e,\n        quando fores, comporta-te direito; n??o saias do caminho,\n        sen??o cais e quebras a garrafa e a vov?? ficar?? sem nada.\n        Quando entrares em seu quarto, n??o esque??as de dizer\n        \"bom-dia, vov??,\" ao inv??s de mexericar pelos cantos.\n    </blockquote>\n</body>\n\n</html>\nC??digo 3. Conte??do da p??gina HTML\nAssim como aprendemos anteriormente, um arquivo HTML deve ser salvo com a extens??o .html.\n Chamaremos esse arquivo de index.html, seguindo a conven????o da linguagem de nomear o \narquivo principal de um site dessa forma.\n\nAgora, crie um novo arquivo e insira nele o c??digo CSS do C??digo 4.\n\nh1 {\n    font-family: Arial;\n    color: #333;\n}\n\np {\n    font-size: 14px;\n}\n\nblockquote {\n    margin: 0;\n}\nC??digo 4. Regras CSS para o arquivo index.html\nUm arquivo CSS deve ser salvo com a extens??o .css. Chamaremos esse arquivo de stylesheet.css,\n seguindo a conven????o de nome dessa linguagem.\n\nNeste arquivo criamos tr??s regras.\n\nA primeira regra, que possui como seletor h1, informa que esse elemento deve possuir fonte Arial\n e um tom de cinza como cor. Podemos usar tanto nomes de cores quanto n??meros hexadecimais prefixados por cerquilha # como valor para a propriedade color.\nA segunda regra, que possui como seletor p, informa que esse elemento deve ter o tamanho da\n sua fonte modificado para 14px, que quer dizer 14 pixels. A propriedade fonte-size deve receber\n um valor num??rico em alguma unidade de medida reconhecida pelo CSS. Informar esse valor \nem pixels ?? muito comum.\nA terceira regra, que possui como seletor blockquote, modifica a margem desse elemento de\n forma que ele perca o recuo.\n\nlink\nAgora, devemos vincular o arquivo stylesheet.css a p??gina index.html. Faremos isso utilizando o\n elemento link.\n\nAbra o arquivo index.html e insira o seguinte conte??do dentro do elemento head, abaixo de title.\n\n<linkrel=\"stylesheet\" href=\"stylesheet.css\">\n\nC??digo 5. Utilizando o elemento link para vincular CSS e HTML\nO elemento link no C??digo 5 possui dois atributos, que s??o rel e href. Conforme aprendemos no \ncurso de HTML os atributos de um elemento sem tag de fechamento cont??m informa????es sobre\n o seu conte??do.\n\nA informa????o contida em rel ?? stylesheet nomeia a rela????o entre o recurso que est?? sendo \nadicionado no documento atual. Nesse caso informamos que estamos carregando uma folha \nde estilo para o documento.\n\nO atributo href cont??m a URL para o recurso que estamos adicionando. Essa URL pode ser \nabsoluta, como em https://www.site.com.br/css/stylesheet.css, ou relativa, que ?? a forma utilizada \nno C??digo 5.\n\nPara ver o resultado desse c??digo basta abrir o arquivo index.html no navegador. A Anima????o 2 \nmostra o momento em que o navegador aplica o CSS ap??s a p??gina ser atualizada.\n");
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
            java.util.logging.Logger.getLogger(Css.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Css.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Css.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Css.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Css().setVisible(true);
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
