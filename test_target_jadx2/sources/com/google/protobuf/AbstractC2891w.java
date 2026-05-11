package com.google.protobuf;

import com.google.protobuf.AbstractC2870a;
import com.google.protobuf.AbstractC2874e;
import com.google.protobuf.AbstractC2893y;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2891w extends AbstractC2870a {
    private static Map<Object, AbstractC2891w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected j0 unknownFields = j0.c();

    /* renamed from: com.google.protobuf.w$a */
    public static abstract class a extends AbstractC2870a.AbstractC0423a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC2891w f28815a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC2891w f28816b;

        protected a(AbstractC2891w abstractC2891w) {
            this.f28815a = abstractC2891w;
            if (abstractC2891w.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f28816b = n();
        }

        private static void m(Object obj, Object obj2) {
            Z.a().d(obj).a(obj, obj2);
        }

        private AbstractC2891w n() {
            return this.f28815a.newMutableInstance();
        }

        public final AbstractC2891w b() {
            AbstractC2891w I10 = I();
            if (I10.isInitialized()) {
                return I10;
            }
            throw AbstractC2870a.AbstractC0423a.a(I10);
        }

        @Override // com.google.protobuf.N.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC2891w I() {
            if (!this.f28816b.isMutable()) {
                return this.f28816b;
            }
            this.f28816b.makeImmutable();
            return this.f28816b;
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a newBuilderForType = l().newBuilderForType();
            newBuilderForType.f28816b = I();
            return newBuilderForType;
        }

        protected final void i() {
            if (this.f28816b.isMutable()) {
                return;
            }
            k();
        }

        protected void k() {
            AbstractC2891w n10 = n();
            m(n10, this.f28816b);
            this.f28816b = n10;
        }

        public AbstractC2891w l() {
            return this.f28815a;
        }
    }

    /* renamed from: com.google.protobuf.w$b */
    protected static class b extends AbstractC2871b {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC2891w f28817b;

        public b(AbstractC2891w abstractC2891w) {
            this.f28817b = abstractC2891w;
        }
    }

    /* renamed from: com.google.protobuf.w$c */
    public static class c extends AbstractC2882m {
    }

    /* renamed from: com.google.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    private static AbstractC2891w b(AbstractC2891w abstractC2891w) {
        if (abstractC2891w == null || abstractC2891w.isInitialized()) {
            return abstractC2891w;
        }
        throw abstractC2891w.newUninitializedMessageException().a().g(abstractC2891w);
    }

    private int c(c0 c0Var) {
        return c0Var == null ? Z.a().d(this).g(this) : c0Var.g(this);
    }

    private static AbstractC2891w d(AbstractC2891w abstractC2891w, byte[] bArr, int i10, int i11, C2884o c2884o) {
        AbstractC2891w newMutableInstance = abstractC2891w.newMutableInstance();
        try {
            c0 d10 = Z.a().d(newMutableInstance);
            d10.i(newMutableInstance, bArr, i10, i10 + i11, new AbstractC2874e.a(c2884o));
            d10.e(newMutableInstance);
            return newMutableInstance;
        } catch (h0 e10) {
            throw e10.a().g(newMutableInstance);
        } catch (C2894z e11) {
            e = e11;
            if (e.a()) {
                e = new C2894z(e);
            }
            throw e.g(newMutableInstance);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2894z) {
                throw ((C2894z) e12.getCause());
            }
            throw new C2894z(e12).g(newMutableInstance);
        } catch (IndexOutOfBoundsException unused) {
            throw C2894z.h().g(newMutableInstance);
        }
    }

    protected static <E> AbstractC2893y.b emptyProtobufList() {
        return a0.h();
    }

    static <T extends AbstractC2891w> T getDefaultInstance(Class<T> cls) {
        AbstractC2891w abstractC2891w = defaultInstanceMap.get(cls);
        if (abstractC2891w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2891w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2891w == null) {
            abstractC2891w = (T) ((AbstractC2891w) m0.k(cls)).getDefaultInstanceForType();
            if (abstractC2891w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC2891w);
        }
        return (T) abstractC2891w;
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    protected static <E> AbstractC2893y.b mutableCopy(AbstractC2893y.b bVar) {
        int size = bVar.size();
        return bVar.y(size == 0 ? 10 : size * 2);
    }

    protected static Object newMessageInfo(N n10, String str, Object[] objArr) {
        return new b0(n10, str, objArr);
    }

    protected static <T extends AbstractC2891w> T parseFrom(T t10, byte[] bArr) {
        return (T) b(d(t10, bArr, 0, bArr.length, C2884o.b()));
    }

    protected static <T extends AbstractC2891w> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    Object buildMessageInfo() {
        return dynamicMethod(d.BUILD_MESSAGE_INFO);
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        return Z.a().d(this).d(this);
    }

    protected final <MessageType extends AbstractC2891w, BuilderType extends a> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(d.NEW_BUILDER);
    }

    protected Object dynamicMethod(d dVar, Object obj) {
        return dynamicMethod(dVar, obj, null);
    }

    protected abstract Object dynamicMethod(d dVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Z.a().d(this).c(this, (AbstractC2891w) obj);
        }
        return false;
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC2870a
    int getSerializedSize(c0 c0Var) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int c10 = c(c0Var);
            setMemoizedSerializedSize(c10);
            return c10;
        }
        int c11 = c(c0Var);
        if (c11 >= 0) {
            return c11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + c11);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void makeImmutable() {
        Z.a().d(this).e(this);
        markImmutable();
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    AbstractC2891w newMutableInstance() {
        return (AbstractC2891w) dynamicMethod(d.NEW_MUTABLE_INSTANCE);
    }

    void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public String toString() {
        return P.f(this, super.toString());
    }

    @Override // com.google.protobuf.N
    public void writeTo(AbstractC2879j abstractC2879j) {
        Z.a().d(this).h(this, C2880k.P(abstractC2879j));
    }

    protected static final <T extends AbstractC2891w> boolean isInitialized(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.dynamicMethod(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f10 = Z.a().d(t10).f(t10);
        if (z10) {
            t10.dynamicMethod(d.SET_MEMOIZED_IS_INITIALIZED, f10 ? t10 : null);
        }
        return f10;
    }

    protected Object dynamicMethod(d dVar) {
        return dynamicMethod(dVar, null, null);
    }

    @Override // com.google.protobuf.O
    public final AbstractC2891w getDefaultInstanceForType() {
        return (AbstractC2891w) dynamicMethod(d.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.N
    public final a newBuilderForType() {
        return (a) dynamicMethod(d.NEW_BUILDER);
    }

    @Override // com.google.protobuf.N
    public int getSerializedSize() {
        return getSerializedSize(null);
    }
}
