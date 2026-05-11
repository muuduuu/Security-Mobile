package r5;

import com.facebook.soloader.E;
import com.facebook.soloader.InterfaceC1999b;
import com.facebook.soloader.m;
import com.facebook.soloader.p;

/* renamed from: r5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4024l implements InterfaceC4020h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (m mVar : eArr) {
            if (mVar instanceof InterfaceC1999b) {
                p.b("SoLoader", "Waiting on SoSource " + mVar.c());
                mVar.a();
            }
        }
        return true;
    }
}
