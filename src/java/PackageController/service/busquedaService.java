/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController.service;

import PackageController.dao.Dao;
import PackageController.pojo.busqueda;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class busquedaService {
    
    @Autowired
    private Dao dao;

    public List<busqueda> findAll() {
        
        return dao.findAll();
    }
    
}
