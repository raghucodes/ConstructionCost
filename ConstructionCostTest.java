package Construction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionCostTest {

	@Test
	void calculateCosttest() {
		ConstructionCost cost = new ConstructionCost();
		assertEquals(3750000,cost.calculateCost("high standard materials",1500,"Fully Automated Home"));
		assertEquals(1800000,cost.calculateCost("standard materials",1500,"Not Fully Automated Home"));
		assertEquals(2250000,cost.calculateCost("above high standards",1500,"Not Fully Automated Home"));
		assertEquals(2700000,cost.calculateCost("high standard materials",1500,"Not Fully Automated Home"));
		
	}

}
