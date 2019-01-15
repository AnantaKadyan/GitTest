/* Author : Ananta
Version : 1.0.0
Purpose : to create class box which contains methods and variables and constructors*/
class Box{

	double width;
	double height;
	double depth;
	Box(){   // Non parametarised constructor
		width=1;
		height=1;
		depth=1;
	}

	Box(double w,double h, double d){   //  parametarised constructor
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	Box(double w, double d){   // Non parametarised constructor
		width=w;
		height=1;
		depth=d;
	}
	void setDim(float w, float d,float h){ // we pass arguments in the method and the values are assigned
		width = w;
		height =h;
		depth = d;
	}
	double volume(){
		double vol = width * height * depth;
		return vol;
	}

}