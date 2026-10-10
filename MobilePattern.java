public class MobilePattern{
    public void getMobilePattern(String thumb) {
        System.out.println("Unlocked using thumb");
    }
public void getMobilePattern(int pin){
    System.out.println("Unlocked using pin:  " + pin);
}

public static void main(String[] args){
    MobilePattern mp = new MobilePattern();
    mp.getMobilePattern("thumb");
    mp.getMobilePattern(1484);
}
}