/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import javax.swing.JOptionPane;
import logica.Controlador;

/**
 *
 * @author Oscar
 */
public class CargarDatos extends javax.swing.JFrame {
    
    Controlador controlador = null;

    
    public CargarDatos() {
        controlador = new Controlador();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textfields = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBox = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPuertas = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(197, 74, 131));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/palm-150.png"))); // NOI18N
        header.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/sun-150.png"))); // NOI18N
        header.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/mujer-ochenta-200.png"))); // NOI18N
        header.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/confetti.png"))); // NOI18N
        header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carga de");
        header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 130));

        textfields.setBackground(new java.awt.Color(4, 1, 18));
        textfields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/mujer-synthwave-500.png"))); // NOI18N
        textfields.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/blue-neon-border.png"))); // NOI18N
        textfields.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        txtBox.setBackground(new java.awt.Color(43, 2, 58));
        txtBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setBackground(new java.awt.Color(217, 78, 31));
        btnLimpiar.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/dustpan-icon.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 102, 0), new java.awt.Color(255, 102, 51)));
        btnLimpiar.setFocusable(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        txtBox.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 349, 200, -1));

        btnGuardar.setBackground(new java.awt.Color(237, 7, 121));
        btnGuardar.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/car-guardado-icon.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 0, 102), new java.awt.Color(255, 102, 204)));
        btnGuardar.setFocusable(false);
        btnGuardar.setIconTextGap(6);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        txtBox.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 349, 230, -1));

        jLabel15.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("INGRESAR DATOS DEL VEHÍCULO");
        txtBox.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Patente");
        txtBox.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Color");
        txtBox.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Motor");
        txtBox.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Marca");
        txtBox.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo");
        txtBox.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N° Puertas");
        txtBox.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtPuertas.setBackground(new java.awt.Color(255, 255, 255));
        txtPuertas.setForeground(new java.awt.Color(0, 0, 0));
        txtBox.add(txtPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 230, -1));

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtBox.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 230, -1));

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtBox.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 230, -1));

        txtMotor.setBackground(new java.awt.Color(255, 255, 255));
        txtMotor.setForeground(new java.awt.Color(0, 0, 0));
        txtBox.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 230, -1));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtBox.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 230, -1));

        txtPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtPatente.setForeground(new java.awt.Color(0, 0, 0));
        txtBox.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 230, -1));

        textfields.add(txtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 450));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/konfetti-punkte-clipart-hintergrund.png"))); // NOI18N
        textfields.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -50, -1, -1));

        bg.add(textfields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 910, 520));

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        // Conseguimos los elementos tipados por el usuario
        
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String color = txtColor.getText();
        String motor = txtMotor.getText();
        String patente = txtPatente.getText();
        int numeroPuertas = Integer.parseInt(txtPuertas.getText());
        
        // Hacemos la petición al controlador, creando un método pivote de guardar el registro
        
        controlador.guardarAuto(modelo, marca, color, motor, patente, numeroPuertas);
        
        // Pasamos un mensaje por pantalla, para decirle al usuario que su auto fue registrado
        
        JOptionPane.showMessageDialog(null, "Su automóvil fue guardado exitosamente");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    // Declaramos un método de clase que permita reutilizar el código de la limpieza de cajas
    
    private void limpiarCajas() {
        
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPatente.setText("");
        txtPuertas.setText("");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel textfields;
    private javax.swing.JPanel txtBox;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPuertas;
    // End of variables declaration//GEN-END:variables
}
