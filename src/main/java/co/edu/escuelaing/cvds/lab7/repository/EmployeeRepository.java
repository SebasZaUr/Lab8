package co.edu.escuelaing.cvds.lab7.repository;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    @Query("SELECT e.salary FROM Employee e")
    List<Float> getAllSalaries();
    List<Employee> findByCompany(String company);

    List<Employee> findByGenero(String gender);
}

