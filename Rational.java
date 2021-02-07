/** This is a class that describes a rational number (e.g., 2/3 or 7 as in 7/1)
    @author Jillian Morgan
 */

public class Rational{
    //attributes
    private int num;
    private int den;
    //could also be on a single line as private int num, den
    
    //getters & setters
    //getters
    //public attributeType getAttributeName()
    public int getNum(){
        return num; //return value of attribute
    }
    public int getDen(){
        return den;
    }
    /*this is a 
    multi line comment
    */
    //setters
    public void setNum(int num){
        this.num = num; //using this keyword to explicitly state which "num" variable is attribute
    }
    public void setDen(int denominator){
        den = denominator;
    }
    
    public Rational(){ //no-args constructor
        num = 0;
        den = 1;
    }
    
    public Rational(int num, int den){
        this.num = num;
        this.den = den; //or this.den = setDen(den);
    }
    
    /** Reverses the <code>Rational</code> number.
        For example, 2/3 becomes -2/3
     */
    public void negate(){
        num = -num;
    }
    
    public void invert(){
        int helper = num;
        num = den;
        den = helper;
    }
}