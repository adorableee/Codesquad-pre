package mission5;

public class Member {
    protected String name;
    protected String grade;
    protected int shopping;
    protected int time;
    protected int sale;
    protected int point;
    protected int parkingFee;

    public Member(String name, int shopping, int time) {
        this.name = name;
        this.shopping = shopping;
        this.time = time;
    }

    public int saveMoney() {
        point = shopping * point/100;
        return shopping - (shopping * sale/100);
    }

    public void showCustomer() {
        System.out.println(name + "님의 자불 금액은 " +saveMoney()+"원이고, " +
                "적립 포인트는 "+point+"점 입니다.");
        System.out.println("주차 요금은 "+parkingFee+"원 입니다.");
    }
}
