
//Clase que contiene la GUI para un empleado que tenga de rol ni administrador y bodeguero.

package GUI;

import Entity.Empleado;
import Entity.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmpleadoAdmin extends javax.swing.JFrame {

    JFrame parent;
    Empleado empleado;
    DefaultTableModel model;
    
    /**
     * Creates new form Empleado
     */
    public EmpleadoAdmin(JFrame parent, Empleado empleado) {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.parent = parent;
        this.empleado = empleado;
        model = new DefaultTableModel();
        
        setModelo();
        setDatos();     
    }
    
    private void setModelo(){
        String[] cabecera = {"Identificación", "Nombre", "Fecha de nacimiento", "Teléfono", "Dirección", "Ciudad"};
        model.setColumnIdentifiers(cabecera);
        Tbl_Lista.setModel(model);
    }
    
    private void setDatos(){
        model = new DefaultTableModel();
        setModelo();
        Object[] datos = new Object[model.getColumnCount()];
        
        for(Usuario usuario: empleado.consultarUsuarios()){
            datos[0] = usuario.getIdentificacion();
            datos[1] = usuario.getNombre();
            datos[2] = usuario.getFechaDeNacimiento();
            datos[3] = usuario.getTelefono();
            datos[4] = usuario.getDireccion();
            datos[5] = usuario.getCiudad();
            setModelo();
            model.addRow(datos);
        }
        
        Tbl_Lista.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_PanelPrincipal = new javax.swing.JPanel();
        Lbl_Bienvenida = new javax.swing.JLabel();
        Lbl_Cerrar = new javax.swing.JLabel();
        Lbl_Minimizar = new javax.swing.JLabel();
        Tbl_Tabla = new javax.swing.JScrollPane();
        Tbl_Lista = new javax.swing.JTable();
        Lbl_LogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_PanelPrincipal.setBackground(new java.awt.Color(49, 106, 197));

        Lbl_Bienvenida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Lbl_Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Bienvenida.setText("Panel de empleado");

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

        Lbl_LogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Log out.png")); // NOI18N
        Lbl_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_LogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_LogOut)
                .addGap(317, 317, 317))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Tbl_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(Lbl_LogOut)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(Tbl_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
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

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Bienvenida;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_LogOut;
    private javax.swing.JLabel Lbl_Minimizar;
    private javax.swing.JPanel Pnl_PanelPrincipal;
    private javax.swing.JTable Tbl_Lista;
    private javax.swing.JScrollPane Tbl_Tabla;
    // End of variables declaration//GEN-END:variables
}
