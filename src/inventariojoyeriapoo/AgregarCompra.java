/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventariojoyeriapoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sara.Reyna
 */
public class AgregarCompra extends javax.swing.JFrame {

    /**
     * Creates new form AgregarCompra
     */
    public AgregarCompra() {
        this.setLocationRelativeTo(null);
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
        TFNombreC = new javax.swing.JTextField();
        LabelNombreC = new javax.swing.JLabel();
        TFIDProducto = new javax.swing.JTextField();
        IDPrLabel = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        LabelPrincipal = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        JTCantidad = new javax.swing.JTextField();
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
        setResizable(false);

        FondoMorado.setBackground(new java.awt.Color(194, 196, 242));

        TFNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombreCActionPerformed(evt);
            }
        });

        LabelNombreC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelNombreC.setText("Nombre del cliente:");

        TFIDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDProductoActionPerformed(evt);
            }
        });

        IDPrLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDPrLabel.setText("ID del Producto");

        BotonAgregar.setBackground(new java.awt.Color(113, 118, 217));
        BotonAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        LabelPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelPrincipal.setText("AGREGAR PEDIDO");

        LabelCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelCantidad.setText("Cantidad");

        JTCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoMoradoLayout = new javax.swing.GroupLayout(FondoMorado);
        FondoMorado.setLayout(FondoMoradoLayout);
        FondoMoradoLayout.setHorizontalGroup(
            FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoMoradoLayout.createSequentialGroup()
                        .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelNombreC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDPrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFIDProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNombreC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                                .addComponent(LabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)))))
                .addGap(53, 53, 53))
        );
        FondoMoradoLayout.setVerticalGroup(
            FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(LabelPrincipal)
                .addGap(29, 29, 29)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNombreC))
                .addGap(18, 18, 18)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDPrLabel))
                .addGap(18, 18, 18)
                .addGroup(FondoMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoMoradoLayout.createSequentialGroup()
                        .addComponent(LabelCantidad)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMoradoLayout.createSequentialGroup()
                        .addComponent(JTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BotonAgregar)
                        .addGap(37, 37, 37))))
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
        ListaComprasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaComprasItemActionPerformed(evt);
            }
        });
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
        JMenuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuCerrarSesionMouseClicked(evt);
            }
        });
        JMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCerrarSesionActionPerformed(evt);
            }
        });
        MenuBar.add(JMenuCerrarSesion);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(FondoMorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(FondoMorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void NuevoProductoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductoItemActionPerformed
        // TODO add your handling code here:
        AgregarProducto NewProd = new AgregarProducto();
        NewProd.setVisible(true);
        dispose();
    }//GEN-LAST:event_NuevoProductoItemActionPerformed

    private void ListaPedidosItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaPedidosItemActionPerformed
        // TODO add your handling code here:
        Pedidos PD = new Pedidos();
        PD.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListaPedidosItemActionPerformed

    private void NuevoPedidoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoPedidoItemActionPerformed
        // TODO add your handling code here:
        AgregarCompra AP = new AgregarCompra();
        AP.setVisible(true);
        dispose();
    }//GEN-LAST:event_NuevoPedidoItemActionPerformed

    private void JMenuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuCerrarSesionMouseClicked
        // TODO add your handling code here:
        InicioSesion IS = new InicioSesion();
        IS.setVisible(true);
        dispose();
    }//GEN-LAST:event_JMenuCerrarSesionMouseClicked

    private void JMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCerrarSesionActionPerformed
        // TODO add your handling code here:

        InicioSesion IS = new InicioSesion();
        IS.setVisible(true);
        dispose();
    }//GEN-LAST:event_JMenuCerrarSesionActionPerformed

    private void TFNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNombreCActionPerformed

    private void TFIDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFIDProductoActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        String nombre = TFNombreC.getText();
        int IDProducto = Integer.parseInt( TFIDProducto.getText());
        int Cantidad = Integer.parseInt(JTCantidad.getText());
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
     
        PreparedStatement ps;
        //ResultSet rs;
        //ResultSetMetaData rsmd;
        
        try{
            String url = "jdbc:mysql://localhost:3306/inventario_joyeria";
            String username = "root";
            String password = "Lechedefresa";
            /*String username = "root";
            String password = "$usanA198";*/
            
            Connection connection = DriverManager.getConnection(url,username,password);
            ps= connection.prepareStatement("INSERT INTO pedidos (nom_client, id_pr,cantidad, fecha) VALUES (?, ?, ?, ?)");
            
            ps.setString(1, nombre);
            ps.setInt(2, IDProducto);
            ps.setInt(3, Cantidad);
            ps.setString(4, timeStamp);
            ps.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Registro guardado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void JTCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCantidadActionPerformed

    private void ListaComprasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaComprasItemActionPerformed
        // TODO add your handling code here:
        CompraInterfaz CI = new CompraInterfaz();
        CI.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListaComprasItemActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JMenuItem EliminarProductoITem;
    private javax.swing.JPanel FondoMorado;
    private javax.swing.JLabel IDPrLabel;
    private javax.swing.JMenu JMenuCerrarSesion;
    private javax.swing.JMenu JMenuCompra;
    private javax.swing.JMenu JMenuInventario;
    private javax.swing.JMenu JMenuPedidos;
    private javax.swing.JTextField JTCantidad;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelNombreC;
    private javax.swing.JLabel LabelPrincipal;
    private javax.swing.JMenuItem ListaComprasItem;
    private javax.swing.JMenuItem ListaPedidosItem;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem NuevaCompraItem;
    private javax.swing.JMenuItem NuevoPedidoItem;
    private javax.swing.JMenuItem NuevoProductoItem;
    private javax.swing.JTextField TFIDProducto;
    private javax.swing.JTextField TFNombreC;
    // End of variables declaration//GEN-END:variables
}
