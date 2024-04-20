package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    final
    EmployeesRepository employeesRepository;
    public EmployeeController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @GetMapping("/empleados")
    public String listaEmployee(Model model){
        List<Employees> lista = EmployeesRepository.findAll();
        model.addAttribute("listaEmpleados",lista);
        return "employee/lista";
    }

    @GetMapping("/empleados/new")
    public String nuevoEmployeeForm( ) {
        return "employee/newFrm";
    }

    @PostMapping("/guardar")
    public String guardarEmployee(Employees employees) {
        employeesRepository.save(employees);
        return "redirect:/employee/lista";
    }

    @GetMapping("/editar")
    public String editarEmployee(Model model) {
        @RequestParam("id") int id; {
            Optional<Employees> optionalEmployees =
        }
    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

}
