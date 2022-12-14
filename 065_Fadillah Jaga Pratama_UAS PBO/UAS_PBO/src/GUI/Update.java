/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author 
 */
import controllers.ControllerDVD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Update extends javax.swing.JFrame {
    private int id;
    private String[] data;
    ControllerDVD DVD;

    /**
     * Creates new form Tambah
     */
    public Update(int id) throws ClassNotFoundException, SQLException {
        this.id = id;
        DVD = new ControllerDVD();
        try {
            data = DVD.getById(id);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        formNama.setText(data[1]);
        formKategori.setText(data[2]);
        formHarga.setText(data[3]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formNama = new javax.swing.JTextField();
        formKategori = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formHarga = new javax.swing.JTextField();
        upData = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 108, 80));
        jPanel1.setLayout(null);

        formNama.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNamaActionPerformed(evt);
            }
        });
        jPanel1.add(formNama);
        formNama.setBounds(256, 108, 144, 22);

        formKategori.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formKategoriActionPerformed(evt);
            }
        });
        jPanel1.add(formKategori);
        formKategori.setBounds(256, 148, 144, 22);

        jLabel1.setFont(new java.awt.Font("Organ Farmer Demo", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update DVD");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 48, 138, 32);

        formHarga.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formHargaActionPerformed(evt);
            }
        });
        jPanel1.add(formHarga);
        formHarga.setBounds(256, 191, 144, 22);

        upData.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        upData.setText("Ubah");
        upData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upDataMouseEntered(evt);
            }
        });
        upData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upDataActionPerformed(evt);
            }
        });
        jPanel1.add(upData);
        upData.setBounds(68, 253, 92, 23);

        cancel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(287, 253, 92, 23);

        jLabel2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Masukkan Judul DVD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(57, 111, 120, 16);

        jLabel3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Masukkan Kategori");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(59, 151, 110, 16);

        jLabel4.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Masukkan Harga");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(59, 194, 100, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Unknown\\Downloads\\gui5 (3).jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 460, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNamaActionPerformed
 
    }//GEN-LAST:event_formNamaActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void formKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKategoriActionPerformed

    private void formHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formHargaActionPerformed

    private void upDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upDataActionPerformed

    private void upDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_upDataMouseEntered

    private void upDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upDataMouseClicked

            String hb = formNama.getText();
            String jb = formKategori.getText();
            int kb = Integer.parseInt(formHarga.getText());
            
            
            
            
           
        try {
            new Update(id).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
               
           
        try {
            DVD.update(id, hb, jb, kb);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            new Menu().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_upDataMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        try {
            new Menu().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formHarga;
    private javax.swing.JTextField formKategori;
    private javax.swing.JTextField formNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton upData;
    // End of variables declaration//GEN-END:variables
}
