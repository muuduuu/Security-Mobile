package s5;

import com.facebook.systrace.TraceListener;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;
import qc.AbstractC3958a;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4313a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4313a f40773a = new C4313a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: s5.a$a, reason: collision with other inner class name */
    public static final class EnumC0611a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0611a[] $VALUES;
        private final char code;
        public static final EnumC0611a THREAD = new EnumC0611a("THREAD", 0, 't');
        public static final EnumC0611a PROCESS = new EnumC0611a("PROCESS", 1, 'p');
        public static final EnumC0611a GLOBAL = new EnumC0611a("GLOBAL", 2, 'g');

        private static final /* synthetic */ EnumC0611a[] $values() {
            return new EnumC0611a[]{THREAD, PROCESS, GLOBAL};
        }

        static {
            EnumC0611a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private EnumC0611a(String str, int i10, char c10) {
            this.code = c10;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static EnumC0611a valueOf(String str) {
            return (EnumC0611a) Enum.valueOf(EnumC0611a.class, str);
        }

        public static EnumC0611a[] values() {
            return (EnumC0611a[]) $VALUES.clone();
        }

        public final char getCode() {
            return this.code;
        }
    }

    private C4313a() {
    }

    public static final void a(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        AbstractC3901a.a(sectionName, i10);
    }

    public static final void b(long j10, String sectionName, int i10, long j11) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void c(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        AbstractC3901a.c(sectionName);
    }

    public static final void d(long j10, String sectionName, String[] args, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(args, "args");
        AbstractC3901a.c(sectionName + "|" + f40773a.e(args, i10));
    }

    private final String e(String[] strArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < i10; i11 += 2) {
            String str = strArr[i11 - 1];
            String str2 = strArr[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < i10 - 1) {
                sb2.append(';');
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final void f(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void g(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        AbstractC3901a.d(sectionName, i10);
    }

    public static final void h(long j10, String sectionName, int i10, long j11) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void i(long j10) {
        AbstractC3901a.f();
    }

    public static final boolean j(long j10) {
        return false;
    }

    public static final void l(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void m(long j10, String counterName, int i10) {
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        AbstractC3901a.j(counterName, i10);
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void o(TraceListener traceListener) {
    }

    public static final void n(long j10, String str, EnumC0611a enumC0611a) {
    }
}
