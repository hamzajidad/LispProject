package jus.aoo.Lisp.kernel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TopLevel extends Subr {
	
	private void initializePrimitive(){
		try{
			InputStream ips=new FileInputStream("ContextPrimitive.txt"); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				int i =0;
				String symboleS = "";
				String primitiveS = "";
				while(ligne.charAt(i) != ' '){
					symboleS += ligne.charAt(i);
					i++;
				}
				Symbole symbole = new Symbole(symboleS);
				i++;
				while(i != ligne.length()){
					primitiveS += ligne.charAt(i);
					i++;
				}
				@SuppressWarnings("rawtypes")
				Class primitiveC = Class.forName(primitiveS);
				SExpr primitive = (SExpr) primitiveC.newInstance();
				Context.add(symbole, primitive);
			}
			br.close();
			ipsr.close();
			ips.close();
		}catch (Exception e){
			System.out.println(e.toString());
		}
	}
	
	public void start(String file){
		
		initializePrimitive();
		
		try{
			InputStream ips=new FileInputStream(file); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.print("> ");
				try { System.out.println(Reader.read(ligne).eval());
				} catch (LispException e) { System.out.println(e.getMessage());
				} catch (Exception e) { System.out.println("unexpectedException"); e.printStackTrace();
				} finally {}
			}
			br.close();
			ipsr.close();
			ips.close();
		}catch (Exception e){
			System.out.println(e.toString());
		}
	}
}