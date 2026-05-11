package f9;

import D7.AbstractC0789m;
import D7.C0778b;
import D7.InterfaceC0782f;
import V6.AbstractC1287s;
import V6.C1279j;
import X8.AbstractC1300f;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1598o;
import b8.C1659f;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;
import s7.C4402k5;

/* loaded from: classes2.dex */
public abstract class e implements Closeable, InterfaceC1598o {

    /* renamed from: f, reason: collision with root package name */
    private static final C1279j f32888f = new C1279j("MobileVisionBase", BuildConfig.FLAVOR);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f32889g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f32890a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1300f f32891b;

    /* renamed from: c, reason: collision with root package name */
    private final C0778b f32892c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f32893d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f32894e;

    public e(AbstractC1300f abstractC1300f, Executor executor) {
        this.f32891b = abstractC1300f;
        C0778b c0778b = new C0778b();
        this.f32892c = c0778b;
        this.f32893d = executor;
        abstractC1300f.c();
        this.f32894e = abstractC1300f.a(executor, new Callable() { // from class: f9.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = e.f32889g;
                return null;
            }
        }, c0778b.b()).d(new InterfaceC0782f() { // from class: f9.h
            @Override // D7.InterfaceC0782f
            public final void b(Exception exc) {
                e.f32888f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    public synchronized Task b(final C1659f c1659f) {
        AbstractC1287s.n(c1659f, "MlImage can not be null");
        if (this.f32890a.get()) {
            return AbstractC0789m.f(new T8.a("This detector is already closed!", 14));
        }
        if (c1659f.getWidth() < 32 || c1659f.getHeight() < 32) {
            return AbstractC0789m.f(new T8.a("MlImage width and height should be at least 32!", 3));
        }
        c1659f.b().a();
        return this.f32891b.a(this.f32893d, new Callable() { // from class: f9.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.this.f(c1659f);
            }
        }, this.f32892c.b()).addOnCompleteListener(new OnCompleteListener() { // from class: f9.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1659f c1659f2 = C1659f.this;
                int i10 = e.f32889g;
                c1659f2.close();
            }
        });
    }

    public synchronized Task c(final C3102a c3102a) {
        AbstractC1287s.n(c3102a, "InputImage can not be null");
        if (this.f32890a.get()) {
            return AbstractC0789m.f(new T8.a("This detector is already closed!", 14));
        }
        if (c3102a.m() < 32 || c3102a.i() < 32) {
            return AbstractC0789m.f(new T8.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f32891b.a(this.f32893d, new Callable() { // from class: f9.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.this.e(c3102a);
            }
        }, this.f32892c.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, Z8.a
    @A(AbstractC1592i.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f32890a.getAndSet(true)) {
            return;
        }
        this.f32892c.a();
        this.f32891b.e(this.f32893d);
    }

    final /* synthetic */ Object e(C3102a c3102a) {
        C4402k5 e10 = C4402k5.e("detectorTaskWithResource#run");
        e10.b();
        try {
            Object i10 = this.f32891b.i(c3102a);
            e10.close();
            return i10;
        } catch (Throwable th) {
            try {
                e10.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    final /* synthetic */ Object f(C1659f c1659f) {
        C3102a a10 = AbstractC3155b.a(c1659f);
        if (a10 != null) {
            return this.f32891b.i(a10);
        }
        throw new T8.a("Current type of MlImage is not supported.", 13);
    }
}
