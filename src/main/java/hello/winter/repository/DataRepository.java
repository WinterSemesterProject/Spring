package hello.winter.repository;

import hello.winter.domain.DTO;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DataRepository {
    List<DTO> dataList = new ArrayList<>();

    public List<DTO> findCol(ResultSet rs,String col) throws SQLException {
        while (rs.next()) {
            DTO dto = new DTO();
            dto.setCal(rs.getInt("CALENDAR"));
            dto.setPrice(rs.getInt(col));
            dataList.add(dto);
        }
        return dataList;
    }
}
