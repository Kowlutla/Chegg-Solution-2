package cmo.chegg.sortlist;

public final class UCalculator {
	
	// Private constructor to prevent instantiation
    private UCalculator() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * convert all non-static methods into static
     */
    public static double sum(double x,double y)
    {
    	return x+y;
    }
	
    public static double sub(double x,double y)
    {
    	return x-y;
    }
}
