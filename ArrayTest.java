import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest
{
    private Array a;
    private int [] matr = {1,2,3,3,4,4,5,6,6,7};

    @Before
    public void setUp()
    {
        a = new Array(matr);
    }


    @Test
    public void test1()
    {
        assertEquals(10, a.getSize());
        assertEquals(1, a.getElement(0));
        assertEquals(2, a.getElement(1));
        assertEquals(3, a.getElement(2));
        assertEquals(3, a.getElement(3));
        assertEquals(4, a.getElement(4));
        assertEquals(4, a.getElement(5));
        assertEquals(5, a.getElement(6));
        assertEquals(6, a.getElement(7));
        assertEquals(6, a.getElement(8));
        assertEquals(7, a.getElement(9));



    }

    @Test
    public void test2()
    {
        a.removeDuplicates();

        assertEquals(7, a.getSizeResult());

        assertEquals(1, a.getElementResult(0));
        assertEquals(2, a.getElementResult(1));
        assertEquals(3, a.getElementResult(2));
        assertEquals(4, a.getElementResult(3));
        assertEquals(5, a.getElementResult(4));
        assertEquals(6, a.getElementResult(5));
        assertEquals(7, a.getElementResult(6));
    }

    @Test
    public void test3()
    {
        a.print();
    }
}
