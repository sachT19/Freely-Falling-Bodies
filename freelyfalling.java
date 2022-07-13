public class FallingBodies
{
    public static void main(String[] args)
    {
        
        //h = .5 * g * t^2
        //v = g * t
        //g final variable
        //time: 10 sec. what is height of ball?
        //velocity of ball when hits ground
        
        final double g = 9.8;
        double t = 10.0;
        double cliffHeight = 0.5 * g * t * t;
        System.out.println("The height of the cliff is " + cliffHeight);
        double velocity = g * t;
        System.out.println("The velocity of the ball is " + velocity);
    }
}
