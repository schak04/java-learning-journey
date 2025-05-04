// HW: Are methods and functions same? If not, in what ways are they different?

public class CSE310_Enums {
    enum Base {cheeseburst, handtossed, panbased};
    private Base b;
    public void SetBase(Base b) {
        this.b = b;
    }
    public int SetPrice() {
        if (this.b == Base.panbased) return 300;
        if (this.b == Base.handtossed) return 400;
        if (this.b == Base.cheeseburst) return 500;
        return 0;
    }
    public static void main(String[] args) {
        CSE310_Enums mypizza = new CSE310_Enums();
        mypizza.SetBase(Base.cheeseburst);
        System.out.println(mypizza.SetPrice());
    }
}