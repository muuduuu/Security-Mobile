package com.bumptech.glide;

import D2.f;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.d;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.module.AppGlideModule;
import f2.InterfaceC3137a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;
import o2.C3742a;
import o2.C3743b;
import o2.C3744c;
import o2.C3745d;
import o2.C3746e;
import o2.g;
import o2.l;
import o2.o;
import o2.s;
import o2.u;
import o2.v;
import o2.w;
import o2.x;
import o2.y;
import p2.C3787a;
import p2.C3788b;
import p2.C3789c;
import p2.C3790d;
import p2.g;
import q1.AbstractC3901a;
import r2.C4001B;
import r2.C4002a;
import r2.C4003b;
import r2.C4004c;
import r2.C4010i;
import r2.D;
import r2.E;
import r2.G;
import r2.I;
import r2.t;
import r2.w;
import r2.z;
import s2.C4309a;
import t2.C4612h;
import t2.C4616l;
import t2.C4617m;
import u2.C4862a;
import v2.C4911a;
import v2.C4913c;
import v2.C4914d;
import v2.C4918h;
import v2.C4920j;
import w2.C5028a;
import w2.C5029b;
import w2.C5030c;
import w2.C5031d;
import y2.InterfaceC5164a;

/* loaded from: classes.dex */
abstract class j {

    class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f20260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f20261c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AppGlideModule f20262d;

        a(c cVar, List list, AppGlideModule appGlideModule) {
            this.f20260b = cVar;
            this.f20261c = list;
            this.f20262d = appGlideModule;
        }

        @Override // D2.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i get() {
            if (this.f20259a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            AbstractC3901a.c("Glide registry");
            this.f20259a = true;
            try {
                return j.a(this.f20260b, this.f20261c, this.f20262d);
            } finally {
                this.f20259a = false;
                AbstractC3901a.f();
            }
        }
    }

    static i a(c cVar, List list, AppGlideModule appGlideModule) {
        InterfaceC3602d g10 = cVar.g();
        InterfaceC3600b f10 = cVar.f();
        Context applicationContext = cVar.j().getApplicationContext();
        f f11 = cVar.j().f();
        i iVar = new i();
        b(applicationContext, iVar, g10, f10, f11);
        c(applicationContext, cVar, iVar, list, appGlideModule);
        return iVar;
    }

    private static void b(Context context, i iVar, InterfaceC3602d interfaceC3602d, InterfaceC3600b interfaceC3600b, f fVar) {
        i2.j c4010i;
        i2.j e10;
        Class cls;
        i iVar2;
        iVar.r(new r2.m());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            iVar.r(new w());
        }
        Resources resources = context.getResources();
        List g10 = iVar.g();
        C4911a c4911a = new C4911a(context, g10, interfaceC3602d, interfaceC3600b);
        i2.j m10 = I.m(interfaceC3602d);
        t tVar = new t(iVar.g(), resources.getDisplayMetrics(), interfaceC3602d, interfaceC3600b);
        if (i10 < 28 || !fVar.a(d.b.class)) {
            c4010i = new C4010i(tVar);
            e10 = new E(tVar, interfaceC3600b);
        } else {
            e10 = new z();
            c4010i = new r2.k();
        }
        if (i10 >= 28) {
            iVar.e("Animation", InputStream.class, Drawable.class, C4612h.f(g10, interfaceC3600b));
            iVar.e("Animation", ByteBuffer.class, Drawable.class, C4612h.a(g10, interfaceC3600b));
        }
        C4616l c4616l = new C4616l(context);
        C4004c c4004c = new C4004c(interfaceC3600b);
        C5028a c5028a = new C5028a();
        C5031d c5031d = new C5031d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.a(ByteBuffer.class, new C3744c()).a(InputStream.class, new u(interfaceC3600b)).e("Bitmap", ByteBuffer.class, Bitmap.class, c4010i).e("Bitmap", InputStream.class, Bitmap.class, e10);
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C4001B(tVar));
        }
        iVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, I.c(interfaceC3602d));
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m10).d(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new G()).b(Bitmap.class, c4004c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C4002a(resources, c4010i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C4002a(resources, e10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C4002a(resources, m10)).b(BitmapDrawable.class, new C4003b(interfaceC3602d, c4004c)).e("Animation", InputStream.class, C4913c.class, new C4920j(g10, c4911a, interfaceC3600b)).e("Animation", ByteBuffer.class, C4913c.class, c4911a).b(C4913c.class, new C4914d()).d(InterfaceC3137a.class, InterfaceC3137a.class, w.a.a()).e("Bitmap", InterfaceC3137a.class, Bitmap.class, new C4918h(interfaceC3602d)).c(Uri.class, Drawable.class, c4616l).c(Uri.class, Bitmap.class, new D(c4616l, interfaceC3602d)).s(new C4309a.C0610a()).d(File.class, ByteBuffer.class, new C3745d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new C4862a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, w.a.a()).s(new k.a(interfaceC3600b));
        if (ParcelFileDescriptorRewinder.c()) {
            cls = BitmapDrawable.class;
            iVar2 = iVar;
            iVar2.s(new ParcelFileDescriptorRewinder.a());
        } else {
            cls = BitmapDrawable.class;
            iVar2 = iVar;
        }
        o g11 = o2.f.g(context);
        o c10 = o2.f.c(context);
        o e11 = o2.f.e(context);
        Class cls2 = Integer.TYPE;
        iVar2.d(cls2, InputStream.class, g11).d(Integer.class, InputStream.class, g11).d(cls2, AssetFileDescriptor.class, c10).d(Integer.class, AssetFileDescriptor.class, c10).d(cls2, Drawable.class, e11).d(Integer.class, Drawable.class, e11).d(Uri.class, InputStream.class, o2.t.f(context)).d(Uri.class, AssetFileDescriptor.class, o2.t.e(context));
        s.c cVar = new s.c(resources);
        s.a aVar = new s.a(resources);
        s.b bVar = new s.b(resources);
        Class cls3 = cls;
        iVar2.d(Integer.class, Uri.class, cVar).d(cls2, Uri.class, cVar).d(Integer.class, AssetFileDescriptor.class, aVar).d(cls2, AssetFileDescriptor.class, aVar).d(Integer.class, InputStream.class, bVar).d(cls2, InputStream.class, bVar);
        iVar2.d(String.class, InputStream.class, new C3746e.c()).d(Uri.class, InputStream.class, new C3746e.c()).d(String.class, InputStream.class, new v.c()).d(String.class, ParcelFileDescriptor.class, new v.b()).d(String.class, AssetFileDescriptor.class, new v.a()).d(Uri.class, InputStream.class, new C3742a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new C3742a.b(context.getAssets())).d(Uri.class, InputStream.class, new C3788b.a(context)).d(Uri.class, InputStream.class, new C3789c.a(context));
        if (i10 >= 29) {
            iVar2.d(Uri.class, InputStream.class, new C3790d.c(context));
            iVar2.d(Uri.class, ParcelFileDescriptor.class, new C3790d.b(context));
        }
        iVar2.d(Uri.class, InputStream.class, new x.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver)).d(Uri.class, InputStream.class, new y.a()).d(URL.class, InputStream.class, new g.a()).d(Uri.class, File.class, new l.a(context)).d(o2.h.class, InputStream.class, new C3787a.C0589a()).d(byte[].class, ByteBuffer.class, new C3743b.a()).d(byte[].class, InputStream.class, new C3743b.d()).d(Uri.class, Uri.class, w.a.a()).d(Drawable.class, Drawable.class, w.a.a()).c(Drawable.class, Drawable.class, new C4617m()).t(Bitmap.class, cls3, new C5029b(resources)).t(Bitmap.class, byte[].class, c5028a).t(Drawable.class, byte[].class, new C5030c(interfaceC3602d, c5028a, c5031d)).t(C4913c.class, byte[].class, c5031d);
        i2.j d10 = I.d(interfaceC3602d);
        iVar2.c(ByteBuffer.class, Bitmap.class, d10);
        iVar2.c(ByteBuffer.class, cls3, new C4002a(resources, d10));
    }

    private static void c(Context context, c cVar, i iVar, List list, AppGlideModule appGlideModule) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5164a interfaceC5164a = (InterfaceC5164a) it.next();
            try {
                interfaceC5164a.b(context, cVar, iVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC5164a.getClass().getName(), e10);
            }
        }
        if (appGlideModule != null) {
            appGlideModule.a(context, cVar, iVar);
        }
    }

    static f.b d(c cVar, List list, AppGlideModule appGlideModule) {
        return new a(cVar, list, appGlideModule);
    }
}
