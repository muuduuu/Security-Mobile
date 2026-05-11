package Sc;

import Hc.j;
import ad.C1382i;
import ad.EnumC1379f;
import ad.EnumC1381h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Sc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1151a {

    /* renamed from: c, reason: collision with root package name */
    private static final C0177a f9013c = new C0177a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f9014d;

    /* renamed from: a, reason: collision with root package name */
    private final x f9015a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f9016b;

    /* renamed from: Sc.a$a, reason: collision with other inner class name */
    private static final class C0177a {
        public /* synthetic */ C0177a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0177a() {
        }
    }

    /* renamed from: Sc.a$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9017a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object extractNullability) {
            Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1152b enumC1152b : EnumC1152b.values()) {
            String javaTarget = enumC1152b.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, enumC1152b);
            }
        }
        f9014d = linkedHashMap;
    }

    public AbstractC1151a(x javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f9015a = javaTypeEnhancementState;
        this.f9016b = new ConcurrentHashMap();
    }

    private final Set a(Set set) {
        return set.contains(EnumC1152b.TYPE_USE) ? O.k(O.j(AbstractC3574i.y0(EnumC1152b.values()), EnumC1152b.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final r d(Object obj) {
        C1382i g10;
        r r10 = r(obj);
        if (r10 != null) {
            return r10;
        }
        Pair t10 = t(obj);
        if (t10 == null) {
            return null;
        }
        Object first = t10.getFirst();
        Set set = (Set) t10.getSecond();
        G q10 = q(obj);
        if (q10 == null) {
            q10 = p(first);
        }
        if (q10.isIgnore() || (g10 = g(first, b.f9017a)) == null) {
            return null;
        }
        return new r(C1382i.b(g10, null, q10.isWarning(), 1, null), set, false, 4, null);
    }

    private final C1382i g(Object obj, Function1 function1) {
        C1382i n10;
        C1382i n11 = n(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (n11 != null) {
            return n11;
        }
        Object s10 = s(obj);
        if (s10 == null) {
            return null;
        }
        G p10 = p(obj);
        if (p10.isIgnore() || (n10 = n(s10, ((Boolean) function1.invoke(s10)).booleanValue())) == null) {
            return null;
        }
        return C1382i.b(n10, null, p10.isWarning(), 1, null);
    }

    private final Object h(Object obj, id.c cVar) {
        for (Object obj2 : k(obj)) {
            if (Intrinsics.b(i(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean l(Object obj, id.c cVar) {
        Iterable k10 = k(obj);
        if ((k10 instanceof Collection) && ((Collection) k10).isEmpty()) {
            return false;
        }
        Iterator it = k10.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (r7.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        r7 = ad.EnumC1381h.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r7.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C1382i n(Object obj, boolean z10) {
        EnumC1381h enumC1381h;
        id.c i10 = i(obj);
        if (i10 == null) {
            return null;
        }
        G g10 = (G) this.f9015a.c().invoke(i10);
        if (g10.isIgnore()) {
            return null;
        }
        if (C.o().contains(i10)) {
            enumC1381h = EnumC1381h.NULLABLE;
        } else if (C.n().contains(i10)) {
            enumC1381h = EnumC1381h.NOT_NULL;
        } else {
            if (Intrinsics.b(i10, C.j()) ? true : Intrinsics.b(i10, C.g())) {
                enumC1381h = EnumC1381h.NULLABLE;
            } else {
                if (Intrinsics.b(i10, C.k()) ? true : Intrinsics.b(i10, C.h())) {
                    enumC1381h = EnumC1381h.FORCE_FLEXIBILITY;
                } else if (Intrinsics.b(i10, C.f())) {
                    String str = (String) CollectionsKt.e0(b(obj, false));
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 73135176:
                                break;
                            case 74175084:
                                break;
                            case 433141802:
                                if (str.equals("UNKNOWN")) {
                                    enumC1381h = EnumC1381h.FORCE_FLEXIBILITY;
                                    break;
                                }
                                break;
                            case 1933739535:
                                break;
                        }
                        return null;
                    }
                    enumC1381h = EnumC1381h.NOT_NULL;
                } else if (Intrinsics.b(i10, C.d())) {
                    enumC1381h = EnumC1381h.NULLABLE;
                } else if (Intrinsics.b(i10, C.c())) {
                    enumC1381h = EnumC1381h.NOT_NULL;
                } else if (Intrinsics.b(i10, C.a())) {
                    enumC1381h = EnumC1381h.NOT_NULL;
                } else {
                    if (!Intrinsics.b(i10, C.b())) {
                        return null;
                    }
                    enumC1381h = EnumC1381h.NULLABLE;
                }
            }
        }
        return new C1382i(enumC1381h, g10.isWarning() || z10);
    }

    private final G o(Object obj) {
        id.c i10 = i(obj);
        return (i10 == null || !AbstractC1153c.c().containsKey(i10)) ? p(obj) : (G) this.f9015a.c().invoke(i10);
    }

    private final G p(Object obj) {
        G q10 = q(obj);
        return q10 != null ? q10 : this.f9015a.d().a();
    }

    private final G q(Object obj) {
        Iterable b10;
        String str;
        G g10 = (G) this.f9015a.d().c().get(i(obj));
        if (g10 != null) {
            return g10;
        }
        Object h10 = h(obj, AbstractC1153c.d());
        if (h10 == null || (b10 = b(h10, false)) == null || (str = (String) CollectionsKt.e0(b10)) == null) {
            return null;
        }
        G b11 = this.f9015a.d().b();
        if (b11 != null) {
            return b11;
        }
        int hashCode = str.hashCode();
        if (hashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return G.IGNORE;
            }
            return null;
        }
        if (hashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return G.STRICT;
            }
            return null;
        }
        if (hashCode == 2656902 && str.equals("WARN")) {
            return G.WARN;
        }
        return null;
    }

    private final r r(Object obj) {
        r rVar;
        if (this.f9015a.b() || (rVar = (r) AbstractC1153c.a().get(i(obj))) == null) {
            return null;
        }
        G o10 = o(obj);
        if (o10 == G.IGNORE) {
            o10 = null;
        }
        if (o10 == null) {
            return null;
        }
        return r.b(rVar, C1382i.b(rVar.d(), null, o10.isWarning(), 1, null), null, false, 6, null);
    }

    private final Pair t(Object obj) {
        Object h10;
        Object obj2;
        if (this.f9015a.d().d() || (h10 = h(obj, AbstractC1153c.e())) == null) {
            return null;
        }
        Iterator it = k(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (s(obj2) != null) {
                break;
            }
        }
        if (obj2 == null) {
            return null;
        }
        Iterable b10 = b(h10, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = b10.iterator();
        while (it2.hasNext()) {
            EnumC1152b enumC1152b = (EnumC1152b) f9014d.get((String) it2.next());
            if (enumC1152b != null) {
                linkedHashSet.add(enumC1152b);
            }
        }
        return new Pair(obj2, a(linkedHashSet));
    }

    protected abstract Iterable b(Object obj, boolean z10);

    public final y c(y yVar, Iterable annotations) {
        EnumMap b10;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f9015a.b()) {
            return yVar;
        }
        ArrayList<r> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            r d10 = d(it.next());
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        if (arrayList.isEmpty()) {
            return yVar;
        }
        EnumMap enumMap = (yVar == null || (b10 = yVar.b()) == null) ? new EnumMap(EnumC1152b.class) : new EnumMap(b10);
        boolean z10 = false;
        for (r rVar : arrayList) {
            Iterator it2 = rVar.e().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (EnumC1152b) rVar);
                z10 = true;
            }
        }
        return !z10 ? yVar : new y(enumMap);
    }

    public final EnumC1379f e(Iterable annotations) {
        EnumC1379f enumC1379f;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator it = annotations.iterator();
        EnumC1379f enumC1379f2 = null;
        while (it.hasNext()) {
            id.c i10 = i(it.next());
            if (C.p().contains(i10)) {
                enumC1379f = EnumC1379f.READ_ONLY;
            } else if (C.m().contains(i10)) {
                enumC1379f = EnumC1379f.MUTABLE;
            } else {
                continue;
            }
            if (enumC1379f2 != null && enumC1379f2 != enumC1379f) {
                return null;
            }
            enumC1379f2 = enumC1379f;
        }
        return enumC1379f2;
    }

    public final C1382i f(Iterable annotations, Function1 forceWarning) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        C1382i c1382i = null;
        while (it.hasNext()) {
            C1382i g10 = g(it.next(), forceWarning);
            if (c1382i != null) {
                if (g10 != null && !Intrinsics.b(g10, c1382i) && (!g10.d() || c1382i.d())) {
                    if (g10.d() || !c1382i.d()) {
                        return null;
                    }
                }
            }
            c1382i = g10;
        }
        return c1382i;
    }

    protected abstract id.c i(Object obj);

    protected abstract Object j(Object obj);

    protected abstract Iterable k(Object obj);

    public final boolean m(Object annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Object h10 = h(annotation, j.a.f3907H);
        if (h10 == null) {
            return false;
        }
        Iterable b10 = b(h10, false);
        if ((b10 instanceof Collection) && ((Collection) b10).isEmpty()) {
            return false;
        }
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object s(Object annotation) {
        Object obj;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f9015a.d().d()) {
            return null;
        }
        if (CollectionsKt.V(AbstractC1153c.b(), i(annotation)) || l(annotation, AbstractC1153c.f())) {
            return annotation;
        }
        if (!l(annotation, AbstractC1153c.g())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f9016b;
        Object j10 = j(annotation);
        Object obj2 = concurrentHashMap.get(j10);
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = k(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = s(it.next());
            if (obj != null) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        Object putIfAbsent = concurrentHashMap.putIfAbsent(j10, obj);
        return putIfAbsent == null ? obj : putIfAbsent;
    }
}
