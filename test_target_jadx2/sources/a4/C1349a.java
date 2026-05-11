package a4;

import b3.l;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import org.conscrypt.BuildConfig;
import xc.C5146G;
import xc.m;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349a {

    /* renamed from: c, reason: collision with root package name */
    public static final b f12568c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Lazy f12569d = i.a(C0234a.f12572a);

    /* renamed from: a, reason: collision with root package name */
    public final int f12570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12571b;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    static final class C0234a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0234a f12572a = new C0234a();

        C0234a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            return Pattern.compile("[-/ ]");
        }
    }

    /* renamed from: a4.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = C1349a.f12569d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-headerParsingRegEx>(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int i10) {
            return i10 == Integer.MAX_VALUE ? BuildConfig.FLAVOR : String.valueOf(i10);
        }

        public final C1349a b(int i10) {
            l.b(Boolean.valueOf(i10 >= 0));
            return new C1349a(i10, Integer.MAX_VALUE);
        }

        public final C1349a c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] split = d().split(str);
                l.b(Boolean.valueOf(split.length == 4));
                l.b(Boolean.valueOf(Intrinsics.b(split[0], "bytes")));
                String str2 = split[1];
                Intrinsics.checkNotNullExpressionValue(str2, "headerParts[1]");
                int parseInt = Integer.parseInt(str2);
                String str3 = split[2];
                Intrinsics.checkNotNullExpressionValue(str3, "headerParts[2]");
                int parseInt2 = Integer.parseInt(str3);
                String str4 = split[3];
                Intrinsics.checkNotNullExpressionValue(str4, "headerParts[3]");
                int parseInt3 = Integer.parseInt(str4);
                l.b(Boolean.valueOf(parseInt2 > parseInt));
                l.b(Boolean.valueOf(parseInt3 > parseInt2));
                return parseInt2 < parseInt3 - 1 ? new C1349a(parseInt, parseInt2) : new C1349a(parseInt, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e10) {
                C5146G c5146g = C5146G.f44966a;
                String format = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                throw new IllegalArgumentException(format, e10);
            }
        }

        public final C1349a e(int i10) {
            l.b(Boolean.valueOf(i10 > 0));
            return new C1349a(0, i10);
        }

        private b() {
        }
    }

    public C1349a(int i10, int i11) {
        this.f12570a = i10;
        this.f12571b = i11;
    }

    public static final C1349a c(int i10) {
        return f12568c.b(i10);
    }

    public static final C1349a e(int i10) {
        return f12568c.e(i10);
    }

    public final boolean b(C1349a c1349a) {
        return c1349a != null && this.f12570a <= c1349a.f12570a && c1349a.f12571b <= this.f12571b;
    }

    public final String d() {
        C5146G c5146g = C5146G.f44966a;
        b bVar = f12568c;
        String format = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{bVar.f(this.f12570a), bVar.f(this.f12571b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(C1349a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        C1349a c1349a = (C1349a) obj;
        return this.f12570a == c1349a.f12570a && this.f12571b == c1349a.f12571b;
    }

    public int hashCode() {
        return (this.f12570a * 31) + this.f12571b;
    }

    public String toString() {
        C5146G c5146g = C5146G.f44966a;
        b bVar = f12568c;
        String format = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{bVar.f(this.f12570a), bVar.f(this.f12571b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }
}
