package com.bridgelap.re19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserRegistration {


        public static void main(String[] args) {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validFirstName();
            userRegistration.validSecondName();
            userRegistration.validEmailId();
        }
        public void validFirstName(){
            Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter user first name");
            String fName = scanner.next();

            Matcher match = pattern.matcher(fName);
            if (match.matches())
                System.out.println("First name is Valid");
            else
                System.out.println("First name is InValid");
        }
        public void validSecondName(){
            Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter user second name");
            String fName = scanner.next();

            Matcher match = pattern.matcher(fName);
            if (match.matches())
                System.out.println("Second name is Valid");
            else
                System.out.println("Second name is InValid");
        }
        public void validEmailId(){
            Scanner scanner = new Scanner(System.in);
            Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
            System.out.println("Enter user email ");
            scanner.nextLine();
            String email = scanner.nextLine();

            Matcher match = pattern.matcher(email);
            if (match.matches())
                System.out.println("Email name is Valid");
            else
                System.out.println("Email name is InValid");
        }


    }

