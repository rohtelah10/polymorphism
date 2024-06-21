// write a program to calculate surface area of cylinder,cone,cube , sphere and cuboid
public class ajp5 {
    public static void main(String[] args) {
        area a = new area();

        a.volume(5.0d, 10.0d);     //surface area of cylinder
        a.volume(5.0d, 10.0f);     //surface area of cone
        a.volume(25.0d);             //surface area of cube
        a.volume(15f);               //surface area of sphere
    }
}

class area{
    double cylinderArea;
    double coneArea;
    double cubeArea;
    double sphereArea;
    double cuboidArea;

    area(){
        cylinderArea = 0;
        coneArea = 0;
        cubeArea = 0;
        sphereArea = 0;
        cuboidArea = 0;
    }

    void volume(double r, double h ){
        cylinderArea = 2 * 3.14 * r * (r + h);
        System.out.println( cylinderArea);
    }

    void volume(double r, float l){
        coneArea = 3.14 * r * (r+l);
        System.out.println( coneArea);
    }

    void volume(double s){
        cubeArea = 6 * s * s;
        System.out.println( cubeArea);
    }

    void volume(float r){
        sphereArea = 4 * 3.14 * r * r;
        System.out.println( sphereArea);
    }

    void volume(float l, float w, float h){
        cuboidArea = 2*(l*w + l*h + w*h);
        System.out.println(cuboidArea);
    }

}