package Br_21_end;

public class Br22_FOReach_Schleife {
//Wird nur bei Array eingesetzt
	public static void main(String[] args) {
		
    int[] x = new int[10];
    for (int i = 1; i < x.length;i++) {
	x[i] = i;//Soll in jeden Array Index (Feld) den wert vom Index also i[0] = 0, i[1] = 1 eingespeichert werden
    }
    for (int j : x) {//Foreach-Schleife = liest jedes x Feld aus dem Array aus und speichert dies in j
    	System.out.println(j);
    }
	}

}
