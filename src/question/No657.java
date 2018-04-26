package question;

public class No657 {
    public boolean judgeCircle(String moves) {
        char UP = 'U';
        char DOWN = 'D';
        char RIGHT = 'R';
        char LEFT = 'L';
        char[] move = moves.toCharArray();
        int[] count = new int[2];
        for(int i=0;i<move.length;++i){
            if(move[i] == UP){
                count[0]++;
            }else if(move[i] == DOWN){
                count[0]--;
            }else if(move[i] == RIGHT){
                count[1]++;
            }else if(move[i] == LEFT){
                count[1]--;
            }
        }
        return count[0] == 0 && count[1] == 0;
    }
}
