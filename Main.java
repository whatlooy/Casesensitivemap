package POJO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CasesensitiveMap mp=new CasesensitiveMap();
		mp.put("A", "PUNEET");
		mp.put("c", "bhanu");
		mp.put("a", "puneet");
		System.out.println(mp);
		System.out.println(mp.containsKey("A"));
	}

}
