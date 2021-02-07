package adapterpattern;

import static org.junit.Assert.*;				
import org.junit.Test;		

public class whenConvertingMPHToKMPH_thenSuccessfullyConverted
{
@Test 
public void test1() 
{ 
	Movable bugattiVeyron = new BugattiVeyron(); 
	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
	assertEquals(bugattiVeyronAdapter.getSpeed(),431.30312,0.00001);
}
}