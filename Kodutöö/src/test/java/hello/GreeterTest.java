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

@RunWith(MockitoJUnitRunner.class) // Küsimus 4: Kas sellel on mingi põhjus või see lihtsalt peab alati olema, kui kasutan Mockitot?
public class GreeterTest 
{
    @InjectMocks // Küsimus 1: Kas see siin tekitab Greeter objekti, mis edaspidi kasutab Counter klassi "mocki"(koopiat) ?
    Greeter greeterMock; // Küsimus 1: Ehk InjectMocks loob objetci, mis automaatselt hakkab kasutama edaspidi loodud mocke, mida Greeter klass funksioon sayHello() kasutab.

    @Mock // Küsimus 2: Kas see Mock on vajalik? Test kasutab ainult greeterMock objecti ju.
    Counter counterMock;
     
    @Test
    public void saveTest()
    {
        // when(counterMock.nameLength("Jaanus")).thenReturn(6); // Küsimus 5: Seda peaksin kasutama siis, kui näiteks Counter suhtleb andmebaasiga ja testis ma ei taha, et ta seda teeks?
        assertThat(greeterMock.sayHello("Jaanus"), containsString("Tere")); // Küsimus 6: Kas see osa siin nüüd ei kasuta või ei tekita Counter klassi objekti greeterMock.sayHello("Jaanus") sees?

    }
}
