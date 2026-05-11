package Yd;

import Td.D;
import Td.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final D b(D d10) {
        w c10 = d10.c();
        return c10 != null ? (Intrinsics.b(d10.i(), "GET") || Intrinsics.b(d10.i(), "POST")) ? d10.j().e().w(c10).d(null).b() : d10 : d10;
    }
}
