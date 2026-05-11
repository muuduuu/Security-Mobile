package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1944g0;
import java.util.Map;
import r4.AbstractC4012a;
import v4.AbstractC4929e;

/* loaded from: classes2.dex */
public abstract class e {

    public interface a {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, b bVar);

        void scrollToEnd(Object obj, c cVar);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f22704a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22705b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22706c;

        b(int i10, int i11, boolean z10) {
            this.f22704a = i10;
            this.f22705b = i11;
            this.f22706c = z10;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22707a;

        c(boolean z10) {
            this.f22707a = z10;
        }
    }

    public static Map a() {
        return AbstractC4929e.f("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static void b(a aVar, Object obj, int i10, ReadableArray readableArray) {
        AbstractC4012a.c(aVar);
        AbstractC4012a.c(obj);
        if (i10 == 1) {
            d(aVar, obj, (ReadableArray) AbstractC4012a.c(readableArray));
        } else if (i10 == 2) {
            e(aVar, obj, (ReadableArray) AbstractC4012a.c(readableArray));
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i10), aVar.getClass().getSimpleName()));
            }
            aVar.flashScrollIndicators(obj);
        }
    }

    public static void c(a aVar, Object obj, String str, ReadableArray readableArray) {
        AbstractC4012a.c(aVar);
        AbstractC4012a.c(obj);
        str.hashCode();
        switch (str) {
            case "scrollTo":
                d(aVar, obj, (ReadableArray) AbstractC4012a.c(readableArray));
                return;
            case "flashScrollIndicators":
                aVar.flashScrollIndicators(obj);
                return;
            case "scrollToEnd":
                e(aVar, obj, (ReadableArray) AbstractC4012a.c(readableArray));
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, aVar.getClass().getSimpleName()));
        }
    }

    private static void d(a aVar, Object obj, ReadableArray readableArray) {
        aVar.scrollTo(obj, new b(Math.round(C1944g0.f(readableArray.getDouble(0))), Math.round(C1944g0.f(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static void e(a aVar, Object obj, ReadableArray readableArray) {
        aVar.scrollToEnd(obj, new c(readableArray.getBoolean(0)));
    }
}
