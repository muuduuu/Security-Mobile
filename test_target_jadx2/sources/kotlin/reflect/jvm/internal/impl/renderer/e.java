package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final Set<e> ALL;
    public static final Set<e> ALL_EXCEPT_ANNOTATIONS;
    public static final a Companion;
    private final boolean includeByDefault;
    public static final e VISIBILITY = new e("VISIBILITY", 0, true);
    public static final e MODALITY = new e("MODALITY", 1, true);
    public static final e OVERRIDE = new e("OVERRIDE", 2, true);
    public static final e ANNOTATIONS = new e("ANNOTATIONS", 3, false);
    public static final e INNER = new e("INNER", 4, true);
    public static final e MEMBER_KIND = new e("MEMBER_KIND", 5, true);
    public static final e DATA = new e("DATA", 6, true);
    public static final e INLINE = new e("INLINE", 7, true);
    public static final e EXPECT = new e("EXPECT", 8, true);
    public static final e ACTUAL = new e("ACTUAL", 9, true);
    public static final e CONST = new e("CONST", 10, true);
    public static final e LATEINIT = new e("LATEINIT", 11, true);
    public static final e FUN = new e("FUN", 12, true);
    public static final e VALUE = new e("VALUE", 13, true);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ e[] $values() {
        return new e[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
        e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (e eVar : values) {
            if (eVar.includeByDefault) {
                arrayList.add(eVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt.S0(arrayList);
        ALL = AbstractC3574i.y0(values());
    }

    private e(String str, int i10, boolean z10) {
        this.includeByDefault = z10;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
