package w0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j0.i;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w0.g;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final j0.h f44241a = new j0.h(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f44242b = h.a("fonts-androidx", 10, ModuleDescriptor.MODULE_VERSION);

    /* renamed from: c, reason: collision with root package name */
    static final Object f44243c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final i f44244d = new i();

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f44246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0.e f44247c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44248d;

        a(String str, Context context, w0.e eVar, int i10) {
            this.f44245a = str;
            this.f44246b = context;
            this.f44247c = eVar;
            this.f44248d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f44245a, this.f44246b, this.f44247c, this.f44248d);
        }
    }

    class b implements InterfaceC5159a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5015a f44249a;

        b(C5015a c5015a) {
            this.f44249a = c5015a;
        }

        @Override // y0.InterfaceC5159a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f44249a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44250a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f44251b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0.e f44252c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44253d;

        c(String str, Context context, w0.e eVar, int i10) {
            this.f44250a = str;
            this.f44251b = context;
            this.f44252c = eVar;
            this.f44253d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f44250a, this.f44251b, this.f44252c, this.f44253d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements InterfaceC5159a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44254a;

        d(String str) {
            this.f44254a = str;
        }

        @Override // y0.InterfaceC5159a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f44243c) {
                try {
                    i iVar = f.f44244d;
                    ArrayList arrayList = (ArrayList) iVar.get(this.f44254a);
                    if (arrayList == null) {
                        return;
                    }
                    iVar.remove(this.f44254a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((InterfaceC5159a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(w0.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, w0.e eVar, int i10) {
        j0.h hVar = f44241a;
        Typeface typeface = (Typeface) hVar.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e10 = AbstractC5018d.e(context, eVar, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = androidx.core.graphics.h.b(context, null, e10.b(), i10);
            if (b11 == null) {
                return new e(-3);
            }
            hVar.d(str, b11);
            return new e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, w0.e eVar, int i10, Executor executor, C5015a c5015a) {
        String a10 = a(eVar, i10);
        Typeface typeface = (Typeface) f44241a.c(a10);
        if (typeface != null) {
            c5015a.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c5015a);
        synchronized (f44243c) {
            try {
                i iVar = f44244d;
                ArrayList arrayList = (ArrayList) iVar.get(a10);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                iVar.put(a10, arrayList2);
                c cVar = new c(a10, context, eVar, i10);
                if (executor == null) {
                    executor = f44242b;
                }
                h.b(executor, cVar, new d(a10));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, w0.e eVar, C5015a c5015a, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface typeface = (Typeface) f44241a.c(a10);
        if (typeface != null) {
            c5015a.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e c10 = c(a10, context, eVar, i10);
            c5015a.b(c10);
            return c10.f44255a;
        }
        try {
            e eVar2 = (e) h.c(f44242b, new a(a10, context, eVar, i10), i11);
            c5015a.b(eVar2);
            return eVar2.f44255a;
        } catch (InterruptedException unused) {
            c5015a.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f44255a;

        /* renamed from: b, reason: collision with root package name */
        final int f44256b;

        e(int i10) {
            this.f44255a = null;
            this.f44256b = i10;
        }

        boolean a() {
            return this.f44256b == 0;
        }

        e(Typeface typeface) {
            this.f44255a = typeface;
            this.f44256b = 0;
        }
    }
}
