package ru.sf.Testtask.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sf.Testtask.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Override
    <S extends Employee> S save(S entity);
}
