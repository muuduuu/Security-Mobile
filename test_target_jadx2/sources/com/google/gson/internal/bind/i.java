package com.google.gson.internal.bind;

import P8.m;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements v {

    /* renamed from: a, reason: collision with root package name */
    private final P8.c f28547a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.c f28548b;

    /* renamed from: c, reason: collision with root package name */
    private final P8.d f28549c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.d f28550d;

    /* renamed from: e, reason: collision with root package name */
    private final List f28551e;

    class a extends u {
        a() {
        }

        @Override // com.google.gson.u
        public Object b(S8.a aVar) {
            aVar.g1();
            return null;
        }

        @Override // com.google.gson.u
        public void d(S8.c cVar, Object obj) {
            cVar.r();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    class b extends d {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28553d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f28554e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f28555f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f28556g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f28557h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f28558i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z10, Method method, u uVar, u uVar2, boolean z11, boolean z12) {
            super(str, field);
            this.f28553d = z10;
            this.f28554e = method;
            this.f28555f = uVar;
            this.f28556g = uVar2;
            this.f28557h = z11;
            this.f28558i = z12;
        }

        @Override // com.google.gson.internal.bind.i.d
        void a(S8.a aVar, int i10, Object[] objArr) {
            Object b10 = this.f28556g.b(aVar);
            if (b10 != null || !this.f28557h) {
                objArr[i10] = b10;
                return;
            }
            throw new com.google.gson.l("null is not allowed as value for record component '" + this.f28563c + "' of primitive type; at path " + aVar.J());
        }

        @Override // com.google.gson.internal.bind.i.d
        void b(S8.a aVar, Object obj) {
            Object b10 = this.f28556g.b(aVar);
            if (b10 == null && this.f28557h) {
                return;
            }
            if (this.f28553d) {
                i.c(obj, this.f28562b);
            } else if (this.f28558i) {
                throw new com.google.gson.i("Cannot set value of 'static final' " + R8.a.g(this.f28562b, false));
            }
            this.f28562b.set(obj, b10);
        }

        @Override // com.google.gson.internal.bind.i.d
        void c(S8.c cVar, Object obj) {
            Object obj2;
            if (this.f28553d) {
                Method method = this.f28554e;
                if (method == null) {
                    i.c(obj, this.f28562b);
                } else {
                    i.c(obj, method);
                }
            }
            Method method2 = this.f28554e;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new com.google.gson.i("Accessor " + R8.a.g(this.f28554e, false) + " threw exception", e10.getCause());
                }
            } else {
                obj2 = this.f28562b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            cVar.p(this.f28561a);
            this.f28555f.d(cVar, obj2);
        }
    }

    public static abstract class c extends u {

        /* renamed from: a, reason: collision with root package name */
        private final f f28560a;

        c(f fVar) {
            this.f28560a = fVar;
        }

        @Override // com.google.gson.u
        public Object b(S8.a aVar) {
            if (aVar.N() == S8.b.NULL) {
                aVar.F();
                return null;
            }
            Object e10 = e();
            Map map = this.f28560a.f28566a;
            try {
                aVar.c();
                while (aVar.p()) {
                    d dVar = (d) map.get(aVar.z());
                    if (dVar == null) {
                        aVar.g1();
                    } else {
                        g(e10, aVar, dVar);
                    }
                }
                aVar.i();
                return f(e10);
            } catch (IllegalAccessException e11) {
                throw R8.a.e(e11);
            } catch (IllegalStateException e12) {
                throw new o(e12);
            }
        }

        @Override // com.google.gson.u
        public void d(S8.c cVar, Object obj) {
            if (obj == null) {
                cVar.r();
                return;
            }
            cVar.d();
            try {
                Iterator it = this.f28560a.f28567b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(cVar, obj);
                }
                cVar.g();
            } catch (IllegalAccessException e10) {
                throw R8.a.e(e10);
            }
        }

        abstract Object e();

        abstract Object f(Object obj);

        abstract void g(Object obj, S8.a aVar, d dVar);
    }

    static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final String f28561a;

        /* renamed from: b, reason: collision with root package name */
        final Field f28562b;

        /* renamed from: c, reason: collision with root package name */
        final String f28563c;

        protected d(String str, Field field) {
            this.f28561a = str;
            this.f28562b = field;
            this.f28563c = field.getName();
        }

        abstract void a(S8.a aVar, int i10, Object[] objArr);

        abstract void b(S8.a aVar, Object obj);

        abstract void c(S8.c cVar, Object obj);
    }

    private static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final P8.j f28564b;

        e(P8.j jVar, f fVar) {
            super(fVar);
            this.f28564b = jVar;
        }

        @Override // com.google.gson.internal.bind.i.c
        Object e() {
            return this.f28564b.a();
        }

        @Override // com.google.gson.internal.bind.i.c
        Object f(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.i.c
        void g(Object obj, S8.a aVar, d dVar) {
            dVar.b(aVar, obj);
        }
    }

    private static class f {

        /* renamed from: c, reason: collision with root package name */
        public static final f f28565c = new f(Collections.emptyMap(), Collections.emptyList());

        /* renamed from: a, reason: collision with root package name */
        public final Map f28566a;

        /* renamed from: b, reason: collision with root package name */
        public final List f28567b;

        public f(Map map, List list) {
            this.f28566a = map;
            this.f28567b = list;
        }
    }

    private static final class g extends c {

        /* renamed from: e, reason: collision with root package name */
        static final Map f28568e = j();

        /* renamed from: b, reason: collision with root package name */
        private final Constructor f28569b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f28570c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f28571d;

        g(Class cls, f fVar, boolean z10) {
            super(fVar);
            this.f28571d = new HashMap();
            Constructor i10 = R8.a.i(cls);
            this.f28569b = i10;
            if (z10) {
                i.c(null, i10);
            } else {
                R8.a.o(i10);
            }
            String[] k10 = R8.a.k(cls);
            for (int i11 = 0; i11 < k10.length; i11++) {
                this.f28571d.put(k10[i11], Integer.valueOf(i11));
            }
            Class<?>[] parameterTypes = this.f28569b.getParameterTypes();
            this.f28570c = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.f28570c[i12] = f28568e.get(parameterTypes[i12]);
            }
        }

        private static Map j() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.i.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f28570c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.i.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object f(Object[] objArr) {
            try {
                return this.f28569b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw R8.a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + R8.a.c(this.f28569b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + R8.a.c(this.f28569b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + R8.a.c(this.f28569b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.i.c
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, S8.a aVar, d dVar) {
            Integer num = (Integer) this.f28571d.get(dVar.f28563c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + R8.a.c(this.f28569b) + "' for field with name '" + dVar.f28563c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public i(P8.c cVar, com.google.gson.c cVar2, P8.d dVar, com.google.gson.internal.bind.d dVar2, List list) {
        this.f28547a = cVar;
        this.f28548b = cVar2;
        this.f28549c = dVar;
        this.f28550d = dVar2;
        this.f28551e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (m.a(accessibleObject, obj)) {
            return;
        }
        throw new com.google.gson.i(R8.a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d d(com.google.gson.e eVar, Field field, Method method, String str, TypeToken typeToken, boolean z10, boolean z11) {
        u uVar;
        boolean a10 = P8.l.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z12 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        O8.b bVar = (O8.b) field.getAnnotation(O8.b.class);
        u d10 = bVar != null ? this.f28550d.d(this.f28547a, eVar, typeToken, bVar, false) : null;
        boolean z13 = d10 != null;
        if (d10 == null) {
            d10 = eVar.m(typeToken);
        }
        u uVar2 = d10;
        if (z10) {
            uVar = z13 ? uVar2 : new k(eVar, uVar2, typeToken.getType());
        } else {
            uVar = uVar2;
        }
        return new b(str, field, z11, method, uVar, uVar2, a10, z12);
    }

    private static IllegalArgumentException e(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + R8.a.f(field) + " and " + R8.a.f(field2) + "\nSee " + P8.o.a("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private f f(com.google.gson.e eVar, TypeToken typeToken, Class cls, boolean z10, boolean z11) {
        boolean z12;
        Method method;
        String str;
        int i10;
        int i11;
        boolean z13;
        d dVar;
        if (cls.isInterface()) {
            return f.f28565c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken typeToken2 = typeToken;
        boolean z14 = z10;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z15 = true;
            ?? r72 = 0;
            if (cls2 != cls && declaredFields.length > 0) {
                q b10 = m.b(this.f28551e, cls2);
                if (b10 == q.BLOCK_ALL) {
                    throw new com.google.gson.i("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z14 = b10 == q.BLOCK_INACCESSIBLE;
            }
            boolean z16 = z14;
            int length = declaredFields.length;
            int i12 = 0;
            while (i12 < length) {
                Field field = declaredFields[i12];
                boolean h10 = h(field, z15);
                boolean h11 = h(field, r72);
                if (h10 || h11) {
                    Method method2 = null;
                    if (z11) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            method = null;
                            z12 = r72;
                            if (!z16 && method == null) {
                                R8.a.o(field);
                            }
                            Type p10 = P8.b.p(typeToken2.getType(), cls2, field.getGenericType());
                            List<String> g10 = g(field);
                            str = (String) g10.get(r72);
                            i10 = i12;
                            i11 = length;
                            z13 = r72;
                            d d10 = d(eVar, field, method, str, TypeToken.get(p10), h10, z16);
                            if (z12) {
                                for (String str2 : g10) {
                                    d dVar2 = (d) linkedHashMap.put(str2, d10);
                                    if (dVar2 != null) {
                                        throw e(cls, str2, dVar2.f28562b, field);
                                    }
                                }
                            }
                            if (h10 && (dVar = (d) linkedHashMap2.put(str, d10)) != null) {
                                throw e(cls, str, dVar.f28562b, field);
                            }
                        } else {
                            method2 = R8.a.h(cls2, field);
                            if (!z16) {
                                R8.a.o(method2);
                            }
                            if (method2.getAnnotation(O8.c.class) != null && field.getAnnotation(O8.c.class) == null) {
                                throw new com.google.gson.i("@SerializedName on " + R8.a.g(method2, r72) + " is not supported");
                            }
                        }
                    }
                    z12 = h11;
                    method = method2;
                    if (!z16) {
                        R8.a.o(field);
                    }
                    Type p102 = P8.b.p(typeToken2.getType(), cls2, field.getGenericType());
                    List<String> g102 = g(field);
                    str = (String) g102.get(r72);
                    i10 = i12;
                    i11 = length;
                    z13 = r72;
                    d d102 = d(eVar, field, method, str, TypeToken.get(p102), h10, z16);
                    if (z12) {
                    }
                    if (h10) {
                        throw e(cls, str, dVar.f28562b, field);
                    }
                    continue;
                } else {
                    i10 = i12;
                    i11 = length;
                    z13 = r72;
                }
                i12 = i10 + 1;
                length = i11;
                r72 = z13;
                z15 = true;
            }
            typeToken2 = TypeToken.get(P8.b.p(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
            z14 = z16;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List g(Field field) {
        O8.c cVar = (O8.c) field.getAnnotation(O8.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f28548b.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    private boolean h(Field field, boolean z10) {
        return !this.f28549c.h(field, z10);
    }

    @Override // com.google.gson.v
    public u a(com.google.gson.e eVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (R8.a.l(rawType)) {
            return new a();
        }
        q b10 = m.b(this.f28551e, rawType);
        if (b10 != q.BLOCK_ALL) {
            boolean z10 = b10 == q.BLOCK_INACCESSIBLE;
            return R8.a.m(rawType) ? new g(rawType, f(eVar, typeToken, rawType, z10, true), z10) : new e(this.f28547a.b(typeToken), f(eVar, typeToken, rawType, z10, false));
        }
        throw new com.google.gson.i("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
