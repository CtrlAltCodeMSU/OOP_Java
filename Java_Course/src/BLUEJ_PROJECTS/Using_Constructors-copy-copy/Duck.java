class Duck implements Swimmable, Walkable , Flyable {
    public void swim() {
        System.out.println("Duck is Swimming");
    }
    public void walk(){
        System.out.println("Duck is Walking");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
}