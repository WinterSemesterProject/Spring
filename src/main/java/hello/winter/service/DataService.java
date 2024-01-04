package hello.winter.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service
@Slf4j
public class DataService {
    public ResultSet findResultSet(String db, String num) throws SQLException, ClassNotFoundException {
        String sql = "SELECT CALENDAR, " + num + " FROM " + db;
        String url = "jdbc:mysql://sejongwinterproject.ckkpavqulpya.ap-northeast-2.rds.amazonaws.com:3306/demo?characterEncoding=UTF-8&serverTimezone=UTC";
        String id = "admin";
        String pw = "no0431**";
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, id, pw);
        Statement stmt = con.createStatement();
        log.info(sql);
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            log.info("해당 데이터 존재하지 않음");
            throw e;
        }
    }
}
