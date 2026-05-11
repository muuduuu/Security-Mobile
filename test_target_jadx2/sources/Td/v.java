package Td;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import xc.C5146G;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class v implements Iterable, InterfaceC5191a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f10217b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final String[] f10218a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f10219a = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.e.b(this, name, value);
        }

        public final a b(v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Wd.e.c(this, headers);
        }

        public final a c(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int W10 = StringsKt.W(line, ':', 1, false, 4, null);
            if (W10 != -1) {
                String substring = line.substring(0, W10);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = line.substring(W10 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                d(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                d(BuildConfig.FLAVOR, substring3);
            } else {
                d(BuildConfig.FLAVOR, line);
            }
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.e.d(this, name, value);
        }

        public final a e(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Wd.e.t(name);
            d(name, value);
            return this;
        }

        public final v f() {
            return Wd.e.e(this);
        }

        public final String g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return Wd.e.g(this, name);
        }

        public final List h() {
            return this.f10219a;
        }

        public final a i(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return Wd.e.n(this, name);
        }

        public final a j(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.e.o(this, name, value);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(Map map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            return Wd.e.p(map);
        }

        public final v b(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return Wd.e.j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        private b() {
        }
    }

    public v(String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.f10218a = namesAndValues;
    }

    public static final v r(Map map) {
        return f10217b.a(map);
    }

    public static final v t(String... strArr) {
        return f10217b.b(strArr);
    }

    public final String c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Wd.e.i(this.f10218a, name);
    }

    public final String[] e() {
        return this.f10218a;
    }

    public boolean equals(Object obj) {
        return Wd.e.f(this, obj);
    }

    public final String h(int i10) {
        return Wd.e.l(this, i10);
    }

    public int hashCode() {
        return Wd.e.h(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Wd.e.k(this);
    }

    public final Set j() {
        TreeSet treeSet = new TreeSet(StringsKt.s(C5146G.f44966a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(h(i10));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    public final a m() {
        return Wd.e.m(this);
    }

    public final int size() {
        return this.f10218a.length / 2;
    }

    public String toString() {
        return Wd.e.q(this);
    }

    public final Map u() {
        TreeMap treeMap = new TreeMap(StringsKt.s(C5146G.f44966a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String h10 = h(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = h10.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(v(i10));
        }
        return treeMap;
    }

    public final String v(int i10) {
        return Wd.e.r(this, i10);
    }

    public final List w(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Wd.e.s(this, name);
    }
}
