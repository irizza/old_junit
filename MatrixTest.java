import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest
{
    private Matrix m1;



    @Before
    public void setUp()
    {
        m1 = new Matrix( 6, 6);
    }



    @Test
    public void test4()
    {
        m1.print();


    }


}
