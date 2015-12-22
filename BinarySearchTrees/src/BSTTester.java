import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Aakash
 *
 */
public class BSTTester {

	
	BST bst;
	
	@Before
	public void setUp() throws Exception{
		bst = new BST();
	}
	
	@Test
	public void testInsert() throws DuplicateException{
		bst.insert(5);
		assertEquals("check insert", true, bst.lookUp(5));
		
		try{
			bst.insert(5);
			fail("Value already exists");
		}
		catch(DuplicateException e){
			
		}
		
	}
	

}
