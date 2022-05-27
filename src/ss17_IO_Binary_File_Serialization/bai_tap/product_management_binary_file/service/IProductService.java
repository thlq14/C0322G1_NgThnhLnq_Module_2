package ss17_IO_Binary_File_Serialization.bai_tap.product_management_binary_file.service;

public interface IProductService {
    void addNewProduct();

    void updateProductById();

    void removeProductById();

    void displayListProduct();

    void searchProductByName();
}
