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



public class ImprimirReportes {
    
public void RendicionCuenta(int turno,String comision,String neto, String nombre,String recaudacionReal)throws ClassNotFoundException, SQLException{
          
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
            parametros.put("recaudacionReal",recaudacionReal);
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
    public void planillaCaja(String fecha,String tipo,String totalNeto,String totalGastos,String subEfectivo,String subChequeras,String total)throws ClassNotFoundException, SQLException{
          
    Runtime basurero = Runtime.getRuntime(); 
    
    try
    {     Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/swrtaxidailysubmission","root","");        
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(this.getClass().getResource("reportCaja.jasper"));
            
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("fecha",fecha);
            parametros.put("tipoTurno",tipo);
            parametros.put("totalNeto",totalNeto);
            parametros.put("totalGastos",totalGastos);
            parametros.put("subEfectivo",subEfectivo);
            parametros.put("subChequeras",subChequeras);
            parametros.put("total",total);
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

