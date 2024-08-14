package com.example.Practice.basicsPractice.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Practice.basicsPractice.Bean.Bean;

@Repository
public class EmpList {

	public List<Bean> getEmpList() {

		List<Bean> list = new ArrayList<Bean>();
		Bean b1 = new Bean(1, "mani");
		Bean b2 = new Bean(2, "sam");
		Bean b3 = new Bean(3, "ram");

		list.add(b1);
		list.add(b2);
		list.add(b3);

		return list;
	}

	public List<Bean> getEmp() {
		return Arrays.asList(new Bean(1, "don"), new Bean(2, "son"), new Bean(3, "little"));
	}

}
