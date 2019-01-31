package tesla.main;

import java.util.*;

import tesla.vehicleabstract.VehicleAbstract;
import tesla.vehicleimplement.Bus;
import tesla.vehicleimplement.Car;
import tesla.vehicleimplement.Truck;

public class Tesla {
	public static void main(String[] args){
		System.out.println("WELCOME TO TESLA");
		while(true)
		{
			System.out.println("choose your option");
			System.out.println("1:add");
			System.out.println("2:delete");
			System.out.println("3:update");
			System.out.println("4:find");
			System.out.println("5:exit");
			Scanner sc = new Scanner(System.in); 
			int a = sc.nextInt(); 
			switch(a) { 
				case 1:
					choose();
					VehicleAbstract vb = new Car();
					vb.writeFile("C:/Users/vinusha.r/Desktop/JavaPractice/collection1.csv");
					break;
				case 2:
					VehicleAbstract vb1 = new Car();
					vb1.delete();
					vb1.show();
					vb1.writeFile("C:/Users/vinusha.r/Desktop/JavaPractice/collection1.csv");
					break;
				case 3:
					VehicleAbstract vb2 = new Car();
					vb2.update();
					vb2.show();
					vb2.writeFile("C:/Users/vinusha.r/Desktop/JavaPractice/collection1.csv");
					break;
				case 4:
					VehicleAbstract vb3 = new Car();
					vb3.find();
					//vb2.show();
					break;
				case 5:
					System.exit(0);
					
			}
			
				/*
				 * System.out.println("choose your option"); System.out.println("1:Car");
				 * System.out.println("2:Truck"); System.out.println("3:Bus");
				 * System.out.println("4:exit"); Scanner sc = new Scanner(System.in); int a =
				 * sc.nextInt(); switch(a) { case 1: Car c = new Car(); c.display(); break; case
				 * 2: Truck t = new Truck(); t.display(); break; case 3: Bus b = new Bus();
				 * b.display(); break; case 4: System.exit(0); default:
				 * System.out.println("choose valid number"); }
				 */
		}
		
	}
	public static void choose(){
		 System.out.println("choose your option"); 
		 System.out.println("1:Car");
		 System.out.println("2:Truck"); 
		 System.out.println("3:Bus");
		 //System.out.println("4:exit"); 
		 Scanner sc = new Scanner(System.in); 
		 int a =sc.nextInt(); 
		 switch(a) { 
		 	case 1: 
		 		Car c = new Car(); 
		 		c.add();
		 		c.show();
		 		break;
		 	case 2:
		 		Bus b = new Bus();
		 		b.add();
		 		b.show();
		 		break;
		 	case 3:
		 		Truck t = new Truck();
		 		t.add();
		 		t.show();
		 		break;
		 	default:
		 		System.out.println("choose valid option");
		 }
		
		
	}
}
