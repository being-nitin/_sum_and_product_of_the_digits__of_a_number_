package com.Recursion;
import java.util.*;

public class ProductOfAllDigits {
    public static void main(String[] args) {
        int n = 2356;
        int ans = productOfDigits(n);
        System.out.println(ans);

    }
    public static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*productOfDigits(n/10);
    }
}
