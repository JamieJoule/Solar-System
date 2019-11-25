public class Moon extends SolarObject
{
	private int planetKey;
	/**
	*@Param int Planet key
	**/
	public void setPlanetKey(int pk)
	{
		planetKey = pk;
	}
	
	/**
	*@Return int Planet key
	**/
	public int getPlanetKey()
	{
		return planetKey;
	}

	/**
	*creates a moon rotating around a planet indicated by key in array
	*@param Double Distance from  planet it shall orbit
	*@param Double Angle around the planet it starts
	*@param Double Diamaeter of the moon - size
	*@param String Colour of the moon
	*@param Double Velocitity speed the angle changes per tick
	*@param Int Planet key - the array index of the planet this one shall orbit
	**/
	public Moon(double d, double a,double diam,String c,double v,int pk)//double cord, double cora
	{
		this.setDistance(d);
		this.setAngle(a);
		this.setDiameter(diam);
		this.setColour(c);
		this.setVelocity(v);
		this.setPlanetKey(pk);
	}
}