package interfaz;

import dominio.Alimento;
import dominio.Ingesta;
import dominio.PlanAlimentacion;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class VentanaMenuPrincipalUsuario extends javax.swing.JDialog {

    private Sistema sistema;
    private String profesionalSeleccionado;
    private boolean existeConversacion;
    private boolean primeraVez;
    private boolean primeraIngesta;
    private String nombreDelPlan;

    public VentanaMenuPrincipalUsuario(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        this.sistema = unSistema;
        this.existeConversacion = false;
        this.lblValidarProfesionalPlan.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblDatosIncorrectos1.setVisible(false);
        this.lblValidarNuevoAlimento.setVisible(false);
        this.lblNuevoAlimentoVacio.setVisible(false);
        this.lblDatosIncorrectos2.setVisible(false);
        this.nombreDelPlan = "";
        this.primeraVez = true;
        this.primeraIngesta = true;
        Calendar fecha = new GregorianCalendar();
        this.fechaIngestaUsuario.setMaxDate(fecha);
        this.panelVacio.setVisible(true);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public boolean getYaExisteConversacion() {
        return existeConversacion;
    }

    public void setYaExisteConversacion(boolean existe) {
        this.existeConversacion = existe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnConsultaConProfesional = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblConsultaConProfesional = new javax.swing.JLabel();
        btnSolicitarPlanAlimentacion = new javax.swing.JButton();
        lblSolicitarPlanAlimentacion = new javax.swing.JLabel();
        btnIngresarAlimentoIngerido = new javax.swing.JButton();
        lblIngresarAlimentoIngerido = new javax.swing.JLabel();
        panelDerecho = new javax.swing.JPanel();
        panelNoHayAlimentos = new javax.swing.JPanel();
        lblNohayConsultasTexto = new javax.swing.JLabel();
        lblNohayConsultas = new javax.swing.JLabel();
        panelNoHayConversacionesCreadas = new javax.swing.JPanel();
        lblCrearConv = new javax.swing.JLabel();
        btnNuevaConversacion1 = new javax.swing.JButton();
        lblNohayConsultasTexto3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNohayProfesionales = new javax.swing.JLabel();
        panelConsultaConProfesional = new javax.swing.JPanel();
        panelConversacion = new javax.swing.JPanel();
        lblFotoProfesional = new javax.swing.JLabel();
        lblNombreProfesional = new javax.swing.JLabel();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarConversacion = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeNuevo = new javax.swing.JTextArea();
        btnNuevaConversacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaConversaciones = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        panelElegirProfesional = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaElegirProfesionales = new javax.swing.JList();
        panelVerPlanAlimentacion = new javax.swing.JPanel();
        lblPlanPropuesto1 = new javax.swing.JLabel();
        lblPlanPropuesto2 = new javax.swing.JLabel();
        lblNombreDelPlan = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado2 = new javax.swing.JLabel();
        lblNombreDelProfesional = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado4 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado5 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado6 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado7 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado8 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado9 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado10 = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado14 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        txtComidasMartes = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        txtComidasMiercoles = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        txtComidasJueves = new javax.swing.JTextArea();
        jScrollPane37 = new javax.swing.JScrollPane();
        txtComidasSabado = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        txtComidasLunes = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        txtComidasDomingo = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        txtComidasViernes = new javax.swing.JTextArea();
        lblAlimentoIngeridoSeleccionado11 = new javax.swing.JLabel();
        lblTituloDelProfesional = new javax.swing.JLabel();
        panelIngestaRegistradaCorrectamente = new javax.swing.JPanel();
        lblNohayConsultas1 = new javax.swing.JLabel();
        lblNohayConsultasTexto1 = new javax.swing.JLabel();
        panelAlimentoIngerido = new javax.swing.JPanel();
        fechaIngestaUsuario = new datechooser.beans.DateChooserCombo();
        lblAlimentoIngerido = new javax.swing.JLabel();
        lblAlimentoIngerido2 = new javax.swing.JLabel();
        lblFechaAlimentoIngerido = new javax.swing.JLabel();
        lblAlimentoIngeridoSeleccionado = new javax.swing.JLabel();
        comboAlimentosEnSistema = new javax.swing.JComboBox<>();
        lblNuevoAlimentoIngerido = new javax.swing.JLabel();
        btnNuevaIngesta = new javax.swing.JButton();
        lblValidarNuevoAlimento = new javax.swing.JLabel();
        lblNuevoAlimentoVacio = new javax.swing.JLabel();
        lblDatosIncorrectos2 = new javax.swing.JLabel();
        panelPlanDeAlimentacion = new javax.swing.JPanel();
        lblPlanDeAlimentacion = new javax.swing.JLabel();
        btnSolicitarNuevoPlan = new javax.swing.JButton();
        panelNoHayPlanesDisponibles = new javax.swing.JPanel();
        lblNoHayPlanes = new javax.swing.JLabel();
        lblPlanSolicitadoCorrectamente1 = new javax.swing.JLabel();
        lblNoHayPlanes1 = new javax.swing.JLabel();
        panelPlanSolicitadoCorrectamente = new javax.swing.JPanel();
        lblPlanSolicitadoCorrectamente = new javax.swing.JLabel();
        lblPlanSolicitado = new javax.swing.JLabel();
        panelSolicitarNuevoPlan = new javax.swing.JPanel();
        lblCambiarPreferencias = new javax.swing.JLabel();
        comboProfesionalesEnSistema = new javax.swing.JComboBox<>();
        lblSeleccioneProfesional1 = new javax.swing.JLabel();
        lblCambiarPreferencias3 = new javax.swing.JLabel();
        lblCambiarPreferencias2 = new javax.swing.JLabel();
        btnEditarPreferencias = new javax.swing.JButton();
        lblCambiarPreferencias4 = new javax.swing.JLabel();
        btnEditarRestricciones = new javax.swing.JButton();
        lblCambiarPreferencias5 = new javax.swing.JLabel();
        lblCambiarPreferencias6 = new javax.swing.JLabel();
        btnAceptarSolicitudPlanAlimentacion = new javax.swing.JButton();
        lblValidarProfesionalPlan = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblDatosIncorrectos1 = new javax.swing.JLabel();
        panelBuscarPlan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPlanesDelUsuario = new javax.swing.JList<>();
        lblSeleccioneProfesional2 = new javax.swing.JLabel();
        btnVerPlanesExistentes = new javax.swing.JButton();
        panelVacio = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelMenu.setBackground(new java.awt.Color(164, 211, 249));
        panelMenu.setMaximumSize(new java.awt.Dimension(260, 800));
        panelMenu.setMinimumSize(new java.awt.Dimension(260, 800));
        panelMenu.setPreferredSize(new java.awt.Dimension(260, 800));

        btnConsultaConProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaConProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultaConProfesionales.png"))); // NOI18N
        btnConsultaConProfesional.setBorder(null);
        btnConsultaConProfesional.setBorderPainted(false);
        btnConsultaConProfesional.setContentAreaFilled(false);
        btnConsultaConProfesional.setFocusPainted(false);
        btnConsultaConProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaConProfesionalActionPerformed(evt);
            }
        });

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVolverAtras.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblConsultaConProfesional.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblConsultaConProfesional.setText("Consulta con profesional");

        btnSolicitarPlanAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPlanAlimentacion.png"))); // NOI18N
        btnSolicitarPlanAlimentacion.setBorder(null);
        btnSolicitarPlanAlimentacion.setBorderPainted(false);
        btnSolicitarPlanAlimentacion.setContentAreaFilled(false);
        btnSolicitarPlanAlimentacion.setFocusPainted(false);
        btnSolicitarPlanAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarPlanAlimentacionActionPerformed(evt);
            }
        });

        lblSolicitarPlanAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSolicitarPlanAlimentacion.setText("Plan de alimentación");

        btnIngresarAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimentoIngerido.png"))); // NOI18N
        btnIngresarAlimentoIngerido.setBorder(null);
        btnIngresarAlimentoIngerido.setBorderPainted(false);
        btnIngresarAlimentoIngerido.setContentAreaFilled(false);
        btnIngresarAlimentoIngerido.setFocusPainted(false);
        btnIngresarAlimentoIngerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoIngeridoActionPerformed(evt);
            }
        });

        lblIngresarAlimentoIngerido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimentoIngerido.setText("Ingresar alimento ingerido");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblConsultaConProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnHome))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblConsultaConProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSolicitarPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimentoIngerido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        panelDerecho.setBackground(new java.awt.Color(51, 51, 51));
        panelDerecho.setMaximumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setMinimumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setPreferredSize(new java.awt.Dimension(800, 800));
        panelDerecho.setLayout(new java.awt.CardLayout());

        panelNoHayAlimentos.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayAlimentos.setMaximumSize(new java.awt.Dimension(400, 400));
        panelNoHayAlimentos.setMinimumSize(new java.awt.Dimension(400, 400));
        panelNoHayAlimentos.setName(""); // NOI18N

        lblNohayConsultasTexto.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto.setText("No hay alimentos registrados");

        lblNohayConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N

        javax.swing.GroupLayout panelNoHayAlimentosLayout = new javax.swing.GroupLayout(panelNoHayAlimentos);
        panelNoHayAlimentos.setLayout(panelNoHayAlimentosLayout);
        panelNoHayAlimentosLayout.setHorizontalGroup(
            panelNoHayAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayAlimentosLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(panelNoHayAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNohayConsultasTexto)
                    .addGroup(panelNoHayAlimentosLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblNohayConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        panelNoHayAlimentosLayout.setVerticalGroup(
            panelNoHayAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayAlimentosLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(lblNohayConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNohayConsultasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        panelDerecho.add(panelNoHayAlimentos, "card2");

        panelNoHayConversacionesCreadas.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayConversacionesCreadas.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNoHayConversacionesCreadas.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNoHayConversacionesCreadas.setLayout(null);

        lblCrearConv.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblCrearConv.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearConv.setText("Crear");
        panelNoHayConversacionesCreadas.add(lblCrearConv);
        lblCrearConv.setBounds(270, 430, 120, 77);

        btnNuevaConversacion1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoMensaje.png"))); // NOI18N
        btnNuevaConversacion1.setBorder(null);
        btnNuevaConversacion1.setBorderPainted(false);
        btnNuevaConversacion1.setContentAreaFilled(false);
        btnNuevaConversacion1.setFocusPainted(false);
        btnNuevaConversacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacion1ActionPerformed(evt);
            }
        });
        panelNoHayConversacionesCreadas.add(btnNuevaConversacion1);
        btnNuevaConversacion1.setBounds(390, 440, 93, 60);

        lblNohayConsultasTexto3.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto3.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto3.setText("No hay conversaciones creadas");
        panelNoHayConversacionesCreadas.add(lblNohayConsultasTexto3);
        lblNohayConsultasTexto3.setBounds(80, 350, 634, 77);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N
        panelNoHayConversacionesCreadas.add(jLabel2);
        jLabel2.setBounds(330, 220, 110, 130);

        lblNohayProfesionales.setBackground(new java.awt.Color(51, 51, 51));
        lblNohayProfesionales.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayProfesionales.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayProfesionales.setText("No hay profesionales creados");
        lblNohayProfesionales.setOpaque(true);
        panelNoHayConversacionesCreadas.add(lblNohayProfesionales);
        lblNohayProfesionales.setBounds(120, 300, 650, 240);

        panelDerecho.add(panelNoHayConversacionesCreadas, "card9");

        panelConsultaConProfesional.setBackground(new java.awt.Color(51, 51, 51));
        panelConsultaConProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setPreferredSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setLayout(null);

        panelConversacion.setOpaque(false);

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        lblFotoProfesional.setAlignmentY(0.0F);

        lblNombreProfesional.setFont(new java.awt.Font("Levenim MT", 0, 30)); // NOI18N
        lblNombreProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreProfesional.setText("Profesional");

        btnEnviarMensaje.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnEnviarMensaje.setBorder(null);
        btnEnviarMensaje.setBorderPainted(false);
        btnEnviarMensaje.setContentAreaFilled(false);
        btnEnviarMensaje.setFocusPainted(false);
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        txtMostrarConversacion.setEditable(false);
        txtMostrarConversacion.setBackground(new java.awt.Color(238, 238, 238));
        txtMostrarConversacion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMostrarConversacion.setAutoscrolls(false);
        jScrollPane2.setViewportView(txtMostrarConversacion);

        txtMensajeNuevo.setBackground(new java.awt.Color(238, 238, 238));
        txtMensajeNuevo.setColumns(20);
        txtMensajeNuevo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMensajeNuevo.setRows(5);
        jScrollPane1.setViewportView(txtMensajeNuevo);

        javax.swing.GroupLayout panelConversacionLayout = new javax.swing.GroupLayout(panelConversacion);
        panelConversacion.setLayout(panelConversacionLayout);
        panelConversacionLayout.setHorizontalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFotoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        panelConversacionLayout.setVerticalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConversacionLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFotoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelConsultaConProfesional.add(panelConversacion);
        panelConversacion.setBounds(264, 48, 526, 656);

        btnNuevaConversacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConversacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoMensaje.png"))); // NOI18N
        btnNuevaConversacion.setBorder(null);
        btnNuevaConversacion.setBorderPainted(false);
        btnNuevaConversacion.setContentAreaFilled(false);
        btnNuevaConversacion.setFocusPainted(false);
        btnNuevaConversacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConversacionActionPerformed(evt);
            }
        });
        panelConsultaConProfesional.add(btnNuevaConversacion);
        btnNuevaConversacion.setBounds(83, 588, 93, 57);

        listaConversaciones.setBackground(new java.awt.Color(238, 238, 238));
        listaConversaciones.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaConversaciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConversacionesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaConversaciones);

        panelConsultaConProfesional.add(jScrollPane3);
        jScrollPane3.setBounds(26, 158, 232, 424);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione al profesional");
        panelConsultaConProfesional.add(jLabel1);
        jLabel1.setBounds(26, 131, 190, 21);

        panelDerecho.add(panelConsultaConProfesional, "card3");

        panelElegirProfesional.setBackground(new java.awt.Color(51, 51, 51));
        panelElegirProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setMinimumSize(new java.awt.Dimension(800, 800));
        panelElegirProfesional.setPreferredSize(new java.awt.Dimension(800, 800));

        listaElegirProfesionales.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaElegirProfesionales.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaElegirProfesionalesValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(listaElegirProfesionales);

        javax.swing.GroupLayout panelElegirProfesionalLayout = new javax.swing.GroupLayout(panelElegirProfesional);
        panelElegirProfesional.setLayout(panelElegirProfesionalLayout);
        panelElegirProfesionalLayout.setHorizontalGroup(
            panelElegirProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelElegirProfesionalLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        panelElegirProfesionalLayout.setVerticalGroup(
            panelElegirProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElegirProfesionalLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panelDerecho.add(panelElegirProfesional, "card4");

        panelVerPlanAlimentacion.setBackground(new java.awt.Color(51, 51, 51));
        panelVerPlanAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVerPlanAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));
        panelVerPlanAlimentacion.setLayout(null);

        lblPlanPropuesto1.setFont(new java.awt.Font("Levenim MT", 0, 40)); // NOI18N
        lblPlanPropuesto1.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanPropuesto1.setText("Plan de alimentación propuesto");
        panelVerPlanAlimentacion.add(lblPlanPropuesto1);
        lblPlanPropuesto1.setBounds(137, 28, 640, 62);

        lblPlanPropuesto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoAlimento.png"))); // NOI18N
        panelVerPlanAlimentacion.add(lblPlanPropuesto2);
        lblPlanPropuesto2.setBounds(27, 11, 100, 100);

        lblNombreDelPlan.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblNombreDelPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelPlan.setText("nombre del plan");
        panelVerPlanAlimentacion.add(lblNombreDelPlan);
        lblNombreDelPlan.setBounds(260, 110, 320, 26);

        lblAlimentoIngeridoSeleccionado2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado2.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado2.setText("Nombre:");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado2);
        lblAlimentoIngeridoSeleccionado2.setBounds(150, 110, 100, 26);

        lblNombreDelProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblNombreDelProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelProfesional.setText("nombre del profesional");
        panelVerPlanAlimentacion.add(lblNombreDelProfesional);
        lblNombreDelProfesional.setBounds(280, 150, 280, 26);

        lblAlimentoIngeridoSeleccionado4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado4.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado4.setText("Martes");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado4);
        lblAlimentoIngeridoSeleccionado4.setBounds(250, 260, 130, 26);

        lblAlimentoIngeridoSeleccionado5.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado5.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado5.setText("Título del profesional:");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado5);
        lblAlimentoIngeridoSeleccionado5.setBounds(150, 190, 220, 26);

        lblAlimentoIngeridoSeleccionado6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado6.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado6.setText("Miércoles");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado6);
        lblAlimentoIngeridoSeleccionado6.setBounds(430, 260, 130, 26);

        lblAlimentoIngeridoSeleccionado7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado7.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado7.setText("Jueves");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado7);
        lblAlimentoIngeridoSeleccionado7.setBounds(600, 260, 130, 26);

        lblAlimentoIngeridoSeleccionado8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado8.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado8.setText("Viernes");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado8);
        lblAlimentoIngeridoSeleccionado8.setBounds(160, 530, 130, 26);

        lblAlimentoIngeridoSeleccionado9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado9.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado9.setText("Sábado");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado9);
        lblAlimentoIngeridoSeleccionado9.setBounds(360, 530, 130, 26);

        lblAlimentoIngeridoSeleccionado10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado10.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado10.setText("Domingo");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado10);
        lblAlimentoIngeridoSeleccionado10.setBounds(520, 530, 110, 26);

        lblAlimentoIngeridoSeleccionado14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado14.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado14.setText("Lunes");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado14);
        lblAlimentoIngeridoSeleccionado14.setBounds(50, 260, 130, 26);

        txtComidasMartes.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasMartes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasMartes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasMartes.setRows(5);
        jScrollPane34.setViewportView(txtComidasMartes);

        panelVerPlanAlimentacion.add(jScrollPane34);
        jScrollPane34.setBounds(210, 300, 160, 210);

        txtComidasMiercoles.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasMiercoles.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasMiercoles.setRows(5);
        jScrollPane35.setViewportView(txtComidasMiercoles);

        panelVerPlanAlimentacion.add(jScrollPane35);
        jScrollPane35.setBounds(400, 300, 160, 210);

        txtComidasJueves.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasJueves.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasJueves.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasJueves.setRows(5);
        jScrollPane36.setViewportView(txtComidasJueves);

        panelVerPlanAlimentacion.add(jScrollPane36);
        jScrollPane36.setBounds(580, 300, 160, 210);

        txtComidasSabado.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasSabado.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasSabado.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasSabado.setRows(5);
        jScrollPane37.setViewportView(txtComidasSabado);

        panelVerPlanAlimentacion.add(jScrollPane37);
        jScrollPane37.setBounds(320, 570, 160, 210);

        txtComidasLunes.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasLunes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasLunes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasLunes.setRows(5);
        jScrollPane38.setViewportView(txtComidasLunes);

        panelVerPlanAlimentacion.add(jScrollPane38);
        jScrollPane38.setBounds(20, 300, 160, 210);

        txtComidasDomingo.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasDomingo.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasDomingo.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasDomingo.setRows(5);
        jScrollPane39.setViewportView(txtComidasDomingo);

        panelVerPlanAlimentacion.add(jScrollPane39);
        jScrollPane39.setBounds(510, 570, 160, 210);

        txtComidasViernes.setBackground(new java.awt.Color(51, 51, 51));
        txtComidasViernes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        txtComidasViernes.setForeground(new java.awt.Color(255, 255, 255));
        txtComidasViernes.setRows(5);
        jScrollPane40.setViewportView(txtComidasViernes);

        panelVerPlanAlimentacion.add(jScrollPane40);
        jScrollPane40.setBounds(130, 570, 160, 210);

        lblAlimentoIngeridoSeleccionado11.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblAlimentoIngeridoSeleccionado11.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado11.setText("Profesional:");
        panelVerPlanAlimentacion.add(lblAlimentoIngeridoSeleccionado11);
        lblAlimentoIngeridoSeleccionado11.setBounds(150, 150, 130, 26);

        lblTituloDelProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblTituloDelProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloDelProfesional.setText("titulo del profesional");
        panelVerPlanAlimentacion.add(lblTituloDelProfesional);
        lblTituloDelProfesional.setBounds(370, 190, 410, 26);

        panelDerecho.add(panelVerPlanAlimentacion, "card5");

        panelIngestaRegistradaCorrectamente.setBackground(new java.awt.Color(51, 51, 51));
        panelIngestaRegistradaCorrectamente.setMaximumSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setMinimumSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setPreferredSize(new java.awt.Dimension(800, 800));
        panelIngestaRegistradaCorrectamente.setLayout(null);

        lblNohayConsultas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        panelIngestaRegistradaCorrectamente.add(lblNohayConsultas1);
        lblNohayConsultas1.setBounds(300, 200, 104, 104);

        lblNohayConsultasTexto1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto1.setText("Ingesta registrada");
        panelIngestaRegistradaCorrectamente.add(lblNohayConsultasTexto1);
        lblNohayConsultasTexto1.setBounds(190, 340, 360, 50);

        panelDerecho.add(panelIngestaRegistradaCorrectamente, "card10");

        panelAlimentoIngerido.setBackground(new java.awt.Color(51, 51, 51));
        panelAlimentoIngerido.setMaximumSize(new java.awt.Dimension(800, 800));
        panelAlimentoIngerido.setMinimumSize(new java.awt.Dimension(800, 800));
        panelAlimentoIngerido.setLayout(null);

        fechaIngestaUsuario.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 17));
        panelAlimentoIngerido.add(fechaIngestaUsuario);
        fechaIngestaUsuario.setBounds(49, 477, 178, 38);

        lblAlimentoIngerido.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngerido.setText("ingerido");
        panelAlimentoIngerido.add(lblAlimentoIngerido);
        lblAlimentoIngerido.setBounds(320, 120, 215, 59);

        lblAlimentoIngerido2.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblAlimentoIngerido2.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngerido2.setText("Datos sobre el alimento");
        panelAlimentoIngerido.add(lblAlimentoIngerido2);
        lblAlimentoIngerido2.setBounds(160, 40, 596, 62);

        lblFechaAlimentoIngerido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblFechaAlimentoIngerido.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaAlimentoIngerido.setText("Ingrese la fecha de ingesta");
        panelAlimentoIngerido.add(lblFechaAlimentoIngerido);
        lblFechaAlimentoIngerido.setBounds(49, 410, 624, 38);

        lblAlimentoIngeridoSeleccionado.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblAlimentoIngeridoSeleccionado.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentoIngeridoSeleccionado.setText("Ingrese el nuevo alimento ");
        panelAlimentoIngerido.add(lblAlimentoIngeridoSeleccionado);
        lblAlimentoIngeridoSeleccionado.setBounds(49, 258, 624, 38);

        comboAlimentosEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboAlimentosEnSistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        comboAlimentosEnSistema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlimentosEnSistemaItemStateChanged(evt);
            }
        });
        panelAlimentoIngerido.add(comboAlimentosEnSistema);
        comboAlimentosEnSistema.setBounds(49, 314, 184, 41);

        lblNuevoAlimentoIngerido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoAlimento.png"))); // NOI18N
        panelAlimentoIngerido.add(lblNuevoAlimentoIngerido);
        lblNuevoAlimentoIngerido.setBounds(40, 60, 100, 100);

        btnNuevaIngesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarALaLista.png"))); // NOI18N
        btnNuevaIngesta.setBorderPainted(false);
        btnNuevaIngesta.setContentAreaFilled(false);
        btnNuevaIngesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaIngestaActionPerformed(evt);
            }
        });
        panelAlimentoIngerido.add(btnNuevaIngesta);
        btnNuevaIngesta.setBounds(640, 628, 124, 117);

        lblValidarNuevoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNuevoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        panelAlimentoIngerido.add(lblValidarNuevoAlimento);
        lblValidarNuevoAlimento.setBounds(250, 310, 32, 44);

        lblNuevoAlimentoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNuevoAlimentoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNuevoAlimentoVacio.setText("Dato vacio");
        panelAlimentoIngerido.add(lblNuevoAlimentoVacio);
        lblNuevoAlimentoVacio.setBounds(300, 310, 120, 38);

        lblDatosIncorrectos2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos2.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos2.setText("Aún quedan datos incorrectos");
        panelAlimentoIngerido.add(lblDatosIncorrectos2);
        lblDatosIncorrectos2.setBounds(320, 650, 341, 40);

        panelDerecho.add(panelAlimentoIngerido, "card5");

        panelPlanDeAlimentacion.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanDeAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelPlanDeAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));
        panelPlanDeAlimentacion.setLayout(null);

        lblPlanDeAlimentacion.setFont(new java.awt.Font("Levenim MT", 0, 50)); // NOI18N
        lblPlanDeAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanDeAlimentacion.setText("Plan de alimentación");
        panelPlanDeAlimentacion.add(lblPlanDeAlimentacion);
        lblPlanDeAlimentacion.setBounds(86, 31, 596, 62);

        btnSolicitarNuevoPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoNuevoPlanAlimentacion.png"))); // NOI18N
        btnSolicitarNuevoPlan.setBorderPainted(false);
        btnSolicitarNuevoPlan.setContentAreaFilled(false);
        btnSolicitarNuevoPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarNuevoPlanActionPerformed(evt);
            }
        });
        panelPlanDeAlimentacion.add(btnSolicitarNuevoPlan);
        btnSolicitarNuevoPlan.setBounds(138, 111, 124, 117);

        panelNoHayPlanesDisponibles.setBackground(new java.awt.Color(51, 52, 52));

        lblNoHayPlanes.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayPlanes.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayPlanes.setText("disponibles");

        lblPlanSolicitadoCorrectamente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N

        lblNoHayPlanes1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayPlanes1.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayPlanes1.setText("No hay planes");

        javax.swing.GroupLayout panelNoHayPlanesDisponiblesLayout = new javax.swing.GroupLayout(panelNoHayPlanesDisponibles);
        panelNoHayPlanesDisponibles.setLayout(panelNoHayPlanesDisponiblesLayout);
        panelNoHayPlanesDisponiblesLayout.setHorizontalGroup(
            panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblPlanSolicitadoCorrectamente1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNoHayPlanes)
                .addGap(43, 43, 43))
            .addGroup(panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(lblNoHayPlanes1)
                    .addContainerGap()))
        );
        panelNoHayPlanesDisponiblesLayout.setVerticalGroup(
            panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblPlanSolicitadoCorrectamente1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(lblNoHayPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(panelNoHayPlanesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayPlanesDisponiblesLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(lblNoHayPlanes1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(179, 179, 179)))
        );

        panelPlanDeAlimentacion.add(panelNoHayPlanesDisponibles);
        panelNoHayPlanesDisponibles.setBounds(410, 240, 320, 500);

        panelPlanSolicitadoCorrectamente.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanSolicitadoCorrectamente.setMaximumSize(new java.awt.Dimension(390, 500));

        lblPlanSolicitadoCorrectamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblPlanSolicitado.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblPlanSolicitado.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanSolicitado.setText("Plan solicitado");

        javax.swing.GroupLayout panelPlanSolicitadoCorrectamenteLayout = new javax.swing.GroupLayout(panelPlanSolicitadoCorrectamente);
        panelPlanSolicitadoCorrectamente.setLayout(panelPlanSolicitadoCorrectamenteLayout);
        panelPlanSolicitadoCorrectamenteLayout.setHorizontalGroup(
            panelPlanSolicitadoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                .addGroup(panelPlanSolicitadoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblPlanSolicitadoCorrectamente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblPlanSolicitado)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelPlanSolicitadoCorrectamenteLayout.setVerticalGroup(
            panelPlanSolicitadoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanSolicitadoCorrectamenteLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblPlanSolicitadoCorrectamente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblPlanSolicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        panelPlanDeAlimentacion.add(panelPlanSolicitadoCorrectamente);
        panelPlanSolicitadoCorrectamente.setBounds(40, 250, 390, 510);

        panelSolicitarNuevoPlan.setBackground(new java.awt.Color(51, 51, 51));

        lblCambiarPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias.setText("personal?");

        comboProfesionalesEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboProfesionalesEnSistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        comboProfesionalesEnSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProfesionalesEnSistemaActionPerformed(evt);
            }
        });

        lblSeleccioneProfesional1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblSeleccioneProfesional1.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccioneProfesional1.setText("Seleccione el Profesional");

        lblCambiarPreferencias3.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias3.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias3.setText("basará en ella para elaborar el plan");

        lblCambiarPreferencias2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias2.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias2.setText("Recuerde que el profesional se ");

        btnEditarPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarPreferencias.png"))); // NOI18N
        btnEditarPreferencias.setBorderPainted(false);
        btnEditarPreferencias.setContentAreaFilled(false);
        btnEditarPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPreferenciasActionPerformed(evt);
            }
        });

        lblCambiarPreferencias4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblCambiarPreferencias4.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias4.setText("¿Desea cambiar su información");

        btnEditarRestricciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEditarRestricciones.png"))); // NOI18N
        btnEditarRestricciones.setBorderPainted(false);
        btnEditarRestricciones.setContentAreaFilled(false);
        btnEditarRestricciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRestriccionesActionPerformed(evt);
            }
        });

        lblCambiarPreferencias5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCambiarPreferencias5.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias5.setText("Restricciones");

        lblCambiarPreferencias6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCambiarPreferencias6.setForeground(new java.awt.Color(255, 255, 255));
        lblCambiarPreferencias6.setText("Preferencias");

        btnAceptarSolicitudPlanAlimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnAceptarSolicitudPlanAlimentacion.setBorderPainted(false);
        btnAceptarSolicitudPlanAlimentacion.setContentAreaFilled(false);
        btnAceptarSolicitudPlanAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarSolicitudPlanAlimentacionActionPerformed(evt);
            }
        });

        lblValidarProfesionalPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarProfesionalPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarProfesionalPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarProfesionalPlanFocusGained(evt);
            }
        });

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setText("completar");

        lblDatosIncorrectos1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos1.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos1.setText("Quedan datos sin");

        javax.swing.GroupLayout panelSolicitarNuevoPlanLayout = new javax.swing.GroupLayout(panelSolicitarNuevoPlan);
        panelSolicitarNuevoPlan.setLayout(panelSolicitarNuevoPlanLayout);
        panelSolicitarNuevoPlanLayout.setHorizontalGroup(
            panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCambiarPreferencias2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCambiarPreferencias3)
                            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditarPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCambiarPreferencias6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCambiarPreferencias5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditarRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                                        .addComponent(comboProfesionalesEnSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblValidarProfesionalPlan))
                                    .addComponent(lblCambiarPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblDatosIncorrectos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptarSolicitudPlanAlimentacion)
                        .addGap(18, 18, 18))))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lblSeleccioneProfesional1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lblCambiarPreferencias4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lblDatosIncorrectos1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );
        panelSolicitarNuevoPlanLayout.setVerticalGroup(
            panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboProfesionalesEnSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidarProfesionalPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarRestricciones)
                    .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(lblCambiarPreferencias)
                        .addGap(18, 18, 18)
                        .addComponent(lblCambiarPreferencias2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCambiarPreferencias3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarPreferencias)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCambiarPreferencias5)
                    .addComponent(lblCambiarPreferencias6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(btnAceptarSolicitudPlanAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarNuevoPlanLayout.createSequentialGroup()
                        .addComponent(lblDatosIncorrectos)
                        .addGap(23, 23, 23))))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblSeleccioneProfesional1)
                    .addContainerGap(489, Short.MAX_VALUE)))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(lblCambiarPreferencias4)
                    .addContainerGap(371, Short.MAX_VALUE)))
            .addGroup(panelSolicitarNuevoPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitarNuevoPlanLayout.createSequentialGroup()
                    .addContainerGap(457, Short.MAX_VALUE)
                    .addComponent(lblDatosIncorrectos1)
                    .addGap(53, 53, 53)))
        );

        panelPlanDeAlimentacion.add(panelSolicitarNuevoPlan);
        panelSolicitarNuevoPlan.setBounds(35, 246, 394, 536);

        panelBuscarPlan.setBackground(new java.awt.Color(51, 51, 51));

        listaPlanesDelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        listaPlanesDelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPlanesDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        listaPlanesDelUsuario.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPlanesDelUsuarioValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaPlanesDelUsuario);

        lblSeleccioneProfesional2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblSeleccioneProfesional2.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccioneProfesional2.setText("Seleccione el plan");

        javax.swing.GroupLayout panelBuscarPlanLayout = new javax.swing.GroupLayout(panelBuscarPlan);
        panelBuscarPlan.setLayout(panelBuscarPlanLayout);
        panelBuscarPlanLayout.setHorizontalGroup(
            panelBuscarPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPlanLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelBuscarPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeleccioneProfesional2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelBuscarPlanLayout.setVerticalGroup(
            panelBuscarPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPlanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblSeleccioneProfesional2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        panelPlanDeAlimentacion.add(panelBuscarPlan);
        panelBuscarPlan.setBounds(435, 254, 339, 524);

        btnVerPlanesExistentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVerPlanesAlimentacion.png"))); // NOI18N
        btnVerPlanesExistentes.setBorderPainted(false);
        btnVerPlanesExistentes.setContentAreaFilled(false);
        btnVerPlanesExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlanesExistentesActionPerformed(evt);
            }
        });
        panelPlanDeAlimentacion.add(btnVerPlanesExistentes);
        btnVerPlanesExistentes.setBounds(509, 111, 124, 117);

        panelDerecho.add(panelPlanDeAlimentacion, "card6");

        panelVacio.setBackground(new java.awt.Color(51, 51, 51));
        panelVacio.setMaximumSize(new java.awt.Dimension(800, 800));
        panelVacio.setMinimumSize(new java.awt.Dimension(800, 800));

        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Question_Mark_64px.png"))); // NOI18N
        btnAyuda.setBorder(null);
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setFocusPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVacioLayout.createSequentialGroup()
                .addContainerGap(704, Short.MAX_VALUE)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVacioLayout.createSequentialGroup()
                .addContainerGap(708, Short.MAX_VALUE)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelDerecho.add(panelVacio, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaConProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaConProfesionalActionPerformed
        ocultarPaneles();
        this.btnConsultaConProfesional.setEnabled(false);
        if (sistema.getListaProfesionales().size() > 0) {
            this.listaConversaciones.setSelectedIndex(0);
            String[] lista = sistema.getListaNombresProfesionalesConversaciones(sistema.getPersonaLogueada().getNombreCompleto());
            if (lista.length > 0) {
                this.listaConversaciones.setListData(lista);
                this.existeConversacion = true;
                this.panelConsultaConProfesional.setVisible(true);
            } else {
                this.panelNoHayConversacionesCreadas.setVisible(true);
                this.lblNohayProfesionales.setVisible(false);
            }
        } else {
            this.panelNoHayConversacionesCreadas.setVisible(true);
            this.lblNohayProfesionales.setVisible(true);
            this.lblNohayConsultasTexto3.setVisible(false);
            this.btnNuevaConversacion1.setVisible(false);
            this.lblCrearConv.setVisible(false);
        }


    }//GEN-LAST:event_btnConsultaConProfesionalActionPerformed

    private void btnSolicitarPlanAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarPlanAlimentacionActionPerformed
        ocultarPaneles();
        this.btnSolicitarPlanAlimentacion.setEnabled(false);
        if (sistema.getListaProfesionales().size() > 0) {
            this.lblValidarProfesionalPlan.setVisible(false);
            this.btnSolicitarPlanAlimentacion.setEnabled(false);
            this.panelPlanDeAlimentacion.setVisible(true);
        } else {
            this.panelNoHayConversacionesCreadas.setVisible(true);
            this.lblNohayProfesionales.setVisible(true);
            this.lblNohayConsultasTexto3.setVisible(false);
            this.btnNuevaConversacion1.setVisible(false);
            this.lblCrearConv.setVisible(false);
        }

    }//GEN-LAST:event_btnSolicitarPlanAlimentacionActionPerformed

    private void btnIngresarAlimentoIngeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoIngeridoActionPerformed
        ocultarPaneles();
        this.btnIngresarAlimentoIngerido.setEnabled(false);
        if (this.sistema.getListaAlimentos().size() > 0) {
            this.btnIngresarAlimentoIngerido.setEnabled(false);
            this.panelAlimentoIngerido.setVisible(true);
            ArrayList<Alimento> lstAlimentos = this.sistema.getListaAlimentos();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            this.comboAlimentosEnSistema.setModel(modelo);
            this.comboAlimentosEnSistema.addItem("Seleccione...");
            for (int i = 0; i < lstAlimentos.size(); i++) {
                this.comboAlimentosEnSistema.addItem(lstAlimentos.get(i).toString());
            }
            this.primeraIngesta = false;
        } else {
            this.panelNoHayAlimentos.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarAlimentoIngeridoActionPerformed

    private void listaElegirProfesionalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaElegirProfesionalesValueChanged
        this.existeConversacion = true;
        Profesional profesional = (Profesional) this.listaElegirProfesionales.getSelectedValue();
        this.sistema.crearConversacion(this.sistema.getPersonaLogueada(), profesional, "CONVERSACION:", true);
        ocultarPaneles();
        actualizarConversaciones(profesional.getNombreCompleto());
        this.panelConsultaConProfesional.setVisible(true);
    }//GEN-LAST:event_listaElegirProfesionalesValueChanged

    private void listaConversacionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConversacionesValueChanged
        if (this.existeConversacion && this.listaConversaciones.getSelectedValue() != null) {
            this.panelConversacion.setVisible(true);
            this.profesionalSeleccionado = this.listaConversaciones.getSelectedValue();
            actualizarConversaciones(this.profesionalSeleccionado);
        }
    }//GEN-LAST:event_listaConversacionesValueChanged

    private void btnNuevaConversacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacionActionPerformed
        ArrayList listaNombresProfesionalesSinConversacion;
        listaNombresProfesionalesSinConversacion = this.sistema.getNombresProfesionalesSinConversacionConUsuario((sistema.getPersonaLogueada()));
        if (listaNombresProfesionalesSinConversacion != null && listaNombresProfesionalesSinConversacion.size() > 0) {
            ocultarPaneles();
            this.listaElegirProfesionales.setListData(listaNombresProfesionalesSinConversacion.toArray());
            this.panelElegirProfesional.setVisible(true);
        }
    }//GEN-LAST:event_btnNuevaConversacionActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        String mensaje = this.txtMensajeNuevo.getText();
        String profesional = this.profesionalSeleccionado;
        String usuario = this.sistema.getPersonaLogueada().getNombreCompleto();
        this.sistema.agregarMensajeConversacion(usuario, profesional, mensaje, false, false);
        this.txtMensajeNuevo.setText("");
        actualizarConversaciones(profesional);
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnNuevaIngestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaIngestaActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        ArrayList<Ingesta> listaIngestasDelUsuario = usuarioLogueado.getAlimentosIngeridos();
        String fechaIngesta = this.fechaIngestaUsuario.getText();
        String nuevoAlimento = this.comboAlimentosEnSistema.getSelectedItem().toString();
        if (nuevoAlimento.equals("Seleccione...")) {
            this.lblDatosIncorrectos2.setVisible(true);
            this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNuevoAlimento.setVisible(true);
            this.lblNuevoAlimentoVacio.setVisible(true);
        } else {
            this.sistema.agregarIngestaAUsuario(listaIngestasDelUsuario, fechaIngesta, nuevoAlimento);
            this.panelIngestaRegistradaCorrectamente.setVisible(true);
            this.lblNuevoAlimentoVacio.setVisible(false);
            this.lblValidarNuevoAlimento.setVisible(false);
            this.btnIngresarAlimentoIngerido.setEnabled(true);
            this.lblDatosIncorrectos2.setVisible(false);
            this.lblValidarNuevoAlimento.setVisible(false);
            this.lblNuevoAlimentoVacio.setVisible(false);
            this.primeraIngesta = true;
            this.comboAlimentosEnSistema.setSelectedIndex(0);
        }
        this.panelAlimentoIngerido.setVisible(false);
    }//GEN-LAST:event_btnNuevaIngestaActionPerformed

    private void btnVerPlanesExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlanesExistentesActionPerformed
        this.btnVerPlanesExistentes.setEnabled(false);
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        String[] planesDelUsuario = this.sistema.planesAtendidosDelUsuario(usuarioLogueado);
        if (planesDelUsuario.length > 0) {
            this.panelBuscarPlan.setVisible(true);
            this.listaPlanesDelUsuario.setListData(planesDelUsuario);
        } else {
            this.panelBuscarPlan.setVisible(true);
            this.panelNoHayPlanesDisponibles.setVisible(true);
        }
    }//GEN-LAST:event_btnVerPlanesExistentesActionPerformed

    private void btnSolicitarNuevoPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarNuevoPlanActionPerformed
        this.btnSolicitarNuevoPlan.setEnabled(false);
        this.lblValidarProfesionalPlan.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblDatosIncorrectos1.setVisible(false);
        this.panelSolicitarNuevoPlan.setVisible(true);
        ArrayList<Profesional> lstProfesionales = this.sistema.getListaProfesionales();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        this.comboProfesionalesEnSistema.setModel(modelo);
        this.comboProfesionalesEnSistema.addItem("Seleccione...");
        for (int i = 0; i < lstProfesionales.size(); i++) {
            this.comboProfesionalesEnSistema.addItem(lstProfesionales.get(i).toString());
        }
        this.primeraVez = false;
    }//GEN-LAST:event_btnSolicitarNuevoPlanActionPerformed

    private void btnEditarPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPreferenciasActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        VentanaEditarPreferencias editarPreferenciasUsuario = new VentanaEditarPreferencias(sistema, usuarioLogueado);
        editarPreferenciasUsuario.setVisible(true);
    }//GEN-LAST:event_btnEditarPreferenciasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void btnEditarRestriccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRestriccionesActionPerformed
        String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
        Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
        VentanaEditarRestricciones editarRestriccionesUsuario = new VentanaEditarRestricciones(sistema, usuarioLogueado);
        editarRestriccionesUsuario.setVisible(true);
    }//GEN-LAST:event_btnEditarRestriccionesActionPerformed

    private void btnAceptarSolicitudPlanAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarSolicitudPlanAlimentacionActionPerformed
        String nombreProfesionalElegido = (String) this.comboProfesionalesEnSistema.getSelectedItem();
        if (nombreProfesionalElegido.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            this.lblDatosIncorrectos1.setVisible(true);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            this.lblDatosIncorrectos1.setVisible(false);
            Profesional profesionalElegido = sistema.getProfesionalPorNombre(nombreProfesionalElegido);
            String nombreUsuarioLoguedo = this.sistema.getPersonaLogueada().getNombreCompleto();
            Usuario usuarioLogueado = this.sistema.getUsuarioPorNombre(nombreUsuarioLoguedo);
            this.sistema.agregarPlanSolicitado(usuarioLogueado, profesionalElegido);
            this.panelSolicitarNuevoPlan.setVisible(false);
            this.panelPlanSolicitadoCorrectamente.setVisible(true);

        }
    }//GEN-LAST:event_btnAceptarSolicitudPlanAlimentacionActionPerformed

    private void lblValidarProfesionalPlanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarProfesionalPlanFocusGained

    }//GEN-LAST:event_lblValidarProfesionalPlanFocusGained

    private void comboProfesionalesEnSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProfesionalesEnSistemaActionPerformed
        if (!this.primeraVez) {
            String profesionalElegido = (String) this.comboProfesionalesEnSistema.getSelectedItem();
            if (profesionalElegido.equals("Seleccione...")) {
                this.lblValidarProfesionalPlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarProfesionalPlan.setVisible(true);
            } else {
                this.lblValidarProfesionalPlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarProfesionalPlan.setVisible(true);
            }
        }
    }//GEN-LAST:event_comboProfesionalesEnSistemaActionPerformed

    private void listaPlanesDelUsuarioValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPlanesDelUsuarioValueChanged
        ocultarPaneles();
        this.nombreDelPlan = this.listaPlanesDelUsuario.getSelectedValue();
        PlanAlimentacion planSeleccionado = this.sistema.devolverPlanDadoNombre(nombreDelPlan);
        this.lblNombreDelPlan.setText(planSeleccionado.getNombreDelPlan());
        this.lblNombreDelProfesional.setText(planSeleccionado.getProfesional().getNombreCompleto());
        this.lblTituloDelProfesional.setText(planSeleccionado.getProfesional().getTituloProfesional());
        String[][] planDiaADia = planSeleccionado.getPlanDiaADia();
        this.txtComidasLunes.setText(cargarDatosDelPlan(planDiaADia, 0));
        this.txtComidasMartes.setText(cargarDatosDelPlan(planDiaADia, 1));
        this.txtComidasMiercoles.setText(cargarDatosDelPlan(planDiaADia, 2));
        this.txtComidasJueves.setText(cargarDatosDelPlan(planDiaADia, 3));
        this.txtComidasViernes.setText(cargarDatosDelPlan(planDiaADia, 4));
        this.txtComidasSabado.setText(cargarDatosDelPlan(planDiaADia, 5));
        this.txtComidasDomingo.setText(cargarDatosDelPlan(planDiaADia, 6));
        this.panelVerPlanAlimentacion.setVisible(true);
    }//GEN-LAST:event_listaPlanesDelUsuarioValueChanged

    private void comboAlimentosEnSistemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlimentosEnSistemaItemStateChanged
        if (!this.primeraIngesta) {
            String alimentoIngresado = (String) this.comboAlimentosEnSistema.getSelectedItem();
            if (alimentoIngresado.equals("Seleccione...")) {
                this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarNuevoAlimento.setVisible(true);
                this.lblNuevoAlimentoVacio.setVisible(true);
            } else {
                this.lblValidarNuevoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarNuevoAlimento.setVisible(true);
                this.lblNuevoAlimentoVacio.setVisible(false);
            }
        }
    }//GEN-LAST:event_comboAlimentosEnSistemaItemStateChanged

    private void btnNuevaConversacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConversacion1ActionPerformed
        ArrayList listaNombresProfesionalesSinConversacion;
        listaNombresProfesionalesSinConversacion = this.sistema.getNombresProfesionalesSinConversacionConUsuario((sistema.getPersonaLogueada()));
        if (listaNombresProfesionalesSinConversacion != null && listaNombresProfesionalesSinConversacion.size() > 0) {
            ocultarPaneles();
            this.listaElegirProfesionales.setListData(listaNombresProfesionalesSinConversacion.toArray());
            this.panelElegirProfesional.setVisible(true);
        }
    }//GEN-LAST:event_btnNuevaConversacion1ActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        AyudaUsuario ayuda = new AyudaUsuario(sistema);
        ayuda.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void ocultarPaneles() {
        this.btnConsultaConProfesional.setEnabled(true);
        this.btnIngresarAlimentoIngerido.setEnabled(true);
        this.btnSolicitarPlanAlimentacion.setEnabled(true);
        this.btnSolicitarNuevoPlan.setEnabled(true);
        this.btnVerPlanesExistentes.setEnabled(true);
        this.panelConsultaConProfesional.setVisible(false);
        this.txtMostrarConversacion.setText("");
        this.panelElegirProfesional.setVisible(false);
        this.panelBuscarPlan.setVisible(false);
        this.panelConversacion.setVisible(false);
        this.panelAlimentoIngerido.setVisible(false);
        this.panelPlanDeAlimentacion.setVisible(false);
        this.panelSolicitarNuevoPlan.setVisible(false);
        this.panelNoHayAlimentos.setVisible(false);
        this.panelVacio.setVisible(true);
        this.panelVerPlanAlimentacion.setVisible(false);
        this.panelPlanSolicitadoCorrectamente.setVisible(false);
        this.panelIngestaRegistradaCorrectamente.setVisible(false);
        this.panelNoHayConversacionesCreadas.setVisible(false);
        this.panelNoHayPlanesDisponibles.setVisible(false);
        this.panelVacio.setVisible(false);
    }

    private void actualizarConversaciones(String destinatario) {
        if (destinatario != null) {
            String remitente = this.sistema.getPersonaLogueada().getNombreCompleto();
            String conversacion = this.sistema.getConversacion(destinatario, remitente);
            this.txtMostrarConversacion.setText(conversacion);
            this.lblNombreProfesional.setText(this.profesionalSeleccionado);
            Profesional profesional = this.sistema.getProfesionalPorNombre(this.profesionalSeleccionado);
            this.lblFotoProfesional.setIcon(profesional.getFotoDePerfil());
            this.listaConversaciones.setListData(this.sistema.getListaNombresProfesionalesConversaciones(remitente));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarSolicitudPlanAlimentacion;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnConsultaConProfesional;
    private javax.swing.JButton btnEditarPreferencias;
    private javax.swing.JButton btnEditarRestricciones;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarAlimentoIngerido;
    private javax.swing.JButton btnNuevaConversacion;
    private javax.swing.JButton btnNuevaConversacion1;
    private javax.swing.JButton btnNuevaIngesta;
    private javax.swing.JButton btnSolicitarNuevoPlan;
    private javax.swing.JButton btnSolicitarPlanAlimentacion;
    private javax.swing.JButton btnVerPlanesExistentes;
    private javax.swing.JComboBox<String> comboAlimentosEnSistema;
    private javax.swing.JComboBox<String> comboProfesionalesEnSistema;
    private datechooser.beans.DateChooserCombo fechaIngestaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAlimentoIngerido;
    private javax.swing.JLabel lblAlimentoIngerido2;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado10;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado11;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado14;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado2;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado4;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado5;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado6;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado7;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado8;
    private javax.swing.JLabel lblAlimentoIngeridoSeleccionado9;
    private javax.swing.JLabel lblCambiarPreferencias;
    private javax.swing.JLabel lblCambiarPreferencias2;
    private javax.swing.JLabel lblCambiarPreferencias3;
    private javax.swing.JLabel lblCambiarPreferencias4;
    private javax.swing.JLabel lblCambiarPreferencias5;
    private javax.swing.JLabel lblCambiarPreferencias6;
    private javax.swing.JLabel lblConsultaConProfesional;
    private javax.swing.JLabel lblCrearConv;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblDatosIncorrectos1;
    private javax.swing.JLabel lblDatosIncorrectos2;
    private javax.swing.JLabel lblFechaAlimentoIngerido;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblIngresarAlimentoIngerido;
    private javax.swing.JLabel lblNoHayPlanes;
    private javax.swing.JLabel lblNoHayPlanes1;
    private javax.swing.JLabel lblNohayConsultas;
    private javax.swing.JLabel lblNohayConsultas1;
    private javax.swing.JLabel lblNohayConsultasTexto;
    private javax.swing.JLabel lblNohayConsultasTexto1;
    private javax.swing.JLabel lblNohayConsultasTexto3;
    private javax.swing.JLabel lblNohayProfesionales;
    private javax.swing.JLabel lblNombreDelPlan;
    private javax.swing.JLabel lblNombreDelProfesional;
    private javax.swing.JLabel lblNombreProfesional;
    private javax.swing.JLabel lblNuevoAlimentoIngerido;
    private javax.swing.JLabel lblNuevoAlimentoVacio;
    private javax.swing.JLabel lblPlanDeAlimentacion;
    private javax.swing.JLabel lblPlanPropuesto1;
    private javax.swing.JLabel lblPlanPropuesto2;
    private javax.swing.JLabel lblPlanSolicitado;
    private javax.swing.JLabel lblPlanSolicitadoCorrectamente;
    private javax.swing.JLabel lblPlanSolicitadoCorrectamente1;
    private javax.swing.JLabel lblSeleccioneProfesional1;
    private javax.swing.JLabel lblSeleccioneProfesional2;
    private javax.swing.JLabel lblSolicitarPlanAlimentacion;
    private javax.swing.JLabel lblTituloDelProfesional;
    private javax.swing.JLabel lblValidarNuevoAlimento;
    private javax.swing.JLabel lblValidarProfesionalPlan;
    private javax.swing.JList<String> listaConversaciones;
    private javax.swing.JList listaElegirProfesionales;
    private javax.swing.JList<String> listaPlanesDelUsuario;
    private javax.swing.JPanel panelAlimentoIngerido;
    private javax.swing.JPanel panelBuscarPlan;
    private javax.swing.JPanel panelConsultaConProfesional;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelElegirProfesional;
    private javax.swing.JPanel panelIngestaRegistradaCorrectamente;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNoHayAlimentos;
    private javax.swing.JPanel panelNoHayConversacionesCreadas;
    private javax.swing.JPanel panelNoHayPlanesDisponibles;
    private javax.swing.JPanel panelPlanDeAlimentacion;
    private javax.swing.JPanel panelPlanSolicitadoCorrectamente;
    private javax.swing.JPanel panelSolicitarNuevoPlan;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JPanel panelVerPlanAlimentacion;
    private javax.swing.JTextArea txtComidasDomingo;
    private javax.swing.JTextArea txtComidasJueves;
    private javax.swing.JTextArea txtComidasLunes;
    private javax.swing.JTextArea txtComidasMartes;
    private javax.swing.JTextArea txtComidasMiercoles;
    private javax.swing.JTextArea txtComidasSabado;
    private javax.swing.JTextArea txtComidasViernes;
    private javax.swing.JTextArea txtMensajeNuevo;
    private javax.swing.JTextPane txtMostrarConversacion;
    // End of variables declaration//GEN-END:variables

    private String cargarDatosDelPlan(String[][] planDiaADia, int indiceDia) {
        String actual = "DESAYUNO:" + "\n";
        if (planDiaADia[indiceDia][0] == null || planDiaADia[indiceDia][0].equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][0];
        }
        actual += "\n" + "\n" + "ALMUERZO:" + "\n";
        if (planDiaADia[indiceDia][1] == null || planDiaADia[indiceDia][1].equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][1];
        }
        actual += "\n" + "\n" + "CENA:" + "\n";
        if (planDiaADia[indiceDia][2] == null || planDiaADia[indiceDia][2].equals("")) {
            actual += "\n" + "No planificado";
        } else {
            actual += "\n" + planDiaADia[indiceDia][2];
        }
        return actual;
    }

}
