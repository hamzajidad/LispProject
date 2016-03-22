package jus.aoo.Lisp.kernel;

import java.util.HashMap;
import java.util.Map;

public class Symbole extends Atome {
	private static Map<String,Symbole> symboles = new HashMap<>();
	public static Symbole newSymbole(String s){
		if(symboles.containsKey(s)) return symboles.get(s);
		Symbole x = new Symbole(s);
		symboles.put(s, x);
		return x;
	}

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


