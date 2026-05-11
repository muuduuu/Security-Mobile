package J4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4780a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final f f4781b = new f();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private f() {
    }

    @Override // J4.e
    public boolean a() {
        return false;
    }

    @Override // J4.e
    public int b() {
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + a());
    }

    @Override // J4.e
    public e c() {
        throw new IllegalStateException("Should not update as canRetry is: " + a());
    }

    @Override // J4.e
    public e copy() {
        return this;
    }
}
