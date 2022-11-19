package mission6_1;

public class SuperLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("엄청 빨리 달립니다.");
    }
    @Override
    void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }
    @Override
    void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
    @Override
    void showLevel() {
        System.out.println("고급자 레벨");
    }
}
