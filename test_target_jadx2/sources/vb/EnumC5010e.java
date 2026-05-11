package vb;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5010e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC5010e[] $VALUES;
    public static final EnumC5010e MODULE_CREATE = new EnumC5010e("MODULE_CREATE", 0);
    public static final EnumC5010e MODULE_DESTROY = new EnumC5010e("MODULE_DESTROY", 1);
    public static final EnumC5010e ACTIVITY_ENTERS_FOREGROUND = new EnumC5010e("ACTIVITY_ENTERS_FOREGROUND", 2);
    public static final EnumC5010e ACTIVITY_ENTERS_BACKGROUND = new EnumC5010e("ACTIVITY_ENTERS_BACKGROUND", 3);
    public static final EnumC5010e ACTIVITY_DESTROYS = new EnumC5010e("ACTIVITY_DESTROYS", 4);
    public static final EnumC5010e ON_NEW_INTENT = new EnumC5010e("ON_NEW_INTENT", 5);
    public static final EnumC5010e ON_ACTIVITY_RESULT = new EnumC5010e("ON_ACTIVITY_RESULT", 6);
    public static final EnumC5010e ON_USER_LEAVES_ACTIVITY = new EnumC5010e("ON_USER_LEAVES_ACTIVITY", 7);

    private static final /* synthetic */ EnumC5010e[] $values() {
        return new EnumC5010e[]{MODULE_CREATE, MODULE_DESTROY, ACTIVITY_ENTERS_FOREGROUND, ACTIVITY_ENTERS_BACKGROUND, ACTIVITY_DESTROYS, ON_NEW_INTENT, ON_ACTIVITY_RESULT, ON_USER_LEAVES_ACTIVITY};
    }

    static {
        EnumC5010e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private EnumC5010e(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EnumC5010e valueOf(String str) {
        return (EnumC5010e) Enum.valueOf(EnumC5010e.class, str);
    }

    public static EnumC5010e[] values() {
        return (EnumC5010e[]) $VALUES.clone();
    }
}
