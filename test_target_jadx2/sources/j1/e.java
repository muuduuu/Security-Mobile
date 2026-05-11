package j1;

import h1.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l1.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final b f35711e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f35712a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f35713b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f35714c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f35715d;

    public static final class a {

        /* renamed from: h, reason: collision with root package name */
        public static final C0514a f35716h = new C0514a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f35717a;

        /* renamed from: b, reason: collision with root package name */
        public final String f35718b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35719c;

        /* renamed from: d, reason: collision with root package name */
        public final int f35720d;

        /* renamed from: e, reason: collision with root package name */
        public final String f35721e;

        /* renamed from: f, reason: collision with root package name */
        public final int f35722f;

        /* renamed from: g, reason: collision with root package name */
        public final int f35723g;

        /* renamed from: j1.e$a$a, reason: collision with other inner class name */
        public static final class C0514a {
            public /* synthetic */ C0514a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.b(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.b(StringsKt.S0(substring).toString(), str);
            }

            private C0514a() {
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f35717a = name;
            this.f35718b = type;
            this.f35719c = z10;
            this.f35720d = i10;
            this.f35721e = str;
            this.f35722f = i11;
            this.f35723g = a(type);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.K(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (StringsKt.K(upperCase, "CHAR", false, 2, null) || StringsKt.K(upperCase, "CLOB", false, 2, null) || StringsKt.K(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (StringsKt.K(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (StringsKt.K(upperCase, "REAL", false, 2, null) || StringsKt.K(upperCase, "FLOA", false, 2, null) || StringsKt.K(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f35720d != ((a) obj).f35720d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.b(this.f35717a, aVar.f35717a) || this.f35719c != aVar.f35719c) {
                return false;
            }
            if (this.f35722f == 1 && aVar.f35722f == 2 && (str3 = this.f35721e) != null && !f35716h.b(str3, aVar.f35721e)) {
                return false;
            }
            if (this.f35722f == 2 && aVar.f35722f == 1 && (str2 = aVar.f35721e) != null && !f35716h.b(str2, this.f35721e)) {
                return false;
            }
            int i10 = this.f35722f;
            return (i10 == 0 || i10 != aVar.f35722f || ((str = this.f35721e) == null ? aVar.f35721e == null : f35716h.b(str, aVar.f35721e))) && this.f35723g == aVar.f35723g;
        }

        public int hashCode() {
            return (((((this.f35717a.hashCode() * 31) + this.f35723g) * 31) + (this.f35719c ? 1231 : 1237)) * 31) + this.f35720d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f35717a);
            sb2.append("', type='");
            sb2.append(this.f35718b);
            sb2.append("', affinity='");
            sb2.append(this.f35723g);
            sb2.append("', notNull=");
            sb2.append(this.f35719c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f35720d);
            sb2.append(", defaultValue='");
            String str = this.f35721e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(g database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return f.f(database, tableName);
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f35724a;

        /* renamed from: b, reason: collision with root package name */
        public final String f35725b;

        /* renamed from: c, reason: collision with root package name */
        public final String f35726c;

        /* renamed from: d, reason: collision with root package name */
        public final List f35727d;

        /* renamed from: e, reason: collision with root package name */
        public final List f35728e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f35724a = referenceTable;
            this.f35725b = onDelete;
            this.f35726c = onUpdate;
            this.f35727d = columnNames;
            this.f35728e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.b(this.f35724a, cVar.f35724a) && Intrinsics.b(this.f35725b, cVar.f35725b) && Intrinsics.b(this.f35726c, cVar.f35726c) && Intrinsics.b(this.f35727d, cVar.f35727d)) {
                return Intrinsics.b(this.f35728e, cVar.f35728e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f35724a.hashCode() * 31) + this.f35725b.hashCode()) * 31) + this.f35726c.hashCode()) * 31) + this.f35727d.hashCode()) * 31) + this.f35728e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f35724a + "', onDelete='" + this.f35725b + " +', onUpdate='" + this.f35726c + "', columnNames=" + this.f35727d + ", referenceColumnNames=" + this.f35728e + '}';
        }
    }

    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final int f35729a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35730b;

        /* renamed from: c, reason: collision with root package name */
        private final String f35731c;

        /* renamed from: d, reason: collision with root package name */
        private final String f35732d;

        public d(int i10, int i11, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f35729a = i10;
            this.f35730b = i11;
            this.f35731c = from;
            this.f35732d = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = this.f35729a - other.f35729a;
            return i10 == 0 ? this.f35730b - other.f35730b : i10;
        }

        public final String c() {
            return this.f35731c;
        }

        public final int d() {
            return this.f35729a;
        }

        public final String e() {
            return this.f35732d;
        }
    }

    /* renamed from: j1.e$e, reason: collision with other inner class name */
    public static final class C0515e {

        /* renamed from: e, reason: collision with root package name */
        public static final a f35733e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f35734a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35735b;

        /* renamed from: c, reason: collision with root package name */
        public final List f35736c;

        /* renamed from: d, reason: collision with root package name */
        public List f35737d;

        /* renamed from: j1.e$e$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public C0515e(String name, boolean z10, List columns, List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f35734a = name;
            this.f35735b = z10;
            this.f35736c = columns;
            this.f35737d = orders;
            List list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list.add(l.ASC.name());
                }
            }
            this.f35737d = (List) list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0515e)) {
                return false;
            }
            C0515e c0515e = (C0515e) obj;
            if (this.f35735b == c0515e.f35735b && Intrinsics.b(this.f35736c, c0515e.f35736c) && Intrinsics.b(this.f35737d, c0515e.f35737d)) {
                return StringsKt.F(this.f35734a, "index_", false, 2, null) ? StringsKt.F(c0515e.f35734a, "index_", false, 2, null) : Intrinsics.b(this.f35734a, c0515e.f35734a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.F(this.f35734a, "index_", false, 2, null) ? -1184239155 : this.f35734a.hashCode()) * 31) + (this.f35735b ? 1 : 0)) * 31) + this.f35736c.hashCode()) * 31) + this.f35737d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f35734a + "', unique=" + this.f35735b + ", columns=" + this.f35736c + ", orders=" + this.f35737d + "'}";
        }
    }

    public e(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f35712a = name;
        this.f35713b = columns;
        this.f35714c = foreignKeys;
        this.f35715d = set;
    }

    public static final e a(g gVar, String str) {
        return f35711e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Intrinsics.b(this.f35712a, eVar.f35712a) || !Intrinsics.b(this.f35713b, eVar.f35713b) || !Intrinsics.b(this.f35714c, eVar.f35714c)) {
            return false;
        }
        Set set2 = this.f35715d;
        if (set2 == null || (set = eVar.f35715d) == null) {
            return true;
        }
        return Intrinsics.b(set2, set);
    }

    public int hashCode() {
        return (((this.f35712a.hashCode() * 31) + this.f35713b.hashCode()) * 31) + this.f35714c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f35712a + "', columns=" + this.f35713b + ", foreignKeys=" + this.f35714c + ", indices=" + this.f35715d + '}';
    }
}
