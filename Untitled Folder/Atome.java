package jus.aoo.Lisp.kernel;

public abstract class Atome implements SExpr{

	
	public boolean isAtom(){
		return true;
	}
	
	public boolean isList(){
		return false;
		
	}
	
	public boolean isNil(){
		return false;
	}
	
	public boolean eq(SExpr expression){
		return false;
	}
	
	
	
	public String toString(){
		return "";
		
	}

	
}
