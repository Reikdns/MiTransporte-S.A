
//Clase que contien la GUI del bodeguero.

package GUI;

import Entity.Empleado;
import Entity.Reporte;
import Entity.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BodegueroAdmin extends javax.swing.JFrame {

    JFrame parent;
    Empleado empleado;
    DefaultTableModel model;
    
    /**
     * Creates new form UserAdmin
     */
    public BodegueroAdmin(JFrame parent, Empleado empleado) {
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
        String[] cabecera = {"Id", "Fecha", "Origen", "Destino", "Observacion", "Cliente"};
        model.setColumnIdentifiers(cabecera);
        Tbl_Lista.setModel(model);
    }
    
    private void setDatos(){
        model = new DefaultTableModel();
        setModelo();
        Object[] datos = new Object[model.getColumnCount()];
        
        for(Reporte reporte: new Usuario().consultarReportes(Inpt_Identificacion.getText())){
            datos[0] = reporte.getId();
            datos[1] = reporte.getFecha();
            datos[2] = reporte.getCiudadOrigen();
            datos[3] = reporte.getCiudadDestino();
            datos[4] = reporte.getObservaciones();
            datos[5] = reporte.getIdentificacionUsuario();
            setModelo();
            model.addRow(datos);
        }
        
        Tbl_Lista.setModel(model);
    }

    private void setDatos(String key){
        model = new DefaultTableModel();
        setModelo();
        
        Object[] datos = new Object[model.getColumnCount()];       
        for(Reporte reporte: new Usuario().consultarReportes(key)){
            
            if(!reporte.getIdentificacionUsuario().equals(key)){
                continue;
            }
            
            datos[0] = reporte.getId();
            datos[1] = reporte.getFecha();
            datos[2] = reporte.getCiudadOrigen();
            datos[3] = reporte.getCiudadDestino();
            datos[4] = reporte.getObservaciones();
            datos[5] = reporte.getIdentificacionUsuario();
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
        Lbl_Observacion = new javax.swing.JLabel();
        Lbl_Consultar = new javax.swing.JLabel();
        Inpt_Identificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_PanelPrincipal.setBackground(new java.awt.Color(49, 106, 197));

        Lbl_Bienvenida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Lbl_Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Bienvenida.setText("Panel de bodeguero");

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
                .addGap(174, 174, 174)
                .addComponent(Lbl_Bienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_Cerrar)
                .addContainerGap())
        );
        Pnl_PanelPrincipalLayout.setVerticalGroup(
            Pnl_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_PanelPrincipalLayout.createSequentialGroup()
                .addGroup(Pnl_PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Cerrar)
                    .addComponent(Lbl_Minimizar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
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

        Lbl_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_LogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Log out.png")); // NOI18N
        Lbl_LogOut.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(49, 106, 197)));
        Lbl_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_LogOutMouseClicked(evt);
            }
        });

        Lbl_Observacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Lbl_Observacion.setText("Identificacion");

        Lbl_Consultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Consultar.png")); // NOI18N
        Lbl_Consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_ConsultarMouseClicked(evt);
            }
        });

        Inpt_Identificacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Inpt_Identificacion.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Inpt_IdentificacionInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tbl_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Lbl_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Inpt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lbl_Consultar)
                                .addGap(165, 165, 165))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_Observacion)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Observacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Consultar)
                    .addComponent(Inpt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tbl_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_LogOut)
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

    private void Lbl_ConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_ConsultarMouseClicked

        if(Inpt_Identificacion.getText().equals("")){
            setDatos();
        }
        else{
            setDatos(Inpt_Identificacion.getText());
        }
    }//GEN-LAST:event_Lbl_ConsultarMouseClicked

    private void Inpt_IdentificacionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Inpt_IdentificacionInputMethodTextChanged

        System.out.println("arroz");
    }//GEN-LAST:event_Inpt_IdentificacionInputMethodTextChanged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Inpt_Identificacion;
    private javax.swing.JLabel Lbl_Bienvenida;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_Consultar;
    private javax.swing.JLabel Lbl_LogOut;
    private javax.swing.JLabel Lbl_Minimizar;
    private javax.swing.JLabel Lbl_Observacion;
    private javax.swing.JPanel Pnl_PanelPrincipal;
    private javax.swing.JTable Tbl_Lista;
    private javax.swing.JScrollPane Tbl_Tabla;
    // End of variables declaration//GEN-END:variables
}
