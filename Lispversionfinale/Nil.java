package jus.aoo.Lisp.kernel;

public class Nil extends Atome {
	public static final Nil NIL = new Nil();
	private Nil(){}
	@Override public boolean isNil(){return true;}
	@Override public boolean isList(){return true;}
	@Override public SExpr car() {return this;}
	@Override public SExpr cdr() {return this;}
	@Override public String toString() {return "()";}
	
}
