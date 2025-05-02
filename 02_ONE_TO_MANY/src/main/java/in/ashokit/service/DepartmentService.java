package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Department;
import in.ashokit.entities.Employee;
import in.ashokit.repo.DepartmentRepo;
import in.ashokit.repo.EmployeeRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo deptRepo;
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public void saveEmpInfoWithDept()
	{
		Department dept = new Department();
		dept.setDeptName("Development");
		
		Employee e1 = new Employee();
		e1.setEmpName("Eshwar");
		
		Employee e2 = new Employee();
		e2.setEmpName("Umesh");
		
		
		// association Mapping
		dept.setEmp(Arrays.asList(e1, e2));
		e1.setDepartment(dept);
		e2.setDepartment(dept);
		
		
		//save 
		deptRepo.save(dept);
	}
	
}
