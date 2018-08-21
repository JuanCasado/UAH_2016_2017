package screens;

import classes.CasaDeApuestas;
import javax.swing.ImageIcon;

/**
 * @author mr.blissfulgrin
 */
public class Poker extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Poker() {
        initComponents();
        
        //Carga los datos una sola vez por cada ejecución del sistema
        if(cargaInicial)
        {
            CasaDeApuestas.cargarDatos();
            Loading L = new Loading();
            L.settxt1("Cargando datos ");
            L.setVisible(true);
            L.updateBar();
            cargaInicial=false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt = new javax.swing.JLabel();
        ButtonRegistrarse = new javax.swing.JButton();
        ButtonOcasional = new javax.swing.JButton();
        ButtonLogIn = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Poker");
        setBackground(new java.awt.Color(51, 102, 0));
        setForeground(new java.awt.Color(102, 153, 0));
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        setMaximumSize(new java.awt.Dimension(434, 500));
        setMinimumSize(new java.awt.Dimension(434, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        txt.setFont(new java.awt.Font("PilGi", 1, 48)); // NOI18N
        txt.setForeground(new java.awt.Color(204, 51, 0));
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/POKER.jpg"))); // NOI18N
        jPanel2.add(txt);

        ButtonRegistrarse.setBackground(new java.awt.Color(102, 153, 0));
        ButtonRegistrarse.setFont(new java.awt.Font("Malayalam MN", 1, 48)); // NOI18N
        ButtonRegistrarse.setText("Registrarse");
        ButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonRegistrarse);

        ButtonOcasional.setBackground(new java.awt.Color(102, 153, 0));
        ButtonOcasional.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        ButtonOcasional.setText("Jugador Ocasional");
        ButtonOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOcasionalActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonOcasional);

        ButtonLogIn.setBackground(new java.awt.Color(102, 153, 0));
        ButtonLogIn.setFont(new java.awt.Font("Malayalam MN", 1, 48)); // NOI18N
        ButtonLogIn.setText("Log in");
        ButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogInActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonLogIn);

        Salir.setBackground(new java.awt.Color(255, 0, 51));
        Salir.setFont(new java.awt.Font("Malayalam MN", 1, 48)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel2.add(Salir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(470, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private static boolean cargaInicial =true;
    
    /**
     * Abre el JFrame RegistrarRegistrado
     */
    private void ButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarseActionPerformed
        RegistrarRegistrado a =new RegistrarRegistrado();
        a.setVisible(true);
    }//GEN-LAST:event_ButtonRegistrarseActionPerformed

    /**
     * Abre el JFrame RegistrarOcasinal
     */
    private void ButtonOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOcasionalActionPerformed
        RegistrarOcasional a =new RegistrarOcasional();
        a.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_ButtonOcasionalActionPerformed
    
    /**
     * Abre el JFrame LogIn
     */
    private void ButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogInActionPerformed
        LogIn l = new LogIn();
        l.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_ButtonLogInActionPerformed
    
    /**
     * Abre el JFrame EXIT
     */
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        EXIT x = new EXIT();
        x.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Poker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Poker().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogIn;
    private javax.swing.JButton ButtonOcasional;
    private javax.swing.JButton ButtonRegistrarse;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
