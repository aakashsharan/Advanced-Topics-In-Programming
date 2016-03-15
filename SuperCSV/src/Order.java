import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

	private int accountId;
	private String orderId;
	private String creationDate;
	private String commerceItemId;
	private String productId;
	private String skuId;
	private int quantity;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		try{
			String[] dateFormat = creationDate.split("");
			String formatteDate = dateFormat[0];
			this.creationDate = formatteDate;
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
	}

	public String getCommerceItemId() {
		return commerceItemId;
	}

	public void setCommerceItemId(String commerceItemId) {
		this.commerceItemId = commerceItemId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
