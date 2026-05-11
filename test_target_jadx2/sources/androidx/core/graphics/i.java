package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w0.g;

/* loaded from: classes.dex */
class i extends n {

    /* renamed from: b, reason: collision with root package name */
    private static Class f15936b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f15937c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f15938d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f15939e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f15940f = false;

    i() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) {
        k();
        try {
            return ((Boolean) f15938d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f15936b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f15939e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f15940f) {
            return;
        }
        f15940f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f15937c = constructor;
        f15936b = cls;
        f15938d = method2;
        f15939e = method;
    }

    private static Object l() {
        k();
        try {
            return f15937c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.n
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object l10 = l();
        for (d.C0264d c0264d : cVar.a()) {
            File e10 = o.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!o.c(e10, resources, c0264d.b())) {
                    return null;
                }
                if (!h(l10, e10.getPath(), c0264d.e(), c0264d.f())) {
                    return null;
                }
                e10.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return i(l10);
    }

    @Override // androidx.core.graphics.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File j10 = j(openFileDescriptor);
                if (j10 != null && j10.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(j10);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface c10 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c10;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
