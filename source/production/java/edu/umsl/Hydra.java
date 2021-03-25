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

        if(isAlive && heads == 0){
            System.out.println("We have a Headless Hydra my Lord!");
        }

    }



}
