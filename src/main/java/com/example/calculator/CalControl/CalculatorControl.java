package com.example.calculator.CalControl;

import com.example.calculator.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class CalculatorControl {

    @GetMapping("/index")
    public String viewForm(Model model){
        model.addAttribute("Calculator",new Calculator());
        return "index";
    }

    @PostMapping("/calculate")
    public String addForm(Calculator calculator, Model model){
        model.addAttribute("Calculator",calculator);
        return "result";
    }

}
