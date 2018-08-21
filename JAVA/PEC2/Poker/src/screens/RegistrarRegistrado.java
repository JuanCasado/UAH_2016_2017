/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import classes.CasaDeApuestas;
import classes.Ex;
import classes.JugadorRegistrado;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author mr.blissfulgrin
 */
public class RegistrarRegistrado extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarOcasional
     */
    public RegistrarRegistrado() {
        initComponents();
        dia.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        año.setSelectedIndex(0);
        
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
        volver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nif = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        banco = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registrar Jugador");
        setBackground(new java.awt.Color(51, 102, 0));
        setIconImage(Toolkit.getDefaultToolkit().getImage("/imgages/Icono.png") );
        setMaximumSize(new java.awt.Dimension(434, 500));
        setMinimumSize(new java.awt.Dimension(434, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 204, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jugador Registrado     ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel2.add(jLabel1, gridBagConstraints);

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/Flecha.jpg"))); // NOI18N
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(volver, gridBagConstraints);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("   Nombre: ");
        jPanel3.add(jLabel2);

        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombreMouseEntered(evt);
            }
        });
        jPanel3.add(nombre);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText("   Apellidos: ");
        jPanel4.add(jLabel3);

        apellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apellidosMouseEntered(evt);
            }
        });
        jPanel4.add(apellidos);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setText("   NIF: ");
        jPanel5.add(jLabel4);

        nif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nifMouseEntered(evt);
            }
        });
        jPanel5.add(nif);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setText("   Nacimiento: ");
        jPanel6.add(jLabel5);

        getDias();
        dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diaMouseEntered(evt);
            }
        });
        jPanel6.add(dia);

        getMeses();
        mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mesMouseEntered(evt);
            }
        });
        jPanel6.add(mes);

        getAños();
        año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añoMouseEntered(evt);
            }
        });
        jPanel6.add(año);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setText("   Cuenta Bancaria: ");
        jPanel7.add(jLabel6);

        banco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bancoMouseEntered(evt);
            }
        });
        jPanel7.add(banco);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setText("   Contraseña: ");
        jPanel8.add(jLabel7);

        pass1.setText("jPasswordField1");
        pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass1FocusGained(evt);
            }
        });
        pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickPass1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass1MouseEntered(evt);
            }
        });
        jPanel8.add(pass1);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setText("   Repetir contraseña: ");
        jPanel9.add(jLabel8);

        pass2.setText("jPasswordField2");
        pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass2FocusGained(evt);
            }
        });
        pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickPass2(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass2MouseEntered(evt);
            }
        });
        jPanel9.add(pass2);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setText("   Saldo Inicial: ");
        jPanel10.add(jLabel9);

        saldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saldoMouseEntered(evt);
            }
        });
        jPanel10.add(saldo);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));
        jPanel11.setLayout(new java.awt.CardLayout());

        jButton1.setBackground(new java.awt.Color(102, 153, 0));
        jButton1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, "card2");

        jPanel1.add(jPanel11);

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(434, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Da los dias al ComboBox
     */
    private void getDias()
    {
        ArrayList <String> dias = new ArrayList<>();
        dias.add("--Día--");
        for (int x=0; x<31;x++)
            dias.add(""+(x+1));  
        dia = new JComboBox(dias.toArray());
    }
    
    /**
     * Da los meses al ComboBox
     */
    private void getMeses()
    {
        ArrayList <String> meses = new ArrayList<>();
        meses.add("--Mes--");
        for (int x=0; x<12;x++)
            meses.add(""+(x+1));  
        mes = new JComboBox(meses.toArray());
    }
    
    /**
     * Da los años al ComboBox
     */
    private void getAños()
    {
        ArrayList <String> años = new ArrayList<>();
        años.add("--Año--");
        for (int x=LocalDate.now().getYear(); x>1899;x--)
            años.add(""+(x));  
        año = new JComboBox(años.toArray());
    }
      
    /*********************************************************************
     Metodos para mejora la UI y dar ayudas al hacer clik o pasr el mouse
     ********************************************************************/
    private void ClickPass1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickPass1
       pass1.setText("");
    }//GEN-LAST:event_ClickPass1

    private void ClickPass2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickPass2
        pass2.setText("");
    }//GEN-LAST:event_ClickPass2

    private void nombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseEntered
        nombre.setToolTipText("Escriba su nombre");
    }//GEN-LAST:event_nombreMouseEntered

    private void apellidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidosMouseEntered
        apellidos.setToolTipText("Escriba sus apellidos");
    }//GEN-LAST:event_apellidosMouseEntered

    private void nifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nifMouseEntered
        nif.setToolTipText("Escriba su NIF");
    }//GEN-LAST:event_nifMouseEntered

    private void bancoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bancoMouseEntered
        banco.setToolTipText("Escriba su cuenta bancaria");
    }//GEN-LAST:event_bancoMouseEntered

    private void saldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoMouseEntered
        saldo.setToolTipText("Introduzca su lado");
    }//GEN-LAST:event_saldoMouseEntered

    private void pass1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass1MouseEntered
        pass1.setToolTipText("Escriba su contraseña");
    }//GEN-LAST:event_pass1MouseEntered

    private void pass2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2MouseEntered
        pass2.setToolTipText("Escriba su contraseña de nuevo");
    }//GEN-LAST:event_pass2MouseEntered

    private void diaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaMouseEntered
        dia.setToolTipText("Ponga su día de nacimiento");
    }//GEN-LAST:event_diaMouseEntered

    private void mesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesMouseEntered
        mes.setToolTipText("Ponga su mes de nacimiento");
    }//GEN-LAST:event_mesMouseEntered

    private void añoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añoMouseEntered
        año.setToolTipText("Ponga su año de nacimiento");
    }//GEN-LAST:event_añoMouseEntered

    /**
     * Abre el JFrame Poker
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Poker p = new Poker();
        p.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    /**
     * Cierra este JFrame
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    /**
     * Crea un nuevo JugadorRegistrado si todo es correcto
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JugadorRegistrado jugador;
        String cuentaBancaria;
        String NIF;
        String Nombre;
        String contraseña;
        double Saldo;
        String Apellidos;
        LocalDate fecha;
        int Dia;
        String dia_s;
        int Mes;
        String mes_s;
        int Año;
        
        try
        {
            if (banco.getText().equals(""))
                throw new Ex(Ex.BANCO);
            cuentaBancaria=banco.getText();
            if (nif.getText().equals(""))
                throw new Ex(Ex.NIF);
            NIF=nif.getText();
            if (nombre.getText().equals(""))
                throw new Ex(Ex.NOMBRE);
            Nombre=nombre.getText();
            if (apellidos.getText().equals(""))
                throw new Ex(Ex.APELLIDOS);
            Apellidos=apellidos.getText();
            if (saldo.getText().equals(""))
                throw new Ex(Ex.SALDO);

            if (Double.parseDouble(saldo.getText())<=0)
                throw new Ex(Ex.MINIMO);
            Saldo=Double.parseDouble(saldo.getText());
            
            if (dia.getSelectedItem().toString().equals("--Día--"))
                throw new Ex(Ex.DIA);
            Dia=Integer.parseInt(""+dia.getSelectedItem());
            if (Dia<10)
                dia_s="0"+Dia;
            else
                dia_s=""+Dia;
            if (mes.getSelectedItem().toString().equals("--Mes--"))
                throw new Ex(Ex.MES);
            Mes=Integer.parseInt(""+mes.getSelectedItem());
            if (Mes<10)
                mes_s="0"+Mes;
            else
                mes_s=""+Mes;
            if (año.getSelectedItem().toString().equals("--Año--"))
                throw new Ex(Ex.ANNO);
            Año=Integer.parseInt(""+año.getSelectedItem()); 
            fecha= LocalDate.parse(Año+"-"+mes_s+"-"+dia_s);
            if(LocalDate.now().isBefore(fecha))
                throw new Ex(Ex.FUTURO);
            if (pass1.getText().equals(""))
                throw new Ex(Ex.CONTRASENNA);
            if (pass2.getText().equals(""))
                throw new Ex(Ex.CONTRASENNA_REPETIDA);
            if (!pass1.getText().equals(pass2.getText()))
                throw new Ex(Ex.CONTRASENNA_DISTINTA);
            if (pass1.getPassword().length<8)
                throw new Ex(Ex.CONTRASENNA_INSEGURA);
            contraseña = pass1.getText();
            if (fecha.isAfter(LocalDate.now().minusYears(18)))
                throw new Ex(Ex.EDAD);
            
            if(CasaDeApuestas.esRegistrable(NIF))
                throw new Ex(Ex.NO_REGISTRABLE);
            
            jugador = new JugadorRegistrado(cuentaBancaria, NIF, Nombre, Saldo, Apellidos,fecha, contraseña);
            
            CasaDeApuestas.altaJugador(jugador);
            
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroJugadores/"+jugador.getNIF()+".txt")))) 
            {
                DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                salida.println("--------------- NIF:"+jugador.getNIF()+" --------------------\n");  
                salida.println("Fecha de registro"+jugador.getFechaRegistro().format(formatoCorto));
                salida.println("Nombre: "+jugador.getNombre());
                salida.println("Apellidos: "+jugador.getApellidos());
                salida.println("Fecha de nacimiento: "+jugador.getFecha().format(formatoCorto));
                salida.println("Cuenta bancaria: "+ jugador.getInformacionBancaria());
                salida.println("Saldo inicial: "+jugador.getSaldo());
                salida.println("Partidas jugadas: "+jugador.getPartidasJugadas());
                salida.println("-------------------------------------------------------------\n");
                salida.close();
            } 
            catch (IOException ex) 
            {
                Warnning w = new Warnning();
                w.setTextoW("Error al crear archivo de registro");
                w.setVisible(true);
            }
            
            Hecho h =new Hecho();
            h.setTextoH("Jugador registrado.\n Mucha suerte "+jugador.getNombre()+"!!!");
            
            h.setVisible(true);
            
            
            dia.setSelectedIndex(0);
            mes.setSelectedIndex(0);
            año.setSelectedIndex(0);
            nombre.setText("");
            apellidos.setText("");
            nif.setText("");
            banco.setText("");
            pass1.setEchoChar('*');
            pass2.setEchoChar('*');
            saldo.setText("");
        }
        catch(Ex e)
        {
            Warnning w = new Warnning();
            w.setTextoW(e.getMessage());
            w.setVisible(true);
        } 
        catch(NumberFormatException e)
        {
            Warnning w = new Warnning();
            w.setTextoW("Saldo incorrecto "+e.getMessage());
            w.setVisible(true);
        }
        catch(DateTimeParseException e)
        {
            Warnning w = new Warnning();
            w.setTextoW("Fecha incorrecta "+e.getMessage());
            w.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusGained
        pass1.setText("");
    }//GEN-LAST:event_pass1FocusGained

    private void pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusGained
        pass2.setText("");
    }//GEN-LAST:event_pass2FocusGained

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
            java.util.logging.Logger.getLogger(RegistrarRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarRegistrado().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JTextField banco;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nif;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
