package Ga;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final List f2988a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2989b;

    public d(List logHandlers) {
        Intrinsics.checkNotNullParameter(logHandlers, "logHandlers");
        this.f2988a = logHandlers;
        this.f2989b = 4;
    }

    public static /* synthetic */ void b(d dVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        dVar.a(str, th);
    }

    private final void d(c cVar, String str, Throwable th) {
        if (c.Companion.a(cVar) >= this.f2989b) {
            Iterator it = this.f2988a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(cVar, str, th);
            }
        }
    }

    static /* synthetic */ void e(d dVar, c cVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        dVar.d(cVar, str, th);
    }

    public static /* synthetic */ void g(d dVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        dVar.f(str, th);
    }

    public final void a(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        d(c.Error, message, th);
    }

    public final void c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        e(this, c.Info, message, null, 4, null);
    }

    public final void f(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        d(c.Warn, message, th);
    }
}
