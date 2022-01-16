import java.util.UUID;

public class Test01 {
    public static void main(String[] args) {
        String s = "sqsq.qs.jpg";
        String substring = s.substring(s.lastIndexOf("."), s.length() - 1);
        System.out.println(substring);
        String replace = UUID.randomUUID().toString().replace("-", "");
        System.out.println(replace);
    }
}
