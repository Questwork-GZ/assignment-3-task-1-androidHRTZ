package com.riven.assignment.shap;

public class Square_shap extends Base_shap{

	private String Name;
	private double i;
	
	public Square_shap(double i,String Name){
		this.i=i;
		this.Name=Name;
	}
	
	public void outPut(){
		System.out.println("Area of "+Name+": "+i*i);
	}
}
