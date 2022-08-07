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
            userRegistration.ValidPhoneNumber();
            userRegistration.validPassword();
        }
        public void validFirstName()  void UserRegistrationException{
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
            //Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
            Pattern pattern = Pattern.compile("^[a-z]*.[a-z 0-9]+@[a-z 0-9]+.[a-z]{2,3}(.[a-z]{2,3})*$");
            System.out.println("Enter user email ");
            scanner.nextLine();
            String email = scanner.nextLine();

            Matcher match = pattern.matcher(email);
            if (match.matches())
                System.out.println("Email name is Valid");
            else
                System.out.println("Email name is InValid");
        }
        public void ValidPhoneNumber(){
            Scanner scanner = new Scanner(System.in);
            Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
            System.out.println("Enter user Phone number");

            String phoneNumber = scanner.nextLine();

            Matcher match = pattern.matcher(phoneNumber);
            if (match.matches())
                System.out.println("Phone number is Valid");
            else
                System.out.println("Phone number is InValid");

        }
        public void validPassword(){
            Scanner scanner = new Scanner(System.in);
           // Pattern pattern = Pattern.compile("^[a-z]{8,}$");
            //Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]).{8,}$");
          //  Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9a-zA-Z]).{8,}$");
            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");
            System.out.println("Enter user Password");

            String password = scanner.nextLine();

            Matcher match = pattern.matcher(password);
            if (match.matches())
                System.out.println("password is Valid");
            else
                System.out.println("password is InValid");
        }

    }

