package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static long f15977a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f15978b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f15979c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f15980d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f15981e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f15977a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f15978b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f15979c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f15980d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f15981e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
