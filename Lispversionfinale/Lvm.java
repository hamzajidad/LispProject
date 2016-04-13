package jus.aoo.Lisp.kernel;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Lvm implements Serializable {
		
	public static void main (String[] args){
		
		TopLevel tp = new TopLevel(); 
		tp.start("test1.txt");
	}
	
	}
