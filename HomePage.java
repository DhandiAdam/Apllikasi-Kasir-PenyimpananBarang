
package projekdhandiadam;

import java.awt.Color;


public class HomePage extends javax.swing.JFrame {

    Color defaultColor,ClickedColor; 
    public HomePage() {
        initComponents();
         defaultColor = new Color(242,242,242);
        ClickedColor = new Color(235,0,0);
        
        Border1.setBackground(defaultColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(defaultColor);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rOUND1 = new projekdhandiadam.ROUND();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradient2 = new projekdhandiadam.Gradient();
        gradient1 = new projekdhandiadam.Gradient();
        jLabel1 = new javax.swing.JLabel();
        Border1 = new projekdhandiadam.ROUND();
        jLabel2 = new javax.swing.JLabel();
        Border2 = new projekdhandiadam.ROUND();
        jLabel5 = new javax.swing.JLabel();
        Border3 = new projekdhandiadam.ROUND();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPanel = new projekdhandiadam.ROUND();
        rOUND2 = new projekdhandiadam.ROUND();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout rOUND1Layout = new javax.swing.GroupLayout(rOUND1);
        rOUND1.setLayout(rOUND1Layout);
        rOUND1Layout.setHorizontalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rOUND1Layout.setVerticalGroup(
            rOUND1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        gradient2.setColorEnd(new java.awt.Color(0, 204, 204));
        gradient2.setColorStart(new java.awt.Color(0, 153, 153));

        gradient1.setColorEnd(new java.awt.Color(0, 255, 255));
        gradient1.setColorStart(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Border1.setBackground(new java.awt.Color(255, 255, 255));
        Border1.setRoundBottomLeft(50);
        Border1.setRoundTopLeft(50);
        Border1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Border1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("HOME");

        javax.swing.GroupLayout Border1Layout = new javax.swing.GroupLayout(Border1);
        Border1.setLayout(Border1Layout);
        Border1Layout.setHorizontalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        Border1Layout.setVerticalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Border2.setRoundBottomLeft(50);
        Border2.setRoundTopLeft(50);
        Border2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Border2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border2MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("KASIR");

        javax.swing.GroupLayout Border2Layout = new javax.swing.GroupLayout(Border2);
        Border2.setLayout(Border2Layout);
        Border2Layout.setHorizontalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(61, 61, 61))
        );
        Border2Layout.setVerticalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Border3.setRoundBottomLeft(50);
        Border3.setRoundTopLeft(50);
        Border3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Border3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Border3MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Produk");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Border3Layout = new javax.swing.GroupLayout(Border3);
        Border3.setLayout(Border3Layout);
        Border3Layout.setHorizontalGroup(
            Border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(56, 56, 56))
        );
        Border3Layout.setVerticalGroup(
            Border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\PROJEKDHANDIADAM\\src\\projekdhandiadam\\Dashop.png")); // NOI18N

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradient1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Border3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Border2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(Border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Border3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        rOUND2.setRoundBottomLeft(35);
        rOUND2.setRoundBottomRight(35);
        rOUND2.setRoundTopLeft(35);
        rOUND2.setRoundTopRight(35);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel4.setText("DASHOP");

        javax.swing.GroupLayout rOUND2Layout = new javax.swing.GroupLayout(rOUND2);
        rOUND2.setLayout(rOUND2Layout);
        rOUND2Layout.setHorizontalGroup(
            rOUND2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rOUND2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        rOUND2Layout.setVerticalGroup(
            rOUND2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rOUND2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout gradient2Layout = new javax.swing.GroupLayout(gradient2);
        gradient2.setLayout(gradient2Layout);
        gradient2Layout.setHorizontalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addComponent(gradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradient2Layout.createSequentialGroup()
                        .addComponent(rOUND2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 314, Short.MAX_VALUE))
                    .addComponent(jDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        gradient2Layout.setVerticalGroup(
            gradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gradient2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rOUND2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(gradient2);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Border3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border3MousePressed
        Border1.setBackground(defaultColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(ClickedColor);
        
    }//GEN-LAST:event_Border3MousePressed

    private void Border2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border2MousePressed
        Border1.setBackground(defaultColor);
        Border2.setBackground(ClickedColor);
        Border3.setBackground(defaultColor);
        
    }//GEN-LAST:event_Border2MousePressed

    private void Border1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border1MousePressed
        Border1.setBackground(ClickedColor);
        Border2.setBackground(defaultColor);
        Border3.setBackground(defaultColor);
        
    }//GEN-LAST:event_Border1MousePressed

    private void Border1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border1MouseClicked
        HOME test = new HOME();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(test).setVisible(true);
    }//GEN-LAST:event_Border1MouseClicked

    private void Border2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border2MouseClicked
        Penjualan1 penjualan = new Penjualan1();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(penjualan).setVisible(true);
    }//GEN-LAST:event_Border2MouseClicked

    private void Border3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Border3MouseClicked
       DataBarang Barang = new DataBarang();
       jDesktopPanel.removeAll();
       jDesktopPanel.add(Barang).setVisible(true);
    }//GEN-LAST:event_Border3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private projekdhandiadam.ROUND Border1;
    private projekdhandiadam.ROUND Border2;
    private projekdhandiadam.ROUND Border3;
    private projekdhandiadam.Gradient gradient1;
    private projekdhandiadam.Gradient gradient2;
    private projekdhandiadam.ROUND jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private projekdhandiadam.ROUND rOUND1;
    private projekdhandiadam.ROUND rOUND2;
    // End of variables declaration//GEN-END:variables
}
