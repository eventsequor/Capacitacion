package com.sophos.Nivel1.Capacitacion;

public class PruebaCodillity {

	public static void main(String[] args) {
		String requestBody = "{\n" +
	            "  \"id\": 1,\n" +
	            "  \"author\": \"John Smith\",\n" +
	            "  \"title\": \"Reliability of late night deployments\" \n}";
		System.out.println(requestBody);
		int[] A = { -3, -7, -2, -785, -200, 3, 4, -851, -6478 };
		int number = numberSmall(A);
		while (arrayContainNumber(A, number)) {
			number++;
		}
		System.out.println(number);
		
	}

	public static boolean arrayContainNumber(int[] A, int number) {
		for (int subValueX : A) {
			if (number == subValueX) {
				return true;
			}
		}
		return false;
	}

	public static int numberSmall(int[] A) {
		int pivo = Integer.MAX_VALUE;
		for (int subValue : A) {
			if (subValue < pivo && subValue > 0) {
				pivo = subValue;
			}
		}
		if (pivo == Integer.MAX_VALUE) {
			return 1;
		} else {
			return pivo;
		}
	}

	

}
