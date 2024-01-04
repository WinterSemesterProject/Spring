package hello.winter.controller;

import hello.winter.domain.DTO;
import hello.winter.repository.DataRepository;
import hello.winter.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class DataController {
    @GetMapping("/{db}/{item}")
    public List<DTO> dataInfo(@PathVariable String db, @PathVariable String item) throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet(db, item);
        List<DTO> result = dataRepository.findCol(rs,item);
        return result;
    }

}
