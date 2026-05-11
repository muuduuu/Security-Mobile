package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37149b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final short f37150a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ z(short s10) {
        this.f37150a = s10;
    }

    public static final /* synthetic */ z b(short s10) {
        return new z(s10);
    }

    public static boolean d(short s10, Object obj) {
        return (obj instanceof z) && s10 == ((z) obj).o();
    }

    public static int e(short s10) {
        return Short.hashCode(s10);
    }

    public static String n(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.g(o() & 65535, ((z) obj).o() & 65535);
    }

    public boolean equals(Object obj) {
        return d(this.f37150a, obj);
    }

    public int hashCode() {
        return e(this.f37150a);
    }

    public final /* synthetic */ short o() {
        return this.f37150a;
    }

    public String toString() {
        return n(this.f37150a);
    }

    public static short c(short s10) {
        return s10;
    }
}
