package Ic;

import Ic.f;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c Function = new c("Function", 0);
    public static final c SuspendFunction = new c("SuspendFunction", 1);
    public static final c KFunction = new c("KFunction", 2);
    public static final c KSuspendFunction = new c("KSuspendFunction", 3);
    public static final c UNKNOWN = new c("UNKNOWN", 4);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f functionTypeKind) {
            Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
            return Intrinsics.b(functionTypeKind, f.a.f4418e) ? c.Function : Intrinsics.b(functionTypeKind, f.d.f4421e) ? c.SuspendFunction : Intrinsics.b(functionTypeKind, f.b.f4419e) ? c.KFunction : Intrinsics.b(functionTypeKind, f.c.f4420e) ? c.KSuspendFunction : c.UNKNOWN;
        }

        private a() {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
    }

    private c(String str, int i10) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
