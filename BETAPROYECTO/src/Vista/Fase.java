/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author newuser
 */
public class Fase extends Pvirgen {

   

    Fase(int i) {
        initComponents();
        this.setSize(1151, 662);
        switch (i){
            case 0:
                
                break;
            case 1:
                Info.jmformulario.setEnabled(true);
                bAbrirInscripcion.setEnabled(false);
                bCerrarInscripcion.setEnabled(true);
                
                bFase1Informacion.setEnabled(true);
                bFormulario.setEnabled(true);
                break;
            case 2:
                Info.jmformulario.setEnabled(false);
                Info.jmdetalles.setEnabled(true);
                Info.jmlistado.setEnabled(true);
                bAbrirInscripcion.setEnabled(false);
                bCerrarInscripcion.setEnabled(false);
                bEjecutarSorteo.setEnabled(true);                
                
                bFase2Informacion.setEnabled(true);
                bFase2Detalles.setEnabled(true);
                bFase2Listado.setEnabled(true);
                
                break;
            case 3:
                bAbrirInscripcion.setEnabled(false);
                bCerrarInscripcion.setEnabled(false);
                bEjecutarSorteo.setEnabled(false);
                
                bFase3Informacion.setEnabled(true);
                bFase3Detalles.setEnabled(true);
                bFase3Listado.setEnabled(true);
                break;
            
        } 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bCerrarInscripcion = new javax.swing.JButton();
        bEjecutarSorteo = new javax.swing.JButton();
        bAbrirInscripcion = new javax.swing.JButton();
        bFase1Informacion = new javax.swing.JButton();
        bFase2Informacion = new javax.swing.JButton();
        bFase3Informacion = new javax.swing.JButton();
        bFormulario = new javax.swing.JButton();
        bFase2Detalles = new javax.swing.JButton();
        bFase3Detalles = new javax.swing.JButton();
        bFase2Listado = new javax.swing.JButton();
        bFase3Listado = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1151, 662));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Fases");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fases del programa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(0, 0, 204))); // NOI18N

        bCerrarInscripcion.setText("Cerrar inscripciones");
        bCerrarInscripcion.setEnabled(false);
        bCerrarInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarInscripcionActionPerformed(evt);
            }
        });

        bEjecutarSorteo.setText("Ejecutar sorteo");
        bEjecutarSorteo.setEnabled(false);
        bEjecutarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEjecutarSorteoActionPerformed(evt);
            }
        });

        bAbrirInscripcion.setText("Abrir inscripciones");
        bAbrirInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAbrirInscripcionActionPerformed(evt);
            }
        });

        bFase1Informacion.setText("Información");
        bFase1Informacion.setEnabled(false);
        bFase1Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase1InformacionActionPerformed(evt);
            }
        });

        bFase2Informacion.setText("Información");
        bFase2Informacion.setEnabled(false);
        bFase2Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase2InformacionActionPerformed(evt);
            }
        });

        bFase3Informacion.setText("Información");
        bFase3Informacion.setEnabled(false);
        bFase3Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase3InformacionActionPerformed(evt);
            }
        });

        bFormulario.setText("Formulario");
        bFormulario.setEnabled(false);
        bFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFormularioActionPerformed(evt);
            }
        });

        bFase2Detalles.setText("Detalles situación Solicitud");
        bFase2Detalles.setEnabled(false);
        bFase2Detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase2DetallesActionPerformed(evt);
            }
        });

        bFase3Detalles.setText("Detalles situación Solicitud");
        bFase3Detalles.setEnabled(false);
        bFase3Detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase3DetallesActionPerformed(evt);
            }
        });

        bFase2Listado.setText("Listado");
        bFase2Listado.setEnabled(false);
        bFase2Listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase2ListadoActionPerformed(evt);
            }
        });

        bFase3Listado.setText("Listado");
        bFase3Listado.setEnabled(false);
        bFase3Listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFase3ListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAbrirInscripcion)
                    .addComponent(bCerrarInscripcion)
                    .addComponent(bEjecutarSorteo))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bFase1Informacion)
                    .addComponent(bFase2Informacion)
                    .addComponent(bFase3Informacion))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bFase2Detalles)
                    .addComponent(bFase3Detalles)
                    .addComponent(bFormulario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bFase2Listado)
                    .addComponent(bFase3Listado))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAbrirInscripcion)
                    .addComponent(bFase1Informacion)
                    .addComponent(bFormulario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCerrarInscripcion)
                    .addComponent(bFase2Informacion)
                    .addComponent(bFase2Detalles)
                    .addComponent(bFase2Listado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEjecutarSorteo)
                    .addComponent(bFase3Informacion)
                    .addComponent(bFase3Detalles)
                    .addComponent(bFase3Listado))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bAbrirInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAbrirInscripcionActionPerformed

        Cvista.estadofase(1);
        
    }//GEN-LAST:event_bAbrirInscripcionActionPerformed

    private void bCerrarInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarInscripcionActionPerformed

        Cvista.estadofase(2);
        
    }//GEN-LAST:event_bCerrarInscripcionActionPerformed

    private void bEjecutarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEjecutarSorteoActionPerformed

        Cvista.estadofase(3);
        
    }//GEN-LAST:event_bEjecutarSorteoActionPerformed

    private void bFase1InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase1InformacionActionPerformed
        Info.jminfo.doClick();
    }//GEN-LAST:event_bFase1InformacionActionPerformed

    private void bFase2InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase2InformacionActionPerformed
        Info.jminfo.doClick();
    }//GEN-LAST:event_bFase2InformacionActionPerformed

    private void bFase3InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase3InformacionActionPerformed
        Info.jminfo.doClick();
    }//GEN-LAST:event_bFase3InformacionActionPerformed

    private void bFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFormularioActionPerformed
        Info.jmformulario.doClick();
    }//GEN-LAST:event_bFormularioActionPerformed

    private void bFase2DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase2DetallesActionPerformed
        Info.jmdetalles.doClick();
    }//GEN-LAST:event_bFase2DetallesActionPerformed

    private void bFase3DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase3DetallesActionPerformed
        Info.jmdetalles.doClick();
    }//GEN-LAST:event_bFase3DetallesActionPerformed

    private void bFase2ListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase2ListadoActionPerformed
        Info.jmlistado.doClick();
    }//GEN-LAST:event_bFase2ListadoActionPerformed

    private void bFase3ListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFase3ListadoActionPerformed
        Info.jmlistado.doClick();
    }//GEN-LAST:event_bFase3ListadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAbrirInscripcion;
    private javax.swing.JButton bCerrarInscripcion;
    private javax.swing.JButton bEjecutarSorteo;
    private javax.swing.JButton bFase1Informacion;
    private javax.swing.JButton bFase2Detalles;
    private javax.swing.JButton bFase2Informacion;
    private javax.swing.JButton bFase2Listado;
    private javax.swing.JButton bFase3Detalles;
    private javax.swing.JButton bFase3Informacion;
    private javax.swing.JButton bFase3Listado;
    private javax.swing.JButton bFormulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
