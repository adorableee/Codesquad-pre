package mission5;

public class Platinum extends Member {
    public Platinum(String name, int shopping, int time) {
        super(name, shopping, time);
        grade = "PLATINUM";
        sale = 5;
        point = 5;
        parkingFee = time * 1000;
    }
}
