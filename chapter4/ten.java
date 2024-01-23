import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑","아기","돈","미래","희망"};
    private static String [] eng = {"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        for(int i=0;i<kor.length;i++) {
            if (word.equals(kor[i]))
                return eng[i];
        }
        return null;
    }
}
public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        Dictionary dic = new Dictionary();
        while(true) {
            System.out.print("한글 단어?");
            String input=scanner.next();
            if(input.equals("그만"))
                return;
            String answer=dic.kor2Eng(input);
            if(answer!=null){
                System.out.println(input+"은 "+answer);
            }
            else
                System.out.println(input+"는 저의 사전에 없습니다.");
        }
    }
}
