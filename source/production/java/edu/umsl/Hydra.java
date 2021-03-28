package edu.umsl;

public class Hydra {

    private boolean isAlive;
    private int heads;
    private int tails;

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHeads() {
        return heads;
    }

    public void setHeads(int heads) {
        this.heads = heads;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }



   //Default Constructor
    public Hydra(){
        heads = 1;
        tails = 1;
        isAlive = true;
    }

    //Constructor accepting heads and tails parameters
    public Hydra(int h, int t){
        heads = h;
        tails = t;
        isAlive = true;
        System.out.println("By the moons of Perlonia. You say the Hydra has " + h + " fire-breathing heads and "
            + t + " poisonous tails!");
    }

    //Copy constructor for use with minimum moves method
    public Hydra(Hydra actualHydra){
        this.heads = actualHydra.heads;
        this.tails = actualHydra.tails;
        this.isAlive = actualHydra.isAlive;
    }

    //Method for displaying the current Hydra heads and tails
    public void showHydra(){
        System.out.println("The hydra has " + heads + " heads, and " +
        tails + " tails.");

        //Check for and display headless Hydra
        if(isAlive && heads == 0){
            System.out.println("We have a Headless Hydra my Lord!");
        }

    }

    //Method to check if Hydra is dead/defeated
    public void deathCheck(){
        if(heads == 0 && tails == 0){
            isAlive = false;
            System.out.println("The Hydra has been slain, and Princess Perly has been saved!!");
            System.out.println("Thanks to Knight PyPy the Brave and Princess Perly's wisdom, ");
            System.out.println("order has been restored and " +
                    "rays of hope shine upon the land once again!");
            System.exit(0);
        }

    }

    //Method to find the minimum amount of attacks to kill the Hydra or if it is impossible
    public int findMinMoves(){
        int minMoves = 0;

        if(heads % 2 != 0 && tails == 0){
            minMoves = -1; //Will not be able to kill Hydra, just run away
            return minMoves;
        }else {

            if(heads % 2 == 0 && tails == 0){
                minMoves = heads / 2;
            }

            //If heads and tails are even
            if(heads % 2 == 0 && tails % 2 == 0){
                //If tails divided by two is even
                if((heads + (tails / 2)) % 2 == 0){
                    minMoves = (tails/2) + (((heads + (tails/2)))/2);
                }
                //If tails divided by two is odd
                if((heads + (tails / 2)) % 2 != 0){
                    minMoves = ((heads/2) + ((tails - 2)/2) + 6);
                }

            }

            //If heads is even and tails is odd
            if(heads % 2 == 0 && tails % 2 != 0){
                //If tails plus one is even
                if((tails + 1) % 2 == 0){
                    minMoves = (1 + ((tails + 1) / 2) + ((heads + ((tails + 1) / 2)) / 2) );
                }
                //If tails plus one is odd
                if((tails + 1) % 2 != 0){
                    minMoves = (((tails / 2) + 3) + 2 + (heads +((tails + 1) /2) + 2));
                }
            }

            //If heads and tails are odd
            if(heads % 2 != 0 && tails % 2 != 0){
                if(heads == tails){
                    minMoves = heads * tails;
                }
                if(heads < tails){
                    minMoves = ((heads + tails) - 1);
                }
                if(heads > tails){
                    minMoves = ((heads + tails) + 2);
                }
            }

            //If heads is odd and tails is even
            if(heads % 2 != 0 && tails % 2 == 0){
                //if tails divided by two is odd
                if((tails / 2) % 2 != 0){
                    minMoves = ((tails / 2) + ((heads + (tails / 2)) / 2));
                }
                //if tails divided by two is even
                if((tails / 2) % 2 == 0){
                    minMoves = (((tails - 2) / 2) + (heads + ((tails -2) / 2)) + 1);
                }
            }

            if(heads == 1 && tails == 1){
                minMoves = 3;

            }


            return minMoves;


        }

    }



}
