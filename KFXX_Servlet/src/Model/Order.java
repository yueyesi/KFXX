package Model;
/**
 * ∂©µ•¿‡
 */
import java.sql.Date;

public class Order {
		private int OrderID;
		private int ProductID;
		private int OrderNumber;
		private Date SellTime;
		private float Discount;
		private float SellPrice;
		private float SumPrice;
		public int getOrderID() {
			return OrderID;
		}
		public void setOrderID(int orderID) {
			OrderID = orderID;
		}
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public int getOrderNumber() {
			return OrderNumber;
		}
		public void setOrderNumber(int orderNumber) {
			OrderNumber = orderNumber;
		}
		public Date getSellTime() {
			return SellTime;
		}
		public void setSellTime(Date sellTime) {
			SellTime = sellTime;
		}
		public float getDiscount() {
			return Discount;
		}
		public void setDiscount(float discount) {
			Discount = discount;
		}
		public float getSellPrice() {
			return SellPrice;
		}
		public void setSellPrice(float sellPrice) {
			SellPrice = sellPrice;
		}
		public float getSumPrice() {
			return SumPrice;
		}
		public void setSumPrice(float sumPrice) {
			SumPrice = sumPrice;
		}
		
		

}
