//Access member of a class file	//Error
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import static java.lang.Integer.SIZE;
import static java.lang.System.*;

class A
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.util.Date today = new java.util.Date();
		System.out.println("Today is: "+today);

		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		Console c = System.console();

		//Date d = new Date();	//Error reference to date is ambiguous 

		System.out.println(SIZE);
		out.println("Hi");
	}
}