package Fc;

import Ec.D;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;
import xc.C5142C;
import xc.m;

/* loaded from: classes3.dex */
public abstract class c {

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f2674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map map) {
            super(0);
            this.f2674a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int i10 = 0;
            for (Map.Entry entry : this.f2674a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                i10 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i10);
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f2675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f2676b;

        static final class a extends m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2677a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry entry) {
                String obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    obj = Arrays.toString((boolean[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof char[]) {
                    obj = Arrays.toString((char[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof byte[]) {
                    obj = Arrays.toString((byte[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof short[]) {
                    obj = Arrays.toString((short[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof int[]) {
                    obj = Arrays.toString((int[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof float[]) {
                    obj = Arrays.toString((float[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof long[]) {
                    obj = Arrays.toString((long[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof double[]) {
                    obj = Arrays.toString((double[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else if (value instanceof Object[]) {
                    obj = Arrays.toString((Object[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                } else {
                    obj = value.toString();
                }
                return str + '=' + obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls, Map map) {
            super(0);
            this.f2675a = cls;
            this.f2676b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Class cls = this.f2675a;
            Map map = this.f2676b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(cls.getCanonicalName());
            CollectionsKt.j0(map.entrySet(), sb2, ", ", "(", ")", 0, null, a.f2677a, 48, null);
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    public static final Object d(Class annotationClass, Map values, List methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        Lazy a10 = lc.i.a(new a(values));
        Object newProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new Fc.b(annotationClass, values, lc.i.a(new b(annotationClass, values)), a10, methods));
        Intrinsics.e(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static /* synthetic */ Object e(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set keySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.u(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    private static final boolean f(Class cls, List list, Map map, Object obj) {
        boolean b10;
        boolean z10;
        kotlin.reflect.d a10;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!Intrinsics.b((annotation == null || (a10 = AbstractC5011a.a(annotation)) == null) ? null : AbstractC5011a.b(a10), cls)) {
            return false;
        }
        List<Method> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Method method : list2) {
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, null);
                if (obj2 instanceof boolean[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    b10 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                } else if (obj2 instanceof char[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                    b10 = Arrays.equals((char[]) obj2, (char[]) invoke);
                } else if (obj2 instanceof byte[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    b10 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                } else if (obj2 instanceof short[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    b10 = Arrays.equals((short[]) obj2, (short[]) invoke);
                } else if (obj2 instanceof int[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                    b10 = Arrays.equals((int[]) obj2, (int[]) invoke);
                } else if (obj2 instanceof float[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    b10 = Arrays.equals((float[]) obj2, (float[]) invoke);
                } else if (obj2 instanceof long[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                    b10 = Arrays.equals((long[]) obj2, (long[]) invoke);
                } else if (obj2 instanceof double[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    b10 = Arrays.equals((double[]) obj2, (double[]) invoke);
                } else if (obj2 instanceof Object[]) {
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    b10 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                } else {
                    b10 = Intrinsics.b(obj2, invoke);
                }
                if (!b10) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        return z10;
    }

    private static final int g(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    private static final String h(Lazy lazy) {
        return (String) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Class annotationClass, Map values, Lazy toString$delegate, Lazy hashCode$delegate, List methods, Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(annotationClass, "$annotationClass");
        Intrinsics.checkNotNullParameter(values, "$values");
        Intrinsics.checkNotNullParameter(toString$delegate, "$toString$delegate");
        Intrinsics.checkNotNullParameter(hashCode$delegate, "$hashCode$delegate");
        Intrinsics.checkNotNullParameter(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(g(hashCode$delegate));
                }
            } else if (name.equals("toString")) {
                return h(toString$delegate);
            }
        }
        if (Intrinsics.b(name, "equals") && objArr != null && objArr.length == 1) {
            Intrinsics.d(objArr);
            return Boolean.valueOf(f(annotationClass, methods, values, AbstractC3574i.Z(objArr)));
        }
        if (values.containsKey(name)) {
            return values.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(AbstractC3574i.m0(objArr));
        sb2.append(')');
        throw new D(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j(int i10, String str, Class cls) {
        String e10;
        kotlin.reflect.d b10 = Intrinsics.b(cls, Class.class) ? C5142C.b(kotlin.reflect.d.class) : (cls.isArray() && Intrinsics.b(cls.getComponentType(), Class.class)) ? C5142C.b(kotlin.reflect.d[].class) : AbstractC5011a.e(cls);
        if (Intrinsics.b(b10.e(), C5142C.b(Object[].class).e())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b10.e());
            sb2.append('<');
            Class<?> componentType = AbstractC5011a.b(b10).getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            sb2.append(AbstractC5011a.e(componentType).e());
            sb2.append('>');
            e10 = sb2.toString();
        } else {
            e10 = b10.e();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof kotlin.reflect.d) {
            obj = AbstractC5011a.b((kotlin.reflect.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof kotlin.reflect.d[]) {
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                kotlin.reflect.d[] dVarArr = (kotlin.reflect.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (kotlin.reflect.d dVar : dVarArr) {
                    arrayList.add(AbstractC5011a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
