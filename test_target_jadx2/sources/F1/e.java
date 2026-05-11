package F1;

import C1.i;
import C1.j;
import C1.o;
import C1.u;
import C1.x;
import C1.z;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import x1.n;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2203a;

    static {
        String i10 = n.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f2203a = i10;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.f790a + "\t " + uVar.f792c + "\t " + num + "\t " + uVar.f791b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            i e10 = jVar.e(x.a(uVar));
            sb2.append(c(uVar, CollectionsKt.l0(oVar.b(uVar.f790a), ",", null, null, 0, null, null, 62, null), e10 != null ? Integer.valueOf(e10.f765c) : null, CollectionsKt.l0(zVar.b(uVar.f790a), ",", null, null, 0, null, null, 62, null)));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
