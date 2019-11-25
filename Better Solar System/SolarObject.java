public abstract class SolarObject
{
	private double diameter;
	private String colour;
	private double velocity;
	private Point point = new Point();
	/**
	*Get value of the diamater if the point - how wide it is
	*@return Double diam
	**/
	public double getDiameter()
	{
		return this.diameter;
	}
	/**
	*Set value of the diamater if the point - how wide it is
	*@param Double diam
	**/
	public void setDiameter(double d)
	{
		this.diameter = d;
	}
	/**
	*Get value of the colour of the point
	*@return string Colour
	**/
	public String getColour()
	{
		return this.colour;
	}
	/**
	*Set value of the colour of the point
	*@return string Colour
	**/
	public void setColour(String c)
	{
		this.colour = c;
	}
	/**
	*Get value of the amount the angle changes per tick
	*@return Double velocity
	**/
	public double getVelocity()
	{
		return this.velocity;
	}
	/**
	*Set value of the amount the angle changes per tick
	*@param Double velocity
	**/
	public void setVelocity(double v)
	{
		this.velocity = v;
	}
	/**
	* Method that moves the angle of this point by the velocity
	**/
	public void move()
	{
		point.setAngle(point.getAngle() + velocity);
	}

	/**
	*Get value of the distance from the Point this point is orbiting
	*@return Double distance
	**/
	public double getDistance()
	{
		return point.getDistance();
	}
	/**
	*Set value of the distance from the Point this point is orbiting
	*@param Double distance
	**/
	public void setDistance(double d)
	{
		point.setDistance(d);
	}
	/**
	*Get value of what angle the rotation is on
	*@return Double angle
	**/
	public double getAngle()
	{
		return point.getAngle();
	}
	/**
	*Set value of what angle the rotation is on
	*@return Double angle
	**/
	public void setAngle(double a)
	{
		point.setAngle(a);
	}
}
