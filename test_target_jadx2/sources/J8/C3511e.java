package j8;

import T6.ComponentCallbacks2C1165c;
import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.p;
import com.google.android.gms.common.util.m;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import j0.C3476a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o8.C3766c;
import o8.n;
import o8.w;
import org.conscrypt.BuildConfig;
import p8.EnumC3853l;
import x8.InterfaceC5135c;

/* renamed from: j8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3511e {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f35896k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f35897l = new C3476a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f35898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35899b;

    /* renamed from: c, reason: collision with root package name */
    private final C3517k f35900c;

    /* renamed from: d, reason: collision with root package name */
    private final n f35901d;

    /* renamed from: g, reason: collision with root package name */
    private final w f35904g;

    /* renamed from: h, reason: collision with root package name */
    private final A8.b f35905h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f35902e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f35903f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f35906i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f35907j = new CopyOnWriteArrayList();

    /* renamed from: j8.e$a */
    public interface a {
        void a(boolean z10);
    }

    /* renamed from: j8.e$b */
    private static class b implements ComponentCallbacks2C1165c.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f35908a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f35908a.get() == null) {
                    b bVar = new b();
                    if (androidx.camera.view.i.a(f35908a, null, bVar)) {
                        ComponentCallbacks2C1165c.c(application);
                        ComponentCallbacks2C1165c.b().a(bVar);
                    }
                }
            }
        }

        @Override // T6.ComponentCallbacks2C1165c.a
        public void a(boolean z10) {
            synchronized (C3511e.f35896k) {
                try {
                    Iterator it = new ArrayList(C3511e.f35897l.values()).iterator();
                    while (it.hasNext()) {
                        C3511e c3511e = (C3511e) it.next();
                        if (c3511e.f35902e.get()) {
                            c3511e.B(z10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: j8.e$c */
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f35909b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f35910a;

        public c(Context context) {
            this.f35910a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f35909b.get() == null) {
                c cVar = new c(context);
                if (androidx.camera.view.i.a(f35909b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f35910a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C3511e.f35896k) {
                try {
                    Iterator it = C3511e.f35897l.values().iterator();
                    while (it.hasNext()) {
                        ((C3511e) it.next()).s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected C3511e(final Context context, String str, C3517k c3517k) {
        this.f35898a = (Context) AbstractC1287s.m(context);
        this.f35899b = AbstractC1287s.g(str);
        this.f35900c = (C3517k) AbstractC1287s.m(c3517k);
        AbstractC3518l b10 = FirebaseInitProvider.b();
        N8.c.b("Firebase");
        N8.c.b("ComponentDiscovery");
        List b11 = o8.f.c(context, ComponentDiscoveryService.class).b();
        N8.c.a();
        N8.c.b("Runtime");
        n.b g10 = n.k(EnumC3853l.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C3766c.s(context, Context.class, new Class[0])).b(C3766c.s(this, C3511e.class, new Class[0])).b(C3766c.s(c3517k, C3517k.class, new Class[0])).g(new N8.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            g10.b(C3766c.s(b10, AbstractC3518l.class, new Class[0]));
        }
        n e10 = g10.e();
        this.f35901d = e10;
        N8.c.a();
        this.f35904g = new w(new A8.b() { // from class: j8.c
            @Override // A8.b
            public final Object get() {
                F8.a y10;
                y10 = C3511e.this.y(context);
                return y10;
            }
        });
        this.f35905h = e10.d(y8.f.class);
        g(new a() { // from class: j8.d
            @Override // j8.C3511e.a
            public final void a(boolean z10) {
                C3511e.this.z(z10);
            }
        });
        N8.c.a();
    }

    private static String A(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f35906i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    private void C() {
        Iterator it = this.f35907j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void h() {
        AbstractC1287s.q(!this.f35903f.get(), "FirebaseApp was deleted");
    }

    private static List k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f35896k) {
            try {
                Iterator it = f35897l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3511e) it.next()).p());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List m(Context context) {
        ArrayList arrayList;
        synchronized (f35896k) {
            arrayList = new ArrayList(f35897l.values());
        }
        return arrayList;
    }

    public static C3511e n() {
        C3511e c3511e;
        synchronized (f35896k) {
            try {
                c3511e = (C3511e) f35897l.get("[DEFAULT]");
                if (c3511e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((y8.f) c3511e.f35905h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3511e;
    }

    public static C3511e o(String str) {
        C3511e c3511e;
        String str2;
        synchronized (f35896k) {
            try {
                c3511e = (C3511e) f35897l.get(A(str));
                if (c3511e == null) {
                    List k10 = k();
                    if (k10.isEmpty()) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", k10);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((y8.f) c3511e.f35905h.get()).l();
            } finally {
            }
        }
        return c3511e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (!p.a(this.f35898a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f35898a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f35901d.n(x());
        ((y8.f) this.f35905h.get()).l();
    }

    public static C3511e t(Context context) {
        synchronized (f35896k) {
            try {
                if (f35897l.containsKey("[DEFAULT]")) {
                    return n();
                }
                C3517k a10 = C3517k.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return u(context, a10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3511e u(Context context, C3517k c3517k) {
        return v(context, c3517k, "[DEFAULT]");
    }

    public static C3511e v(Context context, C3517k c3517k, String str) {
        C3511e c3511e;
        b.c(context);
        String A10 = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f35896k) {
            Map map = f35897l;
            AbstractC1287s.q(!map.containsKey(A10), "FirebaseApp name " + A10 + " already exists!");
            AbstractC1287s.n(context, "Application context cannot be null.");
            c3511e = new C3511e(context, A10, c3517k);
            map.put(A10, c3511e);
        }
        c3511e.s();
        return c3511e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ F8.a y(Context context) {
        return new F8.a(context, r(), (InterfaceC5135c) this.f35901d.a(InterfaceC5135c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(boolean z10) {
        if (z10) {
            return;
        }
        ((y8.f) this.f35905h.get()).l();
    }

    public void D(boolean z10) {
        h();
        if (this.f35902e.compareAndSet(!z10, z10)) {
            boolean d10 = ComponentCallbacks2C1165c.b().d();
            if (z10 && d10) {
                B(true);
            } else {
                if (z10 || !d10) {
                    return;
                }
                B(false);
            }
        }
    }

    public void E(Boolean bool) {
        h();
        ((F8.a) this.f35904g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3511e) {
            return this.f35899b.equals(((C3511e) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f35902e.get() && ComponentCallbacks2C1165c.b().d()) {
            aVar.a(true);
        }
        this.f35906i.add(aVar);
    }

    public int hashCode() {
        return this.f35899b.hashCode();
    }

    public void i() {
        if (this.f35903f.compareAndSet(false, true)) {
            synchronized (f35896k) {
                f35897l.remove(this.f35899b);
            }
            C();
        }
    }

    public Object j(Class cls) {
        h();
        return this.f35901d.a(cls);
    }

    public Context l() {
        h();
        return this.f35898a;
    }

    public String p() {
        h();
        return this.f35899b;
    }

    public C3517k q() {
        h();
        return this.f35900c;
    }

    public String r() {
        return com.google.android.gms.common.util.c.a(p().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return AbstractC1286q.c(this).a("name", this.f35899b).a("options", this.f35900c).toString();
    }

    public boolean w() {
        h();
        return ((F8.a) this.f35904g.get()).b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
