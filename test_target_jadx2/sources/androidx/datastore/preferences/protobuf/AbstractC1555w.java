package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1534a;
import androidx.datastore.preferences.protobuf.AbstractC1557y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1555w extends AbstractC1534a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1555w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.c();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends AbstractC1534a.AbstractC0279a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1555w f16473a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC1555w f16474b;

        protected a(AbstractC1555w abstractC1555w) {
            this.f16473a = abstractC1555w;
            if (abstractC1555w.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f16474b = q();
        }

        private static void p(Object obj, Object obj2) {
            b0.a().d(obj).a(obj, obj2);
        }

        private AbstractC1555w q() {
            return this.f16473a.E();
        }

        public final AbstractC1555w i() {
            AbstractC1555w I10 = I();
            if (I10.w()) {
                return I10;
            }
            throw AbstractC1534a.AbstractC0279a.h(I10);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC1555w I() {
            if (!this.f16474b.y()) {
                return this.f16474b;
            }
            this.f16474b.z();
            return this.f16474b;
        }

        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.f16474b = I();
            return newBuilderForType;
        }

        protected final void m() {
            if (this.f16474b.y()) {
                return;
            }
            n();
        }

        protected void n() {
            AbstractC1555w q10 = q();
            p(q10, this.f16474b);
            this.f16474b = q10;
        }

        @Override // androidx.datastore.preferences.protobuf.Q
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC1555w getDefaultInstanceForType() {
            return this.f16473a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    protected static class b extends AbstractC1535b {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC1555w f16475b;

        public b(AbstractC1555w abstractC1555w) {
            this.f16475b = abstractC1555w;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends AbstractC1546m {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static AbstractC1557y.b B(AbstractC1557y.b bVar) {
        int size = bVar.size();
        return bVar.y(size == 0 ? 10 : size * 2);
    }

    protected static Object D(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    protected static AbstractC1555w F(AbstractC1555w abstractC1555w, InputStream inputStream) {
        return g(G(abstractC1555w, AbstractC1541h.g(inputStream), C1548o.b()));
    }

    static AbstractC1555w G(AbstractC1555w abstractC1555w, AbstractC1541h abstractC1541h, C1548o c1548o) {
        AbstractC1555w E10 = abstractC1555w.E();
        try {
            f0 d10 = b0.a().d(E10);
            d10.h(E10, C1542i.O(abstractC1541h), c1548o);
            d10.e(E10);
            return E10;
        } catch (l0 e10) {
            throw e10.a().k(E10);
        } catch (C1558z e11) {
            e = e11;
            if (e.a()) {
                e = new C1558z(e);
            }
            throw e.k(E10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1558z) {
                throw ((C1558z) e12.getCause());
            }
            throw new C1558z(e12).k(E10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C1558z) {
                throw ((C1558z) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void H(Class cls, AbstractC1555w abstractC1555w) {
        abstractC1555w.A();
        defaultInstanceMap.put(cls, abstractC1555w);
    }

    private static AbstractC1555w g(AbstractC1555w abstractC1555w) {
        if (abstractC1555w == null || abstractC1555w.w()) {
            return abstractC1555w;
        }
        throw abstractC1555w.d().a().k(abstractC1555w);
    }

    private int k(f0 f0Var) {
        return f0Var == null ? b0.a().d(this).g(this) : f0Var.g(this);
    }

    protected static AbstractC1557y.b p() {
        return c0.h();
    }

    static AbstractC1555w q(Class cls) {
        AbstractC1555w abstractC1555w = defaultInstanceMap.get(cls);
        if (abstractC1555w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1555w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1555w == null) {
            abstractC1555w = ((AbstractC1555w) p0.i(cls)).getDefaultInstanceForType();
            if (abstractC1555w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC1555w);
        }
        return abstractC1555w;
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean x(AbstractC1555w abstractC1555w, boolean z10) {
        byte byteValue = ((Byte) abstractC1555w.m(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f10 = b0.a().d(abstractC1555w).f(abstractC1555w);
        if (z10) {
            abstractC1555w.n(d.SET_MEMOIZED_IS_INITIALIZED, f10 ? abstractC1555w : null);
        }
        return f10;
    }

    void A() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) m(d.NEW_BUILDER);
    }

    AbstractC1555w E() {
        return (AbstractC1555w) m(d.NEW_MUTABLE_INSTANCE);
    }

    void J(int i10) {
        this.memoizedHashCode = i10;
    }

    void K(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public void a(AbstractC1543j abstractC1543j) {
        b0.a().d(this).i(this, C1544k.P(abstractC1543j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1534a
    int c(f0 f0Var) {
        if (!y()) {
            if (t() != Integer.MAX_VALUE) {
                return t();
            }
            int k10 = k(f0Var);
            K(k10);
            return k10;
        }
        int k11 = k(f0Var);
        if (k11 >= 0) {
            return k11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + k11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).c(this, (AbstractC1555w) obj);
        }
        return false;
    }

    Object f() {
        return m(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public int getSerializedSize() {
        return c(null);
    }

    void h() {
        this.memoizedHashCode = 0;
    }

    public int hashCode() {
        if (y()) {
            return j();
        }
        if (u()) {
            J(j());
        }
        return s();
    }

    void i() {
        K(Integer.MAX_VALUE);
    }

    int j() {
        return b0.a().d(this).d(this);
    }

    protected final a l() {
        return (a) m(d.NEW_BUILDER);
    }

    protected Object m(d dVar) {
        return o(dVar, null, null);
    }

    protected Object n(d dVar, Object obj) {
        return o(dVar, obj, null);
    }

    protected abstract Object o(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.Q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC1555w getDefaultInstanceForType() {
        return (AbstractC1555w) m(d.GET_DEFAULT_INSTANCE);
    }

    int s() {
        return this.memoizedHashCode;
    }

    int t() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public String toString() {
        return S.f(this, super.toString());
    }

    boolean u() {
        return s() == 0;
    }

    public final boolean w() {
        return x(this, true);
    }

    boolean y() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void z() {
        b0.a().d(this).e(this);
        A();
    }
}
