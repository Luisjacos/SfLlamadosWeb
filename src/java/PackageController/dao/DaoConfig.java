/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController.dao;

import PackageController.pojo.ViRowMapper;
import PackageController.pojo.visualizacion;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;


public class DaoConfig implements DaoImpl{
    
    private NamedParameterJdbcTemplate jdbcTemplate;
    
     @Autowired
     public void setDataSource(DataSource dataSource){
        
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

   @Override
    public List<visualizacion> findAll(Model model) {
        return  jdbcTemplate.query("select * from events",new ViRowMapper());
       
}
    }

//    @Override
//    public List<visualizacion> findByTipoLLamada(String tipoLlamado) {
//        return jdbcTemplate.query("select *from events where tipoLlamado like :tipoLlamado"
//                ,new MapSqlParameterSource("tipoLlamado", "%" + tipoLlamado + "%"),new ViRowMapper());
//        
//        
//    }

    

    

   
    

