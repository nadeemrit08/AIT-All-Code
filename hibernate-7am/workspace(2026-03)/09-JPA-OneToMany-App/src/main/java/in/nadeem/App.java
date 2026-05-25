package in.nadeem;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import in.nadeem.dao.CategoryDAO;
import in.nadeem.dao.impl.CategoryDAOImpl;
import in.nadeem.entities.CategoryEntity;
import in.nadeem.entities.ProductEntity;

public class App {
	public static void main(String[] args) throws Exception {

		CategoryDAO dao = new CategoryDAOImpl();

		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryId(103);
		categoryEntity.setCategoryName("Electronics");

		ProductEntity productEntity1 = new ProductEntity();
		productEntity1.setProductId(104);
		productEntity1.setProductName("Mobile");
		productEntity1.setProductImage(readImage("D:\\images\\mobile3.jpg"));

		ProductEntity productEntity2 = new ProductEntity();
		productEntity2.setProductId(105);
		productEntity2.setProductName("Television");
		productEntity2.setProductImage(readImage("D:\\images\\tv1.jpg"));

		ProductEntity productEntity3 = new ProductEntity();
		productEntity3.setProductId(106);
		productEntity3.setProductName("Oven");
		productEntity3.setProductImage(readImage("D:\\images\\oven.jpg"));

		// Add ProductEntity instances to Collection List<ProductEntity>
		List<ProductEntity> listOfProducts = Arrays.asList(productEntity1, productEntity2, productEntity3);

		// Set the collection to CategoryEntity instance
		categoryEntity.setListOfProducts(listOfProducts);

		dao.saveCategory(categoryEntity);

		/*
		 * CategoryEntity fetchCategory = dao.fetchCategory(101);
		 * 
		 * System.out.println("Category Name : " + fetchCategory.getCategoryName());
		 * 
		 * List<ProductEntity> listOfProducts = fetchCategory.getListOfProducts();
		 * 
		 * for (ProductEntity product : listOfProducts) {
		 * 
		 * System.out.println("Product Id : " + product.getProductId());
		 * 
		 * System.out.println("Product Name : " + product.getProductName());
		 * 
		 * System.out.println("--------------------------");
		 * 
		 * // Get image bytes from DB byte[] bytesOfImage = product.getProductImage();
		 * 
		 * // Create image file File file = new
		 * File("D:\\imgFromDb\\" + product.getProductName() + "_FromDB.jpg");
		 * 
		 * // Write image into file try (FileOutputStream fos = new
		 * FileOutputStream(file)) {
		 * 
		 * fos.write(bytesOfImage); }
		 * 
		 * System.out.println("Please check the image at : " + file.getAbsolutePath());
		 * 
		 * 
		 * 
		 * }
		 */
		// dao.removeCategory(102);
	}

	private static byte[] readImage(String path) throws Exception {

		File file = new File(path);

		byte[] imageBytes = new byte[(int) file.length()];

		try (FileInputStream fis = new FileInputStream(file)) {

			fis.read(imageBytes);
		}

		return imageBytes;

	}

	/*
	 * public static void main(String[] args) throws Exception { CategoryDAO dao =
	 * new CategoryDAOImpl();
	 * 
	 * CategoryEntity categoryEntity = new CategoryEntity();
	 * categoryEntity.setCategoryId(101);
	 * categoryEntity.setCategoryName("Electronics");
	 * 
	 * ProductEntity productEntity1 = new ProductEntity();
	 * 
	 * productEntity1.setProductId(201); productEntity1.setProductName("Mobile");
	 * 
	 * File file = new File("D:\\images\\mobile1.jpg"); byte[] imageBytes_mobile =
	 * new byte[(int) file.length()];
	 * 
	 * FileInputStream fis = new FileInputStream(file); fis.read(imageBytes_mobile);
	 * productEntity1.setProductImage(imageBytes_mobile);
	 * 
	 * ProductEntity productEntity2 = new ProductEntity();
	 * productEntity2.setProductId(301);
	 * productEntity2.setProductName("Television");
	 * 
	 * File file1 = new File("D:\\images\\tv1.jpg"); byte[] imageBytes_tv = new
	 * byte[(int) file1.length()];
	 * 
	 * FileInputStream fis1 = new FileInputStream(file1); fis1.read(imageBytes_tv);
	 * productEntity2.setProductImage(imageBytes_tv);
	 * 
	 * ProductEntity productEntity3 = new ProductEntity();
	 * 
	 * productEntity3.setProductId(401); productEntity3.setProductName("Oven");
	 * 
	 * File file2 = new File("D:\\images\\oven.jpg"); byte[] imageBytes_oven = new
	 * byte[(int) file2.length()];
	 * 
	 * FileInputStream fis2 = new FileInputStream(file2);
	 * fis2.read(imageBytes_oven); productEntity3.setProductImage(imageBytes_oven);
	 * 
	 * List<ProductEntity> listOfProducts = Arrays.asList(productEntity1,
	 * productEntity2, productEntity3);
	 * 
	 * categoryEntity.setListOfProducts(listOfProducts);
	 * 
	 * dao.saveCategory(categoryEntity); }
	 */
}
