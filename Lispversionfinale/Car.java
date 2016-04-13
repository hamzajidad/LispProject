package jus.aoo.Lisp.kernel;

public class Car {

	public Car(){}
	
	public SExpr Reduction(SCons s){return s.cdr().car().eval();}


}
