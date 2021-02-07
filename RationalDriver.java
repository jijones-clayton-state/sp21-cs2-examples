public class RationalDriver{
    public static void main(String[] args){
        //create instances of Rational class
        Rational num1 = new Rational();
        // int num = num1.getNum(); //getNum returns an int, so could also store in int variable
        System.out.println(num1.getNum() + "/" + num1.getDen());
        num1.setNum(2); //calling the setNum method from the Rational class
        num1.setDen(7);
        System.out.println(num1.getNum() + "/" + num1.getDen());
        
        Rational someValue = new Rational(6, 8);
        System.out.println(someValue.getNum() + "/" + someValue.getDen());
        someValue.negate(); //method call
        System.out.println(someValue.getNum() + "/" + someValue.getDen());
        
        num1.invert();
        System.out.println(num1.getNum() + "/" + num1.getDen());   
    }
}