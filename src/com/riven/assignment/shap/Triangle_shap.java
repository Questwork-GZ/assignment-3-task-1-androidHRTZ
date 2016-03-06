package com.riven.assignment.shap;

public class Triangle_shap extends Base_shap{
     
	private String Name;
	private double Tbotton;
	private double Theight;
	
	public Triangle_shap(double Tbotton,double Theight,String Name){
		this.Tbotton=Tbotton;
		this.Theight=Theight;
		this.Name=Name;
	}
	
	public void outPut(){
		System.out.println("Area of "+Name+": "+Tbotton*Theight/2);
	}
}
