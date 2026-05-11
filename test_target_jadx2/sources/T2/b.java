package T2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f9149a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9150b;

    public static final class a extends b {
        public a() {
            super(K2.c.f5117d, K2.a.f5104f, null);
        }
    }

    /* renamed from: T2.b$b, reason: collision with other inner class name */
    public static final class C0180b extends b {
        public C0180b() {
            super(K2.c.f5118e, K2.a.f5105g, null);
        }
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public final int a() {
        return this.f9150b;
    }

    public final int b() {
        return this.f9149a;
    }

    private b(int i10, int i11) {
        this.f9149a = i10;
        this.f9150b = i11;
    }
}
