class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class AccessModifiersInJava {
    public static void main(String[] args) {
        MyEmployee sapto = new MyEmployee();
        // sapto.id = 45;
        // sapto.name = "Saptaparno"; --> Throws an error due to private access modifier
        sapto.setName("Saptaparno");
        System.out.println(sapto.getName());
        sapto.setId(234);
        System.out.println(sapto.getId());
    }
}