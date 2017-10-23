/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;


import PackageController.pojo.visualizacion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class busquedaController{
    
    
    
    @RequestMapping(method= RequestMethod.GET)      
    public String handlevisualizacion(){
       
        return "/busqueda";
        
    }
    
}
