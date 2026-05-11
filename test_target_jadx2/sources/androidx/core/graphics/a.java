package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    static class C0266a {
        static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i10, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a10 = c.b.a(bVar);
            if (a10 != null) {
                return C0266a.a(i10, a10);
            }
            return null;
        }
        PorterDuff.Mode a11 = c.a(bVar);
        if (a11 != null) {
            return new PorterDuffColorFilter(i10, a11);
        }
        return null;
    }
}
