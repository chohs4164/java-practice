import java.util.Scanner;
public class four {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b) {
            if (b > c)
                System.out.println("중간 값은 "+b);
            if (b < c) {
                if (a < c)
                    System.out.println("중간 값은 " + a);
                if (a > c)
                    System.out.println("중간 값은 " + c);
            }
        }
        if(a<b){
            if (a > c)
                System.out.println("중간 값은 "+a);
            if (a < c) {
                if (c < b)
                    System.out.println("중간 값은 " +c);
                if (c > b)
                    System.out.println("중간 값은 "+b);
            }
        }
        if(a==b&&b==c)
            System.out.println("중간 값은 "+a);
    }
}
