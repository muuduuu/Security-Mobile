package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class N1 extends O1 {
    N1(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final void e() {
        if (!i()) {
            if (j() > 0) {
                android.support.v4.media.session.b.a(h(0).getKey());
                throw null;
            }
            Iterator it = n().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.e();
    }
}
