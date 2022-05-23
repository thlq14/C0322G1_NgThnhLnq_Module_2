package _Extra_Exercises._company_management.services;

public interface ChamCong {
    void ChamCong();
}
/*
 * Suy nghĩ xem khi nào nên dùng interface, khi nào nên dùng abstract class, khi nào cần có phương thức abstract ở class cha?
 * Khi một nhóm đối tượng có cùng bản chất kế thừa từ một class thì sử dụng abstract class.
 * Khi một nhóm đối tượng không có cùng bản chất nhưng chúng có hành động giống nhau thì sử dụng interface.
 * Nếu bạn muốn một lớp chứa một phương thức cụ thể nhưng bạn muốn triển khai thực sự phương thức đó để được quyết định bởi các lớp con,
 *  thì bạn có thể khai báo phương thức đó trong lớp cha ở dạng abstract.
 */
