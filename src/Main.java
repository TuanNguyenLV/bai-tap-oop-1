
//bai1:
//class Student{
//    private String name;
//    private int mssv;
//    private double diemCC;
//    private double diemGK;
//    private double diemCK;
//    public Student(String name,double diemCC,double diemGK,double diemCK){
//        this.name=name;
//        this.mssv=mssv;
//        this.diemCC=diemCC;
//        this.diemGK=diemGK;
//        this.diemCK=diemCK;
//
//    }
//    public int getMssv(){
//        return mssv;
//    }
//    public String getName(){
//        return name;
//    }
//    public double getDiemCC(){
//        return diemCC;
//    }
//    public double getDiemCK(){
//        return diemCK;
//    }
//    public double getDiemGK(){
//        return diemGK;
//    }
//    public void setDiemCC(double diemCCMoi){
//        if(0<=diemCCMoi && diemCCMoi<=10){
//            this.diemCC=diemCCMoi;
//        }
//    }
//    public void setDiemGK(double diemGKMoi){
//        if(0<=diemGKMoi && diemGKMoi<=10){
//            this.diemGK=diemGKMoi;
//        }
//    }
//    public void setDiemCK(double diemCKMoi){
//        if(0<=diemCKMoi && diemCKMoi<=10){
//            this.diemCK=diemCKMoi;
//        }
//
//    }
//    public double  diemTrungBinh(){
//        double diemTB=this.diemCC*0.1+this.diemGK*0.3+this.diemCK*0.6;
//        return diemTB;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Student sv1=new Student(12345678,"Nguyen Van A",9,9,9);
//        Student sv2=new Student(12345679,"Nguyen Van b",9,8,10);
//        Student sv3=new Student(12345677,"Nguyen Van C",10,10,6);
//        System.out.println(sv1.getMssv());
//        System.out.println(sv2.getMssv());
//        System.out.println(sv3.getMssv());
//        System.out.println(sv1.getName());
//        System.out.println(sv2.getName());
//        System.out.println(sv3.getName());
//        sv1.setDiemCK(10);
//        System.out.println(sv1.diemTrungBinh());
//        System.out.println(sv2.diemTrungBinh());
//        System.out.println(sv3.diemTrungBinh());
//
//}}

//bài 2
//
//class Student{
//private String name;
//private String email;
//private String sdt;
//private String mssv;
//static int counter=0;
//private double diemCC;
//private double diemGK;
//private double diemCK;
//public Student(String name,double diemCC,double diemGK,double diemCK){
//    this.name=name;
//    this.diemCC=diemCC;
//    this.diemGK=diemGK;
//    this.diemCK=diemCK;
//    this.counter=counter+1;
//    if(counter>=1 && counter<=9){
//        this.mssv="B21DCCN00"+counter;
//    }
//    else if (counter>=10 && counter<=99){
//        this.mssv="B21DCCN0"+counter;
//    }
//    else {
//        this.mssv="B21DCCN"+counter;
//    }
//    }
//    public String getMssv(){
//    return mssv;
//    }
//    public Student  capNhatEmail(String email){
//    this.email=email;
//    return this;
//}
//    public Student capNhatSdt(String sdt){
//    this.sdt=sdt;
//    return this;
//    }
//    static int getTotalStudents(){
//    return counter;
//    }
//}
//public class Main{
//
//    public static void main(String[] args){
//        Student sv = new Student("Lan", 8, 7.5, 9);
//        Student sv2 = new Student("Anh", 8, 7.5, 9);
//        Student sv3 = new Student("a", 8, 7.5, 9);
//        sv.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");
//        sv2.capNhatEmail("anh@ptit.edu.vn");
//        sv2.capNhatSdt("09123456789");
//
//        System.out.println(sv.getMssv());
//        System.out.println(Student.getTotalStudents());
//
//    }
//}

//bài 3

//import java.util.ArrayList;
//
//class Student {
//    private String name;
//    private int mssv;
//    private double diemCC;
//    private double diemGK;
//    private double diemCK;
//
//    public Student(int mssv, String name, double diemCC, double diemGK, double diemCK) {
//        this.mssv = mssv;
//        this.name = name;
//        setDiemCC(diemCC);
//        setDiemGK(diemGK);
//        setDiemCK(diemCK);
//    }
//
//    public int getMssv() { return mssv; }
//    public String getName() { return name; }
//
//    public void setDiemCC(double diemCC) {
//        if (diemCC >= 0 && diemCC <= 10) this.diemCC = diemCC;
//    }
//    public void setDiemGK(double diemGK) {
//        if (diemGK >= 0 && diemGK <= 10) this.diemGK = diemGK;
//    }
//    public void setDiemCK(double diemCK) {
//        if (diemCK >= 0 && diemCK <= 10) this.diemCK = diemCK;
//    }
//
//    public double diemTrungBinh() {
//        return this.diemCC * 0.1 + this.diemGK * 0.3 + this.diemCK * 0.6;
//    }
//}
//
//class Classroom {
//    private String tenLop;
//    private ArrayList <Student> danhSachSV;
//
//    public Classroom(String tenLop) {
//        this.tenLop = tenLop;
//        this.danhSachSV = new ArrayList<>();
//    }
//
//    public void addStudent(Student s) {
//        for (Student svDaCo : danhSachSV) {
//            if (svDaCo.getMssv() == s.getMssv()) {
//                throw new IllegalArgumentException("MSSV " + s.getMssv() + " đã tồn tại trong lớp!");
//            }
//        }
//        danhSachSV.add(s);
//    }
//
//    public String xepLoai(Student s) {
//        double dtb = s.diemTrungBinh();
//        if (dtb >= 8.0) {
//            return "Giỏi";
//        } else if (dtb >= 6.5) {
//            return "Khá";
//        } else if (dtb >= 5.0) {
//            return "Trung bình";
//        } else {
//            return "Yếu";
//        }
//    }
//
//    public void inBangDiem() {
//        System.out.println(" BẢNG ĐIỂM LỚP " + this.tenLop);
//        for (Student s : danhSachSV) {
//            System.out.printf("MSSV: %d | Tên: %-15s | ĐTB: %.2f | Xếp loại: %s\n",
//                    s.getMssv(), s.getName(), s.diemTrungBinh(), xepLoai(s));
//        }
//        System.out.println("Sĩ số lớp: " + danhSachSV.size() + " sinh viên.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Classroom lopIT = new Classroom("UDU");
//
//        Student sv1 = new Student(12345678, "Nguyen Van A", 9, 9, 9);
//        Student sv2 = new Student(12345679, "Nguyen Van B", 6, 7, 6);
//        Student sv3 = new Student(12345680, "Nguyen Van C", 4, 4, 5);
//        Student sv4 = new Student(12345678, "Nguyen Van D (Trùng)", 10, 10, 10);
//
//        lopIT.addStudent(sv1);
//        lopIT.addStudent(sv2);
//        lopIT.addStudent(sv3);
//
//        System.out.println("Đang thử thêm sinh viên SV4 (bị trùng mã)...");
//        try {
//            lopIT.addStudent(sv4);
//            System.out.println("Thêm thành công");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Lỗi chặn dữ liệu: " + e.getMessage());
//        }
//
//        lopIT.inBangDiem();
//    }
//}