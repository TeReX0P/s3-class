 public class box{
    double width, height, depth;

    public box(){
        width = 0;
        height = 0;
        depth = 0;
    }
    public box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    public box(double size){
        this.width = size;
        this.height = size;
        this.depth = size;
    }

    public void volume(){
        double vol = width * height * depth;
        System.out.println("Volume: " +vol);
    }
}

class boxDemo{
    public static void main(String[] args) {
        box box1 = new box();
        box box2 = new box(10, 20, 30);
        box box3 = new box(25);

        System.out.print("Box1 ");
        box1.volume();
        
        System.out.print("Box2 ");
        box2.volume();
        
        System.out.print("Box3 ");
        box3.volume();
    }
}