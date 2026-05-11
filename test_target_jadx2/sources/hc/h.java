package Hc;

import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.O;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BOOLEAN = new h("BOOLEAN", 0, "Boolean");
    public static final h BYTE;
    public static final h CHAR;
    public static final a Companion;
    public static final h DOUBLE;
    public static final h FLOAT;
    public static final h INT;
    public static final h LONG;
    public static final Set<h> NUMBER_TYPES;
    public static final h SHORT;
    private final Lazy arrayTypeFqName$delegate;
    private final id.f arrayTypeName;
    private final Lazy typeFqName$delegate;
    private final id.f typeName;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id.c invoke() {
            id.c c10 = j.f3891y.c(h.this.getArrayTypeName());
            Intrinsics.checkNotNullExpressionValue(c10, "child(...)");
            return c10;
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id.c invoke() {
            id.c c10 = j.f3891y.c(h.this.getTypeName());
            Intrinsics.checkNotNullExpressionValue(c10, "child(...)");
            return c10;
        }
    }

    private static final /* synthetic */ h[] $values() {
        return new h[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        h hVar = new h("CHAR", 1, "Char");
        CHAR = hVar;
        h hVar2 = new h("BYTE", 2, "Byte");
        BYTE = hVar2;
        h hVar3 = new h("SHORT", 3, "Short");
        SHORT = hVar3;
        h hVar4 = new h("INT", 4, "Int");
        INT = hVar4;
        h hVar5 = new h("FLOAT", 5, "Float");
        FLOAT = hVar5;
        h hVar6 = new h("LONG", 6, "Long");
        LONG = hVar6;
        h hVar7 = new h("DOUBLE", 7, "Double");
        DOUBLE = hVar7;
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
        NUMBER_TYPES = O.h(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7);
    }

    private h(String str, int i10, String str2) {
        id.f o10 = id.f.o(str2);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        this.typeName = o10;
        id.f o11 = id.f.o(str2 + "Array");
        Intrinsics.checkNotNullExpressionValue(o11, "identifier(...)");
        this.arrayTypeName = o11;
        lc.l lVar = lc.l.PUBLICATION;
        this.typeFqName$delegate = lc.i.b(lVar, new c());
        this.arrayTypeFqName$delegate = lc.i.b(lVar, new b());
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final id.c getArrayTypeFqName() {
        return (id.c) this.arrayTypeFqName$delegate.getValue();
    }

    public final id.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final id.c getTypeFqName() {
        return (id.c) this.typeFqName$delegate.getValue();
    }

    public final id.f getTypeName() {
        return this.typeName;
    }
}
