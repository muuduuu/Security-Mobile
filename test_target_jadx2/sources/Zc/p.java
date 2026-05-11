package Zc;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p {
    private static final boolean a(r rVar) {
        id.c e10;
        B b10 = (B) CollectionsKt.C0(rVar.m());
        x type = b10 != null ? b10.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i j10 = jVar.j();
        return (j10 instanceof g) && (e10 = ((g) j10).e()) != null && Intrinsics.b(e10.b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return r3.m().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean b(r rVar) {
        String c10 = rVar.getName().c();
        int hashCode = c10.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode != -1295482945) {
                if (hashCode == 147696667) {
                }
            } else if (c10.equals("equals")) {
                return a(rVar);
            }
            return false;
        }
    }

    public static final boolean c(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.W().N() && (qVar instanceof r) && b((r) qVar);
    }
}
