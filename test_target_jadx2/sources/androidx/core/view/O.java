package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.O;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final c f16070a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f16071a;

        a(View view) {
            this.f16071a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.core.view.O.c
        void a() {
            View view = this.f16071a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16071a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.O.c
        void b() {
            final View view = this.f16071a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.f16071a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.N
                @Override // java.lang.Runnable
                public final void run() {
                    O.a.d(view);
                }
            });
        }
    }

    private static class c {
        c() {
        }

        abstract void a();

        abstract void b();
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16070a = new b(view);
        } else {
            this.f16070a = new a(view);
        }
    }

    public void a() {
        this.f16070a.a();
    }

    public void b() {
        this.f16070a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f16072b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f16073c;

        b(View view) {
            super(view);
            this.f16072b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i10) {
            atomicBoolean.set((i10 & 8) != 0);
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f16073c;
            if (windowInsetsController == null) {
                View view2 = this.f16072b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.V
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    O.b.f(atomicBoolean, windowInsetsController2, i10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f16072b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16072b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // androidx.core.view.O.a, androidx.core.view.O.c
        void b() {
            int ime;
            View view = this.f16072b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f16073c;
            if (windowInsetsController == null) {
                View view2 = this.f16072b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f16073c = windowInsetsController;
        }
    }

    O(WindowInsetsController windowInsetsController) {
        this.f16070a = new b(windowInsetsController);
    }
}
