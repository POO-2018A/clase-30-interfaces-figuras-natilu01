/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Oswaldo
 */
public class ProgramaFiguras extends javax.swing.JFrame {

    /**
     * Creates new form ProgramaFiguras
     */
    //panel window = new Panel();
    
    public ProgramaFiguras() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle ("Areas y Perímetros de las principales Figuras Geometricas");
        
        deshabilitarInformacion ();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRadio1 = new javax.swing.JTextField();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbListaFiguras = new javax.swing.JComboBox<>();
        btnSeleccionarFigura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFigura = new javax.swing.JTextField();
        lblLado1 = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        lblLado3 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        txtRadio = new javax.swing.JTextField();
        lblRadio = new javax.swing.JLabel();
        lblBase = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        btnElegirOtraFigura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione una figura:");

        cmbListaFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Triángulo", "Rectángulo", "Círculo" }));

        btnSeleccionarFigura.setText("seleccionar");
        btnSeleccionarFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarFiguraActionPerformed(evt);
            }
        });

        jLabel4.setText("Figura seleccionada:");

        lblLado1.setText("Lado 1:");

        lblLado2.setText("Lado 2:");

        lblLado3.setText("Lado 3:");

        lblRadio.setText("Radio:");

        lblBase.setText("Base:");

        lblAltura.setText("Altura:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Perímetro :");

        jLabel3.setText("Area:");

        btnElegirOtraFigura.setText("Elegir otra figura");
        btnElegirOtraFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirOtraFiguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(txtFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(cmbListaFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeleccionarFigura))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblLado1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblLado2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblLado3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                                            .addComponent(lblBase)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                                            .addComponent(lblRadio)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblAltura)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))))
                        .addGap(36, 36, 36))))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnCalcular))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnElegirOtraFigura))
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbListaFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarFigura))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLado1)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRadio)))
                .addGap(19, 19, 19)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado2)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBase)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado3)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCalcular)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnElegirOtraFigura)
                        .addGap(23, 23, 23)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarFiguraActionPerformed
        // TODO add your handling code here:
        btnSeleccionarFigura.setEnabled(false);
        cmbListaFiguras.setEnabled(false);
        btnCalcular.setEnabled(true);
        btnElegirOtraFigura.setEnabled(true);
        txtFigura.setEnabled(true);
        txtLado1.setEnabled(true);
        txtLado2.setEnabled(true);
        txtLado3.setEnabled(true);
        txtRadio.setEnabled(true);
        txtBase.setEnabled(true);
        txtAltura.setEnabled(true);
        txtPerimetro.setEnabled(true);
        txtArea.setEnabled(true);
        if (cmbListaFiguras.getSelectedIndex() == 0){
           
            txtLado2.setEnabled(false);
            txtLado3.setEnabled(false);
            txtRadio.setEnabled(false);
            txtBase.setEnabled(false);
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbListaFiguras.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }else if (cmbListaFiguras.getSelectedIndex() == 1){
            txtRadio.setEnabled(false);
            txtFigura.setText(cmbListaFiguras.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }else if (cmbListaFiguras.getSelectedIndex() == 2){
            txtLado3.setEnabled(false);
            txtRadio.setEnabled(false);
            txtBase.setEnabled(false);
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbListaFiguras.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }else if (cmbListaFiguras.getSelectedIndex() == 3){
            txtLado1.setEnabled(false);
            txtLado2.setEnabled(false);
            txtLado3.setEnabled(false);
            txtBase.setEnabled(false);
            txtAltura.setEnabled(false);
            txtFigura.setText(cmbListaFiguras.getSelectedItem().toString());
            txtFigura.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnSeleccionarFiguraActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double perimetro;
        double area;
        if (cmbListaFiguras.getSelectedIndex() == 0){
            String ladoCuadrado = txtLado1.getText();
            if (!ladoCuadrado.equals("")){
                double ladoCua = Double.parseDouble(ladoCuadrado);
                Cuadrado c1 = new Cuadrado (txtFigura.getText(),ladoCua);
                perimetro = c1.obtenerPerimetro();
                String periCuadrado = String.valueOf(perimetro);
                txtPerimetro.setText(periCuadrado);
                area = c1.obtenerArea();
                String areaCuadrado = String.valueOf(area);
                txtArea.setText(areaCuadrado);
            }else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
            }
            
        }else if (cmbListaFiguras.getSelectedIndex() == 1){
            String lado1Trian = txtLado1.getText();
            String lado2Trian = txtLado2.getText();
            String lado3Trian = txtLado3.getText();
            String baseTrian = txtBase.getText();
            String alturaTrian = txtAltura.getText();
            if (!lado1Trian.equals("")&& !lado2Trian.equals("")&& !lado3Trian.equals("") && !baseTrian.equals("") && !alturaTrian.equals("")){
                double lado1 = Double.parseDouble(lado1Trian);
                double lado2 = Double.parseDouble(lado2Trian);
                double lado3 = Double.parseDouble(lado3Trian);
                double base = Double.parseDouble(baseTrian);
                double altura = Double.parseDouble(alturaTrian);
                Triangulo t1 = new Triangulo (txtFigura.getText(),lado1,lado2,lado3,base,altura);
                perimetro = t1.obtenerPerimetro();
                String periTriangulo = String.valueOf(perimetro);
                txtPerimetro.setText(periTriangulo);
                area = t1.obtenerArea();
                String areaTriangulo = String.valueOf(area);
                txtArea.setText(areaTriangulo);
            }else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
            }
        }else if (cmbListaFiguras.getSelectedIndex() == 2){
            String lado1Rec = txtLado1.getText();
            String lado2Rec = txtLado2.getText();
            if (!lado1Rec.equals("")&& !lado2Rec.equals("")){
                double lado1 = Double.parseDouble(lado1Rec);
                double lado2 = Double.parseDouble(lado2Rec);
                Rectangulo r1 = new Rectangulo (txtFigura.getText(), lado1, lado2);
                perimetro = r1.obtenerPerimetro();
                String periRectangulo = String.valueOf(perimetro);
                txtPerimetro.setText(periRectangulo);
                area = r1.obtenerArea();
                String areaRectangulo = String.valueOf(area);
                txtArea.setText(areaRectangulo);
                
            }else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
            }
        }else if (cmbListaFiguras.getSelectedIndex() == 3){
            String radioCircu = txtRadio.getText();
            if (!radioCircu.equals("")){
                double radio = Double.parseDouble(radioCircu);
                Circulo c1 = new Circulo (txtFigura.getText(), radio);
                perimetro = c1.obtenerPerimetro();
                String periCirculo = String.valueOf(perimetro);
                txtPerimetro.setText(periCirculo);
                area = c1.obtenerArea();
                String areaCirculo = String.valueOf(area);
                txtArea.setText(areaCirculo);
                        
            }else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
            }
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnElegirOtraFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirOtraFiguraActionPerformed
        // TODO add your handling code here:
        btnSeleccionarFigura.setEnabled(true);
        btnCalcular.setEnabled(false);
        cmbListaFiguras.setEnabled(true);
        txtLado1.setEnabled(false);
        txtLado1.setText("");
        txtLado2.setEnabled(false);
        txtLado2.setText("");
        txtLado3.setEnabled(false);
        txtLado3.setText("");
        txtRadio.setEnabled(false);
        txtRadio.setText("");
        txtBase.setEnabled(false);
        txtBase.setText("");
        txtAltura.setEnabled(false);
        txtAltura.setText("");
        txtFigura.setEnabled(false);
        txtFigura.setText("");
        txtPerimetro.setEnabled(false);
        txtPerimetro.setText("");
        txtArea.setEnabled(false);
        txtArea.setText("");
        btnElegirOtraFigura.setEnabled(false);
    }//GEN-LAST:event_btnElegirOtraFiguraActionPerformed

    private void deshabilitarInformacion (){
        btnCalcular.setEnabled(false);
        btnElegirOtraFigura.setEnabled(false);
        txtFigura.setEnabled(false);
        txtLado1.setEnabled(false);
        txtLado2.setEnabled(false);
        txtLado3.setEnabled(false);
        txtRadio.setEnabled(false);
        txtBase.setEnabled(false);
        txtAltura.setEnabled(false);
        txtPerimetro.setEnabled(false);
        txtArea.setEnabled(false);   
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnElegirOtraFigura;
    private javax.swing.JButton btnSeleccionarFigura;
    private javax.swing.JComboBox<String> cmbListaFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtFigura;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtRadio1;
    // End of variables declaration//GEN-END:variables
}
