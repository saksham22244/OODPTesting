package workshop4testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void sum() {
		Calc calc=new Calc();
			 assertEquals(10,calc.sum(5,5));
			 System.out.println("It pass test");
			
		}

				
	}
	