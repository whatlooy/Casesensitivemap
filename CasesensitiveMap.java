package POJO;

import java.util.HashMap;

public class CasesensitiveMap extends HashMap<String,Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key;
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
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
		
	}
}
	
	

