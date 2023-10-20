package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table table=new Table();
    @Test
    public void setUp(){

        table.setFirstName("Rejaur");
        table.setLastName("Rahman");
        table.setAddress("New York");
        table.setCell("123456789");
    }

    public void test_firstname_lastname_address_cell(){

       assertEquals("Rejaur",table.getFirstName());
       assertEquals("Rahman",table.getLastName());
       assertEquals("New York",table.getAddress());
       assertEquals("123456789",table.getCell());
    }




}