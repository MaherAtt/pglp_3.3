package uvsq.pglp_3_3;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<RobotDynamique> robots=new ArrayList<RobotDynamique>();
        robots.add(new RobotDynamique(1,5));
        robots.add(new RobotDynamique(1,5));
        
        for(int i=0;i<robots.size();i++)
        {
        	
        	robots.get(i).avance();
        }
        
        
    }
}
