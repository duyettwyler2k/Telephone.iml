import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so dien thoai");
        String phone=scanner.nextLine();
        String regex="[0][1-9]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(phone);
        if (matcher.find()){
            System.out.println("ok");
        } else System.out.println("no");
    }
}
