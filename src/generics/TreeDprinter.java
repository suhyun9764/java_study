package generics;

public class TreeDprinter<T extends Material> { // type의 약자인 T(object로 변환)를 써서 어떤 타입의 객체가 와도 됨, 제네릭 클래스의 기본 개념
    private T material; // 정확한 타입 대신 T를 사용

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void Printing(){
        material.doPriting();
    }

}
