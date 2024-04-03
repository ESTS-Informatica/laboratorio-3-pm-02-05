
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate){
        super(licensePlate);
        this.numberOfPallets=numberOfPallets;
        this.trailers=trailers;
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    public int getTrailers(){
        return trailers;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets=numberOfPallets;
    }
    
    public void setTrailers(int trailers){
        this.trailers=trailers;
    }
}
