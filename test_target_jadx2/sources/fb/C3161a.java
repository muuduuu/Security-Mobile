package fb;

import Jd.AbstractC0909t0;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import db.AbstractC3017l;
import db.C3011f;
import db.C3013h;
import db.C3020o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC3618a;
import lc.p;
import pc.AbstractC3868b;
import xc.m;
import zb.InterfaceC5270a;

/* renamed from: fb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3161a implements fb.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5270a f32942a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32943b;

    /* renamed from: fb.a$a, reason: collision with other inner class name */
    static final class C0482a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f32944a;

        /* renamed from: b, reason: collision with root package name */
        Object f32945b;

        /* renamed from: c, reason: collision with root package name */
        Object f32946c;

        /* renamed from: d, reason: collision with root package name */
        Object f32947d;

        /* renamed from: e, reason: collision with root package name */
        Object f32948e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f32949f;

        /* renamed from: h, reason: collision with root package name */
        int f32951h;

        C0482a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32949f = obj;
            this.f32951h |= Integer.MIN_VALUE;
            return C3161a.this.a(null, null, null, this);
        }
    }

    /* renamed from: fb.a$b */
    public static final class b extends fb.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f32952d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3161a f32953e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, Bitmap bitmap, C3161a c3161a, int i10, int i11) {
            super(i10, i11, file);
            this.f32952d = bitmap;
            this.f32953e = c3161a;
        }

        @Override // fb.c
        public Object b(ContentResolver contentResolver, kotlin.coroutines.d dVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f32952d.compress(Bitmap.CompressFormat.JPEG, this.f32953e.f32943b, byteArrayOutputStream);
            return byteArrayOutputStream;
        }
    }

    /* renamed from: fb.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32954a;

        /* renamed from: c, reason: collision with root package name */
        int f32956c;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32954a = obj;
            this.f32956c |= Integer.MIN_VALUE;
            return C3161a.this.e(null, this);
        }
    }

    /* renamed from: fb.a$d */
    static final class d extends m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f32958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Uri uri) {
            super(0);
            this.f32958b = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            InterfaceC3618a q10 = C3161a.this.f32942a.a().q();
            Future b10 = q10 != null ? q10.b(this.f32958b.toString()) : null;
            if (b10 == null) {
                throw new C3020o("ImageLoader");
            }
            try {
                return (Bitmap) b10.get();
            } catch (ExecutionException e10) {
                throw new C3011f(v0.b.a(this.f32958b), e10);
            }
        }
    }

    /* renamed from: fb.a$e */
    static final class e extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f32959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f32960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap.CompressFormat f32961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3161a f32962d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, C3161a c3161a) {
            super(0);
            this.f32959a = file;
            this.f32960b = bitmap;
            this.f32961c = compressFormat;
            this.f32962d = c3161a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f32959a);
                try {
                    boolean compress = this.f32960b.compress(this.f32961c, this.f32962d.f32943b, fileOutputStream);
                    kotlin.io.c.a(fileOutputStream, null);
                    return Boolean.valueOf(compress);
                } finally {
                }
            } catch (FileNotFoundException e10) {
                throw new C3013h(this.f32959a, e10);
            }
        }
    }

    public C3161a(InterfaceC5270a appContextProvider, double d10) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.f32942a = appContextProvider;
        this.f32943b = (int) (d10 * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Uri uri, kotlin.coroutines.d dVar) {
        c cVar;
        int i10;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.f32956c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f32956c = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f32954a;
                Object e10 = AbstractC3868b.e();
                i10 = cVar.f32956c;
                if (i10 != 0) {
                    p.b(obj);
                    d dVar2 = new d(uri);
                    cVar.f32956c = 1;
                    obj = AbstractC0909t0.c(null, dVar2, cVar, 1, null);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                Intrinsics.d(obj);
                return obj;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f32954a;
        Object e102 = AbstractC3868b.e();
        i10 = cVar.f32956c;
        if (i10 != 0) {
        }
        Intrinsics.d(obj2);
        return obj2;
    }

    private final Object f(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, kotlin.coroutines.d dVar) {
        return AbstractC0909t0.c(null, new e(file, bitmap, compressFormat, this), dVar, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // fb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Uri uri, File file, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        C0482a c0482a;
        Object e10;
        int i10;
        C3161a c3161a;
        Bitmap bitmap;
        Bitmap.CompressFormat m10;
        Uri uri2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        File file2;
        C3161a c3161a2;
        if (dVar instanceof C0482a) {
            c0482a = (C0482a) dVar;
            int i11 = c0482a.f32951h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0482a.f32951h = i11 - Integer.MIN_VALUE;
                Object obj = c0482a.f32949f;
                e10 = AbstractC3868b.e();
                i10 = c0482a.f32951h;
                if (i10 != 0) {
                    p.b(obj);
                    c0482a.f32944a = this;
                    c0482a.f32945b = uri;
                    c0482a.f32946c = file;
                    c0482a.f32947d = contentResolver;
                    c0482a.f32951h = 1;
                    obj = e(uri, c0482a);
                    if (obj == e10) {
                        return e10;
                    }
                    c3161a = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Bitmap bitmap4 = (Bitmap) c0482a.f32946c;
                            File file3 = (File) c0482a.f32945b;
                            C3161a c3161a3 = (C3161a) c0482a.f32944a;
                            p.b(obj);
                            bitmap3 = bitmap4;
                            file2 = file3;
                            c3161a2 = c3161a3;
                            return new b(file2, bitmap3, c3161a2, bitmap3.getWidth(), bitmap3.getHeight());
                        }
                        bitmap2 = (Bitmap) c0482a.f32948e;
                        ContentResolver contentResolver2 = (ContentResolver) c0482a.f32947d;
                        File file4 = (File) c0482a.f32946c;
                        Uri uri3 = (Uri) c0482a.f32945b;
                        C3161a c3161a4 = (C3161a) c0482a.f32944a;
                        p.b(obj);
                        uri2 = uri3;
                        c3161a = c3161a4;
                        contentResolver = contentResolver2;
                        file = file4;
                        c0482a.f32944a = c3161a;
                        c0482a.f32945b = file;
                        c0482a.f32946c = bitmap2;
                        c0482a.f32947d = null;
                        c0482a.f32948e = null;
                        c0482a.f32951h = 3;
                        if (AbstractC3017l.a(uri2, file, contentResolver, c0482a) != e10) {
                            return e10;
                        }
                        bitmap3 = bitmap2;
                        file2 = file;
                        c3161a2 = c3161a;
                        return new b(file2, bitmap3, c3161a2, bitmap3.getWidth(), bitmap3.getHeight());
                    }
                    contentResolver = (ContentResolver) c0482a.f32947d;
                    file = (File) c0482a.f32946c;
                    uri = (Uri) c0482a.f32945b;
                    c3161a = (C3161a) c0482a.f32944a;
                    p.b(obj);
                }
                bitmap = (Bitmap) obj;
                m10 = AbstractC3017l.m(file);
                c0482a.f32944a = c3161a;
                c0482a.f32945b = uri;
                c0482a.f32946c = file;
                c0482a.f32947d = contentResolver;
                c0482a.f32948e = bitmap;
                c0482a.f32951h = 2;
                if (c3161a.f(bitmap, file, m10, c0482a) != e10) {
                    return e10;
                }
                uri2 = uri;
                bitmap2 = bitmap;
                c0482a.f32944a = c3161a;
                c0482a.f32945b = file;
                c0482a.f32946c = bitmap2;
                c0482a.f32947d = null;
                c0482a.f32948e = null;
                c0482a.f32951h = 3;
                if (AbstractC3017l.a(uri2, file, contentResolver, c0482a) != e10) {
                }
            }
        }
        c0482a = new C0482a(dVar);
        Object obj2 = c0482a.f32949f;
        e10 = AbstractC3868b.e();
        i10 = c0482a.f32951h;
        if (i10 != 0) {
        }
        bitmap = (Bitmap) obj2;
        m10 = AbstractC3017l.m(file);
        c0482a.f32944a = c3161a;
        c0482a.f32945b = uri;
        c0482a.f32946c = file;
        c0482a.f32947d = contentResolver;
        c0482a.f32948e = bitmap;
        c0482a.f32951h = 2;
        if (c3161a.f(bitmap, file, m10, c0482a) != e10) {
        }
    }
}
