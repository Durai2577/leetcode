import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner dd=new Scanner(System.in);
        int n=dd.nextInt();
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j%4==1){
                    System.out.print(j+" ");
                }
                else if(i==2 &&(j%4==0||j%4==2)){
                    System.out.print(j+" ");
                }
                else if(i==3 && j%4==3){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
