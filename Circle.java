public class Circle{
    public int R;
    
    public Point center_point;
    
    public Circle(int R, Point center){
        this.R = R;
        this.center_point = center;
    }
    
    public Circle(int R, int x, int y){
        this(R, new Point(x,y));
    }
    
    public double Area(){
        return Math.PI*this.R*this.R;
    }
    
    public double Perimeter(){
        return 2*Math.PI*this.R;
    }
}