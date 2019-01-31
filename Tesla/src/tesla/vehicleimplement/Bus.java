package tesla.vehicleimplement;

import java.util.ArrayList;
import java.util.Scanner;

import tesla.global.Global;
import tesla.vehicleabstract.VehicleAbstract;

public class Bus extends VehicleAbstract {
	public Bus(String modelNo, int vehicleNo, int cost) {
		this.modelNo = modelNo;
		this.vehicleNo = vehicleNo;
		this.cost = cost;
	}
	public Bus() {
		
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

				/*
				 * public void display(){ //static { System.out.println("choose your option");
				 * System.out.println("1:Add vehicle"); System.out.println("2:Delete vehicle");
				 * System.out.println("3:Update vehicle"); System.out.println("4:Find vehicle");
				 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); Bus b2 = new
				 * Bus(); switch(a){ case 1: b2.add(); b2.show(); break; case 2: b2.delete();
				 * b2.show(); break; case 3: b2.update(); b2.show(); break; case 4: b2.find();
				 * b2.show(); break; } }
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
		Bus bus = new Bus(modelNo, vehicleNo, cost);
		ArrayList list_arr = Global.getInstance();
		list_arr.add(bus);
	}


}
