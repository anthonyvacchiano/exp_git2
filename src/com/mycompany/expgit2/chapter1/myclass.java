/**
 * 
 */
package com.mycompany.expgit2.chapter1;

/**
 * @author anthony
 *
 */
public class myclass {
	private String name;
	public String getName() {
		return name;
	}
	private String lastname;
	public myclass(String name){
		this.name = name;
	}
		// TODO Auto-generated constructor stub

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BEGIN");
		staticMethod("ilker");
		System.out.println("END");

	}
	public static void staticMethod(String inp){
		System.out.println("Hi input is " + inp);
		System.out.println("bye");
	}
	

}
