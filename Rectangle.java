public class Rectangle{
    public float a,b;

    public Rectangle (float a, float b){
        this.a = a;
        this.b = b;
    }

    public double R_Area(){ //Площадь
        return this.a*this.b;
    }
    
    public double R_Perimeter(){ //Периметр
        return 2*(this.a+this.b);
    }
}