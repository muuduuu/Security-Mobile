package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4942i {

    /* renamed from: v5.i$a */
    public enum a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    /* renamed from: v5.i$b */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final b f43945c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        private final int f43946a;

        /* renamed from: b, reason: collision with root package name */
        private final int f43947b;

        private b(int i10, int i11) {
            this.f43946a = i10;
            this.f43947b = i11;
        }

        public static b a(InterfaceC4942i interfaceC4942i) {
            return b(interfaceC4942i.with(), interfaceC4942i.without());
        }

        public static b b(a[] aVarArr, a[] aVarArr2) {
            int i10 = 0;
            for (a aVar : aVarArr) {
                i10 |= 1 << aVar.ordinal();
            }
            int i11 = 0;
            for (a aVar2 : aVarArr2) {
                i11 |= 1 << aVar2.ordinal();
            }
            return new b(i10, i11);
        }

        public static b c() {
            return f43945c;
        }

        public Boolean d(a aVar) {
            int ordinal = 1 << aVar.ordinal();
            if ((this.f43947b & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this.f43946a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public b e(b bVar) {
            if (bVar == null) {
                return this;
            }
            int i10 = bVar.f43947b;
            int i11 = bVar.f43946a;
            if (i10 == 0 && i11 == 0) {
                return this;
            }
            int i12 = this.f43946a;
            if (i12 == 0 && this.f43947b == 0) {
                return bVar;
            }
            int i13 = ((~i10) & i12) | i11;
            int i14 = this.f43947b;
            int i15 = i10 | ((~i11) & i14);
            return (i13 == i12 && i15 == i14) ? this : new b(i13, i15);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f43946a == this.f43946a && bVar.f43947b == this.f43947b;
        }

        public int hashCode() {
            return this.f43947b + this.f43946a;
        }

        public String toString() {
            return this == f43945c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f43946a), Integer.valueOf(this.f43947b));
        }
    }

    /* renamed from: v5.i$c */
    public enum c {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    /* renamed from: v5.i$d */
    public static class d implements Serializable {

        /* renamed from: h, reason: collision with root package name */
        private static final d f43948h = new d();

        /* renamed from: a, reason: collision with root package name */
        private final String f43949a;

        /* renamed from: b, reason: collision with root package name */
        private final c f43950b;

        /* renamed from: c, reason: collision with root package name */
        private final Locale f43951c;

        /* renamed from: d, reason: collision with root package name */
        private final String f43952d;

        /* renamed from: e, reason: collision with root package name */
        private final Boolean f43953e;

        /* renamed from: f, reason: collision with root package name */
        private final b f43954f;

        /* renamed from: g, reason: collision with root package name */
        private transient TimeZone f43955g;

        public d() {
            this(BuildConfig.FLAVOR, c.ANY, BuildConfig.FLAVOR, BuildConfig.FLAVOR, b.c(), null);
        }

        private static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            if (obj2 == null) {
                return false;
            }
            return obj.equals(obj2);
        }

        public static final d b() {
            return f43948h;
        }

        public static d c(boolean z10) {
            return new d(BuildConfig.FLAVOR, null, null, null, null, b.c(), Boolean.valueOf(z10));
        }

        public static final d d(InterfaceC4942i interfaceC4942i) {
            return interfaceC4942i == null ? f43948h : new d(interfaceC4942i);
        }

        public static d o(d dVar, d dVar2) {
            return dVar == null ? dVar2 : dVar.q(dVar2);
        }

        public Boolean e(a aVar) {
            return this.f43954f.d(aVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f43950b == dVar.f43950b && this.f43954f.equals(dVar.f43954f)) {
                return a(this.f43953e, dVar.f43953e) && a(this.f43952d, dVar.f43952d) && a(this.f43949a, dVar.f43949a) && a(this.f43955g, dVar.f43955g) && a(this.f43951c, dVar.f43951c);
            }
            return false;
        }

        public Locale f() {
            return this.f43951c;
        }

        public String g() {
            return this.f43949a;
        }

        public c h() {
            return this.f43950b;
        }

        public int hashCode() {
            String str = this.f43952d;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this.f43949a;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = hashCode + this.f43950b.hashCode();
            Boolean bool = this.f43953e;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this.f43951c;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return hashCode2 ^ this.f43954f.hashCode();
        }

        public TimeZone i() {
            TimeZone timeZone = this.f43955g;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.f43952d;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.f43955g = timeZone2;
            return timeZone2;
        }

        public boolean j() {
            return this.f43953e != null;
        }

        public boolean k() {
            return this.f43951c != null;
        }

        public boolean l() {
            String str = this.f43949a;
            return str != null && str.length() > 0;
        }

        public boolean m() {
            return this.f43950b != c.ANY;
        }

        public boolean n() {
            String str;
            return (this.f43955g == null && ((str = this.f43952d) == null || str.isEmpty())) ? false : true;
        }

        public d p(Boolean bool) {
            return bool == this.f43953e ? this : new d(this.f43949a, this.f43950b, this.f43951c, this.f43952d, this.f43955g, this.f43954f, bool);
        }

        public final d q(d dVar) {
            d dVar2;
            String str;
            TimeZone timeZone;
            if (dVar == null || dVar == (dVar2 = f43948h) || dVar == this) {
                return this;
            }
            if (this == dVar2) {
                return dVar;
            }
            String str2 = dVar.f43949a;
            if (str2 == null || str2.isEmpty()) {
                str2 = this.f43949a;
            }
            String str3 = str2;
            c cVar = dVar.f43950b;
            if (cVar == c.ANY) {
                cVar = this.f43950b;
            }
            c cVar2 = cVar;
            Locale locale = dVar.f43951c;
            if (locale == null) {
                locale = this.f43951c;
            }
            Locale locale2 = locale;
            b bVar = this.f43954f;
            b e10 = bVar == null ? dVar.f43954f : bVar.e(dVar.f43954f);
            Boolean bool = dVar.f43953e;
            if (bool == null) {
                bool = this.f43953e;
            }
            Boolean bool2 = bool;
            String str4 = dVar.f43952d;
            if (str4 == null || str4.isEmpty()) {
                str = this.f43952d;
                timeZone = this.f43955g;
            } else {
                timeZone = dVar.f43955g;
                str = str4;
            }
            return new d(str3, cVar2, locale2, str, timeZone, e10, bool2);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.f43949a, this.f43950b, this.f43953e, this.f43951c, this.f43952d, this.f43954f);
        }

        public d(InterfaceC4942i interfaceC4942i) {
            this(interfaceC4942i.pattern(), interfaceC4942i.shape(), interfaceC4942i.locale(), interfaceC4942i.timezone(), b.a(interfaceC4942i), interfaceC4942i.lenient().asBoolean());
        }

        public d(String str, c cVar, String str2, String str3, b bVar, Boolean bool) {
            this(str, cVar, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, bVar, bool);
        }

        public d(String str, c cVar, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.f43949a = str == null ? BuildConfig.FLAVOR : str;
            this.f43950b = cVar == null ? c.ANY : cVar;
            this.f43951c = locale;
            this.f43955g = timeZone;
            this.f43952d = str2;
            this.f43954f = bVar == null ? b.c() : bVar;
            this.f43953e = bool;
        }
    }

    M lenient() default M.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    c shape() default c.ANY;

    String timezone() default "##default";

    a[] with() default {};

    a[] without() default {};
}
