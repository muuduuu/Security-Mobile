package bd;

import id.C3367b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface r extends ud.v {

    public static abstract class a {

        /* renamed from: bd.r$a$a, reason: collision with other inner class name */
        public static final class C0337a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final t f19041a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f19042b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0337a(t kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f19041a = kotlinJvmBinaryClass;
                this.f19042b = bArr;
            }

            public final t b() {
                return this.f19041a;
            }

            public /* synthetic */ C0337a(t tVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(tVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            C0337a c0337a = this instanceof C0337a ? (C0337a) this : null;
            if (c0337a != null) {
                return c0337a.b();
            }
            return null;
        }

        private a() {
        }
    }

    a a(Zc.g gVar, hd.e eVar);

    a c(C3367b c3367b, hd.e eVar);
}
