package co.in.inputoutput;

import java.io.Serializable;

public class employee implements Serializable {

	private String id;
	private String name;
	private String username;
	private transient String pwd;
	
	public employee () {}
	
	public employee(String id,String name,String username,String pw) {
		
		this.id=id;
		this.name=name;
		this.username=username;
		pwd=pw;
	}
	

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}

}
