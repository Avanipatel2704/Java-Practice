class Cat {
    String name;
    int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void display() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Age: " + age);
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        
        myCat.display();
    }
}

