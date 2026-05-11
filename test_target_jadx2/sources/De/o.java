package De;

import De.f;
import Td.G;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* loaded from: classes3.dex */
final class o extends f.a {

    /* renamed from: a, reason: collision with root package name */
    static final f.a f1695a = new o();

    static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        final f f1696a;

        a(f fVar) {
            this.f1696a = fVar;
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional a(G g10) {
            return Optional.ofNullable(this.f1696a.a(g10));
        }
    }

    o() {
    }

    @Override // De.f.a
    public f d(Type type, Annotation[] annotationArr, A a10) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(a10.h(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
