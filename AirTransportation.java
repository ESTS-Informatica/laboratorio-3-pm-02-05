
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double airFees=0.04;

    public AirTransportation(String name, int numberOfContainers){
        super();
        this.name=name;
        this.numberOfContainers=numberOfContainers;
    }
    
    
}
