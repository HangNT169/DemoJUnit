import com.example.DemoJUnit.StudentAverage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentAverageTest {
    // Su dung phan vung tuong duong
    // Su dung bien

    private StudentAverage studentAverage = new StudentAverage();

    @Test
    public void kiemTraHocLucTest(){
        // Dung => 9
        double diem = 9;
        String ketQuaMongMuon ="Xuat sac";
        // Ket qua thuc te
        String ketQuaThucTe = studentAverage.kiemTraHocLuc(diem);
        // SS
        Assertions.assertEquals(ketQuaThucTe,ketQuaMongMuon);
    }

    // priotity = 1
    @Test
    public void kiemTraHocLucTestPhanVungTuong(){
        // Dung => 8
        double diem = 8;
        String ketQuaMongMuon ="Gioi";
        // Ket qua thuc te
        String ketQuaThucTe = studentAverage.kiemTraHocLuc(diem);
        // SS
        Assertions.assertEquals(ketQuaThucTe,ketQuaMongMuon);
    }
}
