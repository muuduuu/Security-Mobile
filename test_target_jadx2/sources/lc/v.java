package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37142b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte f37143a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ v(byte b10) {
        this.f37143a = b10;
    }

    public static final /* synthetic */ v b(byte b10) {
        return new v(b10);
    }

    public static boolean d(byte b10, Object obj) {
        return (obj instanceof v) && b10 == ((v) obj).o();
    }

    public static int e(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String n(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.g(o() & 255, ((v) obj).o() & 255);
    }

    public boolean equals(Object obj) {
        return d(this.f37143a, obj);
    }

    public int hashCode() {
        return e(this.f37143a);
    }

    public final /* synthetic */ byte o() {
        return this.f37143a;
    }

    public String toString() {
        return n(this.f37143a);
    }

    public static byte c(byte b10) {
        return b10;
    }
}
