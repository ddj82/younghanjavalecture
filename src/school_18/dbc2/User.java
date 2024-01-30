package school_18.dbc2;

public class User {
	private String url = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
	private String user = "TEST";
	private String pwd = "1111";
	private String dr = "oracle.jdbc.driver.OracleDriver";
	
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return user;
	}
	public String getPwd() {
		return pwd;
	}
	public String getDr() {
		return dr;
	}

}
