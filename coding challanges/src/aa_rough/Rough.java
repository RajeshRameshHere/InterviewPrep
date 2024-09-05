package aa_rough;

public class Rough extends Thread{
	
public void run() {
	System.out.println("this is run");
}
	
public void start() {
	System.out.println("check");
	
}

public static void main(String[] args) throws Exception  {

Rough r=new Rough();
	
	Thread t=new Thread(r);
	t.start();
	r.start();

	}
	
}

	
//	try {
//		System.out.println(5/0);
//	} catch (Exception e) {
//		throw new Exception();
//		// TODO: handle exception
//	}
//finally {
//	System.out.println("printed");
//}

//String a="IND";
//String b="XYZ";
//String c=a+b;
//String d="INDXYZ";
//System.out.println(c==d);//compares object address 
//System.out.println(c.hashCode());
//System.out.println(d.hashCode());
//System.out.println(c.equals(d));// compares string values
//System.out.println(System.identityHashCode(c));
//System.out.println(System.identityHashCode(d));
	


