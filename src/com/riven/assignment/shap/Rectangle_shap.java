package com.riven.assignment.shap;

public class Rectangle_shap extends Base_shap{
       
       private String Name;
       private double Rlength;
       private double Rwidth;
       
       public Rectangle_shap(double Rlength,double Rwidth,String Name){
    	   this.Rlength=Rlength;
    	   this.Rwidth=Rwidth;
    	   this.Name=Name;
       }
       
       public void outPut(){
    	   System.out.println("Area of "+Name+": "+Rlength*Rwidth);
       }
}
