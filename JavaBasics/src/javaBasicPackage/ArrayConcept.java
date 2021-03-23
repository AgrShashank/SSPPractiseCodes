package javaBasicPackage;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array is used to store similar data type values in a array variable.

		// 1. integer array:
		// lowest bound/index =0
		// upper bound/index = 3
		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);

		System.out.println(i.length); // Size or Length of array

		// print all the values of array : use for Loop for this
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// //2. Double Array:
		double d[] = new double[3];
		d[0] = 12.11;
		d[1] = 13.22;
		// d[2] = 14.22;
		//
		System.out.println(d[2]);

		// char c[] = new char[4];
		// c[0]='e';
		// c[1]=2;
		// c[2]='!';
		//
		// System.out.println(c[5]);

		String s[] = new String[5];
		s[0] = "Ster";
		s[1] = "Des";
		s[2] = "Caesar";

		System.out.println(s[3]);
		
		
		// Object Class usage 
		Object obj[] = new Object[5];
		obj[0] = "Tom";
		obj[1] = 25;
		obj[2] = "8527278962";
		obj[3] = "1/1/1990";
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[4]);
	}
}

/*
 * Advantages of Array: I can store multiple values in a single variable with a
 * similar data type.
 * 
 * Disadvantages of Array: -- In future if the number of variables increase,
 * then i will have to come to code and update the size of the array to
 * accommodate the increased values.
 * 
 * -- Only similar data type variables can be stored in it.
 * 
 * 1. To overcome the size problem we use Collections like ArrayList, HashTable - - - - Dynamic Array Concept 
 * 2. To overcome the similar data types problem we use Object array concept.
 */
