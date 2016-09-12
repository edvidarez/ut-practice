
import mx.iteso.utpractice.fecha;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fechaTest {
    @Test
    public void FechaFutura()
    {
        fecha f = new fecha();
        assertEquals("Fecha futura",f.convierteFecha("01/05/2017"));
    }

    @Test
    public void FechaValida()
    {
        fecha f = new fecha();
        assertEquals("19 años 10 meses 7 dias",f.convierteFecha("05/11/1996"));
    }

    @Test
    public void DiaInvalido()
    {
        fecha f = new fecha();
        assertEquals("Dia invalido",f.convierteFecha("34/11/1996"));
    }

    @Test
    public void FormatoDiaInvalido()
    {
        fecha f = new fecha();
        assertEquals("Formato de dia invalido",f.convierteFecha("3A/11/1996"));
    }

    @Test
    public void FormatoMesInvalido()
    {
        fecha f = new fecha();
        assertEquals("Formato de mes invalido",f.convierteFecha("20/1A/1996"));
    }

    @Test
    public void FormatoAnoInvalido()
    {
        fecha f = new fecha();
        assertEquals("Formato de año invalido",f.convierteFecha("20/10/19A6"));
    }

    @Test
    public void MesInvalido()
    {
        fecha f = new fecha();
        assertEquals("Mes invalido",f.convierteFecha("11/13/1996"));
    }




}
