package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.d;
import androidx.core.content.res.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f15884a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f15885b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f15886c = new Object();

    static class a {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f15887a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f15888b;

        /* renamed from: c, reason: collision with root package name */
        final int f15889c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f15887a = colorStateList;
            this.f15888b = configuration;
            this.f15889c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f15890a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f15891b;

        d(Resources resources, Resources.Theme theme) {
            this.f15890a = resources;
            this.f15891b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15890a.equals(dVar.f15890a) && y0.b.a(this.f15891b, dVar.f15891b);
        }

        public int hashCode() {
            return y0.b.b(this.f15890a, this.f15891b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i10);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    public static final class C0265f {

        /* renamed from: androidx.core.content.res.f$f$a */
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f15892a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f15893b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f15894c;

            static void a(Resources.Theme theme) {
                synchronized (f15892a) {
                    if (!f15894c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f15893b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f15894c = true;
                    }
                    Method method = f15893b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f15893b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.f$f$b */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f15886c) {
            try {
                WeakHashMap weakHashMap = f15885b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i10, new c(colorStateList, dVar.f15890a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f15889c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList b(d dVar, int i10) {
        c cVar;
        synchronized (f15886c) {
            try {
                SparseArray sparseArray = (SparseArray) f15885b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i10)) != null) {
                    if (cVar.f15888b.equals(dVar.f15890a.getConfiguration())) {
                        Resources.Theme theme = dVar.f15891b;
                        if (theme == null) {
                            if (cVar.f15889c != 0) {
                            }
                            return cVar.f15887a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i10);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i10, Resources.Theme theme) {
        return b.a(resources, i10, theme);
    }

    public static ColorStateList e(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b10 = b(dVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList l10 = l(resources, i10, theme);
        if (l10 == null) {
            return b.b(resources, i10, theme);
        }
        a(dVar, i10, l10, theme);
        return l10;
    }

    public static Drawable f(Resources resources, int i10, Resources.Theme theme) {
        return a.a(resources, i10, theme);
    }

    public static Drawable g(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.b(resources, i10, i11, theme);
    }

    public static Typeface h(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, typedValue, i11, eVar, null, true, false);
    }

    public static void j(Context context, int i10, e eVar, Handler handler) {
        y0.f.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i10, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static TypedValue k() {
        ThreadLocal threadLocal = f15884a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList l(Resources resources, int i10, Resources.Theme theme) {
        if (m(resources, i10)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean m(Resources resources, int i10) {
        TypedValue k10 = k();
        resources.getValue(i10, k10, true);
        int i11 = k10.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface n(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface o10 = o(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (o10 != null || eVar != null || z11) {
            return o10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface o(Context context, Resources resources, TypedValue typedValue, int i10, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        int i12 = 0;
        if (!charSequence2.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface f10 = androidx.core.graphics.h.f(resources, i10, charSequence2, typedValue.assetCookie, i11);
        if (f10 != null) {
            if (eVar != null) {
                eVar.d(f10, handler);
            }
            return f10;
        }
        if (z11) {
            return null;
        }
        try {
        } catch (IOException e10) {
            e = e10;
            i12 = -3;
        } catch (XmlPullParserException e11) {
            e = e11;
            i12 = -3;
        }
        try {
            if (!charSequence2.toLowerCase().endsWith(".xml")) {
                Typeface d10 = androidx.core.graphics.h.d(context, resources, i10, charSequence2, typedValue.assetCookie, i11);
                if (eVar != null) {
                    if (d10 != null) {
                        eVar.d(d10, handler);
                    } else {
                        eVar.c(-3, handler);
                    }
                }
                return d10;
            }
            d.b b10 = androidx.core.content.res.d.b(resources.getXml(i10), resources);
            if (b10 != null) {
                return androidx.core.graphics.h.c(context, b10, resources, i10, charSequence2, typedValue.assetCookie, i11, eVar, handler, z10);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        } catch (IOException e12) {
            e = e12;
            Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence2, e);
            if (eVar != null) {
                return null;
            }
            eVar.c(i12, handler);
            return null;
        } catch (XmlPullParserException e13) {
            e = e13;
            Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence2, e);
            if (eVar != null) {
            }
        }
    }
}
