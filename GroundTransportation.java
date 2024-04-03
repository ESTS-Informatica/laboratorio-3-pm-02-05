
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static final double groundFees=0.03;
    
    public GroundTransportation(String licensePlate){
        super();
        this.licensePlate=licensePlate;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate=licensePlate;
    }
    
}
