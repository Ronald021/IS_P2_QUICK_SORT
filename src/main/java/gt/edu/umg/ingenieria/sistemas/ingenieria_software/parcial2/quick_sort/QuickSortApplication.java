package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort.service.QuickSortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class QuickSortApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickSortApplication.class, args);

		QuickSortService quickSortService = new QuickSortService();
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese la cantidad de nombres que desea ordenar: ");
		int n=sc.nextInt();
		String[] sarray=new String[n];

		for(int i=0;i<n;i++){
			System.out.print("Ingrese el nombre "+(i+1)+": ");
			sarray[i]=sc.next();
		}
		System.out.println("Los nombres ordenados son: ");
		quickSortService.quicksort(sarray, 0, sarray.length - 1);
		quickSortService.printArray(sarray);
	}

}
