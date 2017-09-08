/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Sweet.Cakee
 */
public class gajah extends hewan {
    public static void testclassmethod(){
    System.out.println("Class method di dalam hewan adalah ...");
}
    
    public void testinstancemethod(){
    System.out.println("Instansi method di dalam hewan adalah ...");
    }
    
    public static void main (String[] args)
    {
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testclassmethod();
        myhewan.testinstancemethod();
    }
}
