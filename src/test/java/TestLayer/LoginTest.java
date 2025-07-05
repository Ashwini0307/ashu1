package TestLayer;

import PageLayer.HomePage;
import PageLayer.LoginPage;

public class LoginTest extends LoginPage{

	
	public static void main(String[] args) {
		LoginPage log=new LoginPage();
	     log.loginpage();
		
	     HomePage ho=new HomePage();
	     ho.home();
	     

	}

}
