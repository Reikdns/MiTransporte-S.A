
//Clase que contiene la GUI para el login de la aplicación.

package GUI;
import Entity.Empleado;
import BLL.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    UsuarioService usuarioService;
    EmpleadoService empleadoService;
    Empleado empleado;
    
            
    public Login() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        usuarioService = new UsuarioService();
        empleadoService = new EmpleadoService();
        
        for(Empleado empleado : empleadoService.consultarEmpleados()){
            System.out.println(empleado.getIdentificacion() + " - " + empleado.getContraseña());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_PanelPrincipal = new javax.swing.JPanel();
        Lbl_Bienvenida = new javax.swing.JLabel();
        Lbl_Cerrar = new javax.swing.JLabel();
        Lbl_Minimizar = new javax.swing.JLabel();
        Pnl_PanelSecundario = new javax.swing.JPanel();
        Lbl_Usuario = new javax.swing.JLabel();
        Inpt_Usuario = new javax.swing.JTextField();
        Lbl_Clave = new javax.swing.JLabel();
        Img_Admin = new javax.swing.JLabel();
        Btn_Ingresar = new javax.swing.JButton();
        Inpt_Clave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_PanelPrincipal.setBackground(new java.awt.Color(49, 106, 197));

        Lbl_Bienvenida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Lbl_Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Bienvenida.setText("¡Bienvenido!");

        Lbl_Cerrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Lbl_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Cerrar.setText("X");
        Lbl_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_CerrarMouseClicked(evt);
            }
        });

        Lbl_Minimizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Lbl_Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Minimizar.setText("-");
        Lbl_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_MinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_PanelPrincipalLayout = new javax.swing.GroupLayout(Pnl_PanelPrincipal);
        Pnl_PanelPrincipal.setLayout(Pnl_PanelPrincipalLayout);
        Pnl_PanelPrincipalLayout.setHorizontalGroup(
            Pnl_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_PanelPrincipalLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(Lbl_Bienvenida)
                .addGap(191, 191, 191)
                .addComponent(Lbl_Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_Cerrar)
                .addContainerGap())
        );
        Pnl_PanelPrincipalLayout.setVerticalGroup(
            Pnl_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_PanelPrincipalLayout.createSequentialGroup()
                .addGroup(Pnl_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(Pnl_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Cerrar)
                            .addComponent(Lbl_Minimizar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Pnl_PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lbl_Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Lbl_Usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Lbl_Usuario.setText("Usuario:");

        Lbl_Clave.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Lbl_Clave.setText("Clave:");

        Img_Admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Usuario (2).png")); // NOI18N

        Btn_Ingresar.setBackground(new java.awt.Color(49, 106, 197));
        Btn_Ingresar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ingresar.setText("Ingresar");
        Btn_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_IngresarMouseClicked(evt);
            }
        });
        Btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_PanelSecundarioLayout = new javax.swing.GroupLayout(Pnl_PanelSecundario);
        Pnl_PanelSecundario.setLayout(Pnl_PanelSecundarioLayout);
        Pnl_PanelSecundarioLayout.setHorizontalGroup(
            Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_PanelSecundarioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Img_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Inpt_Usuario)
                    .addComponent(Lbl_Usuario)
                    .addComponent(Lbl_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inpt_Clave, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_PanelSecundarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        Pnl_PanelSecundarioLayout.setVerticalGroup(
            Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_PanelSecundarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Img_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_PanelSecundarioLayout.createSequentialGroup()
                        .addComponent(Lbl_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_Clave)
                        .addGap(4, 4, 4)
                        .addComponent(Inpt_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_PanelSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pnl_PanelSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MinimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_Lbl_MinimizarMouseClicked

    private void Lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_CerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_Lbl_CerrarMouseClicked

    public void limpiarCampos(){
       Inpt_Usuario.setText("");
       Inpt_Clave.setText("");
    }
    
    private void Btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IngresarActionPerformed

        
    }//GEN-LAST:event_Btn_IngresarActionPerformed

    private void Btn_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_IngresarMouseClicked

        ArrayList<Empleado> empleados = empleadoService.consultarEmpleados();
        
        if(Inpt_Clave.getText().equals("") || Inpt_Usuario.getText().equals("")){
             JOptionPane.showMessageDialog(this, "Ninguno de los campos puede estar vacío.", "Error al acceder.", JOptionPane.INFORMATION_MESSAGE);
             return;
        }
        
        try {
            for(int i = 0; i < Inpt_Clave.getText().length(); i++){
                char caracter = Inpt_Clave.getText().charAt(i);
                if(caracter == '$' || caracter == '%' || caracter == '&' || caracter == '/' || caracter == '*' || caracter == '-' || caracter == 'ñ'){
                    throw new TypeException("Error de tipado.");
                }
            }       
        }catch(TypeException ex) {
            JOptionPane.showMessageDialog(this, "La clave no puede contener los siguientes caracteres:\n $,%,&,/,*,-,ñ", "Error de tipado", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        for(Empleado empleado : empleados){
            
            if((empleado.getContraseña().equals(Inpt_Clave.getText())) && empleado.getIdentificacion().equals(Inpt_Usuario.getText())){
                limpiarCampos();
                
                this.setVisible(false);
                
                if(empleado.getRol().equals("Administrador")){
                   new Admin(this, empleado).setVisible(true); 
                   this.empleado = empleado;
                   return;
                }
                
                if(empleado.getRol().equals("Bodeguero")){
                   new BodegueroAdmin(this, empleado).setVisible(true);
                   this.empleado = empleado;
                   return;
                }
                
                if(!empleado.getRol().equals("Administrador")){
                   new EmpleadoAdmin(this, empleado).setVisible(true);
                   this.empleado = empleado;
                   return;
                }
            }
        }
        
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error al acceder.", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Btn_IngresarMouseClicked

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ingresar;
    private javax.swing.JLabel Img_Admin;
    private javax.swing.JPasswordField Inpt_Clave;
    private javax.swing.JTextField Inpt_Usuario;
    private javax.swing.JLabel Lbl_Bienvenida;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_Clave;
    private javax.swing.JLabel Lbl_Minimizar;
    private javax.swing.JLabel Lbl_Usuario;
    private javax.swing.JPanel Pnl_PanelPrincipal;
    private javax.swing.JPanel Pnl_PanelSecundario;
    // End of variables declaration//GEN-END:variables
}
