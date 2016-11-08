package MisOpciones;

import Tables.Auxemp;
import Tables.Departamentos;
import Tables.Empleados;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Todos los métodos abren cierran una sesión en la base de datos.
 * 
 * @author CrisRodFe
 */
public class OpcionEmpleados 
{
    /**
     * @param sesion
     * @param empNo
     * @param apellido
     * @param dir
     * @param oficio
     * @param salario
     * @param comision
     * @param deptNo 
     * 
     * Inserta un nuevo registro completo en la tabla Empleados a partir de los datos introducidos como parámetros.
     */
    public void altaEmpleado(SessionFactory sesion,int empNo,String apellido,int dir,String oficio,Double salario,Double comision,byte deptNo)
    {
        Session session = sesion.openSession();        
        Transaction tx = session.beginTransaction();       
        
        Empleados em= new Empleados();
        em.setEmpNo(empNo);
        em.setApellido(apellido);
        em.setDir(dir);
        em.setOficio(oficio);
        em.setSalario(salario);
        em.setComision(comision);
       
        Departamentos d = new Departamentos();
        d.setDeptNo(deptNo);
        em.setDepartamentos(d);
       
        java.util.Date hoy= new java.util.Date();
        java.sql.Date fecha= new java.sql.Date(hoy.getTime());
        em.setFechaAlta(fecha);
        
        session.save(em);
        tx.commit();        
        session.close();
        
    }
    
    /**
     * 
     * @param sesion
     * @param empNo 
     * 
     * Elimina un número de registro de la tabla Empleados con el nº identificativo que llega como parámetro.
     */
    public void bajaEmpleado(SessionFactory sesion,int empNo)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Empleados e= new Empleados();
        e   = (Empleados)session.load(Empleados.class,empNo);
        session.delete(e);
        tx.commit();
        
        session.close();
    }
    
    /**
     * 
     * @param sesion
     * @param empNo
     * @param apellido
     * @param dir
     * @param oficio
     * @param salario
     * @param comision
     * @param fechaAlta 
     * 
     * Modifica un registro de la tabla Empleados.
     * 
     * (El control con los if es previo a implementar la muestra por pantalla de los datos del empleado.)
     * 
     */
    public void modificarEmpleados(SessionFactory sesion,int empNo,String apellido,int dir,String oficio,Double salario,Double comision,java.sql.Date fechaAlta)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Empleados em= new Empleados();
        em = (Empleados) session.load(Empleados.class, empNo);
        
        if(!apellido.equals(""))
            em.setApellido(apellido);
        
        if(!oficio.equals(""))
            em.setOficio(oficio);
       
        if(dir == -1)
            em.setDir(dir);
        
        if(salario == -1)
            em.setSalario(salario);
        
        if(comision == -1)
            em.setComision(comision);
        
        if(fechaAlta != null)
            em.setFechaAlta(fechaAlta);
        
        session.update(em);
        tx.commit();
        session.close();
    }
     
    /**
     * 
     * @param sesion
     * @param empNo
     * @return boolean
     * 
     * Devuelve true/false si existe o no un Empleado en la base de datos.
     */
    public boolean existeEmpleado(SessionFactory sesion,int empNo)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Query q= session.createQuery("from Empleados emp where emp.empNo=:empNo"); 
        q.setInteger("empNo",empNo);
        Empleados emp =(Empleados) q.uniqueResult();
        
        tx.commit();
        session.close();
        
        return (emp != null);
    }
     
    /**
     * 
     * @param sesion
     * @return List
     * 
     * Devuelve una lista con todos los registros de la tabla Empleados.
     */
    public List<Empleados> getEmpleados(SessionFactory sesion)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Empleados emp= new Empleados();
        Query q= session.createQuery("from Empleados");
        List<Empleados> lista= q.list();

        return lista;
    }
    
    /**
     * 
     * @param sesion
     * @return List
     * 
     * Devuelve una lista con todos los registros de la tabla AuxEmp
     */
    public List<Auxemp> getAuxEmp(SessionFactory sesion)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Auxemp emp= new Auxemp();
        Query q= session.createQuery("from Auxemp");
        List<Auxemp> lista= q.list();

        return lista;
    }
    
    /**
     * 
     * @param sesion
     * @return 
     * 
     * Devuelve la media del salario,el salario máximo y la suma de salarios de todos el conjuntos de Empleados.
     */
    public String getInfoSalarios(SessionFactory sesion)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("select new map(avg(e.salario) as avg, max(e.salario) as max, sum(salario) as sum) from Empleados as e");
        Map<?, ?> datos = (Map<?, ?>) q.uniqueResult();

        String cadena = "";
        cadena = String.format("%-13s%-13s%-13s\n",datos.get("avg"),datos.get("max"),datos.get("sum"));
        
        return cadena;     
    }  
    
    /**
     * Devuelve la media del salario,el salario máximo y la suma de salarios de los Empleados de un departamento específico introducido como parámetro.
     * @param sesion
     * @param deptNo
     * @return String
     */
    public String getInfoSalariosDept(SessionFactory sesion,byte deptNo)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("select new map(avg(e.salario) as avg, max(e.salario) as max, sum(salario) as sum) from Empleados as e"
                + " where e.departamentos.deptNo = "+deptNo);
        Map<?, ?> datos = (Map<?, ?>) q.uniqueResult();

        String cadena = "";
        DecimalFormat df = new DecimalFormat("0.00");
        String result = df.format(34.4959);    
        
        String media = df.format(datos.get("avg"));
        String max = df.format(datos.get("max"));
        String sum = df.format(datos.get("sum"));
            
        cadena = String.format("%-13s%-13s%-13s\n",media,max,sum);
        return cadena;     
    }

    /**
     * Devuelve una instancia de la clase Empleado, a partir del registro con el número de empleado introducido por parámetro.
     * 
     * @param sesion
     * @param empNo
     * @return Empleados
     */
    public Empleados getEmpleado(SessionFactory sesion, int empNo) 
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        Empleados e = (Empleados) session.load(Empleados.class, empNo);
        
        return e;
    }
    
    /**
     * Recorre una lista de todos los registros de la tabla Auxemp y los inserta en la tabla Empleados.
     * 
     * Si la clave primaria(empNo) ya existe en la tabla Empleados, se lanza una excepción y no sigue insertando más registros.
     * Aparece un mensaje de error con la clave primaria repetida a partir de la que se ha parado la ejecución.
     * 
     * Si se consigue introducir un registro de la tabla auxiliar en la original éste se borra de la primera.
     * 
     * @param sesion
     * @throws Exception 
     */
    public void cargarNuevosEmp(SessionFactory sesion) throws Exception
    {
        Session session = sesion.openSession();
        
        Auxemp auxE = null;
        List<Auxemp> lista= getAuxEmp(sesion);  
        for(int i = 0; i < lista.size() ; i++)
        {
            auxE = (Auxemp) lista.get(i);
            String hqlInsert= "insert into Empleados (empNo, departamentos,apellido,oficio,dir,fechaAlta,salario,comision) "
                    + "select n.empNo, n.auxdep,n.apellido,n.oficio,n.dir,n.fechaAlta,n.salario,n.comision from Auxemp n where n.empNo="+auxE.getEmpNo();

            try{
                Transaction tx = session.beginTransaction(); 
                session.createQuery(hqlInsert).executeUpdate();
                tx.commit();
            }catch(Exception e)
            {
                throw new Exception("Repetición en la clave primaria del registro con clave: "+auxE.getEmpNo()+"\nSe ha cancelado la operación a partir de ese registro.");
            }
            
                hqlInsert= "delete from Auxemp where empNo=" + auxE.getEmpNo();
                Transaction tx = session.beginTransaction(); 
                session.createQuery(hqlInsert).executeUpdate();
                tx.commit();
            
        } 
        session.close();
    } 
}
