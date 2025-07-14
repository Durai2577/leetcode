import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner dd=new Scanner(System.in);
        String s=dd.nextLine();
        int res=0;
        for(int i=0;i<s.length();i++){
            int[]freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int maxFreq=0;
                int minFreq=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0) {
                        maxFreq=Math.max(maxFreq,freq[k]);
                        minFreq=Math.min(minFreq,freq[k]);
                    }
                }
                res+=(maxFreq-minFreq);
            }
        }
        System.out.print(res);
    }
}
