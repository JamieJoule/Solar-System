public class Point
{
	private double distance;
	private double angle;
	
	/**
	*Get value of the distance from the Point this point is orbiting
	*@return Double distance
	**/
	public double getDistance()
	{
		return this.distance;
	}
	/**
	*Set value of the distance from the Point this point is orbiting
	*@param Double distance
	**/
	public void setDistance(double d)
	{
		this.distance = d;
	}
	/**
	*Get value of what angle the rotation is on
	*@return Double angle
	**/
	public double getAngle()
	{
		return this.angle;
	}
	/**
	*Set value of what angle the rotation is on
	*@return Double angle
	**/
	public void setAngle(double a)
	{
		this.angle = a;
	}
	
}