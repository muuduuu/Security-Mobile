package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m PLAIN = new m("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.m.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        public String escape(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return string;
        }
    };
    public static final m HTML = new m("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.m.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        public String escape(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return StringsKt.z(StringsKt.z(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    private static final /* synthetic */ m[] $values() {
        return new m[]{PLAIN, HTML};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    public /* synthetic */ m(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public abstract String escape(String str);

    private m(String str, int i10) {
    }
}
