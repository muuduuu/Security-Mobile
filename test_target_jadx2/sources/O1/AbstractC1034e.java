package O1;

import android.content.Context;
import java.io.File;

/* renamed from: O1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1034e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6932a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6933b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6934c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6935d = true;

    /* renamed from: f, reason: collision with root package name */
    private static Y1.f f6937f;

    /* renamed from: g, reason: collision with root package name */
    private static Y1.e f6938g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile Y1.h f6939h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile Y1.g f6940i;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadLocal f6941j;

    /* renamed from: e, reason: collision with root package name */
    private static EnumC1030a f6936e = EnumC1030a.AUTOMATIC;

    /* renamed from: k, reason: collision with root package name */
    private static S1.b f6942k = new S1.c();

    public static void b(String str) {
        if (f6933b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f6933b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static EnumC1030a d() {
        return f6936e;
    }

    public static boolean e() {
        return f6935d;
    }

    public static S1.b f() {
        return f6942k;
    }

    private static b2.h g() {
        b2.h hVar = (b2.h) f6941j.get();
        if (hVar != null) {
            return hVar;
        }
        b2.h hVar2 = new b2.h();
        f6941j.set(hVar2);
        return hVar2;
    }

    public static boolean h() {
        return f6933b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File i(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static Y1.g j(Context context) {
        if (!f6934c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        Y1.g gVar = f6940i;
        if (gVar == null) {
            synchronized (Y1.g.class) {
                try {
                    gVar = f6940i;
                    if (gVar == null) {
                        Y1.e eVar = f6938g;
                        if (eVar == null) {
                            eVar = new Y1.e() { // from class: O1.d
                                @Override // Y1.e
                                public final File a() {
                                    File i10;
                                    i10 = AbstractC1034e.i(applicationContext);
                                    return i10;
                                }
                            };
                        }
                        gVar = new Y1.g(eVar);
                        f6940i = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static Y1.h k(Context context) {
        Y1.h hVar = f6939h;
        if (hVar == null) {
            synchronized (Y1.h.class) {
                try {
                    hVar = f6939h;
                    if (hVar == null) {
                        Y1.g j10 = j(context);
                        Y1.f fVar = f6937f;
                        if (fVar == null) {
                            fVar = new Y1.b();
                        }
                        hVar = new Y1.h(j10, fVar);
                        f6939h = hVar;
                    }
                } finally {
                }
            }
        }
        return hVar;
    }
}
