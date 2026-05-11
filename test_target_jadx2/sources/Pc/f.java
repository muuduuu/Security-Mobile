package Pc;

import Zc.InterfaceC1329b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f implements InterfaceC1329b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7745b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final id.f f7746a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Object value, id.f fVar) {
            Intrinsics.checkNotNullParameter(value, "value");
            return d.h(value.getClass()) ? new q(fVar, (Enum) value) : value instanceof Annotation ? new g(fVar, (Annotation) value) : value instanceof Object[] ? new j(fVar, (Object[]) value) : value instanceof Class ? new m(fVar, (Class) value) : new s(fVar, value);
        }

        private a() {
        }
    }

    public /* synthetic */ f(id.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // Zc.InterfaceC1329b
    public id.f getName() {
        return this.f7746a;
    }

    private f(id.f fVar) {
        this.f7746a = fVar;
    }
}
