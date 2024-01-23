import java.util.Scanner;

class Add{
    private static int a;
    private static int b;
    public static void setValue(int a, int b){
        Add.a=a;
        Add.b=b;
    }
    public static int calculate(){
        return a+b;
    }
}
class Sub{
    private static int a;
    private static int b;
    public static void setValue(int a, int b){
        Sub.a=a;
        Sub.b=b;
    }
    public static int calculate(){
        return a-b;
    }
}
class Mul{
    private static int a;
    private static int b;
    public static void setValue(int a, int b){
        Mul.a=a;
        Mul.b=b;
    }
    public static int calculate(){
        return a*b;
    }
}
class Div{
    private static int a;
    private static int b;
    public static void setValue(int a, int b){
        Div.a=a;
        Div.b=b;
    }
    public static int calculate(){
        if(b==0)
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        else
            return a/b;
    }
}
public class eleven {
    public static void main(String[] args) {
        Add add=new Add();
        Sub sub=new Sub();
        Mul mul=new Mul();
        Div div=new Div();
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.print("두 정수와 연산자를 입력하시오>>");
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();
            String operator = scanner.next();
            int result;
            switch (operator) {
                case "+":
                    Add.setValue(operand1, operand2);
                    result = Add.calculate();
                    System.out.println(result);
                    break;
                case "-":
                    Sub.setValue(operand1, operand2);
                    result = Sub.calculate();
                    System.out.println(result);
                    break;
                case "*":
                    Mul.setValue(operand1, operand2);
                    result = Mul.calculate();
                    System.out.println(result);
                    break;
                case "/":
                    Div.setValue(operand1, operand2);
                    result = Div.calculate();
                    System.out.println(result);
                    break;
            }
        }
    }
}
