/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasBke;

import backEnd.Producto;
import datos.Validacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Modificar extends javax.swing.JDialog {

    /**
     * Creates new form Modificar
     */
    public Modificar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(parent);
        index.setVisible(false);
    }

    public void setCodigo(String dato){
        codigo.setText(dato);
    }
    public void setCategoria(String dato){
        categoria.setText(dato);
    }
    public void setNombre(String dato){
        nombre.setText(dato);
    }
    public void setSelloCalorias(String dato){
        if (dato.equals("Alto en Calorias")) {
            sCal.setSelected(true);
     }
    }
    public void setSelloGrasas(String dato){
        if (dato.equals("Alto en Grasas")) {
            sGras.setSelected(true);
        }
    }
    public void setSelloAzucares(String dato){
        if (dato.equals("Alto en Azucares")) {
            sAzu.setSelected(true);
        }
    }
    public void setSelloSodio(String dato){
        if (dato.equals("Alto en Sodio")) {
            sSod.setSelected(true);
        }
    }
    public void setCalorias(String dato){
        calorias.setText(dato);
    }
    public void setAzucares(String dato){
        azucares.setText(dato);
    }
    public void setGrasasTot(String dato){
        grasTot.setText(dato);
    }
    public void setGrasasSat(String dato){
        grasSat.setText(dato);
    }
    public void setSodio(String dato){
        sodio.setText(dato);
    }
    public void setIndex(String datos){
        index.setText(datos);
    }
    private String getSelloCalorias(){
        String sello="Sin sellos";
        if (sCal.isSelected()) {
            sello="Alto en Calorias";
        }
        return sello;
    }
    private String getSelloGrasas(){
        String sello="Sin sellos";
        if (sGras.isSelected()) {
            sello="Alto en Grasas";
        }
        return sello;
    }
    private String getSelloAzucares(){
        String sello="Sin sellos";
        if (sAzu.isSelected()) {
            sello="Alto en Azucares";
        }
        return sello;
    }
    private String getSelloSodio(){
        String sello="Sin sellos";
        if (sSod.isSelected()) {
            sello="Alto en Sodio";
        }
        return sello;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen1 = new imagen.PanelImagen();
        nombre = new javax.swing.JTextField();
        azucares = new javax.swing.JTextField();
        grasSat = new javax.swing.JTextField();
        grasTot = new javax.swing.JTextField();
        sodio = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sCal = new javax.swing.JCheckBox();
        sGras = new javax.swing.JCheckBox();
        sAzu = new javax.swing.JCheckBox();
        sSod = new javax.swing.JCheckBox();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        calorias = new javax.swing.JTextField();
        index = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelImagen1.setPreferredSize(new java.awt.Dimension(738, 481));

        nombre.setPreferredSize(new java.awt.Dimension(160, 30));
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });

        azucares.setPreferredSize(new java.awt.Dimension(160, 30));
        azucares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                azucaresMouseClicked(evt);
            }
        });

        grasSat.setPreferredSize(new java.awt.Dimension(160, 30));
        grasSat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grasSatMouseClicked(evt);
            }
        });

        grasTot.setPreferredSize(new java.awt.Dimension(160, 30));
        grasTot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grasTotMouseClicked(evt);
            }
        });

        sodio.setPreferredSize(new java.awt.Dimension(160, 30));
        sodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sodioMouseClicked(evt);
            }
        });

        categoria.setPreferredSize(new java.awt.Dimension(160, 30));
        categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriaMouseClicked(evt);
            }
        });

        codigo.setPreferredSize(new java.awt.Dimension(160, 30));
        codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoMouseClicked(evt);
            }
        });

        jLabel1.setText("Sellos:");

        sCal.setBackground(new java.awt.Color(255, 255, 255));
        sCal.setText("Calorias");

        sGras.setBackground(new java.awt.Color(255, 255, 255));
        sGras.setText("Grasas totales");

        sAzu.setBackground(new java.awt.Color(255, 255, 255));
        sAzu.setText("Azucares");

        sSod.setBackground(new java.awt.Color(255, 255, 255));
        sSod.setText("Sodio");

        aceptar.setBackground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        calorias.setPreferredSize(new java.awt.Dimension(160, 30));
        calorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caloriasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImagen1Layout = new javax.swing.GroupLayout(panelImagen1);
        panelImagen1.setLayout(panelImagen1Layout);
        panelImagen1Layout.setHorizontalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImagen1Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(sGras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sCal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sAzu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sSod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(70, 70, 70)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grasSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grasTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(azucares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calorias, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImagen1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(index))
        );
        panelImagen1Layout.setVerticalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagen1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(index)
                .addGap(85, 85, 85)
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addComponent(azucares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grasTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(grasSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sCal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sGras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sAzu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sSod)))
                .addGap(18, 18, 18)
                .addComponent(sodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        nombre.setText("");
    }//GEN-LAST:event_nombreMouseClicked

    private void azucaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azucaresMouseClicked
        azucares.setText("");
    }//GEN-LAST:event_azucaresMouseClicked

    private void grasSatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grasSatMouseClicked
        grasSat.setText("");
    }//GEN-LAST:event_grasSatMouseClicked

    private void grasTotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grasTotMouseClicked
        grasTot.setText("");
    }//GEN-LAST:event_grasTotMouseClicked

    private void sodioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sodioMouseClicked
        sodio.setText("");
    }//GEN-LAST:event_sodioMouseClicked

    private void categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaMouseClicked
        categoria.setText("");
    }//GEN-LAST:event_categoriaMouseClicked

    private void codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoMouseClicked
        codigo.setText("");
    }//GEN-LAST:event_codigoMouseClicked

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
         if (new Validacion(codigo.getText()).comas()||new Validacion(categoria.getText()).comas()||new Validacion(nombre.getText()).comas()||
                new Validacion(calorias.getText()).comas()||new Validacion(azucares.getText()).comas()||
                new Validacion(grasTot.getText()).comas()||new Validacion(grasSat.getText()).comas()||new Validacion(sodio.getText()).comas()) {
            JOptionPane.showMessageDialog(null, "Por favor elimine las comas que hay en los campos.");
        }else
        {
        Producto producto = new Producto();
        producto.modificarProducto(new Producto(codigo.getText(),categoria.getText().toLowerCase(),nombre.getText().toLowerCase(),getSelloCalorias(),getSelloGrasas(),
            getSelloAzucares(),getSelloSodio(),calorias.getText(),azucares.getText(),grasTot.getText(),grasSat.getText(),sodio.getText()),
                Integer.parseInt(index.getText()));
        JOptionPane.showMessageDialog(null, "El producto fue modificado correctamente, por favor refresque la lista");
        this.dispose();
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void caloriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caloriasMouseClicked
        calorias.setText("");
    }//GEN-LAST:event_caloriasMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificar dialog = new Modificar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField azucares;
    private javax.swing.JTextField calorias;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField grasSat;
    private javax.swing.JTextField grasTot;
    private javax.swing.JLabel index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombre;
    private imagen.PanelImagen panelImagen1;
    private javax.swing.JCheckBox sAzu;
    private javax.swing.JCheckBox sCal;
    private javax.swing.JCheckBox sGras;
    private javax.swing.JCheckBox sSod;
    private javax.swing.JTextField sodio;
    // End of variables declaration//GEN-END:variables
}
