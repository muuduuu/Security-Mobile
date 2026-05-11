package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.t;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    private static final Set<n> ALL_TARGET_SET;
    private static final List<n> ANNOTATION_CLASS_LIST;
    public static final n BACKING_FIELD;
    private static final List<n> CLASS_LIST;
    private static final List<n> COMPANION_OBJECT_LIST;
    public static final n CONSTRUCTOR;
    public static final a Companion;
    private static final Set<n> DEFAULT_TARGET_SET;
    private static final List<n> ENUM_ENTRY_LIST;
    private static final List<n> ENUM_LIST;
    public static final n FIELD;
    private static final List<n> FILE_LIST;
    public static final n FUNCTION;
    private static final List<n> FUNCTION_LIST;
    private static final List<n> INTERFACE_LIST;
    private static final List<n> LOCAL_CLASS_LIST;
    public static final n LOCAL_VARIABLE;
    private static final List<n> OBJECT_LIST;
    public static final n PROPERTY;
    public static final n PROPERTY_GETTER;
    private static final List<n> PROPERTY_GETTER_LIST;
    public static final n PROPERTY_SETTER;
    private static final List<n> PROPERTY_SETTER_LIST;
    private static final Map<e, n> USE_SITE_MAPPING;
    public static final n VALUE_PARAMETER;
    private static final HashMap<String, n> map;
    private final String description;
    private final boolean isDefault;
    public static final n CLASS = new n("CLASS", 0, "class", 0 == true ? 1 : 0, 2, null);
    public static final n ANNOTATION_CLASS = new n("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final n TYPE_PARAMETER = new n("TYPE_PARAMETER", 2, "type parameter", false);
    public static final n TYPE = new n("TYPE", 11, "type usage", false);
    public static final n EXPRESSION = new n("EXPRESSION", 12, "expression", false);
    public static final n FILE = new n("FILE", 13, "file", false);
    public static final n TYPEALIAS = new n("TYPEALIAS", 14, "typealias", false);
    public static final n TYPE_PROJECTION = new n("TYPE_PROJECTION", 15, "type projection", false);
    public static final n STAR_PROJECTION = new n("STAR_PROJECTION", 16, "star projection", false);
    public static final n PROPERTY_PARAMETER = new n("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final n CLASS_ONLY = new n("CLASS_ONLY", 18, "class", false);
    public static final n OBJECT = new n("OBJECT", 19, "object", false);
    public static final n STANDALONE_OBJECT = new n("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final n COMPANION_OBJECT = new n("COMPANION_OBJECT", 21, "companion object", false);
    public static final n INTERFACE = new n("INTERFACE", 22, "interface", false);
    public static final n ENUM_CLASS = new n("ENUM_CLASS", 23, "enum class", false);
    public static final n ENUM_ENTRY = new n("ENUM_ENTRY", 24, "enum entry", false);
    public static final n LOCAL_CLASS = new n("LOCAL_CLASS", 25, "local class", false);
    public static final n LOCAL_FUNCTION = new n("LOCAL_FUNCTION", 26, "local function", false);
    public static final n MEMBER_FUNCTION = new n("MEMBER_FUNCTION", 27, "member function", false);
    public static final n TOP_LEVEL_FUNCTION = new n("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    public static final n MEMBER_PROPERTY = new n("MEMBER_PROPERTY", 29, "member property", false);
    public static final n MEMBER_PROPERTY_WITH_BACKING_FIELD = new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    public static final n MEMBER_PROPERTY_WITH_DELEGATE = new n("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    public static final n MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    public static final n TOP_LEVEL_PROPERTY = new n("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    public static final n TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    public static final n TOP_LEVEL_PROPERTY_WITH_DELEGATE = new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    public static final n TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    public static final n INITIALIZER = new n("INITIALIZER", 38, "initializer", false);
    public static final n DESTRUCTURING_DECLARATION = new n("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    public static final n LAMBDA_EXPRESSION = new n("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    public static final n ANONYMOUS_FUNCTION = new n("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    public static final n OBJECT_LITERAL = new n("OBJECT_LITERAL", 42, "object literal", false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ n[] $values() {
        return new n[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z10 = false;
        PROPERTY = new n("PROPERTY", 3, "property", z10, i10, defaultConstructorMarker);
        int i11 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z11 = false;
        FIELD = new n("FIELD", 4, "field", z11, i11, defaultConstructorMarker2);
        LOCAL_VARIABLE = new n("LOCAL_VARIABLE", 5, "local variable", z10, i10, defaultConstructorMarker);
        VALUE_PARAMETER = new n("VALUE_PARAMETER", 6, "value parameter", z11, i11, defaultConstructorMarker2);
        CONSTRUCTOR = new n("CONSTRUCTOR", 7, "constructor", z10, i10, defaultConstructorMarker);
        FUNCTION = new n("FUNCTION", 8, "function", z11, i11, defaultConstructorMarker2);
        PROPERTY_GETTER = new n("PROPERTY_GETTER", 9, "getter", z10, i10, defaultConstructorMarker);
        PROPERTY_SETTER = new n("PROPERTY_SETTER", 10, "setter", z11, i11, defaultConstructorMarker2);
        BACKING_FIELD = new n("BACKING_FIELD", 37, "backing field", z10, i10, defaultConstructorMarker);
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
        Companion = new a(null);
        map = new HashMap<>();
        for (n nVar : values()) {
            map.put(nVar.name(), nVar);
        }
        n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values) {
            if (nVar2.isDefault) {
                arrayList.add(nVar2);
            }
        }
        DEFAULT_TARGET_SET = CollectionsKt.S0(arrayList);
        ALL_TARGET_SET = AbstractC3574i.y0(values());
        n nVar3 = ANNOTATION_CLASS;
        n nVar4 = CLASS;
        ANNOTATION_CLASS_LIST = CollectionsKt.m(nVar3, nVar4);
        LOCAL_CLASS_LIST = CollectionsKt.m(LOCAL_CLASS, nVar4);
        CLASS_LIST = CollectionsKt.m(CLASS_ONLY, nVar4);
        n nVar5 = COMPANION_OBJECT;
        n nVar6 = OBJECT;
        COMPANION_OBJECT_LIST = CollectionsKt.m(nVar5, nVar6, nVar4);
        OBJECT_LIST = CollectionsKt.m(STANDALONE_OBJECT, nVar6, nVar4);
        INTERFACE_LIST = CollectionsKt.m(INTERFACE, nVar4);
        ENUM_LIST = CollectionsKt.m(ENUM_CLASS, nVar4);
        n nVar7 = ENUM_ENTRY;
        n nVar8 = PROPERTY;
        n nVar9 = FIELD;
        ENUM_ENTRY_LIST = CollectionsKt.m(nVar7, nVar8, nVar9);
        n nVar10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = CollectionsKt.e(nVar10);
        n nVar11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = CollectionsKt.e(nVar11);
        FUNCTION_LIST = CollectionsKt.e(FUNCTION);
        n nVar12 = FILE;
        FILE_LIST = CollectionsKt.e(nVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = G.k(t.a(eVar, nVar13), t.a(e.FIELD, nVar9), t.a(e.PROPERTY, nVar8), t.a(e.FILE, nVar12), t.a(e.PROPERTY_GETTER, nVar11), t.a(e.PROPERTY_SETTER, nVar10), t.a(e.RECEIVER, nVar13), t.a(e.SETTER_PARAMETER, nVar13), t.a(e.PROPERTY_DELEGATE_FIELD, nVar9));
    }

    private n(String str, int i10, String str2, boolean z10) {
        this.description = str2;
        this.isDefault = z10;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    /* synthetic */ n(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }
}
