package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2222e0 {

    /* renamed from: a, reason: collision with root package name */
    final C2393x1 f24484a;

    /* renamed from: b, reason: collision with root package name */
    Y1 f24485b;

    /* renamed from: c, reason: collision with root package name */
    final C2203c f24486c;

    /* renamed from: d, reason: collision with root package name */
    private final Y7 f24487d;

    public C2222e0() {
        C2393x1 c2393x1 = new C2393x1();
        this.f24484a = c2393x1;
        this.f24485b = c2393x1.f24683b.c();
        this.f24486c = new C2203c();
        this.f24487d = new Y7();
        c2393x1.f24685d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return C2222e0.this.g();
            }
        });
        c2393x1.f24685d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C2199b4(C2222e0.this.f24486c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f24484a.f24685d.a(str, callable);
    }

    public final boolean b(C2194b c2194b) {
        try {
            C2203c c2203c = this.f24486c;
            c2203c.b(c2194b);
            this.f24484a.f24684c.e("runtime.counter", new C2266j(Double.valueOf(0.0d)));
            this.f24487d.b(this.f24485b.c(), c2203c);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th) {
            throw new D0(th);
        }
    }

    public final boolean c() {
        C2203c c2203c = this.f24486c;
        return !c2203c.c().equals(c2203c.a());
    }

    public final boolean d() {
        return !this.f24486c.f().isEmpty();
    }

    public final C2203c e() {
        return this.f24486c;
    }

    public final void f(C3 c32) {
        AbstractC2275k abstractC2275k;
        try {
            C2393x1 c2393x1 = this.f24484a;
            this.f24485b = c2393x1.f24683b.c();
            if (c2393x1.a(this.f24485b, (G3[]) c32.C().toArray(new G3[0])) instanceof C2248h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2413z3 c2413z3 : c32.D().C()) {
                List D10 = c2413z3.D();
                String C10 = c2413z3.C();
                Iterator it = D10.iterator();
                while (it.hasNext()) {
                    InterfaceC2329q a10 = c2393x1.a(this.f24485b, (G3) it.next());
                    if (!(a10 instanceof C2302n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Y1 y12 = this.f24485b;
                    if (y12.d(C10)) {
                        InterfaceC2329q h10 = y12.h(C10);
                        if (!(h10 instanceof AbstractC2275k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(C10)));
                        }
                        abstractC2275k = (AbstractC2275k) h10;
                    } else {
                        abstractC2275k = null;
                    }
                    if (abstractC2275k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(C10)));
                    }
                    abstractC2275k.b(this.f24485b, Collections.singletonList(a10));
                }
            }
        } catch (Throwable th) {
            throw new D0(th);
        }
    }

    final /* synthetic */ AbstractC2275k g() {
        return new U7(this.f24487d);
    }
}
