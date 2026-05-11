package m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import b4.p;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import f3.AbstractC3142a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3650a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f37331a = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    private static Method f37332b;

    private static void c(Bitmap bitmap, Bitmap bitmap2) {
        if (!p.a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f37332b == null) {
                int i10 = Bitmaps.f20719a;
                f37332b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            f37332b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
        }
    }

    @Override // m4.d
    public AbstractC3142a a(Bitmap bitmap, Y3.d dVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f37331a;
        }
        AbstractC3142a d10 = dVar.d(width, height, config);
        try {
            e((Bitmap) d10.p(), bitmap);
            return d10.clone();
        } finally {
            AbstractC3142a.n(d10);
        }
    }

    @Override // m4.d
    public V2.d b() {
        return null;
    }

    public void e(Bitmap bitmap, Bitmap bitmap2) {
        c(bitmap, bitmap2);
        d(bitmap);
    }

    @Override // m4.d
    public String getName() {
        return "Unknown postprocessor";
    }

    public void d(Bitmap bitmap) {
    }
}
