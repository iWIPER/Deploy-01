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
    @Value("${myCustomVarTree.devName}")
    String myVariable;

    // Return a property "devName"
    @GetMapping("/dev")
    public String devName(){
        String var = environment.getProperty("myCustomVarTree.devName");
        return var;
    }

    @GetMapping("/dev2")
    public String devName2(){
        return myVariable;
    }

}
