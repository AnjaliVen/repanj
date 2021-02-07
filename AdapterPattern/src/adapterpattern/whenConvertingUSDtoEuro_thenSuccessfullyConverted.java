package adapterpattern;

import static org.junit.Assert.*;				
import org.junit.Test;		

public class whenConvertingUSDtoEuro_thenSuccessfullyConverted
{
@Test 
public void test2() 
{ 
	Movable bugattiVeyron = new BugattiVeyron(); 
	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
	assertEquals(bugattiVeyronAdapter.getPrice(),1660000.0,0.00001);
}
}