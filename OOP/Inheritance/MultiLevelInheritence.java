class A{
    void A(){
        System.out.println("This is method of class A");
    }
}
class B extends  A{
    void B(){
        System.out.println("This is method of class B");
    }
}
class C extends B{
    void C(){
        System.out.println("This is method of class C");
    }
}



class MultiLevelInheritence{
    public static void main(String[] args) {
        C obj = new C();
        obj.C();
        obj.B();
        obj.A();
    }
}