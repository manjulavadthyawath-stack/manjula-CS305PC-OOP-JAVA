class Lab1P1{
	public static void main(String...args){
		byte b= 15;
		Byte bb=b;
		//int x=200;
		//byte b=(byte)x;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(bb.MIN_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.TYPE);
	        System.out.println(Byte.BYTES);
	        System.out.println(".........short.....");
	        short s=12;
	        Short ss=s;
	        
	        System.out.println(Short.MAX_VALUE);
		System.out.println(ss.MIN_VALUE);
		System.out.println(ss.SIZE);
		System.out.println(ss.TYPE);
	        System.out.println(ss.BYTES);
	        System.out.println(".........integer.....");
	        
	        int i=13;
	        Integer ii=i;
	        System.out.println(Integer.MAX_VALUE);
		System.out.println(ii.MIN_VALUE);
		System.out.println(ii.SIZE);
		System.out.println(ii.TYPE);
	        System.out.println(ii.BYTES);
	        
	        double d=13;
	        Double dd=(double)i;
	        System.out.println(Double.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(dd.SIZE);
		System.out.println(dd.TYPE);
	        System.out.println(dd.BYTES);
	        
	}

}