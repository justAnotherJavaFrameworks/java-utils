package de.slfw.calc;

/**
 * 
 * <p>Wandelt Zahlen in verschiedene Zahlensysteme um.</p>
 *
 * @author Alex S.
 */
public class Calculator {


  /**
   * 
   * <p>Wandelt Dezimalzahlen in Bin�rzahlen um. </p>
   * @param dezimal Die �bergebene Dezimalzahllzahl
   * @return Gibt die Bin�rzahl als String zur�ck
   */
	public static String deziToBin(long dezimal)
	{
		String bin = "";
		while(dezimal>0)
		{
			bin = dezimal%2 + bin ;
			dezimal = dezimal / 2;
		}
	    return bin;
	
	}

  
	/**
   * 
   * <p>Wandelt Bin�rzahlen in Dezimalzahlen um.</p>
   * @param bin �bergebene Bin�hrzahl
   * @return Gibt die Dezimalzahl zur�ck
	 */
	public static long binToDezi(String bin)
	{
		long dezimal= 0;
		for(int i=0; i<bin.length(); i++)
		{
			dezimal = dezimal * 2 + Long.parseLong(bin.substring(i,i+1));  //wandelt bin�r zu Dezimalzahl
		}
		return dezimal;
	}


	
}
