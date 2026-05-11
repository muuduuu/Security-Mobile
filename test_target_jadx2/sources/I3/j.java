package I3;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4294c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f4295d = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Y3.d f4296a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4297b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Date until) {
            Intrinsics.checkNotNullParameter(until, "until");
            synchronized (j.f4295d) {
                try {
                    ConcurrentHashMap concurrentHashMap = j.f4295d;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((l) entry.getValue()).b().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((l) entry2.getValue()).a().clear();
                        j.f4295d.remove(entry2.getKey());
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b(String cacheKey, i frameLoader) {
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
            j.f4295d.put(cacheKey, new l(frameLoader, new Date()));
        }

        private a() {
        }
    }

    public j(Y3.d platformBitmapFactory, int i10) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        this.f4296a = platformBitmapFactory;
        this.f4297b = i10;
    }

    public final i b(String cacheKey, E3.c bitmapFrameRenderer, D3.d animationInformation) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        ConcurrentHashMap concurrentHashMap = f4295d;
        synchronized (concurrentHashMap) {
            l lVar = (l) concurrentHashMap.get(cacheKey);
            if (lVar == null) {
                Unit unit = Unit.f36324a;
                return new f(this.f4296a, bitmapFrameRenderer, new H3.c(this.f4297b), animationInformation);
            }
            concurrentHashMap.remove(cacheKey);
            return lVar.a();
        }
    }
}
