public class Conditional {
    public static void main(String[] args) {
        Conditional MagicEightBall = new Conditional();

    }//main method

    public Conditional(){
    String Question;
    Question = "Will Gideon get a GF?";
    int randomInt;
    randomInt = (int)(Math.random() * 10);

        System.out.println(Question);
        System.out.println();
        System.out.println(randomInt);
        if (randomInt ==0){
            System.out.println("Very doubtful");
        }
        if (randomInt>=1 && randomInt <=5){
            System.out.println("Better not tell you now");
        }
        if (randomInt>=6 && randomInt <=8){
            System.out.println("As I see it, yes");
        }
        if(randomInt>=9 && randomInt <=10){
            System.out.println("Without a doubt");
        }

    }//constructor method
}
