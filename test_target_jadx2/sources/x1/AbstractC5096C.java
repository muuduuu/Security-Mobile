package x1;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: x1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5096C {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44673a = n.i("WorkerFactory");

    /* renamed from: x1.C$a */
    class a extends AbstractC5096C {
        a() {
        }

        @Override // x1.AbstractC5096C
        public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static AbstractC5096C c() {
        return new a();
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        androidx.work.c a10 = a(context, str, workerParameters);
        if (a10 == null) {
            try {
                cls = Class.forName(str).asSubclass(androidx.work.c.class);
            } catch (Throwable th) {
                n.e().d(f44673a, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a10 = (androidx.work.c) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    n.e().d(f44673a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a10 == null || !a10.l()) {
            return a10;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
