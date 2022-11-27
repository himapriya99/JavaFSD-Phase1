package com.lockedme.main;
import com.lockedme.home.*;
import com.lockedme.navigation1.*;
/**
 * @author Himapriya_Tammineedi
 * This class contains the main class to
 * display the output
 */
public class MainClassRunner {
	public static void main(String[] args) {
		    //Main Folder path
		    String path = "C:\\Users\\Himapriya_Tammineedi\\eclipse-workspace\\Java_FSDPhase1\\Locked";
		  // String path = ".\\Locked";
		    //welcome screen
            WelcomeScreen w = new WelcomeScreen();
            w.home();
            //initial navigation menu
            InitialNavigationScreen i = new InitialNavigationScreen();
            i.initialMenu(path);
	}
}
