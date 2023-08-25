package Calculadora.Potencia.Controller.C_Calculadora;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Potencia {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @PostMapping("/")
    public String calculaPotencia(@RequestParam("numero") int numero,
                                  Model model) {

        int resultado = numero * numero;

        model.addAttribute("resultado", resultado);
        model.addAttribute("numero", numero);

        return "home";
    }
}