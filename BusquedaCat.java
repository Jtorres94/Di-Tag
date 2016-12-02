/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasFte;

import backEnd.Producto;
import modelos.CustomListModelFront;

/**
 *
 * @author Javier
 */
public class BusquedaCat extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaCat
     */
    CustomListModelFront modelo = new CustomListModelFront();
    Producto producto = new Producto();
    public BusquedaCat() {       
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        lista.setModel(modelo);
        setInvisibleLabel();
    }
    public void setModelo(String dato){
        modelo.setCadena(dato);
    }
    public void setCategoria(String dato){
        lBusqueda.setText(dato);
    }
    private void setInvisibleLabel(){
        lNombre.setVisible(false);
        lCategoria.setVisible(false);
        lSelloCal.setVisible(false);
        lSelloGras.setVisible(false);
        lSelloAzu.setVisible(false);
        lSelloSod.setVisible(false);
        lCalorias.setVisible(false);
        lAzucares.setVisible(false);
        lGrasTot.setVisible(false);
        lGrasSat.setVisible(false);
        lSodio.setVisible(false);
        nombreR.setVisible(false);
        categoriaR.setVisible(false);
        selloCalR.setVisible(false);
        selloGrasR.setVisible(false);
        selloAzuR.setVisible(false);
        selloSodR.setVisible(false);
        caloriasR.setVisible(false);
        azucaresR.setVisible(false);
        grasTotR.setVisible(false);
        grasSatR.setVisible(false);
        sodioR.setVisible(false);
    }
    private void setVisibleLabel(){
        lNombre.setVisible(true);
        lCategoria.setVisible(true);
        lSelloCal.setVisible(true);
        lSelloGras.setVisible(true);
        lSelloAzu.setVisible(true);
        lSelloSod.setVisible(true);
        lCalorias.setVisible(true);
        lAzucares.setVisible(true);
        lGrasTot.setVisible(true);
        lGrasSat.setVisible(true);
        lSodio.setVisible(true);
        nombreR.setVisible(true);
        categoriaR.setVisible(true);
        selloCalR.setVisible(true);
        selloGrasR.setVisible(true);
        selloAzuR.setVisible(true);
        selloSodR.setVisible(true);
        caloriasR.setVisible(true);
        azucaresR.setVisible(true);
        grasTotR.setVisible(true);
        grasSatR.setVisible(true);
        sodioR.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        panelImagen1 = new imagen.PanelImagen();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        lBusqueda = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lSelloCal = new javax.swing.JLabel();
        lSelloGras = new javax.swing.JLabel();
        lSelloAzu = new javax.swing.JLabel();
        lSelloSod = new javax.swing.JLabel();
        lCalorias = new javax.swing.JLabel();
        lAzucares = new javax.swing.JLabel();
        lGrasTot = new javax.swing.JLabel();
        lGrasSat = new javax.swing.JLabel();
        lSodio = new javax.swing.JLabel();
        categoriaR = new javax.swing.JLabel();
        selloCalR = new javax.swing.JLabel();
        selloGrasR = new javax.swing.JLabel();
        selloAzuR = new javax.swing.JLabel();
        selloSodR = new javax.swing.JLabel();
        caloriasR = new javax.swing.JLabel();
        azucaresR = new javax.swing.JLabel();
        grasTotR = new javax.swing.JLabel();
        grasSatR = new javax.swing.JLabel();
        sodioR = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        lCategoria = new javax.swing.JLabel();
        nombreR = new javax.swing.JLabel();

        jLabel8.setText("Azúcares :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelImagen1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jScrollPane1.setViewportView(lista);

        lBusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lNombre.setText("Nombre :");

        lSelloCal.setText("Sello Calorias :");

        lSelloGras.setText("Sello Grasas :");

        lSelloAzu.setText("Sello Azúcares :");

        lSelloSod.setText("Sello Sodio :");

        lCalorias.setText("Calorias :");

        lAzucares.setText("Azúcares :");

        lGrasTot.setText("Grasas Totales :");

        lGrasSat.setText("Grasas Saturadas :");

        lSodio.setText("Sodio :");

        categoriaR.setText("Categoria");

        selloCalR.setText("Sello Calorias");

        selloGrasR.setText("Sello Grasas");

        selloAzuR.setText("Sello Azúcares");

        selloSodR.setText("Sello Sodio");

        caloriasR.setText("Calorias");

        azucaresR.setText("Azúcares");

        grasTotR.setText("Grasas Totales");

        grasSatR.setText("Grasas Saturadas");

        sodioR.setText("Sodio");

        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setText("Más Información");
        info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        lCategoria.setText("Categoria :");

        nombreR.setText("Nombre");

        javax.swing.GroupLayout panelImagen1Layout = new javax.swing.GroupLayout(panelImagen1);
        panelImagen1.setLayout(panelImagen1Layout);
        panelImagen1Layout.setHorizontalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagen1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addComponent(lBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 622, Short.MAX_VALUE)
                        .addComponent(volver)
                        .addContainerGap())
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImagen1Layout.createSequentialGroup()
                                .addGap(18, 73, Short.MAX_VALUE)
                                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lSelloCal)
                                    .addComponent(lSelloGras)
                                    .addComponent(lSelloAzu)
                                    .addComponent(lSelloSod)
                                    .addComponent(lCalorias)
                                    .addComponent(lAzucares)
                                    .addComponent(lGrasTot)
                                    .addComponent(lGrasSat)
                                    .addComponent(lSodio)
                                    .addComponent(lNombre)
                                    .addComponent(lCategoria))
                                .addGap(68, 68, 68)
                                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sodioR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(grasSatR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(grasTotR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(azucaresR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(caloriasR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(selloSodR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(selloAzuR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(selloGrasR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(selloCalR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(categoriaR, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(nombreR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31))
                            .addGroup(panelImagen1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        panelImagen1Layout.setVerticalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagen1Layout.createSequentialGroup()
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver)))
                .addGap(11, 11, 11)
                .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImagen1Layout.createSequentialGroup()
                        .addComponent(info)
                        .addGap(69, 69, 69)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreR)
                            .addComponent(lNombre))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoriaR)
                            .addComponent(lCategoria))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSelloCal)
                            .addComponent(selloCalR))
                        .addGap(21, 21, 21)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSelloGras)
                            .addComponent(selloGrasR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSelloAzu)
                            .addComponent(selloAzuR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSelloSod)
                            .addComponent(selloSodR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCalorias)
                            .addComponent(caloriasR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lAzucares)
                            .addComponent(azucaresR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lGrasTot)
                            .addComponent(grasTotR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lGrasSat)
                            .addComponent(grasSatR))
                        .addGap(18, 18, 18)
                        .addGroup(panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSodio)
                            .addComponent(sodioR)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        if(lista.getSelectedIndex()!=-1){
            nombreR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getNombre());
            categoriaR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getCategoria());
            selloCalR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getSelloCaloria());
            selloGrasR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getSelloGrasas());
            selloAzuR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getSelloAzucares());
            selloSodR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getSelloSodio());
            caloriasR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getCalorias());
            azucaresR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getAzucares());
            grasTotR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getGrasasTot());
            grasSatR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getGrasasSat());
            sodioR.setText(producto.buscarCat(lBusqueda.getText()).get(lista.getSelectedIndex()).getSodio());
            setVisibleLabel();
        }
    }//GEN-LAST:event_infoActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new DitagVP().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BusquedaCat dialog = new BusquedaCat();   
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel azucaresR;
    private javax.swing.JLabel caloriasR;
    private javax.swing.JLabel categoriaR;
    private javax.swing.JLabel grasSatR;
    private javax.swing.JLabel grasTotR;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAzucares;
    private javax.swing.JLabel lBusqueda;
    private javax.swing.JLabel lCalorias;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lGrasSat;
    private javax.swing.JLabel lGrasTot;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lSelloAzu;
    private javax.swing.JLabel lSelloCal;
    private javax.swing.JLabel lSelloGras;
    private javax.swing.JLabel lSelloSod;
    private javax.swing.JLabel lSodio;
    private javax.swing.JList<String> lista;
    private javax.swing.JLabel nombreR;
    private imagen.PanelImagen panelImagen1;
    private javax.swing.JLabel selloAzuR;
    private javax.swing.JLabel selloCalR;
    private javax.swing.JLabel selloGrasR;
    private javax.swing.JLabel selloSodR;
    private javax.swing.JLabel sodioR;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
