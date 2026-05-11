package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final b f36824d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final d f36825e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f36826f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36827a;

    /* renamed from: b, reason: collision with root package name */
    private final a f36828b;

    /* renamed from: c, reason: collision with root package name */
    private final c f36829c;

    public static final class a {

        /* renamed from: j, reason: collision with root package name */
        public static final C0541a f36830j = new C0541a(null);

        /* renamed from: k, reason: collision with root package name */
        private static final a f36831k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);

        /* renamed from: a, reason: collision with root package name */
        private final int f36832a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36833b;

        /* renamed from: c, reason: collision with root package name */
        private final String f36834c;

        /* renamed from: d, reason: collision with root package name */
        private final String f36835d;

        /* renamed from: e, reason: collision with root package name */
        private final String f36836e;

        /* renamed from: f, reason: collision with root package name */
        private final String f36837f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f36838g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f36839h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f36840i;

        /* renamed from: kotlin.text.d$a$a, reason: collision with other inner class name */
        public static final class C0541a {
            public /* synthetic */ C0541a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f36831k;
            }

            private C0541a() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r4 != false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            boolean b10;
            boolean b11;
            boolean b12;
            boolean b13;
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f36832a = i10;
            this.f36833b = i11;
            this.f36834c = groupSeparator;
            this.f36835d = byteSeparator;
            this.f36836e = bytePrefix;
            this.f36837f = byteSuffix;
            boolean z10 = false;
            this.f36838g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f36839h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            b10 = e.b(groupSeparator);
            if (!b10) {
                b11 = e.b(byteSeparator);
                if (!b11) {
                    b12 = e.b(bytePrefix);
                    if (!b12) {
                        b13 = e.b(byteSuffix);
                    }
                }
            }
            z10 = true;
            this.f36840i = z10;
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f36832a);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f36833b);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f36834c);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f36835d);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f36836e);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f36837f);
            sb2.append("\"");
            return sb2;
        }

        public final String c() {
            return this.f36836e;
        }

        public final String d() {
            return this.f36835d;
        }

        public final String e() {
            return this.f36837f;
        }

        public final int f() {
            return this.f36833b;
        }

        public final int g() {
            return this.f36832a;
        }

        public final String h() {
            return this.f36834c;
        }

        public final boolean i() {
            return this.f36838g;
        }

        public final boolean j() {
            return this.f36839h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            StringBuilder b10 = b(sb2, "    ");
            b10.append('\n');
            Intrinsics.checkNotNullExpressionValue(b10, "append(...)");
            sb2.append(")");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f36825e;
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: h, reason: collision with root package name */
        public static final a f36841h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        private static final c f36842i = new c(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, 1);

        /* renamed from: a, reason: collision with root package name */
        private final String f36843a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36844b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f36845c;

        /* renamed from: d, reason: collision with root package name */
        private final int f36846d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f36847e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f36848f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f36849g;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f36842i;
            }

            private a() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r3 != false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(String prefix, String suffix, boolean z10, int i10) {
            boolean b10;
            boolean b11;
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.f36843a = prefix;
            this.f36844b = suffix;
            this.f36845c = z10;
            this.f36846d = i10;
            boolean z11 = false;
            boolean z12 = prefix.length() == 0 && suffix.length() == 0;
            this.f36847e = z12;
            this.f36848f = z12 && i10 == 1;
            b10 = e.b(prefix);
            if (!b10) {
                b11 = e.b(suffix);
            }
            z11 = true;
            this.f36849g = z11;
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f36843a);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f36844b);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f36845c);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(',');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f36846d);
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            StringBuilder b10 = b(sb2, "    ");
            b10.append('\n');
            Intrinsics.checkNotNullExpressionValue(b10, "append(...)");
            sb2.append(")");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    static {
        a.C0541a c0541a = a.f36830j;
        a a10 = c0541a.a();
        c.a aVar = c.f36841h;
        f36825e = new d(false, a10, aVar.a());
        f36826f = new d(true, c0541a.a(), aVar.a());
    }

    public d(boolean z10, a bytes, c number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f36827a = z10;
        this.f36828b = bytes;
        this.f36829c = number;
    }

    public final a b() {
        return this.f36828b;
    }

    public final boolean c() {
        return this.f36827a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    upperCase = ");
        sb2.append(this.f36827a);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(",");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder b10 = this.f36828b.b(sb2, "        ");
        b10.append('\n');
        Intrinsics.checkNotNullExpressionValue(b10, "append(...)");
        sb2.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder b11 = this.f36829c.b(sb2, "        ");
        b11.append('\n');
        Intrinsics.checkNotNullExpressionValue(b11, "append(...)");
        sb2.append("    )");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(")");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
