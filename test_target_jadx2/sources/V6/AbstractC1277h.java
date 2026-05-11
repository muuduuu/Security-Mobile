package V6;

import S6.a;
import S6.h;
import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: V6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1277h extends AbstractC1267c implements a.f, L {

    /* renamed from: F, reason: collision with root package name */
    private final C1271e f10964F;

    /* renamed from: G, reason: collision with root package name */
    private final Set f10965G;

    /* renamed from: H, reason: collision with root package name */
    private final Account f10966H;

    protected AbstractC1277h(Context context, Looper looper, int i10, C1271e c1271e, h.b bVar, h.c cVar) {
        this(context, looper, i10, c1271e, (InterfaceC1169e) bVar, (InterfaceC1184n) cVar);
    }

    private final Set q0(Set set) {
        Set p02 = p0(set);
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return p02;
    }

    @Override // V6.AbstractC1267c
    protected Executor B() {
        return null;
    }

    @Override // V6.AbstractC1267c
    protected final Set H() {
        return this.f10965G;
    }

    @Override // S6.a.f
    public Set c() {
        return s() ? this.f10965G : Collections.emptySet();
    }

    protected final C1271e o0() {
        return this.f10964F;
    }

    @Override // V6.AbstractC1267c
    public final Account z() {
        return this.f10966H;
    }

    protected AbstractC1277h(Context context, Looper looper, int i10, C1271e c1271e, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        this(context, looper, AbstractC1278i.b(context), C2017i.q(), i10, c1271e, (InterfaceC1169e) AbstractC1287s.m(interfaceC1169e), (InterfaceC1184n) AbstractC1287s.m(interfaceC1184n));
    }

    protected AbstractC1277h(Context context, Looper looper, AbstractC1278i abstractC1278i, C2017i c2017i, int i10, C1271e c1271e, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, abstractC1278i, c2017i, i10, interfaceC1169e == null ? null : new J(interfaceC1169e), interfaceC1184n == null ? null : new K(interfaceC1184n), c1271e.j());
        this.f10964F = c1271e;
        this.f10966H = c1271e.a();
        this.f10965G = q0(c1271e.d());
    }

    protected Set p0(Set set) {
        return set;
    }
}
