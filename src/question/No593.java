package question;

public class No593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return help(p1,p2,p3,p4) && help(p2,p1,p3,p4) && help(p3,p2,p1,p4) && help(p4,p2,p3,p1);
    }
    private boolean help (int[] p1, int[] p2, int[] p3, int[] p4){
        double d12 = Math.pow(p1[0] - p2[0],2) + Math.pow(p1[1] - p2[1],2);
        double d13 = Math.pow(p1[0] - p3[0],2) + Math.pow(p1[1] - p3[1],2);
        double d14 = Math.pow(p1[0] - p4[0],2) + Math.pow(p1[1] - p4[1],2);
        return d12==d13 && d12!=0 && d14==d12*2 || d12==d14&&d12!=0&&d13==d12*2 || d13==d14&&d12!=0&&d12==d13*2;
    }

}
