package mall.test;

import cn.hutool.crypto.SecureUtil;

import java.util.UUID;

public class UUIDtest {
    public static void main(String[] args) {
        String string = UUID.randomUUID().toString();
        String s = SecureUtil.md5(string);
        System.out.println(s);
    }
}
