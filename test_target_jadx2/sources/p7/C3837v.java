package p7;

import D7.AbstractC0777a;
import D7.C0787k;
import D7.InterfaceC0779c;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import T6.C1181k;
import T6.C1182l;
import T6.C1187q;
import V6.AbstractC1287s;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import x7.AbstractC5129l;
import x7.C5118a;
import x7.C5128k;
import x7.InterfaceC5121d;

/* renamed from: p7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3837v extends S6.g implements InterfaceC5121d {

    /* renamed from: k, reason: collision with root package name */
    static final a.g f38469k;

    /* renamed from: l, reason: collision with root package name */
    public static final S6.a f38470l;

    static {
        a.g gVar = new a.g();
        f38469k = gVar;
        f38470l = new S6.a("LocationServices.API", new C3834s(), gVar);
    }

    public C3837v(Context context) {
        super(context, f38470l, a.d.f8818Q, g.a.f8847c);
    }

    private final Task M(final LocationRequest locationRequest, C1181k c1181k) {
        final C3836u c3836u = new C3836u(this, c1181k, new InterfaceC3835t() { // from class: p7.i
            @Override // p7.InterfaceC3835t
            public final void a(C3809d0 c3809d0, C1181k.a aVar, boolean z10, C0787k c0787k) {
                c3809d0.r0(aVar, z10, c0787k);
            }
        });
        return x(C1187q.a().b(new T6.r() { // from class: p7.j
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                S6.a aVar = C3837v.f38470l;
                ((C3809d0) obj).y0(C3836u.this, locationRequest, (C0787k) obj2);
            }
        }).d(c3836u).e(c1181k).c(2436).a());
    }

    @Override // x7.InterfaceC5121d
    public final Task b() {
        return w(AbstractC1191v.a().b(new T6.r() { // from class: p7.n
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                ((C3809d0) obj).x0(new C5128k.a().a(), (C0787k) obj2);
            }
        }).e(2414).a());
    }

    @Override // x7.InterfaceC5121d
    public final Task c(LocationRequest locationRequest, AbstractC5129l abstractC5129l, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1287s.n(looper, "invalid null looper");
        }
        return M(locationRequest, C1182l.a(abstractC5129l, looper, AbstractC5129l.class.getSimpleName()));
    }

    @Override // x7.InterfaceC5121d
    public final Task e(AbstractC5129l abstractC5129l) {
        return y(C1182l.c(abstractC5129l, AbstractC5129l.class.getSimpleName()), 2418).i(new Executor() { // from class: p7.r
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new InterfaceC0779c() { // from class: p7.m
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                S6.a aVar = C3837v.f38470l;
                return null;
            }
        });
    }

    @Override // x7.InterfaceC5121d
    public final Task g(final C5118a c5118a, final AbstractC0777a abstractC0777a) {
        if (abstractC0777a != null) {
            AbstractC1287s.b(!abstractC0777a.a(), "cancellationToken may not be already canceled");
        }
        Task w10 = w(AbstractC1191v.a().b(new T6.r() { // from class: p7.p
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                S6.a aVar = C3837v.f38470l;
                ((C3809d0) obj).w0(C5118a.this, abstractC0777a, (C0787k) obj2);
            }
        }).e(2415).a());
        if (abstractC0777a == null) {
            return w10;
        }
        final C0787k c0787k = new C0787k(abstractC0777a);
        w10.h(new InterfaceC0779c() { // from class: p7.q
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                C0787k c0787k2 = C0787k.this;
                S6.a aVar = C3837v.f38470l;
                if (task.isSuccessful()) {
                    c0787k2.e((Location) task.getResult());
                    return null;
                }
                Exception exception = task.getException();
                exception.getClass();
                c0787k2.d(exception);
                return null;
            }
        });
        return c0787k.a();
    }

    @Override // x7.InterfaceC5121d
    public final Task j(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return A(AbstractC1191v.a().b(new T6.r() { // from class: p7.k
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                S6.a aVar = C3837v.f38470l;
                ((C3809d0) obj).A0(pendingIntent, locationRequest, (C0787k) obj2);
            }
        }).e(2417).a());
    }

    @Override // x7.InterfaceC5121d
    public final Task n(final PendingIntent pendingIntent) {
        return A(AbstractC1191v.a().b(new T6.r() { // from class: p7.o
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                S6.a aVar = C3837v.f38470l;
                ((C3809d0) obj).t0(pendingIntent, (C0787k) obj2, null);
            }
        }).e(2418).a());
    }
}
