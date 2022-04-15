package ex3;

public class ShapeTest {

static void paint(Shape p) {
	p.draw();
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//
		Shape shape = new Shape(); // 모양 (부모)
		Line line = new Line(); // 선 (Shape의 자식)
		Rect rect = new Rect(); // 사각형 (Shape의 자식)
		Circle circle = new Circle(); // 원 (Shape의 자식)
		
		paint(shape);
		paint(line);
		paint(rect);
		paint(circle);
		
		
	}

}	
