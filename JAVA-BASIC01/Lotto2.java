
public class Lotto2 {

	public static void main(String[] args) {
	
		  int lotto[] = new int[7];
	        int lottoBouns=(int)((Math.random() * 45) + 1);
	  

	        for (int i = 0; i < 7; i++) {
	            lotto[i] = (int)((Math.random() * 45) + 1);

	            // �ߺ� ��ȣ ����
	            for (int j = 0; j < i; j++) {
	                if (lotto[i] == lotto[j]) {
	                    i--;
	                    break;
	                }
	            }
	        }
	        for(int a=0; a<lotto.length-1; a++) {
	            for(int j=0; j<lotto.length-1-a; j++) {
	                if (lotto[j] >= lotto[j + 1]) {
	                    int temp = lotto[j];
	                    lotto[j] = lotto[j + 1];
	                    lotto[j + 1] = temp;
	                }
	            }
	        }
	        //System.out.print(game+"����=");
	        for (int i = 0; i < lotto.length-1; i++) {
	            System.out.print(lotto[i] + ",");
	        }
	        System.out.println("bonus=" + lotto[6]);

	        System.out.println("��� �Ͻðڽ��ϱ�?[1.��,2.�ƴϿ�]");
	    }
	}

