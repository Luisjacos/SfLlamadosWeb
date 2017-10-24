/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController;


import PackageController.pojo.busqueda;
import PackageController.service.busquedaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class busquedaController{
    
    @Autowired
    private busquedaService busquedaService;
    
    @RequestMapping("/busqueda") 
    public String showBusqueda(Model model){ 
        
        List<busqueda> busquedas = busquedaService.findAll();
        model.addAttribute("busquedas", busquedas);
    
    return "/busqueda";    
    }
    
}
