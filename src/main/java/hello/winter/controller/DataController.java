package hello.winter.controller;

import hello.winter.domain.DTO;
import hello.winter.repository.DataRepository;
import hello.winter.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
@RestController
@Slf4j
public class DataController {
    @GetMapping("/CPU/CPU1")
    public List<DTO> CPU1() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("CPU", "CPU1");
        List<DTO> cpu1 = dataRepository.findCol(rs,"CPU1");
        return cpu1;
    }

    @GetMapping("/CPU/CPU2")
    public List<DTO> CPU2() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("CPU", "CPU2");
        List<DTO> cpu2 = dataRepository.findCol(rs,"CPU2");
        return cpu2;
    }

    @GetMapping("/CPU/CPU3")
    public List<DTO> CPU3() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("CPU", "CPU3");
        List<DTO> cpu3 = dataRepository.findCol(rs,"CPU3");
        return cpu3;
    }

    @GetMapping("/RAM/RAM1")
    public List<DTO> RAM1() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("RAM", "RAM1");
        List<DTO> ram1 = dataRepository.findCol(rs,"RAM1");
        return ram1;
    }

    @GetMapping("/RAM/RAM2")
    public List<DTO> RAM2() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("RAM", "RAM2");
        List<DTO> ram2 = dataRepository.findCol(rs,"RAM2");
        return ram2;
    }

    @GetMapping("/RAM/RAM3")
    public List<DTO> RAM3() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("RAM", "RAM3");
        List<DTO> ram3 = dataRepository.findCol(rs,"RAM3");
        return ram3;
    }

    @GetMapping("/GC/GC1")
    public List<DTO> GC1() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("GC", "GC1");
        List<DTO> gc1 = dataRepository.findCol(rs,"GC1");
        return gc1;
    }

    @GetMapping("/GC/GC2")
    public List<DTO> GC2() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("GC", "GC2");
        List<DTO> gc2 = dataRepository.findCol(rs,"GC2");
        return gc2;
    }

    @GetMapping("/GC/GC3")
    public List<DTO> GC3() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("GC", "GC3");
        List<DTO> gc3 = dataRepository.findCol(rs,"GC3");
        return gc3;
    }

    @GetMapping("/SSD/SSD1")
    public List<DTO> SSD1() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("SSD", "SSD1");
        List<DTO> ssd1 = dataRepository.findCol(rs,"SSD1");
        return ssd1;
    }

    @GetMapping("/SSD/SSD2")
    public List<DTO> SSD2() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("SSD", "SSD2");
        List<DTO> ssd2 = dataRepository.findCol(rs,"SSD2");
        return ssd2;
    }

    @GetMapping("/SSD/SSD3")
    public List<DTO> SSD3() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("SSD", "SSD3");
        List<DTO> ssd3 = dataRepository.findCol(rs,"SSD3");
        return ssd3;
    }

    @GetMapping("/HDD/HDD1")
    public List<DTO> HDD1() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("HDD", "HDD1");
        List<DTO> hdd1 = dataRepository.findCol(rs,"HDD1");
        return hdd1;
    }

    @GetMapping("/HDD/HDD2")
    public List<DTO> HDD2() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("HDD", "HDD2");
        List<DTO> hdd2 = dataRepository.findCol(rs,"HDD2");
        return hdd2;
    }

    @GetMapping("/HDD/HDD3")
    public List<DTO> HDD3() throws SQLException, ClassNotFoundException {
        DataRepository dataRepository = new DataRepository();
        DataService dataService = new DataService();
        ResultSet rs = dataService.findResultSet("HDD", "HDD3");
        List<DTO> hdd3 = dataRepository.findCol(rs,"HDD3");
        return hdd3;
    }
}
