import java.io.FileReader;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class ReadingCSV {

	private static final String CSV_FILENAME = "";
	
	public static void main(String[] args) {
		
	}
	
	public static CellProcessor[] getProcessors(){
		
		final CellProcessor[] processors = new CellProcessor[] {
				new NotNull(), //accountId
				new NotNull(), //orderId
				new ParseDate("dd/MM/yyyy"), //creationDate
				new Optional(), //commerceItemId
				new NotNull(), //productId
				new NotNull(), //skuId
				new NotNull(), //quantity
				
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
				System.out.println(String.format("lineNo=%s, rowNo=%s, order=%s", beanReader.getLineNumber(), beanReader.getRowNumber(), order));
			}
			
		}
		finally{
			if (beanReader != null){
				beanReader.close();
			}
		}
	}
	
}
