package models;

import java.util.UUID;

public class User {

    private UUID id;

    private String name;

    private String password;

    private String host;

    private String request;

    User() {
    }

    public User(UUID id, String name, String password, String host, String request) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.host = host;
        this.request = request;
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
    
    
    
    
    
}

