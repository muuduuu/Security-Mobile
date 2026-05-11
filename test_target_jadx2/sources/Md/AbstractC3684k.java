package md;

import Kc.G;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: md.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3684k extends AbstractC3680g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37484b = new a(null);

    /* renamed from: md.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3684k a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new b(message);
        }

        private a() {
        }
    }

    /* renamed from: md.k$b */
    public static final class b extends AbstractC3684k {

        /* renamed from: c, reason: collision with root package name */
        private final String f37485c;

        public b(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f37485c = message;
        }

        @Override // md.AbstractC3680g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.error.h a(G module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_CONSTANT_VALUE, this.f37485c);
        }

        @Override // md.AbstractC3680g
        public String toString() {
            return this.f37485c;
        }
    }

    public AbstractC3684k() {
        super(Unit.f36324a);
    }

    @Override // md.AbstractC3680g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Unit b() {
        throw new UnsupportedOperationException();
    }
}
