/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import classes.JugadorRegistrado;
import classes.Premio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author mr.blissfulgrin
 */
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/POKER.jpg"))); // NOI18N
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
        ArrayList <Premio> parejas = new ArrayList<>();
        ArrayList <Premio> doblesParejas = new ArrayList<>();
        ArrayList <Premio> trios = new ArrayList<>();
        ArrayList <Premio> fulls = new ArrayList<>();
        ArrayList <Premio> colores = new ArrayList<>();
        ArrayList <Premio> pokers = new ArrayList<>();
        txt6.setText("");
        for (int x=0; x<jugador.premios.getPremios().size();x++) 
        {
          switch(((Premio)jugador.premios.getPremios().get(x)).getTipo())
            {
                case 0:
                    parejas.add(((Premio)jugador.premios.getPremios().get(x)));
                    break;
                case 1:
                    doblesParejas.add(((Premio)jugador.premios.getPremios().get(x)));
                    break;
                case 2:
                    trios.add(((Premio)jugador.premios.getPremios().get(x)));
                    break;
                case 4:
                    fulls.add(((Premio)jugador.premios.getPremios().get(x))); 
                    break;
                case 3:
                    colores.add(((Premio)jugador.premios.getPremios().get(x))); 
                    break;
                case 5:
                    pokers.add(((Premio)jugador.premios.getPremios().get(x))); 
                    break;
            }  
        }
        
        int pareja = 0;
        double parejan = 0;
        int parejaMesa = 0;
        double parejaMesan = 0;
        int doblePareja = 0;
        double dobleParejan = 0;
        int dobleParejaMesa = 0;
        double dobleParejaMesan = 0;
        int trio = 0;
        double trion = 0;
        int trioMesa = 0;
        double trioMesan = 0;
        int full = 0;
        double fulln =0;
        int fullMesa = 0;
        double fullMesan = 0;
        int color = 0;
        double colorn = 0;
        int colorMesa = 0;
        double colorMesan = 0;
        int poker = 0;
        double pokern = 0;
        int pokerMesa = 0;
        double pokerMesan = 0;
        
        pareja+=jugador.premios.getPareja();
        parejaMesa+=jugador.premios.getParejaMesa();
        doblePareja+=jugador.premios.getDoblePareja();
        dobleParejaMesa+=jugador.premios.getDobleParejaMesa();
        trio+=jugador.premios.getTrio();
        trioMesa+=jugador.premios.getTrioMesa();
        full+=jugador.premios.getFull();
        fullMesa+=jugador.premios.getFullMesa();
        color+=jugador.premios.getColor();
        colorMesa+=jugador.premios.getColorMesa();
        poker+=jugador.premios.getPoker();
        pokerMesa+=jugador.premios.getPokerMesa();
        
        
        txt6.setText("Parejas:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ pareja+"\n");
        for (int x=0; x < parejas.size(); x++)
        {
            if(!parejas.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+parejas.get(x).getPremio()+"\n");
                parejan += parejas.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+parejan+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ parejaMesa+"\n");
        for (int x=0; x < parejas.size(); x++)
        {
            if(parejas.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+parejas.get(x).getPremio()+"\n");
                parejaMesan += parejas.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+parejaMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (pareja+parejaMesa)+"\t--> "+(parejan+parejaMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"DoblesParejas:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ doblePareja+"\n");
        for (int x=0; x < doblesParejas.size(); x++)
        {
            if(!doblesParejas.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+doblesParejas.get(x).getPremio()+"\n");
                dobleParejan += doblesParejas.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+dobleParejan+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ dobleParejaMesa+"\n");
        for (int x=0; x < doblesParejas.size(); x++)
        {
            if(doblesParejas.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+doblesParejas.get(x).getPremio()+"\n");
                dobleParejaMesan += doblesParejas.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+dobleParejaMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (doblePareja+dobleParejaMesa)+"\t--> "+(dobleParejan+dobleParejaMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"Trios:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ trio+"\n");
        for (int x=0; x < trios.size(); x++)
        {
            if(!trios.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+trios.get(x).getPremio()+"\n");
                trion += trios.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+trion+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ trioMesa+"\n");
        for (int x=0; x < trios.size(); x++)
        {
            if(trios.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+trios.get(x).getPremio()+"\n");
                trioMesan += trios.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+trioMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (trio+trioMesa)+"\t--> "+(trion+trioMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"Color:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ color+"\n");
        for (int x=0; x < colores.size(); x++)
        {
            if(!colores.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+colores.get(x).getPremio()+"\n");
                colorn += colores.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+colorn+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ colorMesa+"\n");
        for (int x=0; x < colores.size(); x++)
        {
            if(colores.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+colores.get(x).getPremio()+"\n");
                colorMesan += colores.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+colorMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (color+colorMesa)+"\t--> "+(colorn+colorMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"Full:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ full+"\n");
        for (int x=0; x < fulls.size(); x++)
        {
            if(!fulls.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+fulls.get(x).getPremio()+"\n");
                fulln += fulls.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+fulln+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ fullMesa+"\n");
        for (int x=0; x < fulls.size(); x++)
        {
            if(fulls.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+fulls.get(x).getPremio()+"\n");
                fullMesan += fulls.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+fullMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (full+fullMesa)+"\t--> "+(fulln+fullMesan)+"$\n");
        
        
        txt6.setText(txt6.getText()+"Poker:\n");
        txt6.setText(txt6.getText()+"\tEn juego simple: "+ poker+"\n");
        for (int x=0; x < pokers.size(); x++)
        {
            if(!pokers.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+pokers.get(x).getPremio()+"\n");
                pokern += pokers.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+pokern+"$\n");
        txt6.setText(txt6.getText()+"\tEn mesa: "+ pokerMesa+"\n");
        for (int x=0; x < pokers.size(); x++)
        {
            if(pokers.get(x).getEnMesa())
            {
                txt6.setText(txt6.getText()+"\t--> \t"+pokers.get(x).getPremio()+"\n");
                pokerMesan += pokers.get(x).getPremio();
            }
        }
        txt6.setText(txt6.getText()+"\tsubtotal: "+pokerMesan+"$\n");
        txt6.setText(txt6.getText()+"\tTotal: "+ (poker+pokerMesa)+"\t--> "+(pokern+pokerMesan)+"$\n\n");
        txt6.setText(txt6.getText()+"Premios repartidos en total: "+(pareja+parejaMesa+doblePareja+dobleParejaMesa+trio+trioMesa+color+colorMesa+full+fullMesa+poker+pokerMesa)+"\t--> "+(parejan+parejaMesan+dobleParejan+dobleParejaMesan+trion+trioMesan+colorn+colorMesan+fulln+fullMesan+pokern+pokerMesan)+"$");
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
