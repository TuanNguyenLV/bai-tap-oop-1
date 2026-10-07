class Student{
    private String name;
    private int mssv;
    private double diemCC;
    private double diemGK;
    private double diemCK;
    public Student(int mssv,String name,double diemCC,double diemGK,double diemCK){
        this.name=name;
        this.mssv=mssv;
        this.diemCC=diemCC;
        this.diemGK=diemGK;
        this.diemCK=diemCK;

    }
    public int getMssv(){
        return mssv;
    }
    public String getName(){
        return name;
    }
    public double getDiemCC(){
        return diemCC;
    }
    public double getDiemCK(){
        return diemCK;
    }
    public double getDiemGK(){
        return diemGK;
    }
    public void setDiemCC(double diemCCMoi){
        if(0<=diemCCMoi && diemCCMoi<=10){
            this.diemCC=diemCCMoi;
        }
    }
    public void setDiemGK(double diemGKMoi){
        if(0<=diemGKMoi && diemGKMoi<=10){
            this.diemGK=diemGKMoi;
        }
    }
    public void setDiemCK(double diemCKMoi){
        if(0<=diemCKMoi && diemCKMoi<=10){
            this.diemCK=diemCKMoi;
        }

    }
    public double  diemTrungBinh(){
        double diemTB=this.diemCC*0.1+this.diemGK*0.3+this.diemCK*0.6;
        return diemTB;
    }
}
public class Main{
    public static void main(String[] args){
        Student sv1=new Student(12345678,"Nguyen Van A",9,9,9);
        Student sv2=new Student(12345679,"Nguyen Van b",9,8,10);
        Student sv3=new Student(12345677,"Nguyen Van C",10,10,6);
        System.out.println(sv1.getMssv());
        System.out.println(sv2.getMssv());
        System.out.println(sv3.getMssv());
        System.out.println(sv1.getName());
        System.out.println(sv2.getName());
        System.out.println(sv3.getName());
        sv1.setDiemCK(10);
        System.out.println(sv1.diemTrungBinh());
        System.out.println(sv2.diemTrungBinh());
        System.out.println(sv3.diemTrungBinh());

}}
