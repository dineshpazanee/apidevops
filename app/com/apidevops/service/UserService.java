package com.apidevops.service;

import com.apidevops.connector.CassandraConnector;
import com.apidevops.dao.KeyspaceRepository;
import com.apidevops.dao.UserRepositoryJava;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.utils.UUIDs;

import models.User;

public class UserService {
	
	
	public String CreateUserDetails(User user) throws Exception{
		
			CassandraConnector connector = new CassandraConnector();
	        connector.connect("127.0.0.1", null);
	        Session session = connector.getSession();

	        KeyspaceRepository sr = new KeyspaceRepository(session);
	        sr.createKeyspace("apidevops", "SimpleStrategy", 1);
	        sr.useKeyspace("apidevops");
	        
	        UserRepositoryJava ur = new UserRepositoryJava(session);
	        ur.createTable();
	        
	        User book = new User(UUIDs.timeBased(), "Muruga", "dinesh", "localhost", "");
	        ur.createUser(book);
	        
	        return "";
	}

}
