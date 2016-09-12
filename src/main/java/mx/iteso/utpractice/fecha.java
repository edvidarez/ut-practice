package mx.iteso.utpractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.lang.Integer.parseInt;

public class fecha {
    public static String convierteFecha(String fecha)
    {
        String d,m,y,dd,mm,yy;
        StringTokenizer st = new StringTokenizer(fecha,"/");
        d = st.nextToken();
        m = st.nextToken();
        y = st.nextToken();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date calendar = Calendar.getInstance().getTime();
        Calendar c;
        try {
             c = new GregorianCalendar(parseInt(y), parseInt(m)-1, 1);
        }
        catch(Exception e)
        {
            c = new GregorianCalendar(2001, 0, 1);
        }

        int maxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
       // System.out.println(maxDays);
        int D,M,Y;
        String FECHA_HOY =   dateFormat.format(calendar);
        try {
            st = new StringTokenizer(FECHA_HOY, "/");
            dd = st.nextToken();
            mm = st.nextToken();
            yy = st.nextToken();
        }
        catch(Exception e)
        {
            return "formato invalido";
        }
            try {
                 D = parseInt(d);
                if(D>maxDays)
                {
                    return "Dia invalido";
                }
            }
            catch(Exception e)
            {
                return "Formato de dia invalido";
            }
         try {

             M = parseInt(m);
                if (M > 12 || M<1) {
                    return "Mes invalido";
                }
        }
        catch(Exception e)
        {
            return "Formato de mes invalido";
        }
        try {
             Y = parseInt(y);
        }
        catch(Exception e)
        {
            return "Formato de año invalido";
        }
            int DD = parseInt(dd);
            int MM = parseInt(mm);
            int YY = parseInt(yy);
            int YR = YY - Y;
            int MR = MM - M;
            int DR = DD - D;

            if(DR<0)
            {
                MR--;
                DR+=30;//unificadopapa
            }
            if(MR<0)
            {
                YR--;
                MR+=12;
            }
            if (YR<0){
                return "Fecha futura";
            }else {
                return YR + " años " + MR + " meses " + DR + " dias";
            }


    }
    public static void main(String[] args)
    {
        System.out.println(convierteFecha("05/11/1996"));
    }
}