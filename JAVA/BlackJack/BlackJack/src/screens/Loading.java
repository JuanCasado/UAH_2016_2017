package screens;

import javax.swing.ImageIcon;


public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
        this.setAlwaysOnTop(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("WAIT");
        setIconImage(new ImageIcon(getClass().getResource("/imgages/Icono.png")).getImage() );
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(304, 108));
        setMinimumSize(new java.awt.Dimension(304, 108));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        txt.setBackground(new java.awt.Color(204, 255, 204));
        txt.setToolTipText("");
        txt.setLayout(new java.awt.CardLayout());

        txt1.setBackground(new java.awt.Color(204, 255, 204));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.add(txt1, "card2");

        getContentPane().add(txt);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Cargando...");
        jPanel2.add(jLabel2);

        Bar.setBackground(new java.awt.Color(255, 255, 255));
        Bar.setForeground(new java.awt.Color(102, 255, 0));
        Bar.setToolTipText("");
        Bar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jPanel2.add(Bar);

        getContentPane().add(jPanel2);

        setSize(new java.awt.Dimension(354, 180));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Hace que la barra se mueva
     */
    public void updateBar()
    {
        long z=9999;
        int x;
        this.update(this.getGraphics());
        for (x =0; x<101; x++)
        {

            Bar.setValue(x);
            
            //Da tiempo a que se actualica la UI
            for (long y =1; y<9999999; y++)
            {   
                z*=y;
            }
            
            Bar.update(Bar.getGraphics());

        }
        this.setVisible(false);
        this.dispose();
    }
    
    /**
     * Actualiza el texto y la UI del label
     * @param txt 
     */
    public void settxt1(String txt)
    {
        txt1.setText(txt);
        this.update(this.getGraphics());
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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Loading().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Bar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel txt;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
