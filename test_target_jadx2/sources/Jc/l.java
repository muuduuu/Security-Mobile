package Jc;

import Hc.j;
import bd.C1673A;
import id.C3367b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f4960a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set f4961b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set f4962c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f4963d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set f4964e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f4965f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f4966g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f4967h;

    static {
        l lVar = new l();
        f4960a = lVar;
        C1673A c1673a = C1673A.f18936a;
        f4961b = O.l(c1673a.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f4962c = O.k(O.k(O.k(O.k(O.k(O.k(lVar.b(), c1673a.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), c1673a.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), c1673a.e("Double", "isInfinite()Z", "isNaN()Z")), c1673a.e("Float", "isInfinite()Z", "isNaN()Z")), c1673a.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), c1673a.e("CharSequence", "isEmpty()Z"));
        f4963d = c1673a.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f4964e = O.k(O.k(O.k(O.k(O.k(O.k(c1673a.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c1673a.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), c1673a.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), c1673a.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), c1673a.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), c1673a.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c1673a.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f4965f = O.k(O.k(c1673a.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c1673a.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c1673a.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set a10 = lVar.a();
        String[] b10 = c1673a.b("D");
        Set k10 = O.k(a10, c1673a.e("Float", (String[]) Arrays.copyOf(b10, b10.length)));
        String[] b11 = c1673a.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f4966g = O.k(k10, c1673a.e("String", (String[]) Arrays.copyOf(b11, b11.length)));
        String[] b12 = c1673a.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f4967h = c1673a.e("Throwable", (String[]) Arrays.copyOf(b12, b12.length));
    }

    private l() {
    }

    private final Set a() {
        C1673A c1673a = C1673A.f18936a;
        pd.e eVar = pd.e.BOOLEAN;
        pd.e eVar2 = pd.e.BYTE;
        List m10 = CollectionsKt.m(eVar, eVar2, pd.e.DOUBLE, pd.e.FLOAT, eVar2, pd.e.INT, pd.e.LONG, pd.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            String c10 = ((pd.e) it.next()).getWrapperFqName().g().c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            String[] b10 = c1673a.b("Ljava/lang/String;");
            CollectionsKt.z(linkedHashSet, c1673a.e(c10, (String[]) Arrays.copyOf(b10, b10.length)));
        }
        return linkedHashSet;
    }

    private final Set b() {
        C1673A c1673a = C1673A.f18936a;
        List<pd.e> m10 = CollectionsKt.m(pd.e.BOOLEAN, pd.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (pd.e eVar : m10) {
            String c10 = eVar.getWrapperFqName().g().c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            CollectionsKt.z(linkedHashSet, c1673a.e(c10, eVar.getJavaKeywordName() + "Value()" + eVar.getDesc()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f4963d;
    }

    public final Set d() {
        return f4961b;
    }

    public final Set e() {
        return f4966g;
    }

    public final Set f() {
        return f4962c;
    }

    public final Set g() {
        return f4965f;
    }

    public final Set h() {
        return f4967h;
    }

    public final Set i() {
        return f4964e;
    }

    public final boolean j(id.d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return Intrinsics.b(fqName, j.a.f3947i) || Hc.j.e(fqName);
    }

    public final boolean k(id.d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        C3367b n10 = c.f4890a.n(fqName);
        if (n10 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n10.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
