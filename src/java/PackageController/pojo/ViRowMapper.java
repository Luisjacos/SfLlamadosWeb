package PackageController.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class ViRowMapper implements RowMapper<visualizacion> {

    @Override
    public visualizacion mapRow(ResultSet rs, int i) throws SQLException {
        visualizacion vis = new visualizacion();

        vis.setIdEvents(rs.getInt("idEvents"));
        vis.setTipoLlamado(rs.getString("tipoLlamado"));
        vis.setHabitacion(rs.getString("habitacion"));
        vis.setFechaInicio(rs.getDate("fechaInicio"));
        vis.setFechaFinal(rs.getDate("fechaFinal"));
        vis.setTiempoInicio(rs.getTime("tiempoInicio"));
        vis.setTiempoFinal(rs.getTime("tiempoFinal"));

        return vis;
    }

}
