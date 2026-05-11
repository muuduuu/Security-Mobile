package N0;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* loaded from: classes.dex */
class c extends a {

    /* renamed from: b, reason: collision with root package name */
    private Context f6524b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f6525c;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f6524b = context;
        this.f6525c = uri;
    }

    @Override // N0.a
    public boolean a() {
        return b.a(this.f6524b, this.f6525c);
    }

    @Override // N0.a
    public boolean b() {
        return b.b(this.f6524b, this.f6525c);
    }

    @Override // N0.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // N0.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // N0.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f6524b.getContentResolver(), this.f6525c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // N0.a
    public boolean f() {
        return b.d(this.f6524b, this.f6525c);
    }

    @Override // N0.a
    public String i() {
        return b.e(this.f6524b, this.f6525c);
    }

    @Override // N0.a
    public Uri j() {
        return this.f6525c;
    }

    @Override // N0.a
    public boolean k() {
        return b.g(this.f6524b, this.f6525c);
    }

    @Override // N0.a
    public boolean l() {
        return b.h(this.f6524b, this.f6525c);
    }

    @Override // N0.a
    public a[] m() {
        throw new UnsupportedOperationException();
    }
}
