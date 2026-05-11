package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    private final String debugMessage;
    public static final g CAPTURED_TYPE_SCOPE = new g("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
    public static final g INTEGER_LITERAL_TYPE_SCOPE = new g("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
    public static final g ERASED_RECEIVER_TYPE_SCOPE = new g("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
    public static final g SCOPE_FOR_ABBREVIATION_TYPE = new g("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
    public static final g STUB_TYPE_SCOPE = new g("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
    public static final g NON_CLASSIFIER_SUPER_TYPE_SCOPE = new g("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
    public static final g ERROR_TYPE_SCOPE = new g("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
    public static final g UNSUPPORTED_TYPE_SCOPE = new g("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
    public static final g SCOPE_FOR_ERROR_CLASS = new g("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
    public static final g SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = new g("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    private static final /* synthetic */ g[] $values() {
        return new g[]{CAPTURED_TYPE_SCOPE, INTEGER_LITERAL_TYPE_SCOPE, ERASED_RECEIVER_TYPE_SCOPE, SCOPE_FOR_ABBREVIATION_TYPE, STUB_TYPE_SCOPE, NON_CLASSIFIER_SUPER_TYPE_SCOPE, ERROR_TYPE_SCOPE, UNSUPPORTED_TYPE_SCOPE, SCOPE_FOR_ERROR_CLASS, SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private g(String str, int i10, String str2) {
        this.debugMessage = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
