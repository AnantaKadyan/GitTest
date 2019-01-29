class ResizableCircle extends Circle implements Resizable{

	ResizableCircle(double radius){
		super(radius);
	}

	public void resize(int percent){
		radius = (percent/100) * radius + radius;
	}
}