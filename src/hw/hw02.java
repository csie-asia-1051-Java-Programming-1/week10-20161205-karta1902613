package hw;
/*
 * Topic: 輸有一種坊間常見的遊戲稱為 "18 啦 "~ 玩法介紹 : 由四個骰子來擲，只要其中任兩個是相同點，才開始計算點數，
 *        點數即為另兩個點數相加，若另兩個也一樣，則取較 大的一組相加，另外有下列幾種特殊情況: 
 *        擲出 4 顆骰子點數均相同，稱為通殺 !
 *        任三顆點數相同或四顆點數均不相同，即為無意義 ! 請寫一程式，各別輸入四顆骰子點數，判斷結果 ! 
 * Date: 2016/12/05
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int A=scn.nextInt();
		int B=scn.nextInt();
		int C=scn.nextInt();
		int D=scn.nextInt();
		if(A>0&&A<=6&&B>0&&B<=6&&C>0&&C<=6&&D>0&&D<=6){ 
		if(A==B&&B==C&&C==D){
			System.out.println("通殺");
		}else if(A==B&&A==C&&A!=D){
			System.out.println("Ｒ");
		}else if(A==B&&A!=C&&A==D){
			System.out.println("Ｒ");
		}else if(A!=B&&A==C&&A==D){
			System.out.println("Ｒ");
		}else if(B==C&&B==D&&B!=A){
			System.out.println("Ｒ");
		}else if(A==B&&C==D){
			if(A>D){
				System.out.println(A*2);
			}else{
				System.out.println(D*2);
			}
	    }else if(A==C&&B==D){
	    	if(A>B){
	    		System.out.println(A*2);
	    	}else{
	    		System.out.println(B*2);
	    	}
	    }else if(A==D&&B==C){
	    	if(A>B){
	    		System.out.println(A*2);
	    	}else{
	    		System.out.println(B*2);
	    	}
	    }else if(A==B&&C!=D&&C!=A){
	    	System.out.println(A*2);
	    }else if(A==C&&C!=D&&C!=B){
	    	System.out.println(A*2);
	    }else if(A==D&&C!=B&&C!=A){
	    	System.out.println(A*2);
	    }else if(B==C&&C!=A&&D!=A){
	    	System.out.println(B*2);
	    }else if(B==D&&A!=D&&A!=C){
	    	System.out.println(B*2);
	    }else if(C==D&&C!=A&&A!=B){
	    	System.out.println(C*2);
	    }else if(A!=B&&B!=C&&C!=D&&A!=D){
	    	System.out.println("Ｒ");
	    }
		
		}else{
			System.out.println("請輸入1~6");
		}
		
	}
}
