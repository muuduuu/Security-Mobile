package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static Field f13287a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13288b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f13289c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f13290d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f13291e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f13292f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f13293g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f13294h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f13294h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f13293g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f13294h = true;
        }
        Field field = f13293g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f13288b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f13287a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f13288b = true;
        }
        Field field2 = f13287a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f13290d) {
            try {
                f13289c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f13290d = true;
        }
        Class cls = f13289c;
        if (cls == null) {
            return;
        }
        if (!f13292f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f13291e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f13292f = true;
        }
        Field field = f13291e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
