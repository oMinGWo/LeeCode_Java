package question;

/**
 * reference: https://blog.csdn.net/wilschan0201/article/details/72519147
 */
public class No458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int n = minutesToTest/minutesToDie + 1;
        int total = 1;
        int result = 0;
        while(total < buckets){
            total = total * n;
            result ++;
        }
        return result;
    }
}
