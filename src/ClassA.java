class ClassA {
    void a() {
        System.out.println("A-a");
    }

    void b() {
        System.out.println("A-b");
        a();
    }
}

class ClassB extends ClassA {
    void a() {
        System.out.println("B-a");
    }

    void b() {
        System.out.println("B-b");
        super.b();
    }

}
class TestDemo{
    public static void main(String[] args) {
        ClassA a = new ClassB();
        a.b();

    }
}