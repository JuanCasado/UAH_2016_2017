package screens;

import classes.Ex;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author mr.blissfulgrin
 */
public class Fecha extends javax.swing.JFrame {

    /**
     * Creates new form Fecha
     */
    public Fecha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Dias = new javax.swing.JComboBox<>();
        Meses = new javax.swing.JComboBox<>();
        Años = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        NO = new javax.swing.JButton();
        CLARO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fecha");
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desea viajar en el tiempo?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        getDias();
        jPanel2.add(Dias);

        getMeses();
        jPanel2.add(Meses);

        getAños();
        jPanel2.add(Años);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        NO.setBackground(new java.awt.Color(255, 0, 0));
        NO.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        NO.setText("NO");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        jPanel3.add(NO);

        CLARO.setBackground(new java.awt.Color(0, 255, 0));
        CLARO.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        CLARO.setText("Claro!");
        CLARO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLAROActionPerformed(evt);
            }
        });
        jPanel3.add(CLARO);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(354, 175));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * No realiza el viaje en el tiempo
     */
    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
        Hecho h = new Hecho();
        h.setTextoH("Sin cambios realizados");
        h.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_NOActionPerformed
    
    /**
     * Realiza un viaje en el el tiempo
     */
    private void CLAROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAROActionPerformed
        int Dia;
        String dia_s;
        int Mes;
        String mes_s;
        int Año;
        try
        {
            if (Dias.getSelectedItem().toString().equals("--Día--"))
                    throw new Ex("Campo día sin rellenar");
                Dia=Integer.parseInt(""+Dias.getSelectedItem());
                if (Dia<10)
                    dia_s="0"+Dia;
                else
                    dia_s=""+Dia;
                if (Meses.getSelectedItem().toString().equals("--Mes--"))
                    throw new Ex("Campo mes sin rellenar");
                Mes=Integer.parseInt(""+Meses.getSelectedItem());
                if (Mes<10)
                    mes_s="0"+Mes;
                else
                    mes_s=""+Mes;
                if (Años.getSelectedItem().toString().equals("--Año--"))
                    throw new Ex("Campo año sin rellenar");
                Año=Integer.parseInt(""+Años.getSelectedItem()); 
                if(LocalDate.now().isAfter(fecha))
                    throw new Ex("Solo se permite viajar al futuro");
                
                fecha= LocalDate.parse(Año+"-"+mes_s+"-"+dia_s);
                actualizado=true;
                
                Hecho h = new Hecho();
                h.setTextoH("Fecha actual"+fecha.toString());
                h.setVisible(true);
                this.setVisible(false);
                this.dispose();
        }
        catch(Ex e)
        {
            Warnning w = new Warnning();
            w.setTextoW(e.getMessage());
            w.setVisible(true);
        }
    }//GEN-LAST:event_CLAROActionPerformed
    
    /**
     * Da los dias al ComboBox
     */
    private void getDias()
    {
        ArrayList <String> dias = new ArrayList<>();
        dias.add("--Día--");
        for (int x=0; x<31;x++)
            dias.add(""+(x+1));  
        Dias = new JComboBox(dias.toArray());
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
        Meses = new JComboBox(meses.toArray());
    }
    
    /**
     * Da los años al ComboBox
     */
    private void getAños()
    {
        ArrayList <String> años = new ArrayList<>();
        años.add("--Año--");
        for (int x=2100; x>1899;x--)
            años.add(""+(x));  
        Años = new JComboBox(años.toArray());
    }
    
    private static LocalDate fecha = LocalDate.now();
    private static boolean actualizado=false;
    
    /**
     * Dice si se a viajado o no en el tiempo
     * @return boolean
     */
    public static boolean esActualizado()
    {
        return actualizado;
    }
    
    /**
     * Da la nueva fecha tras el viaje
     * @return LocalDate
     */
    public static LocalDate getFecha()
    {
        actualizado= false;
        return fecha;
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
            java.util.logging.Logger.getLogger(Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Fecha().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Años;
    private javax.swing.JButton CLARO;
    private javax.swing.JComboBox<String> Dias;
    private javax.swing.JComboBox<String> Meses;
    private javax.swing.JButton NO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
