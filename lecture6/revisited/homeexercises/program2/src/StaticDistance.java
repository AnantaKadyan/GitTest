class StaticDistance{
	static float feet;
	static float inch;

	StaticDistance(){
		this.feet=0;
		this.inch=0;

	}
	StaticDistance(float feet , float inch){
		this.feet=feet;
		this.inch=inch;
	}

	void setvaluefeet(float feet){
		this.feet = feet;
	}
	void setvalueinch(float inch){
		this.inch = inch;
	}
	 float getvaluefeet(){
	 	return feet;
	 }
	 float getvalueinch(){
	 	return inch;
    }
	
	static StaticDistance sum(StaticDistance d1 , StaticDistance d2){
		
		float inch = d1.inch + d2.inch;
		float feet = d1.feet + d2.feet;
		StaticDistance d = new StaticDistance(inch,feet);
		return d; 
	}



}