package ch10;

public class TypeConversion {

	public static void main(String[] args) {
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int) (dNum + fNum);
		int iNum2 = (int)dNum + (int)fNum;
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
		
		
		
		/*
		 * 
		 * int iNum = 255; byte bNum = (byte)iNum;
		 * 
		 * double dNum = 3.14; int inus = (int)dNum;
		 * 
		System.out.println(dNum);
		 */
		
		
		
		int myNum = 10;
		int yourNum =20;
		
		myNum += yourNum;
		
		System.out.println(myNum);
	}

}
