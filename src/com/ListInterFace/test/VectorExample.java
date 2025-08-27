package com.ListInterFace.test;

import java.util.*;
	public class VectorExample 
	{
		public static void main(String[] args) 
		{
			Vector v = new Vector();
			
			v.add(100);
			v.add("apple");
			v.add(true);
			v.add(2.5);
			v.add(null);
			v.add(100);
			
			System.out.println(v);
			
			Integer i = (Integer)v.get(0);
			System.out.println(i);
			
			String str = (String)v.get(1);
			System.out.println(str);
			
			Boolean b = (Boolean)v.get(2);
			System.out.println(b);
			
			System.out.println("size = " + v.size());
			
			System.out.println("contains = " + v.contains(100));
			
			System.out.println("isEmpty = " + v.isEmpty());
			
			System.out.println("index of apple = " + v.indexOf("apple"));
			
			System.out.println("removed = " + v.remove((Integer)100));
			
			System.out.println("removed = " + v.remove(0));
			
			System.out.println(v);
		}
	}



