package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {


    @Test
    public void testConstructor(){
        Students students =new Students("Rejaur","32");
        assertEquals("Rejaur",students.getName());
        assertEquals("32",students.getAge());
    }

}