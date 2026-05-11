package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class r0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f21014a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21015b;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f21018e;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f21017d = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private int f21016c = 0;

    private class a extends AbstractC1852t {

        /* renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        class RunnableC0371a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f21020a;

            RunnableC0371a(Pair pair) {
                this.f21020a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f21020a;
                r0Var.g((InterfaceC1847n) pair.first, (e0) pair.second);
            }
        }

        private void p() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f21017d.poll();
                    if (pair == null) {
                        r0 r0Var = r0.this;
                        r0Var.f21016c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                r0.this.f21018e.execute(new RunnableC0371a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1852t, com.facebook.imagepipeline.producers.AbstractC1836c
        protected void g(Throwable th) {
            o().onFailure(th);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        protected void h(Object obj, int i10) {
            o().c(obj, i10);
            if (AbstractC1836c.d(i10)) {
                p();
            }
        }

        private a(InterfaceC1847n interfaceC1847n) {
            super(interfaceC1847n);
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f21015b = i10;
        this.f21018e = (Executor) b3.l.g(executor);
        this.f21014a = (d0) b3.l.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        boolean z10;
        e0Var.p().e(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f21016c;
                z10 = true;
                if (i10 >= this.f21015b) {
                    this.f21017d.add(Pair.create(interfaceC1847n, e0Var));
                } else {
                    this.f21016c = i10 + 1;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            return;
        }
        g(interfaceC1847n, e0Var);
    }

    void g(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        e0Var.p().j(e0Var, "ThrottlingProducer", null);
        this.f21014a.a(new a(interfaceC1847n), e0Var);
    }
}
