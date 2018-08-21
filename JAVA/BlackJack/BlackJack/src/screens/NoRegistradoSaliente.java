package screens;

import classes.JugadorOcasional;
import javax.swing.ImageIcon;

public class NoRegistradoSaliente extends javax.swing.JFrame {

    /**
     * Creates new form NoRegistradoSaliente
     */
    public NoRegistradoSaliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jugar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("No Registrado");
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/BlackJack.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);

        jugar.setBackground(new java.awt.Color(0, 255, 0));
        jugar.setFont(new java.awt.Font("Malayalam MN", 1, 48)); // NOI18N
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        jPanel1.add(jugar);

        añadir.setBackground(new java.awt.Color(102, 153, 0));
        añadir.setFont(new java.awt.Font("Malayalam MN", 1, 43)); // NOI18N
        añadir.setText("AÑADIR DINERO");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        jPanel1.add(añadir);

        retirar.setBackground(new java.awt.Color(102, 153, 0));
        retirar.setFont(new java.awt.Font("Malayalam MN", 1, 43)); // NOI18N
        retirar.setText("RETIRAR DINERO");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        jPanel1.add(retirar);

        inicio.setBackground(new java.awt.Color(102, 153, 0));
        inicio.setFont(new java.awt.Font("Malayalam MN", 1, 48)); // NOI18N
        inicio.setText("INICIO");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel1.add(inicio);

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Malayalam MN", 1, 48)); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir);

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(470, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private static JugadorOcasional jugador;
    
    /**
     * Da el último JugadorOcaional creado
     * @return JugadorOcasional
     */
    public static JugadorOcasional getJugador()
    {
        return jugador;
    }   
    
    private static boolean Ocasional = false;
    
    /**
     * Borra el último ocasional
     */
    public static void close()
    {
        Ocasional= false;
    }
    
    /**
     * Dice si hay o no un JugadorOcasional
     * @return boolena
     */
    public static boolean getOcasional()
    {
        return Ocasional;
    }
    
    /**
     * Pone un JugadorOcasional
     * @param jugador JugadorOcasional
     */
    public static void setJugador (JugadorOcasional jugador)
    {
        NoRegistradoSaliente.jugador=jugador;
    }
    
    /**
     * Abre el JFrame blackjack
     */
    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        if (jugador.getSaldo()>20)
        {
        Game g = new Game();
        Game.setJugador(jugador);
        g.setRegistrado(false);
        g.actualizar();
        g.setVisible(true);
        this.setVisible(false);
        this.dispose();
        }
        else
        {
            Warnning w = new Warnning();
            w.setTextoW("Minimo 20$ para jugar");
            w.setVisible(true);
        }
    }//GEN-LAST:event_jugarActionPerformed

    /**
     * Abre el JFrame Dinero en modo añadir Ocaional
     */
    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        Dinero d= new Dinero();
        d.setJ(jugador);
        d.setTB("AÑADIR");
        d.setBool(false);
        d.setRegistro(false);
        d.setVisible(true);
    }//GEN-LAST:event_añadirActionPerformed

    /**
     * Abre el JFrame Dinero en modo retirar Ocaional
     */
    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        Dinero d= new Dinero();
        d.setJ(jugador);
        d.setTB("RETIRAR");
        d.setBool(true);
        d.setRegistro(false);
        d.setVisible(true);
    }//GEN-LAST:event_retirarActionPerformed

    /**
     * Abre el JFrame EXIT
     */
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        Ocasional=true;
        EXIT x = new EXIT();
        x.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    /**
     * Permite volver al JFrame BlackJack y borrar el JugadorOcasional; le retorna su dinero
     */
    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        BlackJack p = new BlackJack();
        p.setVisible(true);
        Loading L = new Loading();
        Ocasional = false;
        if (jugador.getSaldo()>0)
            L.settxt1("Añadiendo "+jugador.getSaldo()+"$ a su tarjeta "+jugador.getInformacionBancaria());
        else
            L.settxt1("Retirando "+jugador.getSaldo()*-1+"$ de su tarjeta "+jugador.getInformacionBancaria());
        jugador.retirarBeneficios(jugador.getSaldo());
        L.setVisible(true);
        L.updateBar();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_inicioActionPerformed

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
            java.util.logging.Logger.getLogger(NoRegistradoSaliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoRegistradoSaliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoRegistradoSaliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoRegistradoSaliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NoRegistradoSaliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jugar;
    private javax.swing.JButton retirar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
