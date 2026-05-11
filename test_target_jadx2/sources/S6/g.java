package S6;

import D7.C0787k;
import S6.a;
import T6.AbstractC1191v;
import T6.AbstractServiceConnectionC1183m;
import T6.B;
import T6.C1161a;
import T6.C1163b;
import T6.C1171f;
import T6.C1181k;
import T6.C1187q;
import T6.InterfaceC1189t;
import T6.N;
import T6.T;
import T6.n0;
import V6.AbstractC1267c;
import V6.AbstractC1287s;
import V6.C1271e;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC2006a;
import com.google.android.gms.tasks.Task;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8838b;

    /* renamed from: c, reason: collision with root package name */
    private final S6.a f8839c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f8840d;

    /* renamed from: e, reason: collision with root package name */
    private final C1163b f8841e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f8842f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8843g;

    /* renamed from: h, reason: collision with root package name */
    private final h f8844h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1189t f8845i;

    /* renamed from: j, reason: collision with root package name */
    protected final C1171f f8846j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f8847c = new C0174a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1189t f8848a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f8849b;

        /* renamed from: S6.g$a$a, reason: collision with other inner class name */
        public static class C0174a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC1189t f8850a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f8851b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f8850a == null) {
                    this.f8850a = new C1161a();
                }
                if (this.f8851b == null) {
                    this.f8851b = Looper.getMainLooper();
                }
                return new a(this.f8850a, this.f8851b);
            }

            public C0174a b(Looper looper) {
                AbstractC1287s.n(looper, "Looper must not be null.");
                this.f8851b = looper;
                return this;
            }

            public C0174a c(InterfaceC1189t interfaceC1189t) {
                AbstractC1287s.n(interfaceC1189t, "StatusExceptionMapper must not be null.");
                this.f8850a = interfaceC1189t;
                return this;
            }
        }

        private a(InterfaceC1189t interfaceC1189t, Account account, Looper looper) {
            this.f8848a = interfaceC1189t;
            this.f8849b = looper;
        }
    }

    public g(Activity activity, S6.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final AbstractC2006a K(int i10, AbstractC2006a abstractC2006a) {
        abstractC2006a.n();
        this.f8846j.C(this, i10, abstractC2006a);
        return abstractC2006a;
    }

    private final Task L(int i10, AbstractC1191v abstractC1191v) {
        C0787k c0787k = new C0787k();
        this.f8846j.D(this, i10, abstractC1191v, c0787k, this.f8845i);
        return c0787k.a();
    }

    public Task A(AbstractC1191v abstractC1191v) {
        return L(1, abstractC1191v);
    }

    protected String B(Context context) {
        return null;
    }

    public final C1163b C() {
        return this.f8841e;
    }

    public a.d D() {
        return this.f8840d;
    }

    public Context E() {
        return this.f8837a;
    }

    protected String F() {
        return this.f8838b;
    }

    public Looper G() {
        return this.f8842f;
    }

    public final int H() {
        return this.f8843g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f I(Looper looper, N n10) {
        C1271e a10 = s().a();
        a.f c10 = ((a.AbstractC0172a) AbstractC1287s.m(this.f8839c.a())).c(this.f8837a, looper, a10, this.f8840d, n10, n10);
        String F10 = F();
        if (F10 != null && (c10 instanceof AbstractC1267c)) {
            ((AbstractC1267c) c10).U(F10);
        }
        if (F10 == null || !(c10 instanceof AbstractServiceConnectionC1183m)) {
            return c10;
        }
        android.support.v4.media.session.b.a(c10);
        throw null;
    }

    public final n0 J(Context context, Handler handler) {
        return new n0(context, handler, s().a());
    }

    public h r() {
        return this.f8844h;
    }

    protected C1271e.a s() {
        C1271e.a aVar = new C1271e.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f8837a.getClass().getName());
        aVar.b(this.f8837a.getPackageName());
        return aVar;
    }

    public AbstractC2006a t(AbstractC2006a abstractC2006a) {
        K(2, abstractC2006a);
        return abstractC2006a;
    }

    public Task u(AbstractC1191v abstractC1191v) {
        return L(2, abstractC1191v);
    }

    public AbstractC2006a v(AbstractC2006a abstractC2006a) {
        K(0, abstractC2006a);
        return abstractC2006a;
    }

    public Task w(AbstractC1191v abstractC1191v) {
        return L(0, abstractC1191v);
    }

    public Task x(C1187q c1187q) {
        AbstractC1287s.m(c1187q);
        AbstractC1287s.n(c1187q.f9461a.b(), "Listener has already been released.");
        AbstractC1287s.n(c1187q.f9462b.a(), "Listener has already been released.");
        return this.f8846j.w(this, c1187q.f9461a, c1187q.f9462b, c1187q.f9463c);
    }

    public Task y(C1181k.a aVar, int i10) {
        AbstractC1287s.n(aVar, "Listener key cannot be null.");
        return this.f8846j.x(this, aVar, i10);
    }

    public AbstractC2006a z(AbstractC2006a abstractC2006a) {
        K(1, abstractC2006a);
        return abstractC2006a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Activity activity, S6.a aVar, a.d dVar, InterfaceC1189t interfaceC1189t) {
        this(activity, aVar, dVar, r0.a());
        a.C0174a c0174a = new a.C0174a();
        c0174a.c(interfaceC1189t);
        c0174a.b(activity.getMainLooper());
    }

    private g(Context context, Activity activity, S6.a aVar, a.d dVar, a aVar2) {
        String B10;
        AbstractC1287s.n(context, "Null context is not permitted.");
        AbstractC1287s.n(aVar, "Api must not be null.");
        AbstractC1287s.n(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC1287s.n(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f8837a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            B10 = context.getAttributionTag();
        } else {
            B10 = B(context);
        }
        this.f8838b = B10;
        this.f8839c = aVar;
        this.f8840d = dVar;
        this.f8842f = aVar2.f8849b;
        C1163b a10 = C1163b.a(aVar, dVar, B10);
        this.f8841e = a10;
        this.f8844h = new T(this);
        C1171f u10 = C1171f.u(context2);
        this.f8846j = u10;
        this.f8843g = u10.l();
        this.f8845i = aVar2.f8848a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            B.u(activity, u10, a10);
        }
        u10.H(this);
    }

    public g(Context context, S6.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context, S6.a aVar, a.d dVar, InterfaceC1189t interfaceC1189t) {
        this(context, aVar, dVar, r0.a());
        a.C0174a c0174a = new a.C0174a();
        c0174a.c(interfaceC1189t);
    }
}
