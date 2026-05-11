package Ab;

import Db.AbstractC0812v;
import Db.W;
import Db.X;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.A;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.n;
import expo.modules.kotlin.jni.ExpectedType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import kotlin.text.StringsKt;
import lc.i;
import lc.t;
import pb.C3862a;
import sb.InterfaceC4510a;
import vc.AbstractC5011a;
import xc.C5142C;
import xc.m;

/* loaded from: classes2.dex */
public final class d extends AbstractC0812v {

    /* renamed from: b, reason: collision with root package name */
    private final X f403b;

    /* renamed from: c, reason: collision with root package name */
    private final o f404c;

    /* renamed from: d, reason: collision with root package name */
    private final sb.e f405d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f406e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final W f407a;

        /* renamed from: b, reason: collision with root package name */
        private final Ab.b f408b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f409c;

        /* renamed from: d, reason: collision with root package name */
        private final List f410d;

        public a(W typeConverter, Ab.b fieldAnnotation, boolean z10, List validators) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(fieldAnnotation, "fieldAnnotation");
            Intrinsics.checkNotNullParameter(validators, "validators");
            this.f407a = typeConverter;
            this.f408b = fieldAnnotation;
            this.f409c = z10;
            this.f410d = validators;
        }

        public final Ab.b a() {
            return this.f408b;
        }

        public final W b() {
            return this.f407a;
        }

        public final List c() {
            return this.f410d;
        }

        public final boolean d() {
            return this.f409c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f407a, aVar.f407a) && Intrinsics.b(this.f408b, aVar.f408b) && this.f409c == aVar.f409c && Intrinsics.b(this.f410d, aVar.f410d);
        }

        public int hashCode() {
            return (((((this.f407a.hashCode() * 31) + this.f408b.hashCode()) * 31) + Boolean.hashCode(this.f409c)) * 31) + this.f410d.hashCode();
        }

        public String toString() {
            return "PropertyDescriptor(typeConverter=" + this.f407a + ", fieldAnnotation=" + this.f408b + ", isRequired=" + this.f409c + ", validators=" + this.f410d + ")";
        }
    }

    static final class b extends m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            Object obj;
            Object obj2;
            kotlin.reflect.e j10 = d.this.n().j();
            Intrinsics.e(j10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            Collection<kotlin.reflect.m> d10 = Cc.d.d((kotlin.reflect.d) j10);
            d dVar = d.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(d10, 10));
            for (kotlin.reflect.m mVar : d10) {
                Iterator it = mVar.i().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((Annotation) obj2) instanceof Ab.b) {
                        break;
                    }
                }
                Ab.b bVar = (Ab.b) obj2;
                if (bVar != null) {
                    W a10 = dVar.f403b.a(mVar.g());
                    Iterator it2 = mVar.i().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((Annotation) next) instanceof e) {
                            obj = next;
                            break;
                        }
                    }
                    obj = t.a(mVar, new a(a10, bVar, ((e) obj) != null, dVar.o(mVar)));
                }
                arrayList.add(obj);
            }
            return G.r(CollectionsKt.a0(arrayList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(X converterProvider, o type) {
        super(type.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f403b = converterProvider;
        this.f404c = type;
        this.f405d = new sb.e();
        this.f406e = i.a(new b());
    }

    private final c k(ReadableMap readableMap, C3862a c3862a) {
        CodedException codedException;
        kotlin.reflect.e j10 = this.f404c.j();
        Intrinsics.e(j10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object a10 = l((kotlin.reflect.d) j10).a();
        for (Map.Entry entry : m().entrySet()) {
            kotlin.reflect.m mVar = (kotlin.reflect.m) entry.getKey();
            a aVar = (a) entry.getValue();
            String key = aVar.a().key();
            if (StringsKt.Z(key)) {
                key = null;
            }
            if (key == null) {
                key = mVar.getName();
            }
            if (readableMap.hasKey(key)) {
                Dynamic dynamic = readableMap.getDynamic(key);
                try {
                    Field b10 = Dc.c.b(mVar);
                    Intrinsics.d(b10);
                    try {
                        Object a11 = aVar.b().a(dynamic, c3862a);
                        if (a11 != null) {
                            Iterator it = aVar.c().iterator();
                            if (it.hasNext()) {
                                android.support.v4.media.session.b.a(it.next());
                                Intrinsics.e(null, "null cannot be cast to non-null type expo.modules.kotlin.records.FieldValidator<kotlin.Any>");
                                throw null;
                            }
                        }
                        b10.setAccessible(true);
                        b10.set(a10, a11);
                        Unit unit = Unit.f36324a;
                        dynamic.recycle();
                    } catch (Throwable th) {
                        if (th instanceof CodedException) {
                            codedException = (CodedException) th;
                        } else if (th instanceof Da.a) {
                            String a12 = ((Da.a) th).a();
                            Intrinsics.checkNotNullExpressionValue(a12, "getCode(...)");
                            codedException = new CodedException(a12, th.getMessage(), th.getCause());
                        } else {
                            codedException = new UnexpectedException(th);
                        }
                        throw new n(mVar.getName(), mVar.g(), dynamic.getType(), codedException);
                    }
                } catch (Throwable th2) {
                    dynamic.recycle();
                    throw th2;
                }
            } else if (aVar.d()) {
                throw new expo.modules.kotlin.exception.o(mVar);
            }
        }
        Intrinsics.e(a10, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return (c) a10;
    }

    private final InterfaceC4510a l(kotlin.reflect.d dVar) {
        return this.f405d.d(dVar);
    }

    private final Map m() {
        return (Map) this.f406e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List o(kotlin.reflect.m mVar) {
        Object obj;
        List i10 = mVar.i();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(i10, 10));
        Iterator it = i10.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            Annotation annotation = (Annotation) it.next();
            Iterator it2 = AbstractC5011a.a(annotation).i().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((Annotation) obj) instanceof Ab.a) {
                    break;
                }
            }
            Ab.a aVar = (Ab.a) obj;
            if (aVar != null) {
                pair = t.a(annotation, aVar);
            }
            arrayList.add(pair);
        }
        List a02 = CollectionsKt.a0(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(a02, 10));
        Iterator it3 = a02.iterator();
        if (!it3.hasNext()) {
            return arrayList2;
        }
        Pair pair2 = (Pair) it3.next();
        Object b10 = Cc.d.b(C5142C.b(((Ab.a) pair2.getSecond()).binder()));
        Intrinsics.e(b10, "null cannot be cast to non-null type expo.modules.kotlin.records.ValidationBinder");
        android.support.v4.media.session.b.a(b10);
        mVar.g();
        throw null;
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.READABLE_MAP);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value instanceof ReadableMap ? k((ReadableMap) value, c3862a) : (c) value;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c f(Dynamic value, C3862a c3862a) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return k(value.asMap(), c3862a);
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else if (th instanceof Da.a) {
                String a10 = ((Da.a) th).a();
                Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                codedException = new CodedException(a10, th.getMessage(), th.getCause());
            } else {
                codedException = new UnexpectedException(th);
            }
            throw new A(this.f404c, codedException);
        }
    }

    public final o n() {
        return this.f404c;
    }
}
