package com.lockedme.home;
import java.util.concurrent.TimeUnit;
/**
 * @author Himapriya_Tammineedi
 *
 *This Class displays the welcome screen of the application
 */
public class WelcomeScreen {
	
	public void home() {
		System.out.println("***********************************************************************************************************");
		System.out.println("**************************************Welcome to LockedMe.com**********************************************");
		System.out.println("***********************************************************************************************************");
		
		try {
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e){
			
		}
		System.out.println("*****************LockedMe helps you to manage your Files/Folders in the Lockedme Folder*********************");
		System.out.println("                                                                          *Developed By: Himapriya Tammineedi");
		try {
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e){
			
		}
		System.out.println();
		System.out.println();
		
	}

}
