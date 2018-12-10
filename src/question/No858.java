package question;

public class No858 {
    public int mirrorReflection(int p, int q) {
        int minCommonMultiple = p * q / maxCommonDivisor2(p,q);
        int multi = minCommonMultiple / q;
        if (multi % 2 == 0) {
            return 2;
        }else {
            int x = minCommonMultiple / p;
            if (x % 2 == 0) {
                return 0;
            }else {
                return 1;
            }
        }
    }

    private int maxCommonDivisor2(int m, int n) {
        // 保证m>n,若m<n,则进行数据交换
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        // 在余数不能为0时,进行循环
        while (m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        // 返回最大公约数
        return n;
    }
}
