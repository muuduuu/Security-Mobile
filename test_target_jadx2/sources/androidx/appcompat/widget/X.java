package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import j.AbstractC3475a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s1.AbstractC4308c;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: i, reason: collision with root package name */
    private static X f13996i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f13998a;

    /* renamed from: b, reason: collision with root package name */
    private j0.i f13999b;

    /* renamed from: c, reason: collision with root package name */
    private j0.j f14000c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f14001d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f14002e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14003f;

    /* renamed from: g, reason: collision with root package name */
    private c f14004g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f13995h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final a f13997j = new a(6);

    private static class a extends j0.h {
        public a(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(X x10, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            j0.f fVar = (j0.f) this.f14001d.get(context);
            if (fVar == null) {
                fVar = new j0.f();
                this.f14001d.put(context, fVar);
            }
            fVar.l(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f13998a == null) {
            this.f13998a = new WeakHashMap();
        }
        j0.j jVar = (j0.j) this.f13998a.get(context);
        if (jVar == null) {
            jVar = new j0.j();
            this.f13998a.put(context, jVar);
        }
        jVar.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f14003f) {
            return;
        }
        this.f14003f = true;
        Drawable i10 = i(context, AbstractC3475a.f35668a);
        if (i10 == null || !p(i10)) {
            this.f14003f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i10) {
        if (this.f14002e == null) {
            this.f14002e = new TypedValue();
        }
        TypedValue typedValue = this.f14002e;
        context.getResources().getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        c cVar = this.f14004g;
        Drawable c10 = cVar == null ? null : cVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized X g() {
        X x10;
        synchronized (X.class) {
            try {
                if (f13996i == null) {
                    X x11 = new X();
                    f13996i = x11;
                    o(x11);
                }
                x10 = f13996i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x10;
    }

    private synchronized Drawable h(Context context, long j10) {
        j0.f fVar = (j0.f) this.f14001d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.h(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.m(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (X.class) {
            a aVar = f13997j;
            k10 = aVar.k(i10, mode);
            if (k10 == null) {
                k10 = new PorterDuffColorFilter(i10, mode);
                aVar.l(i10, mode, k10);
            }
        }
        return k10;
    }

    private ColorStateList m(Context context, int i10) {
        j0.j jVar;
        WeakHashMap weakHashMap = this.f13998a;
        if (weakHashMap == null || (jVar = (j0.j) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) jVar.i(i10);
    }

    private static void o(X x10) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof AbstractC4308c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        j0.i iVar = this.f13999b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        j0.j jVar = this.f14000c;
        if (jVar != null) {
            String str = (String) jVar.i(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f13999b.get(str) == null)) {
                return null;
            }
        } else {
            this.f14000c = new j0.j();
        }
        if (this.f14002e == null) {
            this.f14002e = new TypedValue();
        }
        TypedValue typedValue = this.f14002e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f14000c.a(i10, name);
                b bVar = (b) this.f13999b.get(name);
                if (bVar != null) {
                    h10 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h10 != null) {
                    h10.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d10, h10);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (h10 == null) {
            this.f14000c.a(i10, "appcompat_skip_skip");
        }
        return h10;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList l10 = l(context, i10);
        if (l10 != null) {
            Drawable l11 = androidx.core.graphics.drawable.a.l(drawable.mutate());
            androidx.core.graphics.drawable.a.i(l11, l10);
            PorterDuff.Mode n10 = n(i10);
            if (n10 == null) {
                return l11;
            }
            androidx.core.graphics.drawable.a.j(l11, n10);
            return l11;
        }
        c cVar = this.f14004g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, f0 f0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = f0Var.f14151d;
        if (z10 || f0Var.f14150c) {
            drawable.setColorFilter(f(z10 ? f0Var.f14148a : null, f0Var.f14150c ? f0Var.f14149b : f13995h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable q10;
        try {
            c(context);
            q10 = q(context, i10);
            if (q10 == null) {
                q10 = e(context, i10);
            }
            if (q10 == null) {
                q10 = androidx.core.content.a.e(context, i10);
            }
            if (q10 != null) {
                q10 = u(context, i10, z10, q10);
            }
            if (q10 != null) {
                O.b(q10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q10;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList m10;
        m10 = m(context, i10);
        if (m10 == null) {
            c cVar = this.f14004g;
            m10 = cVar == null ? null : cVar.d(context, i10);
            if (m10 != null) {
                b(context, i10, m10);
            }
        }
        return m10;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f14004g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i10);
    }

    public synchronized void r(Context context) {
        j0.f fVar = (j0.f) this.f14001d.get(context);
        if (fVar != null) {
            fVar.a();
        }
    }

    synchronized Drawable s(Context context, r0 r0Var, int i10) {
        try {
            Drawable q10 = q(context, i10);
            if (q10 == null) {
                q10 = r0Var.a(i10);
            }
            if (q10 == null) {
                return null;
            }
            return u(context, i10, false, q10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f14004g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f14004g;
        return cVar != null && cVar.a(context, i10, drawable);
    }
}
