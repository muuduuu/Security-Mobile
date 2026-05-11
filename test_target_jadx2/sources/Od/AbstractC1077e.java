package Od;

import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: Od.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1077e {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f7318a = kotlin.sequences.j.C(kotlin.sequences.j.c(ServiceLoader.load(Jd.K.class, Jd.K.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f7318a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
