/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Sweet.Cakee
 */
public class turunan extends induk {
    public void test (String s){
        System.out.println("Method overload di kelas turunan");
        System.out.println("S:\""+s+"\"");
    }
    public void test (){
    System.out.println("Method override di kelas turunannn");
    }
}
