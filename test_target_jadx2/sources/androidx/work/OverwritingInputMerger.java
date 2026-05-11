package androidx.work;

import androidx.work.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import x1.j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lx1/j;", "<init>", "()V", BuildConfig.FLAVOR, "Landroidx/work/b;", "inputs", C4870a.f43493a, "(Ljava/util/List;)Landroidx/work/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // x1.j
    public b a(List inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map i10 = ((b) it.next()).i();
            Intrinsics.checkNotNullExpressionValue(i10, "input.keyValueMap");
            linkedHashMap.putAll(i10);
        }
        aVar.d(linkedHashMap);
        b a10 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "output.build()");
        return a10;
    }
}
