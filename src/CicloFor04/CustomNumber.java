package CicloFor04;

import java.util.Random;

public class CustomNumber {
    private int number;

    public CustomNumber(){
        Random random = new Random();
        this.number = random.nextInt(12);
    }
    public void getMultiplicationTable(){
        System.out.println("Multiplication table: " + number + ":" );
        for(int i = 12; i >=1; i--){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
