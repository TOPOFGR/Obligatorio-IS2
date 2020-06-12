package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;

public class VentanaEditarPreferencias extends javax.swing.JDialog {

    private Sistema sistema;
    private Usuario usuarioActual;

    public VentanaEditarPreferencias(Sistema unSistema, Usuario unUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.usuarioActual = unUsuario;
        cargarListaPreferencias();
        this.panelListo.setVisible(false);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario unUsuarioActual) {
        this.usuarioActual = unUsuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListo = new javax.swing.JPanel();
        lblListo = new javax.swing.JLabel();
        lblIconoListo = new javax.swing.JLabel();
        panelEditarPreferencias = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        lblTxtPreferencias = new javax.swing.JLabel();
        rdBtnVerduras = new javax.swing.JRadioButton();
        rdBtnHarinas = new javax.swing.JRadioButton();
        rdBtnFrutas = new javax.swing.JRadioButton();
        rdBtnCarnesRojas = new javax.swing.JRadioButton();
        rdBtnCarnesBlancas = new javax.swing.JRadioButton();
        btnEditarPreferencias = new javax.swing.JButton();
        lblEditarPreferencias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(508, 450));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelListo.setBackground(new java.awt.Color(51, 51, 51));
        panelListo.setMaximumSize(new java.awt.Dimension(508, 450));
        panelListo.setMinimumSize(new java.awt.Dimension(508, 450));

        lblListo.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblListo.setForeground(new java.awt.Color(255, 255, 255));
        lblListo.setText("Listo!");

        lblIconoListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        javax.swing.GroupLayout panelListoLayout = new javax.swing.GroupLayout(panelListo);
        panelListo.setLayout(panelListoLayout);
        panelListoLayout.setHorizontalGroup(
            panelListoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(panelListoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconoListo))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        panelListoLayout.setVerticalGroup(
            panelListoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblIconoListo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblListo)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        panelEditarPreferencias.setBackground(new java.awt.Color(51, 51, 51));
        panelEditarPreferencias.setMaximumSize(new java.awt.Dimension(508, 450));
        panelEditarPreferencias.setMinimumSize(new java.awt.Dimension(508, 450));
        panelEditarPreferencias.setPreferredSize(new java.awt.Dimension(508, 450));
        panelEditarPreferencias.setLayout(null);

        lblEditar.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        panelEditarPreferencias.add(lblEditar);
        lblEditar.setBounds(120, 20, 173, 62);

        lblTxtPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtPreferencias.setText("Preferencias");
        panelEditarPreferencias.add(lblTxtPreferencias);
        lblTxtPreferencias.setBounds(70, 100, 265, 38);

        rdBtnVerduras.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnVerduras.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVerduras.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnVerduras.setText("Preferencia 3");
        rdBtnVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnVerdurasActionPerformed(evt);
            }
        });
        panelEditarPreferencias.add(rdBtnVerduras);
        rdBtnVerduras.setBounds(100, 230, 250, 35);

        rdBtnHarinas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnHarinas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnHarinas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnHarinas.setText("Preferencia 5");
        rdBtnHarinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnHarinasActionPerformed(evt);
            }
        });
        panelEditarPreferencias.add(rdBtnHarinas);
        rdBtnHarinas.setBounds(100, 310, 200, 35);

        rdBtnFrutas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnFrutas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnFrutas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnFrutas.setText("Preferencia 4");
        panelEditarPreferencias.add(rdBtnFrutas);
        rdBtnFrutas.setBounds(100, 270, 240, 35);

        rdBtnCarnesRojas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCarnesRojas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesRojas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCarnesRojas.setText("Preferencia 1");
        rdBtnCarnesRojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnCarnesRojasActionPerformed(evt);
            }
        });
        panelEditarPreferencias.add(rdBtnCarnesRojas);
        rdBtnCarnesRojas.setBounds(100, 160, 240, 35);

        rdBtnCarnesBlancas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCarnesBlancas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesBlancas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCarnesBlancas.setText("Preferencia 2");
        panelEditarPreferencias.add(rdBtnCarnesBlancas);
        rdBtnCarnesBlancas.setBounds(100, 190, 240, 35);

        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOkEditar.png"))); // NOI18N
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });
        panelEditarPreferencias.add(btnEditarPreferencias);
        btnEditarPreferencias.setBounds(320, 320, 63, 66);

        lblEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarPreferencias.png"))); // NOI18N
        panelEditarPreferencias.add(lblEditarPreferencias);
        lblEditarPreferencias.setBounds(38, 11, 72, 71);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarPreferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditarPreferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdBtnHarinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnHarinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnHarinasActionPerformed

    private void rdBtnCarnesRojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnCarnesRojasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnCarnesRojasActionPerformed

    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        ArrayList<String> preferencias = new ArrayList<>();
        agregarPreferenciasUsuario(preferencias);
        this.usuarioActual.actualizarPreferenciasUsuario(usuarioActual, preferencias);
        this.panelListo.setVisible(true);
        this.panelEditarPreferencias.setVisible(false);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void rdBtnVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnVerdurasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnVerdurasActionPerformed

    void agregarPreferenciasUsuario(ArrayList<String> preferencias) {
        if (this.rdBtnCarnesBlancas.isSelected()) {
            preferencias.add("Carnes Blancas");
        }
        if (this.rdBtnCarnesRojas.isSelected()) {
            preferencias.add("Carnes Rojas");
        }
        if (this.rdBtnFrutas.isSelected()) {
            preferencias.add("Frutas");
        }
        if (this.rdBtnVerduras.isSelected()) {
            preferencias.add("Verduras");
        }
        if (this.rdBtnHarinas.isSelected()) {
            preferencias.add("Harinas");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditarPreferencias;
    private javax.swing.JLabel lblIconoListo;
    private javax.swing.JLabel lblListo;
    private javax.swing.JLabel lblTxtPreferencias;
    private javax.swing.JPanel panelEditarPreferencias;
    private javax.swing.JPanel panelListo;
    private javax.swing.JRadioButton rdBtnCarnesBlancas;
    private javax.swing.JRadioButton rdBtnCarnesRojas;
    private javax.swing.JRadioButton rdBtnFrutas;
    private javax.swing.JRadioButton rdBtnHarinas;
    private javax.swing.JRadioButton rdBtnVerduras;
    // End of variables declaration//GEN-END:variables

   private void cargarListaPreferencias() {
        Sistema.Preferencias[] listaPreferencias = new Sistema.Preferencias[5];
        listaPreferencias[0] = Sistema.Preferencias.CarnesBlancas;
        listaPreferencias[1] = Sistema.Preferencias.CarnesRojas;
        listaPreferencias[2] = Sistema.Preferencias.Frutas;
        listaPreferencias[3] = Sistema.Preferencias.Harinas;
        listaPreferencias[4] = Sistema.Preferencias.Verduras;
        for (int i = 0; i < listaPreferencias.length; i++) {
            if (i == 0) {
                this.rdBtnCarnesRojas.setText("Carnes Rojas");
            }
            if (i == 1) {
                this.rdBtnCarnesBlancas.setText("Carnes Blancas");
            }
            if (i == 2) {
                this.rdBtnFrutas.setText("Frutas");
            }
            if (i == 3) {
                this.rdBtnHarinas.setText("Harinas");
            }
            if (i == 4) {
                this.rdBtnVerduras.setText("Verduras");
            }
        }
    }

}
