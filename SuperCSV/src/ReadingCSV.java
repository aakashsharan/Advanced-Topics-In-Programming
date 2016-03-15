import java.io.FileReader;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class ReadingCSV {

	private static final String CSV_FILENAME = "C:/Users/Aakash/Documents/GitHub/java-practice/SuperCSV/data/DatFile.csv";
	
	public static void main(String[] args) throws Exception {
		readUsingCSVBeanReader();
	}
	
	public static CellProcessor[] getProcessors(){
		
		final CellProcessor[] processors = new CellProcessor[] {
				new NotNull(new ParseInt()), //accountId
				new NotNull(), //orderId
				new NotNull(), //creationDate
				new Optional(), //commerceItemId
				new NotNull(), //productId
				new NotNull(), //skuId
				new NotNull(new ParseInt()), //quantity
				
		};
		return processors;
	}
	
	public static void readUsingCSVBeanReader() throws Exception{
		ICsvBeanReader beanReader = null;
		try{
			beanReader = new CsvBeanReader(new FileReader(CSV_FILENAME), CsvPreference.STANDARD_PREFERENCE);
			final String[] header = beanReader.getHeader(true);
			final CellProcessor[] processors = getProcessors();
			
			Order order;
			while((order = beanReader.read(Order.class, header, processors)) != null){
				System.out.println(String.format("lineNo=%s, rowNo=%s, acountId=%s, orderId=%s, creationDate=%s, commerceItemId=%s, productId=%s, skuId=%s, qty=%s", beanReader.getLineNumber(), beanReader.getRowNumber(), order.getAccountId(), order.getOrderId(), order.getCreationDate(),  order.getCommerceItemId(), order.getProductId(), order.getSkuId(), order.getQuantity()));
			}
			
		}
		finally{
			if (beanReader != null){
				beanReader.close();
			}
		}
	}
	
}
