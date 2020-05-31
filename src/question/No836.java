package question;

public class No836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return help(rec1, rec2) || help(rec2, rec1);
    }

    public boolean help(int[] rec1, int[] rec2){
        if (rec2[0] < rec1[2] && rec2[1] < rec1[3]){
            return true;
        }
        return false;
    }
}
