package question;

import java.util.HashMap;

public class No036 {
	public static void main(String args[]){
		char[][] b={
				{'.','8','7','6','5','4','3','2','1'},
				{'2','.','.','.','.','.','.','.','.'},
				{'3','.','.','.','.','.','.','.','.'},
				{'4','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','.','.'},
				{'6','.','.','.','.','.','.','.','.'},
				{'7','.','.','.','.','.','.','.','.'},
				{'8','.','.','.','.','.','.','.','.'},
				{'9','.','.','.','.','.','.','.','.'}
		};
		No036 n=new No036();
		System.out.println(n.isValidSudoku(b));
	}
	public boolean isValidSudoku(char[][] board) {
        char[][] b=new char[3][3];
        for(int i=0;i<9;i+=3){
        	for(int j=0;j<9;j+=3){
        		b[0][0]=board[i][j];
        		b[0][1]=board[i][j+1];
        		b[0][2]=board[i][j+2];
        		b[1][0]=board[i+1][j];
        		b[1][1]=board[i+1][j+1];
        		b[1][2]=board[i+1][j+2];
        		b[2][0]=board[i+2][j];
        		b[2][1]=board[i+2][j+1];
        		b[2][2]=board[i+2][j+2];
        		if(!help1(b)){
        			System.out.println("ge");
        			return false;
        		}
        	}
        }
        char[] a=new char[9];
        for(int i=0;i<9;i++){
        	int k=0;
        	for(int j=0;j<9;j++){
        		a[k]=board[i][j];
        		k++;
        	}
        	if(!help2(a)) {
        		System.out.println("hang");
        		return false;
        	}
        }
        for(int i=0;i<9;i++){
        	int k=0;
        	for(int j=0;j<9;j++){
        		a[k]=board[j][i];
        		k++;
        	}
        	if(!help2(a)) {
        		System.out.println("lie");
        		return false;
        	}
        }
		return true;
    }
	
	public boolean help2(char[] a){
		HashMap<Character,Integer> h=new HashMap();
		h.put('1',1);
		h.put('2',1);
		h.put('3',1);
		h.put('4',1);
		h.put('5',1);
		h.put('6',1);
		h.put('7',1);
		h.put('8',1);
		h.put('9',1);
		for(char x:a){
			if(x!='.')
			if(h.containsKey(x)) h.remove(x);
			else return false;
		}
		return true;
	}
	
	public boolean help1(char[][] b){
		HashMap<Character,Integer> h=new HashMap();
		h.put('1',1);
		h.put('2',1);
		h.put('3',1);
		h.put('4',1);
		h.put('5',1);
		h.put('6',1);
		h.put('7',1);
		h.put('8',1);
		h.put('9',1);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(b[i][j]!='.'){
					if(h.containsKey(b[i][j])) h.remove(b[i][j]);
					else return false;
				}
			}
		}
		return true;
	}
}
