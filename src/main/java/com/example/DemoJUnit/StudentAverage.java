package com.example.DemoJUnit;

public class StudentAverage {

    public String kiemTraHocLuc(double diem) {
        if (diem >= 9 && diem <= 10) {
            return "Xuat sac";
        } else if (diem >= 8 && diem < 9) {
            return "Gioi";
        } else if (diem >= 7 && diem < 8) {
            return "Kha";
        } else if (diem >= 5 && diem < 7) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}
