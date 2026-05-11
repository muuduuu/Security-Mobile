package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: A, reason: collision with root package name */
    public static final com.google.gson.u f28575A;

    /* renamed from: B, reason: collision with root package name */
    public static final com.google.gson.u f28576B;

    /* renamed from: C, reason: collision with root package name */
    public static final com.google.gson.v f28577C;

    /* renamed from: D, reason: collision with root package name */
    public static final com.google.gson.u f28578D;

    /* renamed from: E, reason: collision with root package name */
    public static final com.google.gson.v f28579E;

    /* renamed from: F, reason: collision with root package name */
    public static final com.google.gson.u f28580F;

    /* renamed from: G, reason: collision with root package name */
    public static final com.google.gson.v f28581G;

    /* renamed from: H, reason: collision with root package name */
    public static final com.google.gson.u f28582H;

    /* renamed from: I, reason: collision with root package name */
    public static final com.google.gson.v f28583I;

    /* renamed from: J, reason: collision with root package name */
    public static final com.google.gson.u f28584J;

    /* renamed from: K, reason: collision with root package name */
    public static final com.google.gson.v f28585K;

    /* renamed from: L, reason: collision with root package name */
    public static final com.google.gson.u f28586L;

    /* renamed from: M, reason: collision with root package name */
    public static final com.google.gson.v f28587M;

    /* renamed from: N, reason: collision with root package name */
    public static final com.google.gson.u f28588N;

    /* renamed from: O, reason: collision with root package name */
    public static final com.google.gson.v f28589O;

    /* renamed from: P, reason: collision with root package name */
    public static final com.google.gson.u f28590P;

    /* renamed from: Q, reason: collision with root package name */
    public static final com.google.gson.v f28591Q;

    /* renamed from: R, reason: collision with root package name */
    public static final com.google.gson.u f28592R;

    /* renamed from: S, reason: collision with root package name */
    public static final com.google.gson.v f28593S;

    /* renamed from: T, reason: collision with root package name */
    public static final com.google.gson.u f28594T;

    /* renamed from: U, reason: collision with root package name */
    public static final com.google.gson.v f28595U;

    /* renamed from: V, reason: collision with root package name */
    public static final com.google.gson.u f28596V;

    /* renamed from: W, reason: collision with root package name */
    public static final com.google.gson.v f28597W;

    /* renamed from: X, reason: collision with root package name */
    public static final com.google.gson.v f28598X;

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.u f28599a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.v f28600b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.u f28601c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.v f28602d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.u f28603e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.u f28604f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.v f28605g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.u f28606h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.v f28607i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.u f28608j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.gson.v f28609k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.gson.u f28610l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.gson.v f28611m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.gson.u f28612n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.gson.v f28613o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.gson.u f28614p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.gson.v f28615q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.gson.u f28616r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.v f28617s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.gson.u f28618t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.gson.u f28619u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.u f28620v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.gson.u f28621w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.gson.v f28622x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.gson.u f28623y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.gson.u f28624z;

    class A extends com.google.gson.u {
        A() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(S8.a aVar) {
            S8.b N10 = aVar.N();
            if (N10 != S8.b.NULL) {
                return N10 == S8.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.I())) : Boolean.valueOf(aVar.t());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Boolean bool) {
            cVar.N(bool);
        }
    }

    static /* synthetic */ class B {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28625a;

        static {
            int[] iArr = new int[S8.b.values().length];
            f28625a = iArr;
            try {
                iArr[S8.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28625a[S8.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28625a[S8.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28625a[S8.b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28625a[S8.b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28625a[S8.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class C extends com.google.gson.u {
        C() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return Boolean.valueOf(aVar.I());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Boolean bool) {
            cVar.i0(bool == null ? "null" : bool.toString());
        }
    }

    class D extends com.google.gson.u {
        D() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            try {
                int x10 = aVar.x();
                if (x10 <= 255 && x10 >= -128) {
                    return Byte.valueOf((byte) x10);
                }
                throw new com.google.gson.o("Lossy conversion from " + x10 + " to byte; at path " + aVar.n());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.K(number.byteValue());
            }
        }
    }

    class E extends com.google.gson.u {
        E() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            try {
                int x10 = aVar.x();
                if (x10 <= 65535 && x10 >= -32768) {
                    return Short.valueOf((short) x10);
                }
                throw new com.google.gson.o("Lossy conversion from " + x10 + " to short; at path " + aVar.n());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.K(number.shortValue());
            }
        }
    }

    class F extends com.google.gson.u {
        F() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            try {
                return Integer.valueOf(aVar.x());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.K(number.intValue());
            }
        }
    }

    class G extends com.google.gson.u {
        G() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(S8.a aVar) {
            try {
                return new AtomicInteger(aVar.x());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, AtomicInteger atomicInteger) {
            cVar.K(atomicInteger.get());
        }
    }

    class H extends com.google.gson.u {
        H() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(S8.a aVar) {
            return new AtomicBoolean(aVar.t());
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, AtomicBoolean atomicBoolean) {
            cVar.o0(atomicBoolean.get());
        }
    }

    private static final class I extends com.google.gson.u {

        /* renamed from: a, reason: collision with root package name */
        private final Map f28626a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f28627b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map f28628c = new HashMap();

        class a implements PrivilegedAction {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f28629a;

            a(Class cls) {
                this.f28629a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f28629a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public I(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    O8.c cVar = (O8.c) field.getAnnotation(O8.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str2 : cVar.alternate()) {
                            this.f28626a.put(str2, r42);
                        }
                    }
                    this.f28626a.put(name, r42);
                    this.f28627b.put(str, r42);
                    this.f28628c.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            String I10 = aVar.I();
            Enum r02 = (Enum) this.f28626a.get(I10);
            return r02 == null ? (Enum) this.f28627b.get(I10) : r02;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Enum r32) {
            cVar.i0(r32 == null ? null : (String) this.f28628c.get(r32));
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$a, reason: case insensitive filesystem */
    class C2861a extends com.google.gson.u {
        C2861a() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(S8.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.p()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.x()));
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.o(e10);
                }
            }
            aVar.g();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.c();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.K(atomicIntegerArray.get(i10));
            }
            cVar.f();
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$b, reason: case insensitive filesystem */
    class C2862b extends com.google.gson.u {
        C2862b() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            try {
                return Long.valueOf(aVar.y());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.K(number.longValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$c, reason: case insensitive filesystem */
    class C2863c extends com.google.gson.u {
        C2863c() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return Float.valueOf((float) aVar.u());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.Q(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$d, reason: case insensitive filesystem */
    class C2864d extends com.google.gson.u {
        C2864d() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return Double.valueOf(aVar.u());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.I(number.doubleValue());
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$e, reason: case insensitive filesystem */
    class C2865e extends com.google.gson.u {
        C2865e() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            String I10 = aVar.I();
            if (I10.length() == 1) {
                return Character.valueOf(I10.charAt(0));
            }
            throw new com.google.gson.o("Expecting character, got: " + I10 + "; at " + aVar.n());
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Character ch) {
            cVar.i0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$f, reason: case insensitive filesystem */
    class C2866f extends com.google.gson.u {
        C2866f() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(S8.a aVar) {
            S8.b N10 = aVar.N();
            if (N10 != S8.b.NULL) {
                return N10 == S8.b.BOOLEAN ? Boolean.toString(aVar.t()) : aVar.I();
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, String str) {
            cVar.i0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$g, reason: case insensitive filesystem */
    class C2867g extends com.google.gson.u {
        C2867g() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            String I10 = aVar.I();
            try {
                return P8.i.b(I10);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o("Failed parsing '" + I10 + "' as BigDecimal; at path " + aVar.n(), e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, BigDecimal bigDecimal) {
            cVar.Q(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$h, reason: case insensitive filesystem */
    class C2868h extends com.google.gson.u {
        C2868h() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            String I10 = aVar.I();
            try {
                return P8.i.c(I10);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.o("Failed parsing '" + I10 + "' as BigInteger; at path " + aVar.n(), e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, BigInteger bigInteger) {
            cVar.Q(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$i, reason: case insensitive filesystem */
    class C2869i extends com.google.gson.u {
        C2869i() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public P8.g b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return new P8.g(aVar.I());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, P8.g gVar) {
            cVar.Q(gVar);
        }
    }

    class j extends com.google.gson.u {
        j() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return new StringBuilder(aVar.I());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, StringBuilder sb2) {
            cVar.i0(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends com.google.gson.u {
        k() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(S8.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + P8.o.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + P8.o.a("java-lang-class-unsupported"));
        }
    }

    /* renamed from: com.google.gson.internal.bind.l$l, reason: collision with other inner class name */
    class C0420l extends com.google.gson.u {
        C0420l() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return new StringBuffer(aVar.I());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, StringBuffer stringBuffer) {
            cVar.i0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.u {
        m() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            String I10 = aVar.I();
            if (I10.equals("null")) {
                return null;
            }
            return new URL(I10);
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, URL url) {
            cVar.i0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.u {
        n() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            try {
                String I10 = aVar.I();
                if (I10.equals("null")) {
                    return null;
                }
                return new URI(I10);
            } catch (URISyntaxException e10) {
                throw new com.google.gson.i(e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, URI uri) {
            cVar.i0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.u {
        o() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return InetAddress.getByName(aVar.I());
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, InetAddress inetAddress) {
            cVar.i0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends com.google.gson.u {
        p() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            String I10 = aVar.I();
            try {
                return UUID.fromString(I10);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.o("Failed parsing '" + I10 + "' as UUID; at path " + aVar.n(), e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, UUID uuid) {
            cVar.i0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.u {
        q() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(S8.a aVar) {
            String I10 = aVar.I();
            try {
                return Currency.getInstance(I10);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.o("Failed parsing '" + I10 + "' as Currency; at path " + aVar.n(), e10);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Currency currency) {
            cVar.i0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.u {
        r() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(S8.a aVar) {
            int x10;
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.N() != S8.b.END_OBJECT) {
                String z10 = aVar.z();
                x10 = aVar.x();
                z10.hashCode();
                switch (z10) {
                    case "dayOfMonth":
                        i12 = x10;
                        break;
                    case "minute":
                        i14 = x10;
                        break;
                    case "second":
                        i15 = x10;
                        break;
                    case "year":
                        i10 = x10;
                        break;
                    case "month":
                        i11 = x10;
                        break;
                    case "hourOfDay":
                        i13 = x10;
                        break;
                }
            }
            aVar.i();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.r();
                return;
            }
            cVar.d();
            cVar.p("year");
            cVar.K(calendar.get(1));
            cVar.p("month");
            cVar.K(calendar.get(2));
            cVar.p("dayOfMonth");
            cVar.K(calendar.get(5));
            cVar.p("hourOfDay");
            cVar.K(calendar.get(11));
            cVar.p("minute");
            cVar.K(calendar.get(12));
            cVar.p("second");
            cVar.K(calendar.get(13));
            cVar.g();
        }
    }

    class s extends com.google.gson.u {
        s() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.I(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, Locale locale) {
            cVar.i0(locale == null ? null : locale.toString());
        }
    }

    class t extends com.google.gson.u {
        t() {
        }

        private com.google.gson.h f(S8.a aVar, S8.b bVar) {
            int i10 = B.f28625a[bVar.ordinal()];
            if (i10 == 1) {
                return new com.google.gson.n(new P8.g(aVar.I()));
            }
            if (i10 == 2) {
                return new com.google.gson.n(aVar.I());
            }
            if (i10 == 3) {
                return new com.google.gson.n(Boolean.valueOf(aVar.t()));
            }
            if (i10 == 6) {
                aVar.F();
                return com.google.gson.j.f28655a;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private com.google.gson.h g(S8.a aVar, S8.b bVar) {
            int i10 = B.f28625a[bVar.ordinal()];
            if (i10 == 4) {
                aVar.b();
                return new com.google.gson.g();
            }
            if (i10 != 5) {
                return null;
            }
            aVar.c();
            return new com.google.gson.k();
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.google.gson.h b(S8.a aVar) {
            S8.b N10 = aVar.N();
            com.google.gson.h g10 = g(aVar, N10);
            if (g10 == null) {
                return f(aVar, N10);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.p()) {
                    String z10 = g10 instanceof com.google.gson.k ? aVar.z() : null;
                    S8.b N11 = aVar.N();
                    com.google.gson.h g11 = g(aVar, N11);
                    boolean z11 = g11 != null;
                    if (g11 == null) {
                        g11 = f(aVar, N11);
                    }
                    if (g10 instanceof com.google.gson.g) {
                        ((com.google.gson.g) g10).v(g11);
                    } else {
                        ((com.google.gson.k) g10).v(z10, g11);
                    }
                    if (z11) {
                        arrayDeque.addLast(g10);
                        g10 = g11;
                    }
                } else {
                    if (g10 instanceof com.google.gson.g) {
                        aVar.g();
                    } else {
                        aVar.i();
                    }
                    if (arrayDeque.isEmpty()) {
                        return g10;
                    }
                    g10 = (com.google.gson.h) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, com.google.gson.h hVar) {
            if (hVar == null || hVar.r()) {
                cVar.r();
                return;
            }
            if (hVar.u()) {
                com.google.gson.n j10 = hVar.j();
                if (j10.I()) {
                    cVar.Q(j10.D());
                    return;
                } else if (j10.F()) {
                    cVar.o0(j10.A());
                    return;
                } else {
                    cVar.i0(j10.E());
                    return;
                }
            }
            if (hVar.m()) {
                cVar.c();
                Iterator it = hVar.e().iterator();
                while (it.hasNext()) {
                    d(cVar, (com.google.gson.h) it.next());
                }
                cVar.f();
                return;
            }
            if (!hVar.t()) {
                throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
            }
            cVar.d();
            for (Map.Entry entry : hVar.h().A()) {
                cVar.p((String) entry.getKey());
                d(cVar, (com.google.gson.h) entry.getValue());
            }
            cVar.g();
        }
    }

    class u implements com.google.gson.v {
        u() {
        }

        @Override // com.google.gson.v
        public com.google.gson.u a(com.google.gson.e eVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new I(rawType);
        }
    }

    class v extends com.google.gson.u {
        v() {
        }

        @Override // com.google.gson.u
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(S8.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.b();
            S8.b N10 = aVar.N();
            int i10 = 0;
            while (N10 != S8.b.END_ARRAY) {
                int i11 = B.f28625a[N10.ordinal()];
                boolean z10 = true;
                if (i11 == 1 || i11 == 2) {
                    int x10 = aVar.x();
                    if (x10 == 0) {
                        z10 = false;
                    } else if (x10 != 1) {
                        throw new com.google.gson.o("Invalid bitset value " + x10 + ", expected 0 or 1; at path " + aVar.n());
                    }
                } else {
                    if (i11 != 3) {
                        throw new com.google.gson.o("Invalid bitset value type: " + N10 + "; at path " + aVar.J());
                    }
                    z10 = aVar.t();
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                N10 = aVar.N();
            }
            aVar.g();
            return bitSet;
        }

        @Override // com.google.gson.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S8.c cVar, BitSet bitSet) {
            cVar.c();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.K(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.f();
        }
    }

    class w implements com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f28631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f28632b;

        w(Class cls, com.google.gson.u uVar) {
            this.f28631a = cls;
            this.f28632b = uVar;
        }

        @Override // com.google.gson.v
        public com.google.gson.u a(com.google.gson.e eVar, TypeToken typeToken) {
            if (typeToken.getRawType() == this.f28631a) {
                return this.f28632b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f28631a.getName() + ",adapter=" + this.f28632b + "]";
        }
    }

    class x implements com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f28633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f28634b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f28635c;

        x(Class cls, Class cls2, com.google.gson.u uVar) {
            this.f28633a = cls;
            this.f28634b = cls2;
            this.f28635c = uVar;
        }

        @Override // com.google.gson.v
        public com.google.gson.u a(com.google.gson.e eVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f28633a || rawType == this.f28634b) {
                return this.f28635c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f28634b.getName() + "+" + this.f28633a.getName() + ",adapter=" + this.f28635c + "]";
        }
    }

    class y implements com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f28636a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f28637b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f28638c;

        y(Class cls, Class cls2, com.google.gson.u uVar) {
            this.f28636a = cls;
            this.f28637b = cls2;
            this.f28638c = uVar;
        }

        @Override // com.google.gson.v
        public com.google.gson.u a(com.google.gson.e eVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f28636a || rawType == this.f28637b) {
                return this.f28638c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f28636a.getName() + "+" + this.f28637b.getName() + ",adapter=" + this.f28638c + "]";
        }
    }

    class z implements com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f28639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f28640b;

        class a extends com.google.gson.u {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f28641a;

            a(Class cls) {
                this.f28641a = cls;
            }

            @Override // com.google.gson.u
            public Object b(S8.a aVar) {
                Object b10 = z.this.f28640b.b(aVar);
                if (b10 == null || this.f28641a.isInstance(b10)) {
                    return b10;
                }
                throw new com.google.gson.o("Expected a " + this.f28641a.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.n());
            }

            @Override // com.google.gson.u
            public void d(S8.c cVar, Object obj) {
                z.this.f28640b.d(cVar, obj);
            }
        }

        z(Class cls, com.google.gson.u uVar) {
            this.f28639a = cls;
            this.f28640b = uVar;
        }

        @Override // com.google.gson.v
        public com.google.gson.u a(com.google.gson.e eVar, TypeToken typeToken) {
            Class<?> rawType = typeToken.getRawType();
            if (this.f28639a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f28639a.getName() + ",adapter=" + this.f28640b + "]";
        }
    }

    static {
        com.google.gson.u a10 = new k().a();
        f28599a = a10;
        f28600b = a(Class.class, a10);
        com.google.gson.u a11 = new v().a();
        f28601c = a11;
        f28602d = a(BitSet.class, a11);
        A a12 = new A();
        f28603e = a12;
        f28604f = new C();
        f28605g = b(Boolean.TYPE, Boolean.class, a12);
        D d10 = new D();
        f28606h = d10;
        f28607i = b(Byte.TYPE, Byte.class, d10);
        E e10 = new E();
        f28608j = e10;
        f28609k = b(Short.TYPE, Short.class, e10);
        F f10 = new F();
        f28610l = f10;
        f28611m = b(Integer.TYPE, Integer.class, f10);
        com.google.gson.u a13 = new G().a();
        f28612n = a13;
        f28613o = a(AtomicInteger.class, a13);
        com.google.gson.u a14 = new H().a();
        f28614p = a14;
        f28615q = a(AtomicBoolean.class, a14);
        com.google.gson.u a15 = new C2861a().a();
        f28616r = a15;
        f28617s = a(AtomicIntegerArray.class, a15);
        f28618t = new C2862b();
        f28619u = new C2863c();
        f28620v = new C2864d();
        C2865e c2865e = new C2865e();
        f28621w = c2865e;
        f28622x = b(Character.TYPE, Character.class, c2865e);
        C2866f c2866f = new C2866f();
        f28623y = c2866f;
        f28624z = new C2867g();
        f28575A = new C2868h();
        f28576B = new C2869i();
        f28577C = a(String.class, c2866f);
        j jVar = new j();
        f28578D = jVar;
        f28579E = a(StringBuilder.class, jVar);
        C0420l c0420l = new C0420l();
        f28580F = c0420l;
        f28581G = a(StringBuffer.class, c0420l);
        m mVar = new m();
        f28582H = mVar;
        f28583I = a(URL.class, mVar);
        n nVar = new n();
        f28584J = nVar;
        f28585K = a(URI.class, nVar);
        o oVar = new o();
        f28586L = oVar;
        f28587M = d(InetAddress.class, oVar);
        p pVar = new p();
        f28588N = pVar;
        f28589O = a(UUID.class, pVar);
        com.google.gson.u a16 = new q().a();
        f28590P = a16;
        f28591Q = a(Currency.class, a16);
        r rVar = new r();
        f28592R = rVar;
        f28593S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f28594T = sVar;
        f28595U = a(Locale.class, sVar);
        t tVar = new t();
        f28596V = tVar;
        f28597W = d(com.google.gson.h.class, tVar);
        f28598X = new u();
    }

    public static com.google.gson.v a(Class cls, com.google.gson.u uVar) {
        return new w(cls, uVar);
    }

    public static com.google.gson.v b(Class cls, Class cls2, com.google.gson.u uVar) {
        return new x(cls, cls2, uVar);
    }

    public static com.google.gson.v c(Class cls, Class cls2, com.google.gson.u uVar) {
        return new y(cls, cls2, uVar);
    }

    public static com.google.gson.v d(Class cls, com.google.gson.u uVar) {
        return new z(cls, uVar);
    }
}
