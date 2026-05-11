package com.facebook.react.uimanager;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.react.uimanager.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1946h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC1946h0[] $VALUES;
    public static final a Companion;
    public static final EnumC1946h0 NONE = new EnumC1946h0("NONE", 0);
    public static final EnumC1946h0 BOX_NONE = new EnumC1946h0("BOX_NONE", 1);
    public static final EnumC1946h0 BOX_ONLY = new EnumC1946h0("BOX_ONLY", 2);
    public static final EnumC1946h0 AUTO = new EnumC1946h0("AUTO", 3);

    /* renamed from: com.facebook.react.uimanager.h0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(EnumC1946h0 pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == EnumC1946h0.AUTO || pointerEvents == EnumC1946h0.BOX_ONLY;
        }

        public final boolean b(EnumC1946h0 pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == EnumC1946h0.AUTO || pointerEvents == EnumC1946h0.BOX_NONE;
        }

        public final EnumC1946h0 c(String str) {
            if (str == null) {
                return EnumC1946h0.AUTO;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return EnumC1946h0.valueOf(StringsKt.z(upperCase, "-", "_", false, 4, null));
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC1946h0[] $values() {
        return new EnumC1946h0[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    static {
        EnumC1946h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private EnumC1946h0(String str, int i10) {
    }

    public static final boolean canBeTouchTarget(EnumC1946h0 enumC1946h0) {
        return Companion.a(enumC1946h0);
    }

    public static final boolean canChildrenBeTouchTarget(EnumC1946h0 enumC1946h0) {
        return Companion.b(enumC1946h0);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static final EnumC1946h0 parsePointerEvents(String str) {
        return Companion.c(str);
    }

    public static EnumC1946h0 valueOf(String str) {
        return (EnumC1946h0) Enum.valueOf(EnumC1946h0.class, str);
    }

    public static EnumC1946h0[] values() {
        return (EnumC1946h0[]) $VALUES.clone();
    }
}
