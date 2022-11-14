package mission5;

public class Red extends Member {
    public Red(String name, int shopping, int time) {
        super(name, shopping, time);
        grade = "RED";
        point = 1;
        parkingFee = time * 3000;
    }
}
