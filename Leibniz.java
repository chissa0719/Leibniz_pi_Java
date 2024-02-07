import java.util.*;
import java.lang.*;

public class Leibniz {
	
	public double calc(long num){

		//�~����
		double pi_result = 0.0;
		//����
		double operator = 1.0;

		//�v�Z�̈Ӗ����Ȃ��̂�return
		if(num < 1){
			return 0;
		}

		//�v�Z���C��
		for(long i = 0; i < num; i++){
			//�v�Z
			pi_result += operator / (2.0 * (double)i + 1.0);
			//�������]
			operator *= (-1.0);
		}

		return (pi_result * 4.0);
	}
}
