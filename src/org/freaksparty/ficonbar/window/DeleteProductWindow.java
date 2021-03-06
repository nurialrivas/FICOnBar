/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.freaksparty.ficonbar.window;

import FICOnBar.entity.Product;
import FICOnBar.entity.ProductType;
import java.util.List;
import javax.swing.JOptionPane;
import org.freaksparty.ficonbar.util.User;
import org.freaksparty.ficonbar.util.Util;
import org.hibernate.HibernateException;

/**
 *
 * @author Osane
 */
public class DeleteProductWindow extends javax.swing.JDialog {
    
    public boolean cancel = false;
    private int numProductDeleted = 0;
    private List<Product> products = null;

    /**
     * Creates new form AddProductWindow
     */
    public DeleteProductWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtBarcode.setEnabled(false);
        initCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProduct = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        lblBarcode = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        cmbProduct = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblProduct.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblProduct.setText("Producto");

        lblType.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblType.setText("Tipo");

        cmbType.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        lblBarcode.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblBarcode.setText("Cód. Barras");

        txtBarcode.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N

        btnAccept.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnAccept.setText("Eliminar");
        btnAccept.setActionCommand("Eliminar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnCancel.setText("Salir");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        lblTitle.setText("Eliminar Producto");

        cmbProduct.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        cmbProduct.setMaximumRowCount(50);
        cmbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProduct.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBarcode)
                            .addComponent(lblProduct)
                            .addComponent(lblType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarcode)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if(numProductDeleted == 0)
            cancel = true;
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        if(cmbType.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de producto.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if(cmbProduct.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        
        String barcode = txtBarcode.getText().isEmpty() ? null : txtBarcode.getText();
        
        //TODO:Delete by barcode
        try{
            Util.delProductFromDB(products.get(cmbProduct.getSelectedIndex() - 1).getProductId());
            Util.registerLogToDB("Eliminado producto " + products.get(cmbProduct.getSelectedIndex() - 1).getName() + " con ID = " + products.get(cmbProduct.getSelectedIndex() - 1).getProductId(), User.user.getUserId());
        }catch(HibernateException hEx){
            Util.registerLogToDB(hEx.getCause().getMessage(), User.user.getUserId());
            JOptionPane.showMessageDialog(this, "Se ha producido un erro al eliminar, contacte a un administrador.", "Error", JOptionPane.ERROR_MESSAGE);
            if(numProductDeleted == 0)
                cancel = true;
            this.dispose();
        }
        products.remove(cmbProduct.getSelectedIndex() - 1);
        cmbProduct.removeAllItems();
        fillProductCombo();
        numProductDeleted++;
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        cmbProduct.removeAllItems();
        cmbProduct.addItem("-");
        if(cmbType.getSelectedIndex() == 0)
            cmbProduct.setEnabled(false);
        else{
            products = Util.getProductByType(cmbType.getSelectedIndex());
            if(products.size() > 0){
                cmbProduct.setEnabled(true);
                fillProductCombo();
            }
        }
    }//GEN-LAST:event_cmbTypeActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProductWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteProductWindow dialog = new DeleteProductWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cmbProduct;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtBarcode;
    // End of variables declaration//GEN-END:variables

    private void initCombos() {
        List<ProductType> listProductTypes = Util.getProductTypeAll();
        cmbType.removeAllItems();
        cmbType.addItem("-");
        for(ProductType pt:listProductTypes){
            cmbType.addItem(pt.getName());
        }
    }
    private void fillProductCombo(){
        cmbProduct.removeAllItems();
        cmbProduct.addItem("-");        
        for(Product p : products){
            if(p.getProductTypeByComplementOf() == null)
                cmbProduct.addItem(p.getName());
            else
                cmbProduct.addItem(p.getName() + " (Compl)");
        }        
    }
}
