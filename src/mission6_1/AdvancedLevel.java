package mission6_1;

public class AdvancedLevel extends PlayerLevel {
    @Override
    void run() {
        System.out.println("빨리 달립니다.");
    }
    @Override
    void jump() {
        System.out.println("높이 jump 합니다.");
    }
    @Override
    void turn() {
        System.out.println("Turn 할 줄 모르지롱~.");
    }
    @Override
    void showLevel() {
        System.out.println("중급자 레벨");
    }
}
