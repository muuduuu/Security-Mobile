package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import w0.g;

/* loaded from: classes.dex */
class j extends n {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f15941b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f15942c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f15943d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f15944e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f15942c = constructor;
        f15941b = cls;
        f15943d = method2;
        f15944e = method;
    }

    j() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f15943d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f15941b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f15944e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f15943d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f15942c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.n
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        for (d.C0264d c0264d : cVar.a()) {
            ByteBuffer b10 = o.b(context, resources, c0264d.b());
            if (b10 == null || !h(k10, b10, c0264d.c(), c0264d.e(), c0264d.f())) {
                return null;
            }
        }
        return i(k10);
    }

    @Override // androidx.core.graphics.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        j0.i iVar = new j0.i();
        for (g.b bVar : bVarArr) {
            Uri d10 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(d10);
            if (byteBuffer == null) {
                byteBuffer = o.f(context, cancellationSignal, d10);
                iVar.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !h(k10, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i11 = i(k10);
        if (i11 == null) {
            return null;
        }
        return Typeface.create(i11, i10);
    }
}
