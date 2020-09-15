
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eirikafe
 */
public class RobotFactory implements Runnable 
{
    private BlockingQueue<Robot> queue = new ArrayBlockingQueue<>(4);
    private int decider;
    private int label = 1;
    
    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                Robot r = new Robot();
                
                decider = Randomizer.rand(0, 1);
                if (decider == 0)
                {
                    r.setX(0);
                }
                else
                {
                    r.setX(8);
                }
                decider = Randomizer.rand(0, 1);
                if (decider ==0)
                {
                    r.setY(0);
                }
                else
                {
                    r.setY(8);
                }
                r.setLabel(label);
                label += 1;
                
                queue.put(r);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("No Robot");
        }
    }
    
    public Robot getNextRobot() throws InterruptedException
    {
        return queue.take();
    }
}
