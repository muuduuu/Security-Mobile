package bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* renamed from: bd.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1673A {

    /* renamed from: a, reason: collision with root package name */
    public static final C1673A f18936a = new C1673A();

    /* renamed from: bd.A$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18937a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C1673A.f18936a.c(it);
        }
    }

    private C1673A() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final String[] b(String... signatures) {
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set d(String internalName, String... signatures) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set e(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set f(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name, List parameters, String ret) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ret, "ret");
        return name + '(' + CollectionsKt.l0(parameters, BuildConfig.FLAVOR, null, null, 0, null, a.f18937a, 30, null) + ')' + c(ret);
    }

    public final String k(String internalName, String jvmDescriptor) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
