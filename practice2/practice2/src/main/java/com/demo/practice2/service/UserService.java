package com.demo.practice2.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.practice2.Bean.BeanClass;

@Service
public class UserService {
	@Autowired
	BeanClass beanClass;
	static List<BeanClass> list = new ArrayList<>();

	static {
		list.add(new BeanClass(1, "ram","2020-20-5"));
//		list.add(new BeanClass(2,"sam",new Date()));
//		list.add(new BeanClass(3,"Don",new Date()));
//	
	}

	public BeanClass addUser(BeanClass bean) {

		list.add(bean);

		return bean;
	}

	public String updateUser(BeanClass bean) {

		for (BeanClass empList : list) {

			if (empList.getId() == bean.getId()) {

				empList.setName(bean.getName());
				// empList.setDob(bean.getDob());
				
			}
			else {
				return "User id Not Found";
			}
		}
		return  "Update Sucessfully...";
	}

	public List<BeanClass> viewUser() {
		return list;
	}

	public String deleteEmpUser(int id) {

		for (BeanClass empList1 : list) {

			if (id == empList1.getId()) {

				list.remove(id);
			}
			else {
				return "Id NOT Found";
			}
		}

		return "Id remove Sucessfully";
	}

}
