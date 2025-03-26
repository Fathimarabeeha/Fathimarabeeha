import java.util.Scanner;
import java.util.Arrays;		//for soring the array if needed

class Binarysearch{
public static void main(String args[]){
int a,i,e;                       //Convert into int
boolean found = false; 		//Use a bolean variable for clarity
Scanner sc = new Scanner(System.in);	 //short scanner name in system

//Input number of elements
System.out.println("Enter the number of elements in array :");
a=sc.nextInt();

int[] ar = new int[a]; 	//Declare and initialize the array

//input element to be searched
System.out.println("Enter the elementsof the array:");
for(i=0;i<a;i++){
ar[i] = sc.nextInt();
}

//Sorting the array before performing binary search
Arrays.sort(ar);

//Input element to be searched
System.out.println("Enter the element to be searched:");
e = sc.nextInt();

//Performing binary search
int left = 0;
int right = a - 1;

while (left <= right){
int mid = left + (right - left) / 2; 	//calculate middle index

//check if the element is presetnt at mid
if (ar[mid] == e){
found = true;
break;
}

//Element is greater than , ignore the left half
else{
right =mid - 1;
}
}

// output the result 
if (found){
System.out.println("Enter is not found");
}else{
System.out.println("Enter is found");
}

sc.close();
}
}


