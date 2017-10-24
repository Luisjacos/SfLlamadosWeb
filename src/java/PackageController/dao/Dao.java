/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController.dao;


import PackageController.pojo.busqueda;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author ThinkPad X240
 */
public interface Dao {
  
     public List<busqueda> findAll();
     public List<busqueda> findByTipoLLamada(String tipoLlamado);
     
     
        
       
}
