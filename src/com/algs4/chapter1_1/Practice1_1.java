package com.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.lang.Math;

public class Practice1_1 {

	private static int ex14_lg(int N) 
	{
		int i;
		for (i = 0; i * i < N; i++);
		return i - 1;
	}
	private static int[] ex15_histogram (int a[], int M) 
	{
		int a_m[] = new int [M + 1];
		for (int i = 0; i < a.length; i++) 
		{
			a_m[a[i]]++;
		}
		return a_m;
	}
	public static String ex16_exR1 (int n) 
	{
		if (n <= 0) return "";
		return ex16_exR1 (n - 3) + n + ex16_exR1 (n -2) + n;
		
	}
	
	public static int ex18_mystery (int a, int b) 
	{
		if (b == 0) return 0;
		if (b % 2 == 0) return ex18_mystery (a + a, b / 2);
		return ex18_mystery (a + a, b / 2) + a;
	}
	
	public static int ex19_fibonacci_cnt = 0;
	
	public static long ex19_fibonacci (int N) 
	{
		if (N == 0)
		{
			ex19_fibonacci_cnt++;
			return 0;
		}
		if (N == 1) 
		{
			ex19_fibonacci_cnt++;
			return 1;
		}
		return ex19_fibonacci (N - 1) +ex19_fibonacci  (N - 2);
	}
	
	public static double ex20_ln (int N)
	{
		if (N == 0) return 0;
		return Math.log(N) + ex20_ln (N - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println ("\nPractice 1.1.1");
		StdOut.println ("(0+15/2)="+(0+15/2));
		StdOut.println ("2.0e-6*100000000.1="+2.0e-6*100000000.1);
		StdOut.println ("true && false || true && true=" + (true && false || true && true));
		
		StdOut.println ("\nPractice 1.1.2");
		StdOut.println ("(1+2.236)/2="+(1+2.236)/2);
		StdOut.println ("1+2+3+4.0="+(1+2+3+4.0));
		
		StdOut.println ("(4.1 >= 4 )="+(4.1>=4));
		StdOut.println ("(1+2+\"3\")="+(1+2+'3'));
		
		/* 
		StdOut.println ("\nPractice 1.1.3");
		StdOut.println ("Please input three int num");

		
		int int_arr[] = new int[3];
		int_arr[0] = StdIn.readInt();
		int_arr[1] = StdIn.readInt();
		int_arr[2] = StdIn.readInt();
		if ((int_arr[0] == int_arr[1]) && (int_arr[2] == int_arr[1]))
			StdOut.println ("Equal");
		else
			StdOut.println ("Not Equal");
		*/
		
		StdOut.println ("\nPractice 1.1.4");
		
		int a = 1, b = 2, c =3;
		if (a > b) c = 0 ;
		
		StdOut.println ("\nPractice 1.1.6");
		int f = 0;
		int g = 1;
		for (int i=0;i<=15;i++)
		{
			StdOut.println (f);
			f = f + g;
			g = f - g;
		}
		
		StdOut.println ("\nPractice 1.1.7");
		
		double t = 9.0;
		while (Math.abs (t-9.0/t)> 0.001)
			t = (9.0/t + t) / 2.0;
		StdOut.printf("t=%.5f\n", t);
		
		int sum = 0;
		for (int i = 1; i < 1000; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				sum ++;
			}
		}
		StdOut.println (sum);
		
		sum = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum++;
		StdOut.println (sum);
		
		StdOut.println ("\nPractice 1.1.8");
		StdOut.println ('b');
		StdOut.println ('b' + 'c');
		StdOut.println ((char) ('a' + 4));
		
		StdOut.println ("\nPractice 1.1.9");
		
		int n = 0x123456;
		String s = "";
		for (int i = n; i > 0; i /= 2)
			s = (i % 2) + s;
		StdOut.println (n + "to binaryString =" + s);
		
		StdOut.println ("\nPractice 1.1.12");
		int []a_arr = new int[10];
		for (int i = 0;i < 10; i ++) 
			a_arr[i] = 9 - i;
		for (int i = 0;i < 10; i ++)
			a_arr[i] = a_arr[a_arr[i]];
		for (int i = 0;i < 10; i ++)
			StdOut.println (a_arr[i]);
		
		StdOut.println ("\nPractice 1.1.14");
		StdOut.println ("lg(1000)="+ ex14_lg (1000));
		
		StdOut.println ("\nPractice 1.1.15");
		int[] ex15_a = new int[10];
		ex15_a[0] = 1; ex15_a[4] = 2; ex15_a[8] = 4;
		ex15_a[1] = 1; ex15_a[5] = 2; ex15_a[9] = 5;
		ex15_a[2] = 1; ex15_a[6] = 3;
		ex15_a[3] = 1; ex15_a[7] = 4;
		
		
		int[] ex15_a_m = ex15_histogram (ex15_a, 5);
	
		for (int i = 0; i < ex15_a_m.length; i++)
			StdOut.println ("ex15_a_m["+i+"] = " + ex15_a_m[i]);
	
		StdOut.println ("\nPractice 1.1.16");
		StdOut.println ("ex16_exR1(1) = " + ex16_exR1 (1));
		StdOut.println ("ex16_exR1(2) = " + ex16_exR1 (2));
		StdOut.println ("ex16_exR1(3) = " + ex16_exR1 (3));
		StdOut.println ("ex16_exR1(4) = " + ex16_exR1 (4));
		StdOut.println ("ex16_exR1(5) = " + ex16_exR1 (5));
		StdOut.println ("ex16_exR1(6) = " + ex16_exR1 (6));
		
		StdOut.println ("\nPractice 1.1.18");
		StdOut.println ("ex18_mystery(2,25) = " + ex18_mystery(2,25));
		StdOut.println ("ex18_mystery(3,11) = " + ex18_mystery(3,11));
		
		StdOut.println ("\nPractice 1.1.19");
		ex19_fibonacci_cnt = 0;
		StdOut.println ("ex19_fibonacci (4) = " + ex19_fibonacci (4)
						+ " ex19_fibonacci_cnt = " + ex19_fibonacci_cnt);
		
		ex19_fibonacci_cnt = 0;
		StdOut.println ("ex19_fibonacci (5) = " + ex19_fibonacci (5)
						+ " ex19_fibonacci_cnt = " + ex19_fibonacci_cnt);
		
		ex19_fibonacci_cnt = 0;
		StdOut.println ("ex19_fibonacci (6) = " + ex19_fibonacci (6)
						+ " ex19_fibonacci_cnt = " + ex19_fibonacci_cnt);
		
		StdOut.println ("\nPractice 1.1.20");
		StdOut.println ("ex20_ln(10) = " + ex20_ln (10));
		StdOut.println ("ex20_ln(20) = " + ex20_ln (20));
	}
	

}
