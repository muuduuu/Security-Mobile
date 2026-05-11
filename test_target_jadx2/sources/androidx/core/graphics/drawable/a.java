package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0267a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int b(Drawable drawable) {
        return b.a(drawable);
    }

    public static boolean c(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void d(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void e(Drawable drawable, float f10, float f11) {
        C0267a.e(drawable, f10, f11);
    }

    public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
        C0267a.f(drawable, i10, i11, i12, i13);
    }

    public static boolean g(Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void h(Drawable drawable, int i10) {
        C0267a.g(drawable, i10);
    }

    public static void i(Drawable drawable, ColorStateList colorStateList) {
        C0267a.h(drawable, colorStateList);
    }

    public static void j(Drawable drawable, PorterDuff.Mode mode) {
        C0267a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable k(Drawable drawable) {
        return drawable instanceof c ? ((c) drawable).b() : drawable;
    }

    public static Drawable l(Drawable drawable) {
        return drawable;
    }
}
