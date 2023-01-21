/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariojoyeriapoo;
 import javax.swing.JOptionPane;
/**
 *  Sara.Reyna
 * Eda Nolasco
 * Nohemi Ramos
 */
public class Usuario {
        //atributos
        public String Usuario = "Admin";
        protected String Contra = "gatoBizco";
        
        //Constructor 
        public Usuario(){
            /*this.Usuario=Usuario;
            this.Contra = Contra;*/
        }
        //metodo para comparar e iniciar sesion 
        InicioSesion IS = new InicioSesion();
        Inventario IN = new Inventario();
        public void InicioSesion(String u, String psw){
            if(u.equals(Usuario) && psw.equals(Contra)){
                IN.setVisible(true);
                IS.dispose();
            }else{
                JOptionPane.showMessageDialog(IS, "El usuario o contraseña es incorrecto");
            }
        }
}
