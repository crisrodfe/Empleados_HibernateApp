
package MisOpciones;

import Tables.Auxdep;
import Tables.Departamentos;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Todos los métodos abren cierran una sesión en la base de datos.
 * @author CrisRodFe
 */
public class OpcionDepartamentos 
{      
    /**
     * Inserta un nuevo registro completo en la tabla Departamentos a partir de los datos introducidos como parámetros.
     * 
     * @param sesion
     * @param deptNo
     * @param dnombre
     * @param loc 
     */
    public void altaDepartamento(SessionFactory sesion,byte deptNo,String dnombre,String loc)
    {        
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();      
        
        Tables.Departamentos depart = new Tables.Departamentos();
        depart.setDeptNo(deptNo);
        depart.setDnombre(dnombre);
        depart.setLoc(loc);
       
        session.save(depart);
        tx.commit();
        session.close();    
    }
    
    /**
     * Elimina un número de registro de la tabla Departamentos con el nº identificativo que llega como parámetro.
     * 
     * @param sesion
     * @param deptNo 
     */
    public void bajaDepartamento(SessionFactory sesion,byte deptNo)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos d = (Departamentos)session.load(Departamentos.class,(byte)deptNo);
        
        session.delete(d);
        tx.commit();
        session.close();
    }
    
    /**
     * Modifica un registro de la tabla Departamentos.
     * 
     * (El control con los if es previo a implementar la muestra por pantalla de los datos del departamento.)
     * 
     * @param sesion
     * @param deptNo
     * @param nombre
     * @param loc 
     */
    public void modificarDepartamento(SessionFactory sesion,byte deptNo,String nombre,String loc)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos d = (Departamentos) session.load(Departamentos.class,deptNo);       
        
        if(!nombre.equals(""))
            d.setDnombre(nombre);
        if(!loc.equals(""))
            d.setLoc(loc);
        
        session.update(d); 
        tx.commit();
        session.close();
    }
    
    /**
     * Devuelve true/false si existe o no un Departamento en la base de datos.
     * 
     * @param sesion
     * @param deptNo
     * @return boolean
     */
    public boolean existeDepartamento(SessionFactory sesion,int deptNo)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Query q= session.createQuery("from Departamentos d where d.deptNo=:deptNo"); 
        q.setInteger("deptNo",deptNo);
        Departamentos d =(Departamentos) q.uniqueResult();
        
        tx.commit();
        session.close();
        
        return (d != null);
    }
    
    /**
     * Devuelve una lista con todos los registros de la tabla Departamentos.
     * 
     * @param sesion
     * @return List
     */
    public List<Departamentos> getDepartamentos(SessionFactory sesion)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos depar= new Departamentos();
        Query q= session.createQuery("from Departamentos");
        List<Departamentos> lista= q.list();

        tx.commit();
        session.close();
        
        return lista;
    }    
    
    /**
     * Devuelve los empleados asociados al  departamento introducido como parámetro.
     * 
     * @param sesion
     * @param deptNo
     * @return Set
     */
    public Set<?> getEmpleadosSet(SessionFactory sesion,byte deptNo)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Departamentos d = (Departamentos)session.load(Departamentos.class,deptNo);
        
        tx.commit();
        session.close();
        Set<?> setEmpleados = d.getEmpleadoses();
        return setEmpleados;
    }        

    /**
     * Devuelve una instancia de la clase Departamento, a partir del registro con el número de departamento introducido por parámetro.
     * 
     * @param sesion
     * @param deptNo
     * @return Departamentos
     */
    public Departamentos getDepartamento(SessionFactory sesion, byte deptNo) 
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Departamentos d = (Departamentos)session.load(Departamentos.class,(byte)deptNo);
        
        tx.commit();
        session.close();
        
        return d;
    }
    
    /**
     * Devuelve una lista con todos los registros de la tabla Auxdep
     * 
     * @param sesion
     * @return List
     */
    public List<Auxdep> getAuxDept(SessionFactory sesion)
    {
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Auxdep depar= new Auxdep();
        Query q= session.createQuery("from Auxdep");
        List<Auxdep> lista= q.list();

        tx.commit();
        session.close();
        
        return lista; 
    }        
              
    /**
     * Recorre una lista de todos los registros de la tabla Auxemp y los inserta en la tabla Empleados.
     * 
     * Si la clave primaria(deptNo) ya existe en la tabla Departamentos, se lanza una ecepción y no sigue insertando más registros.
     * Aparece un mensaje de error con la clave primaria repetida a partir de la que se ha parado la ejecución.
     * 
     * Si se consigue introducir un registro de la tabla auxiliar en la original éste se borra de la primera.
     * 
     * @param sesion
     * @throws Exception 
     */
    public void cargarNuevosDept(SessionFactory sesion) throws Exception
    {
        Session session = sesion.openSession();
        
        Auxdep auxD = null;
        List<Auxdep> lista= getAuxDept(sesion);  
        for(int i = 0; i < lista.size() ; i++)
        {
            auxD = (Auxdep) lista.get(i);
            String hqlInsert= "insert into Departamentos (deptNo, dnombre,loc) select n.deptNo, n.dnombre, n.loc from Auxdep n where n.deptNo="+auxD.getDeptNo();

            try
            {   Transaction tx = session.beginTransaction(); 
                session.createQuery(hqlInsert).executeUpdate();
                tx.commit();
            }catch(Exception e)
            {
                throw new Exception("Repetición en la clave primaria del registro con clave: "+auxD.getDeptNo()+"\nSe ha cancelado la operación.");
            }
           
                hqlInsert= "delete from Auxdep where deptNo=" + auxD.getDeptNo();
                Transaction tx = session.beginTransaction(); 
                session.createQuery(hqlInsert).executeUpdate();
                tx.commit();
            
            
        } 
        session.close();
    }        
}
