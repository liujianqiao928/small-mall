package pc.small.getdata;

import cn.hutool.Hutool;
import cn.hutool.core.util.RandomUtil;

public class Test {
    public static void main(String[] args) {
        int i = RandomUtil.randomInt(100000000, 1000000000);
        System.out.println(i);
    }
}
