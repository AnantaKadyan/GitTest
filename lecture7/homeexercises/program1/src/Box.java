class Box{
	float width;
	float height;
	float depth;

	Box(){
		this.width=10;
		this.height=10;
		this.depth=10;
	}
	Box( float width, float height, float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

    void setWidth(float width)
	{
		this.width = width;
	}

	void setDepth(float depth)
	{
		this.depth = depth;
	}

	void setHeight(float height)
	{
		this.height = height;
	}

	float getWidth()
	{
		return width;
	}

	float getHeight()
	{
		return height;
	}

	float getDepth()
	{
		return depth;
	}

	void display(){
		System.out.println("volume is " + height*width*depth);
	}


}

