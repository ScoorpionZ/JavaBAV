/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author varad
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private boolean valtozas;
    public MainForm() {
        initComponents();
        valtozas=false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRBLapokatFelsorol = new javax.swing.JRadioButton();
        jRBLapokOsszerteke = new javax.swing.JRadioButton();
        jBMentes = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIMentes = new javax.swing.JMenuItem();
        jMIKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRBMIKockaztat = new javax.swing.JRadioButtonMenuItem();
        jRBMINemKockaztat = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BlackJack");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/res/Blackjack-singlehand.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup2.add(jRBLapokatFelsorol);
        jRBLapokatFelsorol.setText("Lapokat felsorol");
        jRBLapokatFelsorol.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valtozik(evt);
            }
        });

        buttonGroup2.add(jRBLapokOsszerteke);
        jRBLapokOsszerteke.setSelected(true);
        jRBLapokOsszerteke.setText("Lapok összértéke");
        jRBLapokOsszerteke.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valtozik(evt);
            }
        });

        jBMentes.setText("Mentés");
        jBMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBLapokOsszerteke)
                            .addComponent(jRBLapokatFelsorol)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jBMentes)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRBLapokatFelsorol)
                .addGap(18, 18, 18)
                .addComponent(jRBLapokOsszerteke)
                .addGap(48, 48, 48)
                .addComponent(jBMentes)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("File");

        jMIMentes.setText("Mentés");
        jMIMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMentesActionPerformed(evt);
            }
        });
        jMenu1.add(jMIMentes);

        jMIKilepes.setText("Kilépés");
        jMIKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIKilepesActionPerformed(evt);
            }
        });
        jMenu1.add(jMIKilepes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Stratégia");

        buttonGroup1.add(jRBMIKockaztat);
        jRBMIKockaztat.setSelected(true);
        jRBMIKockaztat.setText("Kockáztat");
        jMenu2.add(jRBMIKockaztat);

        buttonGroup1.add(jRBMINemKockaztat);
        jRBMINemKockaztat.setText("Nem Kockáztat");
        jMenu2.add(jRBMINemKockaztat);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIKilepesActionPerformed
       kilepes();
    }//GEN-LAST:event_jMIKilepesActionPerformed

    private void jMIMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMentesActionPerformed
        mentes();
    }//GEN-LAST:event_jMIMentesActionPerformed

    private void jBMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMentesActionPerformed
        mentes();
    }//GEN-LAST:event_jBMentesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void valtozik(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valtozik
       valtozas=true;
    }//GEN-LAST:event_valtozik

    public void mentes(){
        JFileChooser jfc=new JFileChooser(new File("."));
        jfc.setDialogTitle("Megnyitás");
        
        FileNameExtensionFilter filterKepek = new FileNameExtensionFilter("*.jpg *.gif", "jpg","gif");
        FileNameExtensionFilter filterText= new FileNameExtensionFilter("*.txt", "txt");
        
        jfc.addChoosableFileFilter(filterKepek);
        jfc.addChoosableFileFilter(filterText);
        
        jfc.setFileFilter(filterKepek);
        int gomb = jfc.showOpenDialog(this);
        if (gomb == JFileChooser.APPROVE_OPTION) {
            String file= jfc.getSelectedFile().getName();
            String eleres=jfc.getSelectedFile().getPath();
            String uzenet= eleres+"\n"+file;
            felugro(uzenet);
        }
    }
    
    public void kilepes(){
        if(valtozas){
            if(felugro("Biztos Kilép?")==JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
        else{
             System.exit(0);
        }
        
    }
    public int felugro(String uzenet){
        Icon ikon= new ImageIcon(this.getClass().getResource("res/ikon.jpg"));
        return JOptionPane.showConfirmDialog(this,uzenet, "Kérdés", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, ikon);
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBMentes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMIKilepes;
    private javax.swing.JMenuItem jMIMentes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBLapokOsszerteke;
    private javax.swing.JRadioButton jRBLapokatFelsorol;
    private javax.swing.JRadioButtonMenuItem jRBMIKockaztat;
    private javax.swing.JRadioButtonMenuItem jRBMINemKockaztat;
    // End of variables declaration//GEN-END:variables
}
