import java.util.Scanner;
class PhoneBook{
    private Phone phone[];
    private int people;
    private String name;
    private String tel;
    private String input_name;

    public PhoneBook(int people){
        Scanner scanner=new Scanner(System.in);
        this.people=people;
        phone=new Phone[people];
        for(int i=0;i<people;i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
            name=scanner.next();
            tel=scanner.next();
            phone[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");
        explore();
    }
    public void explore(){
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("검색할 이름>>");
            input_name=scanner.next();
            if(input_name.equals("그만")){
                break;
            }
            boolean found=false;
            for(int i=0;i<people;i++){
                if(phone[i].getName().equals(input_name)) {
                    phone[i].show(); //각 객체에서 탐색
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(input_name+" 이 없습니다.");
            }
        }while(true);
    }
}
class Phone{
    private String input_name;
    private String name;
    private String tel;
    public Phone(String name,String tel){
     this.name=name;
     this.tel=tel;
    }
    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
    public void show(){
        System.out.println(name+"의 번호는 "+tel+" 입니다.");
    }
}
public class eight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("인원수>>");
        int people=scanner.nextInt();
        PhoneBook data=new PhoneBook(people);
        scanner.close();
    }
}
