package helloworldapp;

import java.util.Arrays;

public class Tableaux {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int [][] matrice = {{10,2,5},

		};
		int [] tab1 = {15,-2,28,-25,70,2,-70};
		
		Tableaux.afficherTableau(tab1);
		Tableaux.sort(tab1);
		System.out.println();
		Tableaux.afficherTableau(tab1);
		Arrays.sort(tab1);
		System.out.println();
		Tableaux.afficherTableau(tab1);
		  int tab[] = { 1 , 5 , 4 , 2 , 3 } ;   
		  int pos ;   
		  Arrays.sort ( tab ) ;   
		  Tableaux.afficherTableau(tab);
		  pos = Arrays.binarySearch ( tab , 3 ) ;
		  System.out.println();
		  System.out.println ( "pos " + pos ) ;   
		  Arrays.fill ( tab , 0 ) ;   
		 Tableaux.afficherTableau(tab);
		
		
		long endTime= System.nanoTime();
		long totalTime = endTime-startTime;
		System.out.println();
		System.out.println(totalTime +" en ns");
		System.out.println((double) totalTime/1000+"ms");
	}
	public static void parcourir(int [][] matrice) {
		for(int i =0;i<matrice.length;i++) {
			for(int j=0;j<matrice.length;j++) {
				System.out.print(matrice[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static int[] sort(int [] tab) {
		int tmp=0;
		for(int i=0;i<tab.length;i++) {
			for(int j=(i+1);j<tab.length;j++) {
				if(tab[i]>tab[j]) {
					tmp=tab[i];
					tab[i]=tab[j];
					tab[j]=tmp;
				}
			}
		}
		return tab;
	}
	public static void afficherTableau(int [] tab) {
		for(int i =0;i<tab.length-1;i++) {
			System.out.print(tab[i]+",");
		}
		System.out.print(tab[tab.length-1]+"");
		
	}


}
