package y8;

import D7.AbstractC0789m;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import j8.C3511e;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import n8.InterfaceC3714a;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;
import y8.j;

/* loaded from: classes2.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final A8.b f45360a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f45361b;

    /* renamed from: c, reason: collision with root package name */
    private final A8.b f45362c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f45363d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f45364e;

    private f(final Context context, final String str, Set set, A8.b bVar, Executor executor) {
        this(new o8.w(new A8.b() { // from class: y8.c
            @Override // A8.b
            public final Object get() {
                v j10;
                j10 = f.j(context, str);
                return j10;
            }
        }), set, executor, bVar, context);
    }

    public static C3766c g() {
        final C3762D a10 = C3762D.a(InterfaceC3714a.class, Executor.class);
        return C3766c.d(f.class, i.class, j.class).b(o8.q.j(Context.class)).b(o8.q.j(C3511e.class)).b(o8.q.m(g.class)).b(o8.q.l(I8.i.class)).b(o8.q.k(a10)).f(new o8.g() { // from class: y8.b
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                f h10;
                h10 = f.h(C3762D.this, interfaceC3767d);
                return h10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(C3762D c3762d, InterfaceC3767d interfaceC3767d) {
        return new f((Context) interfaceC3767d.a(Context.class), ((C3511e) interfaceC3767d.a(C3511e.class)).r(), interfaceC3767d.e(g.class), interfaceC3767d.d(I8.i.class), (Executor) interfaceC3767d.g(c3762d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                v vVar = (v) this.f45360a.get();
                List g10 = vVar.g();
                vVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < g10.size(); i10++) {
                    w wVar = (w) g10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", wVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) wVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v j(Context context, String str) {
        return new v(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((v) this.f45360a.get()).s(System.currentTimeMillis(), ((I8.i) this.f45362c.get()).a());
        }
        return null;
    }

    @Override // y8.i
    public Task a() {
        return !androidx.core.os.p.a(this.f45361b) ? AbstractC0789m.g(BuildConfig.FLAVOR) : AbstractC0789m.d(this.f45364e, new Callable() { // from class: y8.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i10;
                i10 = f.this.i();
                return i10;
            }
        });
    }

    @Override // y8.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        v vVar = (v) this.f45360a.get();
        if (!vVar.q(currentTimeMillis)) {
            return j.a.NONE;
        }
        vVar.o();
        return j.a.GLOBAL;
    }

    public Task l() {
        return this.f45363d.size() <= 0 ? AbstractC0789m.g(null) : !androidx.core.os.p.a(this.f45361b) ? AbstractC0789m.g(null) : AbstractC0789m.d(this.f45364e, new Callable() { // from class: y8.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k10;
                k10 = f.this.k();
                return k10;
            }
        });
    }

    f(A8.b bVar, Set set, Executor executor, A8.b bVar2, Context context) {
        this.f45360a = bVar;
        this.f45363d = set;
        this.f45364e = executor;
        this.f45362c = bVar2;
        this.f45361b = context;
    }
}
