import java.util.Array;
import java.util.Scanner;
class Stringarray
{
void userdefine(String str[],int length);
{
int i,j;
String temp;
for(i=0;i<length;i++)
{
for(j=0;j<length;j++)
{
if(str[i].compareTo(str[j]>0){
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("sorted using user-defined method:" + Array.toString(str));
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Choose a sorting method:");
System.out.println("1. Built-in Method (Arrays.sort)");
System.out.println("2. User-defined Method (Bubble Sort)");
System.out.print("Enter your choice (1 or 2): ");
int choice = sc.nextInt();

sc.nextLine(); 

System.out.print("Enter the number of strings: ");
int n = sc.nextInt();
sc.nextLine(); 

String[] str = new String[n];

System.out.println("Enter " + n + " strings:");
for (int i = 0; i < n; i++) {
str[i] = sc.nextLine();

String[] str = new String[n];

System.out.println("Enter " + n + " strings:");
for (int i = 0; i < n; i++) {
str[i] = sc.nextLine();
}

for (int i = 1; i <= 2; i++) {
if (i == choice) {

String result = "";
if (i == 1) {
Arrays.sort(str); 
result = Arrays.toString(str);
} else {
userDefineSort(str, n); 
result = Arrays.toString(str);
}
System.out.println("Sorted: " + result);
break; 
}
}
sc.close();
}
}

