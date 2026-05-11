package fb;

import android.content.ContentResolver;
import android.net.Uri;
import db.AbstractC3017l;
import java.io.File;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public final class e implements d {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f32975a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32976b;

        /* renamed from: d, reason: collision with root package name */
        int f32978d;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32976b = obj;
            this.f32978d |= Integer.MIN_VALUE;
            return e.this.a(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // fb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Uri uri, File file, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f32978d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f32978d = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f32976b;
                Object e10 = AbstractC3868b.e();
                i10 = aVar.f32978d;
                if (i10 != 0) {
                    p.b(obj);
                    aVar.f32975a = file;
                    aVar.f32978d = 1;
                    if (AbstractC3017l.b(uri, file, contentResolver, aVar) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (File) aVar.f32975a;
                    p.b(obj);
                }
                C3162b c3162b = new C3162b(file);
                return new c(c3162b.d(), c3162b.b(), file);
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f32976b;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f32978d;
        if (i10 != 0) {
        }
        C3162b c3162b2 = new C3162b(file);
        return new c(c3162b2.d(), c3162b2.b(), file);
    }
}
