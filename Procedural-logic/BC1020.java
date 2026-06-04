import java.util.Scanner; 
public class BC1020{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        int years = 0;
        int months = 0;
        int days = 0;
        while(age != 0) {
            if (age > 365) {
                age -= 365;
                years++;
            } else if (age >= 30) {
                age -= 30;
                months++;
            } else {
                days = age;
                age = 0;
            }
        }

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        sc.close(); 
    }
}