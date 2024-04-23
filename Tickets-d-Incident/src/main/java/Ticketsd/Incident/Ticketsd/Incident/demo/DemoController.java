package Ticketsd.Incident.Ticketsd.Incident.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/DemoController")
public class DemoController {
    @GetMapping
    public ResponseEntity<String>sayHello(){
        return  ResponseEntity.ok("hello from secured endpoint");
    }
}
