package question;

public class No028 {
	public int strStr(String haystack, String needle) {
        char[] source=haystack.toCharArray();
        int sourceCount=source.length;
        char[] target=needle.toCharArray();
        int targetCount=target.length;
        if(targetCount==0){
        	return 0;
        }
        char first=target[0];
        int max=sourceCount-targetCount;
        for(int i=0;i<=max;i++){
        	if(source[i]!=first){
        		while (++i <= max && source[i] != first);
        	}
        	if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = 1; j < end && source[j]
                        == target[k]; j++, k++);

                if (j == end) {
                    /* Found whole string. */
                    return i;
                }
            }
        }
        return -1;
    }
}




