package cd;

import hd.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import qc.AbstractC3958a;

/* renamed from: cd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1750a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0347a f19439a;

    /* renamed from: b, reason: collision with root package name */
    private final e f19440b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f19441c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f19442d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f19443e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19444f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19445g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19446h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f19447i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: cd.a$a, reason: collision with other inner class name */
    public static final class EnumC0347a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0347a[] $VALUES;
        public static final C0348a Companion;
        private static final Map<Integer, EnumC0347a> entryById;

        /* renamed from: id, reason: collision with root package name */
        private final int f19448id;
        public static final EnumC0347a UNKNOWN = new EnumC0347a("UNKNOWN", 0, 0);
        public static final EnumC0347a CLASS = new EnumC0347a("CLASS", 1, 1);
        public static final EnumC0347a FILE_FACADE = new EnumC0347a("FILE_FACADE", 2, 2);
        public static final EnumC0347a SYNTHETIC_CLASS = new EnumC0347a("SYNTHETIC_CLASS", 3, 3);
        public static final EnumC0347a MULTIFILE_CLASS = new EnumC0347a("MULTIFILE_CLASS", 4, 4);
        public static final EnumC0347a MULTIFILE_CLASS_PART = new EnumC0347a("MULTIFILE_CLASS_PART", 5, 5);

        /* renamed from: cd.a$a$a, reason: collision with other inner class name */
        public static final class C0348a {
            public /* synthetic */ C0348a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0347a a(int i10) {
                EnumC0347a enumC0347a = (EnumC0347a) EnumC0347a.entryById.get(Integer.valueOf(i10));
                return enumC0347a == null ? EnumC0347a.UNKNOWN : enumC0347a;
            }

            private C0348a() {
            }
        }

        private static final /* synthetic */ EnumC0347a[] $values() {
            return new EnumC0347a[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
        }

        static {
            EnumC0347a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
            Companion = new C0348a(null);
            EnumC0347a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(G.d(values.length), 16));
            for (EnumC0347a enumC0347a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0347a.f19448id), enumC0347a);
            }
            entryById = linkedHashMap;
        }

        private EnumC0347a(String str, int i10, int i11) {
            this.f19448id = i11;
        }

        public static final EnumC0347a getById(int i10) {
            return Companion.a(i10);
        }

        public static EnumC0347a valueOf(String str) {
            return (EnumC0347a) Enum.valueOf(EnumC0347a.class, str);
        }

        public static EnumC0347a[] values() {
            return (EnumC0347a[]) $VALUES.clone();
        }
    }

    public C1750a(EnumC0347a kind, e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f19439a = kind;
        this.f19440b = metadataVersion;
        this.f19441c = strArr;
        this.f19442d = strArr2;
        this.f19443e = strArr3;
        this.f19444f = str;
        this.f19445g = i10;
        this.f19446h = str2;
        this.f19447i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f19441c;
    }

    public final String[] b() {
        return this.f19442d;
    }

    public final EnumC0347a c() {
        return this.f19439a;
    }

    public final e d() {
        return this.f19440b;
    }

    public final String e() {
        String str = this.f19444f;
        if (this.f19439a == EnumC0347a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f19441c;
        if (this.f19439a != EnumC0347a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List d10 = strArr != null ? AbstractC3574i.d(strArr) : null;
        return d10 == null ? CollectionsKt.j() : d10;
    }

    public final String[] g() {
        return this.f19443e;
    }

    public final boolean i() {
        return h(this.f19445g, 2);
    }

    public final boolean j() {
        return h(this.f19445g, 64) && !h(this.f19445g, 32);
    }

    public final boolean k() {
        return h(this.f19445g, 16) && !h(this.f19445g, 32);
    }

    public String toString() {
        return this.f19439a + " version=" + this.f19440b;
    }
}
