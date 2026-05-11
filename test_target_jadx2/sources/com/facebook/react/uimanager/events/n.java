package com.facebook.react.uimanager.events;

import android.view.View;
import com.facebook.react.AbstractC1899n;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class n {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22400a;

        static {
            int[] iArr = new int[b.values().length];
            f22400a = iArr;
            try {
                iArr[b.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22400a[b.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22400a[b.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22400a[b.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22400a[b.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22400a[b.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22400a[b.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22400a[b.CLICK_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        CANCEL,
        CANCEL_CAPTURE,
        CLICK,
        CLICK_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE
    }

    public static int a(String str, int i10, int i11) {
        int i12 = 0;
        if ("touch".equals(str)) {
            return 0;
        }
        int i13 = i11 ^ i10;
        if (i13 == 0) {
            return -1;
        }
        if (i13 != 1) {
            i12 = 2;
            if (i13 != 2) {
                if (i13 == 4) {
                    return 1;
                }
                if (i13 != 8) {
                    return i13 != 16 ? -1 : 4;
                }
                return 3;
            }
        }
        return i12;
    }

    public static int b(String str, String str2, int i10) {
        if (g(str)) {
            return 0;
        }
        if ("touch".equals(str2)) {
            return 1;
        }
        return i10;
    }

    public static int c(String str) {
        if (str == null) {
            return 2;
        }
        switch (str) {
        }
        return 2;
    }

    public static double d(int i10, String str) {
        return (g(str) || i10 == 0) ? 0.0d : 0.5d;
    }

    public static String e(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? BuildConfig.FLAVOR : "mouse" : "pen" : "touch";
    }

    public static boolean f(String str) {
        str.hashCode();
        switch (str) {
            case "topPointerDown":
            case "topPointerMove":
            case "topPointerOver":
            case "topPointerUp":
            case "topPointerCancel":
            case "topPointerOut":
                return true;
            default:
                return false;
        }
    }

    public static boolean g(String str) {
        str.hashCode();
        switch (str) {
            case "topPointerLeave":
            case "topPointerUp":
            case "topPointerOut":
                return true;
            default:
                return false;
        }
    }

    public static boolean h(View view, b bVar) {
        if (view == null) {
            return true;
        }
        switch (a.f22400a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                Integer num = (Integer) view.getTag(AbstractC1899n.f21899r);
                return (num == null || (num.intValue() & (1 << bVar.ordinal())) == 0) ? false : true;
        }
    }
}
