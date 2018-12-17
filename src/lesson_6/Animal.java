package lesson_6;

abstract public class Animal {

    int runDistance, swimDistance;
    double jumpHeight;

    Animal(int runDistance, int swimDistance, double jumpHeight) {
        this.runDistance = runDistance;
        this. swimDistance = swimDistance;
        this. jumpHeight = jumpHeight;
    }

    public void run(int runDistance) {
        System.out.println("run: " + (this.runDistance > runDistance));
    }

    public void swim(int swimDistance) {
        System.out.println("swim: " + (this.swimDistance > swimDistance));
    }

    public void jump(int jumpHeight) {
        System.out.println("jump: " + (this.jumpHeight > jumpHeight));
    }
}
