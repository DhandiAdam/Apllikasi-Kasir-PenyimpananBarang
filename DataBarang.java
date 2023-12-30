package projekdhandiadam;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataBarang extends javax.swing.JInternalFrame {
 Koneksi koneksi = new Koneksi();
    
    private DefaultTableModel model;

    private void autonumber(){
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM barang ORDER BY ID_Barang DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Barang").substring(2);
                String BR = "" +(Integer.parseInt(NoFaktur)+1);
                String Nol = "";
                
                if (BR.length()==1) 
                    {Nol = "00";}
                else if(BR.length()==2)
                    {Nol = "0";}
                else if(BR.length()==3)
                    {Nol = "";}
                
                BorderIdBarang.setText("BR" + Nol + BR);  
            }else{
                BorderIdBarang.setText("BR001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("autonumber error");
        }
    }
    
    public void clear(){
        BorderNamaBarang.setText("");
        BorderBeli.setText("");
        BorderJual.setText("");
        BorderStok.setText("");
    }
    
    public void loadData(){
        model.getDataVector().removeAllElements();
        
        model.fireTableDataChanged();
        
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM barang";
            ResultSet r = s.executeQuery(sql);
            
            while (r.next()) {
                Object[] o = new Object[8];
                o [0] = r.getString("ID_Barang");
                o [1] = r.getString("Nama_Barang");
                o [2] = r.getString("Jenis");
                o [3] = r.getString("Ukuran");
                o [4] = r.getString("Gender");
                o [5] = r.getString("HargaBeli");
                o [6] = r.getString("HargaJual");
                o [7] = r.getString("Stok");
                
                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("terjadi kesalahan");
        }
    }
    
    public void cariData(){
        DefaultTableModel tabel = new DefaultTableModel();
        
        tabel.addColumn("ID Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Jenis");
        tabel.addColumn("Ukuran");
        tabel.addColumn("Gender");
        tabel.addColumn("HargaBeli");
        tabel.addColumn("HargaJual");
        tabel.addColumn("Stok");
        
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "Select * from barang where ID_Barang like '%" + jTextField7.getText() + "%'" +
                    "or Nama_Barang like '%" + jTextField7.getText() + "%'";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {                
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                });
            }
            jTable1.setModel(tabel);
            loadData();
        } catch (Exception e) {
            System.out.println("Cari Data Error");
        }finally{
        }
    }
    
    public DataBarang() {
    initComponents();
      
        
        model = new DefaultTableModel();
        
        jTable1.setModel(model);
        
        model.addColumn("ID_Barang");
        model.addColumn("Nama_Barang");
        model.addColumn("Jenis");
        model.addColumn("Ukuran");
        model.addColumn("Gender");
        model.addColumn("HargaBeli");
        model.addColumn("HargaJual");
        model.addColumn("Stok");
        
        loadData();
        autonumber();
        BorderEdit.setEnabled(false);
        BorderHapus.setEnabled(false);
        BorderBatal.setEnabled(false);
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradient1 = new projekdhandiadam.Gradient();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BorderStok = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BorderJual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BorderBeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BorderNamaBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BorderIdBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BorderJenis = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        BorderUkuran = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        BorderGender = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BorderSimpan = new javax.swing.JButton();
        BorderEdit = new javax.swing.JButton();
        BorderHapus = new javax.swing.JButton();
        BorderBatal = new javax.swing.JButton();

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        gradient1.setColorEnd(new java.awt.Color(0, 153, 153));
        gradient1.setColorStart(new java.awt.Color(0, 204, 51));
        gradient1.setPreferredSize(new java.awt.Dimension(1006, 1000));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Cari Data");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Stok");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Harga Jual");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Harga Beli");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Jenis Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID Barang");

        BorderJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jacket", "Baju", "Kemeja" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Ukuran");

        BorderUkuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "L", "M", "XL", "XLL", "XXL" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("GENDER");

        BorderGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BorderNamaBarang)
                    .addComponent(BorderIdBarang)
                    .addComponent(BorderJenis, 0, 188, Short.MAX_VALUE)
                    .addComponent(BorderUkuran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BorderJual)
                    .addComponent(BorderBeli)
                    .addComponent(BorderStok, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(BorderGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(BorderIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BorderNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorderJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(BorderUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BorderGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BorderBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(BorderJual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BorderStok, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(3, 3, 3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        BorderSimpan.setText("Simpan");
        BorderSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderSimpanActionPerformed(evt);
            }
        });

        BorderEdit.setText("Edit");
        BorderEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderEditActionPerformed(evt);
            }
        });

        BorderHapus.setText("Hapus");
        BorderHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderHapusActionPerformed(evt);
            }
        });

        BorderBatal.setText("Batal");
        BorderBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient1Layout.createSequentialGroup()
                        .addComponent(BorderSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BorderEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BorderHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BorderBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jTextField7))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BorderBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(BorderSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorderEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorderHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(gradient1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorderEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderEditActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if (i == -1) {
            return;
        }
        String id = (String) model.getValueAt(i, 0);
        String nama = BorderNamaBarang.getText();
        String jenis = (String)BorderJenis.getSelectedItem();
        String ukuran = (String)BorderUkuran.getSelectedItem();
        String Gender = (String)BorderGender.getSelectedItem();
        String hargaBeli = BorderBeli.getText();
        String hargaJual = BorderJual.getText();
        String stok = BorderStok.getText();
        
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "UPDATE barang SET Nama_Barang = ?, Jenis = ?, Ukuran = ?, Gender = ?, HargaBeli = ?, HargaJual = ?, Stok = ? WHERE ID_Barang = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, nama);
            p.setString(2, jenis);
            p.setString(3, ukuran);
            p.setString(4, Gender);
            p.setString(5, hargaBeli);
            p.setString(6, hargaJual);
            p.setString(7, stok);
            p.setString(8, id);
            
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Terubah");
            BorderSimpan.setEnabled(true);
            BorderEdit.setEnabled(false);
            BorderHapus.setEnabled(false);
            BorderBatal.setEnabled(false);
            clear();
        } catch (Exception e) {
            System.out.println("update error");
        }finally{
            loadData();
            autonumber();
        }
    }//GEN-LAST:event_BorderEditActionPerformed

    private void BorderHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderHapusActionPerformed
        // TODO add your handling code here:
         int i = jTable1.getSelectedRow();
        if (i == -1) {
            return;
        }
        
        String id = (String) model.getValueAt(i, 0);
        
        int pernyataan = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus","Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pernyataan== JOptionPane.OK_OPTION) {
            try {
                Connection c = koneksi.getKoneksi();
                String sql = "DELETE FROM barang WHERE ID_Barang = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            } catch (Exception e) {
                System.out.println("Terjadi Kesalahan");
            }finally{
                BorderSimpan.setEnabled(true);
                BorderEdit.setEnabled(false);
                BorderHapus.setEnabled(false);
                BorderBatal.setEnabled(false);
                loadData();
                autonumber();
                clear();
            }
        }
        if (pernyataan== JOptionPane.CANCEL_OPTION) {
            
        }
    }//GEN-LAST:event_BorderHapusActionPerformed

    private void BorderSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderSimpanActionPerformed
        // TODO add your handling code here:
        String id = BorderIdBarang.getText();
        String nama = BorderNamaBarang.getText();
        String jenis = (String)BorderJenis.getSelectedItem();
        String ukuran = (String)BorderUkuran.getSelectedItem();
        String Gender = (String)BorderGender.getSelectedItem();
        String hargaBeli = BorderBeli.getText();
        String hargaJual = BorderJual.getText();
        String stok = BorderStok.getText();
        
        try {
            Connection c = koneksi.getKoneksi();
            String sql = "INSERT INTO BARANG VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, id);
            p.setString(2, nama);
            p.setString(3, jenis);
            p.setString(4, ukuran);
            p.setString(5, Gender);
            p.setString(6, hargaBeli);
            p.setString(7, hargaJual);
            p.setString(8, stok);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            loadData();
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan");
        }finally{
            autonumber();
            clear();
        }
    }//GEN-LAST:event_BorderSimpanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        BorderSimpan.setEnabled(false);
        BorderEdit.setEnabled(true);
        BorderHapus.setEnabled(true);
        BorderBatal.setEnabled(true);
        
        int i = jTable1.getSelectedRow();
        if (i == -1) {
            return;
        }
        
        String id = (String) model.getValueAt(i, 0);
        String nama = (String) model.getValueAt(i, 1);
        String jenis = (String) model.getValueAt(i, 2);
        String ukuran = (String) model.getValueAt(i, 3);
        String Gender = (String) model.getValueAt(i, 4);
        String hargaBeli = (String) model.getValueAt(i, 5);
        String hargaJual = (String) model.getValueAt(i, 6);
        String stok = (String) model.getValueAt(i, 7);
        
        BorderIdBarang.setText(id);
        BorderNamaBarang.setText(nama);
        BorderJenis.setSelectedItem(jenis);
        BorderUkuran.setSelectedItem(ukuran);
        BorderGender.setSelectedItem(Gender);
        BorderBeli.setText(hargaBeli);
        BorderJual.setText(hargaJual);
        BorderStok.setText(stok);
    }//GEN-LAST:event_jTable1MouseClicked

    private void BorderBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderBatalActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        clear();
        loadData();
        BorderSimpan.setEnabled(true);
        BorderEdit.setEnabled(false);
        BorderHapus.setEnabled(false);
        BorderBatal.setEnabled(false);
        autonumber();
    }//GEN-LAST:event_BorderBatalActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
         cariData();
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        cariData();
    }//GEN-LAST:event_jTextField7KeyTyped

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
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorderBatal;
    private javax.swing.JTextField BorderBeli;
    private javax.swing.JButton BorderEdit;
    private javax.swing.JComboBox<String> BorderGender;
    private javax.swing.JButton BorderHapus;
    private javax.swing.JTextField BorderIdBarang;
    private javax.swing.JComboBox<String> BorderJenis;
    private javax.swing.JTextField BorderJual;
    private javax.swing.JTextField BorderNamaBarang;
    private javax.swing.JButton BorderSimpan;
    private javax.swing.JTextField BorderStok;
    private javax.swing.JComboBox<String> BorderUkuran;
    private projekdhandiadam.Gradient gradient1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    
}
