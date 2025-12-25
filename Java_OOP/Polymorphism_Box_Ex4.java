package Java_OOP;

public class Polymorphism_Box_Ex4 {
    double width, height, depth;
    Polymorphism_Box_Ex4(){
        width =height = depth = 0;
    }
    Polymorphism_Box_Ex4(double w, double h, double d){
        width = w;
        height = h;
        depth = d;

    }
    Polymorphism_Box_Ex4(double len){
        width = height = depth = len;
    }
    double volumn(){
        return (width*height*depth);
    }

    public static void main(String[] args) {
        Polymorphism_Box_Ex4 box1 = new Polymorphism_Box_Ex4(20.3, 4.5, 2.5);
        System.out.println(box1.volumn());
        Polymorphism_Box_Ex4 box2 = new Polymorphism_Box_Ex4((10.5));
        System.out.println(box2.volumn());
    }
}
