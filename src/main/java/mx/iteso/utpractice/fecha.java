package mx.iteso.utpractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.lang.Integer.parseInt;

public class fecha {
    public static String convierteFecha(String fecha)
    {
        String d,m,y,dd,mm,yy;
        StringTokenizer st = new StringTokenizer(fecha,"/");
        y = st.nextToken();
        m = st.nextToken();
        d = st.nextToken();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date calendar = Calendar.getInstance().getTime();
        String FECHA_HOY =   dateFormat.format(calendar);
        st = new StringTokenizer(FECHA_HOY,"/");
        yy = st.nextToken();
        mm = st.nextToken();
        dd = st.nextToken();
        int D = parseInt(d);
        int M = parseInt(m);
        int Y = parseInt(y);
        int DD =parseInt(dd);
        int MM =parseInt(mm);
        int YY =parseInt(yy);
        int YR = YY-Y;
        int MR = MM-M;
        int DR = DD-D;

        return YR+" años "+ MR + " meses "+ DR + " dias ";
    }
    public static void main(String[] args)
    {
        System.out.println(convierteFecha("2010/06/24"));
    }
}