package Rc;

import kotlin.enums.EnumEntries;
import qc.AbstractC3958a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d implements b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FROM_IDE = new d("FROM_IDE", 0);
    public static final d FROM_BACKEND = new d("FROM_BACKEND", 1);
    public static final d FROM_TEST = new d("FROM_TEST", 2);
    public static final d FROM_BUILTINS = new d("FROM_BUILTINS", 3);
    public static final d WHEN_CHECK_DECLARATION_CONFLICTS = new d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
    public static final d WHEN_CHECK_OVERRIDES = new d("WHEN_CHECK_OVERRIDES", 5);
    public static final d FOR_SCRIPT = new d("FOR_SCRIPT", 6);
    public static final d FROM_REFLECTION = new d("FROM_REFLECTION", 7);
    public static final d WHEN_RESOLVE_DECLARATION = new d("WHEN_RESOLVE_DECLARATION", 8);
    public static final d WHEN_GET_DECLARATION_SCOPE = new d("WHEN_GET_DECLARATION_SCOPE", 9);
    public static final d WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = new d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
    public static final d FOR_ALREADY_TRACKED = new d("FOR_ALREADY_TRACKED", 11);
    public static final d WHEN_GET_ALL_DESCRIPTORS = new d("WHEN_GET_ALL_DESCRIPTORS", 12);
    public static final d WHEN_TYPING = new d("WHEN_TYPING", 13);
    public static final d WHEN_GET_SUPER_MEMBERS = new d("WHEN_GET_SUPER_MEMBERS", 14);
    public static final d FOR_NON_TRACKED_SCOPE = new d("FOR_NON_TRACKED_SCOPE", 15);
    public static final d FROM_SYNTHETIC_SCOPE = new d("FROM_SYNTHETIC_SCOPE", 16);
    public static final d FROM_DESERIALIZATION = new d("FROM_DESERIALIZATION", 17);
    public static final d FROM_JAVA_LOADER = new d("FROM_JAVA_LOADER", 18);
    public static final d WHEN_GET_LOCAL_VARIABLE = new d("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final d WHEN_FIND_BY_FQNAME = new d("WHEN_FIND_BY_FQNAME", 20);
    public static final d WHEN_GET_COMPANION_OBJECT = new d("WHEN_GET_COMPANION_OBJECT", 21);
    public static final d FOR_DEFAULT_IMPORTS = new d("FOR_DEFAULT_IMPORTS", 22);

    private static final /* synthetic */ d[] $values() {
        return new d[]{FROM_IDE, FROM_BACKEND, FROM_TEST, FROM_BUILTINS, WHEN_CHECK_DECLARATION_CONFLICTS, WHEN_CHECK_OVERRIDES, FOR_SCRIPT, FROM_REFLECTION, WHEN_RESOLVE_DECLARATION, WHEN_GET_DECLARATION_SCOPE, WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS, FOR_ALREADY_TRACKED, WHEN_GET_ALL_DESCRIPTORS, WHEN_TYPING, WHEN_GET_SUPER_MEMBERS, FOR_NON_TRACKED_SCOPE, FROM_SYNTHETIC_SCOPE, FROM_DESERIALIZATION, FROM_JAVA_LOADER, WHEN_GET_LOCAL_VARIABLE, WHEN_FIND_BY_FQNAME, WHEN_GET_COMPANION_OBJECT, FOR_DEFAULT_IMPORTS};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC3958a.a($values);
    }

    private d(String str, int i10) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // Rc.b
    public a getLocation() {
        return null;
    }
}
