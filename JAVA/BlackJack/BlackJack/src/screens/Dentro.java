package screens;

import java.awt.Toolkit;
import classes.CasaDeApuestas;
import classes.JugadorRegistrado;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dentro extends javax.swing.JFrame {

    /**
     * Creates new form Dentro
     */
    public Dentro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jugar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        mesa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        añadir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        retirar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        baja = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        estadistica = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        logOut = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("/imgages/Icono.png") );
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/BlackJack.jpeg"))); // NOI18N
        jPanel4.add(jLabel1, "card2");

        jPanel1.add(jPanel4);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.CardLayout());

        jugar.setBackground(new java.awt.Color(0, 204, 0));
        jugar.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jugar.setText("JUGAR 1vsIA");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        jPanel2.add(jugar, "card2");

        jPanel1.add(jPanel2);

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setLayout(new java.awt.CardLayout());

        mesa.setBackground(new java.awt.Color(0, 204, 0));
        mesa.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        mesa.setText("Jugar en Mesa");
        mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaActionPerformed(evt);
            }
        });
        jPanel10.add(mesa, "card2");

        jPanel1.add(jPanel10);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new java.awt.CardLayout());

        añadir.setBackground(new java.awt.Color(102, 153, 0));
        añadir.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        añadir.setText("Añadir Dinero");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        jPanel5.add(añadir, "card2");

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new java.awt.CardLayout());

        retirar.setBackground(new java.awt.Color(102, 153, 0));
        retirar.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        retirar.setText("Retirar Dinero");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        jPanel6.add(retirar, "card2");

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setLayout(new java.awt.CardLayout());

        baja.setBackground(new java.awt.Color(102, 153, 0));
        baja.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        baja.setText("Darse de baja");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });
        jPanel7.add(baja, "card2");

        jPanel1.add(jPanel7);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.CardLayout());

        estadistica.setBackground(new java.awt.Color(102, 153, 0));
        estadistica.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        estadistica.setText("Estadística personal");
        estadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticaActionPerformed(evt);
            }
        });
        jPanel3.add(estadistica, "card2");

        jPanel1.add(jPanel3);

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setLayout(new java.awt.CardLayout());

        logOut.setBackground(new java.awt.Color(255, 255, 51));
        logOut.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        jPanel8.add(logOut, "card2");

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setLayout(new java.awt.CardLayout());

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        exit.setText("SALIR");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel9.add(exit, "card2");

        jPanel1.add(jPanel9);

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(470, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Te lleva al JFrame BlackJack
     */
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        BlackJack p = new BlackJack();
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    /**
     * Te lleva al JFrame EXIT
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        EXIT x = new EXIT();
        x.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * Da de baja a un jugador y crea un txt para cerrar su contabilidad
     */
    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroJugadores/"+CasaDeApuestas.getregistrado(LogIn.getNifin())+".txt",true)))) 
        {
            DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            salida.println("--------------------------------- Baja de jugador ---------------------------------\n");  
            salida.println(LocalDate.now().format(formatoCorto));
            salida.println("Jugador eliminado correctamente");
            salida.println("--------------------------------------------------------------------------------------------\n");
            salida.close();
        } 
        catch (IOException ex) 
        {
            Warnning w = new Warnning();
            w.setTextoW("Error al crear archivo de registro");
            w.setVisible(true);
        }
        
        Hecho h = new Hecho();
        h.setTextoH("Baja realizada correctamente, "+CasaDeApuestas.getregistrado(LogIn.getNifin()).getSaldo()+"$ devueltos");
        CasaDeApuestas.getregistrado(LogIn.getNifin()).retirarBeneficios(CasaDeApuestas.getregistrado(LogIn.getNifin()).getSaldo()); //elimina el dinero del jugador
        CasaDeApuestas.bajaJugador(LogIn.getNifin());        
        BlackJack p = new BlackJack();
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_bajaActionPerformed

    /**
    * Te lleva al JFrame Fecha y al JFrame Dinero en modo retirar a registrado
    */
    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        JugadorRegistrado jugador = CasaDeApuestas.getregistrado(LogIn.getNifin());  
        Dinero d= new Dinero();
        d.setBool(true);
        d.setRegistro(true);
        d.setJ(jugador);
        d.setTB("RETIRAR");
        d.setVisible(true);
        Fecha f = new Fecha();
        f.setVisible(true);
    }//GEN-LAST:event_retirarActionPerformed
    
    /**
    * Te lleva al JFrame Dinero en modo añadir a Registrado
    */
    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        JugadorRegistrado jugador = CasaDeApuestas.getregistrado(LogIn.getNifin());
        Dinero d= new Dinero();
        d.setBool(false);
        d.setRegistro(true);
        d.setJ(jugador);
        d.setTB("AÑADIR");
        d.setVisible(true);
    }//GEN-LAST:event_añadirActionPerformed
    
    /**
    * Te lleva al JFrame Jugar y añade un txt de partida iniciada
    */
    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        if (CasaDeApuestas.getregistrado(LogIn.getNifin()).getSaldo()>20)
        {
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroJugadores/"+CasaDeApuestas.getregistrado(LogIn.getNifin()).getNIF()+".txt",true)))) 
                {
                    DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    salida.println("***************** Juego iniciado ***************************\n");  
                    salida.println(LocalDate.now().format(formatoCorto));
                    salida.close();
                } 
                catch (IOException ex) 
                {
                    Warnning w = new Warnning();
                    w.setTextoW("Error al crear archivo de registro");
                    w.setVisible(true);
                }
            CasaDeApuestas.getregistrado(LogIn.getNifin()).añadirPartida();
            Game g = new Game();
            Game.setJugador(CasaDeApuestas.getregistrado(LogIn.getNifin()));
            g.setRegistrado(true);
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

    private void estadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticaActionPerformed
        EstadisticaPersonal e = new EstadisticaPersonal();
        e.setJugador(CasaDeApuestas.getregistrado(LogIn.getNifin()));
        e.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_estadisticaActionPerformed

    private void mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaActionPerformed
        JugadorRegistrado jugador[]=new JugadorRegistrado[3];
        
        jugador[0] = CasaDeApuestas.getregistrado(LogIn.getNifin());
        
        boolean jugable = false;
        int prohibido=0;
        int prohibido1 =0;
        
        Object [] datos = CasaDeApuestas.getRegistro().keySet().toArray();
        String [] claves = new String[datos.length];
        for (int x =0; x < datos.length; x++)
            claves[x] = datos [x].toString();
        
        int timeout =0;
        int x = 1;
        int busca = 0;
        
        if(claves.length > 5)
        {
            for(int y =0; y< claves.length; y++)
            {
                if(jugador[0].getNIF().equals(claves[y]))
                    prohibido=y;
            }
            for(int y =0; y< claves.length; y++)
            {
                if("Crupier".equals(claves[y]))
                    prohibido1=x;
            }
            
            
            while((x!=3)&&(timeout<7))
            {
                if ((busca!=prohibido)&&(busca!=prohibido1))
                {
                    jugador[x]=CasaDeApuestas.getregistrado(claves[busca]);
                    x++;
                }
               
                busca++;
                if (busca==claves.length)
                    busca = 0;
                timeout ++;
            }
        }
        
        if (x==3)
        {
            Mesa m = new Mesa();
            m.setJugador(jugador[1],jugador[2],jugador[0]);
            m.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
        else 
        {
            Warnning w = new Warnning();
            w.setTextoW("No hay jugadores sufiecientes para jugar en mesa");
            w.setVisible(true);
        }
    }//GEN-LAST:event_mesaActionPerformed
    
   
    /**
     * Permite acceder al último jugador que ha hecho Log In
     * @return Jugador Registrado
     */
    public static JugadorRegistrado jugador()
    {
        return CasaDeApuestas.getregistrado(LogIn.getNifin());
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dentro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JButton baja;
    private javax.swing.JButton estadistica;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jugar;
    private javax.swing.JButton logOut;
    private javax.swing.JButton mesa;
    private javax.swing.JButton retirar;
    // End of variables declaration//GEN-END:variables
}
