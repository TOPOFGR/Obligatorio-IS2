package interfaz;

import dominio.Sistema;

public class AyudaUsuario extends javax.swing.JDialog {

    private Sistema sistema;

    public AyudaUsuario(Sistema unSistema) {
        initComponents();
        this.sistema = unSistema;
        this.setLocationRelativeTo(null);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        btnIngresarAlimentoIngerido = new javax.swing.JButton();
        btnIngresarAlimentoIngerido1 = new javax.swing.JButton();
        btnIngresarAlimentoIngerido2 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        textDesayuno2 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        textDesayuno3 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        textDesayuno4 = new javax.swing.JTextArea();
        btnCerrarSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(null);

        lblNombreUsuario.setFont(new java.awt.Font("Levenim MT", 0, 55)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Ayuda");
        jPanel1.add(lblNombreUsuario);
        lblNombreUsuario.setBounds(203, 27, 192, 78);

        btnIngresarAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Chat_70px.png"))); // NOI18N
        btnIngresarAlimentoIngerido.setBorder(null);
        btnIngresarAlimentoIngerido.setBorderPainted(false);
        btnIngresarAlimentoIngerido.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido.setFocusPainted(false);
        btnIngresarAlimentoIngerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngeridoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarAlimentoIngerido);
        btnIngresarAlimentoIngerido.setBounds(20, 150, 143, 129);

        btnIngresarAlimentoIngerido1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Food_And_Wine_70px.png"))); // NOI18N
        btnIngresarAlimentoIngerido1.setBorder(null);
        btnIngresarAlimentoIngerido1.setBorderPainted(false);
        btnIngresarAlimentoIngerido1.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido1.setFocusPainted(false);
        btnIngresarAlimentoIngerido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngerido1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarAlimentoIngerido1);
        btnIngresarAlimentoIngerido1.setBounds(18, 431, 143, 119);

        btnIngresarAlimentoIngerido2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Calendar_70px.png"))); // NOI18N
        btnIngresarAlimentoIngerido2.setBorder(null);
        btnIngresarAlimentoIngerido2.setBorderPainted(false);
        btnIngresarAlimentoIngerido2.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido2.setFocusPainted(false);
        btnIngresarAlimentoIngerido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngerido2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarAlimentoIngerido2);
        btnIngresarAlimentoIngerido2.setBounds(18, 273, 143, 129);

        textDesayuno2.setEditable(false);
        textDesayuno2.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno2.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno2.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno2.setTabSize(0);
        textDesayuno2.setText("Ingresar ingesta de alimentos.");
        jScrollPane14.setViewportView(textDesayuno2);

        jPanel1.add(jScrollPane14);
        jScrollPane14.setBounds(220, 450, 315, 31);

        textDesayuno3.setEditable(false);
        textDesayuno3.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno3.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno3.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno3.setTabSize(0);
        textDesayuno3.setText("Entablar contacto con \nprofesionales y realizar\nconsultas sobre alimentación.");
        jScrollPane15.setViewportView(textDesayuno3);

        jPanel1.add(jScrollPane15);
        jScrollPane15.setBounds(219, 160, 315, 81);

        textDesayuno4.setEditable(false);
        textDesayuno4.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno4.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno4.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno4.setTabSize(0);
        textDesayuno4.setText("Solicitar planes de alimentación\na los profesionales registrados en\nel sistema.");
        jScrollPane16.setViewportView(textDesayuno4);

        jPanel1.add(jScrollPane16);
        jScrollPane16.setBounds(220, 300, 315, 81);

        btnCerrarSistema.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema.setBorderPainted(false);
        btnCerrarSistema.setContentAreaFilled(false);
        btnCerrarSistema.setFocusPainted(false);
        btnCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSistema);
        btnCerrarSistema.setBounds(540, 10, 50, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarAlimentoIngeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngeridoActionPerformed
       
    }//GEN-LAST:event_btnIngresarAlimentoIngeridoActionPerformed

    private void btnIngresarAlimentoIngerido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngerido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarAlimentoIngerido1ActionPerformed

    private void btnIngresarAlimentoIngerido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngerido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarAlimentoIngerido2ActionPerformed

    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JButton btnIngresarAlimentoIngerido;
    private javax.swing.JButton btnIngresarAlimentoIngerido1;
    private javax.swing.JButton btnIngresarAlimentoIngerido2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JTextArea textDesayuno2;
    private javax.swing.JTextArea textDesayuno3;
    private javax.swing.JTextArea textDesayuno4;
    // End of variables declaration//GEN-END:variables
}
