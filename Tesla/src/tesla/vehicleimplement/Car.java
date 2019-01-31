package tesla.vehicleimplement;

import tesla.global.*;

import java.util.*;

import tesla.vehicleabstract.VehicleAbstract;

public class Car extends VehicleAbstract{
	
	public Car(String modelNo, int vehicleNo, int cost) {
		this.modelNo = modelNo;
		this.vehicleNo = vehicleNo;
		this.cost = cost;
	}
	public Car() {
		
	}
	public int getVehicleNo() {
		return vehicleNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public int getCost(){
		return cost;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	

				@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", vehicleNo=" + vehicleNo + ", cost=" + cost + "]";
	}
	/*
				 * public void display(){ //{ System.out.println("choose your option");
				 * System.out.println("1:Add vehicle"); System.out.println("2:Delete vehicle");
				 * System.out.println("3:Update vehicle"); System.out.println("4:Find vehicle");
				 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); Car c2 = new
				 * Car(); switch(a){ case 1: c2.add(); c2.show(); break; case 2: c2.delete();
				 * c2.show(); break; case 3: c2.update(); c2.show(); break; case 4: c2.find();
				 * c2.show(); break; } }
				 */
	public void add() {
		System.out.println("enter model number");
		Scanner sc = new Scanner(System.in);
		String modelNo = sc.next();
		System.out.println("enter vehicle number");
		Scanner sc1 = new Scanner(System.in);
		int vehicleNo = sc1.nextInt();
		System.out.println("enter cost");
		Scanner sc2 = new Scanner(System.in);
		int cost = sc2.nextInt();
		Car car = new Car(modelNo, vehicleNo, cost);
		ArrayList list_arr = Global.getInstance();
		list_arr.add(car);
		//System.out.println("vehicleno");
		//System.out.println(list_arr.get(0));
	}
	
}
