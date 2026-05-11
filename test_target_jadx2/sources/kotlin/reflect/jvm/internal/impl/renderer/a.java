package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final a NO_ARGUMENTS = new a("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final a UNLESS_EMPTY = new a("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final a ALWAYS_PARENTHESIZED = new a("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private a(String str, int i10, boolean z10, boolean z11) {
        this.includeAnnotationArguments = z10;
        this.includeEmptyAnnotationArguments = z11;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ a(String str, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11);
    }
}
