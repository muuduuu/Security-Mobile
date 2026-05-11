package com.facebook.react.views.scroll;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final a Companion;
    public static final h BEGIN_DRAG = new h("BEGIN_DRAG", 0);
    public static final h END_DRAG = new h("END_DRAG", 1);
    public static final h SCROLL = new h("SCROLL", 2);
    public static final h MOMENTUM_BEGIN = new h("MOMENTUM_BEGIN", 3);
    public static final h MOMENTUM_END = new h("MOMENTUM_END", 4);

    public static final class a {

        /* renamed from: com.facebook.react.views.scroll.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0390a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22737a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.BEGIN_DRAG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.END_DRAG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.SCROLL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h.MOMENTUM_BEGIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[h.MOMENTUM_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f22737a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(h type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i10 = C0390a.f22737a[type.ordinal()];
            if (i10 == 1) {
                return "topScrollBeginDrag";
            }
            if (i10 == 2) {
                return "topScrollEndDrag";
            }
            if (i10 == 3) {
                return "topScroll";
            }
            if (i10 == 4) {
                return "topMomentumScrollBegin";
            }
            if (i10 == 5) {
                return "topMomentumScrollEnd";
            }
            throw new m();
        }

        private a() {
        }
    }

    private static final /* synthetic */ h[] $values() {
        return new h[]{BEGIN_DRAG, END_DRAG, SCROLL, MOMENTUM_BEGIN, MOMENTUM_END};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private h(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static final String getJSEventName(h hVar) {
        return Companion.a(hVar);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
