import java.util.Date;

public class Order {

	private int account_id;
	private String order_id;
	private Date creationDate;
	private String commerceItemId;
	private String productId;
	private String skuId;
	private int quantity;

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
