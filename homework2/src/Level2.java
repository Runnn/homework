/**
 * Created by 陈子健 on 2016/10/19.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Level2 {
    public static String result(int input){
        BigInteger sum = new BigInteger("1");
        for(int i = input;i > 0;i--){
            sum = sum.multiply(new BigInteger((String.valueOf(i))));
        }
        System.out.println(sum);
        String t = String .valueOf(sum);
        return t;
    }
    public static String subResult(int input,int start,int end){
        BigInteger sum = new BigInteger("1");
        for(int i = input;i > 0;i--){
            sum = sum.multiply(new BigInteger((String.valueOf(i))));
        }
        System.out.println(sum.toString().substring(start,end));
        String s = String.valueOf(sum);
        return s;
    }
}

class lv2{
    public static void main(String[] args){
        System.out.println("input");
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();;
        System.out.println("start");
        Scanner b = new Scanner(System.in);
        int B = b.nextInt();
        System.out.println("end");
        Scanner c = new Scanner(System.in);
        int C = c.nextInt();
        Level2.result(A);
        Level2.subResult(A,B,C);
    }
}