package ud;

import Kc.a0;
import dd.C3026c;
import dd.C3036m;
import fd.AbstractC3165a;
import id.C3367b;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    private final fd.c f43761a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3165a f43762b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f43763c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f43764d;

    public z(C3036m proto, fd.c nameResolver, AbstractC3165a metadataVersion, Function1 classSource) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        this.f43761a = nameResolver;
        this.f43762b = metadataVersion;
        this.f43763c = classSource;
        List G10 = proto.G();
        Intrinsics.checkNotNullExpressionValue(G10, "getClass_List(...)");
        List list = G10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(kotlin.collections.G.d(CollectionsKt.u(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(y.a(this.f43761a, ((C3026c) obj).C0()), obj);
        }
        this.f43764d = linkedHashMap;
    }

    @Override // ud.h
    public C4889g a(C3367b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        C3026c c3026c = (C3026c) this.f43764d.get(classId);
        if (c3026c == null) {
            return null;
        }
        return new C4889g(this.f43761a, c3026c, this.f43762b, (a0) this.f43763c.invoke(classId));
    }

    public final Collection b() {
        return this.f43764d.keySet();
    }
}
