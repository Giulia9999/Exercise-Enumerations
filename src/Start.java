
public class Start {
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    public static void main(String[] args) {

        for (Month m : Month.values()) {
            if(m.toString().endsWith("Y")) {
                System.out.printf("%s ends with y%n", m);
            }else{
                System.out.printf("%s doesn't end with y%n", m);
            }
        }
    }
}