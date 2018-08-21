package screens;

import classes.JugadorRegistrado;
import classes.Premio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class EstadisticaPersonal extends javax.swing.JFrame {

    /**
     * Creates new form EstadisticaPersonal
     */
    public EstadisticaPersonal() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt6 = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/BlackJack.jpeg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(471, 50));
        jPanel2.add(jLabel1, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.CardLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new java.awt.CardLayout());

        jScrollPane1.setViewportView(txt2);

        jPanel4.add(jScrollPane1, "card2");

        jTabbedPane1.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new java.awt.CardLayout());

        jScrollPane2.setViewportView(txt6);

        jPanel5.add(jScrollPane2, "card2");

        jTabbedPane1.addTab("tab2", jPanel5);

        jPanel3.add(jTabbedPane1, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.5;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/Flecha.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel6.add(jButton1, gridBagConstraints);

        txt1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Estadísticas de: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        jPanel6.add(txt1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel6, gridBagConstraints);

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(700, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dentro d = new Dentro();
        d.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    JugadorRegistrado jugador;
    /**
     * Determina de qué jugador se mostrán datos.
     * @param jugador 
     */
    public void setJugador(JugadorRegistrado jugador)
    {
        this.jugador = jugador;
        txt1.setText(txt1.getText()+jugador.getNIF());
        actualizar1();
        actualizar2();
    }
    
    /**
     * Implementa el modo de visualizacion1 de los datos del jugador
     */
    private void actualizar1()
    {
       try
        {
            txt2.setText("");
            String cadena;
            FileReader f = new FileReader("./src/RegistroJugadores/"+jugador.getNIF()+".txt");
            try (BufferedReader b = new BufferedReader(f)) 
            {
                while((cadena = b.readLine())!=null) 
                {
                    txt2.setText(txt2.getText()+"\n"+cadena);
                }
            }
            
        }
        catch(IOException e)
        {
            Warnning w = new Warnning();
            w.setTextoW("Error al leer archivo de registro");
            w.setVisible(true);
        } 
    }
    
    /**
     * Implementa el modo de visualizacion2 de los datos del jugador
     */
    private void actualizar2()
    {
        ArrayList <Premio> empates = new ArrayList<>();
        ArrayList <Premio> superiores = new ArrayList<>();
        ArrayList <Premio> blackjacks = new ArrayList<>();

        txt6.setText("");
        for (int x=0; x<jugador.premios.getPremios().size();x++) 
        {
          switch(((Premio)jugador.premios.getPremios().get(x)).getTipo())
            {
                case 0:
                    empates.add(((Premio)jugador.premios.getPremios().get(x)));
                    break;
                case 1:
                    superiores.add(((Premio)jugador.premios.getPremios().get(x)));
                    break;
                case 2:
                    blackjacks.add(((Premio)jugador.premios.getPremios().get(x)));
                    break;
            }  
        }
        
        int empate = 0;
        double empaten = 0;
        int empateMesa = 0;
        double empateMesan = 0;
        int superior = 0;
        double superiorn = 0;
        int superiorMesa = 0;
        double superiorMesan = 0;
        int blackjack = 0;
        double blackjackn = 0;
        int blackjackMesa = 0;
        double blackjackMesan = 0;
        
        
        empate+=jugador.premios.getEmpate();
        empateMesa+=jugador.premios.getEmpateMesa();
        superior+=jugador.premios.getSuperior();
        superiorMesa+=jugador.premios.getSuperiorMesa();
        blackjack+=jugador.premios.getBlackJack();
        blackjackMesa+=jugador.premios.getBlackJackMesa();
        
        
        txt6.setText("Empates:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ empate+"\n");
        for (int x=0; x < empates.size(); x++)
        {
            if(!empates.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+empates.get(x).getPremio()+"\n");
                empaten += empates.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+empaten+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ empateMesa+"\n");
        for (int x=0; x < empates.size(); x++)
        {
            if(empates.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+empates.get(x).getPremio()+"\n");
                empateMesan += empates.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+empateMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (empate+empateMesa)+"\t--> "+(empaten+empateMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"Superiores:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ superior+"\n");
        for (int x=0; x < superiores.size(); x++)
        {
            if(!superiores.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+superiores.get(x).getPremio()+"\n");
                superiorn += superiores.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+superiorn+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ superiorMesa+"\n");
        for (int x=0; x < superiores.size(); x++)
        {
            if(superiores.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+superiores.get(x).getPremio()+"\n");
                superiorMesan += superiores.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+superiorMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (superior+superiorMesa)+"\t--> "+(superiorn+superiorMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"BlackJacks:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ blackjack+"\n");
        for (int x=0; x < blackjacks.size(); x++)
        {
            if(!blackjacks.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+blackjacks.get(x).getPremio()+"\n");
                blackjackn += blackjacks.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+blackjackn+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ blackjackMesa+"\n");
        for (int x=0; x < blackjacks.size(); x++)
        {
            if(blackjacks.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+blackjacks.get(x).getPremio()+"\n");
                blackjackMesan += blackjacks.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+blackjackMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (blackjack+blackjackMesa)+"\t--> "+(blackjackn+blackjackMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"Premios repartidos en total: "+(empate+empateMesa+superior+superiorMesa+blackjack+blackjackMesa)+"\t--> "+(empaten+empateMesan+superiorn+superiorMesan+blackjackn+blackjackMesan)+"$");
    }
    
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
            java.util.logging.Logger.getLogger(EstadisticaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EstadisticaPersonal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txt1;
    private javax.swing.JTextPane txt2;
    private javax.swing.JTextPane txt6;
    // End of variables declaration//GEN-END:variables
}