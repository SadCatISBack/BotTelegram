import java.util.Random;

public class RandomDo {
    final Random random = new Random();

    public String answer1(){
        int answ = random.nextInt(4);
        String randomAnsw = "";
        switch (answ){
            case 1:
                randomAnsw = "Мяу";
            break;
            case 2:
                randomAnsw = "Котика не оказалось на месте";
            break;
            case 3:
                randomAnsw = "Мур";
            break;
        }
        return randomAnsw;
    }
}
