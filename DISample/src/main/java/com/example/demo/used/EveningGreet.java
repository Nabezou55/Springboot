package com.example.demo.used;

/**
* 夕方の挨拶を行う
*/
//@Component
public class EveningGreet implements Greet {
	@Override
	public String greeting() {
		return "こんばんは";
	}
}
