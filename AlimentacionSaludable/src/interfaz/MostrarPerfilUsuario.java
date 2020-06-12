package interfaz;

import dominio.Alimento;
import dominio.Ingesta;
import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;

public class MostrarPerfilUsuario extends javax.swing.JDialog {

    private Sistema sistema;
    private String nombreUsuario;

    public MostrarPerfilUsuario(Sistema unSistema, String usuarioAMostrar) {
        initComponents();
        this.sistema = unSistema;
        this.nombreUsuario = usuarioAMostrar;
        this.setLocationRelativeTo(null);
        Usuario usuarioPerfil = (Usuario) sistema.getUsuarioPorNombre(nombreUsuario);
        this.lblNombreUsuario.setText(usuarioPerfil.getNombreCompleto());
        this.lblFechaNacimientoUsuario.setText(usuarioPerfil.getFechaNacimiento());
        this.lblFotoDeUsuario.setIcon(usuarioPerfil.getFotoDePerfil());
        if (usuarioPerfil.getArrayAlimentosIngeridos().length > 0) {
            ArrayList <Ingesta> ingeridos = usuarioPerfil.getAlimentosIngeridos();
            ArrayList <String> listaASetear = new ArrayList <>();
            for (int i = 0; i < ingeridos.size(); i++) {
                Ingesta ingestaActual = ingeridos.get(i);
                ArrayList <Alimento> alimentosActuales = ingestaActual.getListaAlimentosPorFecha();
                for (int j = 0; j < alimentosActuales.size(); j++) {
                    listaASetear.add(alimentosActuales.get(i).toString());
                }
            }
            String [] arrayASetear = new String [listaASetear.size()]; 
            for (int i = 0; i < listaASetear.size(); i++) {
                arrayASetear[i] = listaASetear.get(i);
            }
            this.listaIngestas.setListData(arrayASetear);
        }
        if (usuarioPerfil.getArrayPreferencias().length > 0) {
            this.listaPreferencias.setListData(usuarioPerfil.getArrayPreferencias());
        }
        if (usuarioPerfil.getArrayRestricciones().length > 0) {
            this.listaRestricciones.setListData(usuarioPerfil.getArrayRestricciones());
        }
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String unNombreUsuario) {
        this.nombreUsuario = unNombreUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFotoDeUsuario = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblRestricciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRestricciones = new javax.swing.JList<>();
        lblPreferencias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPreferencias = new javax.swing.JList<>();
        lblTxtIngestas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaIngestas = new javax.swing.JList<>();
        lblFechaNacimientoUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        lblFotoDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N

        lblFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de nacimiento:");

        lblRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblRestricciones.setText("Restricciones:");

        jScrollPane2.setViewportView(listaRestricciones);

        lblPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblPreferencias.setText("Preferencias:");

        jScrollPane1.setViewportView(listaPreferencias);

        lblTxtIngestas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblTxtIngestas.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtIngestas.setText("Ingestas:");

        jScrollPane3.setViewportView(listaIngestas);

        lblFechaNacimientoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblFechaNacimientoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimientoUsuario.setText("Fecha del usuario");

        lblNombreUsuario.setFont(new java.awt.Font("Levenim MT", 0, 35)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRestricciones)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTxtIngestas)
                                .addGap(28, 28, 28))
                            .addComponent(lblPreferencias))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaNacimiento)
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaNacimientoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFotoDeUsuario)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblRestricciones)
                        .addGap(94, 94, 94)
                        .addComponent(lblPreferencias)
                        .addGap(75, 75, 75)
                        .addComponent(lblTxtIngestas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaNacimientoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFechaNacimientoUsuario;
    private javax.swing.JLabel lblFotoDeUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JLabel lblRestricciones;
    private javax.swing.JLabel lblTxtIngestas;
    private javax.swing.JList<String> listaIngestas;
    private javax.swing.JList<String> listaPreferencias;
    private javax.swing.JList<String> listaRestricciones;
    // End of variables declaration//GEN-END:variables
}
