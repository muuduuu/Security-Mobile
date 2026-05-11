package h9;

import X8.C1298d;
import b8.C1659f;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import g9.C3205e;
import g9.InterfaceC3204d;
import java.util.concurrent.Executor;
import t7.C4735n4;
import t7.C4818z4;
import t7.EnumC4707j4;
import t7.EnumC4728m4;
import t7.M5;
import t7.Q5;
import t7.Y5;

/* renamed from: h9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3299a extends f9.e implements InterfaceC3204d {

    /* renamed from: h, reason: collision with root package name */
    static final C3205e f33985h = new C3205e.a().a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ C3299a(i iVar, C1298d c1298d, C3205e c3205e, e eVar) {
        super(iVar, r2);
        Executor a10 = c1298d.a(c3205e.f());
        M5 b10 = Y5.b(k.b());
        C4735n4 c4735n4 = new C4735n4();
        c4735n4.e(k.d() ? EnumC4707j4.TYPE_THICK : EnumC4707j4.TYPE_THIN);
        C4818z4 c4818z4 = new C4818z4();
        c4818z4.e(k.a(c3205e));
        c4735n4.g(c4818z4.i());
        b10.g(Q5.e(c4735n4, 1), EnumC4728m4.ON_DEVICE_FACE_CREATE);
    }

    @Override // g9.InterfaceC3204d
    public final Task D(C3102a c3102a) {
        return super.c(c3102a);
    }

    @Override // g9.InterfaceC3204d
    public final Task x0(C1659f c1659f) {
        return super.b(c1659f);
    }
}
