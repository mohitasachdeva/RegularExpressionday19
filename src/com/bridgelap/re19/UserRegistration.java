package com.bridgelap.re19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserRegistration {


        public static void main(String[] args) {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validFirstName();
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

    }

