public class Point3D extends Point2D{

    float z;

	Point3D(){
		super();
		z=0.0f;
	}

	Point3D(float x,float y , float z){
		super(x,y);
	   this.z=z;
	}

	void setZ(float z){
		this.z=z;
	}


	float getZ(){
		return z;
	}

	void setXYZ(float x,float y , float z){
        this.x = x;
        this.y = y;
        this.z = z;

     }

	float[] getXYZ(){
		float arr1[] = new float[3];
		arr1[0] = x;
	    arr1[1] = y;
	    arr1[2] = z;
	    return arr1;
	}

	public String toString()
	{
		return (("("+x+","+y+","+z+ ")"));
	}
}