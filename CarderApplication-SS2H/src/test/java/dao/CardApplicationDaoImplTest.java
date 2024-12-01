package dao;



import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Impl.CardApplicationDaoImpl;
import entity.CardApplication;

public class CardApplicationDaoImplTest {
	private static CardApplicationDaoImpl cdi=new CardApplicationDaoImpl();
	
	
	
	
	@Test
	public void addTest()
	{
		cdi.add(new CardApplication("a006","linda","0313","女","a0800121","新莊","0916116","0908","板信分行"));
		System.out.println("success");
	}
	
	//@Test
	public void selectAllTest()
	{
		List<CardApplication> l=cdi.selectAll();
		
		for(CardApplication c:l)
		{
			System.out.println("number:"+c.getNumber()+"\tname:"+c.getName());
		}
	}
	
	//@Test
	public void selectByTest()
	{
		List<CardApplication> l=cdi.selectBy(1);
		
		for(CardApplication c:l)
		{
			System.out.println("id:"+c.getId()+"\tunmber:"+c.getNumber());
		}
	}

	//@Test
	public void selectCardApplication()
	{
		List<CardApplication> l=cdi.selectCardApplication("a001", "F010203");
		
		for(CardApplication c:l)
		{
			System.out.println("number:"+c.getNumber()+"\tindentitycard:"+c.getIndentitycard());
		}
	}
	
	//@Test
	public void selectbyNumberTest() {
		List<CardApplication> l=cdi.selectbyNumber("a004");
		
		for(CardApplication c:l)
		{
			System.out.println("id:"+c.getId()+"\tnumber:"+c.getNumber());
		}
	}
	
	//@Test
	public void updateTest() {
		List<CardApplication> l=cdi.selectBy(3);
		CardApplication c=l.get(0);
		c.setName("茉莉");
		c.setIndentitycard("s1212121");
		c.setPhone("0946717");
		
		cdi.update(c);
		System.out.println("success");
	
		
	}
	
	//@Test
	public void deledtTest()
	{
		List<CardApplication> l=cdi.selectBy(5);
		CardApplication c=l.get(0);
		
		cdi.delete(c);
		
		System.out.println("success");
	}
}
