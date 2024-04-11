package ws.ptm.postman.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class ctrl {


    @GetMapping
    public String index(){
        return "Hello World";
    }

    @PostMapping("/emps")
    public ResponseEntity<?> allEmployee(){
        List<String> emp = Arrays.asList("John", "Jane", "Robert");
        return ResponseEntity.ok(emp);
    }

    @PostMapping("/emps/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable int id){
        List<String> emp = List.of("Dever");
        return ResponseEntity.ok(emp);
    }
}
