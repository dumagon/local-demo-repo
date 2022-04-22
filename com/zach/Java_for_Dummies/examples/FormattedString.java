 package com.zach.Java_for_Dummies.examples;
 
import static java.lang.System.*;
 class FormattedString {

 public static void main(String[] args){

double sum =34.480898423434;
double sum1 =4688.480898423434;
double sum2 =3456578.480898423434;
double sum3 =3456644.480898423434;

// System.out.printf("$%4.2f\n",sum);
// System.out.printf("$%2.2f\n",sum);
// System.out.printf("jack has %.4f dollars\n",sum);

// System.out.printf("$%.3f\n$%2.2f\n$%5.3f\n$%10.3f\n",sum,sum1,sum2,sum3);

 out.printf("%s%1d%s", ">>", 7, "<<\n");
 out.printf("%s%10d%s", ">>", 7, "<<\n");
 out.printf("%s%-10d%s", ">>", 7, "<<\n");
 out.printf("%s00000000%1d%s", ">>", 7, "<<\n");
 out.printf("%s%+1d%s", ">>", 7, "<<\n");
 out.printf("%s%1d%s", ">>", -7, "<<\n");
 out.printf("%s%(1d%s", ">>", -7, "<<\n");
 out.printf("%s%10.7f%s", ">>", 7.0, "<<\n");
 out.printf("%s%s%s", ">>", "Hello", "<<\n");
 out.printf("%s%c%s", ">>", 'x', "<<\n");
 out.printf("%s%C%s", ">>", 'x', "<<\n");



// >>7<<
// >>       7<
// >>7       <
// >>0000000007<
// >>+7<<
// >>-7<<
// >>(7)<<
// >>  7.00000<
// >>HELLO<<
// >>x<<
// >>X<<


 }



 }