package com.cg.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque arraydeque = new ArrayDeque();
		arraydeque.add("A");
		arraydeque.add("B");
		arraydeque.add("C");
		
		System.out.println(arraydeque);
	}

}