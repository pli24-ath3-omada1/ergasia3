/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package econometrica;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author stamn
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        FetchData_btn = new javax.swing.JButton();
        Country_cmb = new javax.swing.JComboBox<>();
        SelCountry_lbl = new javax.swing.JLabel();
        OIL_lbl = new javax.swing.JLabel();
        GDP_lbl = new javax.swing.JLabel();
        dsname1_lbl = new javax.swing.JLabel();
        dsname2_lbl = new javax.swing.JLabel();
        oilCountry_txt = new javax.swing.JTextField();
        GDPCountry_txt = new javax.swing.JTextField();
        avTS1_lbl = new javax.swing.JLabel();
        avTS2_lbl = new javax.swing.JLabel();
        oilSD_txt = new javax.swing.JTextField();
        oilED_lbl = new javax.swing.JLabel();
        oilED_txt = new javax.swing.JTextField();
        gdpSD_lbl = new javax.swing.JLabel();
        gdpSD_txt = new javax.swing.JTextField();
        gdpED_lbl = new javax.swing.JLabel();
        gdpED_txt = new javax.swing.JTextField();
        jScrollPaneOIL = new javax.swing.JScrollPane();
        jTableOIL = new javax.swing.JTable();
        jScrollPaneGDP = new javax.swing.JScrollPane();
        jTableGDP = new javax.swing.JTable();
        Save_btn = new javax.swing.JButton();
        Plot_btn = new javax.swing.JButton();
        DelAll_btn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        oilSD_lbl = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        FetchData_btn.setText("Fetch Data");
        FetchData_btn.setToolTipText("");

        Country_cmb.setName("Country_cmb"); // NOI18N
        Country_cmb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Country_cmbMouseClicked(evt);
            }
        });

        SelCountry_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SelCountry_lbl.setLabelFor(Country_cmb);
        SelCountry_lbl.setText("Select Country:");
        SelCountry_lbl.setToolTipText("");

        OIL_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OIL_lbl.setText("OIL DATA");
        OIL_lbl.setToolTipText("");

        GDP_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        GDP_lbl.setText("GDP DATA");
        GDP_lbl.setToolTipText("");

        dsname1_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dsname1_lbl.setText("Dataset Name");

        dsname2_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dsname2_lbl.setText("Dataset Name");

        oilCountry_txt.setEditable(false);
        oilCountry_txt.setText("Oil Consumption - ");
        oilCountry_txt.setToolTipText("");
        oilCountry_txt.setBorder(null);

        GDPCountry_txt.setEditable(false);
        GDPCountry_txt.setText("GDP (current LCU) - ");
        GDPCountry_txt.setToolTipText("");
        GDPCountry_txt.setBorder(null);
        GDPCountry_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        avTS1_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avTS1_lbl.setText("Available Timespan:");

        avTS2_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avTS2_lbl.setText("Available Timespan:");
        avTS2_lbl.setToolTipText("");

        oilSD_txt.setEditable(false);
        oilSD_txt.setBorder(null);
        oilSD_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilSD_txtActionPerformed(evt);
            }
        });

        oilED_lbl.setText("End Date:");
        oilED_lbl.setToolTipText("");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, oilED_txt, org.jdesktop.beansbinding.ObjectProperty.create(), oilED_lbl, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        oilED_txt.setEditable(false);
        oilED_txt.setBorder(null);
        oilED_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilED_txtActionPerformed(evt);
            }
        });

        gdpSD_lbl.setText("Start Date:");
        gdpSD_lbl.setToolTipText("");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, gdpSD_txt, org.jdesktop.beansbinding.ObjectProperty.create(), gdpSD_lbl, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        gdpSD_txt.setEditable(false);
        gdpSD_txt.setBorder(null);
        gdpSD_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdpSD_txtActionPerformed(evt);
            }
        });

        gdpED_lbl.setText("End Date:");
        gdpED_lbl.setToolTipText("");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, gdpED_txt, org.jdesktop.beansbinding.ObjectProperty.create(), gdpED_lbl, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        gdpED_txt.setEditable(false);
        gdpED_txt.setBorder(null);
        gdpED_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdpED_txtActionPerformed(evt);
            }
        });

        jTableOIL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPaneOIL.setViewportView(jTableOIL);

        jTableGDP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPaneGDP.setViewportView(jTableGDP);

        Save_btn.setText("Save");
        Save_btn.setToolTipText("");

        Plot_btn.setText("Plot");

        DelAll_btn.setText("DELETE ALL");
        DelAll_btn.setToolTipText("");

        jCheckBox1.setText("Already Saved to Database");
        jCheckBox1.setToolTipText("");

        oilSD_lbl.setText("Start Date:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, oilSD_txt, org.jdesktop.beansbinding.ObjectProperty.create(), oilSD_lbl, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oilED_lbl)
                                    .addComponent(oilSD_lbl))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oilSD_txt)
                                    .addComponent(oilED_txt)))
                            .addComponent(jScrollPaneOIL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(avTS1_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(oilCountry_txt)
                            .addComponent(dsname1_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OIL_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GDPCountry_txt)
                            .addComponent(dsname2_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GDP_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gdpSD_lbl)
                                    .addComponent(gdpED_lbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gdpED_txt)
                                    .addComponent(gdpSD_txt)))
                            .addComponent(avTS2_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jScrollPaneGDP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Save_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Plot_btn)
                                .addGap(18, 18, 18)
                                .addComponent(DelAll_btn))
                            .addComponent(SelCountry_lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Country_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FetchData_btn)))
                        .addGap(0, 61, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(SelCountry_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Country_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FetchData_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OIL_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dsname1_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(oilCountry_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avTS1_lbl)
                            .addComponent(avTS2_lbl))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oilSD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oilSD_lbl)
                            .addComponent(gdpSD_lbl)
                            .addComponent(gdpSD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GDP_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dsname2_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(GDPCountry_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oilED_lbl)
                    .addComponent(oilED_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gdpED_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gdpED_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneOIL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneGDP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Save_btn)
                        .addComponent(Plot_btn)
                        .addComponent(DelAll_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oilSD_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilSD_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oilSD_txtActionPerformed

    private void oilED_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilED_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oilED_txtActionPerformed

    private void gdpSD_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdpSD_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdpSD_txtActionPerformed

    private void gdpED_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdpED_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdpED_txtActionPerformed

    private void Country_cmbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Country_cmbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Country_cmbMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
              
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Country_cmb;
    private javax.swing.JButton DelAll_btn;
    private javax.swing.JButton FetchData_btn;
    private javax.swing.JTextField GDPCountry_txt;
    private javax.swing.JLabel GDP_lbl;
    private javax.swing.JLabel OIL_lbl;
    private javax.swing.JButton Plot_btn;
    private javax.swing.JButton Save_btn;
    private javax.swing.JLabel SelCountry_lbl;
    private javax.swing.JLabel avTS1_lbl;
    private javax.swing.JLabel avTS2_lbl;
    private javax.swing.JLabel dsname1_lbl;
    private javax.swing.JLabel dsname2_lbl;
    private javax.swing.JLabel gdpED_lbl;
    private javax.swing.JTextField gdpED_txt;
    private javax.swing.JLabel gdpSD_lbl;
    private javax.swing.JTextField gdpSD_txt;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneGDP;
    private javax.swing.JScrollPane jScrollPaneOIL;
    private javax.swing.JTable jTableGDP;
    private javax.swing.JTable jTableOIL;
    private javax.swing.JTextField oilCountry_txt;
    private javax.swing.JLabel oilED_lbl;
    private javax.swing.JTextField oilED_txt;
    private javax.swing.JLabel oilSD_lbl;
    private javax.swing.JTextField oilSD_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    
    public void setCountries(ArrayList<String[]> countries){
       for (int i=0;i< countries.size();i++)
        Country_cmb.addItem(Arrays.toString(countries.get(i)).substring(1).split(", ")[0]);
    }
}
