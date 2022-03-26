package com.company;

  public class  WelcomeScreen {
    public void PrintWelcomeScreen(String AppName,String DeveloperDetails){
        System.out.println("\n\n**********  WELCOME  **********\n************  TO  ************\n**********  "+AppName+"  **********");
        System.out.println("\n\n********  Developed By - "+ DeveloperDetails+"  ******** ");
        System.out.println("\n\n\n   Choose one of the options below :-\n 1.Retrieve all current files in ascending order.\n 2.Manage or search any file.\n 3.Close the application.");
    }
}


