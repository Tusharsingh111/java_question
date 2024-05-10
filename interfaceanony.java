








interface AnonymInter{
    void show();
}



public class interfaceanony {
    public static void main(String[] args) {
        AnonymInter obj = new AnonymInter() {
            public void show(){
                System.out.println("hello friends");
            }
        };
        obj.show();
    }
}
