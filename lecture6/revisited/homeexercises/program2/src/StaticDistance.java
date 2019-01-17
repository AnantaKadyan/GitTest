

class StaticDistance{
	static float feet;
	static float inch;
	static float f;
	static float i;
	StaticDistance(){
		this.feet=0;
		this.inch=0;

	}
	StaticDistance(float f , float i){
		this.feet=f;
		this.inch=i;
	}
	static void getDistance(){
		feet = f;
		inch = i;
	}

	void setDistance1(float f , float i){
		feet =f;
		inch =i;
	}
      void setDistance2(float f , float i){
		feet =f;
		inch =i;
	}

	void setDistance(){
		System.out.println("entered distance is "+ feet +" feet " +inch+" inches ");
	}
	static void sum(StaticDistance d){
		float sfeet = feet + d.feet;
		float sinch = inch + d.inch + (inch/12);
		inch = inch%12;

		System.out.println(" total distance is "+ sfeet + " feet " + sinch +"inches");
	}
}