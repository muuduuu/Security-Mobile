package r3;

import android.content.Context;
import b4.k;
import b4.l;
import b4.o;
import b4.p;
import c3.AbstractC1721a;
import java.lang.reflect.InvocationTargetException;
import p5.AbstractC3794a;
import p5.C3796c;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f39209a = c.class;

    /* renamed from: b, reason: collision with root package name */
    private static f f39210b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f39211c = false;

    public static k a() {
        return b().l();
    }

    public static o b() {
        return o.n();
    }

    public static void c(Context context, l lVar) {
        d(context, lVar, null);
    }

    public static void d(Context context, l lVar, b bVar) {
        e(context, lVar, bVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (n4.b.d() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        n4.b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (n4.b.d() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (n4.b.d() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (n4.b.d() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        if (n4.b.d() == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Context context, l lVar, b bVar, boolean z10) {
        if (n4.b.d()) {
            n4.b.a("Fresco#initialize");
        }
        if (f39211c) {
            AbstractC1721a.F(f39209a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f39211c = true;
        }
        p.b(z10);
        if (!AbstractC3794a.c()) {
            if (n4.b.d()) {
                n4.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        try {
                            Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                        } catch (ClassNotFoundException unused) {
                            AbstractC3794a.b(new C3796c());
                        }
                    } catch (NoSuchMethodException unused2) {
                        AbstractC3794a.b(new C3796c());
                    }
                } catch (IllegalAccessException unused3) {
                    AbstractC3794a.b(new C3796c());
                } catch (InvocationTargetException unused4) {
                    AbstractC3794a.b(new C3796c());
                }
            } catch (Throwable th) {
                if (n4.b.d()) {
                    n4.b.b();
                }
                throw th;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (lVar == null) {
            o.w(applicationContext);
        } else {
            o.x(lVar);
        }
        f(applicationContext, bVar);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    private static void f(Context context, b bVar) {
        if (n4.b.d()) {
            n4.b.a("Fresco.initializeDrawee");
        }
        f fVar = new f(context, bVar);
        f39210b = fVar;
        C3.e.g(fVar);
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    public static e g() {
        return f39210b.get();
    }
}
