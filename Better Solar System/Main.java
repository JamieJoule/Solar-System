import java.util.Random;
public class Main
{
	public static void main(String[] args)
	{
		//int totalPlanets = 205;
		//int totalMoons = 82;
		int totalObjects = 287;
		SolarSystem s = new SolarSystem(1000,1000);
		SolarObject[] solarObjects = new SolarObject[totalObjects];
		Random r = new Random();
		
		Sun theSun = new Sun(50,"Yellow");
		s.drawSolarObject(0,0,theSun.getDiameter(),theSun.getColour());
		
		solarObjects[0] = new Planet(60,0,5,"GRAY",3);//Mercury
		solarObjects[1] = new Planet(100,0,10,"ORANGE",2.6);//Venus
		solarObjects[2] = new Planet(160,0,10,"BLUE",2);//Earth
		solarObjects[3] = new Planet(220,0,10,"RED",1);//Mars
		///asteroid belt dist wise
		solarObjects[4] = new Planet(380,0,30,"ORANGE",0.25);//Jupiter
		
		
		///asteroid belt
		for (int i = 0;i<200;i++)
		{
			double distance = 0.1 + (20 - 0.1) * r.nextDouble();
			double size = 0.5 + (4 - 0.5) * r.nextDouble();
			solarObjects[5+i] = new Planet(250+distance,i*3,size,"BROWN",1);
		}
		
		//earths moons
		solarObjects[205] = new Moon(20,0,2,"WHITE",3,2);
		
		//mars moons
		solarObjects[206] = new Moon(15,0,2,"WHITE",-2,3);
		solarObjects[207] = new Moon(20,0,3,"WHITE",2,3);
		
		//just to make jupiter moons
		for (int i = 0; i<79;i++)
		{
				double distance = 5 + (20 - 5) * r.nextDouble();
				double size = 0.5 + (3 - 0.5) * r.nextDouble();
				solarObjects[208+i] = new Moon(30+distance,i*11,size,"WHITE",1,4);
		}
		
		//Infintite loop while calling move method on each moon/planet
		while (true)
		{
			for (int i=0;i<totalObjects;i++)
			{
				solarObjects[i].move();
				if (i<205)//if less == planet
				{
					s.drawSolarObject(solarObjects[i].getDistance(),solarObjects[i].getAngle(),solarObjects[i].getDiameter(),solarObjects[i].getColour());
				}
				else
				{
					Moon temp = (Moon)solarObjects[i];
					s.drawSolarObjectAbout(temp.getDistance(),temp.getAngle(),temp.getDiameter(),temp.getColour(),solarObjects[temp.getPlanetKey()].getDistance(),solarObjects[temp.getPlanetKey()].getAngle());
				}
			}
			s.drawSolarObject(0,0,theSun.getDiameter(),theSun.getColour());
			s.finishedDrawing();
		}
	}
}