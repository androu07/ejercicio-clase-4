package com.example.laboratorio3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//COMPLETAR
@RequestMapping(value = "/reportes", method = RequestMethod.GET)
public class SearchController {

    @GetMapping(value = {"","/"})
    public String indice(){
        return "Search/indice";
    }

    @GetMapping(value = "/reportePaisCiudad")
    public String reportePais() {
        return "Search/repPaisCiudad";
    }


//COMPLETAR


}
