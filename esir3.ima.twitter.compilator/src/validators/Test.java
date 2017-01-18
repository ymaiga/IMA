package validators;

public class Test {
	
	public String test() throws IMATweetException{
		if(1==1) throw new IMATweetException("cycle");
		return "";
	}

//	public static void main(String[] args) throws IMATweetException {
//		// TODO Auto-generated method stub
//		System.out.println((new Test()).test());
//	}
	

}
