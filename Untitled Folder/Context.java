package jus.aoo.Lisp.kernel;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Context {
	
	static private Map<SExpr,List<SExpr>> context;
	
	private Context(){}
	
	public static void add(SExpr key, SExpr value){
		if(!(context.containsKey(key))){
			context.put(key, new ArrayList<>());
			
		}
		context.get(key).add(0, value);
	}
	
	public static SExpr get(SExpr key){
		return context.get(key).get(0);
	}
	
	public static void remove(SExpr key){
		context.remove(key);
	}
	
	public static void removeVal(SExpr key){
		context.get(key).remove(0);
		if(context.get(key).isEmpty()){
			remove(key);
		}
	}
	
	public static void bind(SExpr keyList, SExpr valueList){
		if (keyList.isNil() && valueList.isNil()){}
		else if(keyList.isAtom() && valueList.isAtom()){
			add(keyList,valueList);
		}
		else if(keyList.isList() && valueList.isList()){
			bind(keyList.car(),valueList.car());
			bind(keyList.cdr(),valueList.cdr());
		}
		else{
			throw new LispException("Les parametres donnes ne correspondent pas a ceux de la fonction");
		}
	}
	
	public static void unBind(SExpr keyList){
		if (keyList.isNil()){}
		else if(keyList.isAtom()){
			removeVal(keyList);
		}
		else if(keyList.isList()){
			unBind(keyList.car());
			unBind(keyList.cdr());
		}
	}
}
