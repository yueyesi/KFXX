package Model;
/**
 * 商品类
 */
import java.util.Date;

public class ProductBean {
	private int ProductID;//商品ID
	private String ProductName;//商品名
	private String ProductCategory;//商品类别
	private float StockPrice;//商品进货价格
	private float SellPrice;//商品售出价格
	private int Inventory;//商品库存
	private Date date;//商品进货时间
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public float getStockPrice() {
		return StockPrice;
	}
	public void setStockPrice(float stockPrice) {
		StockPrice = stockPrice;
	}
	public float getSellPrice() {
		return SellPrice;
	}
	public void setSellPrice(float sellPrice) {
		SellPrice = sellPrice;
	}
	public int getInventory() {
		return Inventory;
	}
	public void setInventory(int inventory) {
		Inventory = inventory;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
