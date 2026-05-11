package qe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;
import org.conscrypt.BuildConfig;
import pe.AbstractC3882j;
import pe.AbstractC3884l;
import pe.C3883k;
import pe.M;
import pe.S;
import pe.Z;
import pe.b0;
import xc.m;

/* loaded from: classes3.dex */
public final class h extends AbstractC3884l {

    /* renamed from: h, reason: collision with root package name */
    private static final a f38900h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final S f38901i = S.a.e(S.f38611b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final ClassLoader f38902e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3884l f38903f;

    /* renamed from: g, reason: collision with root package name */
    private final Lazy f38904g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(S s10) {
            return !StringsKt.p(s10.o(), ".class", true);
        }

        public final S b() {
            return h.f38901i;
        }

        public final S d(S s10, S base) {
            Intrinsics.checkNotNullParameter(s10, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return b().s(StringsKt.y(StringsKt.o0(s10.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    static final class b extends m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            h hVar = h.this;
            return hVar.x(hVar.f38902e);
        }
    }

    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38906a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(h.f38900h.c(entry.b()));
        }
    }

    public /* synthetic */ h(ClassLoader classLoader, boolean z10, AbstractC3884l abstractC3884l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? AbstractC3884l.f38707b : abstractC3884l);
    }

    private final String A(S s10) {
        return v(s10).r(f38901i).toString();
    }

    private final S v(S s10) {
        return f38901i.t(s10, true);
    }

    private final List w() {
        return (List) this.f38904g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List x(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources(BuildConfig.FLAVOR);
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            Intrinsics.d(url);
            Pair y10 = y(url);
            if (y10 != null) {
                arrayList.add(y10);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.d(url2);
            Pair z10 = z(url2);
            if (z10 != null) {
                arrayList2.add(z10);
            }
        }
        return CollectionsKt.w0(arrayList, arrayList2);
    }

    private final Pair y(URL url) {
        if (Intrinsics.b(url.getProtocol(), "file")) {
            return t.a(this.f38903f, S.a.d(S.f38611b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair z(URL url) {
        int d02;
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        if (!StringsKt.F(url2, "jar:file:", false, 2, null) || (d02 = StringsKt.d0(url2, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        S.a aVar = S.f38611b;
        String substring = url2.substring(4, d02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return t.a(j.f(S.a.d(aVar, new File(URI.create(substring)), false, 1, null), this.f38903f, c.f38906a), f38901i);
    }

    @Override // pe.AbstractC3884l
    public Z b(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // pe.AbstractC3884l
    public void c(S source, S target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // pe.AbstractC3884l
    public void g(S dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // pe.AbstractC3884l
    public void i(S path, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // pe.AbstractC3884l
    public List k(S dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String A10 = A(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : w()) {
            AbstractC3884l abstractC3884l = (AbstractC3884l) pair.getFirst();
            S s10 = (S) pair.getSecond();
            try {
                List k10 = abstractC3884l.k(s10.s(A10));
                ArrayList arrayList = new ArrayList();
                for (Object obj : k10) {
                    if (f38900h.c((S) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f38900h.d((S) it.next(), s10));
                }
                CollectionsKt.z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.O0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // pe.AbstractC3884l
    public C3883k m(S path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!f38900h.c(path)) {
            return null;
        }
        String A10 = A(path);
        for (Pair pair : w()) {
            C3883k m10 = ((AbstractC3884l) pair.getFirst()).m(((S) pair.getSecond()).s(A10));
            if (m10 != null) {
                return m10;
            }
        }
        return null;
    }

    @Override // pe.AbstractC3884l
    public AbstractC3882j n(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!f38900h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String A10 = A(file);
        for (Pair pair : w()) {
            try {
                return ((AbstractC3884l) pair.getFirst()).n(((S) pair.getSecond()).s(A10));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // pe.AbstractC3884l
    public Z p(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // pe.AbstractC3884l
    public b0 q(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!f38900h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        S s10 = f38901i;
        URL resource = this.f38902e.getResource(S.u(s10, file, false, 2, null).r(s10).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return M.k(inputStream);
    }

    public h(ClassLoader classLoader, boolean z10, AbstractC3884l systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f38902e = classLoader;
        this.f38903f = systemFileSystem;
        this.f38904g = lc.i.a(new b());
        if (z10) {
            w().size();
        }
    }
}
