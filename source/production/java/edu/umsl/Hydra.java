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

    public void showHydra(){
        System.out.println("The hydra has " + heads + " heads, and " +
        tails + " tails.");

        //Check for and display headless Hydra
        if(isAlive && heads == 0){
            System.out.println("We have a Headless Hydra my Lord!");
        }

    }

    public void deathCheck(){
        //Check for Hydra death and defeat
        if(heads == 0 && tails == 0){
            isAlive = false;
            System.out.println("The Hydra has been slain, and Princess Perly has been saved!!");
            System.out.println("Thanks to Knight PyPy the Brave and Princess Perly's wisdom, ");
            System.out.println("order has been restored and " +
                    "rays of hope shine upon the land once again!");
            System.exit(0);
        }

    }



}
