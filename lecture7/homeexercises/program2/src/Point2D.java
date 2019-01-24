class Point2D{

     float x;
	 float y;

	Point2D(){
		
		x=0.0f;
		y=0.0f;
	}

	Point2D(float x,float y){
		this.x=x;
		this.x=y;
	}

	void setX(float x){
		this.x=x;
	}

	void setY(float y){
		this.y=y;
	}

	float getX(){
		return x;
	}

	float getY(){
		return y;
	}

	void setXY(float x,float y){
       this.x =x;
       this.y =y;

     }

	float[] getXY(){
	   float arr[] = new float[2];
      arr[0]=x;
      arr[1]=y;
      return arr;

	}

	public String toString()
	{
		return (("("+x+","+y+")"));
	}
}