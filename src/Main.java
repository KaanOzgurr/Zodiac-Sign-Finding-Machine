//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Your birth month:");
        int month = scan.nextInt();


        String horoscope1 = "Capricorn";
        String horoscope2 = "Aquarius";
        String horoscope3 = "Pisces";
        String horoscope4 = "Aries";
        String horoscope5 = "Taurus";
        String horoscope6 = "Gemini";
        String horoscope7 = "Cancer";
        String horoscope8 = "Leo";
        String horoscope9 = "Virgo";
        String horoscope10 = "Libra";
        String horoscope11 = "Scorpion";
        String horoscope12 = "Sagittarius";






        if ( month >=1 && month<13) {
            System.out.println("Your birth day:");
            int day = scan.nextInt();

            if(month == 1) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope1);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope2);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }

            }
            if(month == 2) {
                if( day >=1 && day <= 28) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope2);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope3);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 3) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope3);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope4);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 4) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope4);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope5);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 5) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope5);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope6);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 6) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope6);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope7);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 7) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope7);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope8);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 8) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope8);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope9);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 9) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope9);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope10);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 10) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope10);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope11);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 11) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope11);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope12);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }
            if(month == 12) {
                if( day >=1 && day <= 31) {
                    if(day<=21) {
                        System.out.println("Your horoscope is:" +horoscope12);
                    } else {
                        System.out.println("Your horoscope is:" +horoscope1);
                    }
                } else{
                    System.out.println("Wrong date , please try again!");
                }
            }



        } else {
            System.out.println("Wrong date , please try again!");
        }




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}