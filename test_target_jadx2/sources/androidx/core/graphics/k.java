package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import w0.g;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f15945g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f15946h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f15947i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f15948j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f15949k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f15950l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f15951m;

    public k() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f15945g = cls;
        this.f15946h = constructor;
        this.f15947i = method;
        this.f15948j = method2;
        this.f15949k = method3;
        this.f15950l = method4;
        this.f15951m = method5;
    }

    private Object l() {
        try {
            return this.f15946h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f15950l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f15947i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f15948j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f15949k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f15947i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f15947i != null;
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.n
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        if (!q()) {
            return super.a(context, cVar, resources, i10);
        }
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        for (d.C0264d c0264d : cVar.a()) {
            if (!n(context, l10, c0264d.a(), c0264d.c(), c0264d.e(), c0264d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0264d.d()))) {
                m(l10);
                return null;
            }
        }
        if (p(l10)) {
            return i(l10);
        }
        return null;
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface i11;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b g10 = g(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g10.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g10.e()).setItalic(g10.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map h10 = o.h(context, bVarArr, cancellationSignal);
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        boolean z10 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) h10.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(l10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(l10);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            m(l10);
            return null;
        }
        if (p(l10) && (i11 = i(l10)) != null) {
            return Typeface.create(i11, i10);
        }
        return null;
    }

    @Override // androidx.core.graphics.n
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!q()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        if (!n(context, l10, str, 0, -1, -1, null)) {
            m(l10);
            return null;
        }
        if (p(l10)) {
            return i(l10);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f15945g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f15951m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method s(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
