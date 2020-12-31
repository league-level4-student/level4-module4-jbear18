package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
EncapsulateTheData e= new EncapsulateTheData();
	@Test
	void test() {
//itemsreceived
	e.setItemsReceived(10);
	assertEquals(10, e.getItemsReceived());
	e.setItemsReceived(-10);
	assertEquals(0, e.getItemsReceived());
	
//degreesturned
	e.setDegreesTurned(330);
	assertEquals(330, e.getDegreesTurned());
	e.setDegreesTurned(400);
	assertEquals(-1, e.getDegreesTurned());
	
//nomenclature
	e.setNomenclature("hi");
	assertEquals("hi", e.getNomenclature());
	e.setNomenclature("");
	assertEquals(" ", e.getNomenclature());
	
//memberobj
	Object newOb= new Object();
	e.setMemberObj(newOb);
	assertEquals(newOb, e.getMemberObj());
	e.setMemberObj("hi");
	assertEquals(e.getMemberObj(), e.getMemberObj());
	}

}
