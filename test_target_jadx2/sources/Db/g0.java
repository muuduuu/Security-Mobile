package Db;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class g0 extends AbstractC0810t {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1459a;

    /* renamed from: b, reason: collision with root package name */
    private final W f1460b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f1461c;

    /* renamed from: d, reason: collision with root package name */
    private Object f1462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Object unconvertedValue, W typeConverter, C3862a c3862a) {
        super(null);
        Intrinsics.checkNotNullParameter(unconvertedValue, "unconvertedValue");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f1459a = unconvertedValue;
        this.f1460b = typeConverter;
        this.f1461c = new WeakReference(c3862a);
    }

    public final Object a() {
        if (this.f1462d == null) {
            this.f1462d = this.f1460b.a(this.f1459a, (C3862a) this.f1461c.get());
        }
        Object obj = this.f1462d;
        Intrinsics.d(obj);
        return obj;
    }
}
