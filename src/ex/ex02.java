package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn=new Scanner(System.in);
	    float x =scn.nextInt();
	    float y;
	   
	    if(x>=0&&x<=120){
	    	System.out.println(x*2.1);
	    	System.out.println(x*2.1);
	    }else if(x>120&&x<=330){
	    	y=120;
	    	x=x-y;
	    	System.out.println(x*3.02+y*2.1);
	    	System.out.println(x*2.68+y*2.1);
	    }else if(x>330&&x<=500){
	    	y=210;
	    	x=x-330;
	    	System.out.println(x*4.39+120*2.1+y*3.02);
	    	System.out.println(x*3.61+120*2.1+y*2.68);
	    }else if(x>500&&x<=700){
	    	y=170;
	    	x=x-500;
	    	System.out.println(x*4.97+2.1*120+3.02*210+y*4.39);
	    	System.out.println(x*4.01+2.1*120+2.68*210+y*3.61);
	    }else if(x>=701){
	    	y=200;
	    	x=x-700;
	    	System.out.println(x*5.63+2.1*120+3.02*210+170*4.39+y*4.97);
	    	System.out.println(x*4.50+2.1*120+2.68*210+170*3.61+y*4.01);
	    }else{
	    	System.out.println("請輸入正確的數值");
	    }
	}
}
