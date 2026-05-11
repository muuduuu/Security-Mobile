package r1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: r1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3979M {

    /* renamed from: a, reason: collision with root package name */
    private static Field f38963a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f38964b;

    AbstractC3979M() {
    }

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public abstract void e(View view, float f10);

    public void f(View view, int i10) {
        if (!f38964b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f38963a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f38964b = true;
        }
        Field field = f38963a;
        if (field != null) {
            try {
                f38963a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
