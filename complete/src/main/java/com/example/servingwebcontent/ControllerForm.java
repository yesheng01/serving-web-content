package com.example.servingwebcontent;

/**
 * com.example.servingwebcontent
 * Nombre_project: serving-web-content
 * ControllerForm
 * Created by: sheng
 * Date : 16/04/2021
 * Description:
 **/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForm {
    @PostMapping("/formulario")
    public String form(String personName, String contrasenya, Model model) {
        model.addAttribute("name", personName);
        model.addAttribute("contrasenya", contrasenya);
        return "resultadoPeticiones";
    }

    @GetMapping("/formulario")
    public String postForm(String personName, String contrasenya, Model model) {
        return "formulario";
    }
}