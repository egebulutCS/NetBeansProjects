/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eb431
 */
public class SterlingTest {
    
    private lab1.Sterling s;
    private lab1.Sterling s1;
    private lab1.Sterling s2;
    private lab1.Sterling s3;
    private lab1.Sterling s7;
    private lab1.ShareHolding sh1;
    private lab1.ShareHolding sh2;
    private lab1.ShareHolding sh3;
    private lab1.Portfolio p;
    
    public SterlingTest() {
    }
    
    @Test
    public void test(){
        System.out.println("creating sterling...");
        s = new lab1.Sterling(5);
        System.out.print("Initial sterling value: ");
        System.out.println(s.getValue());
        System.out.println("adding 7 to the total value...");
        s7 = new lab1.Sterling(7);
        s.addToValue(s7);
        System.out.print("New total sterling value: ");
        System.out.println(s.getValue());
        System.out.println("Increasing the total sterling value by 20%...");
        s.changeByPercentage(20);
        System.out.print("New total sterling value: ");
        System.out.println(s.getValue());
        System.out.println("Creating share holder Blockbuster with 100 price share...");
        s1 = new lab1.Sterling(100);
        sh1 = new lab1.ShareHolding("Blockbuster");
        sh1.setPrice(s1);
        System.out.println("Setting quantity for share holder 1...");
        sh1.setQuantity(100);
        System.out.println("Creating share holder HMV with 250 price share...");
        s2 = new lab1.Sterling(250);
        sh2 = new lab1.ShareHolding("HMV");
        sh2.setPrice(s2);
        System.out.println("Setting quantity for share holder 2...");
        sh2.setQuantity(50);
        System.out.println("Creating share holder Acme Corp. with 500 price share...");
        s3 = new lab1.Sterling(500);
        sh3 = new lab1.ShareHolding("Acme Corp.");
        sh3.setPrice(s3);
        System.out.println("Setting quantity for share holder 3...");
        sh3.setQuantity(20);
        System.out.println("Creating portfolio...");
        p = new lab1.Portfolio();
        System.out.print("Initial value of total price share: ");
        System.out.println(p.getTotalValue());
        System.out.println("Adding first share holder to the total...");
        p.add(sh1);
        System.out.print("New total price share: ");
        System.out.println(p.getTotalValue());
        System.out.println("Adding first share holder to the total...");
        p.add(sh2);
        System.out.print("New total price share: ");
        System.out.println(p.getTotalValue());
        System.out.println("Adding second share holder to the total...");
        p.add(sh3);
        System.out.print("Final total price share: ");
        System.out.println(p.getTotalValue());
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
