package tesla.vehicleimplement;

import java.util.ArrayList;
import java.util.Scanner;
import tesla.main.Tesla;
import tesla.vehicleabstract.VehicleAbstract;

public class Truck extends VehicleAbstract{
	public Truck(String modelNo, int vehicleNo, int cost) {
		this.modelNo = modelNo;
		this.vehicleNo = vehicleNo;
		this.cost = cost;
	}
	public Truck() {
		
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
	@Override
	public String toString() {
		return "Truck [modelNo=" + modelNo + ", vehicleNo=" + vehicleNo + ", cost=" + cost + "]";
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

				/*
				 * public void display(){ //static { System.out.println("choose your option");
				 * System.out.println("1:Add vehicle"); System.out.println("2:Delete vehicle");
				 * System.out.println("3:Update vehicle"); System.out.println("4:Find vehicle");
				 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); Truck t2 = new
				 * Truck(); switch(a){ case 1: t2.add(); t2.show(); break; case 2: t2.delete();
				 * t2.show(); break; case 3: t2.update(); t2.show(); break; case 4: t2.find();
				 * t2.show(); break; } }
				 */
	public void add() {
		System.out.println("enter model number");
		Scanner sc = new Scanner(System.in);
		String modelNo = sc.next();
		System.out.println("enter vehicle number");
		int vehicleNo = sc.nextInt();
		System.out.println("enter cost");
		int cost = sc.nextInt();
		Truck truck = new Truck(modelNo, vehicleNo, cost);
		Tesla.list_arr.add(truck);
	}


}
