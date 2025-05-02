package in.ashokit.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptId;

	private String deptName;

	@OneToMany(mappedBy=  "department",cascade = CascadeType.ALL)
	private List<Employee> emp;

	public Integer getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

}
