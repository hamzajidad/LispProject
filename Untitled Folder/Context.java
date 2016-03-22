package jus.aoo.Lisp.kernel;

import java.util.Map;

public class Context {
	
	static private Map<Symbole,SExpr> map;
	
	private Context(){}
	
	public static void add(Symbole key, SExpr value){
		map.put(key, value);
	}
	public static SExpr get(Symbole key){
		return map.get(key);
	}

}
