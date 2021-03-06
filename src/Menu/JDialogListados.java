/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import MisOpciones.OpcionDepartamentos;
import MisOpciones.OpcionEmpleados;
import Tables.Departamentos;
import Tables.Empleados;
import Tables.SessionFactoryUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

/**
 *
 * @author CrisRodFe
 */
public class JDialogListados extends javax.swing.JDialog {

    private static final SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
    private OpcionDepartamentos od = new OpcionDepartamentos();
    private OpcionEmpleados oe = new OpcionEmpleados();
    
    /**
     * Creates new form JDialogListados
     */
    public JDialogListados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListado = new javax.swing.JTextArea();
        jRadioButtonDept = new javax.swing.JRadioButton();
        jRadioButtonEmp = new javax.swing.JRadioButton();
        jRadioButtonSelec = new javax.swing.JRadioButton();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonVerListado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTextAreaListado.setColumns(20);
        jTextAreaListado.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextAreaListado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListado);

        buttonGroup1.add(jRadioButtonDept);
        jRadioButtonDept.setSelected(true);
        jRadioButtonDept.setText("Todos los Departamentos");

        buttonGroup1.add(jRadioButtonEmp);
        jRadioButtonEmp.setText("Todos los Empleados");

        buttonGroup1.add(jRadioButtonSelec);
        jRadioButtonSelec.setText("Empleados de departamento nº:");

        jButtonVerListado.setText("Ver Listado");
        jButtonVerListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonDept, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButtonVerListado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jRadioButtonDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonEmp)
                    .addComponent(jButtonVerListado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSelec)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRadioButtonDept, jRadioButtonEmp, jRadioButtonSelec});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Mostrará el listado marcado por los radioButtons.
     * 
     * Si se va a consultar de un dept específico se comprueba que se ha introducido un valor y de que el departamento existe.
     * 
     * @param evt 
     */
    private void jButtonVerListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerListadoActionPerformed
        if(jRadioButtonDept.isSelected())
        {
            List<Departamentos> miLista = od.getDepartamentos(sesion);
            Iterator <Departamentos> iter= miLista.iterator();
            Departamentos d = new Departamentos();
            
            String cabecera = String.format("%-13s%-13s%-13s\n", "NÚMERO","NOMBRE","LOCAL.");
            
            jTextAreaListado.setText(cabecera);
            while (iter.hasNext()) 
            {
                d = (Departamentos) iter.next();
                jTextAreaListado.append(String.format("%-13s%-13s%-13s\n",d.getDeptNo(),d.getDnombre(),d.getLoc()));
            }
        }   
        
        if(jRadioButtonEmp.isSelected())
        {
            List<Empleados> miLista = oe.getEmpleados(sesion);
            Iterator <Empleados> iter= miLista.iterator();
            Empleados e = new Empleados();
            
            String cabecera = String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n", "NªEMP","APELLIDO","OFICIO","DIR","FECHA DE ALTA","SALARIO","COMISION","NºDEPT");
            jTextAreaListado.setText(cabecera);
            while (iter.hasNext()) 
            {
                e = (Empleados) iter.next();
                jTextAreaListado.append(String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n",
                        e.getEmpNo(),e.getApellido(),e.getOficio(),e.getDir(),e.getFechaAlta(),e.getSalario(),e.getComision(),e.getDepartamentos().getDeptNo()));
            }
        } 
        
        if(jRadioButtonSelec.isSelected())
        {
            if(jTextFieldNumero.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Debe introducir un número de departamento.");
            }    
            else
            {
                byte deptNo = Byte.parseByte(jTextFieldNumero.getText());
                if(od.existeDepartamento(sesion, deptNo))
                {
                    Set<Empleados> misEmpleados = (Set<Empleados>) od.getEmpleadosSet(sesion, deptNo);
                    Iterator <Empleados> iter= misEmpleados.iterator();
                    Empleados e; 
                    String cabecera = String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n", "NªEMP","APELLIDO","OFICIO","DIR","FECHA DE ALTA","SALARIO","COMISION","NºDEPT");
                    jTextAreaListado.setText(cabecera);
                    while (iter.hasNext()) 
                    {
                        e = (Empleados) iter.next();
                        jTextAreaListado.append(String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n",
                        e.getEmpNo(),e.getApellido(),e.getOficio(),e.getDir(),e.getFechaAlta(),e.getSalario(),e.getComision(),e.getDepartamentos().getDeptNo()));
  
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "El departamento no existe.");
                }    
            }                
        }    
    }//GEN-LAST:event_jButtonVerListadoActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogListados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogListados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogListados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogListados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogListados dialog = new JDialogListados(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonVerListado;
    private javax.swing.JRadioButton jRadioButtonDept;
    private javax.swing.JRadioButton jRadioButtonEmp;
    private javax.swing.JRadioButton jRadioButtonSelec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListado;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
