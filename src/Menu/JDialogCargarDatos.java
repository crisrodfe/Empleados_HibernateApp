
package Menu;

import MisOpciones.OpcionDepartamentos;
import MisOpciones.OpcionEmpleados;
import Tables.Auxdep;
import Tables.Auxemp;
import Tables.Departamentos;
import Tables.Empleados;
import Tables.SessionFactoryUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

/**
 *
 * @author CrisRodFe
 */
public class JDialogCargarDatos extends javax.swing.JDialog {

    private static final SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
    private OpcionDepartamentos od = new OpcionDepartamentos();
    private OpcionEmpleados oe = new OpcionEmpleados();
    /**
     * Creates new form JDialogCargarDatos
     */
    public JDialogCargarDatos(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonDepartamentos = new javax.swing.JButton();
        jButtonEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonDepartamentos.setText("Cargar Departamentos");
        jButtonDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepartamentosActionPerformed(evt);
            }
        });

        jButtonEmpleados.setText("Cargar Empleados");
        jButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButtonDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, Short.MAX_VALUE)
                .addGap(103, 103, 103)
                .addComponent(jButtonEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEmpleados))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonDepartamentos, jButtonEmpleados});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Muestra una ventana de diálogo con los datos de la tabla auxiliar que se van a cargar.
     * Si se pulsa cancelar no ocurre nada. Si se acepta se cargan los datos.
     * 
     * Si todos los datos se han cargado se muestra un mensaje y en el area de texto aparecen todos los departamentos.
     * Si falla la insercción de datos aparece un diálogo informando a partir de qué registro se ha parado la ejecución.
     * 
     * @param evt 
     */
    private void jButtonDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepartamentosActionPerformed
        jTextArea1.setText("");
        List<Auxdep> nuevaLista = od.getAuxDept(sesion);             
        Iterator <Auxdep> iter= nuevaLista.iterator();
        Auxdep auxD = new Auxdep();
        String datosNuevos = String.format("%-13s%-13s%-13s\n", "NÚMERO","NOMBRE","LOCAL.");
        while (iter.hasNext()) 
        {
            auxD = (Auxdep) iter.next();
            datosNuevos += String.format("%-13s%-13s%-13s\n",auxD.getDeptNo(),auxD.getDnombre(),auxD.getLoc());
        }
       
        int resp = JOptionPane.showConfirmDialog(null,"¿Quiere añadir los siguientes registros?\n"+datosNuevos,"",JOptionPane.OK_CANCEL_OPTION);
        if (resp == JOptionPane.OK_OPTION)
        {                      
            try {
                od.cargarNuevosDept(sesion);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane,ex.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Han sido añadidos los nuevos datos.");
        }  
        else
        {
            return;
        }    
        
        String cabecera = String.format("%-13s%-13s%-13s\n", "NÚMERO","NOMBRE","LOCAL.");
        jTextArea1.setText(cabecera);
        Iterator<Departamentos> it = od.getDepartamentos(sesion).iterator();
        Departamentos d;
        while (it.hasNext()) 
        {
            d = (Departamentos) it.next();
            jTextArea1.append(String.format("%-13s%-13s%-13s\n",d.getDeptNo(),d.getDnombre(),d.getLoc()));
        }
    }//GEN-LAST:event_jButtonDepartamentosActionPerformed

    /**
    * Muestra una ventana de diálogo con los datos de la tabla auxiliar que se van a cargar.
    * Si se pulsa cancelar no ocurre nada. Si se acepta se cargan los datos.
    * 
    * Si todos los datos se han cargado se muestra un mensaje y en el area de texto aparecen todos los empleados.
    * Si falla la insercción de datos aparece un diálogo informando a partir de qué registro se ha parado la ejecución.
    * 
    * @param evt 
    */
    private void jButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadosActionPerformed
        jTextArea1.setText("");
        List<Auxemp> nuevaLista = oe.getAuxEmp(sesion);             
        Iterator <Auxemp> iter= nuevaLista.iterator();
        Auxemp auxE = new Auxemp();
        String datosNuevos = String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n", "NªEMP","APELLIDO","OFICIO","DIR","FECHA DE ALTA","SALARIO","COMISION","NºDEPT");
        while (iter.hasNext()) 
        {
            auxE = (Auxemp) iter.next();
            datosNuevos += String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n",
                        auxE.getEmpNo(),auxE.getApellido(),auxE.getOficio(),auxE.getDir(),
                        auxE.getFechaAlta(),auxE.getSalario(),auxE.getComision(),auxE.getAuxdep().getDeptNo());
        }
       
        int resp = JOptionPane.showConfirmDialog(null,"¿Quiere añadir los siguientes registros?\n"+datosNuevos,"",JOptionPane.OK_CANCEL_OPTION);
        JOptionPane jp = new JOptionPane();
        if (resp == JOptionPane.OK_OPTION)
        {                      
            try {
                oe.cargarNuevosEmp(sesion);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane,ex.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Han sido añadidos los nuevos datos.");
        }  
        
        
        jTextArea1.setText(String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n", "NªEMP","APELLIDO","OFICIO","DIR","FECHA DE ALTA","SALARIO","COMISION","NºDEPT"));
        Iterator<Empleados> it = oe.getEmpleados(sesion).iterator();
        Empleados e;
        while (it.hasNext()) 
        {
            e = (Empleados) it.next();
            jTextArea1.append(String.format("%-7s%-14s%-14s%-6s%-14s%-9s%-10s%-8s\n",
                        e.getEmpNo(),e.getApellido(),e.getOficio(),e.getDir(),e.getFechaAlta(),e.getSalario(),e.getComision(),e.getDepartamentos().getDeptNo()));
        }
        
    }//GEN-LAST:event_jButtonEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogCargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCargarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCargarDatos dialog = new JDialogCargarDatos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonDepartamentos;
    private javax.swing.JButton jButtonEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
