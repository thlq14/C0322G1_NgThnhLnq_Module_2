package _Extra_Exercises._company_management.views;

import _Extra_Exercises._company_management.controllers.ArrayPersonController;

public class ArrayMain {
    public static void main(String[] args) {
        ArrayPersonController.displayMenu();
    }
}

/**
 * iii. Suy nghĩ xem có những khó khăn gì khi hiển thị thông tin (phải check null, …)
 * Phải check null.
 * Kích thước mảng cố định không thay đổi.
 * <p>
 * iv. Suy nghĩ xem từ khóa instanceof làm chức năng gì?
 * Toán tử instanceof trong java được sử dụng để kiểm tra một đối tượng có phải là thể hiện của một kiểu dữ liệu cụ thể không
 * (lớp, lớp con, interface).
 * <p>
 * v. Suy nghĩ xem nếu có 1001 nhân viên trong công ty thì chuyện gì xảy ra?
 * Chương trình xảy ra lỗi IndexOutOfBoundsException
 * <p>
 * vi. Đa hình lúc runtime thể hiện ở đâu?
 * đạt được thông qua việc ghi đè phương thức. xảy ra lúc override.
 * vii. Đa hình lúc compile thể hiện ở đâu?
 * đạt được thông qua việc nạp chồng phương thức và nạp chồng toán tử trong Java.
 */