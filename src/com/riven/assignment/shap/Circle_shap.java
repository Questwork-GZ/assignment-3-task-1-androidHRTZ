package com.riven.assignment.shap;

public class Circle_shap extends Base_shap{
	
	public String Name;
	public static final double T=3.14;
	
    public double radius;
     
    public Circle_shap(double radius,String Name){
    	 this.radius=radius;
    	 this.Name=Name;
     }
     
    public void outPut(){
    	 System.out.println("Area of "+Name+": "+T*radius*radius);
     }
}
