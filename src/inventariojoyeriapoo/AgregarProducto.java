/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventariojoyeriapoo;

/**
 *
 * @author Sara.Reyna
 */
public class AgregarProducto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto() {
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

        FondoMorado = new javax.swing.JPanel();
        TFNombreP = new javax.swing.JTextField();
        LabelNombreP = new javax.swing.JLabel();
        TFLabelPrecioP = new javax.swing.JTextField();
        PrecioP = new javax.swing.JLabel();
        TFStockP = new javax.swing.JTextField();
        StockP = new javax.swing.JLabel();
        BotonAgregarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        JMenuInventario = new javax.swing.JMenu();
        EliminarProductoITem = new javax.swing.JMenuItem();
        JMenuCompra = new javax.swing.JMenu();
        ListaComprasItem = new javax.swing.JMenuItem();
        NuevaCompraItem = new javax.swing.JMenuItem();
        NuevoProductoItem = new javax.swing.JMenuItem();
        JMenuPedidos = new javax.swing.JMenu();
        ListaPedidosItem = new javax.swing.JMenuItem();
        NuevoPedidoItem = new javax.swing.JMenuItem();
        JMenuCerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoMorado.setBackground(new java.awt.Color(194, 196, 242));

        TFNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombrePActionPerformed(evt);
            }
        });

        LabelNombreP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelNombreP.setText("Nombre del producto:");

        TFLabelPrecioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLabelPrecioPActionPerformed(evt);
            }
        });

        PrecioP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrecioP.setText("Precio:");

        TFStockP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFStockPActionPerformed(evt);
            }
        });

        StockP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StockP.setText("Stock:");

        BotonAgregarP.setBackground(new java.awt.Color(113, 118, 217));
        BotonAgregarP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregarP.setText("Agregar");
        BotonAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("AGREGAR NUEVO PRODUCTO ");

        javax.swing.GroupLayout FondoMoradoLayout = new javax.swing.GroupLayout(FondoMorado);
        FondoMorado.setLayout(FondoMoradoLayout);
        FondoMoradoLayout.setHorizontalGroup(
            FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoMoradoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StockP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFLabelPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFStockP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(FondoMoradoLayout.createSequentialGroup()
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoMoradoLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(BotonAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoMoradoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoMoradoLayout.setVerticalGroup(
            FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombreP)
                    .addComponent(TFNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFLabelPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioP))
                .addGap(18, 18, 18)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFStockP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StockP))
                .addGap(39, 39, 39)
                .addComponent(BotonAgregarP)
                .addGap(53, 53, 53))
        );

        JMenuInventario.setText("Inventario");

        EliminarProductoITem.setText("Eliminar Producto");
        EliminarProductoITem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoITemActionPerformed(evt);
            }
        });
        JMenuInventario.add(EliminarProductoITem);

        MenuBar.add(JMenuInventario);

        JMenuCompra.setText("Compra");

        ListaComprasItem.setText("Listas de Compras");
        JMenuCompra.add(ListaComprasItem);

        NuevaCompraItem.setText("Registrar nueva compra");
        NuevaCompraItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaCompraItemActionPerformed(evt);
            }
        });
        JMenuCompra.add(NuevaCompraItem);

        NuevoProductoItem.setText("Agregar nuevo producto");
        NuevoProductoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProductoItemActionPerformed(evt);
            }
        });
        JMenuCompra.add(NuevoProductoItem);

        MenuBar.add(JMenuCompra);

        JMenuPedidos.setText("Pedidos");

        ListaPedidosItem.setText("Lista de pedidos");
        ListaPedidosItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaPedidosItemActionPerformed(evt);
            }
        });
        JMenuPedidos.add(ListaPedidosItem);

        NuevoPedidoItem.setText("Agregar Pedido");
        NuevoPedidoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoPedidoItemActionPerformed(evt);
            }
        });
        JMenuPedidos.add(NuevoPedidoItem);

        MenuBar.add(JMenuPedidos);

        JMenuCerrarSesion.setText("Cerrar Sesion");
        MenuBar.add(JMenuCerrarSesion);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(FondoMorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(FondoMorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarProductoITemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoITemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarProductoITemActionPerformed

    private void NuevaCompraItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaCompraItemActionPerformed
        // TODO add your handling code here:
        RegistrarCompra NewCompra = new RegistrarCompra();
        NewCompra.setVisible(true);
        dispose();
    }//GEN-LAST:event_NuevaCompraItemActionPerformed

    private void ListaPedidosItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaPedidosItemActionPerformed
        // TODO add your handling code here:
        Pedidos PD = new Pedidos();
        PD.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListaPedidosItemActionPerformed

    private void NuevoPedidoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoPedidoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoPedidoItemActionPerformed

    private void TFNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNombrePActionPerformed

    private void TFLabelPrecioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLabelPrecioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLabelPrecioPActionPerformed

    private void TFStockPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFStockPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFStockPActionPerformed

    private void BotonAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregarPActionPerformed

    private void NuevoProductoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductoItemActionPerformed
        // TODO add your handling code here:
        AgregarProducto NewProd = new AgregarProducto();
        NewProd.setVisible(true);
        dispose();
    }//GEN-LAST:event_NuevoProductoItemActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarP;
    private javax.swing.JMenuItem EliminarProductoITem;
    private javax.swing.JPanel FondoMorado;
    private javax.swing.JMenu JMenuCerrarSesion;
    private javax.swing.JMenu JMenuCompra;
    private javax.swing.JMenu JMenuInventario;
    private javax.swing.JMenu JMenuPedidos;
    private javax.swing.JLabel LabelNombreP;
    private javax.swing.JMenuItem ListaComprasItem;
    private javax.swing.JMenuItem ListaPedidosItem;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem NuevaCompraItem;
    private javax.swing.JMenuItem NuevoPedidoItem;
    private javax.swing.JMenuItem NuevoProductoItem;
    private javax.swing.JLabel PrecioP;
    private javax.swing.JLabel StockP;
    private javax.swing.JTextField TFLabelPrecioP;
    private javax.swing.JTextField TFNombreP;
    private javax.swing.JTextField TFStockP;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
