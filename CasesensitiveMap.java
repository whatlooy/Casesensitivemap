package POJO;

import java.util.HashMap;

public class CasesensitiveMap extends HashMap<String,Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public Object put(String key,Object value) {
		
		return super.put(key.toLowerCase(), value);
		
	}
	public Object get(String key) {
		return super.get(key.toLowerCase());
	}
	public boolean containsKey(String key) {
		return super.containsKey(key.toLowerCase());
	}
	public void putAll(HashMap<String ,String> mp) {
		 mp.forEach((k,v)->put(k,v));
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
	
	

