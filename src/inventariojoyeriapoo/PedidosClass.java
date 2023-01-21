/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariojoyeriapoo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Sara.Reyna
 * Eda Nolasco
 * Nohemi Ramos
 */
public class PedidosClass extends DefaultTableCellRenderer {
private Component componente;

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        if (table.getValueAt(row, 5).equals(1)) {
            componente.setBackground(Color.green);
            componente.setForeground(Color.BLACK);
        }else{
            componente.setBackground(Color.white);
            componente.setForeground(Color.BLACK);
        }
              
        return componente;
    }
    
    
    /*  public int ID_Pe;
    public String Nom_Client;
    //si ya no vamos a manejar distintos productos entonces quito el arreglo?
    public int ID_Pr;
    public int Cantidad;
    //public DATE Fecha;
    public void AgregarPedido(){
        
    }
    public void CompletarPedido(){
        
    }
    public void CancelarPedido(){
        
    }*/
 }