public class Main
{
	public static void main(String[] args) {
		Circle cIr = new Circle(4,0,0); //Площадь и периметр круга
		System.out.println(cIr.Area());
		System.out.println(cIr.Perimeter());

		Rectangle rEcT = new Rectangle(2,6); ////Площадь и периметр прямоугольника
		System.out.println(rEcT.R_Area());
		System.out.println(rEcT.R_Perimeter());

		Triangle tRi = new Triangle(2,3,1); ////Площадь и периметр треугольника
		//System.out.println(rEcT.R_Area());
		System.out.println(tRi.T_Perimeter());
	}
}
