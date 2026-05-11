package r2;

import android.graphics.drawable.BitmapDrawable;
import i2.EnumC3315c;
import java.io.File;
import l2.InterfaceC3602d;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4003b implements i2.k {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f39147a;

    /* renamed from: b, reason: collision with root package name */
    private final i2.k f39148b;

    public C4003b(InterfaceC3602d interfaceC3602d, i2.k kVar) {
        this.f39147a = interfaceC3602d;
        this.f39148b = kVar;
    }

    @Override // i2.k
    public EnumC3315c a(i2.h hVar) {
        return this.f39148b.a(hVar);
    }

    @Override // i2.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(k2.v vVar, File file, i2.h hVar) {
        return this.f39148b.b(new C4008g(((BitmapDrawable) vVar.get()).getBitmap(), this.f39147a), file, hVar);
    }
}
