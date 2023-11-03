package co.edu.escuelaing.cvds.lab7.service;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(String employee_id) {

        return employeeRepository.findById(employee_id);
    }
    public List<Float> getAllSalaries() {
        return employeeRepository.getAllSalaries();
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        if (employeeRepository.findById(employee.getId()) == null) {
            return employeeRepository.save(employee);
        }

        return employeeRepository.save(employee);
    }
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> getEmployeesByCompany(String company) {
        return employeeRepository.findByCompany(company);
    }

    public double calcularSalarioPromedioPorEmpresa(String company) {
        List<Employee> employees = getEmployeesByCompany(company);
        if (employees.isEmpty()) {
            return 0;
        }
        double totalSalarios = 0;
        for (Employee employee : employees) {
            totalSalarios += employee.getSalary();
        }
        double salarioPromedio = totalSalarios / employees.size();
        // Redondear el salario promedio a 2 cifras decimales
        salarioPromedio = Math.round(salarioPromedio * 100.0) / 100.0;
        return salarioPromedio;
    }
    public double calcularGastosSalariosPorEmpresa(String company) {
        List<Employee> employees = getEmployeesByCompany(company);
        double gastosSalarios = 0;
        for (Employee employee : employees) {
            gastosSalarios += employee.getSalary();
        }
        // Redondear los gastos en salarios a 2 cifras decimales
        gastosSalarios = Math.round(gastosSalarios * 100.0) / 100.0;
        return gastosSalarios;
    }
    public List<Employee> getEmployeesByGender(String gender) {
        return employeeRepository.findByGenero(gender);
    }



}
