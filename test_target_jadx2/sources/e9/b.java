package E9;

import com.google.protobuf.AbstractC2891w;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$Event;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$EventRequestV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import pc.AbstractC3868b;
import v9.C4975d;
import v9.g;
import x9.InterfaceC5137a;
import x9.d;
import xc.m;
import y9.C5180a;

/* loaded from: classes2.dex */
public final class b implements E9.a {

    /* renamed from: a, reason: collision with root package name */
    private final x9.b f1915a;

    /* renamed from: b, reason: collision with root package name */
    private final d f1916b;

    /* renamed from: c, reason: collision with root package name */
    private final C9.a f1917c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f1918d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f1919e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1920a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.EVENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.LOGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1920a = iArr;
        }
    }

    /* renamed from: E9.b$b, reason: collision with other inner class name */
    static final class C0040b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f1921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0040b(kotlin.coroutines.d dVar) {
            super(1);
            this.f1921a = dVar;
        }

        public final void a(boolean z10) {
            this.f1921a.resumeWith(o.b(Boolean.valueOf(z10)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.f36324a;
        }
    }

    public b(x9.b eventDao, d logDao, C9.a httpService) {
        Intrinsics.checkNotNullParameter(eventDao, "eventDao");
        Intrinsics.checkNotNullParameter(logDao, "logDao");
        Intrinsics.checkNotNullParameter(httpService, "httpService");
        this.f1915a = eventDao;
        this.f1916b = logDao;
        this.f1917c = httpService;
        this.f1918d = new AtomicLong(0L);
        this.f1919e = new AtomicLong(0L);
    }

    private final InterfaceC5137a h(g gVar) {
        int i10 = a.f1920a[gVar.ordinal()];
        if (i10 == 1) {
            return this.f1915a;
        }
        if (i10 == 2) {
            return this.f1916b;
        }
        throw new lc.m();
    }

    @Override // E9.a
    public Object a(String str, List list, String str2, g gVar, kotlin.coroutines.d dVar) {
        long andIncrement;
        int i10 = a.f1920a[gVar.ordinal()];
        if (i10 == 1) {
            andIncrement = this.f1918d.getAndIncrement();
        } else {
            if (i10 != 2) {
                throw new lc.m();
            }
            andIncrement = this.f1919e.getAndIncrement();
        }
        EventRequestV2OuterClass$EventRequestV2.a newBuilder = EventRequestV2OuterClass$EventRequestV2.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            newBuilder.o(EventRequestV2OuterClass$Event.parseFrom(((C5180a) it.next()).b()));
        }
        newBuilder.v(System.currentTimeMillis());
        newBuilder.s(str);
        newBuilder.p(andIncrement);
        newBuilder.q(str2);
        newBuilder.w(C4975d.f44033a.a().name());
        AbstractC2891w b10 = newBuilder.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        return b10;
    }

    @Override // E9.a
    public Object b(String str, g gVar, kotlin.coroutines.d dVar) {
        return h(gVar).c(str, dVar);
    }

    @Override // E9.a
    public Object c(String str, long j10, EventRequestV2OuterClass$Event eventRequestV2OuterClass$Event, g gVar, kotlin.coroutines.d dVar) {
        byte[] byteArray = eventRequestV2OuterClass$Event.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        Object e10 = h(gVar).e(new C5180a(str, j10, byteArray, "todo", null, 16, null), dVar);
        return e10 == AbstractC3868b.e() ? e10 : Unit.f36324a;
    }

    @Override // E9.a
    public Object d(String str, g gVar, kotlin.coroutines.d dVar) {
        Object a10 = h(gVar).a(str, dVar);
        return a10 == AbstractC3868b.e() ? a10 : Unit.f36324a;
    }

    @Override // E9.a
    public Object e(String str, String str2, List list, g gVar, kotlin.coroutines.d dVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5180a) it.next()).c());
        }
        Object b10 = h(gVar).b(str, str2, arrayList, dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }

    @Override // E9.a
    public Object f(EventRequestV2OuterClass$EventRequestV2 eventRequestV2OuterClass$EventRequestV2, g gVar, kotlin.coroutines.d dVar) {
        h hVar = new h(AbstractC3868b.c(dVar));
        C9.a aVar = this.f1917c;
        byte[] byteArray = eventRequestV2OuterClass$EventRequestV2.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        aVar.a(byteArray, gVar, new C0040b(hVar));
        Object a10 = hVar.a();
        if (a10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a10;
    }

    @Override // E9.a
    public Object g(String str, int i10, g gVar, kotlin.coroutines.d dVar) {
        return h(gVar).d(str, i10, dVar);
    }
}
