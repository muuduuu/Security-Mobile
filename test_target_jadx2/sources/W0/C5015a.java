package w0;

import android.graphics.Typeface;
import android.os.Handler;
import w0.f;
import w0.g;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5015a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f44225a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f44226b;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    class RunnableC0634a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f44227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f44228b;

        RunnableC0634a(g.c cVar, Typeface typeface) {
            this.f44227a = cVar;
            this.f44228b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44227a.b(this.f44228b);
        }
    }

    /* renamed from: w0.a$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f44230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44231b;

        b(g.c cVar, int i10) {
            this.f44230a = cVar;
            this.f44231b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44230a.a(this.f44231b);
        }
    }

    C5015a(g.c cVar, Handler handler) {
        this.f44225a = cVar;
        this.f44226b = handler;
    }

    private void a(int i10) {
        this.f44226b.post(new b(this.f44225a, i10));
    }

    private void c(Typeface typeface) {
        this.f44226b.post(new RunnableC0634a(this.f44225a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f44255a);
        } else {
            a(eVar.f44256b);
        }
    }
}
