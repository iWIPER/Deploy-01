package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    // Get "devName" variable from YML
    @Value("${myVariable.devName}")
    String myVariable;

    // Return a property "devName"
    @GetMapping("/developer")
    public String developer(){
        String var = environment.getProperty("myVariable.devName");
        return var;
    }

    @GetMapping("/otherDeveloper")
    public String developer2(){
        return myVariable;
    }

}