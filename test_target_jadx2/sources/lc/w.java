package lc;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class w implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37144b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f37145a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ w(int i10) {
        this.f37145a = i10;
    }

    public static final /* synthetic */ w b(int i10) {
        return new w(i10);
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof w) && i10 == ((w) obj).o();
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC3621C.a(o(), ((w) obj).o());
    }

    public boolean equals(Object obj) {
        return d(this.f37145a, obj);
    }

    public int hashCode() {
        return e(this.f37145a);
    }

    public final /* synthetic */ int o() {
        return this.f37145a;
    }

    public String toString() {
        return n(this.f37145a);
    }

    public static int c(int i10) {
        return i10;
    }
}
