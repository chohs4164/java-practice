import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int number=scanner.nextInt();
        int ten=number/10; //십의 자리
        int one=number%10; //일의 자리
        if(ten==3||ten==6||ten==9){
            if(one==3||one==6||one==9)
                System.out.println("박수짝짝");
            else
                System.out.println("박수찍");
        }
        else if(one==3||one==6||one==9)
            System.out.println("박수짝");
        else{
            System.out.println("3,6,9 중 어느 숫자도 없음");
        }

        scanner.close();
    }
}
