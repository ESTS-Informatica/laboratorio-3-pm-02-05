
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(int packages, String licensePlate){
        super(licensePlate);
        this.packages=packages;
    }
    
    public int getPackages(){
        return packages;
    }

    public void setPackages(int packages){
        this.packages=packages;
    }
    
    
}
