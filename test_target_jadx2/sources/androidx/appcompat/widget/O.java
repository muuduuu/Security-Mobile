package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import co.hyperverge.hypersnapsdk.objects.HVError;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13758a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13759b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f13760c = new Rect();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f13761a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f13762b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f13763c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f13764d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f13765e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f13766f;

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z10 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                            field4 = null;
                            z10 = false;
                            if (z10) {
                            }
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            }
            if (z10) {
                f13762b = null;
                f13763c = null;
                f13764d = null;
                f13765e = null;
                f13766f = null;
                f13761a = false;
                return;
            }
            f13762b = method;
            f13763c = field;
            f13764d = field2;
            f13765e = field3;
            f13766f = field4;
            f13761a = true;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f13761a) {
                try {
                    Object invoke = f13762b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(f13763c.getInt(invoke), f13764d.getInt(invoke), f13765e.getInt(invoke), f13766f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return O.f13760c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f13758a);
        } else {
            drawable.setState(f13759b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(androidx.core.graphics.drawable.a.k(drawable));
        }
        Insets a10 = b.a(drawable);
        i10 = a10.left;
        i11 = a10.top;
        i12 = a10.right;
        i13 = a10.bottom;
        return new Rect(i10, i11, i12, i13);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
