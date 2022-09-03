import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		FoodCourt fc = new FoodCourt();
		
		System.out.println("-----------------------------------");
		System.out.println("Welcome to yummy food court");
		System.out.println("-----------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant Food Item Management");
			System.out.println("\t4. Food Item Quantity add-sell");
			System.out.println("\t5. Exit");
			System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
				// Employee Management
				switch(choice)
				{	
				case 1:
					System.out.println("---------------------------------");
					System.out.println("You Choose Employee Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search An Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
					
					switch(option1)
					{
						case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(fc.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(fc.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
							
						case 3:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = fc.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
							break;
							
						case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							fc.showAllEmployees();
							
							break;
						
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							
							
							break;
							
						default:
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
						
					}
					
					break;
			
			
			
			// Restaurant Management
			
				case 2: 
					System.out.println("---------------------------------");
					System.out.println("You Choose Restaurant  Management");
					System.out.println("---------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove Existing Restaurant");
					System.out.println("\t3. Search A Restaurant");
					System.out.println("\t4. Show All Restaurants");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert A Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant RID: ");
							String rid = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid);
							r1.setName(name);
							
							if(fc.insertRestaurant(r1)){
								System.out.println("Restaurant Inserted with RID: "+r1.getRid());
							}
							else{System.out.println("Restaurant can not be inserted");}
							
							break;
							
						case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove A Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter restaurant ID to Remove: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								if(fc.removeRestaurant(r2)){ 
								System.out.println("Restaurant Removed with ID: "+r2.getRid());
								}
								
								else{System.out.println("Restaurant Can Not be Removed......");}
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							break;
							
						case 3:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search a Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant RID: ");
							String rid3 = sc.next();
							
							Restaurant r3 = fc.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								System.out.println("Restaurant Found");
								System.out.println("Restaurant Name: "+r3.getName());
								System.out.println("Restaurant RID: "+r3.getRid());
								r3.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							
							
							break;
							
							
						case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Restaurant");
							System.out.println("---------------------------------");
							
							fc.showAllRestaurants();
							break;
							
							
						case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
							break;
							
						default:
							System.out.println("Invalid Option............");
							break;
					}
					
					break;
					/* 
					 Restaurant FoodItem Management: starts from here 
					
					*/
				}

		}
	}
}

	

