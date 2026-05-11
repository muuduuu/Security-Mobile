package androidx.work.impl.background.systemalarm;

import C1.u;
import C1.x;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import java.util.ArrayList;
import java.util.List;
import x1.InterfaceC5098b;
import x1.n;
import z1.C5241e;

/* loaded from: classes.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final String f18268f = n.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f18269a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5098b f18270b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18271c;

    /* renamed from: d, reason: collision with root package name */
    private final g f18272d;

    /* renamed from: e, reason: collision with root package name */
    private final C5241e f18273e;

    c(Context context, InterfaceC5098b interfaceC5098b, int i10, g gVar) {
        this.f18269a = context;
        this.f18270b = interfaceC5098b;
        this.f18271c = i10;
        this.f18272d = gVar;
        this.f18273e = new C5241e(gVar.g().r());
    }

    void a() {
        List<u> i10 = this.f18272d.g().s().K().i();
        ConstraintProxy.a(this.f18269a, i10);
        ArrayList<u> arrayList = new ArrayList(i10.size());
        long a10 = this.f18270b.a();
        for (u uVar : i10) {
            if (a10 >= uVar.c() && (!uVar.k() || this.f18273e.a(uVar))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str = uVar2.f790a;
            Intent b10 = b.b(this.f18269a, x.a(uVar2));
            n.e().a(f18268f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f18272d.f().b().execute(new g.b(this.f18272d, b10, this.f18271c));
        }
    }
}
