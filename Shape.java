public class Shape{
    private String color;
    private boolean filled;
    private String Shape;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return ;
    }







    public class Circle {
        private double radius;
        
        public Circle(double radius){
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled){
            this.radius = radius;
            this.color = color;
        }


    }
    public class Rectangle{

    }

}
