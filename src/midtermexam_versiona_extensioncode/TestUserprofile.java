/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author Carey Cunningham
 * date: 2023-02-21
 * This class is to utilize the UserProfile class to create a user.
 */
public class TestUserprofile {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        String userName = "";
        String userGenre = "";
        
        // new scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // ask for a name
        System.out.print("Please enter your name: ");
        userName = sc.nextLine();
        
        System.out.println("Please enter your favourite genre from the list below:");
        for (int i=0; i<UserProfile.genres.length; i++){
            System.out.print(UserProfile.genres[i] + " ");
        }
        userGenre = sc.nextLine();

        UserProfile user = new UserProfile(userName, userGenre);
        
        System.out.printf("Your user has been set up with userName %s and favourite genre %s\n", user.getUserID(), user.getGenre());
        
        
    }
}
