package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.core.graphics.c;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f15928a = new ThreadLocal();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, androidx.core.graphics.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, bVar != null ? c.b.a(bVar) : null);
            return true;
        }
        if (bVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode a10 = c.a(bVar);
        paint.setXfermode(a10 != null ? new PorterDuffXfermode(a10) : null);
        return a10 != null;
    }
}
