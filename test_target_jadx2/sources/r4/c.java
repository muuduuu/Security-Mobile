package R4;

import android.util.Pair;
import i4.AbstractC3320a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s5.C4313a;

/* loaded from: classes.dex */
public final class c extends AbstractC3320a {

    /* renamed from: a, reason: collision with root package name */
    private int f8455a;

    /* renamed from: b, reason: collision with root package name */
    private Map f8456b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map f8457c = new LinkedHashMap();

    @Override // i4.e
    public void a(m4.b request, String requestId, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (C4313a.j(0L) && this.f8457c.containsKey(requestId)) {
            Object obj = this.f8457c.get(requestId);
            Intrinsics.d(obj);
            Pair pair = (Pair) obj;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            C4313a.g(0L, (String) second, ((Number) first).intValue());
            this.f8457c.remove(requestId);
        }
    }

    @Override // i4.AbstractC3320a, com.facebook.imagepipeline.producers.h0
    public void b(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (C4313a.j(0L)) {
            Pair create = Pair.create(Integer.valueOf(this.f8455a), "FRESCO_PRODUCER_" + StringsKt.y(producerName, ':', '_', false, 4, null));
            Object second = create.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            C4313a.a(0L, (String) second, this.f8455a);
            Map map = this.f8456b;
            Intrinsics.d(create);
            map.put(requestId, create);
            this.f8455a++;
        }
    }

    @Override // i4.e
    public void c(m4.b request, String requestId, Throwable throwable, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (C4313a.j(0L) && this.f8457c.containsKey(requestId)) {
            Object obj = this.f8457c.get(requestId);
            Intrinsics.d(obj);
            Pair pair = (Pair) obj;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            C4313a.g(0L, (String) second, ((Number) first).intValue());
            this.f8457c.remove(requestId);
        }
    }

    @Override // i4.AbstractC3320a, com.facebook.imagepipeline.producers.h0
    public void d(String requestId, String producerName, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (C4313a.j(0L) && this.f8456b.containsKey(requestId)) {
            Object obj = this.f8456b.get(requestId);
            Intrinsics.d(obj);
            Pair pair = (Pair) obj;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            C4313a.g(0L, (String) second, ((Number) first).intValue());
            this.f8456b.remove(requestId);
        }
    }

    @Override // i4.AbstractC3320a, com.facebook.imagepipeline.producers.h0
    public boolean f(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }

    @Override // i4.AbstractC3320a, com.facebook.imagepipeline.producers.h0
    public void g(String requestId, String producerName, String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (C4313a.j(0L)) {
            C4313a.n(0L, "FRESCO_PRODUCER_EVENT_" + StringsKt.y(requestId, ':', '_', false, 4, null) + "_" + StringsKt.y(producerName, ':', '_', false, 4, null) + "_" + StringsKt.y(eventName, ':', '_', false, 4, null), C4313a.EnumC0611a.THREAD);
        }
    }

    @Override // i4.AbstractC3320a, com.facebook.imagepipeline.producers.h0
    public void h(String requestId, String producerName, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (C4313a.j(0L) && this.f8456b.containsKey(requestId)) {
            Object obj = this.f8456b.get(requestId);
            Intrinsics.d(obj);
            Pair pair = (Pair) obj;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            C4313a.g(0L, (String) second, ((Number) first).intValue());
            this.f8456b.remove(requestId);
        }
    }

    @Override // i4.AbstractC3320a, com.facebook.imagepipeline.producers.h0
    public void i(String requestId, String producerName, Throwable t10, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t10, "t");
        if (C4313a.j(0L) && this.f8456b.containsKey(requestId)) {
            Object obj = this.f8456b.get(requestId);
            Intrinsics.d(obj);
            Pair pair = (Pair) obj;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            C4313a.g(0L, (String) second, ((Number) first).intValue());
            this.f8456b.remove(requestId);
        }
    }

    @Override // i4.e
    public void j(m4.b request, Object callerContext, String requestId, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (C4313a.j(0L)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRESCO_REQUEST_");
            String uri = request.u().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            sb2.append(StringsKt.y(uri, ':', '_', false, 4, null));
            Pair create = Pair.create(Integer.valueOf(this.f8455a), sb2.toString());
            Object second = create.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            C4313a.a(0L, (String) second, this.f8455a);
            Map map = this.f8457c;
            Intrinsics.d(create);
            map.put(requestId, create);
            this.f8455a++;
        }
    }

    @Override // i4.e
    public void k(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (C4313a.j(0L) && this.f8457c.containsKey(requestId)) {
            Object obj = this.f8457c.get(requestId);
            Intrinsics.d(obj);
            Pair pair = (Pair) obj;
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            C4313a.g(0L, (String) second, ((Number) first).intValue());
            this.f8457c.remove(requestId);
        }
    }
}
