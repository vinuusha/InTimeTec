package tesla.vehicleabstract;

import java.io.*;
import java.util.*;


import tesla.global.Global;
import tesla.vehicle.Vehicle;
import tesla.vehicleimplement.*;

public abstract class VehicleAbstract implements Vehicle {
	public String modelNo;
	public int vehicleNo;
	public int cost;
	public String comma =",";
	public String new_line = "\n";
	public String file_attributes ="modelNo,vehicleNo,cost";
	ArrayList list_arr = Global.getInstance();

	//ListIterator iter = Global.getIterator();
	//ListIterator iterator=list_arr.listIterator();
	
	public abstract void add();

	
	public void delete() {
		System.out.println("enter vehicle number you want to delete");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ListIterator iterator=list_arr.listIterator();
		while (iterator.hasNext()) {
			System.out.println("hello");
			
				/*
				 * Car c = (Car)iter.next(); // ArrayList al = (ArrayList)iter.next(); //
				 * VehicleAbstract s = (VehicleAbstract)iter.next(); if(a == c.getVehicleNo()) {
				 * list_arr.remove(c); System.out.println("vehicle has been removed"); break;
				 */
			//Object c = iter.next();
			VehicleAbstract li = (VehicleAbstract)iterator.next();
			if(li instanceof Car) {
				System.out.println("inside if condition");
				Car c1 = (Car)li;
				System.out.println(c1.getVehicleNo());
				if(a == c1.getVehicleNo()) {
					System.out.println(a);
					System.out.println(c1.getVehicleNo());
					iterator.remove();
					System.out.println("vehicle has been removed");
					break;
				}
			}else if(li instanceof Truck) {
				Truck t = (Truck)li;
				if(a == t.getVehicleNo()) {
					iterator.remove();
					break;
				}
			}else if(li instanceof Bus) {
				Bus b = (Bus)li;
				if(a == b.getVehicleNo()) {
					iterator.remove();
					break;
				}
			}
	
		}
	}

	public void update() {
		System.out.println("enter the vehicle number to update");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ListIterator iterator=list_arr.listIterator();
		
		while (iterator.hasNext()) {
						/*
						 * VehicleAbstract s = (VehicleAbstract)iter.next();
						 * if(a == s.getVehicleNo()) {
						 * System.out.println("enter new vehicle number");
						 * Scanner sc1 = new
						 * Scanner(System.in); 
						 * int a1 = sc1.nextInt();
						 * s.setVehicleNo(a1);
						 * break;
						 */
			VehicleAbstract li = (VehicleAbstract)iterator.next();
			if(li instanceof Car) {
				System.out.println("inside if");
				Car c1 = (Car)li;
				if(a == c1.getVehicleNo()) {
					System.out.println("enter new vehicle number");
					Scanner sc1 = new Scanner(System.in);
					int a1 = sc1.nextInt();
					c1.setVehicleNo(a1);
					break;
				}
			}else if(li instanceof Truck) {
				Truck t1 = (Truck)li;
				if(a == t1.getVehicleNo()) {
					System.out.println("enter new vehicle number");
					Scanner sc1 = new Scanner(System.in);
					int a1 = sc1.nextInt();
					t1.setVehicleNo(a1);
					break;
				}
			}else if(li instanceof Bus) {
				Bus b1 = (Bus)li;
				if(a == b1.getVehicleNo()) {
					System.out.println("enter new vehicle number");
					Scanner sc1 = new Scanner(System.in);
					int a1 = sc1.nextInt();
					b1.setVehicleNo(a1);
					break;
				}
			}
		
			}

		}
		

	
	
	public void find() {
		System.out.println("enter the vehicle number to find");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ListIterator iterator=list_arr.listIterator();		
					/*
					 * for( int i=0;i<list_arr.size();i++) { VehicleAbstract s =
					 * (VehicleAbstract)list_arr.get(i); if(a == s.getVehicleNo()) {
					 * System.out.println("vehicle found"); break; } //s.getVehicleNo();
					 * //System.out.println(list_arr.get(i).getVehicleNo);
					 * System.out.println("vehicle not found"); }
					 */
		while (iterator.hasNext()) {
			VehicleAbstract li = (VehicleAbstract)iterator.next();
						/*
						 * VehicleAbstract s = (VehicleAbstract)iter.next(); if(a == s.getVehicleNo()) {
						 * System.out.println("vehicle found"); break; }
						 */
			if(li instanceof Car) {
				Car c = (Car)li;
				if(a == c.getVehicleNo()) {
					System.out.println("vehicle found");
					System.out.println(c);
					break;
				}
			}else if(li instanceof Truck) {
				Truck t = (Truck)li;
				if(a == t.getVehicleNo()) {
					System.out.println("vehicle found");
					System.out.println(t);
					break;
				}
			}else if(li instanceof Bus) {
				Bus b = (Bus)li;
				if(a == b.getVehicleNo()) {
					System.out.println("vehicle found");
					System.out.println(b);
					break;
				}
			}
			
			
		}
	}
		

	
	public void show() {
		//	while (iter.hasNext()) {
		//	System.out.println("hello");
		//	System.out.println(iter.next());
			
			/*
			 * if(iter.next() instanceof Car) { Car s = (Car)iter.next();
			 * System.out.println(s.getVehicleNo()); }
			 */
			//VehicleAbstract s = (VehicleAbstract)list_arr.get(0);
			//System.out.println(s.getVehicleNo());
			
		for (int i = 0; i < list_arr.size() ; i++) {
			System.out.println(list_arr.get(i));
		}
			
			
			// ArrayList al = (ArrayList)iter.next();
			// System.out.println(al.get(0));
			// System.out.println(list_arr.get(0));
			// System.out.println(list_arr.get(0).vehicleNo);
			//		}

	}
	public void writeFile(String fileName) {
		
		ListIterator iterator=list_arr.listIterator();
		
		FileWriter fw = null;
		try {
		fw = new FileWriter(fileName);
		fw.append(file_attributes);
		//fw.append(new_line);
		fw.append(System.lineSeparator());
		while(iterator.hasNext()) {
		//ListIterator li = (ListIterator)iterator.next();
		VehicleAbstract li = (VehicleAbstract)iterator.next();
		if(li instanceof Car) {
			Car c = (Car)li;
			fw.append(c.getModelNo());
			fw.append(comma);
			fw.append(String.valueOf(c.vehicleNo));
			fw.append(comma);
			fw.append(String.valueOf(c.cost));
			//fw.append(new_line);
			fw.append(System.lineSeparator());
		}else if(li instanceof Truck) {
			Truck t = (Truck)li;
			fw.append(t.getModelNo());
			fw.append(comma);
			fw.append(String.valueOf(t.vehicleNo));
			fw.append(comma);
			fw.append(String.valueOf(t.cost));
			//fw.append(new_line);
			fw.append(System.lineSeparator());
		}else if(li instanceof Bus) {
			Bus b = (Bus)li;
			fw.append(b.getModelNo());
			fw.append(comma);
			fw.append(String.valueOf(b.vehicleNo));
			fw.append(comma);
			fw.append(String.valueOf(b.cost));
			//fw.append(new_line);
			fw.append(System.lineSeparator());
		}
		
			
		}
			/*
			 * for(Player p :(Player)al) {
			 * 
			 * }
			 */
		}
		catch(IOException e) {
			
		}
		finally {
			try {
			fw.flush();
			fw.close();
			}
			catch(IOException e) {
				
			}
		}
		System.out.println("file has been written successfully");
	}
		
	}


