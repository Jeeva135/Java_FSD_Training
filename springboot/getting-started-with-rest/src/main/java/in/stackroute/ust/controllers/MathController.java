package in.stackroute.ust.controllers;

import in.stackroute.ust.domain.Arithmetic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add/{num1}/{num2}")
    public Arithmetic  add(@PathVariable int num1,@PathVariable int num2){
        return new Arithmetic(num1,num2,(num1+num2),"+");
    }
    @GetMapping("/sub/{num1}/{num2}")
    public Arithmetic sub(@PathVariable int num1,@PathVariable int num2){
        return new Arithmetic(num1,num2,(num1+num2),"-");
    }
    @GetMapping("/mul/{num1}/{num2}")
    public Arithmetic mul(@PathVariable int num1,@PathVariable int num2){
        return new Arithmetic(num1,num2,(num1+num2),"*");
    }
    @GetMapping("/div/{num1}/{num2}")
    public Arithmetic div(@PathVariable int num1,@PathVariable int num2){
        return new Arithmetic(num1,num2,(num1+num2),"/");
    }

}
