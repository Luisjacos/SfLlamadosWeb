/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController.dao;



import PackageController.pojo.busqueda;
import java.util.List;


public interface Dao {
  
     public List<busqueda> findAll();
     public List<busqueda> findByTipoLLamada(String tipoLlamado);
     
     
        
       
}
