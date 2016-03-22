package jus.aoo.Lisp.kernel;

public class Nil extends Atome {
	
	public boolean isNil(){
		return true;
	}
	
	public boolean isList(){
		return true;
	}

	@Override
	public SExpr eval() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public SExpr car() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SExpr cdr() {
		// TODO Auto-generated method stub
		return null;
	}

}
