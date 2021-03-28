package edu.umsl;
import java.util.Scanner;
import java.util.InputMismatchException;

public class KnightVsHydra {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int hydraHeads = 1, hydraTails = 1;
        boolean validInput;

        //Intro
        System.out.printf("%55s", "***The Legend of Perly***" + "\n\n");
        System.out.println("Help Knight PyPy rescue Princess Perly from the dreaded"
            + " Hydra before its to late!");

        //Getting starting Hydra heads/tails with input verification
        do{
            try{
                System.out.println("Look...over there in the ominous cave, its the Hydra!  How many "
                        + "fire-breathing heads do you see?!");
                hydraHeads = input.nextInt();
                System.out.println("...and how many poisonous tails?!");
                hydraTails = input.nextInt();
                validInput = true;

                if(hydraHeads <= 0 || hydraTails <= 0){
                    System.out.println("You can only enter positive integers. Try again.");
                    validInput = false;
                }
            }catch(InputMismatchException e){
                System.out.println("You can only enter positive integers. Try again.");
                input.nextLine(); //clear bad input
                validInput = false;
            }

        }while(!validInput);



        //Create the Hydra and Knight PyPy
        Hydra hydra = new Hydra(hydraHeads, hydraTails);
        KnightPyPy knightPyPy = new KnightPyPy();

        System.out.println("The only way to defeat the magical Hydra is to leave it with NO heads and No tails.");
        System.out.println("What attack shall brave Knight PyPy unleash first to vanquish this foul beast?");



       //while loop to run the game will the Hydra is alive and PyPy hasn't run away
        while(hydra.getIsAlive() && knightPyPy.getIsBrave()){
            showMinMovesOrNot(hydra);
            knightPyPy.doAttack(getChoice(knightPyPy), knightPyPy, hydra);
            hydra.deathCheck();

            if(hydra.getIsAlive() && knightPyPy.getIsBrave()){
                hydra.showHydra();
            }

        }


    }

    //Method to get user's attack choice and validate input
    public static int getChoice(KnightPyPy knight){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean goodInput = false;

        do {
            try {
                knight.attackMenu();
                choice = input.nextInt();
                goodInput = true;

                if(choice <= 0 || choice > 5){
                    System.out.println("Your choices are only 1-5. Try again.");
                    goodInput = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("You can only enter integers 1-5.");
                input.nextLine(); //clear bad input
                goodInput = false;
            }
        }while(!goodInput);

        return choice;
    }

    //Method to ask user if they want to see the minimum moves each time with input verification
    //and display them accordingly
    public static void showMinMovesOrNot(Hydra hydra){
        Scanner input = new Scanner(System.in);
        char yesOrNo;
        boolean goodInput;

        do{
            try{
                System.out.println("------------------------------");
                System.out.println("Do you want to know the minimum number of moves " +
                        "to kill the Hydra? Y or N");
                yesOrNo = Character.toUpperCase(input.next().charAt(0));
                goodInput = true;

                if(yesOrNo == 'Y' || yesOrNo == 'N'){
                    if(yesOrNo == 'N'){
                        continue;
                    }else{
                        if(hydra.findMinMoves() == -1){
                            System.out.println("The minimum number of attacks to kill the Hydra is " +
                                    hydra.findMinMoves() + ".");
                            System.out.println("It is impossible to kill the Hydra. RUN AWAY!!");
                        }else{
                            System.out.println("The minimum number of attacks to kill the Hydra is " +
                                    hydra.findMinMoves() + ".");
                        }
                    }
                }else{
                    System.out.println("You can only enter Y or N1");
                    goodInput = false;
                }
            }catch(InputMismatchException e){
                System.out.println("You can only enter Y or N2");
                input.nextLine(); //clear bad input
                goodInput = false;
            }

        }while(!goodInput);


    }


}
