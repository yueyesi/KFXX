package Model;
/**
 * ��Ʒ��
 */
import java.util.Date;

public class ProductBean {
	private int ProductID;//��ƷID
	private String ProductName;//��Ʒ��
	private String ProductCategory;//��Ʒ���
	private float StockPrice;//��Ʒ�����۸�
	private float SellPrice;//��Ʒ�۳��۸�
	private int Inventory;//��Ʒ���
	private Date date;//��Ʒ����ʱ��
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
