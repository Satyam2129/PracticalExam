import java.util.Scanner;

public class Area
{
    private double length;
    private double breath;

    public double getLength()
    {
        return length;
    }
    public double getBreath()
    {
        return breath;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setBreath(double breath)
    {
        this.breath = breath;
    }

    public void getArea()
    {
       double area = length*breath;
        System.out.println(area);
    }

    public static void main(String[] args)
    {
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        obj.setLength(sc.nextDouble());
        obj.setBreath(sc.nextDouble());
        obj.getArea();
    }
}
