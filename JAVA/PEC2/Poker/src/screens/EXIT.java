package screens;

import classes.CasaDeApuestas;
import java.awt.Toolkit;

/**
 *
 * @author mr.blissfulgrin
 */
public class EXIT extends javax.swing.JFrame {

    /**
     * Creates new form EXIT
     */
    public EXIT() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Nada = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SALIR");
        setIconImage(Toolkit.getDefaultToolkit().getImage("/imgages/Icono.png") );
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seguro que desea salir?");
        jPanel2.add(jLabel1, "card2");

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        Nada.setBackground(new java.awt.Color(153, 255, 0));
        Nada.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        Nada.setText("CANCELAR");
        Nada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NadaActionPerformed(evt);
            }
        });
        jPanel3.add(Nada);

        Salir.setBackground(new java.awt.Color(255, 0, 51));
        Salir.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel3.add(Salir);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(354, 180));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Cierra el JFrame
     */
    private void NadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NadaActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_NadaActionPerformed

    /**
     * Guarda los datos y cierra el sistema
     */
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        CasaDeApuestas.guardarDatos();
        Loading L = new Loading();
        if (NoRegistradoSaliente.getOcasional())
        {
            if (NoRegistradoSaliente.getJugador().getSaldo()>0)
                L.settxt1("Añadiendo "+NoRegistradoSaliente.getJugador().getSaldo()+"$ a su tarjeta "+NoRegistradoSaliente.getJugador().getInformacionBancaria());
            else
                L.settxt1("Retirando "+NoRegistradoSaliente.getJugador().getSaldo()*-1+"$ de su tarjeta "+NoRegistradoSaliente.getJugador().getInformacionBancaria());
            NoRegistradoSaliente.close();
        }
        else
            
            L.settxt1("Guardando datos "); 
        L.setVisible(true);
        L.updateBar();
        this.setVisible(false);
        this.dispose();
        System.exit(0); 
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
            java.util.logging.Logger.getLogger(EXIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EXIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EXIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EXIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EXIT().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nada;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
