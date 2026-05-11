package yd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class a0 extends Dd.e implements Iterable, InterfaceC5191a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f45478b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final a0 f45479c = new a0(CollectionsKt.j());

    public static final class a extends Dd.s {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Dd.s
        public int b(ConcurrentHashMap concurrentHashMap, String key, Function1 compute) {
            int intValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 == null) {
                        Object invoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) invoke).intValue()));
                        num2 = (Integer) invoke;
                    }
                    Intrinsics.d(num2);
                    intValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return intValue;
        }

        public final a0 h(List attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? i() : new a0(attributes, null);
        }

        public final a0 i() {
            return a0.f45479c;
        }

        private a() {
        }
    }

    public /* synthetic */ a0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // Dd.a
    protected Dd.s e() {
        return f45478b;
    }

    public final a0 r(a0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f45478b.f().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Y y10 = (Y) c().get(intValue);
            Y y11 = (Y) other.c().get(intValue);
            Gd.a.a(arrayList, y10 == null ? y11 != null ? y11.a(y10) : null : y10.a(y11));
        }
        return f45478b.h(arrayList);
    }

    public final boolean t(Y attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return c().get(f45478b.e(attribute.b())) != null;
    }

    public final a0 u(a0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f45478b.f().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Y y10 = (Y) c().get(intValue);
            Y y11 = (Y) other.c().get(intValue);
            Gd.a.a(arrayList, y10 == null ? y11 != null ? y11.c(y10) : null : y10.c(y11));
        }
        return f45478b.h(arrayList);
    }

    public final a0 v(Y attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (t(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new a0(attribute);
        }
        return f45478b.h(CollectionsKt.x0(CollectionsKt.O0(this), attribute));
    }

    public final a0 w(Y attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        Dd.c c10 = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c10) {
            if (!Intrinsics.b((Y) obj, attribute)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == c().c() ? this : f45478b.h(arrayList);
    }

    private a0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y y10 = (Y) it.next();
            j(y10.b(), y10);
        }
    }

    private a0(Y y10) {
        this(CollectionsKt.e(y10));
    }
}
