package _Extra_Exercises._company_management.utils;

import _Extra_Exercises._company_management.models.NhanVien;

import java.util.Comparator;

public class IncreaseSalaryComparator implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.salaryStaff() > o2.salaryStaff()) {
            return 1;
        } else if (o1.salaryStaff() < o2.salaryStaff()) {
            return -1;
        } else {
            return 1;
        }
    }
}
/* i. Muốn sử dụng comparator thì cần làm gì?
 * khi implement Comparator thì ta phải override lại phương thức compare(Object obj1, Object obj2) để làm rõ tiêu chí sắp xếp.
 *
 * ii. Muốn sử dụng comparable thì cần làm gì?
 * Để sử dụng được Comparable, ta phải implements interface Comparable cho lớp đối tượng cần được so sánh
 * phải override lại phương thức compareTo(Object obj) cho class đó
 *
 * Sắp xếp theo 1 tiêu chí có thể dùng comparable hoặc comparator.
 * Sắp xếp nhiều tiêu chí thì nên sử dụng comparator.
 */
