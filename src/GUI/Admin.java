
//Clase que contiene la GUI de el panel de control del administrador del sistema.

package GUI;

import Entity.Empleado;
import Entity.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends JFrame {
    
    private final JFrame parent;
    private DefaultTableModel modelo;
    private Empleado empleado;
    /**
     * Creates new form Admin
     * @param parent
     * @param empleado
     */
    public Admin(JFrame parent, Empleado empleado) {
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.parent = parent;
        this.parent.setVisible(false);
        this.empleado = empleado;
        
        modelo = new DefaultTableModel();
           
        setModelo();
        setDatos();     
    }
    
    private void setModelo(){
        String[] cabecera = {"Identificación", "Nombre", "Fecha de nacimiento", "Teléfono", "Dirección", "Ciudad"};
        modelo.setColumnIdentifiers(cabecera);
        Tbl_Lista.setModel(modelo);
    }
    
    private void setDatos(){
        modelo = new DefaultTableModel();
        setModelo();
        Object[] datos = new Object[modelo.getColumnCount()];
        
        for(Usuario usuario: empleado.consultarUsuarios()){
            datos[0] = usuario.getIdentificacion();
            datos[1] = usuario.getNombre();
            datos[2] = usuario.getFechaDeNacimiento();
            datos[3] = usuario.getTelefono();
            datos[4] = usuario.getDireccion();
            datos[5] = usuario.getCiudad();
            setModelo();
            modelo.addRow(datos);
        }
        
        Tbl_Lista.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Lbl_Cerrar = new javax.swing.JLabel();
        Lbl_Minimizar = new javax.swing.JLabel();
        Lbl_Bienvenida = new javax.swing.JLabel();
        Pnl_Navbar = new javax.swing.JPanel();
        Btn_Consultar = new javax.swing.JButton();
        Btn_IngresarEnvio = new javax.swing.JButton();
        Btn_GenerarReporte = new javax.swing.JButton();
        Pnl_BarraDeUtilidades = new javax.swing.JPanel();
        Registrar = new javax.swing.JButton();
        Lbl_LogOut = new javax.swing.JLabel();
        Pnl_Registros = new javax.swing.JPanel();
        Tbl_Tabla = new javax.swing.JScrollPane();
        Tbl_Lista = new javax.swing.JTable();
        Lbl_Identificacion = new javax.swing.JLabel();
        Inpt_Identificacion = new javax.swing.JTextField();
        Lbl_Telefono = new javax.swing.JLabel();
        Inpt_Telefono = new javax.swing.JTextField();
        Lbl_Nombre = new javax.swing.JLabel();
        Inpt_Nombre = new javax.swing.JTextField();
        Inpt_Direccion = new javax.swing.JTextField();
        Lbl_Direccion = new javax.swing.JLabel();
        Lbl_FechaDeNacimiento = new javax.swing.JLabel();
        Inpt_FechaDeNacimiento = new javax.swing.JTextField();
        Inpt_Ciudad = new javax.swing.JTextField();
        Lbl_Ciudad = new javax.swing.JLabel();
        Img_Eliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(49, 106, 197));

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

        Lbl_Bienvenida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Lbl_Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Bienvenida.setText("Panel de administración");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(Lbl_Bienvenida)
                .addGap(120, 120, 120)
                .addComponent(Lbl_Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_Cerrar)
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Cerrar)
                            .addComponent(Lbl_Minimizar))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lbl_Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Btn_Consultar.setBackground(new java.awt.Color(49, 106, 197));
        Btn_Consultar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_Consultar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Consultar.setText("Consultar ciudad");
        Btn_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ConsultarMouseClicked(evt);
            }
        });

        Btn_IngresarEnvio.setBackground(new java.awt.Color(49, 106, 197));
        Btn_IngresarEnvio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_IngresarEnvio.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IngresarEnvio.setText("Ingresar envíos");
        Btn_IngresarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_IngresarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_IngresarEnvioMouseClicked(evt);
            }
        });

        Btn_GenerarReporte.setBackground(new java.awt.Color(49, 106, 197));
        Btn_GenerarReporte.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_GenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        Btn_GenerarReporte.setText("Consultar reportes");
        Btn_GenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_GenerarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_GenerarReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_NavbarLayout = new javax.swing.GroupLayout(Pnl_Navbar);
        Pnl_Navbar.setLayout(Pnl_NavbarLayout);
        Pnl_NavbarLayout.setHorizontalGroup(
            Pnl_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_NavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_IngresarEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_GenerarReporte)
                .addContainerGap())
        );
        Pnl_NavbarLayout.setVerticalGroup(
            Pnl_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_NavbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Consultar)
                    .addComponent(Btn_IngresarEnvio)
                    .addComponent(Btn_GenerarReporte))
                .addContainerGap())
        );

        Registrar.setBackground(new java.awt.Color(49, 106, 197));
        Registrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_BarraDeUtilidadesLayout = new javax.swing.GroupLayout(Pnl_BarraDeUtilidades);
        Pnl_BarraDeUtilidades.setLayout(Pnl_BarraDeUtilidadesLayout);
        Pnl_BarraDeUtilidadesLayout.setHorizontalGroup(
            Pnl_BarraDeUtilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_BarraDeUtilidadesLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(Registrar)
                .addGap(73, 73, 73))
        );
        Pnl_BarraDeUtilidadesLayout.setVerticalGroup(
            Pnl_BarraDeUtilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_BarraDeUtilidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lbl_LogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Log out.png")); // NOI18N
        Lbl_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_LogOutMouseClicked(evt);
            }
        });

        Tbl_Tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(49, 106, 197)));
        Tbl_Tabla.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Tbl_Lista.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tbl_Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identificación", "Nombre", "Fecha de nacimiento", "Teléfono", "Dirección", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Tabla.setViewportView(Tbl_Lista);

        Lbl_Identificacion.setText("Identificación");

        Lbl_Telefono.setText("Teléfono");

        Lbl_Nombre.setText("Nombre");

        Lbl_Direccion.setText("Dirección");

        Lbl_FechaDeNacimiento.setText("Fecha de nacimiento");

        Lbl_Ciudad.setText("Ciudad");

        Img_Eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Eliminar.png")); // NOI18N
        Img_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Img_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Img_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_RegistrosLayout = new javax.swing.GroupLayout(Pnl_Registros);
        Pnl_Registros.setLayout(Pnl_RegistrosLayout);
        Pnl_RegistrosLayout.setHorizontalGroup(
            Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_RegistrosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Lbl_Identificacion)
                        .addComponent(Inpt_Identificacion)
                        .addComponent(Inpt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lbl_Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Nombre)
                    .addComponent(Lbl_Direccion)
                    .addComponent(Inpt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inpt_Direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_Ciudad)
                    .addComponent(Lbl_FechaDeNacimiento)
                    .addComponent(Inpt_FechaDeNacimiento)
                    .addComponent(Inpt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_RegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tbl_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Img_Eliminar))
        );
        Pnl_RegistrosLayout.setVerticalGroup(
            Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tbl_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Img_Eliminar)))
                .addGap(18, 18, 18)
                .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                        .addComponent(Lbl_Identificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                        .addComponent(Lbl_FechaDeNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_FechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Ciudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                        .addComponent(Lbl_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Pnl_RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(Inpt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pnl_RegistrosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Lbl_Direccion)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pnl_Registros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pnl_BarraDeUtilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(Lbl_LogOut)
                .addGap(26, 26, 26))
            .addComponent(Pnl_Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pnl_Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Pnl_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_LogOut, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pnl_BarraDeUtilidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_CerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_Lbl_CerrarMouseClicked

    private void Lbl_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MinimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_Lbl_MinimizarMouseClicked

    private void Lbl_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_LogOutMouseClicked

        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea finalizar la sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION);
        
        if(opcion != 1){
            parent.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_Lbl_LogOutMouseClicked
     
    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked

        Usuario usuario = new Usuario();
        usuario.setIdentificacion(Inpt_Identificacion.getText());
        usuario.setNombre(Inpt_Nombre.getText());
        usuario.setFechaDeNacimiento(Inpt_FechaDeNacimiento.getText());
        usuario.setTelefono(Inpt_Telefono.getText());
        usuario.setDireccion(Inpt_Direccion.getText());
        usuario.setCiudad(Inpt_Ciudad.getText());
        
        empleado.registrarUsuario(usuario);
        limpiarCampos();
        setDatos();
    }//GEN-LAST:event_RegistrarMouseClicked

    private void Img_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_EliminarMouseClicked

        int index = Tbl_Lista.getSelectedRow();
        String id = Tbl_Lista.getValueAt(index, 0).toString();
        empleado.eliminarUsuario(id);
        setDatos();
    }//GEN-LAST:event_Img_EliminarMouseClicked

    private void Btn_ConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ConsultarMouseClicked

        this.setVisible(false);
        new ConsultaDeCiudad(this, empleado).setVisible(true);
    }//GEN-LAST:event_Btn_ConsultarMouseClicked

    private void Btn_IngresarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_IngresarEnvioMouseClicked

        this.setVisible(false);
        new IngresoDeEnvios(this, empleado).setVisible(true);
    }//GEN-LAST:event_Btn_IngresarEnvioMouseClicked

    private void Btn_GenerarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GenerarReporteMouseClicked

        this.setVisible(false);
        new ConsultaDeReportes(this, empleado).setVisible(true);
    }//GEN-LAST:event_Btn_GenerarReporteMouseClicked
    
    private void limpiarCampos(){
        Inpt_Identificacion.setText("");
        Inpt_Nombre.setText("");
        Inpt_FechaDeNacimiento.setText("");
        Inpt_Telefono.setText("");
        Inpt_Direccion.setText("");
        Inpt_Ciudad.setText("");
    }
    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JButton Btn_GenerarReporte;
    private javax.swing.JButton Btn_IngresarEnvio;
    private javax.swing.JLabel Img_Eliminar;
    private javax.swing.JTextField Inpt_Ciudad;
    private javax.swing.JTextField Inpt_Direccion;
    private javax.swing.JTextField Inpt_FechaDeNacimiento;
    private javax.swing.JTextField Inpt_Identificacion;
    private javax.swing.JTextField Inpt_Nombre;
    private javax.swing.JTextField Inpt_Telefono;
    private javax.swing.JLabel Lbl_Bienvenida;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_Ciudad;
    private javax.swing.JLabel Lbl_Direccion;
    private javax.swing.JLabel Lbl_FechaDeNacimiento;
    private javax.swing.JLabel Lbl_Identificacion;
    private javax.swing.JLabel Lbl_LogOut;
    private javax.swing.JLabel Lbl_Minimizar;
    private javax.swing.JLabel Lbl_Nombre;
    private javax.swing.JLabel Lbl_Telefono;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Pnl_BarraDeUtilidades;
    private javax.swing.JPanel Pnl_Navbar;
    private javax.swing.JPanel Pnl_Registros;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable Tbl_Lista;
    private javax.swing.JScrollPane Tbl_Tabla;
    // End of variables declaration//GEN-END:variables

}