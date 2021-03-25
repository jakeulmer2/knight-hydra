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
        hydra.setHeads(((hydra.getHeads() - 1) + 1));
    }

    public void attack2(Hydra hydra){
        hydra.setTails(((hydra.getTails() - 1) + 2));
    }

    public void attack3(Hydra hydra){
        hydra.setHeads(hydra.getHeads() - 2);
    }

    public void attack4(Hydra hydra){
        hydra.setTails(hydra.getTails() - 2);
        hydra.setHeads(hydra.getHeads() + 1);
    }

    public void attack5(){
        isBrave = false;

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
