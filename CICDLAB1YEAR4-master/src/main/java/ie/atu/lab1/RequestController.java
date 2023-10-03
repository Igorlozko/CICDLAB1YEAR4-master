/*package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/greet/{DUKE}")
    public String mapPathVariableByName(
            @PathVariable(name = "DUKE") String name) {
        return "My name is:  " + name;
    }
    @GetMapping("/details/{DUKE}")
    public String mapPathVariableByName(
            @RequestParam(name = "DUKE") String name) {
        return "My name is:  " + name;
    }

}
*/