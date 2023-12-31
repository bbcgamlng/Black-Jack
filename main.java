import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean game = true;
        int totalPoints = 0;
        System.out.println("\n\n\nWelcome to BlackJack!!!\n----------------------------\n");
        while(game){

            int num1 = (int) (Math.random() * 13);
            String playerCard1;

            if (num1 == 10) {
                playerCard1 = "10";
            } else if (num1 == 11) {
                playerCard1 = "10";
            } else if (num1 == 12) {
                playerCard1 = "10";
            } else if (num1 == 13) {
                playerCard1 = "11";
            } else {
                playerCard1 = String.valueOf(num1);
            }

            int num2 = (int) (Math.random() * 13);
            String playerCard2;

            if (num2 == 10) {
                playerCard2 = "10";
            } else if (num2 == 11) {
                playerCard2 = "10";
            } else if (num2 == 12) {
                playerCard2 = "10";
            } else if (num2 == 13) {
                playerCard2 = "11";
            } else {
                playerCard2 = String.valueOf(num2);
            }

            System.out.println("Here are your cards! Do not display them to anyone!\n| Card 1 = " + playerCard1 + "   |   Card 2 = " + playerCard2 + " |\n");
            int userTotal = Integer.parseInt(playerCard1)+Integer.parseInt(playerCard2);
            System.out.println("Your Combined total is "+userTotal+"\n-------------------------------------------------");
            Scanner input = new Scanner(System.in);
            boolean x = true;
            while(x){
                System.out.print("\nDo you want to Stand(1) or Hit(2): ");
                int userInput = input.nextInt();
                if(userInput==1){
                    System.out.println("Standing!");
                    x = false;
                    int OppsHand = (int) (Math.random() * 22);
                    System.out.println("Your opponent hand is "+OppsHand+" |  Your hand is a "+userTotal);
                    if(userTotal>OppsHand){
                        System.out.println("You Win\n+500 points");
                        totalPoints = totalPoints +500;
                    }
                    else{
                        System.out.println("You loss\n-500 points");
                        totalPoints = totalPoints -500;
                    }

                } else if (userInput==2) {
                    System.out.println("---------------------------------\nHitting!");
                    x = false;
                    int num3 = (int) (Math.random() * 13);

                    String playerCard3;

                    if (num3 == 10) {
                        playerCard3 = "10";
                    } else if (num3 == 11) {
                        playerCard3 = "10";
                    } else if (num3 == 12) {
                        playerCard3 = "10";
                    } else if (num3 == 13) {
                        playerCard3 = "11";
                    } else {
                        playerCard3 = String.valueOf(num1);
                    }

                    int num4 = (int) (Math.random() * 13);
                    String playerCard4;

                    if (num4 == 10) {
                        playerCard4 = "10";
                    } else if (num4 == 11) {
                        playerCard4 = "10";
                    } else if (num4 == 12) {
                        playerCard4 = "10";
                    } else if (num4 == 13) {
                        playerCard4 = "11";
                    } else {
                        playerCard4 = String.valueOf(num4);
                    }
                    int secondUserTotal = Integer.parseInt(playerCard3)+Integer.parseInt(playerCard4);
                    System.out.println("\nHere are your second pair of cards! \n| Card 1 = " + playerCard3 + "   |   Card 2 = " + playerCard4 + " |\n");
                    int fullUserTotal = userTotal+secondUserTotal;
                    if(fullUserTotal>21){
                        System.out.println("Your new total is "+fullUserTotal+"\n");
                        System.out.println("You bust! Sorry you loss\n-500 points");
                        totalPoints = totalPoints -500;
                    }else{
                        System.out.println("Your new total is "+fullUserTotal);
                        int OppsHand = (int) (Math.random() * 22);
                        System.out.println("Your opponent hand is "+OppsHand+" |  Your hand is a "+fullUserTotal);
                        if(fullUserTotal>OppsHand){
                            System.out.println("You Win\n+500 points");
                            totalPoints = totalPoints +500;
                        }
                        else{
                            System.out.println("You loss\n-500 points");
                            totalPoints = totalPoints -500;
                        }
                    }

                }else{
                    System.out.println("You did not pick one or two");
                }
            }
            System.out.println("\n\nDo you want to quit? (y/n)");
            String quit = input.next();
            if(quit.toUpperCase().equals("Y")){
                System.out.println("You finished with "+totalPoints+" points");
                game = false;
            }
        }



    }
}
