package Construction;
/**
 * calculates construction cost
 * @author raghu
 *
 */
public class ConstructionCost { 
	public int calculateCost(String material, double area, String fullautomated) {
		/**
		 * calculates cost based on area and type of material used
		 */
		if(material.equals("high standard materials") && fullautomated.equals("Fully Automated Home")) return (int)(area * 2500);
		else if(material.equals("standard materials")) return (int) (area * 1200);
		else if(material.equals("above high standards")) return (int) (area * 1500);
		else if(material.equals("high standard materials")) return (int) (area * 1800);
		else return 0;
	}
	
}
