package S6;

import S6.a;
import T6.C0;
import T6.C1175h;
import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import T6.InterfaceC1188s;
import T6.x0;
import V6.AbstractC1287s;
import V6.C1271e;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.common.api.internal.AbstractC2006a;
import j0.C3476a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f8852a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f8853a;

        /* renamed from: d, reason: collision with root package name */
        private int f8856d;

        /* renamed from: e, reason: collision with root package name */
        private View f8857e;

        /* renamed from: f, reason: collision with root package name */
        private String f8858f;

        /* renamed from: g, reason: collision with root package name */
        private String f8859g;

        /* renamed from: i, reason: collision with root package name */
        private final Context f8861i;

        /* renamed from: k, reason: collision with root package name */
        private C1175h f8863k;

        /* renamed from: m, reason: collision with root package name */
        private c f8865m;

        /* renamed from: n, reason: collision with root package name */
        private Looper f8866n;

        /* renamed from: b, reason: collision with root package name */
        private final Set f8854b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f8855c = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        private final Map f8860h = new C3476a();

        /* renamed from: j, reason: collision with root package name */
        private final Map f8862j = new C3476a();

        /* renamed from: l, reason: collision with root package name */
        private int f8864l = -1;

        /* renamed from: o, reason: collision with root package name */
        private C2017i f8867o = C2017i.q();

        /* renamed from: p, reason: collision with root package name */
        private a.AbstractC0172a f8868p = A7.d.f387c;

        /* renamed from: q, reason: collision with root package name */
        private final ArrayList f8869q = new ArrayList();

        /* renamed from: r, reason: collision with root package name */
        private final ArrayList f8870r = new ArrayList();

        public a(Context context) {
            this.f8861i = context;
            this.f8866n = context.getMainLooper();
            this.f8858f = context.getPackageName();
            this.f8859g = context.getClass().getName();
        }

        public a a(S6.a aVar) {
            AbstractC1287s.n(aVar, "Api must not be null");
            this.f8862j.put(aVar, null);
            List a10 = ((a.e) AbstractC1287s.n(aVar.c(), "Base client builder must not be null")).a(null);
            this.f8855c.addAll(a10);
            this.f8854b.addAll(a10);
            return this;
        }

        public a b(b bVar) {
            AbstractC1287s.n(bVar, "Listener must not be null");
            this.f8869q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            AbstractC1287s.n(cVar, "Listener must not be null");
            this.f8870r.add(cVar);
            return this;
        }

        public h d() {
            AbstractC1287s.b(!this.f8862j.isEmpty(), "must call addApi() to add at least one API");
            C1271e e10 = e();
            Map k10 = e10.k();
            C3476a c3476a = new C3476a();
            C3476a c3476a2 = new C3476a();
            ArrayList arrayList = new ArrayList();
            S6.a aVar = null;
            boolean z10 = false;
            for (S6.a aVar2 : this.f8862j.keySet()) {
                Object obj = this.f8862j.get(aVar2);
                boolean z11 = k10.get(aVar2) != null;
                c3476a.put(aVar2, Boolean.valueOf(z11));
                C0 c02 = new C0(aVar2, z11);
                arrayList.add(c02);
                a.AbstractC0172a abstractC0172a = (a.AbstractC0172a) AbstractC1287s.m(aVar2.a());
                a.f c10 = abstractC0172a.c(this.f8861i, this.f8866n, e10, obj, c02, c02);
                c3476a2.put(aVar2.b(), c10);
                if (abstractC0172a.b() == 1) {
                    z10 = obj != null;
                }
                if (c10.b()) {
                    if (aVar != null) {
                        throw new IllegalStateException(aVar2.d() + " cannot be used with " + aVar.d());
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                if (z10) {
                    throw new IllegalStateException("With using " + aVar.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                AbstractC1287s.r(this.f8853a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.d());
                AbstractC1287s.r(this.f8854b.equals(this.f8855c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.d());
            }
            com.google.android.gms.common.api.internal.u uVar = new com.google.android.gms.common.api.internal.u(this.f8861i, new ReentrantLock(), this.f8866n, e10, this.f8867o, this.f8868p, c3476a, this.f8869q, this.f8870r, c3476a2, this.f8864l, com.google.android.gms.common.api.internal.u.r(c3476a2.values(), true), arrayList);
            synchronized (h.f8852a) {
                h.f8852a.add(uVar);
            }
            if (this.f8864l >= 0) {
                x0.t(this.f8863k).u(this.f8864l, uVar, this.f8865m);
            }
            return uVar;
        }

        public final C1271e e() {
            A7.a aVar = A7.a.f375j;
            Map map = this.f8862j;
            S6.a aVar2 = A7.d.f391g;
            if (map.containsKey(aVar2)) {
                aVar = (A7.a) this.f8862j.get(aVar2);
            }
            return new C1271e(this.f8853a, this.f8854b, this.f8860h, this.f8856d, this.f8857e, this.f8858f, this.f8859g, aVar, false);
        }
    }

    public interface b extends InterfaceC1169e {
    }

    public interface c extends InterfaceC1184n {
    }

    public static Set i() {
        Set set = f8852a;
        synchronized (set) {
        }
        return set;
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC2006a g(AbstractC2006a abstractC2006a);

    public abstract AbstractC2006a h(AbstractC2006a abstractC2006a);

    public a.f j(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract Looper k();

    public abstract boolean l();

    public boolean m(InterfaceC1188s interfaceC1188s) {
        throw new UnsupportedOperationException();
    }

    public void n() {
        throw new UnsupportedOperationException();
    }

    public abstract void o(c cVar);

    public abstract void p(c cVar);
}
