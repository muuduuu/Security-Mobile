package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.AbstractC1901p;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5146G;

/* loaded from: classes.dex */
public final class M extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21520d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final TextView f21521a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.react.modules.debug.h f21522b;

    /* renamed from: c, reason: collision with root package name */
    private final b f21523c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f21524a;

        /* renamed from: b, reason: collision with root package name */
        private int f21525b;

        /* renamed from: c, reason: collision with root package name */
        private int f21526c;

        public b() {
        }

        public final void a() {
            this.f21524a = false;
            M.this.post(this);
        }

        public final void b() {
            this.f21524a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21524a) {
                return;
            }
            this.f21525b += M.this.f21522b.d() - M.this.f21522b.g();
            this.f21526c += M.this.f21522b.c();
            M m10 = M.this;
            m10.c(m10.f21522b.e(), M.this.f21522b.f(), this.f21525b, this.f21526c);
            M.this.f21522b.j();
            M.this.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.d(reactContext);
        View.inflate(reactContext, AbstractC1901p.f21910b, this);
        View findViewById = findViewById(AbstractC1899n.f21895n);
        Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f21521a = (TextView) findViewById;
        this.f21522b = new com.facebook.react.modules.debug.h(reactContext);
        this.f21523c = new b();
        c(0.0d, 0.0d, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double d10, double d11, int i10, int i11) {
        C5146G c5146g = C5146G.f44966a;
        String format = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11), Double.valueOf(d11)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f21521a.setText(format);
        AbstractC1721a.b("ReactNative", format);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21522b.j();
        com.facebook.react.modules.debug.h.l(this.f21522b, 0.0d, 1, null);
        this.f21523c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21522b.n();
        this.f21523c.b();
    }
}
