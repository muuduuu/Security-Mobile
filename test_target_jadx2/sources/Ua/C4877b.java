package ua;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import expo.modules.blur.enums.BlurMethod;
import expo.modules.blur.enums.TintStyle;
import expo.modules.kotlin.exception.i;
import expo.modules.kotlin.views.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import na.C3720c;
import na.p;
import na.q;
import pb.C3862a;

/* renamed from: ua.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4877b extends h {

    /* renamed from: c, reason: collision with root package name */
    private BlurMethod f43597c;

    /* renamed from: d, reason: collision with root package name */
    private float f43598d;

    /* renamed from: e, reason: collision with root package name */
    private float f43599e;

    /* renamed from: f, reason: collision with root package name */
    private TintStyle f43600f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43601g;

    /* renamed from: h, reason: collision with root package name */
    private final C3720c f43602h;

    /* renamed from: ua.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43603a;

        static {
            int[] iArr = new int[BlurMethod.values().length];
            try {
                iArr[BlurMethod.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlurMethod.DIMEZIS_BLUR_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43603a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4877b(Context context, C3862a appContext) {
        super(context, appContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f43597c = BlurMethod.NONE;
        this.f43598d = 4.0f;
        this.f43599e = 50.0f;
        this.f43600f = TintStyle.DEFAULT;
        C3720c c3720c = new C3720c(context);
        c3720c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        addView(c3720c);
        this.f43602h = c3720c;
    }

    private final void e() {
        setBlurRadius(this.f43599e);
        setBlurMethod(this.f43597c);
        f();
    }

    private final void g() {
        ViewGroup i10 = i();
        Window window = getAppContext().x().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f43602h.e(i10, new p()).c(decorView != null ? decorView.getBackground() : null);
        } else {
            this.f43602h.e(i10, new q(getContext())).c(decorView != null ? decorView.getBackground() : null);
        }
        e();
    }

    private final ViewGroup getAppRootFallback() {
        Window window = getAppContext().x().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView != null ? (ViewGroup) decorView.findViewById(R.id.content) : null;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new i();
    }

    private final ViewGroup h() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (j(viewGroup)) {
                    return viewGroup;
                }
            }
        }
        return null;
    }

    private final ViewGroup i() {
        ViewGroup h10 = h();
        return h10 == null ? getAppRootFallback() : h10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (kotlin.text.StringsKt.K(r7, "swmansion", false, 2, null) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean j(ViewGroup viewGroup) {
        boolean z10;
        boolean z11;
        try {
            Class<?> cls = viewGroup.getClass();
            List m10 = CollectionsKt.m("getFragment", "getScreenFragment", "getFragmentManager", "onAttachedToWindow", "onDetachedFromWindow");
            if (!(m10 instanceof Collection) || !m10.isEmpty()) {
                Iterator it = m10.iterator();
                while (it.hasNext()) {
                    try {
                        cls.getMethod((String) it.next(), null);
                        z10 = true;
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            z10 = false;
            String name = cls.getName();
            Intrinsics.d(name);
            if (StringsKt.K(name, "Screen", false, 2, null)) {
                if (!StringsKt.K(name, "rnscreens", false, 2, null)) {
                }
                z11 = true;
                return !z10 || z11;
            }
            z11 = false;
            if (z10) {
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    public final void d(float f10) {
        this.f43598d = f10;
        setBlurRadius(this.f43599e);
    }

    public final void f() {
        if (this.f43601g) {
            int i10 = a.f43603a[this.f43597c.ordinal()];
            if (i10 == 1) {
                setBackgroundColor(this.f43600f.toBlurEffect(this.f43599e));
            } else if (i10 == 2) {
                this.f43602h.d(this.f43600f.toBlurEffect(this.f43599e));
            }
            this.f43602h.invalidate();
        }
    }

    public final TintStyle getTint$expo_blur_release() {
        return this.f43600f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f43601g) {
            return;
        }
        this.f43601g = true;
        g();
    }

    public final void setBlurMethod(BlurMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f43597c = method;
        if (this.f43601g) {
            int i10 = a.f43603a[method.ordinal()];
            if (i10 == 1) {
                this.f43602h.b(false);
            } else if (i10 == 2) {
                this.f43602h.b(true);
                setBackgroundColor(0);
            }
            setBlurRadius(this.f43599e);
        }
    }

    public final void setBlurRadius(float f10) {
        this.f43599e = f10;
        if (this.f43601g) {
            int i10 = a.f43603a[this.f43597c.ordinal()];
            if (i10 == 1) {
                setBackgroundColor(this.f43600f.toBlurEffect(f10));
                return;
            }
            if (i10 != 2) {
                return;
            }
            this.f43602h.b(true ^ (f10 == 0.0f));
            if (f10 > 0.0f) {
                this.f43602h.c(f10 / this.f43598d);
                this.f43602h.invalidate();
            }
        }
    }

    public final void setTint$expo_blur_release(TintStyle tintStyle) {
        Intrinsics.checkNotNullParameter(tintStyle, "<set-?>");
        this.f43600f = tintStyle;
    }
}
