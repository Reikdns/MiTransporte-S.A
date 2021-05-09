
//Clase que contiene la GUI de la consulta usuarios por ciudad.

package GUI;

import Entity.Usuario;
import BLL.UsuarioService;
import Entity.Empleado;
import java.util.ArrayList;
import javax.swing.JFrame;

public class ConsultaDeCiudad extends javax.swing.JFrame {

    private JFrame parent;
    private Empleado empleado;
    
    public ConsultaDeCiudad(JFrame parent, Empleado empleado) {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.parent = parent;
        this.empleado = empleado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Lbl_Bienvenida = new javax.swing.JLabel();
        Lbl_Minimizar = new javax.swing.JLabel();
        Lbl_Cerrar = new javax.swing.JLabel();
        Pnl_PanelSecundario = new javax.swing.JPanel();
        Lbl_Ciudad = new javax.swing.JLabel();
        Inpt_Ciudad = new javax.swing.JTextField();
        Lbl_Resultado = new javax.swing.JLabel();
        Img_Buscar = new javax.swing.JLabel();
        Lbl_Atras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(49, 106, 197));

        Lbl_Bienvenida.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Lbl_Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Bienvenida.setText("Usuarios por ciudad");

        Lbl_Minimizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Lbl_Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Minimizar.setText("-");
        Lbl_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_MinimizarMouseClicked(evt);
            }
        });

        Lbl_Cerrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Lbl_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Cerrar.setText("X");
        Lbl_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lbl_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_CerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Lbl_Bienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Lbl_Minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Cerrar)
                .addGap(4, 4, 4))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Cerrar)
                    .addComponent(Lbl_Minimizar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Lbl_Ciudad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Lbl_Ciudad.setText("Ciudad");
        Lbl_Ciudad.setToolTipText("");

        Lbl_Resultado.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Lbl_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Resultado.setText("0");
        Lbl_Resultado.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(49, 106, 197)));

        Img_Buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\REINALDO\\Documents\\NetBeansProjects\\Mi transporte S.A\\assets\\Buscar.png")); // NOI18N
        Img_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Img_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Img_BuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_PanelSecundarioLayout = new javax.swing.GroupLayout(Pnl_PanelSecundario);
        Pnl_PanelSecundario.setLayout(Pnl_PanelSecundarioLayout);
        Pnl_PanelSecundarioLayout.setHorizontalGroup(
            Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_PanelSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_PanelSecundarioLayout.createSequentialGroup()
                        .addComponent(Inpt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Img_Buscar))
                    .addComponent(Lbl_Ciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        Pnl_PanelSecundarioLayout.setVerticalGroup(
            Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_PanelSecundarioLayout.createSequentialGroup()
                .addGroup(Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_PanelSecundarioLayout.createSequentialGroup()
                        .addComponent(Lbl_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pnl_PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Img_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inpt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 5, Short.MAX_VALUE))
        );

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
                .addComponent(Pnl_PanelSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Atras)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pnl_PanelSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Lbl_Atras)))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Img_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_BuscarMouseClicked

        ArrayList<Usuario> usuarios = empleado.consultarUsuarios();
        int count = 0;
        for(Usuario usuario : usuarios){
            if(usuario.getCiudad().toUpperCase().equals(Inpt_Ciudad.getText().toUpperCase())){
                count++;
            }
        }
        
        Lbl_Resultado.setText(Integer.toString(count));
    }//GEN-LAST:event_Img_BuscarMouseClicked

    private void Lbl_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_AtrasMouseClicked

        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_AtrasMouseClicked

    private void Lbl_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MinimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_Lbl_MinimizarMouseClicked

    private void Lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_CerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_Lbl_CerrarMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img_Buscar;
    private javax.swing.JTextField Inpt_Ciudad;
    private javax.swing.JLabel Lbl_Atras;
    private javax.swing.JLabel Lbl_Bienvenida;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_Ciudad;
    private javax.swing.JLabel Lbl_Minimizar;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Pnl_PanelSecundario;
    // End of variables declaration//GEN-END:variables
}
