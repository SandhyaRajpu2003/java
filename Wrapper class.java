// Java program to demonstrate wrapper class.

class wrapper{
	public static void main(String []args){
		byte b=10;
		short s=20;
		int i=30;
		long l=50;
		boolean b1=true;
		char c='k';
		float f=2.5f;
		double d=60.0D;
//Autoboxing coverting into primitive datatype

        Byte bytobj=b;
        Short shortobj=s;
        Integer integerobj=i;
        Long longobj=l;
        Boolean booleanobj=b1;
        Character charobj=c;
        Float floatobj=f;
        Double doubleobj=d;

//printing objects
        System.out.println("------Printing object values-------");
        System.out.println("Byte object :-"+bytobj);
        System.out.println("Short object :-"+shortobj);
        System.out.println("Integer object :-"+integerobj);
        System.out.println("Long object :-"+longobj);
        System.out.println("Boolean object :-"+booleanobj);
        System.out.println("Character object :-"+charobj);
        System.out.println("Float object :-"+floatobj);
        System.out.println("Double object :-"+doubleobj);
        System.out.println("---------------------------------------------------------------------");

 //unboxing converting object to primitive
        byte bytevalue = bytobj;
        short shortvalue = shortobj;
        int intvalue = integerobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean booleanvalue = booleanobj;

 //printing primitive
        System.out.println("------Printing primitive values-------");
        System.out.println("bytevalue :-"+bytevalue);
        System.out.println("shortvalue :-"+shortvalue);
        System.out.println("intvalue :-"+intvalue);
        System.out.println("longvalue :-"+longvalue);
        System.out.println("floatvalue :-"+floatvalue);
        System.out.println("doublevalue :-"+doublevalue);
        System.out.println("charvalue :-"+charvalue);
        System.out.println("booleanvalue :-"+booleanvalue);
	}
}
