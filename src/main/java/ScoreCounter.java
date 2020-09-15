/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eirikafe
 */
public class ScoreCounter implements Runnable
{
    private int score = 0;
    
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(score);
                score += 10;
            } 
            catch (InterruptedException e)
            {
               e.printStackTrace(); 
            }
        }
    }
    
    public int getScore() throws InterruptedException
    {
        return score;
    }
}