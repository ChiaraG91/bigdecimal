public enum OperazioneEnum {

    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZIONE("*"),
    DIVISIONE("/"),
    MIN("min"),
    MAX("max");

    private static String operazioneEnum;

    OperazioneEnum(String operazioneEnum) {
    }

    public static String getOperazioneEnum() {
        return operazioneEnum;
    }

    public void setOperazioniEnum(OperazioneEnum operazioniEnum) {
        this.operazioneEnum = String.valueOf(operazioneEnum);
    }


}
