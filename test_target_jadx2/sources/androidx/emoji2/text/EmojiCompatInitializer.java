package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import o1.InterfaceC3739a;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC3739a {

    class a implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1592i f16484a;

        a(AbstractC1592i abstractC1592i) {
            this.f16484a = abstractC1592i;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC1599p interfaceC1599p) {
            EmojiCompatInitializer.this.e();
            this.f16484a.d(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16486a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f16487a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f16488b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f16487a = iVar;
                this.f16488b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                try {
                    this.f16487a.a(th);
                } finally {
                    this.f16488b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f16487a.b(nVar);
                } finally {
                    this.f16488b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f16486a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.c.this.d(iVar, b10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a10 = androidx.emoji2.text.d.a(this.f16486a);
                if (a10 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a10.c(threadPoolExecutor);
                a10.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.i()) {
                    f.c().l();
                }
            } finally {
                androidx.core.os.o.b();
            }
        }
    }

    @Override // o1.InterfaceC3739a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o1.InterfaceC3739a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        f.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC1592i lifecycle = ((InterfaceC1599p) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new d(), 500L);
    }
}
