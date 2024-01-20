package interfaz;

import java.awt.event.WindowEvent;
import logica.Controlador;


public class MenuPrincipal extends javax.swing.JFrame {

    Controlador control = null;

    public MenuPrincipal() {
        control = new Controlador();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        mainInfo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainInfo.setBackground(new java.awt.Color(4, 1, 18));
        mainInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Menú de Opciones");
        mainInfo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/vendedor-r.png"))); // NOI18N
        mainInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        btnSalir.setBackground(new java.awt.Color(90, 13, 91));
        btnSalir.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/car-door.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153)));
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        mainInfo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 220, -1));

        btnCargar.setBackground(new java.awt.Color(236, 6, 119));
        btnCargar.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/car-logo3.png"))); // NOI18N
        btnCargar.setText("CARGAR DATOS");
        btnCargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 0, 102), new java.awt.Color(204, 0, 204)));
        btnCargar.setFocusable(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        mainInfo.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 410, -1));

        btnVer.setBackground(new java.awt.Color(151, 5, 113));
        btnVer.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/goggles-icon.png"))); // NOI18N
        btnVer.setText("VER AUTOS");
        btnVer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 0, 153), new java.awt.Color(204, 0, 204)));
        btnVer.setFocusable(false);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        mainInfo.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 310, -1));

        jLabel6.setBackground(new java.awt.Color(151, 5, 113));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/sunset-retro-colorful-stripes.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        mainInfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -240, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/extra-fondo.png"))); // NOI18N
        mainInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 90, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/neon-box-1400.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        mainInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -50, 1490, -1));

        bg.add(mainInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 910, 520));

        header.setBackground(new java.awt.Color(197, 74, 131));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lemon", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("@oscaralfrm");
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/github-mini.png"))); // NOI18N
        header.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/palm-150.png"))); // NOI18N
        header.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DeLorean");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Concesionaria");
        header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/sun-150.png"))); // NOI18N
        header.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/confetti.png"))); // NOI18N
        header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        CargarDatos cargarDatos = new CargarDatos();
        cargarDatos.setVisible(true);
        cargarDatos.setLocationRelativeTo(null);
        cargarDatos.setResizable(false);
        cargarDatos.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
       
        VerDatos verDatos = new VerDatos();
        verDatos.setVisible(true);
        verDatos.setLocationRelativeTo(null);
        verDatos.setResizable(false);
        verDatos.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_btnVerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainInfo;
    // End of variables declaration//GEN-END:variables
}
