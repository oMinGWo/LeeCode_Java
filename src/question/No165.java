package question;

public class No165 {
	public static void main(String args[]){
		No165 n=new No165();
		String v1="1.0";
		String v2="1.1";
		System.out.println(n.compareVersion(v1,v2));
	}
	public int compareVersion(String version1, String version2) {
		//TODO
		
		if(version1.indexOf(".")<0 && version2.indexOf(".")<0){
			int a=Integer.parseInt(version1);
			int b=Integer.parseInt(version2);
			if(a<b) return -1;
			if(a>b) return 1;
			return 0;
		}
		
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int len1=v1.length;
        int len2=v2.length;
        if(len1<len2){
        	for(int i=0;i<len2-len1;i++){
        		version1+=".0";
        	}
        }else if(len1>len2){
        	for(int i=0;i<len1-len2;i++){
        		version2+=".0";
        	}
        }
        
        String[] vv1=version1.split("\\.");
        String[] vv2=version2.split("\\.");
        len1=vv1.length;
        len2=vv2.length;
        
        int i=0,j=0;
        while(i<len1&&j<len2){
        	int a=Integer.parseInt(vv1[i]);
        	int b=Integer.parseInt(vv2[j]);
        	System.out.println(a+":"+b);
        	if(a<b) return -1;
        	if(a>b) return 1;
        	i++;
        	j++;
        }
		return 0;
    }
}
