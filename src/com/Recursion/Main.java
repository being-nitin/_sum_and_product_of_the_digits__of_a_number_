package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// sum of all the digits
        int ans = sumOfDigit(1594);
        System.out.println(ans);

    }
    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }
}
