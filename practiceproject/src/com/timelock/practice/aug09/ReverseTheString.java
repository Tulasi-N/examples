package com.timelock.practice.aug09;

public class ReverseTheString
{
    public static void main(String[] args)
    {
        String str = "MyJava";
 
        // Using StringBuffer Class
 
        StringBuffer sbf = new StringBuffer(str);
 
        System.out.println(sbf.reverse());    //Output : avaJyM
 
        // Using iterative method
 
        char[] strArray = str.toCharArray();
 
        for (int i = strArray.length - 1; i >= 0; i--)
        {
            System.out.print(strArray[i]);    //Output : avaJyM
        }
 
        System.out.println();
 
        // Using Recursive Method
 
        System.out.println(recursiveMethod(str));    //Output : avaJyM
    }
 
    //Recursive method to reverse string
 
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}