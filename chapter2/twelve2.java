import java.util.Scanner;

public class twelve2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("연산>>");
        double operand1=scanner.nextDouble();
        String operator=scanner.next();
        double operand2=scanner.nextDouble();
        double answer;
        switch (operator){
            case "+":
                answer=operand1+operand2;
                if(operand1%1==0&&operand2%1==0){
                    System.out.println((int)operand1 + operator + (int)operand2 + "의 계산 결과는 " + (int)answer);
                }
                else
                    System.out.println(operand1+operator+operand2+"의 계산 결과는 "+answer);
                break;
            case "-":
                answer=operand1-operand2;
                if(operand1%1==0&&operand2%1==0){
                    System.out.println((int)operand1 + operator + (int)operand2 + "의 계산 결과는 " + (int)answer);
                }
                else
                    System.out.println(operand1+operator+operand2+"의 계산 결과는 "+answer);
                break;
            case "*":
                answer=operand1*operand2;
                if(operand1%1==0&&operand2%1==0){
                    System.out.println((int)operand1 + operator + (int)operand2 + "의 계산 결과는 " + (int)answer);
                }
                else
                    System.out.println(operand1+operator+operand2+"의 계산 결과는 "+answer);
                break;
            case "/":
                answer=operand1/operand2;
                if(operand2!=0) {
                    if(operand1%1==0&&operand2%1==0){
                        System.out.println((int)operand1 + operator + (int)operand2 + "의 계산 결과는 " + (int)answer);
                    }
                    else
                        System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + answer);
                }
                else
                    System.out.println("0으로 나눌 수 없습니다.");
                break;
        }

        scanner.close();
    }
}
