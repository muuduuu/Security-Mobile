package T5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.conscrypt.BuildConfig;
import v5.p;

/* loaded from: classes2.dex */
public abstract class d {
    public static String a(D5.j jVar) {
        String str;
        String str2;
        String name = jVar.q().getName();
        if (c(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!d(name)) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, f.C(jVar), str2);
    }

    public static Object b(D5.j jVar) {
        Class q10 = jVar.q();
        Class S10 = f.S(q10);
        if (S10 != null) {
            return f.l(S10);
        }
        if (jVar.A() || jVar.b()) {
            return p.a.NON_EMPTY;
        }
        if (q10 == String.class) {
            return BuildConfig.FLAVOR;
        }
        if (jVar.J(Date.class)) {
            return new Date(0L);
        }
        if (!jVar.J(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    private static boolean c(String str) {
        return str.startsWith("java.time.");
    }

    private static boolean d(String str) {
        return str.startsWith("org.joda.time.");
    }
}
