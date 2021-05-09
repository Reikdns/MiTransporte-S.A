/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Reporte;
import BLL.ReporteService;
import javax.swing.JFrame;

/**
 *
 * @author REINALDO
 */
public class IngresoDeEnvios extends javax.swing.JFrame {
    
    private JFrame parent;
    private ReporteService reporteService;
    /**
     * Creates new form IngresoDeEnvios
     */
    public IngresoDeEnvios(JFrame parent) {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.parent = parent;
        reporteService = new ReporteService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Lbl_Cerrar = new javax.swing.JLabel();
        Lbl_Minimizar = new javax.swing.JLabel();
        Lbl_Bienvenida = new javax.swing.JLabel();
        Inpt_Fecha = new javax.swing.JTextField();
        Lbl_Fecha = new javax.swing.JLabel();
        Lbl_CiudadDestino = new javax.swing.JLabel();
        Inpt_CiudadDestino = new javax.swing.JTextField();
        Lbl_Observacion = new javax.swing.JLabel();
        Inpt_Observacion = new javax.swing.JTextField();
        Lbl_IdentificacionUsuario = new javax.swing.JLabel();
        Inpt_IdentificacionUsuario = new javax.swing.JTextField();
        Lbl_CiudadOrigen = new javax.swing.JLabel();
        Inpt_CiudadOrigen = new javax.swing.JTextField();
        Btn_Registrar = new javax.swing.JButton();
        Lbl_Atras = new javax.swing.JLabel();

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
        Lbl_Bienvenida.setText("Gestor de envíos");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Lbl_Bienvenida)
                .addGap(42, 42, 42)
                .addComponent(Lbl_Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_Cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        Inpt_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inpt_FechaActionPerformed(evt);
            }
        });

        Lbl_Fecha.setText("Fecha");

        Lbl_CiudadDestino.setText("Ciudad destino");

        Inpt_CiudadDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inpt_CiudadDestinoActionPerformed(evt);
            }
        });

        Lbl_Observacion.setText("Observacion");

        Inpt_Observacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inpt_ObservacionActionPerformed(evt);
            }
        });

        Lbl_IdentificacionUsuario.setText("Identificación de cliente");

        Inpt_IdentificacionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inpt_IdentificacionUsuarioActionPerformed(evt);
            }
        });

        Lbl_CiudadOrigen.setText("Ciudad origen");

        Inpt_CiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inpt_CiudadOrigenActionPerformed(evt);
            }
        });

        Btn_Registrar.setBackground(new java.awt.Color(49, 106, 197));
        Btn_Registrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registrar.setText("Registrar");
        Btn_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_RegistrarMouseClicked(evt);
            }
        });
        Btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarActionPerformed(evt);
            }
        });

        Lbl_Atras.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Atras.png")); // NOI18N
        Lbl_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_AtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Registrar)
                .addGap(88, 88, 88)
                .addComponent(Lbl_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Fecha)
                            .addComponent(Inpt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_CiudadOrigen)
                            .addComponent(Inpt_CiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_CiudadDestino)
                            .addComponent(Inpt_CiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbl_IdentificacionUsuario)
                            .addComponent(Inpt_IdentificacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Inpt_Observacion)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(Lbl_Observacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_IdentificacionUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_IdentificacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_Fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lbl_CiudadOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_CiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lbl_CiudadDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inpt_CiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(Lbl_Observacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inpt_Observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lbl_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Lbl_CerrarMouseClicked

    private void Lbl_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_Lbl_MinimizarMouseClicked

    private void Inpt_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inpt_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inpt_FechaActionPerformed

    private void Inpt_CiudadDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inpt_CiudadDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inpt_CiudadDestinoActionPerformed

    private void Inpt_ObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inpt_ObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inpt_ObservacionActionPerformed

    private void Inpt_IdentificacionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inpt_IdentificacionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inpt_IdentificacionUsuarioActionPerformed

    private void Inpt_CiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inpt_CiudadOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inpt_CiudadOrigenActionPerformed

    private void Btn_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegistrarMouseClicked
        // TODO add your handling code here:
        Reporte reporte = new Reporte();
        
        reporte.setFecha(Inpt_Fecha.getText());
        reporte.setCiudadOrigen(Inpt_CiudadOrigen.getText());
        reporte.setCiudadDestino(Inpt_CiudadDestino.getText());
        reporte.setObservaciones(Inpt_Observacion.getText());
        reporte.setIdentificacionUsuario(Inpt_IdentificacionUsuario.getText());
        
        reporteService.registrarReporte(reporte);
    }//GEN-LAST:event_Btn_RegistrarMouseClicked

    private void Btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_RegistrarActionPerformed

    private void Lbl_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_AtrasMouseClicked
        // TODO add your handling code here:
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_AtrasMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Registrar;
    private javax.swing.JTextField Inpt_CiudadDestino;
    private javax.swing.JTextField Inpt_CiudadOrigen;
    private javax.swing.JTextField Inpt_Fecha;
    private javax.swing.JTextField Inpt_IdentificacionUsuario;
    private javax.swing.JTextField Inpt_Observacion;
    private javax.swing.JLabel Lbl_Atras;
    private javax.swing.JLabel Lbl_Bienvenida;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_CiudadDestino;
    private javax.swing.JLabel Lbl_CiudadOrigen;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JLabel Lbl_IdentificacionUsuario;
    private javax.swing.JLabel Lbl_Minimizar;
    private javax.swing.JLabel Lbl_Observacion;
    private javax.swing.JPanel PanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
