package com.facebook.react.common;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LifecycleState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LifecycleState[] $VALUES;
    public static final LifecycleState BEFORE_CREATE = new LifecycleState("BEFORE_CREATE", 0);
    public static final LifecycleState BEFORE_RESUME = new LifecycleState("BEFORE_RESUME", 1);
    public static final LifecycleState RESUMED = new LifecycleState("RESUMED", 2);

    private static final /* synthetic */ LifecycleState[] $values() {
        return new LifecycleState[]{BEFORE_CREATE, BEFORE_RESUME, RESUMED};
    }

    static {
        LifecycleState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private LifecycleState(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) $VALUES.clone();
    }
}
