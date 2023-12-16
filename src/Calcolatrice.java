import java.math.BigDecimal;

public class Calcolatrice {

    private OperazioneEnum operazioneEnum;

    public Calcolatrice(OperazioneEnum operazioneEnum) {
        this.operazioneEnum = operazioneEnum;
    }

    public OperazioneEnum getOperazioneEnum() {
        return operazioneEnum;
    }

    public void setOperazioneEnum(OperazioneEnum operazioneEnum) {
        this.operazioneEnum = operazioneEnum;
    }


    public static BigDecimal calcolatrice(BigDecimal number1, BigDecimal number2, OperazioneEnum operazione) {
        BigDecimal risultato = BigDecimal.valueOf(0);
        switch (operazione) {
            case ADDIZIONE:
                return number1.add(number2);
            case SOTTRAZIONE:
                return number1.subtract(number2);
            case MOLTIPLICAZIONE:
                return number1.multiply(number2);
            case DIVISIONE:
                return number1.divide(number2);
            case MIN:
                return number1.min(number2);
            case MAX:
                return number1.max(number2);
            default:
                System.out.println("Non è possibile effettuare l'operazione richiesta");
        }
        return risultato;
    }
}
