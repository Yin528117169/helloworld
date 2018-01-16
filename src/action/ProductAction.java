package action;

import java.util.List;

import com.yin.dao.ProductDao;
import com.yin.pojo.Product;

public class ProductAction {
	
	ProductDao dao = new ProductDao();
	Product product;
	List<Product> products;

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public String add() {
		dao.add(product);
		return "list";
	}
	
	public String edit() {
		product = dao.get(product.getId());
		return "edit";
	}
	public String delete() {
		dao.delete(product.getId());
		return "list";
	}
	public String update() {
		dao.update(product);
		return "list";
	}
	public String list() {
		products = dao.listProduct();
		return "listJsp";
	}
}
