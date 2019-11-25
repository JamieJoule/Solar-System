public class Planet extends SolarObject
{
	/**
	* creates a planet rotating from centre
	*@param Double Distance from  planet it shall orbit
	*@param Double Angle around the planet it starts
	*@param Double Diamaeter of the moon - size
	*@param String Colour of the moon
	*@param Double Velocitity speed the angle changes per tick
	**/
	public Planet(double d, double a,double diam,String c,double v)
	{
		this.setDistance(d);
		this.setAngle(a);
		this.setDiameter(diam);
		this.setColour(c);
		this.setVelocity(v);
	}
}