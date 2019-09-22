package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserBean;

@Service
public class LoginClservice {
	
	@Autowired
	private UserDao daouser;//与dao层进行交互
	
	
	public boolean Find(String name,String password){
		boolean b=true;
		
		List <UserBean> All= daouser.findAll();//调用dao层方法，读取数据库数据
		System.out.println("================"+All);
		for(int i=0;i<=All.size();i++){//将数据库中的数据全部拿出，一个一个比较，好在数据不多
			
			
			UserBean one=All.get(i);
			if(name.equals(one.getUsername())&&password.equals(one.getPassword())){//两种渠道的得到的数据进行比较
				
				b=true;
				break;
			}else{
				
				b= false;
				break;
			}
			
		}
		
		return b;	
	}
}
