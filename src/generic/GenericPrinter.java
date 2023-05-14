package generic;

public class GenericPrinter<T extends Material> {
    private T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() { // T 자료형을 반환하는 제네릭 메서드
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing(){
        material.doPrinting();
    }
}
