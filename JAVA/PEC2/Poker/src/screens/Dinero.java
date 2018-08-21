/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;
import classes.CasaDeApuestas;
import classes.Jugador;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/**
 *
 * @author mr.blissfulgrin
 */
public class Dinero extends javax.swing.JFrame {

    /**
     * Creates new form Dinero
     */
    public Dinero() {
        initComponents();
        this.setAlwaysOnTop(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dinero = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cuenta de cliente");
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.CardLayout());

        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("Elija la cantidad:");
        jPanel2.add(txt, "card2");

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.CardLayout());

        dinero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dineroStateChanged(evt);
            }
        });
        jPanel3.add(dinero, "card2");

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new java.awt.CardLayout());

        jButton1.setBackground(new java.awt.Color(102, 153, 0));
        jButton1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, "card2");

        jPanel4.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new java.awt.CardLayout());

        Button.setBackground(new java.awt.Color(0, 255, 0));
        Button.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });
        jPanel6.add(Button, "card2");

        jPanel4.add(jPanel6);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(354, 180));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Añade o retira dinero a un jugador registrado u ocasinal tenien en cuenta o no los viajes en el tiempo según como se haya configurado la llamada a la clase
     */
    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        if (retirar)
        {   
            if (registrado)
            {
                if (Fecha.esActualizado())
                {
                   int años=1;
                   LocalDate nfecha= Fecha.getFecha();
                   while (jugador.getFecha().isBefore(nfecha))
                   {
                       años++;
                       nfecha=nfecha.minusYears(1);
                   }
                       
                   jugador.setSaldo(jugador.getSaldo()-Double.parseDouble(dinero.getValue().toString()));
                   CasaDeApuestas.dineroRegistrado(Double.parseDouble(dinero.getValue().toString())*-1*1.02*años);
                    try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroJugadores/"+jugador.getNIF()+".txt",true)))) 
                    {
                        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        salida.println("--------------- Retirada de saldo +FECHA --------------------------\n");  
                        salida.println(LocalDate.now().format(formatoCorto));
                        salida.println("Nueva fecha: "+Fecha.getFecha().format(formatoCorto));
                        salida.println("Dinero devuelto extra por fecha: " +jugador.getSaldo()*0.02*años);
                        salida.println("Nuevo saldo: "+jugador.getSaldo());
                        salida.println("-----------------------------------------------------------\n");
                        salida.close();
                    } 
                    catch (IOException ex) 
                    {
                        Warnning w = new Warnning();
                        w.setTextoW("Error al crear archivo de registro");
                        w.setVisible(true);
                    } 
                    Hecho h = new Hecho();
                    h.setTextoH("Se le devolvieron "+jugador.getSaldo()*0.02*años+"$ Extra");
                    h.setVisible(true);
                }
                else
                {
                    jugador.retirarBeneficios(Double.parseDouble(dinero.getValue().toString()));
                    try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroJugadores/"+jugador.getNIF()+".txt",true)))) 
                    {
                        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        salida.println("--------------- Retirada de saldo --------------------------\n");  
                        salida.println(LocalDate.now().format(formatoCorto));
                        salida.println("Nuevo saldo: "+jugador.getSaldo());
                        salida.println("-----------------------------------------------------------\n");
                        salida.close();
                    } 
                    catch (IOException ex) 
                    {
                        Warnning w = new Warnning();
                        w.setTextoW("Error al crear archivo de registro");
                        w.setVisible(true);
                    }
                }
            }
            else
            {
                jugador.retirarBeneficios(Double.parseDouble(dinero.getValue().toString()));
            }
            Hecho h = new Hecho();
            dinero.setValue(0);
            txt.setText("Saldo actual: "+jugador.getSaldo());
            h.setTextoH("Retirada de dinero realizada con éxito");
            h.setVisible(true);
        }
        else
        {
            if (registrado)
            {
                jugador.aumentarSaldo(Double.parseDouble(dinero.getValue().toString()));
                try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroJugadores/"+jugador.getNIF()+".txt",true)))) 
                {
                    DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    salida.println("--------------- Aumento de saldo --------------------------\n");  
                    salida.println(LocalDate.now().format(formatoCorto));
                    salida.println("Nuevo saldo: "+jugador.getSaldo());
                    salida.println("------------------------------------------------------------\n");
                    salida.close();
                } 
                catch (IOException ex) 
                {
                    Warnning w = new Warnning();
                    w.setTextoW("Error al crear archivo de registro");
                    w.setVisible(true);
                }
            }
            else
            {
                jugador.aumentarSaldo(Double.parseDouble(dinero.getValue().toString()));
            }
            Hecho h = new Hecho();
            dinero.setValue(0);
            txt.setText("Saldo actual: "+jugador.getSaldo());
            h.setTextoH("Dinero añadido con éxito");
            h.setVisible(true);
        }
    }//GEN-LAST:event_ButtonActionPerformed

    /**
     * Regula que no se caque más del dinero que se tiene y que el valor a sacar o añadir sea positivo
     */
    private void dineroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dineroStateChanged
        if(Double.parseDouble(dinero.getValue().toString())<0)
        {
            dinero.setValue(0);
            Warnning w = new Warnning();
            w.setTextoW("No se admiten valores menores que 0");
            w.setVisible(true);
        }
        if(retirar & Double.parseDouble(dinero.getValue().toString())>jugador.getSaldo())
        {
            dinero.setValue(jugador.getSaldo());
            Warnning w = new Warnning();
            w.setTextoW("No puedes retirar más dinero del que tienes");
            w.setVisible(true);
        }
    }//GEN-LAST:event_dineroStateChanged

    /**
    * Cierra el JFrame
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Actualiza el label con el dinero del jugador
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt.setText("Saldo actual: "+jugador.getSaldo());
    }//GEN-LAST:event_formWindowOpened
    
    private boolean retirar;
    private boolean registrado;
    private Jugador jugador;
    /**
     * Permite configurar el jugador al que s ele añade o retira dienro
     * @param j 
     */
    public void setJ(Jugador j)
    {
        jugador=j;
    }
    /**
     * Permite decir si se va a añadir o retirar dinero 
     * @param b 
     */
    public void setBool(boolean b)
    {
        retirar=b;
    }
    
    /**
     * Permite decir si el jugdor es registrado u ocasional
     * @param b 
     */
    public void setRegistro(boolean b)
    {
        registrado=b;
    }

    /**
     * Permite dar texto al botón
     * @param str 
     */
    public void setTB(String str)
    {
        Button.setText(str);
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
            java.util.logging.Logger.getLogger(Dinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dinero().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JSpinner dinero;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
