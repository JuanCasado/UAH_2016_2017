/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import classes.CasaDeApuestas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ver extends javax.swing.JFrame {

    /**
     * Creates new form Ver
     */
    public Ver() {
        initComponents();
        
        //Muestra La Contabilidad General
        try
        {
            CasaDeApuestas.generarRegistro();
            String cadena;
            FileReader f = new FileReader("./src/RegistroMaster/Registro.txt");
            try (BufferedReader b = new BufferedReader(f)) 
            {
                while((cadena = b.readLine())!=null) 
                {
                    txt1.setText(txt1.getText()+"\n"+cadena);
                }
            }
            
        }
        catch(IOException e)
        {
            Warnning w = new Warnning();
            w.setTextoW("Error al leer archivo de registro");
            w.setVisible(true);
        }
        
        //Recoge los archivos de la Contabilidad asociada a cada jugador
        String listado[]= new File("./src/RegistroJugadores").list();
        
        for (int x=0; x<listado.length;x++)
        {
            if(listado[x].charAt(0)=='.')
                listado[x]="";
        }
        
        List.setListData(listado);
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
        jPanel4 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Jugadores");
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgages/Flecha.jpg"))); // NOI18N
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel4.add(volver, new java.awt.GridBagConstraints());

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Jugadores  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel4.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(jPanel4, gridBagConstraints);

        tab.setBackground(new java.awt.Color(204, 255, 204));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new java.awt.CardLayout());

        txt1.setEditable(false);
        txt1.setColumns(20);
        txt1.setRows(5);
        txt1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jScrollPane1.setViewportView(txt1);

        jPanel5.add(jScrollPane1, "card2");

        tab.addTab("Listado", jPanel5);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.CardLayout());

        List.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        jPanel2.add(jScrollPane2, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jPanel2, gridBagConstraints);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setToolTipText("");

        txt2.setEditable(false);
        txt2.setColumns(20);
        txt2.setRows(5);
        jScrollPane4.setViewportView(txt2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jScrollPane4, gridBagConstraints);

        tab.addTab("Detalles", jPanel3);

        tab.setSelectedIndex(0);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(tab, gridBagConstraints);
        tab.getAccessibleContext().setAccessibleName("tab");

        getContentPane().add(jPanel1, "card2");

        setSize(new java.awt.Dimension(700, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre el JFrame Dentro
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Dentro d = new Dentro();
        d.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    /**
     * Muestra la contabilidad de un jugador en concreto
     */
    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        try
        {
            txt2.setText("");
            String cadena;
            FileReader f = new FileReader("./src/RegistroJugadores/"+List.getSelectedValue());
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
    }//GEN-LAST:event_ListValueChanged

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
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ver().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextArea txt2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}