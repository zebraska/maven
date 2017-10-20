package org.iut.nantes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculette c = new Calculette();
        
        System.out.print("2.5 + 9.87 = ");
        System.out.print(c.additionDouble(2.5, 9.87));
    }
}
