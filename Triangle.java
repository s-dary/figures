public class Triangle{
    public int a,b,c;

    public Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //public double T_Area(){ //Площадь
      //  return this.a*this.b;
    //}
    
    public double T_Perimeter(){ //Периметр
        return this.a+this.b+this.c;
    }
}