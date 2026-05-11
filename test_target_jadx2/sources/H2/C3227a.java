package h2;

import D2.c;
import D2.k;
import Td.D;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import i2.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import o2.h;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3227a implements d, InterfaceC1230f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1229e.a f33956a;

    /* renamed from: b, reason: collision with root package name */
    private final h f33957b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f33958c;

    /* renamed from: d, reason: collision with root package name */
    private G f33959d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f33960e;

    /* renamed from: f, reason: collision with root package name */
    private volatile InterfaceC1229e f33961f;

    public C3227a(InterfaceC1229e.a aVar, h hVar) {
        this.f33956a = aVar;
        this.f33957b = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream = this.f33958c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        G g10 = this.f33959d;
        if (g10 != null) {
            g10.close();
        }
        this.f33960e = null;
    }

    @Override // Td.InterfaceC1230f
    public void c(InterfaceC1229e interfaceC1229e, F f10) {
        this.f33959d = f10.b();
        if (!f10.isSuccessful()) {
            this.f33960e.c(new e(f10.r(), f10.f()));
            return;
        }
        InputStream b10 = c.b(this.f33959d.a(), ((G) k.d(this.f33959d)).e());
        this.f33958c = b10;
        this.f33960e.d(b10);
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        InterfaceC1229e interfaceC1229e = this.f33961f;
        if (interfaceC1229e != null) {
            interfaceC1229e.cancel();
        }
    }

    @Override // Td.InterfaceC1230f
    public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f33960e.c(iOException);
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.h hVar, d.a aVar) {
        D.a x10 = new D.a().x(this.f33957b.h());
        for (Map.Entry entry : this.f33957b.e().entrySet()) {
            x10.a((String) entry.getKey(), (String) entry.getValue());
        }
        D b10 = x10.b();
        this.f33960e = aVar;
        this.f33961f = this.f33956a.a(b10);
        this.f33961f.g1(this);
    }
}
