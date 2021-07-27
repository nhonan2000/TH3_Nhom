package tamgiac;

import java.util.Scanner;

public class tamgiac {
	private double a;
    private double b;
    private double c;

    public tamgiac() {
    }

    public tamgiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double tinhChuVi()
    {
        return (this.a+this.b+this.c);
    }
    public double tinhDienTich()
    {
        double P=this.tinhChuVi()/2;
        return Math.sqrt(P*(P-this.a)*(P-this.b)*(P-this.c));                                                                                     
    }
    public void Xuat()
    {
        System.out.println("Canh A:"+this.a);
        System.out.println("Canh B:"+this.b);
        System.out.println("Canh C:"+this.c);
        System.out.println("Chu Vi Tam Giac:"+this.tinhChuVi());
        System.out.println("Dien Tich Tam Giac:"+this.tinhDienTich());
        
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh A:");
        this.a=sc.nextDouble();
        System.out.println("Nhap canh B:");
        this.b=sc.nextDouble();
        System.out.println("Nhap canh C:");
        this.c=sc.nextDouble();
    }
    public static void main(String[] args) {
    	
    	tamgiac [] arraytamgiac;
        int sophantu;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tam giac: ");
        sophantu=sc.nextInt();
        arraytamgiac=new tamgiac[sophantu];
        for(int i=0;i<arraytamgiac.length;i++)
        {
        	tamgiac tg=new tamgiac();
            tg.Nhap();
            arraytamgiac[i]=tg;
        }
        for(int i=0;i<arraytamgiac.length;i++)
        {
            arraytamgiac[i].Xuat();
        }
	}
}


