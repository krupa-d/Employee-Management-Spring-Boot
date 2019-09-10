package com.sakha.Management.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sakha.Management.model.Employee;
import com.sakha.Management.service.EmployeeService;

@Controller
public class EmployeeController {
	
		@Autowired
		EmployeeService service;
		@PostMapping("/add")
		public String registerEmployee(@ModelAttribute Employee emp,Model m)
		{
			Employee saveEmp=service.save(emp);
			m.addAttribute("emp",emp);
			return "Success";
		}
		@GetMapping("/delete")
		public String deleteEmployee(@RequestParam("id") int id)
		{
			service.deleteEmp(id);
			return "Success";
		}
		@GetMapping("/getDetails")
		public String getDetails(@RequestParam("empId") int id,Model m)
		{
			Employee getEmp=service.getEmployee(id);
			m.addAttribute("emp",getEmp);
			return "getEmp";
		}
		@GetMapping("/getAllEmp")
		public String getAll(Model m)
		{
			List<Employee> getEmp=service.getAllEmployees();
			m.addAttribute("emp",getEmp);
			return "showDetails";
		}
		@PostMapping("/update")
		public String updateEmployee(@RequestParam("salary") float salary,@RequestParam("empId") int id,Model m)
		{
			service.updateEmp(salary,id);
			return "Success";
		}
}
