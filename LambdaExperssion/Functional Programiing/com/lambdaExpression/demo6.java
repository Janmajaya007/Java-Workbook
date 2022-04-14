package com.lambdaExpression;
// constructor reference 
interface messanger {
	Message getMessage(String msg);
}
class Message {
	Message(String msg) {
		System.out.println("Hi this is Janmajaya Message" + msg);
	}
}
public class demo6 {
	public static void main(String[] args) {
		messanger mr = Message::new;
		mr.getMessage(" You are the best friend of yourself");
	}
}