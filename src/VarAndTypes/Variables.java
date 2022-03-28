package VarAndTypes;

public class Variables {
	
	public void makeString() {
		StringBuilder stringBuilder = new StringBuilder();
		
		String a = "Marcus";
		String b = "Lima";
		String c = "Witthoeft";
		String d = "e";
		String e = "tenho";
		int f = 40;
		String g = "anos";
		
		StringBuilder phrase = stringBuilder
				.append(a)
				.append(" ")
				.append(b)
				.append(" ")
				.append(c)
				.append(" ")
				.append(d)
				.append(" ")
				.append(e)
				.append(" ")
				.append(f)
				.append(" ")
				.append(g)
				.append(".");
		
		System.out.println(phrase);
	}
}
