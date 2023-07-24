package com.jsp.springbootjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springbootjdbc.dao.employee;
import com.jsp.springbootjdbc.dao.employeedao;
import com.jsp.springbootjdbc.dao.employeedaoImp;


@SpringBootApplication
public class SpringbootjbcprogrammsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootjbcprogrammsApplication.class, args);
		
		
		employeedao dao = context.getBean(employeedaoImp.class);
		
	

		// Create an employee object and set its attributes
        employee emp1 = new employee();
        emp1.setEID(20);;
        emp1.setENAME("chemma");
        emp1.setESALARY(15820);
        emp1.setEDEPTNO(60);
        emp1.setEMAIL("chemma@gmail.com");
        emp1.setPASSWORD("6716775");
        emp1.setEMOBILENO(6371993);
        
        int status = dao.addemployee(emp1);
        if (status > 0) {
            System.out.println("Employee record inserted successfully!");
        } else {
            System.out.println("Failed to insert employee record.");
        }
	}

}
