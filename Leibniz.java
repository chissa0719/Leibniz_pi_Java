import java.util.*;
import java.lang.*;

public class Leibniz {
	
	public double calc(long num){

		//‰~ü—¦
		double pi_result = 0.0;
		//•„†
		double operator = 1.0;

		//ŒvZ‚ÌˆÓ–¡‚ª‚È‚¢‚Ì‚Åreturn
		if(num < 1){
			return 0;
		}

		//ŒvZƒƒCƒ“
		for(long i = 0; i < num; i++){
			//ŒvZ
			pi_result += operator / (2.0 * (double)i + 1.0);
			//•„†”½“]
			operator *= (-1.0);
		}

		return (pi_result * 4.0);
	}
}
