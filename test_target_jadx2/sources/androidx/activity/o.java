package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.o;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C3573h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f12983a;

    /* renamed from: b, reason: collision with root package name */
    private final C3573h f12984b = new C3573h();

    /* renamed from: c, reason: collision with root package name */
    private Function0 f12985c;

    /* renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f12986d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f12987e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12988f;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        public final void a() {
            o.this.g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        public final void a() {
            o.this.e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f12991a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.p
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    o.c.c(Function0.this);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    private final class d implements InterfaceC1596m, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1592i f12992a;

        /* renamed from: b, reason: collision with root package name */
        private final n f12993b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f12994c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f12995d;

        public d(o oVar, AbstractC1592i lifecycle, n onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f12995d = oVar;
            this.f12992a = lifecycle;
            this.f12993b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f12992a.d(this);
            this.f12993b.e(this);
            androidx.activity.a aVar = this.f12994c;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f12994c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p source, AbstractC1592i.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1592i.a.ON_START) {
                this.f12994c = this.f12995d.c(this.f12993b);
                return;
            }
            if (event != AbstractC1592i.a.ON_STOP) {
                if (event == AbstractC1592i.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f12994c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    private final class e implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final n f12996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f12997b;

        public e(o oVar, n onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f12997b = oVar;
            this.f12996a = onBackPressedCallback;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f12997b.f12984b.remove(this.f12996a);
            this.f12996a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f12996a.g(null);
                this.f12997b.g();
            }
        }
    }

    public o(Runnable runnable) {
        this.f12983a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f12985c = new a();
            this.f12986d = c.f12991a.b(new b());
        }
    }

    public final void b(InterfaceC1599p owner, n onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1592i lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC1592i.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new d(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.g(this.f12985c);
        }
    }

    public final androidx.activity.a c(n onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f12984b.add(onBackPressedCallback);
        e eVar = new e(this, onBackPressedCallback);
        onBackPressedCallback.a(eVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.g(this.f12985c);
        }
        return eVar;
    }

    public final boolean d() {
        C3573h c3573h = this.f12984b;
        if (c3573h != null && c3573h.isEmpty()) {
            return false;
        }
        Iterator<E> it = c3573h.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        Object obj;
        C3573h c3573h = this.f12984b;
        ListIterator<E> listIterator = c3573h.listIterator(c3573h.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((n) obj).c()) {
                    break;
                }
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.b();
            return;
        }
        Runnable runnable = this.f12983a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f12987e = invoker;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f12987e;
        OnBackInvokedCallback onBackInvokedCallback = this.f12986d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (d10 && !this.f12988f) {
            c.f12991a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f12988f = true;
        } else {
            if (d10 || !this.f12988f) {
                return;
            }
            c.f12991a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f12988f = false;
        }
    }
}
