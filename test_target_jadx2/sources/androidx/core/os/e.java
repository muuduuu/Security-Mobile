package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class e {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, i iVar) {
            configuration.setLocales((LocaleList) iVar.h());
        }
    }

    public static i a(Configuration configuration) {
        return i.i(a.a(configuration));
    }
}
