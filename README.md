# JavaFSD-Phase1
##File Management Project
###Code Functionality:-
•	Code to display the welcome screen. It should display:
•	Application name and the developer details 
•	The details of the user interface such as options displaying the user interaction information 
•	Features to accept the user input to select one of the options listed 
•	The first option should return the current file names in ascending order. The root directory can be either empty or contain few files or folders in it
•	 The second option should return the details of the user interface such as options displaying the following:
     •   	Add a file to the existing directory list
             •You can ignore the case sensitivity of the file names 
     •	Delete a user specified file from the existing directory list
             •	You can add the case sensitivity on the file name in order to ensure that the right file is deleted from the directory list
             •	Return a message if FNF (File not found)
     •	Search a user specified file from the main directory
             •	You can add the case sensitivity on the file name to retrieve the correct file
             •	Display the result upon successful operation
             •	Display the result upon unsuccessful operation
      •	Option to navigate back to the main context
      •	There should be a third option to close the application
###Files Description:-
-MainClassRunner.java: Files Containing main class of the project
-WelcomeScreen.java : Welcome message
-InitialNavigationScreen.java: Initial menu options
-SecondNavigationScreen.java: Detailed menu option
-DisplayFiles.java:  To display files in the folder
-AddFile.java: To add a file to the folder
-DeleteFile.java: To delete a file from the folder
-SearchFile.java: To find the location of given filename
