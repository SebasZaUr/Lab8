package co.edu.escuelaing.cvds.lab7;

import co.edu.escuelaing.cvds.lab7.model.Configuration;
import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.service.ConfigurationService;
import co.edu.escuelaing.cvds.lab7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab7Application {
	@Autowired
	ConfigurationService configurationService;
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (args) -> {

			employeeService.addEmployee(new Employee("1", "Ana", "Gómez", "Desarrollador", 50000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("2", "Luisa", "Martínez", "Diseñador", 52000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("3", "María", "Pérez", "Analista", 55000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("4", "Sofía", "Rodríguez", "Gerente", 48000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("5", "Laura", "Fernández", "Desarrollador", 51000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("6", "Elena", "Sánchez", "Diseñador", 53000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("7", "Valentina", "Torres", "Analista", 49000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("8", "Carolina", "López", "Gerente", 56000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("9", "Diana", "Ramírez", "Desarrollador", 52000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("10", "Alicia", "Hernández", "Diseñador", 54000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("11", "Gabriela", "Gutiérrez", "Analista", 50000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("12", "Paula", "Molina", "Gerente", 57000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("13", "Camila", "Castro", "Desarrollador", 53000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("14", "Antonia", "Ortega", "Diseñador", 55000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("15", "Isabel", "Chávez", "Analista", 51000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("16", "Mariana", "Reyes", "Gerente", 58000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("17", "Lucía", "Jiménez", "Desarrollador", 54000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("18", "Clara", "Vargas", "Diseñador", 56000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("19", "Beatriz", "Silva", "Analista", 52000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("20", "Emma", "Rojas", "Gerente", 59000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("21", "Pilar", "Navarro", "Desarrollador", 55000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("22", "Alba", "Castillo", "Diseñador", 57000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("23", "Natalia", "Góngora", "Analista", 53000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("24", "Valeria", "Pinto", "Gerente", 60000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("25", "Alejandra", "Quintero", "Desarrollador", 56000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("26", "Melissa", "Montenegro", "Diseñador", 58000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("27", "Fernanda", "Cuellar", "Analista", 54000, "Apple", "Femenino"));
			employeeService.addEmployee(new Employee("28", "Romina", "Bermúdez", "Gerente", 61000, "Bavaria", "Femenino"));
			employeeService.addEmployee(new Employee("29", "Yuliana", "Campos", "Desarrollador", 57000, "Microsoft", "Femenino"));
			employeeService.addEmployee(new Employee("30", "Mónica", "Herrera", "Diseñador", 59000, "Google", "Femenino"));
			employeeService.addEmployee(new Employee("31", "Carlos", "Gómez", "Desarrollador", 50000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("32", "Luis", "Martínez", "Diseñador", 52000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("33", "Javier", "Pérez", "Analista", 55000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("34", "Alejandro", "Rodríguez", "Gerente", 48000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("35", "Andrés", "Fernández", "Desarrollador", 51000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("36", "Eduardo", "Sánchez", "Diseñador", 53000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("37", "Felipe", "Torres", "Analista", 49000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("38", "Francisco", "López", "Gerente", 56000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("39", "Miguel", "Ramírez", "Desarrollador", 52000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("40", "Diego", "Hernández", "Diseñador", 54000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("41", "Gabriel", "Gutiérrez", "Analista", 50000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("42", "Pablo", "Molina", "Gerente", 57000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("43", "Raúl", "Castro", "Desarrollador", 53000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("44", "Héctor", "Ortega", "Diseñador", 55000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("45", "Jorge", "Chávez", "Analista", 51000, "Microsoft", "Masculino"));
			employeeService.addEmployee(new Employee("46", "Fernando", "Gómez", "Desarrollador", 50000, "Apple", "Masculino"));
			employeeService.addEmployee(new Employee("47", "Carlos", "Martínez", "Diseñador", 52000, "Apple", "Masculino"));
			employeeService.addEmployee(new Employee("48", "Javier", "Pérez", "Analista", 55000, "Apple", "Masculino"));
			employeeService.addEmployee(new Employee("49", "Alejandro", "Rodríguez", "Gerente", 48000, "Apple", "Masculino"));
			employeeService.addEmployee(new Employee("50", "Andrés", "Fernández", "Desarrollador", 51000, "Apple", "Masculino"));


		};
	}
}
