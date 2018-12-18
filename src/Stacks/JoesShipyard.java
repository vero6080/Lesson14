package Stacks;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JoesShipyard extends javax.swing.JFrame {

    JLabel containers[] = new JLabel[10];
    Stack<Container> yard = new Stack();
    ArrayList<Container> out = new ArrayList();
    DefaultListModel outdata;

    public JoesShipyard() {
        initComponents();
        containers[0] = lblcontain0;
        containers[1] = lblcontain1;
        containers[2] = lblcontain2;
        containers[3] = lblcontain3;
        containers[4] = lblcontain4;
        containers[5] = lblcontain5;
        containers[6] = lblcontain6;
        containers[7] = lblcontain7;
        containers[8] = lblcontain8;
        containers[9] = lblcontain9;

        for (JLabel c : containers) {
            yard.push(new Container());
            c.setText(yard.peek().toString());
        }

        outdata = new DefaultListModel();
        outlist.setModel(outdata);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcontain0 = new javax.swing.JLabel();
        lblcontain1 = new javax.swing.JLabel();
        lblcontain2 = new javax.swing.JLabel();
        lblcontain3 = new javax.swing.JLabel();
        lblcontain4 = new javax.swing.JLabel();
        lblcontain5 = new javax.swing.JLabel();
        lblcontain6 = new javax.swing.JLabel();
        lblcontain7 = new javax.swing.JLabel();
        lblcontain8 = new javax.swing.JLabel();
        lblcontain9 = new javax.swing.JLabel();
        btnbook = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outlist = new javax.swing.JList<>();
        btnreturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblcontain0.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain0.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain0.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain0.setText("Testing");
        lblcontain0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain0.setOpaque(true);

        lblcontain1.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain1.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain1.setText("Testing");
        lblcontain1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain1.setOpaque(true);

        lblcontain2.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain2.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain2.setText("Testing");
        lblcontain2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain2.setOpaque(true);

        lblcontain3.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain3.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain3.setText("Testing");
        lblcontain3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain3.setOpaque(true);

        lblcontain4.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain4.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain4.setText("Testing");
        lblcontain4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain4.setOpaque(true);

        lblcontain5.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain5.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain5.setText("Testing");
        lblcontain5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain5.setOpaque(true);

        lblcontain6.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain6.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain6.setText("Testing");
        lblcontain6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain6.setOpaque(true);

        lblcontain7.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain7.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain7.setText("Testing");
        lblcontain7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain7.setOpaque(true);

        lblcontain8.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain8.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain8.setText("Testing");
        lblcontain8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain8.setOpaque(true);

        lblcontain9.setBackground(new java.awt.Color(102, 102, 102));
        lblcontain9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain9.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain9.setText("Testing");
        lblcontain9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        lblcontain9.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontain0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain7, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain8, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblcontain9, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcontain9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcontain0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnbook.setText("Book It");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(outlist);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnreturn.setText("Return Selected Container");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtname)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreturn, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbook)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreturn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
        try {
            if (txtname.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter a name");
            } else {
                Container temp = yard.pop();
                temp.book(txtname.getText());
                out.add(temp);
                outdata.addElement(temp);
                containers[yard.size()].setVisible(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "There are no more containers available");
        }
        txtname.setText("");
    }//GEN-LAST:event_btnbookActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        if (outdata.isEmpty()) {
            JOptionPane.showMessageDialog(this, "There are no more containers to be returned");
        } else {
            try {
                int index = outdata.indexOf(outlist.getSelectedValue());
                Container temp = yard.push(out.remove(index));
                outdata.remove(index);
                temp.unbook();
                containers[yard.size() - 1].setVisible(true);
                containers[yard.size() - 1].setText(yard.peek().toString());
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "Please select a container");
            }
        }
    }//GEN-LAST:event_btnreturnActionPerformed

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
            java.util.logging.Logger.getLogger(JoesShipyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoesShipyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoesShipyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoesShipyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoesShipyard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnreturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcontain0;
    private javax.swing.JLabel lblcontain1;
    private javax.swing.JLabel lblcontain2;
    private javax.swing.JLabel lblcontain3;
    private javax.swing.JLabel lblcontain4;
    private javax.swing.JLabel lblcontain5;
    private javax.swing.JLabel lblcontain6;
    private javax.swing.JLabel lblcontain7;
    private javax.swing.JLabel lblcontain8;
    private javax.swing.JLabel lblcontain9;
    private javax.swing.JList<String> outlist;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
