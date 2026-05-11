package com.facebook.react.uimanager.events;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final a Companion;
    private final String jsName;
    public static final r START = new r("START", 0, "topTouchStart");
    public static final r END = new r("END", 1, "topTouchEnd");
    public static final r MOVE = new r("MOVE", 2, "topTouchMove");
    public static final r CANCEL = new r("CANCEL", 3, "topTouchCancel");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(r type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return type.getJsName();
        }

        private a() {
        }
    }

    private static final /* synthetic */ r[] $values() {
        return new r[]{START, END, MOVE, CANCEL};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private r(String str, int i10, String str2) {
        this.jsName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static final String getJSEventName(r rVar) {
        return Companion.a(rVar);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final String getJsName() {
        return this.jsName;
    }
}
