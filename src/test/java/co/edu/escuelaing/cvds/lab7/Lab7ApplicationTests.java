package co.edu.escuelaing.cvds.lab7;

import static org.mockito.ArgumentMatchers.any;
import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.repository.EmployeeRepository;
import co.edu.escuelaing.cvds.lab7.service.EmployeeService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class Lab7ApplicationTests {
	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeService employeeService;

	private Employee employee;
	@BeforeEach
	public void setup(){
		employee = new Employee("1","cesar","amaya","president",1000000000,"apple","masculino");
	}
	// JUnit test for getEmployeeById method
	@DisplayName("JUnit test for getEmployeeById method")
	@Test
	public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject(){
		// given
		given(employeeRepository.findById("1")).willReturn(Optional.of(employee));
		// when
		Employee savedEmployee = employeeService.getEmployee(employee.getId()).get();
		// then
		assertThat(savedEmployee).isNotNull();

	}
	@DisplayName("JUnit test for getEmptyEmployeeList method")
	@Test
	public void givenNoEmployees_whenGetEmployeeList_thenReturnEmptyList() {
		// given
		given(employeeRepository.findAll()).willReturn(Collections.emptyList());

		// when
		List<Employee> employees = employeeService.getAllEmployees();

		// then
		assertThat(employees).isEmpty();
	}
	@DisplayName("JUnit test for createEmployee method when no employees are registered")
	@Test
	public void givenNoEmployees_whenCreateEmployee_thenCreationSuccessful() {
		// given

		given(employeeRepository.save(any(Employee.class))).willReturn(new Employee("1","cesar","amaya","president",1000000000,"apple","masculino"));

		// when
		Employee newEmployee = employeeService.addEmployee(new Employee("1","cesar","amaya","president",1000000000,"apple","masculino"));

		// then
		assertThat(newEmployee).isNotNull();
		assertThat(newEmployee.getId()).isEqualTo("2");
		assertThat(newEmployee.getFirstName()).isEqualTo("sebas");
		assertThat(newEmployee.getLastName()).isEqualTo("zamora");
		assertThat(newEmployee.getRole()).isEqualTo("Developer");
		assertThat(newEmployee.getSalary()).isEqualTo(50000);
	}




}
