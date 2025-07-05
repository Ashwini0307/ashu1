package TestLayer;

import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.logoutPage;

public class LoginTest extends LoginPage{

	
	public static void main(String[] args) {
		LoginPage log=new LoginPage();
	     log.loginpage();
		
	     HomePage ho=new HomePage();
	     ho.home();
	     
	     logoutPage log1=new logoutPage();
	     log1.logout();
	     
	     

	}

}
