public class logic {
    Player pl;
    Player pl1;
    Player pl2;

    public void startGame(){
        pl = new Player();
        pl1 = new Player();
        pl2 = new Player();

        int guessp = 0;
        int guessp1 = 0;
        int guessp2 = 0;

        boolean plisRight = false;
        boolean pl1isRight = false;
        boolean pl2isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while(true){
            System.out.println("Число, которое нужно угодать, - " + targetNumber);

            pl.guess();
            pl1.guess();
            pl2.guess();



        }

    }

}
