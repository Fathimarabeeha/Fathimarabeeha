import java.util.Scanner;
class Employee
{

 int eno,salary;
 string ename;
 Employee(int no,string name,int salary)
 {
   eno=no;
   ename=name; 
   salary=salary;
  }

void displayEmployeeDetails()
{
  System.out.println("\n Employee no:"+eno);
  System.out.println("\n Employee name:"+ename);
  System.out.println("\n Employee no:"+eno);
}
}
class employe
{
 public static void main(string arg[])
 {
  int n,i,result=1,eno,ename,salary,enumber;
  string name;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of employees:");
  n=sc.nextInt();
  Employee obj[]=new Employee[n];
  for(i=0;i<n;i++)
  {
   System.out.println("Enter employee no:");
   eno=sc.nextInt();
   System.out.println("Enter employee name:");
   ename=sc.next();
   Sysrem.out.println("Enter employee salary:");
   salary=sc.nextInt;
   
   obj[i]=new Employee(eno,salary,ename);
  }
 System.out.println("\n Employee Details:");
 for(i=0;i<n;i++)
 { 
  obj[i].display();
 }
 System.out.println("Enter the employee number to be searched:");
 enumber=sc.nextInt();
 for(i=0;i<n;i++)
 {
  if(obj[i].eno==enumber)
  { 
   result=1;
   obj[i].display();
   break;
  }
  else
  {
  result=0;
  }
 }
 if(result==0)
  {
   System.out.println("not found");
  }
 }
}    
   
   
   
   
