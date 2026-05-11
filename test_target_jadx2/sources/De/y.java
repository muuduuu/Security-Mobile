package De;

import De.p;
import Td.A;
import Td.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Method f1761a;

    /* renamed from: b, reason: collision with root package name */
    private final Td.w f1762b;

    /* renamed from: c, reason: collision with root package name */
    final String f1763c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1764d;

    /* renamed from: e, reason: collision with root package name */
    private final Td.v f1765e;

    /* renamed from: f, reason: collision with root package name */
    private final Td.z f1766f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1767g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1768h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1769i;

    /* renamed from: j, reason: collision with root package name */
    private final p[] f1770j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f1771k;

    static final class a {

        /* renamed from: x, reason: collision with root package name */
        private static final Pattern f1772x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y, reason: collision with root package name */
        private static final Pattern f1773y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        final A f1774a;

        /* renamed from: b, reason: collision with root package name */
        final Method f1775b;

        /* renamed from: c, reason: collision with root package name */
        final Annotation[] f1776c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[][] f1777d;

        /* renamed from: e, reason: collision with root package name */
        final Type[] f1778e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1779f;

        /* renamed from: g, reason: collision with root package name */
        boolean f1780g;

        /* renamed from: h, reason: collision with root package name */
        boolean f1781h;

        /* renamed from: i, reason: collision with root package name */
        boolean f1782i;

        /* renamed from: j, reason: collision with root package name */
        boolean f1783j;

        /* renamed from: k, reason: collision with root package name */
        boolean f1784k;

        /* renamed from: l, reason: collision with root package name */
        boolean f1785l;

        /* renamed from: m, reason: collision with root package name */
        boolean f1786m;

        /* renamed from: n, reason: collision with root package name */
        String f1787n;

        /* renamed from: o, reason: collision with root package name */
        boolean f1788o;

        /* renamed from: p, reason: collision with root package name */
        boolean f1789p;

        /* renamed from: q, reason: collision with root package name */
        boolean f1790q;

        /* renamed from: r, reason: collision with root package name */
        String f1791r;

        /* renamed from: s, reason: collision with root package name */
        Td.v f1792s;

        /* renamed from: t, reason: collision with root package name */
        Td.z f1793t;

        /* renamed from: u, reason: collision with root package name */
        Set f1794u;

        /* renamed from: v, reason: collision with root package name */
        p[] f1795v;

        /* renamed from: w, reason: collision with root package name */
        boolean f1796w;

        a(A a10, Method method) {
            this.f1774a = a10;
            this.f1775b = method;
            this.f1776c = method.getAnnotations();
            this.f1778e = method.getGenericParameterTypes();
            this.f1777d = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Td.v c(String[] strArr) {
            v.a aVar = new v.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw E.m(this.f1775b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f1793t = Td.z.c(trim);
                    } catch (IllegalArgumentException e10) {
                        throw E.n(this.f1775b, e10, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.f();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f1787n;
            if (str3 != null) {
                throw E.m(this.f1775b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f1787n = str;
            this.f1788o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f1772x.matcher(substring).find()) {
                    throw E.m(this.f1775b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f1791r = str2;
            this.f1794u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof Fe.b) {
                d("DELETE", ((Fe.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof Fe.f) {
                d("GET", ((Fe.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof Fe.g) {
                d("HEAD", ((Fe.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof Fe.n) {
                d("PATCH", ((Fe.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof Fe.o) {
                d("POST", ((Fe.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof Fe.p) {
                d("PUT", ((Fe.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof Fe.m) {
                d("OPTIONS", ((Fe.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof Fe.h) {
                Fe.h hVar = (Fe.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof Fe.k) {
                String[] value = ((Fe.k) annotation).value();
                if (value.length == 0) {
                    throw E.m(this.f1775b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f1792s = c(value);
                return;
            }
            if (annotation instanceof Fe.l) {
                if (this.f1789p) {
                    throw E.m(this.f1775b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f1790q = true;
            } else if (annotation instanceof Fe.e) {
                if (this.f1790q) {
                    throw E.m(this.f1775b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f1789p = true;
            }
        }

        private p f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            p pVar;
            if (annotationArr != null) {
                pVar = null;
                for (Annotation annotation : annotationArr) {
                    p g10 = g(i10, type, annotationArr, annotation);
                    if (g10 != null) {
                        if (pVar != null) {
                            throw E.o(this.f1775b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        pVar = g10;
                    }
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return pVar;
            }
            if (z10) {
                try {
                    if (E.h(type) == kotlin.coroutines.d.class) {
                        this.f1796w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw E.o(this.f1775b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private p g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Fe.y) {
                j(i10, type);
                if (this.f1786m) {
                    throw E.o(this.f1775b, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f1782i) {
                    throw E.o(this.f1775b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f1783j) {
                    throw E.o(this.f1775b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f1784k) {
                    throw E.o(this.f1775b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f1785l) {
                    throw E.o(this.f1775b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f1791r != null) {
                    throw E.o(this.f1775b, i10, "@Url cannot be used with @%s URL", this.f1787n);
                }
                this.f1786m = true;
                if (type == Td.w.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new p.C0032p(this.f1775b, i10);
                }
                throw E.o(this.f1775b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Fe.s) {
                j(i10, type);
                if (this.f1783j) {
                    throw E.o(this.f1775b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f1784k) {
                    throw E.o(this.f1775b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f1785l) {
                    throw E.o(this.f1775b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f1786m) {
                    throw E.o(this.f1775b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f1791r == null) {
                    throw E.o(this.f1775b, i10, "@Path can only be used with relative url on @%s", this.f1787n);
                }
                this.f1782i = true;
                Fe.s sVar = (Fe.s) annotation;
                String value = sVar.value();
                i(i10, value);
                return new p.k(this.f1775b, i10, value, this.f1774a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof Fe.t) {
                j(i10, type);
                Fe.t tVar = (Fe.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class h10 = E.h(type);
                this.f1783j = true;
                if (!Iterable.class.isAssignableFrom(h10)) {
                    if (!h10.isArray()) {
                        return new p.l(value2, this.f1774a.i(type, annotationArr), encoded);
                    }
                    return new p.l(value2, this.f1774a.i(a(h10.getComponentType()), annotationArr), encoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p.l(value2, this.f1774a.i(E.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                }
                throw E.o(this.f1775b, i10, h10.getSimpleName() + " must include generic type (e.g., " + h10.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Fe.v) {
                j(i10, type);
                boolean encoded2 = ((Fe.v) annotation).encoded();
                Class h11 = E.h(type);
                this.f1784k = true;
                if (!Iterable.class.isAssignableFrom(h11)) {
                    if (!h11.isArray()) {
                        return new p.n(this.f1774a.i(type, annotationArr), encoded2);
                    }
                    return new p.n(this.f1774a.i(a(h11.getComponentType()), annotationArr), encoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p.n(this.f1774a.i(E.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                }
                throw E.o(this.f1775b, i10, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Fe.u) {
                j(i10, type);
                Class h12 = E.h(type);
                this.f1785l = true;
                if (!Map.class.isAssignableFrom(h12)) {
                    throw E.o(this.f1775b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type i11 = E.i(type, h12, Map.class);
                if (!(i11 instanceof ParameterizedType)) {
                    throw E.o(this.f1775b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) i11;
                Type g10 = E.g(0, parameterizedType);
                if (String.class == g10) {
                    return new p.m(this.f1775b, i10, this.f1774a.i(E.g(1, parameterizedType), annotationArr), ((Fe.u) annotation).encoded());
                }
                throw E.o(this.f1775b, i10, "@QueryMap keys must be of type String: " + g10, new Object[0]);
            }
            if (annotation instanceof Fe.i) {
                j(i10, type);
                String value3 = ((Fe.i) annotation).value();
                Class h13 = E.h(type);
                if (!Iterable.class.isAssignableFrom(h13)) {
                    if (!h13.isArray()) {
                        return new p.f(value3, this.f1774a.i(type, annotationArr));
                    }
                    return new p.f(value3, this.f1774a.i(a(h13.getComponentType()), annotationArr)).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p.f(value3, this.f1774a.i(E.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw E.o(this.f1775b, i10, h13.getSimpleName() + " must include generic type (e.g., " + h13.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Fe.j) {
                if (type == Td.v.class) {
                    return new p.h(this.f1775b, i10);
                }
                j(i10, type);
                Class h14 = E.h(type);
                if (!Map.class.isAssignableFrom(h14)) {
                    throw E.o(this.f1775b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type i12 = E.i(type, h14, Map.class);
                if (!(i12 instanceof ParameterizedType)) {
                    throw E.o(this.f1775b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) i12;
                Type g11 = E.g(0, parameterizedType2);
                if (String.class == g11) {
                    return new p.g(this.f1775b, i10, this.f1774a.i(E.g(1, parameterizedType2), annotationArr));
                }
                throw E.o(this.f1775b, i10, "@HeaderMap keys must be of type String: " + g11, new Object[0]);
            }
            if (annotation instanceof Fe.c) {
                j(i10, type);
                if (!this.f1789p) {
                    throw E.o(this.f1775b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Fe.c cVar = (Fe.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.f1779f = true;
                Class h15 = E.h(type);
                if (!Iterable.class.isAssignableFrom(h15)) {
                    if (!h15.isArray()) {
                        return new p.d(value4, this.f1774a.i(type, annotationArr), encoded3);
                    }
                    return new p.d(value4, this.f1774a.i(a(h15.getComponentType()), annotationArr), encoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p.d(value4, this.f1774a.i(E.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                }
                throw E.o(this.f1775b, i10, h15.getSimpleName() + " must include generic type (e.g., " + h15.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof Fe.d) {
                j(i10, type);
                if (!this.f1789p) {
                    throw E.o(this.f1775b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class h16 = E.h(type);
                if (!Map.class.isAssignableFrom(h16)) {
                    throw E.o(this.f1775b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type i13 = E.i(type, h16, Map.class);
                if (!(i13 instanceof ParameterizedType)) {
                    throw E.o(this.f1775b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) i13;
                Type g12 = E.g(0, parameterizedType3);
                if (String.class == g12) {
                    f i14 = this.f1774a.i(E.g(1, parameterizedType3), annotationArr);
                    this.f1779f = true;
                    return new p.e(this.f1775b, i10, i14, ((Fe.d) annotation).encoded());
                }
                throw E.o(this.f1775b, i10, "@FieldMap keys must be of type String: " + g12, new Object[0]);
            }
            if (!(annotation instanceof Fe.q)) {
                if (annotation instanceof Fe.r) {
                    j(i10, type);
                    if (!this.f1790q) {
                        throw E.o(this.f1775b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f1780g = true;
                    Class h17 = E.h(type);
                    if (!Map.class.isAssignableFrom(h17)) {
                        throw E.o(this.f1775b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type i15 = E.i(type, h17, Map.class);
                    if (!(i15 instanceof ParameterizedType)) {
                        throw E.o(this.f1775b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) i15;
                    Type g13 = E.g(0, parameterizedType4);
                    if (String.class == g13) {
                        Type g14 = E.g(1, parameterizedType4);
                        if (A.c.class.isAssignableFrom(E.h(g14))) {
                            throw E.o(this.f1775b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new p.j(this.f1775b, i10, this.f1774a.g(g14, annotationArr, this.f1776c), ((Fe.r) annotation).encoding());
                    }
                    throw E.o(this.f1775b, i10, "@PartMap keys must be of type String: " + g13, new Object[0]);
                }
                if (annotation instanceof Fe.a) {
                    j(i10, type);
                    if (this.f1789p || this.f1790q) {
                        throw E.o(this.f1775b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f1781h) {
                        throw E.o(this.f1775b, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        f g15 = this.f1774a.g(type, annotationArr, this.f1776c);
                        this.f1781h = true;
                        return new p.c(this.f1775b, i10, g15);
                    } catch (RuntimeException e10) {
                        throw E.p(this.f1775b, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof Fe.x)) {
                    return null;
                }
                j(i10, type);
                Class h18 = E.h(type);
                for (int i16 = i10 - 1; i16 >= 0; i16--) {
                    p pVar = this.f1795v[i16];
                    if ((pVar instanceof p.q) && ((p.q) pVar).f1741a.equals(h18)) {
                        throw E.o(this.f1775b, i10, "@Tag type " + h18.getName() + " is duplicate of parameter #" + (i16 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new p.q(h18);
            }
            j(i10, type);
            if (!this.f1790q) {
                throw E.o(this.f1775b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            Fe.q qVar = (Fe.q) annotation;
            this.f1780g = true;
            String value5 = qVar.value();
            Class h19 = E.h(type);
            if (value5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(h19)) {
                    if (h19.isArray()) {
                        if (A.c.class.isAssignableFrom(h19.getComponentType())) {
                            return p.o.f1738a.b();
                        }
                        throw E.o(this.f1775b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (A.c.class.isAssignableFrom(h19)) {
                        return p.o.f1738a;
                    }
                    throw E.o(this.f1775b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (A.c.class.isAssignableFrom(E.h(E.g(0, (ParameterizedType) type)))) {
                        return p.o.f1738a.c();
                    }
                    throw E.o(this.f1775b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw E.o(this.f1775b, i10, h19.getSimpleName() + " must include generic type (e.g., " + h19.getSimpleName() + "<String>)", new Object[0]);
            }
            Td.v t10 = Td.v.t("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(h19)) {
                if (!h19.isArray()) {
                    if (A.c.class.isAssignableFrom(h19)) {
                        throw E.o(this.f1775b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p.i(this.f1775b, i10, t10, this.f1774a.g(type, annotationArr, this.f1776c));
                }
                Class a10 = a(h19.getComponentType());
                if (A.c.class.isAssignableFrom(a10)) {
                    throw E.o(this.f1775b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new p.i(this.f1775b, i10, t10, this.f1774a.g(a10, annotationArr, this.f1776c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type g16 = E.g(0, (ParameterizedType) type);
                if (A.c.class.isAssignableFrom(E.h(g16))) {
                    throw E.o(this.f1775b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new p.i(this.f1775b, i10, t10, this.f1774a.g(g16, annotationArr, this.f1776c)).c();
            }
            throw E.o(this.f1775b, i10, h19.getSimpleName() + " must include generic type (e.g., " + h19.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set h(String str) {
            Matcher matcher = f1772x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f1773y.matcher(str).matches()) {
                throw E.o(this.f1775b, i10, "@Path parameter name must match %s. Found: %s", f1772x.pattern(), str);
            }
            if (!this.f1794u.contains(str)) {
                throw E.o(this.f1775b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f1791r, str);
            }
        }

        private void j(int i10, Type type) {
            if (E.j(type)) {
                throw E.o(this.f1775b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        y b() {
            for (Annotation annotation : this.f1776c) {
                e(annotation);
            }
            if (this.f1787n == null) {
                throw E.m(this.f1775b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f1788o) {
                if (this.f1790q) {
                    throw E.m(this.f1775b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f1789p) {
                    throw E.m(this.f1775b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f1777d.length;
            this.f1795v = new p[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f1795v[i11] = f(i11, this.f1778e[i11], this.f1777d[i11], i11 == i10);
                i11++;
            }
            if (this.f1791r == null && !this.f1786m) {
                throw E.m(this.f1775b, "Missing either @%s URL or @Url parameter.", this.f1787n);
            }
            boolean z10 = this.f1789p;
            if (!z10 && !this.f1790q && !this.f1788o && this.f1781h) {
                throw E.m(this.f1775b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f1779f) {
                throw E.m(this.f1775b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f1790q || this.f1780g) {
                return new y(this);
            }
            throw E.m(this.f1775b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    y(a aVar) {
        this.f1761a = aVar.f1775b;
        this.f1762b = aVar.f1774a.f1603c;
        this.f1763c = aVar.f1787n;
        this.f1764d = aVar.f1791r;
        this.f1765e = aVar.f1792s;
        this.f1766f = aVar.f1793t;
        this.f1767g = aVar.f1788o;
        this.f1768h = aVar.f1789p;
        this.f1769i = aVar.f1790q;
        this.f1770j = aVar.f1795v;
        this.f1771k = aVar.f1796w;
    }

    static y b(A a10, Method method) {
        return new a(a10, method).b();
    }

    Td.D a(Object[] objArr) {
        p[] pVarArr = this.f1770j;
        int length = objArr.length;
        if (length != pVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + pVarArr.length + ")");
        }
        x xVar = new x(this.f1763c, this.f1762b, this.f1764d, this.f1765e, this.f1766f, this.f1767g, this.f1768h, this.f1769i);
        if (this.f1771k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            pVarArr[i10].a(xVar, objArr[i10]);
        }
        return xVar.k().u(l.class, new l(this.f1761a, arrayList)).b();
    }
}
