import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args){
        BigDecimal number1 = new BigDecimal(25.2);
        BigDecimal number2 = new BigDecimal(5.6);
        System.out.println(number1);
        System.out.println(OperazioneEnum.ADDIZIONE);
        System.out.println(number2);
        System.out.println(Calcolatrice.calcolatrice(number1,number2, OperazioneEnum.ADDIZIONE));

    }

}
