package com.example;


import java.util.*;


public class MyClass {
    public static void main(String[] args) {
       String sequence1= "The Monkey Threw The Banana at Batman";
        String sequence2="The Rabbit Lost all its Feet";
        String sequence3="Humpty Dumpty Sat on a Wall";
        String initiateCountDown="We've Found the Holy Grail";
        boolean selfDestructed= false;
        int i=3;

while(selfDestructed==false) {
    System.out.print("Would You Like to Initiate Self Destruction? If so say Yes\n");

    Scanner scanner = new Scanner(System.in);
    String response0 = scanner.nextLine();
    if (response0.equals("Yes") || response0.equals("yes")) {
        System.out.print("Self Destrustion Protocol, Please state first Sequence\n");
            Scanner scanner2 = new Scanner(System.in);
            String response1 = scanner.nextLine();

        if(response1.equals(sequence1)){
                   System.out.print("Sequence One Correct, Please state second Sequence\n");
            Scanner scanner3 = new Scanner(System.in);
            String response2 = scanner.nextLine();
                    if(response2.equals(sequence2)){
                        System.out.print("Sequence Two Correct, Please state third Sequence\n");
                        Scanner scanner4 = new Scanner(System.in);
                        String response3 = scanner.nextLine();
                        if(response3.equals(sequence3)){
                            System.out.print("Sequence Three Correct, Please state Initiation Command\n");
                            Scanner scanner5 = new Scanner(System.in);
                            String response4 = scanner.nextLine();
                            if(response4.equals(initiateCountDown)){
                                while(i>0){
                                    System.out.print("Self Destructing in "+i+"\n");
                                    i=i-1;

                                        if(i==1){
                                            selfDestructed=true;
                                        }
                                    }
                                }else {
                                System.out.print("Self Destruction will Not be Initialized\n\n");
                            }
                            }else {
                            System.out.print("Self Destruction will Not be Initialized\n\n");
                        }
                        }else {
                        System.out.print("Self Destruction will Not be Initialized\n\n");
                    }
                    }else {
            System.out.print("Self Destruction will Not be Initialized\n\n");
        }

               }else {
        System.out.print("Self Destruction will Not be Initialized\n\n");

    }
    }
    }
    }


