package hw;
/*
 * Topic: �馳�@�ا{���`�����C���٬� "18 �� "~ ���k���� : �ѥ|�ӻ�l���Y�A�u�n�䤤����ӬO�ۦP�I�A�~�}�l�p���I�ơA
 *        �I�ƧY���t����I�Ƭۥ[�A�Y�t��Ӥ]�@�ˡA�h���� �j���@�լۥ[�A�t�~���U�C�X�دS���p: 
 *        �Y�X 4 ����l�I�Ƨ��ۦP�A�٬��q�� !
 *        ���T���I�ƬۦP�Υ|���I�Ƨ����ۦP�A�Y���L�N�q ! �мg�@�{���A�U�O��J�|����l�I�ơA�P�_���G ! 
 * Date: 2016/12/05
 * Author: 105021043 �B�ͤ�
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
			System.out.println("�q��");
		}else if(A==B&&A==C&&A!=D){
			System.out.println("��");
		}else if(A==B&&A!=C&&A==D){
			System.out.println("��");
		}else if(A!=B&&A==C&&A==D){
			System.out.println("��");
		}else if(B==C&&B==D&&B!=A){
			System.out.println("��");
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
	    	System.out.println("��");
	    }
		
		}else{
			System.out.println("�п�J1~6");
		}
		
	}
}
