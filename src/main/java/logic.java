public class logic {
    Player pl;
    Player pl1;
    Player pl2;

    public void startGame(){
        pl = new Player();
        pl1 = new Player();
        pl2 = new Player();

        int quessp = 0;
        int quessp1 = 0;
        int quessp2 = 0;

        boolean plisRight = false;
        boolean pl1isRight = false;
        boolean pl2isRight = false;

        int TargetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

    }

}
