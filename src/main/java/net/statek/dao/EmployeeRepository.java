package net.statek.dao;


import net.statek.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cor on 11/29/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}