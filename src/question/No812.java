package question;

import java.util.ArrayList;

public class No812 {
    public double largestTriangleArea(int[][] points) {
        double max = Double.MIN_VALUE;
        for (int i=0;i<points.length;++i){
            for (int j=i+1;j<points.length;++j){
                for (int k=j+1;k<points.length;++k){
                    int x1=points[i][0];
                    int y1=points[i][1];
                    int x2=points[j][0];
                    int y2=points[j][1];
                    int x3=points[k][0];
                    int y3=points[k][1];
                    double a = Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2), 0.5);
                    double b = Math.pow((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3), 0.5);
                    double c = Math.pow((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2), 0.5);
                    double p = (a+b+c)/2;
                    double S=Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
                    if (S-max>0 && S-max<=0.000001){
                        max = S;
                    }
                }
            }
        }
        return max;
    }
}
