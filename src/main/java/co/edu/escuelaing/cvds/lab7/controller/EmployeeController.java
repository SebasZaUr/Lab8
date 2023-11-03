package co.edu.escuelaing.cvds.lab7.controller;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public String listEmployers(Model m){
        List<Employee> list=employeeService.getAllEmployees();
        m.addAttribute("list",list);
        return "employee";
    }
    @GetMapping("/addEmployee")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }
    @PostMapping("/save")
    public String saveEmploye(@ModelAttribute("employee") Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/employee";
    }

    @GetMapping("/update/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") String id, Model model) {

        Optional<Employee> emp = employeeService.getEmployee(id);
        model.addAttribute("employee", emp);
        return "updateEmployee";
    }
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/employee";
    }

     @RequestMapping("/delete/{id}")
     public String deleteEmployee(@PathVariable String id){
         employeeService.deleteEmployee(id);
         return "redirect:/employee";
     }

    @GetMapping("/seleccionar")
    public String seleccionarGrafico(Model model) {
        return "seleccionar";
    }
    @GetMapping("/histograma")
    public String histograma(Model model) {
        List<Float> salarios = employeeService.getAllSalaries();
        model.addAttribute("salaries", salarios );
        return "histograma";
    }
    @GetMapping("/empresa")
    public String employeeByCompany(Model model) {
        int microsoft = employeeService.getEmployeesByCompany("Microsoft").size();
        int google = employeeService.getEmployeesByCompany("Google").size();
        int aplee = employeeService.getEmployeesByCompany("Apple").size();
        int bavaria = employeeService.getEmployeesByCompany("Bavaria").size();
        model.addAttribute("Microsoft", microsoft );
        model.addAttribute("Google", google );
        model.addAttribute("Apple", aplee );
        model.addAttribute("Bavaria", bavaria );
        return "empresa";
    }

    @GetMapping("/salarioPromedio")
    public String salarioPromedioPorEmpresa(Model model) {
        double salarioPromedioMicrosoft = employeeService.calcularSalarioPromedioPorEmpresa("Microsoft");
        double salarioPromedioGoogle = employeeService.calcularSalarioPromedioPorEmpresa("Google");
        double salarioPromedioApple = employeeService.calcularSalarioPromedioPorEmpresa("Apple");
        double salarioPromedioBavaria = employeeService.calcularSalarioPromedioPorEmpresa("Bavaria");

        model.addAttribute("salarioPromedioMicrosoft", salarioPromedioMicrosoft);
        model.addAttribute("salarioPromedioGoogle", salarioPromedioGoogle);
        model.addAttribute("salarioPromedioApple", salarioPromedioApple);
        model.addAttribute("salarioPromedioBavaria", salarioPromedioBavaria);

        return "salarioPromedio";
    }
    @GetMapping("/gastoSalarios")
    public String gastoSalariosPorEmpresa(Model model) {
        double gastoSalarioMicrosoft = employeeService.calcularGastosSalariosPorEmpresa("Microsoft");
        double gastoSalarioGoogle = employeeService.calcularGastosSalariosPorEmpresa("Google");
        double gastoSalarioApple = employeeService.calcularGastosSalariosPorEmpresa("Apple");
        double gastoSalarioBavaria = employeeService.calcularGastosSalariosPorEmpresa("Bavaria");

        model.addAttribute("salarioPromedioMicrosoft", gastoSalarioMicrosoft);
        model.addAttribute("salarioPromedioGoogle", gastoSalarioGoogle);
        model.addAttribute("salarioPromedioApple", gastoSalarioApple);
        model.addAttribute("salarioPromedioBavaria", gastoSalarioBavaria);

        return "gastoSalarios";
    }
    @GetMapping("/personasPorGenero")
    public String personasPorGenero(Model model) {
        int masculinos = employeeService.getEmployeesByGender("Masculino").size();
        int femeninos = employeeService.getEmployeesByGender("Femenino").size();
        model.addAttribute("masculinos", masculinos);
        model.addAttribute("femeninos", femeninos);
        return "personasPorGenero";
    }

}