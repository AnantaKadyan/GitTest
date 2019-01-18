import java.util.*;

class Distance{
	float feet;
	float inch;

	Distance(){
		this.feet=0;
		this.inch=0;

	}
	Distance(float feet , float inch){
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
	
	void sum(Distance d1 , Distance d2){
		float sfeet = d1.feet + d2.feet;
		float sinch = d1.inch + d2.inch + (inch/12);
	
		System.out.println("sum of distances is " + sfeet + "feet"+ sinch + "inches");
	}	
}