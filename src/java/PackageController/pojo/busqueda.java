/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageController.pojo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;







/**
 *
 * @author ThinkPad X240
 */
public class busqueda {
    
  
    private int  idEvents;
    private String tipoLlamado;
    private String habitacion;
    Date fechaInicio;
    Date fechaFinal;
    Time tiempoInicio;
    Time tiempoFinal;
    
   
   
    
public static String diferenciasDeFechas(Time tiempoInicio, Time tiempoFinal) {

        long fechaInicialMs = tiempoInicio.getTime();
        long fechaFinalMs = tiempoFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        int segundos = (int) (diferencia /1000);
        
        if ( segundos < 60){
             
             return String.valueOf(segundos) + "segundos";
             
                 
        }else if ((segundos >= 60) && (segundos <3600) ){
            int minutos =(int) (segundos)/60;
            return String.valueOf(minutos) + "minutos";
            
        }else 
            return String.valueOf(segundos/3600) + "horas";   
        
    }

   
     
    
    public busqueda(){
        
       
        
    }
  
    public busqueda (int idEvents, String tipoLlamado, String habitacion,Date fechaInicio,
            Date fechaFinal, Time tiempoInicio, Time tiempoFinal){
       
        
        
        
    
        this.idEvents = idEvents;
        this.tipoLlamado = tipoLlamado;
        this.habitacion= habitacion;
        this.fechaInicio= fechaInicio;
        this.fechaFinal=fechaFinal;
        this.tiempoInicio= tiempoInicio;
        this.tiempoFinal= tiempoFinal;
        
    }
    
     public int getidEvents(){
        return idEvents;
    }
    public void setIdEvents(int idEvents){
        this.idEvents = idEvents;
    }
    
    public String gettipoLlamado(){
        return tipoLlamado;
    }
    public void setTipoLlamado(String tipoLlamado){
        this.tipoLlamado = tipoLlamado;
    }
    
    public String gethabitacion(){
        return habitacion;
    }
    public void setHabitacion(String habitacion){
        this.habitacion = habitacion;
    }
    public Date getfechaInicio(){
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio=fechaInicio;
    }
    public Date getfechaFinal(){
        return fechaFinal;
    }
    public void setFechaFinal(Date fechaFinal){
        this.fechaFinal=fechaFinal;
    }
    public  Time gettiempoInicio(){
        return tiempoInicio;
    }
    public void setTiempoInicio(Time tiempoInicio){
        this.tiempoInicio = tiempoInicio;
    }
     public  Time gettiempoFinal(){
        return tiempoFinal;
    }
    public void setTiempoFinal(Time tiempoFinal){
        this.tiempoFinal = tiempoFinal;
    }
    
        
    @Override
    public String toString(){
                
        return "Visualizacion [ idEvents=" +idEvents +", tipoLlamado="+ tipoLlamado +", "
                + "habitacion="+ habitacion +", Tiempo en contestar el Llamado="+ busqueda.diferenciasDeFechas(tiempoInicio, tiempoFinal);
    }
    
}
