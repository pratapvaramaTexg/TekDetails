package com.tek;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	l.add(1);
	l.add(5);
	l.add(2);
	l.add(4);
	
	System.out.println(l);
	
	l.remove(2);
	System.out.println(l);
}
}
