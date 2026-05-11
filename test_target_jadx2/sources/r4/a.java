package R4;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends m4.b {

    /* renamed from: B, reason: collision with root package name */
    public static final C0164a f8451B = new C0164a(null);

    /* renamed from: A, reason: collision with root package name */
    private final ReadableMap f8452A;

    /* renamed from: R4.a$a, reason: collision with other inner class name */
    public static final class C0164a {
        public /* synthetic */ C0164a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(m4.c builder, ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new a(builder, readableMap, null);
        }

        private C0164a() {
        }
    }

    public /* synthetic */ a(m4.c cVar, ReadableMap readableMap, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, readableMap);
    }

    public static final a z(m4.c cVar, ReadableMap readableMap) {
        return f8451B.a(cVar, readableMap);
    }

    public final ReadableMap A() {
        return this.f8452A;
    }

    private a(m4.c cVar, ReadableMap readableMap) {
        super(cVar);
        this.f8452A = readableMap;
    }
}
