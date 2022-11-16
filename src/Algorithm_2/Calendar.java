package Algorithm_2;

public class Calendar {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        int month = a - 1;
        int day = b - 1;
        int x[] ={31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        String answer[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        for(int i = 0; i < month; i++){
            sum += x[i];
        }
        sum += day;
        System.out.println(answer[sum % 7]);
    }
}
