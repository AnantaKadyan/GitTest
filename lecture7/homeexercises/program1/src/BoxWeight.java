class BoxWeight extends Box{

	float weight;

	BoxWeight(){
		super();
		this.weight = 20;
	}

	BoxWeight(float width ,float height ,float depth ,float weight){
		super(width, height , depth);
		this.weight = weight;
	}

	void setWeight(float weight)
	{
		this.weight = weight;
	}

	float getWeight()
	{
		return weight;
	}

	void display1()
	{
		System.out.println("weight is " + weight);
	}
}