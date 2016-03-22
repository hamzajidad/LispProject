package jus.aoo.Lisp.kernel;

public abstract class Atome implements SExpr{

	
	public boolean isAtome(){
		return true;
	}
	
	public boolean isList(){
		return false;
		
	}
	
	public boolean isNil(){
		return false;
	}
	
	public boolean eq(SExpr){
		return false;
	}
	
	
	public SExpr car(){
		
	}
	
	public SExpr cdr(){
		
	}
	
	public String toString(){
		
	}

	
}
