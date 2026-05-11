package R5;

import Q5.k;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    protected static final D5.o f8467a = new E();

    /* renamed from: b, reason: collision with root package name */
    protected static final D5.o f8468b = new d();

    public static class a extends H {

        /* renamed from: c, reason: collision with root package name */
        protected final int f8469c;

        public a(int i10, Class cls) {
            super(cls, false);
            this.f8469c = i10;
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            String valueOf;
            switch (this.f8469c) {
                case 1:
                    b10.t((Date) obj, fVar);
                    break;
                case 2:
                    b10.s(((Calendar) obj).getTimeInMillis(), fVar);
                    break;
                case 3:
                    fVar.o0(((Class) obj).getName());
                    break;
                case 4:
                    if (b10.Z(D5.A.WRITE_ENUMS_USING_TO_STRING)) {
                        valueOf = obj.toString();
                    } else {
                        Enum r32 = (Enum) obj;
                        valueOf = b10.Z(D5.A.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r32.ordinal()) : r32.name();
                    }
                    fVar.o0(valueOf);
                    break;
                case 5:
                case 6:
                    fVar.Q(((Number) obj).longValue());
                    break;
                case 7:
                    fVar.o0(b10.f().h().a((byte[]) obj));
                    break;
                default:
                    fVar.o0(obj.toString());
                    break;
            }
        }
    }

    public static class b extends H {

        /* renamed from: c, reason: collision with root package name */
        protected transient Q5.k f8470c;

        public b() {
            super(String.class, false);
            this.f8470c = Q5.k.c();
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            Class<?> cls = obj.getClass();
            Q5.k kVar = this.f8470c;
            D5.o j10 = kVar.j(cls);
            if (j10 == null) {
                j10 = v(kVar, cls, b10);
            }
            j10.f(obj, fVar, b10);
        }

        protected D5.o v(Q5.k kVar, Class cls, D5.B b10) {
            if (cls == Object.class) {
                a aVar = new a(8, cls);
                this.f8470c = kVar.i(cls, aVar);
                return aVar;
            }
            k.d d10 = kVar.d(cls, b10, null);
            Q5.k kVar2 = d10.f8208b;
            if (kVar != kVar2) {
                this.f8470c = kVar2;
            }
            return d10.f8207a;
        }
    }

    public static class c extends H {

        /* renamed from: c, reason: collision with root package name */
        protected final T5.i f8471c;

        protected c(Class cls, T5.i iVar) {
            super(cls, false);
            this.f8471c = iVar;
        }

        public static c v(Class cls, T5.i iVar) {
            return new c(cls, iVar);
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            if (b10.Z(D5.A.WRITE_ENUMS_USING_TO_STRING)) {
                fVar.o0(obj.toString());
                return;
            }
            Enum r22 = (Enum) obj;
            if (b10.Z(D5.A.WRITE_ENUM_KEYS_USING_INDEX)) {
                fVar.o0(String.valueOf(r22.ordinal()));
            } else {
                fVar.i0(this.f8471c.d(r22));
            }
        }
    }

    public static class d extends H {
        public d() {
            super(String.class, false);
        }

        @Override // R5.H, D5.o
        public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
            fVar.o0((String) obj);
        }
    }

    public static D5.o a(D5.z zVar, Class cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new b();
            }
            if (T5.f.G(cls)) {
                return c.v(cls, T5.i.b(zVar, cls));
            }
        }
        return new a(8, cls);
    }

    public static D5.o b(D5.z zVar, Class cls, boolean z10) {
        if (cls == null || cls == Object.class) {
            return new b();
        }
        if (cls == String.class) {
            return f8468b;
        }
        if (cls.isPrimitive()) {
            cls = T5.f.Z(cls);
        }
        if (cls == Integer.class) {
            return new a(5, cls);
        }
        if (cls == Long.class) {
            return new a(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new a(8, cls);
        }
        if (cls == Class.class) {
            return new a(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new a(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new a(2, cls);
        }
        if (cls == UUID.class) {
            return new a(8, cls);
        }
        if (cls == byte[].class) {
            return new a(7, cls);
        }
        if (z10) {
            return new a(8, cls);
        }
        return null;
    }
}
