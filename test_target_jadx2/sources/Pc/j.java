package Pc;

import Pc.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends f implements Zc.e {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f7748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(id.f fVar, Object[] values) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(values, "values");
        this.f7748c = values;
    }

    @Override // Zc.e
    public List e() {
        Object[] objArr = this.f7748c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            f.a aVar = f.f7745b;
            Intrinsics.d(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
