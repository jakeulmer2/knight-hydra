package edu.umsl;

public class KnightPyPy {

    private boolean isBrave = true;

    public boolean getIsBrave() {
        return isBrave;
    }

    public void setIsBrave(boolean brave) {
        isBrave = brave;
    }



    //Default Constructor
    public KnightPyPy(){

    }

    public static void attackMenu(){
        System.out.println("------------------------------");
        System.out.printf("%26s", "Knight PyPy's Attacks\n");
        System.out.println("|[1] Cut off ONE Hydra head. |\n" +
                "|[2] Cut off ONE Hydra tail. |\n" +
                "|[3] Cut off TWO Hydra heads.|\n" +
                "|[4] Cut off TWO Hydra tails.|\n" +
                "|[5] Run Away!!              |\n" +
                "------------------------------");


    }

    public void attack1(Hydra hydra){
        if(hydra.getHeads() == 0){
            System.out.println("There aren't any heads to cut off. Try another attack my Lord.");
        }else{
            hydra.setHeads(((hydra.getHeads() - 1) + 1));
            System.out.println("Knight PyPy cut off ONE head, and ONE head grew right back!");
        }
    }

    public void attack2(Hydra hydra){

        if(hydra.getTails() == 0){
            System.out.println("There aren't any tails to cut off. Try another attack my Lord.");
        }else{
            hydra.setTails(((hydra.getTails() - 1) + 2));
            System.out.println("Knight PyPy cut off ONE tail, and TWO tails grew right back!");
        }
    }

    public void attack3(Hydra hydra){

        if(hydra.getHeads() <= 1){
            System.out.println("There aren't TWO heads to cut off. Try another attack my Lord.");
        }else{
            hydra.setHeads(hydra.getHeads() - 2);
            System.out.println("Knight PyPy cut off TWO heads!");
        }
    }

    public void attack4(Hydra hydra){

        if(hydra.getTails() <= 1){
            System.out.println("There aren't TWO tails to cut off. Try another attack my Lord.");
        }else{
            hydra.setTails(hydra.getTails() - 2);
            hydra.setHeads(hydra.getHeads() + 1);
            System.out.println("Knight PyPy cut off TWO tails, and ONE head grew right back!");
        }
    }

    public void attack5(){
        isBrave = false;
        System.out.println("Apparently Knight PyPy is not so brave after all.");
        System.out.println("He has run home to hide under his bed, and Princess Perly is stuck" +
            " smelling Hydra halitosis for the rest of her days.");
    }

    public static void doAttack( int move, KnightPyPy knight, Hydra hydra){
        switch(move){
            case 1:
                knight.attack1(hydra);
                break;
            case 2:
                knight.attack2(hydra);
                break;
            case 3:
                knight.attack3(hydra);
                break;
            case 4:
                knight.attack4(hydra);
                break;
            case 5:
                knight.attack5();
                break;
            default:
                System.out.println("That is not a valid choice.");
        }
    }





}
