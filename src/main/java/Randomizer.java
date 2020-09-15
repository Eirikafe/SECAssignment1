/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eirikafe
 */
import java.util.Random; 

public class Randomizer {
    private static Random random = new Random();
    
    public static int rand(int min, int max)
    {
        return random.nextInt((max - min) + 1) + min;
    }
}
