package test;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n<3 ||n>100)
            	throw new RuntimeException("n should be in the range of[3,100]");     
            int d = sc.nextInt();
            if(d<1 ||d>n)
               	throw new RuntimeException("d should be in the range of[1,n]");
            int[][] a = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = sc.nextInt();
                }
            }
           System.out.println(getMaxSum(n,d,a));            
        }
    }
    
    static int getMaxSum(int n ,int d, int[][] a){
        int result = 0;
        for(int i=0;i<n-d;i++)
            for(int j=0;j<n-d;j++){
                result = Math.max(result,getMax(i,j,d,a));
            }
        return result;
    }
    
    static int getMax(int startx,int starty,int length,int[][] a){
        int left = 0;
        int rigth = 0;
        int vertical = 0;
        int horizon =0;
        
        for(int x = startx,yl = starty,yr=starty+length-1;x<startx+length;x++,yl++,yr-- ){
            left += a[x][yl];
            rigth += a[x][yr];
        }
        
        for(int x =startx;x<startx+length;x++){
            int local = 0;
            for(int y = starty;y<starty+length;y++){
                local += a[x][y]; 
            }
            vertical = Math.max(vertical,local);
        }
        
        for(int y = starty;y<starty+length;y++){
            int local = 0;
            for(int x = startx;x<startx+length;x++){
                local += a[x][y];
            }
            horizon = Math.max(local,horizon);
        }
        
        
        return Math.max(Math.max(left,rigth),Math.max(horizon,vertical));
        
        
    }   
    
}