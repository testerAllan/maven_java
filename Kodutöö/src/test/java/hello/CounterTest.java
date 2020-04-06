package hello;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class CounterTest 
{

    //Counter counter = new Counter(); // Välja kommenteeritud on test, kus ei kasuta mocki
    @Mock
    Counter counterMock; //Küsimus 3: Kas siin on mocki tegemine vajalik? Counter ei kasuta ühtegi teist klassi ju.
     
    @Test
    public void saveTest()
    {

        int saved = counterMock.nameLength("Jaanus");// Küsimus 7: Miks "saved" väärtus tuleb 0, kas counterMock ei kasuta mitte mingit loogikat Counter klassist?
        assertEquals(0, saved); 
        //int saved = counter.nameLength("Jaanus");
        //assertEquals(6, saved);
    }
}