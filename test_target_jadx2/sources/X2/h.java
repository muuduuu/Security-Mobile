package x2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import r2.x;

/* loaded from: classes.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    final Set f44733a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f44734b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f44735a;

        /* renamed from: x2.h$a$a, reason: collision with other inner class name */
        class RunnableC0651a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f44737a;

            RunnableC0651a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f44737a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                x.b().h();
                h.this.f44734b = true;
                h.b(a.this.f44735a, this.f44737a);
                h.this.f44733a.clear();
            }
        }

        a(View view) {
            this.f44735a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            D2.l.v(new RunnableC0651a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // x2.i
    public void a(Activity activity) {
        if (!this.f44734b && this.f44733a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
