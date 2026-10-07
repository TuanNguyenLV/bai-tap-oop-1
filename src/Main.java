//Bai 1:


//class Employee {
//    public double tinhLuong() {
//        return 0;
//    }
//}
//
//class OfficeEmployee extends Employee {
//    private String ten;
//    private int tuoi;
//    private double tienLuong;
//    private int ngayLam;
//
//    public OfficeEmployee(String ten, int tuoi, int ngayLam) {
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.ngayLam = ngayLam;
//    }
//
//    @Override
//    public double tinhLuong() {
//        tienLuong = 100 * ngayLam;
//        return tienLuong;
//    }
//}
//
//class TechnicalEmployee extends Employee {
//    private String ten;
//    private int tuoi;
//    private double tienLuong;
//    private int gioLam;
//    private double tiencong;
//
//    public TechnicalEmployee(String ten, int tuoi, int gioLam, double tiencong) {
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.gioLam = gioLam;
//        this.tiencong = tiencong;
//    }
//
//    @Override
//    public double tinhLuong() {
//        tienLuong = tiencong * gioLam;
//        return tienLuong;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Employee[] danhSach = {
//                new OfficeEmployee("NV Văn phòng A", 25, 22),
//                new TechnicalEmployee("NV Kỹ thuật B", 28, 160, 15.5)
//        };
//
//        for (Employee nv : danhSach) {
//            nv.tinhLuong();
//            System.out.println("Lương nhận được là: " + nv.tinhLuong());
//        }
//    }
//}




//Bai2


//interface EmailSender {
//    void sendEmail();
//}
//
//interface Programmer {
//    void code();
//}
//
//interface Salesperson {
//    void sell();
//}
//
//class OfficeEmployee implements EmailSender {
//    private String name;
//
//    public OfficeEmployee(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void sendEmail() {
//        System.out.println(name + " đang gửi email.");
//    }
//}
//
//class TechnicalEmployee implements EmailSender, Programmer {
//    private String name;
//
//    public TechnicalEmployee(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void sendEmail() {
//        System.out.println(name + " đang gửi email.");
//    }
//
//    @Override
//    public void code() {
//        System.out.println(name + " đang lập trình.");
//    }
//}
//
//class SalesEmployee implements EmailSender, Salesperson {
//    private String name;
//
//    public SalesEmployee(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void sendEmail() {
//        System.out.println(name + " đang gửi email.");
//    }
//
//    @Override
//    public void sell() {
//        System.out.println(name + " đang bán hàng.");
//    }
//}
//
//public class MainBai2 {
//    public static void main(String[] args) {
//        OfficeEmployee nv1 = new OfficeEmployee("NV Văn phòng");
//        TechnicalEmployee nv2 = new TechnicalEmployee("NV Kỹ thuật");
//        SalesEmployee nv3 = new SalesEmployee("NV Bán hàng");
//
//        nv1.sendEmail();
//
//        nv2.code();
//        nv2.sendEmail();
//
//        nv3.sell();
//        nv3.sendEmail();
//    }
//}




//Bai 3:


//abstract class PaymentMethod {
//    String paymentType;
//    String methodName;
//
//    public PaymentMethod(String paymentType, String methodName) {
//        this.paymentType = paymentType;
//        this.methodName = methodName;
//    }
//
//    public abstract void pay(double amount);
//}
//
//class CreditCard extends PaymentMethod {
//    public CreditCard() {
//        super("Không dùng tiền mặt", "thẻ tín dụng");
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Thanh toán " + (int)amount + " bằng " + methodName + ".");
//    }
//}
//
//class PayPal extends PaymentMethod {
//    public PayPal() {
//        super("Không dùng tiền mặt", "PayPal");
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Thanh toán " + (int)amount + " qua " + methodName + ".");
//    }
//}
//
//class Cash extends PaymentMethod {
//    public Cash() {
//        super("Trực tiếp", "tiền mặt");
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Thanh toán " + (int)amount + " bằng " + methodName + ".");
//    }
//}
//
//class MoMo extends PaymentMethod {
//    public MoMo() {
//        super("Không dùng tiền mặt", "MoMo");
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Thanh toán " + (int)amount + " qua " + methodName + ".");
//    }
//}
//
//class Order {
//    String customerName;
//    double amount;
//    PaymentMethod paymentMethod;
//
//    public Order(String customerName, double amount, PaymentMethod paymentMethod) {
//        this.customerName = customerName;
//        this.amount = amount;
//        this.paymentMethod = paymentMethod;
//    }
//
//    public void checkout() {
//        System.out.println("Khách hàng: " + customerName);
//        paymentMethod.pay(amount);
//        System.out.println();
//    }
//}
//
//public class MainBai3 {
//    public static void main(String[] args) {
//        Order order1 = new Order("An", 200000, new CreditCard());
//        order1.checkout();
//
//        Order order2 = new Order("Bình", 150000, new PayPal());
//        order2.checkout();
//
//        Order order3 = new Order("Chi", 100000, new Cash());
//        order3.checkout();
//
//        Order order4 = new Order("Dũng", 300000, new MoMo());
//        order4.checkout();
//    }
//}