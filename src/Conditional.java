public class Conditional {
    public static void main(String[] args) {
        Conditional MagicEightBall = new Conditional();

    }//main method

    public Conditional(){
    String Question;
    Question = "Will Niam get a new get a GF?";
    int randomInt;
    randomInt = (int)(Math.random() * 10);

        System.out.println(Question);
        System.out.println();
        System.out.println(randomInt);
        if (randomInt ==0){
            System.out.println("NO WAY!!!!");
        }
        if (randomInt>=1 && randomInt <=5){
            System.out.println("There's no reason to give up hope");
        }
        if (randomInt>=6 && randomInt <=8){
            System.out.println("perchance");
        }
        if(randomInt>=9 && randomInt <=10){
            System.out.println("definitely");
        }

    }//constructor method
}
