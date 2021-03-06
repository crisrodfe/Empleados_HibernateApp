/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import MisOpciones.OpcionEmpleados;
import MisOpciones.OpcionDepartamentos;
import Tables.Empleados;
import Tables.SessionFactoryUtil;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

/**
 *
 * @author CrisRodFe
 */
public class JDialogEmpleados extends javax.swing.JDialog {

    private static SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
    private static int empNo;
    private OpcionDepartamentos od = new OpcionDepartamentos();
    private OpcionEmpleados oe = new OpcionEmpleados();
    
    /**
     * Creates new form JPanelEmpleados
     */
    public JDialogEmpleados(java.awt.Frame parent, boolean modal) {
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
        jPanelDepartamentos = new javax.swing.JPanel();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDir = new javax.swing.JTextField();
        jLabelDir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldOficio = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldComision = new javax.swing.JTextField();
        jLabelDep = new javax.swing.JLabel();
        jTextFieldDept = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonAccion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonmodificacion = new javax.swing.JRadioButton();
        jRadioButtonConsulta = new javax.swing.JRadioButton();
        jRadioButtonBaja = new javax.swing.JRadioButton();
        jRadioButtonAlta = new javax.swing.JRadioButton();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonComprobar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelDepartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos de Departamentos"));

        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido");

        jLabelDir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDir.setText("Dir");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Oficio");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Salario");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Comision");

        jLabelDep.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDep.setText("Nº Dept.");

        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFecha.setText("<html>Fecha Alta:<br>(dd/mm/aa)</html>");

        jTextFieldFecha.setToolTipText("");

        javax.swing.GroupLayout jPanelDepartamentosLayout = new javax.swing.GroupLayout(jPanelDepartamentos);
        jPanelDepartamentos.setLayout(jPanelDepartamentosLayout);
        jPanelDepartamentosLayout.setHorizontalGroup(
            jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                        .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelDir)
                            .addComponent(jLabelDep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDir, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jTextFieldDept)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                                .addComponent(jLabelFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldComision))))
                    .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldOficio)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSalario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDepartamentosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabelApellido, jLabelDep, jLabelDir, jLabelFecha});

        jPanelDepartamentosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldApellido, jTextFieldComision, jTextFieldDept, jTextFieldDir, jTextFieldFecha, jTextFieldOficio, jTextFieldSalario});

        jPanelDepartamentosLayout.setVerticalGroup(
            jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDir)
                    .addComponent(jLabelFecha)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDepartamentosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabelApellido, jLabelDep, jLabelDir, jLabelFecha});

        jPanelDepartamentosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldApellido, jTextFieldComision, jTextFieldDept, jTextFieldDir, jTextFieldFecha, jTextFieldOficio, jTextFieldSalario});

        jButtonAccion.setText("Acción");
        jButtonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Elige una opción"));

        buttonGroup1.add(jRadioButtonmodificacion);
        jRadioButtonmodificacion.setText("Modificacion");
        jRadioButtonmodificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonmodificacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonConsulta);
        jRadioButtonConsulta.setText("Consulta");
        jRadioButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConsultaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonAlta)
                    .addComponent(jRadioButtonBaja))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonConsulta)
                    .addComponent(jRadioButtonmodificacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButtonAlta, jRadioButtonBaja, jRadioButtonConsulta, jRadioButtonmodificacion});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonBaja))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonmodificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonConsulta)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRadioButtonAlta, jRadioButtonBaja, jRadioButtonConsulta, jRadioButtonmodificacion});

        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNumero.setText("Emp.Numero");

        jButtonComprobar.setText("Comprobar");
        jButtonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarActionPerformed(evt);
            }
        });

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
                .addGap(26, 26, 26)
                .addComponent(jLabelNumero)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonComprobar)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButtonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addGap(34, 34, 34))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAccion, jButtonCancelar, jButtonComprobar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonComprobar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAccion, jButtonCancelar, jButtonComprobar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAltaActionPerformed
        jButtonAccion.setText("Dar de Alta");
        jButtonAccion.setEnabled(true);
        
        jTextFieldApellido.setEnabled(true);
        jTextFieldComision.setEnabled(true);
        jTextFieldDept.setEnabled(true);
        jTextFieldDir.setEnabled(true);
        jTextFieldOficio.setEnabled(true);
        jTextFieldSalario.setEnabled(true);
        resetUI();
    }//GEN-LAST:event_jRadioButtonAltaActionPerformed

    private void jRadioButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBajaActionPerformed
        jButtonAccion.setText("Dar de Baja");
        jButtonAccion.setEnabled(true);

    }//GEN-LAST:event_jRadioButtonBajaActionPerformed

    private void jRadioButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConsultaActionPerformed
        jButtonAccion.setText("Consultar");
        jButtonAccion.setEnabled(true);

    }//GEN-LAST:event_jRadioButtonConsultaActionPerformed

    private void jRadioButtonmodificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonmodificacionActionPerformed
        jButtonAccion.setText("Modificar");
        jButtonAccion.setEnabled(true);
        
        Empleados e = oe.getEmpleado(sesion, empNo);
        
        jTextFieldApellido.setEnabled(true);
        jTextFieldApellido.setText(e.getApellido());
        jTextFieldComision.setEnabled(true);
        jTextFieldComision.setText(String.valueOf(e.getComision()));
        jTextFieldDept.setEnabled(true);
        jTextFieldDept.setText(String.valueOf(e.getDepartamentos().getDeptNo()));
        jTextFieldDir.setEnabled(true);
        jTextFieldDir.setText(String.valueOf(e.getDir()));
        jTextFieldFecha.setEnabled(true);
        String date = new SimpleDateFormat("dd/MM/yyyy").format(e.getFechaAlta());
        jTextFieldFecha.setText(date);
        jTextFieldOficio.setEnabled(true);
        jTextFieldOficio.setText(e.getOficio());
        jTextFieldSalario.setEnabled(true);
        jTextFieldSalario.setText(String.valueOf(e.getSalario()));
    }//GEN-LAST:event_jRadioButtonmodificacionActionPerformed

     /**
     * 
     * Dará de alta, modificará,borrará o mostrará un empleado dependiendo del texto del botón(cambia dinámicamente a partir del radioButton pulsado):
     *
     * Aparecerán mensajes de confirmación para el usuario y mensajes con el resultado de la acción. 
     * 
     * @param evt 
     */
    private void jButtonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccionActionPerformed
        
        String nombre = jButtonAccion.getText();
        
        empNo = Integer.parseInt(jTextFieldNumero.getText());          
        int resp;

        String apellido;
        String oficio;
        Integer dir;
        Double salario;        
        Double comision;  
        Byte deptNo; 
        String fechaAlta;
                
        switch(nombre)
        {
            case "Dar de Alta":

                apellido = jTextFieldApellido.getText();
                oficio = jTextFieldOficio.getText();
                dir = jTextFieldDir.getText().equals("")?null:Integer.parseInt(jTextFieldDir.getText());
                salario = jTextFieldSalario.getText().equals("")?null:Double.parseDouble(jTextFieldSalario.getText());
                comision = jTextFieldComision.getText().equals("")?null:Double.parseDouble(jTextFieldComision.getText());;
                deptNo = jTextFieldDept.getText().equals("")?null:Byte.parseByte(jTextFieldDept.getText());

                if(apellido.isEmpty() || oficio.isEmpty() || dir==null || salario==null || comision==null || deptNo==null  )
                {
                    JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos para crear un nuevo registro.");
                    return;
                }
                else
                {
                    if(!od.existeDepartamento(sesion, deptNo))
                    {
                        JOptionPane.showMessageDialog(rootPane, "No puede incluir el nuevo empleado en ese departamento.\nEl departamento no existe..");
                        return;
                    }    
                    else
                    {
                        resp = JOptionPane.showConfirmDialog(null,"¿Quiere crear el siguiente departamento?"+
                                                  "\nNº: "+empNo+
                                                  "\nApellido: "+apellido+
                                                  "\nDir: " + dir+
                                                  "\nSalario: "+salario+  
                                                  "\nComisión: "+comision+
                                                  "\nNºDept: "+deptNo,"",JOptionPane.OK_CANCEL_OPTION);
                        if (resp == JOptionPane.OK_OPTION)
                        {
                            oe.altaEmpleado(sesion, empNo, apellido, dir, oficio, salario, comision, deptNo);
                            JOptionPane.showMessageDialog(rootPane, "Se ha creado un nuevo empleado:\n."+oe.getEmpleado(sesion, empNo));
                            resetUI();
                        }                          
                    }    
                }    
                break;

            case "Dar de Baja":
                resp = JOptionPane.showConfirmDialog(null,"¿Está seguro que quiere borrar el empleado\n"+oe.getEmpleado(sesion, empNo)+"?","",JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_NO_OPTION)
                {
                    oe.bajaEmpleado(sesion, empNo);
                    JOptionPane.showMessageDialog(rootPane, "El empleado ha sido eliminado");
                    resetUI();
                }     
            break; 

            case "Modificar":
                resp = JOptionPane.showConfirmDialog(null,"¿Está seguro que quiere modificar el empleado\n"+oe.getEmpleado(sesion, empNo)+"?");
                if (resp == JOptionPane.YES_NO_OPTION)
                {
                //Código creado antes de que la app mostrara en cada campo la información del empleado que se va a modificar
                //Si el campo estaba vacío se suponía que no se quería modificar,por lo que se le daba un valor negativo a los numéricos
                //y una cadena vacía a las cadenas. 
                //El método de modificarEmpleados, si recibe -1 o "" no modifica, si recibe otra cosa, modifica el valor del campo.
    
                    apellido = jTextFieldApellido.getText();
                    oficio = jTextFieldOficio.getText();
                    dir = jTextFieldDir.getText().equals("")?-1:Integer.parseInt(jTextFieldDir.getText());
                    salario = jTextFieldSalario.getText().equals("")?-1:Double.parseDouble(jTextFieldSalario.getText());
                    comision = jTextFieldComision.getText().equals("")?-1:Double.parseDouble(jTextFieldComision.getText());
                    deptNo = jTextFieldDept.getText().equals("")?-1:Byte.parseByte(jTextFieldDept.getText());
                    fechaAlta = jTextFieldFecha.getText();

                    if(!fechaAlta.equals("") && dameFecha(fechaAlta) == null)
                    {
                        JOptionPane.showMessageDialog(rootPane, "El formato de fecha es erróneo.");
                        return;
                    }
                    else
                    {    
                        java.sql.Date miFecha = fechaAlta.equals("")?null:dameFecha(fechaAlta);
                        oe.modificarEmpleados(sesion, empNo,apellido,dir,oficio,salario,comision,miFecha);
                        JOptionPane.showMessageDialog(rootPane, "El empleado ha sido modificado.\nNuevo empleado:\n"+oe.getEmpleado(sesion, empNo));
                        resetUI();
                    }
                }     
            break;

        case "Consultar":
            JOptionPane.showMessageDialog(rootPane, "Los datos del empleado son:\n"+oe.getEmpleado(sesion, empNo));
            resetUI();
            break;
        }
        
    }//GEN-LAST:event_jButtonAccionActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        resetUI();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * Comprueba si el empleado introducido existe o no.
     * Si existe se podrá modificar, consultar o borrar. Si no existe, se podrá dar de alta.
     * En función de las acciones que se puedan realizar se activarán unos radioButton u otros.
     * 
     * No se podrá cambiar el número de empleado introducido hasta que se pulse cancelar o se realice un acción.
     * 
     * @param evt 
     */
    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
        if(jTextFieldNumero.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe introducir un número de empleado");
        }
        else
        {
            empNo = Integer.parseInt(jTextFieldNumero.getText());
            
            if(oe.existeEmpleado(sesion, empNo))
            {
                JOptionPane.showMessageDialog(rootPane, "El empleado existe.\nPuede borrar,consultar o modificar el empleado:\n"+oe.getEmpleado(sesion, empNo));
                jRadioButtonBaja.setEnabled(true);
                jRadioButtonmodificacion.setEnabled(true);
                jRadioButtonConsulta.setEnabled(true);
            }   
            else
            {
                 JOptionPane.showMessageDialog(rootPane, "El empleado no existe.\nPuede crear un nuevo registro con ese ID.");
                 jRadioButtonAlta.setEnabled(true);
            }
            jTextFieldNumero.setEditable(false);
        } 
    }//GEN-LAST:event_jButtonComprobarActionPerformed

    private void resetUI()
    {
        jTextFieldNumero.setEditable(true);
        
        jButtonAccion.setEnabled(false);
        
        jRadioButtonAlta.setEnabled(false);
        jRadioButtonBaja.setEnabled(false);
        jRadioButtonConsulta.setEnabled(false);
        jRadioButtonmodificacion.setEnabled(false);

        buttonGroup1.clearSelection();

        jTextFieldApellido.setEnabled(false);
        jTextFieldComision.setEnabled(false);
        jTextFieldDept.setEnabled(false);
        jTextFieldDir.setEnabled(false);
        jTextFieldFecha.setEnabled(false);
        jTextFieldOficio.setEnabled(false);
        jTextFieldSalario.setEnabled(false);

        jTextFieldApellido.setText("");
        jTextFieldComision.setText("");
        jTextFieldDept.setText("");
        jTextFieldDir.setText("");
        jTextFieldFecha.setText("");
        jTextFieldNumero.setText("");
        jTextFieldOficio.setText("");
        jTextFieldSalario.setText("");

    }
   
    private java.sql.Date dameFecha(String fecha)
    {
        if (!fecha.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) 
        {
            return null;
        } 
        else
        {
            int dia = Integer.parseInt(fecha.substring(0,2));
            int mes = Integer.parseInt(fecha.substring(3,5));           
            int anio = Integer.parseInt(fecha.substring(6,fecha.length()));
            String date = anio+"-"+mes+"-"+dia;
            java.sql.Date fechaSQL = java.sql.Date.valueOf(date);
            
            return fechaSQL;
        }  
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
            java.util.logging.Logger.getLogger(JDialogEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogEmpleados dialog = new JDialogEmpleados(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDep;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDepartamentos;
    private javax.swing.JRadioButton jRadioButtonAlta;
    private javax.swing.JRadioButton jRadioButtonBaja;
    private javax.swing.JRadioButton jRadioButtonConsulta;
    private javax.swing.JRadioButton jRadioButtonmodificacion;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldComision;
    private javax.swing.JTextField jTextFieldDept;
    private javax.swing.JTextField jTextFieldDir;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOficio;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
