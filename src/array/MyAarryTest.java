package array;

public class MyAarryTest {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.getElement(10);
        array.getElement(20);
        array.getElement(30);
        array.insertElement(1,50);
        array.printAll();

        System.out.println("=================");
        array.removeElement(1);
        array.printAll();
        System.out.println("=================");

        array.addElement(70);
        array.printAll();
        System.out.println("=================");
        array.removeElement(1);
        array.printAll();

        System.out.println("=================");
        System.out.println(array.getElement(2));

    }
}
