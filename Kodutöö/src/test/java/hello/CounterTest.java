package hello;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
 
import com.howtodoinjava.demo.mockito.DatabaseDAO;
import com.howtodoinjava.demo.mockito.NetworkDAO;
import com.howtodoinjava.demo.mockito.RecordService;
 
@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest 
{
    //@InjectMocks
    @Mock
    Counter counterMock;
     
    @Test
    public void saveTest()
    {
        String saved = counterMock.nameLength("Jaanus");
        assertEquals("Tere", saved);
         
        verify(counterMock.nameLength, times(1)).save("temp.txt"); // hows
    }
}