/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author Francisco
 */
public class ImprimirReportes {
    
public void RendicionCuenta(int turno,String comision,String neto, String nombre)throws ClassNotFoundException, SQLException{
          
    Runtime basurero = Runtime.getRuntime(); 
    
    try
    {     Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/swrtaxidailysubmission","root","");        
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reporte1.jasper"));
            
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("idturno",turno);
            parametros.put("comision",comision);
            parametros.put("neto",neto);
            parametros.put("nombre",nombre);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperViewer jviewer =  new JasperViewer(jasperPrint,false);
            System.gc();
            jviewer.setVisible(true);
            System.gc();
       }
    catch (JRException e)
    {
      e.printStackTrace();
    }
    
    }

}

