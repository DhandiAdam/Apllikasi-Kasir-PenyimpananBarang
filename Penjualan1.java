package projekdhandiadam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Penjualan1 extends javax.swing.JInternalFrame {

    Color defaultColor, ClickedColor;

    String Tanggal;
    private DefaultTableModel model;

    public void totalBiaya() {
        int jumlahBaris = jTable1.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(jTable1.getValueAt(i, 5).toString());
            hargaBarang = Integer.parseInt(jTable1.getValueAt(i, 6).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        borderTotal.setText(String.valueOf(totalBiaya));
        txtTampil.setText("Rp " + totalBiaya + ",00");
    }

    private void autonumber() {

        try {

            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM kasirteknik ORDER BY NoFaktur DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("NoFaktur").substring(2);
                String TR = "" + (Integer.parseInt(NoFaktur) + 1);
                String Nol = "";

                if (TR.length() == 1) {
                    Nol = "000";
                } else if (TR.length() == 2) {
                    Nol = "00";
                } else if (TR.length() == 3) {
                    Nol = "0";
                } else if (TR.length() == 4) {
                    Nol = "";
                }
                BorderTransaksi.setText("TR" + Nol + TR);
            } else {

                BorderTransaksi.setText("TR0001");
            }
            r.close();
            s.close();

        } catch (Exception e) {
            System.out.println("AutoNumber Eror");

        }

    }

    public void PengisianData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            BorderTransaksi.getText(),
            BorderID.getText(),
            Mahasiswa.getText(),
            Npm.getText(),
            BorderBarang.getText(),
            BorderJumlah.getText(),
            BorderHarga.getText(),
            borderTotal.getText()

        });

    }

    public void kosong() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);

        }

    }

    public void utama() {
        BorderTransaksi.setText("");
        BorderID.setText("");
        Mahasiswa.setText("");
        Npm.setText("");
        BorderBarang.setText("");
        BorderHarga.setText("");
        BorderJumlah.setText("");
        autonumber();
    }

    public void clear() {

  
        BorderNama.setText("");
        borderTotal.setText("0");
        borderBayar.setText("0");
        borderKembalian.setText("0");
        txtTampil.setText("0");

    }

    public void clear2() {
        BorderID.setText("");
        Mahasiswa.setText("");
        Npm.setText("");
        BorderBarang.setText("");
        BorderHarga.setText("");
        BorderJumlah.setText("");

    }

    public void Transaksi() {
        int jumlah, harga, total;

        jumlah = Integer.valueOf(BorderJumlah.getText());
        harga = Integer.valueOf(BorderHarga.getText());
        total = jumlah * harga;

        borderTotal.setText(String.valueOf(total));

        PengisianData();
        totalBiaya();
        clear2();
        BorderID.requestFocus();

    }

    public Penjualan1() {
        initComponents();

        //Button Clicked Background
        defaultColor = new Color(242, 242, 242);
        ClickedColor = new Color(204, 255, 204);

        BorderID.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);

        model = new DefaultTableModel();
        jTable1.setModel(model);

        model.addColumn("No Transaksi");
        model.addColumn("ID Barang");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Npm");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Harga");
        model.addColumn("Total");

        utama();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        BorderTanggal.setText(currentDate.format(formatter));
        borderTotal.setText("0");
        borderBayar.setText("0");
        borderKembalian.setText("0");
        BorderCustomer.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        rOUND1 = new projekdhandiadam.ROUND();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BorderTransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BorderCustomer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BorderNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BorderTanggal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BorderBarang = new javax.swing.JTextField();
        BorderID = new javax.swing.JTextField();
        BorderHarga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BorderJumlah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        txtTampil = new javax.swing.JTextField();
        BorderTotalBayar = new javax.swing.JLabel();
        borderTotal = new javax.swing.JTextField();
        borderBayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        borderKembalian = new javax.swing.JTextField();
        Mahasiswa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Npm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        rOUND1.setBackground(new java.awt.Color(102, 153, 255));
        rOUND1.setRoundBottomLeft(25);
        rOUND1.setRoundBottomRight(25);
        rOUND1.setRoundTopLeft(25);
        rOUND1.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        jLabel1.setText("PENJUALAN");

        javax.swing.GroupLayout rOUND1Layout = new javax.swing.GroupLayout(rOUND1);
        rOUND1.setLayout(rOUND1Layout);
        rOUND1Layout.setHorizontalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rOUND1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340))
        );
        rOUND1Layout.setVerticalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Nama Barang");

        BorderTransaksi.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("ID Customer");

        BorderCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderCustomerMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Nama Customer");

        BorderNama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderNamaMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Tanggal");

        BorderTanggal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderTanggal.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("No.Transaksi");

        BorderBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderBarangMousePressed(evt);
            }
        });
        BorderBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderBarangActionPerformed(evt);
            }
        });

        BorderID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderIDMousePressed(evt);
            }
        });

        BorderHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderHarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderHargaMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("Harga");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Jumlah");

        BorderJumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorderJumlahMousePressed(evt);
            }
        });
        BorderJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderJumlahActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("ID Barang");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdBarang", "NamaBarang", "Harga", "Jumlah"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane3.setViewportView(jTable1);

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusMousePressed(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTambahMousePressed(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtTampil.setBackground(new java.awt.Color(255, 51, 51));
        txtTampil.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtTampil.setText("RP. 0");
        txtTampil.setEnabled(false);

        BorderTotalBayar.setText("Total Bayar");

        borderTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borderTotal.setEnabled(false);

        borderBayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borderBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borderBayarMousePressed(evt);
            }
        });
        borderBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderBayarActionPerformed(evt);
            }
        });

        jLabel11.setText("Bayar");

        jLabel12.setText("Kembalian");

        borderKembalian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borderKembalian.setEnabled(false);

        Mahasiswa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MahasiswaMousePressed(evt);
            }
        });
        Mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MahasiswaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Nama Mahasiswa");

        Npm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Npm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NpmMousePressed(evt);
            }
        });
        Npm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NpmActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Npm");

        btnCari.setText("Cari Barang");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rOUND1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BorderCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BorderNama, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BorderTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BorderTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(borderBayar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BorderTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(borderTotal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(borderKembalian)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus)
                            .addComponent(btnTambah))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(BorderID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Npm, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BorderBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BorderHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BorderJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rOUND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BorderTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BorderTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorderCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorderNama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnCari)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BorderID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Npm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BorderBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BorderTotalBayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borderBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borderKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BorderHarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorderJumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1112, 755));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed

        // TODO add your handling code here:
        ListBarang2 L = new ListBarang2();
        L.setVisible(true);
    }//GEN-LAST:event_btnCariActionPerformed

    private void NpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NpmActionPerformed

    private void NpmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NpmMousePressed
       BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(ClickedColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_NpmMousePressed

    private void MahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MahasiswaActionPerformed

    private void MahasiswaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MahasiswaMousePressed
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(ClickedColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_MahasiswaMousePressed

    private void borderBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderBayarActionPerformed

        int total, bayar, kembalian;

        total = Integer.valueOf(borderTotal.getText());
        bayar = Integer.valueOf(borderBayar.getText());

        if (total > bayar) {
            JOptionPane.showMessageDialog(null, "Uang tidak cukup untuk melakukan pembayaran");
        } else {
            kembalian = bayar - total;
            borderKembalian.setText(String.valueOf(kembalian));
        }
    }//GEN-LAST:event_borderBayarActionPerformed

    private void borderBayarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderBayarMousePressed
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(ClickedColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_borderBayarMousePressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String noTransaksi = BorderTransaksi.getText();
        String noTanggal = BorderTanggal.getText();
        String Customer = BorderCustomer.getText();
        String Total = BorderTotalBayar.getText();

        try {
            Connection c = Koneksi.getKoneksi();
            String sql = "INSERT INTO kasirteknik VALUES (?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);

            p.setString(1, noTransaksi);
            p.setString(2, noTanggal);
            p.setString(3, Customer);
            p.setString(4, Total);
            p.executeUpdate();
            p.close();

        } catch (Exception e) {
            System.out.println("Simpan Penjualan Eror");
        }

        try {
            Connection c = Koneksi.getKoneksi();
            int baris = jTable1.getRowCount();

            for (int i = 0; i < baris; i++) {
                String sql = "INSERT INTO pelanggankampus (NoFaktur, ID_Barang, Nama_Mahasiswa,Npm,Nama_Barang, Jumlah, Harga, Total) VALUES ('"
                + jTable1.getValueAt(i, 0) + "','" + jTable1.getValueAt(i, 1) + "','" + jTable1.getValueAt(i, 2) + "','"
                + jTable1.getValueAt(i, 3) + "','" + jTable1.getValueAt(i, 4) + "','" + jTable1.getValueAt(i, 5) + "','" +
                jTable1.getValueAt(i, 6)+ "','" + jTable1.getValueAt(i, 7)+ "')";

                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate();
                p.close();
            }

        } catch (Exception e) {
            System.out.println("Sistem Penjualan Rinci Eror");
        }
        clear();
        utama();
        autonumber();
        kosong();
        txtTampil.setText("RP 0");
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Transaksi();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnTambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMousePressed
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(ClickedColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_btnTambahMousePressed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        model.removeRow(row);
        totalBiaya();
        borderBayar.setText("0");
        borderKembalian.setText("0");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void BorderJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderJumlahActionPerformed
        Transaksi();
    }//GEN-LAST:event_BorderJumlahActionPerformed

    private void BorderJumlahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderJumlahMousePressed
         BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(ClickedColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_BorderJumlahMousePressed

    private void BorderHargaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderHargaMousePressed
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(ClickedColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_BorderHargaMousePressed

    private void BorderIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderIDMousePressed
       BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(ClickedColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_BorderIDMousePressed

    private void BorderBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorderBarangActionPerformed

    private void BorderBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderBarangMousePressed
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(ClickedColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_BorderBarangMousePressed

    private void BorderNamaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderNamaMousePressed
       BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(ClickedColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_BorderNamaMousePressed

    private void BorderCustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorderCustomerMousePressed
       BorderCustomer.setBackground(ClickedColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(defaultColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_BorderCustomerMousePressed

    private void btnHapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMousePressed
        // TODO add your handling code here:
        BorderCustomer.setBackground(defaultColor);
        BorderNama.setBackground(defaultColor);
        BorderID.setBackground(defaultColor);
        Mahasiswa.setBackground(defaultColor);
        Npm.setBackground(defaultColor);
        BorderBarang.setBackground(defaultColor);
        BorderHarga.setBackground(defaultColor);
        BorderJumlah.setBackground(defaultColor);
        btnTambah.setBackground(defaultColor);
        btnHapus.setBackground(ClickedColor);
        borderBayar.setBackground(defaultColor);
    }//GEN-LAST:event_btnHapusMousePressed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField BorderBarang;
    private javax.swing.JTextField BorderCustomer;
    public static javax.swing.JTextField BorderHarga;
    public static javax.swing.JTextField BorderID;
    private javax.swing.JTextField BorderJumlah;
    private javax.swing.JTextField BorderNama;
    private javax.swing.JTextField BorderTanggal;
    private javax.swing.JLabel BorderTotalBayar;
    private javax.swing.JTextField BorderTransaksi;
    private javax.swing.JTextField Mahasiswa;
    private javax.swing.JTextField Npm;
    private javax.swing.JTextField borderBayar;
    private javax.swing.JTextField borderKembalian;
    private javax.swing.JTextField borderTotal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private projekdhandiadam.ROUND rOUND1;
    private javax.swing.JTextField txtTampil;
    // End of variables declaration//GEN-END:variables
}
