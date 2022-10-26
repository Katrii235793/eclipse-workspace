package oct26;

public class User {
	private int id;
	private String username;
	private String password;
	
	public User() {
		this.id = 1;
        this.username = "Louis";
        this.password = "rxfsuzA2345";
	}
	
	public User(int id,String username,String password) {
		this.id=id;
		this.username=username;
		this.password=password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
