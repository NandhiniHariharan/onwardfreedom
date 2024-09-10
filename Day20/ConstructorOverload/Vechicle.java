package Day20.ConstructorOverload;

public class Vechicle {
    public String make;
    public String model;
    public Vechicle(){

    }
    public Vechicle(String make){
      this.make=make;
    }
    public Vechicle(String make, String model){
       this.make=make;
       this.model=model;
    }
    public static void main(String[] args) {
        Vechicle vechicle1=new Vechicle();
        Vechicle vechicle2=new Vechicle("Toyota");
        Vechicle vechicle3=new Vechicle("Honda","Civic");
        System.out.println(vechicle1.make);
        System.out.println(vechicle1.model);
        System.out.println();
        System.out.println("the make is: "+vechicle2.make);
        System.out.println("the model is: "+vechicle2.model);
        System.out.println();
        System.out.println("the make is: "+vechicle3.make);
        System.out.println("the Model is: "+vechicle3.model);
    }
}
