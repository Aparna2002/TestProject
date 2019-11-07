package Testcases;

import java.io.IOException;

import scripts.Basetest;

public class Test001 extends Basetest{

	public static void main(String[] args) throws IOException {
		
		   init();
		
		  launch("chromebrowser"); 
		  navigateurl("amazonurl");
		 

	}

	

}
