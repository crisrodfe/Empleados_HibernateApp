/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import MisOpciones.OpcionDepartamentos;
import Tables.Departamentos;
import Tables.SessionFactoryUtil;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

/**
 * @author CrisRodFe
 */
public class JDialogDepartamentos extends javax.swing.JDialog 
{
    private static final SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
    private static byte deptNo;
    private OpcionDepartamentos od = new OpcionDepartamentos();
    
    /**
     * Creates new form DepartamentosMenu
     * @param parent
     * @param modal
     */
    public JDialogDepartamentos(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();   
        resetUI();                    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonAccion = new javax.swing.JButton();
        jPanelDepartamentos = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldLocalizacion = new javax.swing.JTextField();
        jLabelLocalizacion = new javax.swing.JLabel();
        jPanelAcciones = new javax.swing.JPanel();
        jRadioButtonBaja = new javax.swing.JRadioButton();
        jRadioButtonAlta = new javax.swing.JRadioButton();
        jRadioButtonConsulta = new javax.swing.JRadioButton();
        jRadioButtonmodificacion = new javax.swing.JRadioButton();
        jButtonComprobar = new javax.swing.JButton();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButtonAccion.setText("Acción");
        jButtonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccionActionPerformed(evt);
            }
        });

        jPanelDepartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos de Departamentos"));

        jLabelNombre.setText("Dep.Nombre");

        jLabelLocalizacion.setText("Localización");

        javax.swing.GroupLayout jPanelDepartamentosLayout = new javax.swing.GroupLayout(jPanelDepartamentos);
        jPanelDepartamentos.setLayout(jPanelDepartamentosLayout);
        jPanelDepartamentosLayout.setHorizontalGroup(
            jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                        .addComponent(jLabelLocalizacion)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldLocalizacion))
                    .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanelDepartamentosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelLocalizacion, jLabelNombre});

        jPanelDepartamentosLayout.setVerticalGroup(
            jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocalizacion)
                    .addComponent(jTextFieldLocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanelDepartamentosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelLocalizacion, jLabelNombre});

        jPanelAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Elige una acción"));

        buttonGroup1.add(jRadioButtonBaja);
        jRadioButtonBaja.setText("Baja");
        jRadioButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBajaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAlta);
        jRadioButtonAlta.setText("Alta");
        jRadioButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAltaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonConsulta);
        jRadioButtonConsulta.setText("Consulta");
        jRadioButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConsultaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonmodificacion);
        jRadioButtonmodificacion.setText("Modificacion");
        jRadioButtonmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonmodificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAccionesLayout = new javax.swing.GroupLayout(jPanelAcciones);
        jPanelAcciones.setLayout(jPanelAccionesLayout);
        jPanelAccionesLayout.setHorizontalGroup(
            jPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonAlta)
                    .addComponent(jRadioButtonBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonConsulta)
                    .addComponent(jRadioButtonmodificacion))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelAccionesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButtonBaja, jRadioButtonConsulta, jRadioButtonmodificacion});

        jPanelAccionesLayout.setVerticalGroup(
            jPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAlta)
                    .addComponent(jRadioButtonmodificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonBaja)
                    .addComponent(jRadioButtonConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAccionesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRadioButtonBaja, jRadioButtonConsulta, jRadioButtonmodificacion});

        jButtonComprobar.setText("Comprobar ID");
        jButtonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarActionPerformed(evt);
            }
        });

        jLabelNumero.setText("ID");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCancelar))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAccion, jButtonCancelar, jButtonComprobar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelAcciones, jPanelDepartamentos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero))
                .addGap(27, 27, 27)
                .addComponent(jPanelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAccion, jButtonCancelar, jButtonComprobar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAltaActionPerformed
        jButtonAccion.setText("Dar de Alta");
        jButtonAccion.setEnabled(true);
        jTextFieldLocalizacion.setEnabled(true);
        jTextFieldNombre.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonAltaActionPerformed

    /**
     * 
     * Dará de alta, modificará,borrará o mostrará un departamento dependiendo del texto del botón(cambia dinámicamente a partir del radioButton pulsado):
     *
     * Aparecerán mensajes de confirmación para el usuario y mensajes con el resultado de la acción. 
     * 
     * @param evt 
     */
    private void jButtonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccionActionPerformed
        String nombre = jButtonAccion.getText();
        int resp;                  

        switch(nombre)
        {
            case "Dar de Alta":                            
                resp = JOptionPane.showConfirmDialog(null,"¿Quiere crear el siguiente departamento?"+
                                                  "\nNº: "+deptNo+
                                                  "\nLoc: "+ jTextFieldLocalizacion.getText()+
                                                  "\nNombre: " +  jTextFieldNombre.getText(),"",
                                                 JOptionPane.OK_CANCEL_OPTION);
                if (resp == JOptionPane.OK_OPTION)
                {
                    if(!jTextFieldNombre.getText().equals("") && !jTextFieldLocalizacion.getText().equals(""))
                    {
                        od.altaDepartamento(sesion, deptNo, jTextFieldNombre.getText(), jTextFieldLocalizacion.getText());     
                        JOptionPane.showMessageDialog(rootPane, "Se ha creado un nuevo departamento:\n"+od.getDepartamento(sesion, deptNo));                        
                    }  
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos para crear un nuevo registro.");
                    }    
 
                } 
                break;

            case "Dar de Baja":
                resp = JOptionPane.showConfirmDialog(null,"¿Está seguro que quiere borrar el departamento\n"+od.getDepartamento(sesion, deptNo)+"?","",JOptionPane.OK_CANCEL_OPTION);
                if (resp == JOptionPane.OK_OPTION)
                {
                    try{
                        od.bajaDepartamento(sesion, deptNo);
                    }catch (Exception e) 
                    {
                        JOptionPane.showMessageDialog(rootPane, "El departamento contiene empleados enlazados.\nNo puede borrar este departamento.");
                        return;
                    }   
                    JOptionPane.showMessageDialog(rootPane, "El departamento ha sido eliminado");
                }     
            break; 

            case "Modificar":
                resp = JOptionPane.showConfirmDialog(null,"¿Está seguro que quiere modificar el departamento\n"+od.getDepartamento(sesion, deptNo)+"?","",JOptionPane.OK_CANCEL_OPTION);
                if (resp == JOptionPane.OK_OPTION)
                {
                    od.modificarDepartamento(sesion, deptNo,jTextFieldNombre.getText().toString(),jTextFieldLocalizacion.getText().toString());
                    JOptionPane.showMessageDialog(rootPane, "El departamento ha sido modificado\nNuevo departamento:\n"+od.getDepartamento(sesion, deptNo));
                }     
            break;

        case "Consultar":
            JOptionPane.showMessageDialog(rootPane, "Los datos del departamento son:\n"+od.getDepartamento(sesion, deptNo));
            break;
        }
        resetUI();
    }//GEN-LAST:event_jButtonAccionActionPerformed

    private void jRadioButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBajaActionPerformed
        jButtonAccion.setText("Dar de Baja");
        jButtonAccion.setEnabled(true);
        jTextFieldLocalizacion.setEnabled(false);
        jTextFieldNombre.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonBajaActionPerformed

    private void jRadioButtonmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonmodificacionActionPerformed
        jButtonAccion.setText("Modificar"); 
        jButtonAccion.setEnabled(true);
        Departamentos d = od.getDepartamento(sesion, deptNo);
        jTextFieldLocalizacion.setEnabled(true);
        jTextFieldLocalizacion.setText(d.getLoc());
        jTextFieldNombre.setEnabled(true);
        jTextFieldNombre.setText(d.getDnombre());
    }//GEN-LAST:event_jRadioButtonmodificacionActionPerformed

    private void jRadioButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConsultaActionPerformed
        jButtonAccion.setText("Consultar");
        jButtonAccion.setEnabled(true);
        jTextFieldLocalizacion.setEnabled(false);
        jTextFieldNombre.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonConsultaActionPerformed

    /**
     * Comprueba si el departamento introducido existe o no.
     * Si existe se podrá modificar, consultar o borrar. Si no existe, se podrá dar de alta.
     * En función de las acciones que se puedan realizar se activarán unos radioButton u otros.
     * 
     * No se podrá cambiar el número de departamento introducido hasta que se pulse cancelar o se realice un acción.
     * 
     * @param evt 
     */
    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
        if(jTextFieldNumero.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe introducir un número de departamento");
        }
        else
        {
            deptNo = Byte.parseByte(jTextFieldNumero.getText());
            
            if(od.existeDepartamento(sesion, deptNo))
            {
                JOptionPane.showMessageDialog(rootPane, "El departamento existe.\nPuede borrar,consultar o modificar el departamento:\n"+od.getDepartamento(sesion, deptNo));
                jRadioButtonBaja.setEnabled(true);
                jRadioButtonmodificacion.setEnabled(true);
                jRadioButtonConsulta.setEnabled(true);
            }   
            else
            {
                 JOptionPane.showMessageDialog(rootPane, "El departamento no existe.\nPuede crear un nuevo registro con ese ID.");
                 jRadioButtonAlta.setEnabled(true);
            }
            jTextFieldNumero.setEditable(false);
        }    
    }//GEN-LAST:event_jButtonComprobarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        resetUI();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void resetUI()
    {
        jButtonAccion.setEnabled(false);
        jTextFieldNumero.setEditable(true);
        jTextFieldNumero.setText("");
        jTextFieldLocalizacion.setEnabled(false);
        jTextFieldLocalizacion.setText("");
        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.setText("");
        jRadioButtonAlta.setEnabled(false);
        jRadioButtonBaja.setEnabled(false);
        jRadioButtonmodificacion.setEnabled(false);
        jRadioButtonConsulta.setEnabled(false);
        buttonGroup1.clearSelection();
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
            java.util.logging.Logger.getLogger(JDialogDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogDepartamentos dialog = new JDialogDepartamentos(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAccion;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonComprobar;
    private javax.swing.JLabel jLabelLocalizacion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JPanel jPanelAcciones;
    private javax.swing.JPanel jPanelDepartamentos;
    private javax.swing.JRadioButton jRadioButtonAlta;
    private javax.swing.JRadioButton jRadioButtonBaja;
    private javax.swing.JRadioButton jRadioButtonConsulta;
    private javax.swing.JRadioButton jRadioButtonmodificacion;
    private javax.swing.JTextField jTextFieldLocalizacion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}