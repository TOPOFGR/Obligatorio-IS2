package interfaz;

import dominio.Alimento;
import dominio.ComposicionAlimento;
import dominio.Ingesta;
import dominio.Profesional;
import dominio.Sistema;
import dominio.Usuario;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class VentanaMenuPrincipalProfesional extends javax.swing.JDialog {

    private Sistema sistema;
    private String usuarioSeleccionado;
    private ImageIcon fotoDeAlimentoActual;
    private final boolean[] nutrientesSeleccionados;
    private String diaDeLaSemanaAnterior;
    private String diaDeLaSemanaActual;
    private final String[][] planAlimentacion;

    public VentanaMenuPrincipalProfesional(Sistema unSistema) {
        initComponents();
        sistema = unSistema;
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        this.panelVacio.setVisible(true);
        this.nutrientesSeleccionados = new boolean[7];
        this.diaDeLaSemanaAnterior = "Lunes";
        this.planAlimentacion = new String[7][3];
        this.diaDeLaSemanaActual = "Lunes";
        this.fotoDeAlimentoActual = new ImageIcon(getClass().getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        lblValidarTipoAlimento.setVisible(false);
        lblValidarNombre.setVisible(false);
        lblDatosIncorrectos.setVisible(false);
        lblDatosIncorrectos2.setVisible(false);
        ocultarPrincipalesNutrientes();
        this.panelVacio.setVisible(true);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public ImageIcon getFotoDeAlimentoActual() {
        return fotoDeAlimentoActual;
    }

    public void setFotoDeAlimentoActual(ImageIcon unaFoto) {
        this.fotoDeAlimentoActual = unaFoto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnConsultasPendientes = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblConsultasPendientes = new javax.swing.JLabel();
        btnPlanesSolicitados = new javax.swing.JButton();
        lblPlanesSolicitados = new javax.swing.JLabel();
        lblPlanesSolicitados2 = new javax.swing.JLabel();
        btnIngresarAlimento = new javax.swing.JButton();
        lblIngresarAlimento = new javax.swing.JLabel();
        lblIngresarAlimento2 = new javax.swing.JLabel();
        panelDerecho = new javax.swing.JPanel();
        panelVacio = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        panelNoHayPlanesPendientes = new javax.swing.JPanel();
        lblNohayPlanesTexto1 = new javax.swing.JLabel();
        lblNoHayAlimentosIcono = new javax.swing.JLabel();
        lblNohayConsultasTexto2 = new javax.swing.JLabel();
        lblNoHayAlimentos = new javax.swing.JLabel();
        lblNohayPlanesIcono = new javax.swing.JLabel();
        panelNoHayConsultasPendientes = new javax.swing.JPanel();
        lblNohayConsultasTexto = new javax.swing.JLabel();
        lblNohayConsultas = new javax.swing.JLabel();
        panelConsultaConProfesional = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblFotoProfesional = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaConversaciones = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        panelConversacionOk = new javax.swing.JPanel();
        panelMostrarOk = new javax.swing.JPanel();
        lblOK = new javax.swing.JLabel();
        lblOKTexto = new javax.swing.JLabel();
        panelConversacion = new javax.swing.JPanel();
        btnVerPerfilDeUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensajeNuevo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarConversacion = new javax.swing.JTextPane();
        btnEnviarMensaje = new javax.swing.JButton();
        lblVerPerfilUsuario = new javax.swing.JLabel();
        panelElaborarPlan = new javax.swing.JPanel();
        lblElaborarNuevoPlan = new javax.swing.JLabel();
        lblComida = new javax.swing.JLabel();
        lblAlimentos = new javax.swing.JLabel();
        listaDiasDeLaSemana = new javax.swing.JComboBox<>();
        listaComidasPlan = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaAlimentosEnSistema = new javax.swing.JList();
        lblDia = new javax.swing.JLabel();
        lblNombrePlan = new javax.swing.JLabel();
        txtNombrePlan = new javax.swing.JTextField();
        btnAgregarAlPlan = new javax.swing.JButton();
        btnEliminarDelPlan = new javax.swing.JButton();
        lblDesayuno = new javax.swing.JLabel();
        lblAlmuerzo = new javax.swing.JLabel();
        lblCena = new javax.swing.JLabel();
        lblNombreDelDia = new javax.swing.JLabel();
        btnElaborarPlan1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        textAlmuerzo = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        textCena = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        textDesayuno = new javax.swing.JTextArea();
        btnEliminarDelPlan1 = new javax.swing.JButton();
        lblValidarNombrePlan = new javax.swing.JLabel();
        lblCena1 = new javax.swing.JLabel();
        lblNombrePlanVacio = new javax.swing.JLabel();
        panelMostrarPlanEnviado = new javax.swing.JPanel();
        lblOK2 = new javax.swing.JLabel();
        lblOKTexto2 = new javax.swing.JLabel();
        panelPlanAlimentacion = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPlanesPendientes = new javax.swing.JList<>();
        lblElijaUnUsuario = new javax.swing.JLabel();
        panelDatosUsuario = new javax.swing.JPanel();
        lblFotoUsuario = new javax.swing.JLabel();
        lblNombreUsuario1 = new javax.swing.JLabel();
        panelPerfilDeUsuario = new javax.swing.JPanel();
        lblNombreUsuario2 = new javax.swing.JLabel();
        lblFotoDeUsuario = new javax.swing.JLabel();
        lblTxtFechaNacimiento = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblTxtRestricciones = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaRestricciones = new javax.swing.JList<>();
        lblPreferencias = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaPreferencias = new javax.swing.JList<>();
        lblIngestas = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaIngestas = new javax.swing.JList<>();
        btnElaborarPlan = new javax.swing.JButton();
        lblElaborarPlan = new javax.swing.JLabel();
        panelNuevoAlimento = new javax.swing.JPanel();
        panelAlimentroRegistradoCorrectamente = new javax.swing.JPanel();
        lblNoPlanes2 = new javax.swing.JLabel();
        lblNohayPlanesTexto2 = new javax.swing.JLabel();
        panelIngresarAlimentoAlSistema = new javax.swing.JPanel();
        lblNuevoAlimento = new javax.swing.JLabel();
        lblIconoNuevoAlimento = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTipoAlimento = new javax.swing.JLabel();
        btnIngresarFotoAlimento = new javax.swing.JButton();
        listaTipoAlimentos = new javax.swing.JComboBox<>();
        lblPrincipalesNutrientes = new javax.swing.JLabel();
        btnIngresarAlimentoASistema = new javax.swing.JButton();
        checkHidratos = new javax.swing.JCheckBox();
        txtHidratos = new javax.swing.JTextField();
        lblHidratos = new javax.swing.JLabel();
        checkGlucidos = new javax.swing.JCheckBox();
        checkLipidos = new javax.swing.JCheckBox();
        checkVitaminas = new javax.swing.JCheckBox();
        checkProteínas = new javax.swing.JCheckBox();
        checkMinerales = new javax.swing.JCheckBox();
        checkFibra = new javax.swing.JCheckBox();
        txtFibra = new javax.swing.JTextField();
        txtMinerales = new javax.swing.JTextField();
        txtLipidos = new javax.swing.JTextField();
        txtGlucidos = new javax.swing.JTextField();
        txtVitaminas = new javax.swing.JTextField();
        txtProteínas = new javax.swing.JTextField();
        lblGlucidos = new javax.swing.JLabel();
        lblProteínas = new javax.swing.JLabel();
        lblMinerales = new javax.swing.JLabel();
        lblVitaminas = new javax.swing.JLabel();
        lblFibra = new javax.swing.JLabel();
        lblLipidos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblValidarNombre = new javax.swing.JLabel();
        lblValidarTipoAlimento = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblDatosIncorrectos2 = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblTipoAlimentoVacio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
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

        btnConsultasPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultasPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoConsultasPendientes.png"))); // NOI18N
        btnConsultasPendientes.setBorder(null);
        btnConsultasPendientes.setBorderPainted(false);
        btnConsultasPendientes.setContentAreaFilled(false);
        btnConsultasPendientes.setFocusPainted(false);
        btnConsultasPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasPendientesActionPerformed(evt);
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

        lblConsultasPendientes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblConsultasPendientes.setText("Consultas pendientes");

        btnPlanesSolicitados.setForeground(new java.awt.Color(255, 255, 255));
        btnPlanesSolicitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPlanesSolicitados.png"))); // NOI18N
        btnPlanesSolicitados.setBorder(null);
        btnPlanesSolicitados.setBorderPainted(false);
        btnPlanesSolicitados.setContentAreaFilled(false);
        btnPlanesSolicitados.setFocusPainted(false);
        btnPlanesSolicitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanesSolicitadosActionPerformed(evt);
            }
        });

        lblPlanesSolicitados.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPlanesSolicitados.setText("Planes de alimentación");

        lblPlanesSolicitados2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPlanesSolicitados2.setText("solicitados");

        btnIngresarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimentoProfesional.png"))); // NOI18N
        btnIngresarAlimento.setBorder(null);
        btnIngresarAlimento.setBorderPainted(false);
        btnIngresarAlimento.setContentAreaFilled(false);
        btnIngresarAlimento.setFocusPainted(false);
        btnIngresarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoActionPerformed(evt);
            }
        });

        lblIngresarAlimento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimento.setText("Ingresar un alimento");

        lblIngresarAlimento2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIngresarAlimento2.setText("al sistema");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblPlanesSolicitados2))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblIngresarAlimento2))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblIngresarAlimento)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnPlanesSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlanesSolicitados)
                            .addComponent(lblConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnIngresarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(btnConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(32, 32, 32)
                .addComponent(btnConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConsultasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnPlanesSolicitados, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPlanesSolicitados)
                .addGap(18, 18, 18)
                .addComponent(lblPlanesSolicitados2)
                .addGap(53, 53, 53)
                .addComponent(btnIngresarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngresarAlimento2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panelDerecho.setBackground(new java.awt.Color(51, 51, 51));
        panelDerecho.setMaximumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setMinimumSize(new java.awt.Dimension(800, 800));
        panelDerecho.setPreferredSize(new java.awt.Dimension(800, 800));
        panelDerecho.setLayout(new java.awt.CardLayout());

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

        panelNoHayPlanesPendientes.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayPlanesPendientes.setMaximumSize(new java.awt.Dimension(400, 400));
        panelNoHayPlanesPendientes.setMinimumSize(new java.awt.Dimension(400, 400));
        panelNoHayPlanesPendientes.setName(""); // NOI18N
        panelNoHayPlanesPendientes.setLayout(null);

        lblNohayPlanesTexto1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayPlanesTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayPlanesTexto1.setText("No hay planes de");
        panelNoHayPlanesPendientes.add(lblNohayPlanesTexto1);
        lblNohayPlanesTexto1.setBounds(200, 260, 344, 77);

        lblNoHayAlimentosIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCaraTriste.png"))); // NOI18N
        panelNoHayPlanesPendientes.add(lblNoHayAlimentosIcono);
        lblNoHayAlimentosIcono.setBounds(300, 130, 137, 124);

        lblNohayConsultasTexto2.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto2.setText("alimentación pendientes");
        panelNoHayPlanesPendientes.add(lblNohayConsultasTexto2);
        lblNohayConsultasTexto2.setBounds(128, 336, 487, 77);

        lblNoHayAlimentos.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNoHayAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayAlimentos.setText("No hay alimentos registrados");
        panelNoHayPlanesPendientes.add(lblNoHayAlimentos);
        lblNoHayAlimentos.setBounds(90, 300, 610, 77);

        lblNohayPlanesIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N
        panelNoHayPlanesPendientes.add(lblNohayPlanesIcono);
        lblNohayPlanesIcono.setBounds(300, 110, 137, 124);

        panelDerecho.add(panelNoHayPlanesPendientes, "card3");

        panelNoHayConsultasPendientes.setBackground(new java.awt.Color(51, 51, 51));
        panelNoHayConsultasPendientes.setMaximumSize(new java.awt.Dimension(400, 400));
        panelNoHayConsultasPendientes.setMinimumSize(new java.awt.Dimension(400, 400));
        panelNoHayConsultasPendientes.setName(""); // NOI18N
        panelNoHayConsultasPendientes.setPreferredSize(new java.awt.Dimension(400, 400));

        lblNohayConsultasTexto.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayConsultasTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayConsultasTexto.setText("No hay consultas pendientes");

        lblNohayConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        javax.swing.GroupLayout panelNoHayConsultasPendientesLayout = new javax.swing.GroupLayout(panelNoHayConsultasPendientes);
        panelNoHayConsultasPendientes.setLayout(panelNoHayConsultasPendientesLayout);
        panelNoHayConsultasPendientesLayout.setHorizontalGroup(
            panelNoHayConsultasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoHayConsultasPendientesLayout.createSequentialGroup()
                .addGroup(panelNoHayConsultasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNoHayConsultasPendientesLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblNohayConsultasTexto))
                    .addGroup(panelNoHayConsultasPendientesLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(lblNohayConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNoHayConsultasPendientesLayout.setVerticalGroup(
            panelNoHayConsultasPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoHayConsultasPendientesLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblNohayConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblNohayConsultasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelDerecho.add(panelNoHayConsultasPendientes, "card3");

        panelConsultaConProfesional.setBackground(new java.awt.Color(51, 51, 51));
        panelConsultaConProfesional.setMaximumSize(new java.awt.Dimension(800, 800));
        panelConsultaConProfesional.setMinimumSize(new java.awt.Dimension(800, 800));

        lblNombreUsuario.setFont(new java.awt.Font("Levenim MT", 0, 45)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Usuario");

        lblFotoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N

        listaConversaciones.setBackground(new java.awt.Color(238, 238, 238));
        listaConversaciones.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaConversaciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConversacionesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaConversaciones);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elija un usuario:");

        panelConversacionOk.setBackground(new java.awt.Color(51, 51, 51));

        panelMostrarOk.setBackground(new java.awt.Color(51, 51, 51));

        lblOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblOKTexto.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblOKTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblOKTexto.setText("Mensaje Enviado");

        javax.swing.GroupLayout panelMostrarOkLayout = new javax.swing.GroupLayout(panelMostrarOk);
        panelMostrarOk.setLayout(panelMostrarOkLayout);
        panelMostrarOkLayout.setHorizontalGroup(
            panelMostrarOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarOkLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOK)
                .addGap(116, 116, 116))
            .addGroup(panelMostrarOkLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblOKTexto)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelMostrarOkLayout.setVerticalGroup(
            panelMostrarOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarOkLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblOKTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOK, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        panelConversacion.setBackground(new java.awt.Color(51, 51, 51));
        panelConversacion.setOpaque(false);

        btnVerPerfilDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVerPerfilUsuario.png"))); // NOI18N
        btnVerPerfilDeUsuario.setBorderPainted(false);
        btnVerPerfilDeUsuario.setContentAreaFilled(false);
        btnVerPerfilDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPerfilDeUsuarioActionPerformed(evt);
            }
        });

        txtMensajeNuevo.setBackground(new java.awt.Color(238, 238, 238));
        txtMensajeNuevo.setColumns(20);
        txtMensajeNuevo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMensajeNuevo.setRows(5);
        jScrollPane1.setViewportView(txtMensajeNuevo);

        txtMostrarConversacion.setEditable(false);
        txtMostrarConversacion.setBackground(new java.awt.Color(238, 238, 238));
        txtMostrarConversacion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMostrarConversacion.setAutoscrolls(false);
        jScrollPane2.setViewportView(txtMostrarConversacion);

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

        lblVerPerfilUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblVerPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblVerPerfilUsuario.setText("Ver perfil de usuario");

        javax.swing.GroupLayout panelConversacionLayout = new javax.swing.GroupLayout(panelConversacion);
        panelConversacion.setLayout(panelConversacionLayout);
        panelConversacionLayout.setHorizontalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionLayout.createSequentialGroup()
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConversacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConversacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConversacionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblVerPerfilUsuario))
                    .addGroup(panelConversacionLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnVerPerfilDeUsuario)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelConversacionLayout.setVerticalGroup(
            panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerPerfilDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVerPerfilUsuario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConversacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConversacionLayout.createSequentialGroup()
                        .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        javax.swing.GroupLayout panelConversacionOkLayout = new javax.swing.GroupLayout(panelConversacionOk);
        panelConversacionOk.setLayout(panelConversacionOkLayout);
        panelConversacionOkLayout.setHorizontalGroup(
            panelConversacionOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionOkLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(panelConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(panelConversacionOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelConversacionOkLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(panelMostrarOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );
        panelConversacionOkLayout.setVerticalGroup(
            panelConversacionOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversacionOkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
            .addGroup(panelConversacionOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelConversacionOkLayout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(panelMostrarOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(585, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelConsultaConProfesionalLayout = new javax.swing.GroupLayout(panelConsultaConProfesional);
        panelConsultaConProfesional.setLayout(panelConsultaConProfesionalLayout);
        panelConsultaConProfesionalLayout.setHorizontalGroup(
            panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                .addGap(20, 20, Short.MAX_VALUE)
                .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addComponent(lblFotoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelConversacionOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelConsultaConProfesionalLayout.setVerticalGroup(
            panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFotoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelConsultaConProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultaConProfesionalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelConversacionOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDerecho.add(panelConsultaConProfesional, "card4");

        panelElaborarPlan.setBackground(new java.awt.Color(51, 51, 51));
        panelElaborarPlan.setMaximumSize(new java.awt.Dimension(800, 800));
        panelElaborarPlan.setMinimumSize(new java.awt.Dimension(800, 800));
        panelElaborarPlan.setLayout(null);

        lblElaborarNuevoPlan.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblElaborarNuevoPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblElaborarNuevoPlan.setText("Elaborar plan ");
        panelElaborarPlan.add(lblElaborarNuevoPlan);
        lblElaborarNuevoPlan.setBounds(30, 11, 403, 91);

        lblComida.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblComida.setForeground(new java.awt.Color(255, 255, 255));
        lblComida.setText("Comida");
        panelElaborarPlan.add(lblComida);
        lblComida.setBounds(50, 230, 134, 52);

        lblAlimentos.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        lblAlimentos.setText("Alimentos");
        panelElaborarPlan.add(lblAlimentos);
        lblAlimentos.setBounds(310, 110, 167, 44);

        listaDiasDeLaSemana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaDiasDeLaSemana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaDiasDeLaSemanaItemStateChanged(evt);
            }
        });
        listaDiasDeLaSemana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listaDiasDeLaSemanaFocusLost(evt);
            }
        });
        listaDiasDeLaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDiasDeLaSemanaActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(listaDiasDeLaSemana);
        listaDiasDeLaSemana.setBounds(50, 170, 200, 40);

        listaComidasPlan.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaComidasPlan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaComidasPlanItemStateChanged(evt);
            }
        });
        listaComidasPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listaComidasPlanFocusLost(evt);
            }
        });
        listaComidasPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaComidasPlanActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(listaComidasPlan);
        listaComidasPlan.setBounds(50, 290, 200, 40);

        listaAlimentosEnSistema.setBackground(new java.awt.Color(238, 238, 238));
        listaAlimentosEnSistema.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaAlimentosEnSistema.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlimentosEnSistemaValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(listaAlimentosEnSistema);

        panelElaborarPlan.add(jScrollPane8);
        jScrollPane8.setBounds(310, 160, 285, 166);

        lblDia.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblDia.setForeground(new java.awt.Color(255, 255, 255));
        lblDia.setText("Día");
        panelElaborarPlan.add(lblDia);
        lblDia.setBounds(50, 120, 134, 36);

        lblNombrePlan.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblNombrePlan.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePlan.setText("Nombre del plan:");
        panelElaborarPlan.add(lblNombrePlan);
        lblNombrePlan.setBounds(30, 370, 240, 34);

        txtNombrePlan.setBackground(new java.awt.Color(227, 227, 227));
        txtNombrePlan.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombrePlan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombrePlan.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombrePlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombrePlanFocusLost(evt);
            }
        });
        txtNombrePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePlanActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(txtNombrePlan);
        txtNombrePlan.setBounds(260, 370, 181, 38);

        btnAgregarAlPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarAlPlan.png"))); // NOI18N
        btnAgregarAlPlan.setBorderPainted(false);
        btnAgregarAlPlan.setContentAreaFilled(false);
        btnAgregarAlPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlPlanActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(btnAgregarAlPlan);
        btnAgregarAlPlan.setBounds(620, 150, 90, 80);

        btnEliminarDelPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEliminarDelPlan.png"))); // NOI18N
        btnEliminarDelPlan.setBorderPainted(false);
        btnEliminarDelPlan.setContentAreaFilled(false);
        btnEliminarDelPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDelPlanActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(btnEliminarDelPlan);
        btnEliminarDelPlan.setBounds(630, 260, 70, 70);

        lblDesayuno.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblDesayuno.setForeground(new java.awt.Color(255, 255, 255));
        lblDesayuno.setText("Desayuno");
        panelElaborarPlan.add(lblDesayuno);
        lblDesayuno.setBounds(170, 460, 120, 34);

        lblAlmuerzo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        lblAlmuerzo.setText("Almuerzo");
        panelElaborarPlan.add(lblAlmuerzo);
        lblAlmuerzo.setBounds(370, 460, 120, 34);

        lblCena.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblCena.setForeground(new java.awt.Color(255, 255, 255));
        lblCena.setText("Cena");
        panelElaborarPlan.add(lblCena);
        lblCena.setBounds(560, 460, 80, 34);

        lblNombreDelDia.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblNombreDelDia.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelDia.setText("Nombre del dia");
        panelElaborarPlan.add(lblNombreDelDia);
        lblNombreDelDia.setBounds(20, 550, 120, 34);

        btnElaborarPlan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnElaborarPlan1.setBorderPainted(false);
        btnElaborarPlan1.setContentAreaFilled(false);
        btnElaborarPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarPlan1ActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(btnElaborarPlan1);
        btnElaborarPlan1.setBounds(730, 740, 60, 50);

        textAlmuerzo.setBackground(new java.awt.Color(51, 51, 51));
        textAlmuerzo.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        textAlmuerzo.setRows(5);
        jScrollPane10.setViewportView(textAlmuerzo);

        panelElaborarPlan.add(jScrollPane10);
        jScrollPane10.setBounds(350, 520, 160, 240);

        textCena.setBackground(new java.awt.Color(51, 51, 51));
        textCena.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textCena.setForeground(new java.awt.Color(255, 255, 255));
        textCena.setRows(5);
        jScrollPane11.setViewportView(textCena);

        panelElaborarPlan.add(jScrollPane11);
        jScrollPane11.setBounds(540, 520, 160, 240);

        textDesayuno.setBackground(new java.awt.Color(51, 51, 51));
        textDesayuno.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        textDesayuno.setForeground(new java.awt.Color(255, 255, 255));
        textDesayuno.setRows(5);
        jScrollPane12.setViewportView(textDesayuno);

        panelElaborarPlan.add(jScrollPane12);
        jScrollPane12.setBounds(150, 520, 160, 240);

        btnEliminarDelPlan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardarDia.png"))); // NOI18N
        btnEliminarDelPlan1.setBorderPainted(false);
        btnEliminarDelPlan1.setContentAreaFilled(false);
        btnEliminarDelPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDelPlan1ActionPerformed(evt);
            }
        });
        panelElaborarPlan.add(btnEliminarDelPlan1);
        btnEliminarDelPlan1.setBounds(580, 390, 70, 70);

        lblValidarNombrePlan.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNombrePlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        panelElaborarPlan.add(lblValidarNombrePlan);
        lblValidarNombrePlan.setBounds(450, 370, 32, 44);

        lblCena1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCena1.setForeground(new java.awt.Color(255, 255, 255));
        lblCena1.setText("Guardar día");
        panelElaborarPlan.add(lblCena1);
        lblCena1.setBounds(640, 410, 150, 34);

        lblNombrePlanVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNombrePlanVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNombrePlanVacio.setText("Dato vacío");
        panelElaborarPlan.add(lblNombrePlanVacio);
        lblNombrePlanVacio.setBounds(490, 370, 134, 38);

        panelDerecho.add(panelElaborarPlan, "card2");

        panelMostrarPlanEnviado.setBackground(new java.awt.Color(51, 51, 51));
        panelMostrarPlanEnviado.setMaximumSize(new java.awt.Dimension(800, 800));
        panelMostrarPlanEnviado.setMinimumSize(new java.awt.Dimension(800, 800));
        panelMostrarPlanEnviado.setPreferredSize(new java.awt.Dimension(800, 800));

        lblOK2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblOKTexto2.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        lblOKTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblOKTexto2.setText("Plan Enviado");

        javax.swing.GroupLayout panelMostrarPlanEnviadoLayout = new javax.swing.GroupLayout(panelMostrarPlanEnviado);
        panelMostrarPlanEnviado.setLayout(panelMostrarPlanEnviadoLayout);
        panelMostrarPlanEnviadoLayout.setHorizontalGroup(
            panelMostrarPlanEnviadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarPlanEnviadoLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(lblOK2)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(panelMostrarPlanEnviadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMostrarPlanEnviadoLayout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(lblOKTexto2)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );
        panelMostrarPlanEnviadoLayout.setVerticalGroup(
            panelMostrarPlanEnviadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarPlanEnviadoLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblOK2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
            .addGroup(panelMostrarPlanEnviadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMostrarPlanEnviadoLayout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(lblOKTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(365, Short.MAX_VALUE)))
        );

        panelDerecho.add(panelMostrarPlanEnviado, "card2");

        panelPlanAlimentacion.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanAlimentacion.setMaximumSize(new java.awt.Dimension(800, 800));
        panelPlanAlimentacion.setMinimumSize(new java.awt.Dimension(800, 800));
        panelPlanAlimentacion.setPreferredSize(new java.awt.Dimension(800, 800));

        panelIzquierdo.setBackground(new java.awt.Color(51, 51, 51));
        panelIzquierdo.setMaximumSize(new java.awt.Dimension(320, 500));
        panelIzquierdo.setMinimumSize(new java.awt.Dimension(320, 500));
        panelIzquierdo.setPreferredSize(new java.awt.Dimension(320, 500));

        listaPlanesPendientes.setBackground(new java.awt.Color(238, 238, 238));
        listaPlanesPendientes.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPlanesPendientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPlanesPendientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPlanesPendientesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaPlanesPendientes);

        lblElijaUnUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblElijaUnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblElijaUnUsuario.setText("Elija un usuario:");

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblElijaUnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblElijaUnUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelDatosUsuario.setBackground(new java.awt.Color(51, 51, 51));
        panelDatosUsuario.setMaximumSize(new java.awt.Dimension(300, 130));
        panelDatosUsuario.setMinimumSize(new java.awt.Dimension(300, 130));
        panelDatosUsuario.setPreferredSize(new java.awt.Dimension(300, 130));

        lblFotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPerfilDeUsuarioAgrandado.png"))); // NOI18N

        lblNombreUsuario1.setFont(new java.awt.Font("Levenim MT", 0, 40)); // NOI18N
        lblNombreUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario1.setText("Perfil de Usuario");

        javax.swing.GroupLayout panelDatosUsuarioLayout = new javax.swing.GroupLayout(panelDatosUsuario);
        panelDatosUsuario.setLayout(panelDatosUsuarioLayout);
        panelDatosUsuarioLayout.setHorizontalGroup(
            panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelDatosUsuarioLayout.setVerticalGroup(
            panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblFotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        panelPerfilDeUsuario.setBackground(new java.awt.Color(51, 51, 51));
        panelPerfilDeUsuario.setMaximumSize(new java.awt.Dimension(450, 580));
        panelPerfilDeUsuario.setMinimumSize(new java.awt.Dimension(450, 580));
        panelPerfilDeUsuario.setPreferredSize(new java.awt.Dimension(450, 580));

        lblNombreUsuario2.setFont(new java.awt.Font("Levenim MT", 0, 35)); // NOI18N
        lblNombreUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario2.setText("Usuario");

        lblFotoDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N

        lblTxtFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblTxtFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtFechaNacimiento.setText("Fecha de nacimiento:");

        lblFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha del usuario");

        lblTxtRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblTxtRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtRestricciones.setText("Restricciones:");

        listaRestricciones.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(listaRestricciones);

        lblPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblPreferencias.setText("Preferencias:");

        listaPreferencias.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(listaPreferencias);

        lblIngestas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblIngestas.setForeground(new java.awt.Color(255, 255, 255));
        lblIngestas.setText("Ingestas:");

        listaIngestas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(listaIngestas);

        btnElaborarPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEnviarMensaje.png"))); // NOI18N
        btnElaborarPlan.setBorderPainted(false);
        btnElaborarPlan.setContentAreaFilled(false);
        btnElaborarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarPlanActionPerformed(evt);
            }
        });

        lblElaborarPlan.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblElaborarPlan.setForeground(new java.awt.Color(255, 255, 255));
        lblElaborarPlan.setText("Elaborar plan");

        javax.swing.GroupLayout panelPerfilDeUsuarioLayout = new javax.swing.GroupLayout(panelPerfilDeUsuario);
        panelPerfilDeUsuario.setLayout(panelPerfilDeUsuarioLayout);
        panelPerfilDeUsuarioLayout.setHorizontalGroup(
            panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addComponent(lblNombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFotoDeUsuario))
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addComponent(lblTxtFechaNacimiento)
                        .addGap(26, 26, 26)
                        .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPerfilDeUsuarioLayout.createSequentialGroup()
                            .addComponent(lblIngestas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                            .addComponent(lblPreferencias)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                            .addComponent(lblTxtRestricciones)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilDeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElaborarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnElaborarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panelPerfilDeUsuarioLayout.setVerticalGroup(
            panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNombreUsuario2))
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFotoDeUsuario)))
                .addGap(24, 24, 24)
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxtFechaNacimiento)
                    .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxtRestricciones)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreferencias)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblIngestas))
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelPerfilDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnElaborarPlan))
                    .addGroup(panelPerfilDeUsuarioLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblElaborarPlan)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPlanAlimentacionLayout = new javax.swing.GroupLayout(panelPlanAlimentacion);
        panelPlanAlimentacion.setLayout(panelPlanAlimentacionLayout);
        panelPlanAlimentacionLayout.setHorizontalGroup(
            panelPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanAlimentacionLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanAlimentacionLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(panelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanAlimentacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPerfilDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelPlanAlimentacionLayout.setVerticalGroup(
            panelPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanAlimentacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPlanAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPlanAlimentacionLayout.createSequentialGroup()
                        .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPlanAlimentacionLayout.createSequentialGroup()
                        .addComponent(panelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelPerfilDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelDerecho.add(panelPlanAlimentacion, "card4");

        panelNuevoAlimento.setBackground(new java.awt.Color(51, 51, 51));
        panelNuevoAlimento.setMaximumSize(new java.awt.Dimension(800, 800));
        panelNuevoAlimento.setMinimumSize(new java.awt.Dimension(800, 800));
        panelNuevoAlimento.setPreferredSize(new java.awt.Dimension(800, 800));
        panelNuevoAlimento.setLayout(null);

        panelAlimentroRegistradoCorrectamente.setBackground(new java.awt.Color(51, 51, 51));
        panelAlimentroRegistradoCorrectamente.setMaximumSize(new java.awt.Dimension(800, 800));
        panelAlimentroRegistradoCorrectamente.setMinimumSize(new java.awt.Dimension(800, 800));
        panelAlimentroRegistradoCorrectamente.setPreferredSize(new java.awt.Dimension(800, 800));

        lblNoPlanes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoOK.png"))); // NOI18N

        lblNohayPlanesTexto2.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        lblNohayPlanesTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblNohayPlanesTexto2.setText("Alimento registrado");

        javax.swing.GroupLayout panelAlimentroRegistradoCorrectamenteLayout = new javax.swing.GroupLayout(panelAlimentroRegistradoCorrectamente);
        panelAlimentroRegistradoCorrectamente.setLayout(panelAlimentroRegistradoCorrectamenteLayout);
        panelAlimentroRegistradoCorrectamenteLayout.setHorizontalGroup(
            panelAlimentroRegistradoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlimentroRegistradoCorrectamenteLayout.createSequentialGroup()
                .addGroup(panelAlimentroRegistradoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlimentroRegistradoCorrectamenteLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblNohayPlanesTexto2))
                    .addGroup(panelAlimentroRegistradoCorrectamenteLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(lblNoPlanes2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        panelAlimentroRegistradoCorrectamenteLayout.setVerticalGroup(
            panelAlimentroRegistradoCorrectamenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlimentroRegistradoCorrectamenteLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblNoPlanes2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblNohayPlanesTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        panelNuevoAlimento.add(panelAlimentroRegistradoCorrectamente);
        panelAlimentroRegistradoCorrectamente.setBounds(0, 0, 800, 800);

        panelIngresarAlimentoAlSistema.setBackground(new java.awt.Color(51, 51, 51));
        panelIngresarAlimentoAlSistema.setMaximumSize(new java.awt.Dimension(700, 700));
        panelIngresarAlimentoAlSistema.setMinimumSize(new java.awt.Dimension(700, 700));
        panelIngresarAlimentoAlSistema.setPreferredSize(new java.awt.Dimension(700, 700));

        lblNuevoAlimento.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoAlimento.setText("Nuevo Alimento");

        lblIconoNuevoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoIngresarAlimento.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblTipoAlimento.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTipoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoAlimento.setText("Tipo de alimento");

        btnIngresarFotoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
        btnIngresarFotoAlimento.setBorderPainted(false);
        btnIngresarFotoAlimento.setContentAreaFilled(false);
        btnIngresarFotoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFotoAlimentoActionPerformed(evt);
            }
        });

        listaTipoAlimentos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaTipoAlimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Fruta", "Verdura", "Cereal", "Legumbre", "Carne", "Lácteo", "Bebida" }));
        listaTipoAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTipoAlimentosActionPerformed(evt);
            }
        });

        lblPrincipalesNutrientes.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblPrincipalesNutrientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPrincipalesNutrientes.setText("Ingrese los principales nutrientes");

        btnIngresarAlimentoASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarAlimentoASistema.setBorderPainted(false);
        btnIngresarAlimentoASistema.setContentAreaFilled(false);
        btnIngresarAlimentoASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlimentoASistemaActionPerformed(evt);
            }
        });

        checkHidratos.setBackground(new java.awt.Color(51, 51, 51));
        checkHidratos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkHidratos.setForeground(new java.awt.Color(255, 255, 255));
        checkHidratos.setText("Hiidratos de carbono ");
        checkHidratos.setActionCommand("Hiidratos de carbono");
        checkHidratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHidratosActionPerformed(evt);
            }
        });

        txtHidratos.setBackground(new java.awt.Color(227, 227, 227));
        txtHidratos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtHidratos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHidratos.setMaximumSize(new java.awt.Dimension(6, 26));
        txtHidratos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHidratosKeyTyped(evt);
            }
        });

        lblHidratos.setForeground(new java.awt.Color(255, 255, 255));

        checkGlucidos.setBackground(new java.awt.Color(51, 51, 51));
        checkGlucidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkGlucidos.setForeground(new java.awt.Color(255, 255, 255));
        checkGlucidos.setText("Glúcidos");
        checkGlucidos.setActionCommand("Hiidratos de carbono");
        checkGlucidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGlucidosActionPerformed(evt);
            }
        });

        checkLipidos.setBackground(new java.awt.Color(51, 51, 51));
        checkLipidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkLipidos.setForeground(new java.awt.Color(255, 255, 255));
        checkLipidos.setText("Lípidos");
        checkLipidos.setActionCommand("Hiidratos de carbono");
        checkLipidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLipidosActionPerformed(evt);
            }
        });

        checkVitaminas.setBackground(new java.awt.Color(51, 51, 51));
        checkVitaminas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkVitaminas.setForeground(new java.awt.Color(255, 255, 255));
        checkVitaminas.setText("Vitaminas");
        checkVitaminas.setActionCommand("Hiidratos de carbono");
        checkVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVitaminasActionPerformed(evt);
            }
        });

        checkProteínas.setBackground(new java.awt.Color(51, 51, 51));
        checkProteínas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkProteínas.setForeground(new java.awt.Color(255, 255, 255));
        checkProteínas.setText("Proteínas");
        checkProteínas.setActionCommand("Hiidratos de carbono");
        checkProteínas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProteínasActionPerformed(evt);
            }
        });

        checkMinerales.setBackground(new java.awt.Color(51, 51, 51));
        checkMinerales.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkMinerales.setForeground(new java.awt.Color(255, 255, 255));
        checkMinerales.setText("Minerales");
        checkMinerales.setActionCommand("Hiidratos de carbono");
        checkMinerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMineralesActionPerformed(evt);
            }
        });

        checkFibra.setBackground(new java.awt.Color(51, 51, 51));
        checkFibra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        checkFibra.setForeground(new java.awt.Color(255, 255, 255));
        checkFibra.setText("Fibras");
        checkFibra.setActionCommand("Hiidratos de carbono");
        checkFibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFibraActionPerformed(evt);
            }
        });

        txtFibra.setBackground(new java.awt.Color(227, 227, 227));
        txtFibra.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtFibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFibra.setMaximumSize(new java.awt.Dimension(6, 26));
        txtFibra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFibraKeyTyped(evt);
            }
        });

        txtMinerales.setBackground(new java.awt.Color(227, 227, 227));
        txtMinerales.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtMinerales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMinerales.setMaximumSize(new java.awt.Dimension(6, 26));
        txtMinerales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMineralesKeyTyped(evt);
            }
        });

        txtLipidos.setBackground(new java.awt.Color(227, 227, 227));
        txtLipidos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtLipidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLipidos.setMaximumSize(new java.awt.Dimension(6, 26));
        txtLipidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLipidosKeyTyped(evt);
            }
        });

        txtGlucidos.setBackground(new java.awt.Color(227, 227, 227));
        txtGlucidos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtGlucidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGlucidos.setMaximumSize(new java.awt.Dimension(6, 26));
        txtGlucidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGlucidosKeyTyped(evt);
            }
        });

        txtVitaminas.setBackground(new java.awt.Color(227, 227, 227));
        txtVitaminas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtVitaminas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtVitaminas.setMaximumSize(new java.awt.Dimension(6, 26));
        txtVitaminas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVitaminasKeyTyped(evt);
            }
        });

        txtProteínas.setBackground(new java.awt.Color(227, 227, 227));
        txtProteínas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtProteínas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProteínas.setMaximumSize(new java.awt.Dimension(6, 26));
        txtProteínas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProteínasKeyTyped(evt);
            }
        });

        lblGlucidos.setForeground(new java.awt.Color(255, 255, 255));

        lblProteínas.setForeground(new java.awt.Color(255, 255, 255));

        lblMinerales.setForeground(new java.awt.Color(255, 255, 255));

        lblVitaminas.setForeground(new java.awt.Color(255, 255, 255));

        lblFibra.setForeground(new java.awt.Color(255, 255, 255));

        lblLipidos.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Las proporciones de");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ingresarse en gramos.");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("los alimentos deben de");

        lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblValidarNombreFocusLost(evt);
            }
        });

        lblValidarTipoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarTipoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
        lblValidarTipoAlimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblValidarTipoAlimentoFocusGained(evt);
            }
        });

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setText("Aún quedan datos");

        lblDatosIncorrectos2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos2.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos2.setText("incorrectos");

        lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNombreVacio.setText("Dato vacío");

        lblTipoAlimentoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblTipoAlimentoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblTipoAlimentoVacio.setText("Dato vacío");

        javax.swing.GroupLayout panelIngresarAlimentoAlSistemaLayout = new javax.swing.GroupLayout(panelIngresarAlimentoAlSistema);
        panelIngresarAlimentoAlSistema.setLayout(panelIngresarAlimentoAlSistemaLayout);
        panelIngresarAlimentoAlSistemaLayout.setHorizontalGroup(
            panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblIconoNuevoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNuevoAlimento))
                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(lblHidratos)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkProteínas)
                            .addComponent(checkHidratos)
                            .addComponent(checkVitaminas)
                            .addComponent(checkGlucidos)
                            .addComponent(checkMinerales)
                            .addComponent(checkFibra)
                            .addComponent(checkLipidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLipidos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFibra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinerales, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGlucidos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVitaminas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHidratos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProteínas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnIngresarAlimentoASistema, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDatosIncorrectos2)
                                    .addComponent(lblDatosIncorrectos))
                                .addGap(18, 18, 18))))
                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addComponent(lblTipoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIngresarFotoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrincipalesNutrientes, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblValidarNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNombreVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                        .addComponent(listaTipoAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblValidarTipoAlimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTipoAlimentoVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(lblGlucidos)
                    .addGap(334, 334, 334)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(376, Short.MAX_VALUE)
                    .addComponent(lblProteínas)
                    .addGap(324, 324, 324)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(386, Short.MAX_VALUE)
                    .addComponent(lblMinerales)
                    .addGap(314, 314, 314)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(396, Short.MAX_VALUE)
                    .addComponent(lblVitaminas)
                    .addGap(304, 304, 304)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(406, Short.MAX_VALUE)
                    .addComponent(lblFibra)
                    .addGap(294, 294, 294)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(416, Short.MAX_VALUE)
                    .addComponent(lblLipidos)
                    .addGap(284, 284, 284)))
        );
        panelIngresarAlimentoAlSistemaLayout.setVerticalGroup(
            panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIconoNuevoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuevoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValidarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblTipoAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(listaTipoAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValidarTipoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipoAlimentoVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(lblPrincipalesNutrientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresarFotoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)))
                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblHidratos))
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkHidratos)
                                    .addComponent(txtHidratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkProteínas)
                                    .addComponent(txtProteínas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtVitaminas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(checkVitaminas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGlucidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkGlucidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                        .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMinerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDatosIncorrectos2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                        .addComponent(checkMinerales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkFibra)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLipidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkLipidos))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                                .addComponent(btnIngresarAlimentoASistema, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                        .addComponent(lblDatosIncorrectos)
                        .addGap(131, 131, 131))))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(491, Short.MAX_VALUE)
                    .addComponent(lblGlucidos)
                    .addGap(221, 221, 221)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(501, Short.MAX_VALUE)
                    .addComponent(lblProteínas)
                    .addGap(211, 211, 211)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(511, Short.MAX_VALUE)
                    .addComponent(lblMinerales)
                    .addGap(201, 201, 201)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(521, Short.MAX_VALUE)
                    .addComponent(lblVitaminas)
                    .addGap(191, 191, 191)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(531, Short.MAX_VALUE)
                    .addComponent(lblFibra)
                    .addGap(181, 181, 181)))
            .addGroup(panelIngresarAlimentoAlSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarAlimentoAlSistemaLayout.createSequentialGroup()
                    .addContainerGap(541, Short.MAX_VALUE)
                    .addComponent(lblLipidos)
                    .addGap(171, 171, 171)))
        );

        panelNuevoAlimento.add(panelIngresarAlimentoAlSistema);
        panelIngresarAlimentoAlSistema.setBounds(0, 0, 800, 800);

        panelDerecho.add(panelNuevoAlimento, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDerecho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultasPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasPendientesActionPerformed
        ocultarPaneles();
        this.panelConsultaConProfesional.setVisible(true);
        this.listaConversaciones.setSelectedIndex(0);
        String[] lista = this.sistema.getListaNombresUsuariosConversacionesPendientes(sistema.getPersonaLogueada().getNombreCompleto());
        if (lista.length > 0) {
            this.listaConversaciones.setListData(lista);
        } else {
            ocultarPaneles();
            this.panelNoHayConsultasPendientes.setVisible(true);
        }
        this.btnConsultasPendientes.setEnabled(false);
    }//GEN-LAST:event_btnConsultasPendientesActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPlanesSolicitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanesSolicitadosActionPerformed
        ocultarPaneles();
        this.btnPlanesSolicitados.setEnabled(false);
        if (sistema.getListaAlimentos().size() <= 0) {
            this.panelNoHayPlanesPendientes.setVisible(true);
            this.lblNohayPlanesTexto1.setVisible(false);
            this.lblNohayConsultasTexto2.setVisible(false);
            this.lblNoHayAlimentos.setVisible(true);
            this.lblNoHayAlimentosIcono.setVisible(true);
            this.lblNohayPlanesIcono.setVisible(false);
        } else {
            this.panelPlanAlimentacion.setVisible(true);
            this.panelPerfilDeUsuario.setVisible(false);
            this.btnPlanesSolicitados.setEnabled(false);
            this.listaPlanesPendientes.setSelectedIndex(0);
            String nombreProfesionalLogueado = sistema.getPersonaLogueada().getNombreCompleto();
            Profesional profesionalLogueado = sistema.getProfesionalPorNombre(nombreProfesionalLogueado);
            String[] lista = this.sistema.getListaPlanesPendientes(profesionalLogueado);
            if (lista.length > 0) {
                this.listaPlanesPendientes.setListData(lista);
            } else {
                ocultarPaneles();
                this.panelNoHayPlanesPendientes.setVisible(true);
                this.lblNohayPlanesTexto1.setVisible(true);
                this.lblNohayConsultasTexto2.setVisible(true);
                this.lblNoHayAlimentos.setVisible(false);
                this.lblNoHayAlimentosIcono.setVisible(false);
                this.lblNohayPlanesIcono.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnPlanesSolicitadosActionPerformed

    private void listaConversacionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConversacionesValueChanged
        this.panelConversacionOk.setVisible(true);
        this.panelMostrarOk.setVisible(false);
        this.panelConversacion.setVisible(true);
        if (this.listaConversaciones.getSelectedValue() != null) {
            this.usuarioSeleccionado = this.listaConversaciones.getSelectedValue();
        }
        actualizarConversaciones(this.usuarioSeleccionado);
    }//GEN-LAST:event_listaConversacionesValueChanged

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        String mensaje = this.txtMensajeNuevo.getText();
        String usuario = this.usuarioSeleccionado;
        String profesional = this.sistema.getPersonaLogueada().getNombreCompleto();
        this.sistema.agregarMensajeConversacion(profesional, usuario, mensaje, true, true);
        this.txtMensajeNuevo.setText("");
        this.txtMostrarConversacion.setText("");
        this.lblNombreUsuario.setText("Usuario");
        this.panelConversacionOk.setVisible(true);
        this.panelConversacion.setVisible(false);
        this.panelMostrarOk.setVisible(true);
        String[] listaUsuariosConversacionesPendientes = sistema.getListaNombresUsuariosConversacionesPendientes(profesional);
        if (listaUsuariosConversacionesPendientes.length > 0) {
            this.listaConversaciones.setListData(listaUsuariosConversacionesPendientes);
        } else {
            ocultarPaneles();
            this.panelNoHayConsultasPendientes.setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnIngresarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoActionPerformed
        ocultarPaneles();
        this.btnIngresarAlimento.setEnabled(false);
        this.panelNuevoAlimento.setVisible(true);
        this.panelIngresarAlimentoAlSistema.setVisible(true);
    }//GEN-LAST:event_btnIngresarAlimentoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnIngresarFotoAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoAlimentoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("PNG", "png");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon iconoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            btnIngresarFotoAlimento.setIcon(iconoPerfil);
            this.setFotoDeAlimentoActual(iconoPerfil);
        }
    }//GEN-LAST:event_btnIngresarFotoAlimentoActionPerformed

    private void listaTipoAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTipoAlimentosActionPerformed
        String tipoAlimentoIngresado = (String) this.listaTipoAlimentos.getSelectedItem();
        if (tipoAlimentoIngresado.equals("Seleccione...")) {
            this.lblValidarTipoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTipoAlimento.setVisible(true);
            this.lblTipoAlimentoVacio.setVisible(true);
        } else {
            this.lblValidarTipoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarTipoAlimento.setVisible(true);
            this.lblTipoAlimentoVacio.setVisible(false);
        }
    }//GEN-LAST:event_listaTipoAlimentosActionPerformed

    private void btnIngresarAlimentoASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlimentoASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String tipoAlimento = (String) this.listaTipoAlimentos.getSelectedItem();
        ArrayList<ComposicionAlimento> listaNutrientesConProporcion = nutrientesSeleccionados();
        if (nombre.equals("") || tipoAlimento.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            this.lblDatosIncorrectos2.setVisible(true);
            mostrarErrores(nombre, tipoAlimento);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            this.lblDatosIncorrectos2.setVisible(false);
            boolean seAgregoAlimento = this.getSistema().crearAlimento(nombre, tipoAlimento, listaNutrientesConProporcion, fotoDeAlimentoActual);
            if (seAgregoAlimento) {
                this.txtNombre.setText("");
                this.listaTipoAlimentos.setSelectedIndex(0);
                this.panelAlimentroRegistradoCorrectamente.setVisible(true);
                this.btnIngresarAlimento.setEnabled(true);
                this.lblValidarNombre.setVisible(false);
                this.lblValidarTipoAlimento.setVisible(false);
                this.lblTipoAlimentoVacio.setVisible(false);
                this.lblNombreVacio.setVisible(false);
                ocultarCheckbox();
                this.panelIngresarAlimentoAlSistema.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnIngresarAlimentoASistemaActionPerformed

    private void btnVerPerfilDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPerfilDeUsuarioActionPerformed
        MostrarPerfilUsuario perfil = new MostrarPerfilUsuario(getSistema(), usuarioSeleccionado);
        perfil.setVisible(true);
    }//GEN-LAST:event_btnVerPerfilDeUsuarioActionPerformed

    private void checkHidratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHidratosActionPerformed
        if (!this.nutrientesSeleccionados[0]) {
            this.lblHidratos.setVisible(true);
            this.txtHidratos.setVisible(true);
            this.nutrientesSeleccionados[0] = true;
        } else {
            this.lblHidratos.setVisible(false);
            this.txtHidratos.setVisible(false);
            this.nutrientesSeleccionados[0] = false;
        }
    }//GEN-LAST:event_checkHidratosActionPerformed

    private void checkGlucidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGlucidosActionPerformed
        if (!this.nutrientesSeleccionados[1]) {
            this.txtGlucidos.setVisible(true);
            this.lblGlucidos.setVisible(true);
            this.nutrientesSeleccionados[1] = true;
        } else {
            this.txtGlucidos.setVisible(false);
            this.lblGlucidos.setVisible(false);
            this.nutrientesSeleccionados[1] = false;
        }
    }//GEN-LAST:event_checkGlucidosActionPerformed

    private void checkLipidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLipidosActionPerformed
        if (!this.nutrientesSeleccionados[2]) {
            this.txtLipidos.setVisible(true);
            this.lblLipidos.setVisible(true);
            this.nutrientesSeleccionados[2] = true;
        } else {
            txtLipidos.setVisible(false);
            lblLipidos.setVisible(false);
            nutrientesSeleccionados[2] = false;
        }
    }//GEN-LAST:event_checkLipidosActionPerformed

    private void checkProteínasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProteínasActionPerformed
        if (!nutrientesSeleccionados[3]) {
            txtProteínas.setVisible(true);
            lblProteínas.setVisible(true);
            nutrientesSeleccionados[3] = true;
        } else {
            txtProteínas.setVisible(false);
            lblProteínas.setVisible(false);
            nutrientesSeleccionados[3] = false;
        }
    }//GEN-LAST:event_checkProteínasActionPerformed

    private void checkMineralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMineralesActionPerformed
        if (!nutrientesSeleccionados[4]) {
            txtMinerales.setVisible(true);
            lblMinerales.setVisible(true);
            nutrientesSeleccionados[4] = true;
        } else {
            txtMinerales.setVisible(false);
            lblMinerales.setVisible(false);
            nutrientesSeleccionados[4] = false;
        }
    }//GEN-LAST:event_checkMineralesActionPerformed

    private void checkFibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFibraActionPerformed
        if (!nutrientesSeleccionados[5]) {
            txtFibra.setVisible(true);
            lblFibra.setVisible(true);
            nutrientesSeleccionados[5] = true;
        } else {
            txtFibra.setVisible(false);
            lblFibra.setVisible(false);
            nutrientesSeleccionados[5] = false;
        }

    }//GEN-LAST:event_checkFibraActionPerformed

    private void checkVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVitaminasActionPerformed
        if (!nutrientesSeleccionados[6]) {
            txtVitaminas.setVisible(true);
            lblVitaminas.setVisible(true);
            nutrientesSeleccionados[6] = true;
        } else {
            txtVitaminas.setVisible(false);
            lblVitaminas.setVisible(false);
            nutrientesSeleccionados[6] = false;
        }
    }//GEN-LAST:event_checkVitaminasActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombreIngresado = txtNombre.getText();
        if (nombreIngresado.equals("")) {
            lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        } else {
            lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void lblValidarNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarNombreFocusGained

    }//GEN-LAST:event_lblValidarNombreFocusGained

    private void lblValidarTipoAlimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarTipoAlimentoFocusGained

    }//GEN-LAST:event_lblValidarTipoAlimentoFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void lblValidarNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblValidarNombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lblValidarNombreFocusLost

    private void listaPlanesPendientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPlanesPendientesValueChanged
        this.usuarioSeleccionado = this.listaPlanesPendientes.getSelectedValue();
        Usuario usuarioPerfil = (Usuario) sistema.getUsuarioPorNombre(usuarioSeleccionado);
        this.lblNombreUsuario2.setText(usuarioSeleccionado);
        lblFechaNacimiento.setText(usuarioPerfil.getFechaNacimiento());
        lblFotoDeUsuario.setIcon(usuarioPerfil.getFotoDePerfil());
        if (usuarioPerfil.getArrayAlimentosIngeridos().length > 0) {
            ArrayList<Ingesta> ingeridos = usuarioPerfil.getAlimentosIngeridos();
            ArrayList<String> listaASetear = new ArrayList<>();
            for (int i = 0; i < ingeridos.size(); i++) {
                Ingesta ingestaActual = ingeridos.get(i);
                ArrayList<Alimento> alimentosActuales = ingestaActual.getListaAlimentosPorFecha();
                for (int j = 0; j < alimentosActuales.size(); j++) {
                    listaASetear.add(alimentosActuales.get(i).toString());
                }
            }
            String[] arrayASetear = new String[listaASetear.size()];
            for (int i = 0; i < listaASetear.size(); i++) {
                arrayASetear[i] = listaASetear.get(i);
            }
            this.listaIngestas.setListData(arrayASetear);
        }
        if (usuarioPerfil.getArrayPreferencias().length > 0) {
            listaPreferencias.setListData(usuarioPerfil.getArrayPreferencias());
        }
        if (usuarioPerfil.getArrayRestricciones().length > 0) {
            listaRestricciones.setListData(usuarioPerfil.getArrayRestricciones());
        }
        this.panelDatosUsuario.setVisible(true);
        this.panelPerfilDeUsuario.setVisible(true);
    }//GEN-LAST:event_listaPlanesPendientesValueChanged

    private void btnElaborarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarPlanActionPerformed
        ocultarPaneles();
        cargarListaDiasDeLaSemana();
        cargarListaIngestasPorDia();
        this.listaAlimentosEnSistema.setListData(sistema.getListaAlimentos().toArray());
        this.lblNombreDelDia.setText("Lunes");
        this.panelElaborarPlan.setVisible(true);
        this.listaAlimentosEnSistema.setSelectedIndex(0);
    }//GEN-LAST:event_btnElaborarPlanActionPerformed

    private void listaDiasDeLaSemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaItemStateChanged

        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        this.diaDeLaSemanaActual = diaSeleccionado;
        this.lblNombreDelDia.setText(this.diaDeLaSemanaActual);
        switch (this.diaDeLaSemanaActual) {
            case "Lunes":
                this.textDesayuno.setText(this.planAlimentacion[0][0]);
                this.textCena.setText(this.planAlimentacion[0][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[0][1]);
                break;
            case "Martes":
                this.textDesayuno.setText(this.planAlimentacion[1][0]);
                this.textCena.setText(this.planAlimentacion[1][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[1][1]);
                break;
            case "Miercoles":
                this.textDesayuno.setText(this.planAlimentacion[2][0]);
                this.textCena.setText(this.planAlimentacion[2][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[2][1]);
                break;
            case "Jueves":
                this.textDesayuno.setText(this.planAlimentacion[3][0]);
                this.textCena.setText(this.planAlimentacion[3][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[3][1]);
                break;
            case "Viernes":
                this.textDesayuno.setText(this.planAlimentacion[4][0]);
                this.textCena.setText(this.planAlimentacion[4][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[4][1]);
                break;
            case "Sabado":
                this.textDesayuno.setText(this.planAlimentacion[5][0]);
                this.textCena.setText(this.planAlimentacion[5][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[5][1]);
                break;
            case "Domingo":
                this.textDesayuno.setText(this.planAlimentacion[6][0]);
                this.textCena.setText(this.planAlimentacion[6][2]);
                this.textAlmuerzo.setText(this.planAlimentacion[6][1]);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_listaDiasDeLaSemanaItemStateChanged

    private void listaDiasDeLaSemanaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDiasDeLaSemanaFocusLost

    private void listaDiasDeLaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDiasDeLaSemanaActionPerformed

    }//GEN-LAST:event_listaDiasDeLaSemanaActionPerformed

    private void listaComidasPlanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaComidasPlanItemStateChanged

    }//GEN-LAST:event_listaComidasPlanItemStateChanged

    private void listaComidasPlanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaComidasPlanFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_listaComidasPlanFocusLost

    private void listaComidasPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaComidasPlanActionPerformed

    }//GEN-LAST:event_listaComidasPlanActionPerformed

    private void listaAlimentosEnSistemaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlimentosEnSistemaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAlimentosEnSistemaValueChanged

    private void txtNombrePlanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombrePlanFocusLost
        String nombrePlanIngresado = this.txtNombrePlan.getText();
        if (nombrePlanIngresado.equals("")) {
            this.lblValidarNombrePlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombrePlan.setVisible(true);
            this.lblNombrePlanVacio.setVisible(true);
        } else {
            this.lblValidarNombrePlan.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNombrePlan.setVisible(true);
            this.lblNombrePlanVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombrePlanFocusLost

    private void txtNombrePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePlanActionPerformed

    private void btnAgregarAlPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlPlanActionPerformed
        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        this.diaDeLaSemanaAnterior = diaSeleccionado;
        String ingestaSeleccionada = (String) this.listaComidasPlan.getSelectedItem();
        String alimentoAgregado = this.listaAlimentosEnSistema.getSelectedValue().toString();
        String textoAnterior = "";
        switch (ingestaSeleccionada) {
            case "Desayuno":
                textoAnterior = this.textDesayuno.getText();
                if (textoAnterior.equals("")) {
                    textoAnterior = alimentoAgregado;
                } else {
                    textoAnterior += "\n" + alimentoAgregado;
                }
                this.textDesayuno.setText(textoAnterior);
                break;
            case "Almuerzo":
                textoAnterior = this.textAlmuerzo.getText();
                if (textoAnterior.equals("")) {
                    textoAnterior = alimentoAgregado;
                } else {
                    textoAnterior += "\n" + alimentoAgregado;
                }
                this.textAlmuerzo.setText(textoAnterior);
                break;
            case "Cena":
                textoAnterior = this.textCena.getText();
                if (textoAnterior.equals("")) {
                    textoAnterior = alimentoAgregado;
                } else {
                    textoAnterior += "\n" + alimentoAgregado;
                }
                this.textCena.setText(textoAnterior);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnAgregarAlPlanActionPerformed

    private void btnEliminarDelPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDelPlanActionPerformed
        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        String ingestaSeleccionada = (String) this.listaComidasPlan.getSelectedItem();
        String alimentoEliminado = this.listaAlimentosEnSistema.getSelectedValue().toString();
        String aRemplazar = "";
        String remplazado = "";
        CharSequence secuencia = "\n";
        switch (ingestaSeleccionada) {
            case "Desayuno":
                aRemplazar = this.textDesayuno.getText();
                if (aRemplazar.contains(secuencia)) {
                    alimentoEliminado += "\n";
                }
                remplazado = aRemplazar.replaceFirst(alimentoEliminado, "");
                this.textDesayuno.setText(remplazado);
                break;
            case "Almuerzo":
                aRemplazar = this.textAlmuerzo.getText();
                if (aRemplazar.contains(secuencia)) {
                    alimentoEliminado += "\n";
                }
                remplazado = aRemplazar.replaceFirst(alimentoEliminado, "");
                this.textAlmuerzo.setText(remplazado);
                break;
            case "Cena":
                aRemplazar = this.textCena.getText();
                if (aRemplazar.contains(secuencia)) {
                    alimentoEliminado += "\n";
                }
                remplazado = aRemplazar.replaceFirst(alimentoEliminado, "");
                this.textCena.setText(remplazado);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnEliminarDelPlanActionPerformed

    private void btnElaborarPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarPlan1ActionPerformed
        String nombreDelPlan = this.txtNombrePlan.getText();
        if (nombreDelPlan.equals("")) {
            this.lblNombrePlanVacio.setVisible(true);
            this.lblValidarNombrePlan.setVisible(true);
        } else {
            String nombreProfesionalLogueado = sistema.getPersonaLogueada().getNombreCompleto();
            Profesional profesionalLogueado = sistema.getProfesionalPorNombre(nombreProfesionalLogueado);
            Usuario usuarioPerfil = (Usuario) sistema.getUsuarioPorNombre(usuarioSeleccionado);
            boolean fueAtendidoElPlan = this.sistema.atenderSolicitudDelPlan(planAlimentacion, profesionalLogueado, usuarioPerfil, nombreDelPlan);
            if (fueAtendidoElPlan) {
                ocultarPaneles();
                this.panelMostrarPlanEnviado.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnElaborarPlan1ActionPerformed

    private void btnEliminarDelPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDelPlan1ActionPerformed
        guardarDatosDelPlan();
    }//GEN-LAST:event_btnEliminarDelPlan1ActionPerformed

    private void txtHidratosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHidratosKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtHidratosKeyTyped

    private void txtProteínasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProteínasKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }

    }//GEN-LAST:event_txtProteínasKeyTyped

    private void txtVitaminasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVitaminasKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }

    }//GEN-LAST:event_txtVitaminasKeyTyped

    private void txtGlucidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGlucidosKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtGlucidosKeyTyped

    private void txtMineralesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMineralesKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtMineralesKeyTyped

    private void txtFibraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFibraKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFibraKeyTyped

    private void txtLipidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLipidosKeyTyped
        char ingresado = evt.getKeyChar();
        if (ingresado < '0') {
            evt.consume();
        }
        if (ingresado >= 'a' && ingresado <= 'z' || ingresado >= 'A' && ingresado <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtLipidosKeyTyped

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        AyudaProfesional ayuda = new AyudaProfesional(sistema);
        ayuda.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void ocultarPaneles() {
        this.btnConsultasPendientes.setEnabled(true);
        this.btnIngresarAlimento.setEnabled(true);
        this.btnPlanesSolicitados.setEnabled(true);
        this.panelConsultaConProfesional.setVisible(false);
        this.txtMostrarConversacion.setText("");
        this.panelConversacion.setVisible(false);
        this.panelMostrarOk.setVisible(false);
        this.panelNoHayConsultasPendientes.setVisible(false);
        this.panelNuevoAlimento.setVisible(false);
        this.panelIngresarAlimentoAlSistema.setVisible(false);
        this.panelPlanAlimentacion.setVisible(false);
        this.panelNoHayPlanesPendientes.setVisible(false);
        this.panelMostrarPlanEnviado.setVisible(false);
        this.panelVacio.setVisible(false);
        this.panelDatosUsuario.setVisible(false);
        this.panelElaborarPlan.setVisible(false);
        this.panelPerfilDeUsuario.setVisible(false);
        this.lblTipoAlimentoVacio.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblValidarNombrePlan.setVisible(false);
        this.lblNombrePlanVacio.setVisible(false);
        this.panelAlimentroRegistradoCorrectamente.setVisible(false);
        this.panelVacio.setVisible(false);
    }

    private void actualizarConversaciones(String remitente) {
        if (remitente != null) {
            String destinatario = sistema.getPersonaLogueada().getNombreCompleto();
            String conversacion = sistema.getConversacion(destinatario, remitente);
            txtMostrarConversacion.setText(conversacion);
            lblNombreUsuario.setText(usuarioSeleccionado);
            listaConversaciones.setListData(sistema.getListaNombresUsuariosConversacionesPendientes(destinatario));
        }
    }

    void restaurar(String nombreUsuario) {
        panelConversacionOk.setVisible(true);
        panelMostrarOk.setVisible(false);
        panelConversacion.setVisible(true);
        usuarioSeleccionado = nombreUsuario;
        actualizarConversaciones(usuarioSeleccionado);
    }

    void ocultarPrincipalesNutrientes() {
        txtHidratos.setVisible(false);
        lblHidratos.setVisible(false);
        txtProteínas.setVisible(false);
        lblProteínas.setVisible(false);
        txtVitaminas.setVisible(false);
        lblVitaminas.setVisible(false);
        txtGlucidos.setVisible(false);
        lblGlucidos.setVisible(false);
        txtMinerales.setVisible(false);
        lblMinerales.setVisible(false);
        txtFibra.setVisible(false);
        lblFibra.setVisible(false);
        txtLipidos.setVisible(false);
        lblLipidos.setVisible(false);
        for (int i = 0; i < nutrientesSeleccionados.length; i++) {
            nutrientesSeleccionados[i] = false;
        }
    }

    ArrayList<ComposicionAlimento> nutrientesSeleccionados() {
        ArrayList<ComposicionAlimento> listaRetorno = new ArrayList<>();
        if (checkFibra.isSelected()) {
            String proporcionIngresada = txtFibra.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Fibras", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkGlucidos.isSelected()) {
            String proporcionIngresada = txtGlucidos.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Glucidos", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkHidratos.isSelected()) {
            String proporcionIngresada = txtHidratos.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Hidratos de carbono", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkLipidos.isSelected()) {
            String proporcionIngresada = txtLipidos.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Lipidos", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkMinerales.isSelected()) {
            String proporcionIngresada = txtMinerales.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Minerales", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkProteínas.isSelected()) {
            String proporcionIngresada = txtProteínas.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Proteinas", proporcion);
                listaRetorno.add(nueva);
            }
        }
        if (checkVitaminas.isSelected()) {
            String proporcionIngresada = txtVitaminas.getText();
            if (!proporcionIngresada.equals("")) {
                float proporcion = Integer.parseInt(proporcionIngresada);
                ComposicionAlimento nueva = new ComposicionAlimento("Vitaminas", proporcion);
                listaRetorno.add(nueva);
            }
        }
        return listaRetorno;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlPlan;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnConsultasPendientes;
    private javax.swing.JButton btnElaborarPlan;
    private javax.swing.JButton btnElaborarPlan1;
    private javax.swing.JButton btnEliminarDelPlan;
    private javax.swing.JButton btnEliminarDelPlan1;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarAlimento;
    private javax.swing.JButton btnIngresarAlimentoASistema;
    private javax.swing.JButton btnIngresarFotoAlimento;
    private javax.swing.JButton btnPlanesSolicitados;
    private javax.swing.JButton btnVerPerfilDeUsuario;
    private javax.swing.JCheckBox checkFibra;
    private javax.swing.JCheckBox checkGlucidos;
    private javax.swing.JCheckBox checkHidratos;
    private javax.swing.JCheckBox checkLipidos;
    private javax.swing.JCheckBox checkMinerales;
    private javax.swing.JCheckBox checkProteínas;
    private javax.swing.JCheckBox checkVitaminas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblAlimentos;
    private javax.swing.JLabel lblAlmuerzo;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblCena1;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblConsultasPendientes;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblDatosIncorrectos2;
    private javax.swing.JLabel lblDesayuno;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblElaborarNuevoPlan;
    private javax.swing.JLabel lblElaborarPlan;
    private javax.swing.JLabel lblElijaUnUsuario;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFibra;
    private javax.swing.JLabel lblFotoDeUsuario;
    private javax.swing.JLabel lblFotoProfesional;
    private javax.swing.JLabel lblFotoUsuario;
    private javax.swing.JLabel lblGlucidos;
    private javax.swing.JLabel lblHidratos;
    private javax.swing.JLabel lblIconoNuevoAlimento;
    private javax.swing.JLabel lblIngestas;
    private javax.swing.JLabel lblIngresarAlimento;
    private javax.swing.JLabel lblIngresarAlimento2;
    private javax.swing.JLabel lblLipidos;
    private javax.swing.JLabel lblMinerales;
    private javax.swing.JLabel lblNoHayAlimentos;
    private javax.swing.JLabel lblNoHayAlimentosIcono;
    private javax.swing.JLabel lblNoPlanes2;
    private javax.swing.JLabel lblNohayConsultas;
    private javax.swing.JLabel lblNohayConsultasTexto;
    private javax.swing.JLabel lblNohayConsultasTexto2;
    private javax.swing.JLabel lblNohayPlanesIcono;
    private javax.swing.JLabel lblNohayPlanesTexto1;
    private javax.swing.JLabel lblNohayPlanesTexto2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDelDia;
    private javax.swing.JLabel lblNombrePlan;
    private javax.swing.JLabel lblNombrePlanVacio;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombreUsuario1;
    private javax.swing.JLabel lblNombreUsuario2;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblNuevoAlimento;
    private javax.swing.JLabel lblOK;
    private javax.swing.JLabel lblOK2;
    private javax.swing.JLabel lblOKTexto;
    private javax.swing.JLabel lblOKTexto2;
    private javax.swing.JLabel lblPlanesSolicitados;
    private javax.swing.JLabel lblPlanesSolicitados2;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JLabel lblPrincipalesNutrientes;
    private javax.swing.JLabel lblProteínas;
    private javax.swing.JLabel lblTipoAlimento;
    private javax.swing.JLabel lblTipoAlimentoVacio;
    private javax.swing.JLabel lblTxtFechaNacimiento;
    private javax.swing.JLabel lblTxtRestricciones;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JLabel lblValidarNombrePlan;
    private javax.swing.JLabel lblValidarTipoAlimento;
    private javax.swing.JLabel lblVerPerfilUsuario;
    private javax.swing.JLabel lblVitaminas;
    private javax.swing.JList listaAlimentosEnSistema;
    private javax.swing.JComboBox<String> listaComidasPlan;
    private javax.swing.JList<String> listaConversaciones;
    private javax.swing.JComboBox<String> listaDiasDeLaSemana;
    private javax.swing.JList<String> listaIngestas;
    private javax.swing.JList<String> listaPlanesPendientes;
    private javax.swing.JList<String> listaPreferencias;
    private javax.swing.JList<String> listaRestricciones;
    private javax.swing.JComboBox<String> listaTipoAlimentos;
    private javax.swing.JPanel panelAlimentroRegistradoCorrectamente;
    private javax.swing.JPanel panelConsultaConProfesional;
    private javax.swing.JPanel panelConversacion;
    private javax.swing.JPanel panelConversacionOk;
    private javax.swing.JPanel panelDatosUsuario;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelElaborarPlan;
    private javax.swing.JPanel panelIngresarAlimentoAlSistema;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMostrarOk;
    private javax.swing.JPanel panelMostrarPlanEnviado;
    private javax.swing.JPanel panelNoHayConsultasPendientes;
    private javax.swing.JPanel panelNoHayPlanesPendientes;
    private javax.swing.JPanel panelNuevoAlimento;
    private javax.swing.JPanel panelPerfilDeUsuario;
    private javax.swing.JPanel panelPlanAlimentacion;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JTextArea textAlmuerzo;
    private javax.swing.JTextArea textCena;
    private javax.swing.JTextArea textDesayuno;
    private javax.swing.JTextField txtFibra;
    private javax.swing.JTextField txtGlucidos;
    private javax.swing.JTextField txtHidratos;
    private javax.swing.JTextField txtLipidos;
    private javax.swing.JTextArea txtMensajeNuevo;
    private javax.swing.JTextField txtMinerales;
    private javax.swing.JTextPane txtMostrarConversacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombrePlan;
    private javax.swing.JTextField txtProteínas;
    private javax.swing.JTextField txtVitaminas;
    // End of variables declaration//GEN-END:variables

    private void cargarListaDiasDeLaSemana() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> diasEnSistema = sistema.devolverListaDiasDeLaSemana();
        this.listaDiasDeLaSemana.setModel(modelo);
        for (int i = 0; i < diasEnSistema.size(); i++) {
            this.listaDiasDeLaSemana.addItem(diasEnSistema.get(i));
        }
    }

    private void cargarListaIngestasPorDia() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> ingestasEnSistema = sistema.devolverListaIngestasDeLaSemana();
        this.listaComidasPlan.setModel(modelo);
        for (int i = 0; i < ingestasEnSistema.size(); i++) {
            this.listaComidasPlan.addItem(ingestasEnSistema.get(i));
        }
    }

    private void guardarDatosDelPlan() {
        String diaSeleccionado = (String) this.listaDiasDeLaSemana.getSelectedItem();
        this.diaDeLaSemanaActual = diaSeleccionado;
        this.lblNombreDelDia.setText(diaSeleccionado);
        String itemsDesayuno = this.textDesayuno.getText();
        String itemsAlmuerzo = this.textAlmuerzo.getText();
        String itemsCena = this.textCena.getText();
        this.textDesayuno.setText("");
        this.textAlmuerzo.setText("");
        this.textCena.setText("");
        switch (this.diaDeLaSemanaAnterior) {
            case "Lunes":
                this.planAlimentacion[0][0] = itemsDesayuno;
                this.planAlimentacion[0][1] = itemsAlmuerzo;
                this.planAlimentacion[0][2] = itemsCena;
                break;
            case "Martes":
                this.planAlimentacion[1][0] = itemsDesayuno;
                this.planAlimentacion[1][1] = itemsAlmuerzo;
                this.planAlimentacion[1][2] = itemsCena;
                break;
            case "Miercoles":
                this.planAlimentacion[2][0] = itemsDesayuno;
                this.planAlimentacion[2][1] = itemsAlmuerzo;
                this.planAlimentacion[2][2] = itemsCena;
                break;
            case "Jueves":
                this.planAlimentacion[3][0] = itemsDesayuno;
                this.planAlimentacion[3][1] = itemsAlmuerzo;
                this.planAlimentacion[3][2] = itemsCena;
                break;
            case "Viernes":
                this.planAlimentacion[4][0] = itemsDesayuno;
                this.planAlimentacion[4][1] = itemsAlmuerzo;
                this.planAlimentacion[4][2] = itemsCena;
                break;
            case "Sabado":
                this.planAlimentacion[5][0] = itemsDesayuno;
                this.planAlimentacion[5][1] = itemsAlmuerzo;
                this.planAlimentacion[5][2] = itemsCena;
                break;
            case "Domingo":
                this.planAlimentacion[6][0] = itemsDesayuno;
                this.planAlimentacion[6][1] = itemsAlmuerzo;
                this.planAlimentacion[6][2] = itemsCena;
                break;
            default:
                break;
        }
    }

    private void mostrarErrores(String nombre, String tipoAlimento) {
        if (nombre.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        }
        if (tipoAlimento.equals("Seleccione...")) {
            this.lblValidarTipoAlimento.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTipoAlimento.setVisible(true);
            this.lblTipoAlimentoVacio.setVisible(true);
        }

    }

    private void ocultarCheckbox() {
        this.checkFibra.setSelected(false);
        this.checkGlucidos.setSelected(false);
        this.checkHidratos.setSelected(false);
        this.checkLipidos.setSelected(false);
        this.checkMinerales.setSelected(false);
        this.checkProteínas.setSelected(false);
        this.checkVitaminas.setSelected(false);
        this.txtFibra.setText("");
        this.txtGlucidos.setText("");
        this.txtHidratos.setText("");
        this.txtLipidos.setText("");
        this.txtMinerales.setText("");
        this.txtProteínas.setText("");
        this.txtVitaminas.setText("");
        this.txtFibra.setVisible(false);
        this.txtFibra.setVisible(false);
        this.txtGlucidos.setVisible(false);
        this.txtHidratos.setVisible(false);
        this.txtLipidos.setVisible(false);
        this.txtMinerales.setVisible(false);
        this.txtProteínas.setVisible(false);
        this.txtVitaminas.setVisible(false);
        this.txtFibra.setVisible(false);
    }
}
