package question;

public class No135 {
    public int candy(int[] ratings) {
        int[] n = new int[ratings.length];
        int[] m = new int[ratings.length];
        n[0] =1;
        m[ratings.length-1]=1;
        for(int i=1;i<n.length;++i){
            if(ratings[i]>ratings[i-1]){
                n[i] = n[i-1]+1;
            }else{
                n[i]=1;
            }
        }
        for(int i=m.length-2;i>=0;--i){
            if(ratings[i]>ratings[i+1]){
                m[i] = m[i+1]+1;
            }else {
                m[i] = 1;
            }
        }
        int result = 0;
        for(int i=0;i<ratings.length;++i){
            result += Math.max(n[i],m[i]);
        }
        return result;
    }
}
