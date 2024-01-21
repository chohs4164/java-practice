import java.util.Scanner;

public class two {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int num=scanner.nextInt();
        int a=num/10; //10의 자리수
        int b=num%10; //1의 자리수

        if(a==b) {
            System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else
            System.out.print("No, 10의 자리와 1의 자리가 다릅니다.");

        scanner.close();
    }
}
