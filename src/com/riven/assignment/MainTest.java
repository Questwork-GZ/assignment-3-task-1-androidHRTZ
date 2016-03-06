package com.riven.assignment;


import com.riven.assignment.shap.Base_shap;
import com.riven.assignment.shap.Circle_shap;
import com.riven.assignment.shap.Square_shap;
import com.riven.assignment.shap.Triangle_shap;

public class MainTest {
	
    private final static double data=2.0;
	
	public static final String sName="square";
	public static final String cName="circle";
	public static final String tName="triangle";
	public static final String rName="rectangle"; 
	
	
     public static void main(String[] arg0){
    	Base_shap sShap=new Square_shap(data,sName);
    	Base_shap rShap=new Square_shap(data,rName);
    	Base_shap cShap=new Circle_shap(data,cName);
    	Base_shap tShap=new Triangle_shap(data, data,tName);
    	
    	sShap.outPut();
    	rShap.outPut();
    	cShap.outPut();
    	tShap.outPut();
     }
}
