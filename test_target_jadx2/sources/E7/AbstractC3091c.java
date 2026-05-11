package e7;

import V6.AbstractC1287s;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.AbstractC2022n;

/* renamed from: e7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3091c {

    /* renamed from: a, reason: collision with root package name */
    private final String f32252a;

    /* renamed from: b, reason: collision with root package name */
    private Object f32253b;

    /* renamed from: e7.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected AbstractC3091c(String str) {
        this.f32252a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) {
        if (this.f32253b == null) {
            AbstractC1287s.m(context);
            Context e10 = AbstractC2022n.e(context);
            if (e10 == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f32253b = a((IBinder) e10.getClassLoader().loadClass(this.f32252a).newInstance());
            } catch (ClassNotFoundException e11) {
                throw new a("Could not load creator class.", e11);
            } catch (IllegalAccessException e12) {
                throw new a("Could not access creator.", e12);
            } catch (InstantiationException e13) {
                throw new a("Could not instantiate creator.", e13);
            }
        }
        return this.f32253b;
    }
}
