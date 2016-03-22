package jus.aoo.Lisp.kernel;

public interface SExpr {
	
			public boolean isAtom(); 

			public boolean isList();
		  
			public boolean isNil();

			public String toString();
			
			public void eval() ;

}
