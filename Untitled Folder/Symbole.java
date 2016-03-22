package jus.aoo.Lisp.kernel;

public class Symbole extends Atome {


	private String nom ;
	
	public Symbole(String name){ 
		nom=name;
	}

	public String toString(){
		return nom ;
	}
	
	public SExpr car(){
		throw new LispException("car non defini pour un symbole");
		
	}
	
	public SExpr cdr(){
		throw new LispException("cdr non defini pour un symbole");
	}
	
	@Override
	public SExpr eval() {
		SExpr x = Context.get(this);
		if(x==null) throw new LispException("variable indéfinie");
		return x;
	}

}


