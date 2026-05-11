package Ta;

import Db.C0792a;
import Db.C0794c;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import c6.C1736a;
import expo.modules.image.Image;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.enums.Priority;
import expo.modules.image.records.CachePolicy;
import expo.modules.image.records.ContentPosition;
import expo.modules.image.records.DecodeFormat;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.ImageTransition;
import expo.modules.image.records.SourceMap;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.EitherOfThree;
import i2.EnumC3313a;
import j6.C3503a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import o2.k;
import o6.C3757a;
import pb.C3862a;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import tb.C4826a;
import vb.C5006a;
import vb.EnumC5010e;
import vc.AbstractC5011a;
import wc.InterfaceC5068n;
import xb.AbstractC5139a;
import xc.C5142C;
import yb.C5189g;
import yb.C5190h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTa/g;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g extends AbstractC5139a {

    public static final class A extends xc.m implements Function2 {
        public A() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
        
            if (r12 != null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(Object[] objArr, pb.m promise) {
            o2.i iVar;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Map map = (Map) objArr[2];
            CachePolicy cachePolicy = (CachePolicy) obj2;
            List list = (List) obj;
            Context w10 = g.this.a().w();
            if (w10 == null) {
                return;
            }
            xc.z zVar = new xc.z();
            xc.y yVar = new xc.y();
            if (map != null) {
                k.a aVar = new k.a();
                for (Map.Entry entry : map.entrySet()) {
                    aVar.a((String) entry.getKey(), (String) entry.getValue());
                }
                iVar = aVar.c();
            }
            iVar = o2.i.f37846b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.request.a l10 = ((com.bumptech.glide.k) com.bumptech.glide.c.v(w10).u(new o2.h((String) it.next(), iVar)).m(100)).l(u.f9653j);
                Intrinsics.checkNotNullExpressionValue(l10, "downsample(...)");
                l.b((com.bumptech.glide.k) l10, cachePolicy == CachePolicy.MEMORY, C1200a.f9542a).A0(new C1201b(yVar, promise, zVar, list)).F0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class B extends xc.m implements Function1 {
        public B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Activity a10 = g.this.a().a();
            if (a10 == null) {
                return Boolean.FALSE;
            }
            com.bumptech.glide.c.d(a10).c();
            return Boolean.TRUE;
        }
    }

    public static final class C extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f9524a = new C();

        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Image.class);
        }
    }

    public static final class D extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f9525a = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SourceMap.class);
        }
    }

    public static final class E extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f9526a = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(ImageLoadOptions.class);
        }
    }

    public static final class F extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f9527a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f9529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(kotlin.coroutines.d dVar, g gVar) {
            super(3, dVar);
            this.f9529c = gVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(Jd.N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            F f10 = new F(dVar, this.f9529c);
            f10.f9528b = objArr;
            return f10.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9527a;
            if (i10 == 0) {
                lc.p.b(obj);
                Object[] objArr = (Object[]) this.f9528b;
                Object obj2 = objArr[0];
                ImageLoadOptions imageLoadOptions = (ImageLoadOptions) objArr[1];
                SourceMap sourceMap = (SourceMap) obj2;
                C3862a a10 = this.f9529c.a();
                if (imageLoadOptions == null) {
                    imageLoadOptions = new ImageLoadOptions(0, 0, 3, null);
                }
                r rVar = new r(a10, sourceMap, imageLoadOptions);
                this.f9527a = 1;
                obj = rVar.b(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    public static final class G extends xc.m implements Function0 {
        public G() {
            super(0);
        }

        public final void a() {
            Context w10 = g.this.a().w();
            if (w10 != null) {
                w10.registerComponentCallbacks(f.f9521a);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class H extends xc.m implements Function0 {
        public H() {
            super(0);
        }

        public final void a() {
            Context w10 = g.this.a().w();
            if (w10 != null) {
                w10.unregisterComponentCallbacks(f.f9521a);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class I extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final I f9532a = new I();

        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(k.class);
        }
    }

    static final class J extends xc.m implements Function1 {
        public J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(((Drawable) ((Image) it[0]).getRef()).getIntrinsicWidth());
        }
    }

    static final class K extends xc.m implements Function1 {
        public K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(((Drawable) ((Image) it[0]).getRef()).getIntrinsicHeight());
        }
    }

    static final class L extends xc.m implements Function1 {
        public L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Resources resources;
            DisplayMetrics displayMetrics;
            Intrinsics.checkNotNullParameter(it, "it");
            Image image = (Image) it[0];
            Context w10 = g.this.a().w();
            float f10 = (w10 == null || (resources = w10.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density;
            return Float.valueOf((androidx.core.graphics.drawable.b.c((Drawable) image.getRef(), 0, 0, null, 7, null) != null ? r8.getDensity() : 1) / (f10 * 160.0f));
        }
    }

    static final class M extends xc.m implements Function1 {
        public M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Image image = (Image) it[0];
            return Boolean.valueOf((image.getRef() instanceof C3503a) || (image.getRef() instanceof C1736a) || (image.getRef() instanceof C3757a));
        }
    }

    static final class N extends xc.m implements Function1 {
        public N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final class O extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final O f9534a = new O();

        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(k.class);
        }
    }

    public static final class P extends xc.m implements Function1 {
        public P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((k) objArr[0]).setIsAnimating(true);
            return Unit.f36324a;
        }
    }

    public static final class Q extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final Q f9535a = new Q();

        public Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(k.class);
        }
    }

    public static final class R extends xc.m implements Function1 {
        public R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((k) objArr[0]).setIsAnimating(false);
            return Unit.f36324a;
        }
    }

    public static final class S extends xc.m implements Function1 {
        public S() {
            super(1);
        }

        public final void a(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            k kVar = (k) it;
            if (kVar.isAttachedToWindow()) {
                kVar.addOnAttachStateChangeListener(new l0(kVar, kVar));
            } else {
                kVar.N();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Unit.f36324a;
        }
    }

    public static final class T extends xc.m implements Function1 {
        public T() {
            super(1);
        }

        public final void a(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            k.P((k) it, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Unit.f36324a;
        }
    }

    public static final class U extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final U f9536a = new U();

        public U() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class V extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final V f9537a = new V();

        public V() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    public static final class W extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final W f9538a = new W();

        public W() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Priority.class);
        }
    }

    public static final class X extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final X f9539a = new X();

        public X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(CachePolicy.class);
        }
    }

    public static final class Y extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final Y f9540a = new Y();

        public Y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class Z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final Z f9541a = new Z();

        public Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: Ta.g$a, reason: case insensitive filesystem */
    static final class C1200a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1200a f9542a = new C1200a();

        C1200a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.bumptech.glide.k invoke(com.bumptech.glide.k customize) {
            Intrinsics.checkNotNullParameter(customize, "$this$customize");
            com.bumptech.glide.request.a k10 = customize.k(k2.j.f36073b);
            Intrinsics.checkNotNullExpressionValue(k10, "diskCacheStrategy(...)");
            return (com.bumptech.glide.k) k10;
        }
    }

    public static final class a0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a0 f9543a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: Ta.g$b, reason: case insensitive filesystem */
    public static final class C1201b implements com.bumptech.glide.request.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ xc.y f9544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ pb.m f9545b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ xc.z f9546c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f9547d;

        C1201b(xc.y yVar, pb.m mVar, xc.z zVar, List list) {
            this.f9544a = yVar;
            this.f9545b = mVar;
            this.f9546c = zVar;
            this.f9547d = list;
        }

        @Override // com.bumptech.glide.request.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, A2.d target, EnumC3313a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            xc.z zVar = this.f9546c;
            int i10 = zVar.f45000a + 1;
            zVar.f45000a = i10;
            if (i10 == this.f9547d.size()) {
                this.f9545b.b(true);
            }
            return true;
        }

        @Override // com.bumptech.glide.request.g
        public boolean g(k2.q qVar, Object obj, A2.d target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            xc.y yVar = this.f9544a;
            if (!yVar.f44999a) {
                yVar.f44999a = true;
                this.f9545b.b(false);
            }
            return true;
        }
    }

    public static final class b0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b0 f9548a = new b0();

        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(DecodeFormat.class);
        }
    }

    /* renamed from: Ta.g$c, reason: case insensitive filesystem */
    static final class C1202c extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1202c f9549a = new C1202c();

        C1202c() {
            super(2);
        }

        public final void a(k view, String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setAccessibilityLabel$expo_image_release(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (String) obj2);
            return Unit.f36324a;
        }
    }

    public static final class c0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c0 f9550a = new c0();

        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            return C5142C.i(EitherOfThree.class, companion.d(C5142C.p(List.class, companion.d(C5142C.o(SourceMap.class)))), companion.d(C5142C.p(SharedRef.class, companion.d(C5142C.o(Drawable.class)))), companion.d(C5142C.p(SharedRef.class, companion.d(C5142C.o(Bitmap.class)))));
        }
    }

    /* renamed from: Ta.g$d, reason: case insensitive filesystem */
    static final class C1203d extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1203d f9551a = new C1203d();

        C1203d() {
            super(2);
        }

        public final void a(k view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setFocusableProp$expo_image_release(Intrinsics.b(bool, Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class d0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d0 f9552a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(ContentFit.class);
        }
    }

    /* renamed from: Ta.g$e, reason: case insensitive filesystem */
    static final class C1204e extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1204e f9553a = new C1204e();

        C1204e() {
            super(2);
        }

        public final void a(k view, Priority priority) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (priority == null) {
                priority = Priority.NORMAL;
            }
            view.setPriority$expo_image_release(priority);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Priority) obj2);
            return Unit.f36324a;
        }
    }

    public static final class e0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e0 f9554a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(ContentFit.class);
        }
    }

    /* renamed from: Ta.g$f, reason: case insensitive filesystem */
    static final class C1205f extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1205f f9555a = new C1205f();

        C1205f() {
            super(2);
        }

        public final void a(k view, CachePolicy cachePolicy) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (cachePolicy == null) {
                cachePolicy = CachePolicy.DISK;
            }
            view.setCachePolicy$expo_image_release(cachePolicy);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (CachePolicy) obj2);
            return Unit.f36324a;
        }
    }

    public static final class f0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f0 f9556a = new f0();

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(ContentPosition.class);
        }
    }

    /* renamed from: Ta.g$g, reason: collision with other inner class name */
    static final class C0182g extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0182g f9557a = new C0182g();

        C0182g() {
            super(2);
        }

        public final void a(k view, String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setRecyclingKey(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (String) obj2);
            return Unit.f36324a;
        }
    }

    public static final class g0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g0 f9558a = new g0();

        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Integer.class);
        }
    }

    /* renamed from: Ta.g$h, reason: case insensitive filesystem */
    static final class C1206h extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1206h f9559a = new C1206h();

        C1206h() {
            super(2);
        }

        public final void a(k view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setAllowDownscaling$expo_image_release(!Intrinsics.b(bool, Boolean.FALSE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class h0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h0 f9560a = new h0();

        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(ImageTransition.class);
        }
    }

    /* renamed from: Ta.g$i, reason: case insensitive filesystem */
    static final class C1207i extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1207i f9561a = new C1207i();

        C1207i() {
            super(2);
        }

        public final void a(k view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setAutoplay$expo_image_release(!Intrinsics.b(bool, Boolean.FALSE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class i0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i0 f9562a = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Integer.class);
        }
    }

    /* renamed from: Ta.g$j, reason: case insensitive filesystem */
    static final class C1208j extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1208j f9563a = new C1208j();

        C1208j() {
            super(2);
        }

        public final void a(k view, DecodeFormat decodeFormat) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (decodeFormat == null) {
                decodeFormat = DecodeFormat.ARGB_8888;
            }
            view.setDecodeFormat$expo_image_release(decodeFormat);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (DecodeFormat) obj2);
            return Unit.f36324a;
        }
    }

    public static final class j0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j0 f9564a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.g(List.class, KTypeProjection.INSTANCE.d(C5142C.o(SourceMap.class)));
        }
    }

    /* renamed from: Ta.g$k, reason: case insensitive filesystem */
    static final class C1209k extends xc.m implements Function2 {
        C1209k() {
            super(2);
        }

        public final void a(k view, EitherOfThree eitherOfThree) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (eitherOfThree == null) {
                view.setSources$expo_image_release(CollectionsKt.j());
                return;
            }
            if (eitherOfThree.e(C5142C.b(List.class))) {
                view.setSources$expo_image_release((List) eitherOfThree.b(C5142C.b(List.class)));
                return;
            }
            if (eitherOfThree.f(C5142C.b(SharedRef.class))) {
                view.setSources$expo_image_release(CollectionsKt.e(new expo.modules.image.records.a((Drawable) ((SharedRef) eitherOfThree.c(C5142C.b(SharedRef.class))).getRef())));
                return;
            }
            Bitmap bitmap = (Bitmap) ((SharedRef) eitherOfThree.g(C5142C.b(SharedRef.class))).getRef();
            Context w10 = g.this.a().w();
            if (w10 == null) {
                throw new expo.modules.kotlin.exception.l();
            }
            view.setSources$expo_image_release(CollectionsKt.e(new expo.modules.image.records.a(new BitmapDrawable(w10.getResources(), bitmap))));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (EitherOfThree) obj2);
            return Unit.f36324a;
        }
    }

    public static final class k0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k0 f9566a = new k0();

        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: Ta.g$l, reason: case insensitive filesystem */
    static final class C1210l extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1210l f9567a = new C1210l();

        C1210l() {
            super(2);
        }

        public final void a(k view, ContentFit contentFit) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (contentFit == null) {
                contentFit = ContentFit.Cover;
            }
            view.setContentFit$expo_image_release(contentFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (ContentFit) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$m, reason: case insensitive filesystem */
    static final class C1211m extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1211m f9570a = new C1211m();

        C1211m() {
            super(2);
        }

        public final void a(k view, ContentFit contentFit) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (contentFit == null) {
                contentFit = ContentFit.ScaleDown;
            }
            view.setPlaceholderContentFit$expo_image_release(contentFit);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (ContentFit) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$n, reason: case insensitive filesystem */
    static final class C1212n extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1212n f9571a = new C1212n();

        C1212n() {
            super(2);
        }

        public final void a(k view, ContentPosition contentPosition) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (contentPosition == null) {
                contentPosition = ContentPosition.INSTANCE.a();
            }
            view.setContentPosition$expo_image_release(contentPosition);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (ContentPosition) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$o, reason: case insensitive filesystem */
    static final class C1213o extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1213o f9572a = new C1213o();

        C1213o() {
            super(2);
        }

        public final void a(k view, Integer num) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            view.setBlurRadius$expo_image_release(num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Integer) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$p, reason: case insensitive filesystem */
    static final class C1214p extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1214p f9573a = new C1214p();

        C1214p() {
            super(2);
        }

        public final void a(k view, ImageTransition imageTransition) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTransition$expo_image_release(imageTransition);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (ImageTransition) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$q, reason: case insensitive filesystem */
    static final class C1215q extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1215q f9574a = new C1215q();

        C1215q() {
            super(2);
        }

        public final void a(k view, Integer num) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTintColor$expo_image_release(num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Integer) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$r, reason: case insensitive filesystem */
    static final class C1216r extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1216r f9575a = new C1216r();

        C1216r() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(k view, List list) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (list == null) {
                list = CollectionsKt.j();
            }
            view.setPlaceholders$expo_image_release(list);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (List) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$s, reason: case insensitive filesystem */
    static final class C1217s extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1217s f9576a = new C1217s();

        C1217s() {
            super(2);
        }

        public final void a(k view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setAccessible$expo_image_release(Intrinsics.b(bool, Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((k) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$t, reason: case insensitive filesystem */
    public static final class C1218t extends xc.m implements Function1 {
        public C1218t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean z10;
            Intrinsics.checkNotNullParameter(it, "it");
            Activity a10 = g.this.a().a();
            if (a10 == null) {
                z10 = false;
            } else {
                com.bumptech.glide.c.d(a10).b();
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: Ta.g$u, reason: case insensitive filesystem */
    public static final class C1219u extends xc.m implements Function2 {
        public C1219u() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) promise;
            Context w10 = g.this.a().w();
            if (w10 == null) {
                return;
            }
            com.bumptech.glide.request.c F02 = ((com.bumptech.glide.k) com.bumptech.glide.c.v(w10).o().B0(new o2.h(str)).W(true)).F0();
            Intrinsics.checkNotNullExpressionValue(F02, "submit(...)");
            try {
                ((File) F02.get()).getAbsolutePath();
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Ta.g$v, reason: case insensitive filesystem */
    public static final class C1220v extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1220v f9579a = new C1220v();

        public C1220v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Ta.g$w, reason: case insensitive filesystem */
    public static final class C1221w extends xc.m implements Function1 {
        public C1221w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            Context w10 = g.this.a().w();
            if (w10 == null) {
                return null;
            }
            com.bumptech.glide.request.c F02 = ((com.bumptech.glide.k) com.bumptech.glide.c.v(w10).o().B0(new o2.h(str)).W(true)).F0();
            Intrinsics.checkNotNullExpressionValue(F02, "submit(...)");
            try {
                return ((File) F02.get()).getAbsolutePath();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: Ta.g$x, reason: case insensitive filesystem */
    public static final class C1222x extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1222x f9581a = new C1222x();

        public C1222x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.p(List.class, KTypeProjection.INSTANCE.d(C5142C.o(String.class)));
        }
    }

    /* renamed from: Ta.g$y, reason: case insensitive filesystem */
    public static final class C1223y extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1223y f9582a = new C1223y();

        public C1223y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(CachePolicy.class);
        }
    }

    /* renamed from: Ta.g$z, reason: case insensitive filesystem */
    public static final class C1224z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1224z f9583a = new C1224z();

        public C1224z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            return C5142C.h(Map.class, companion.d(C5142C.o(String.class)), companion.d(C5142C.o(String.class)));
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        String str;
        Class cls;
        Class cls2;
        Class cls3;
        Boolean bool;
        wb.g eVar;
        xb.b bVar;
        Class cls4;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar2 = new xb.b(this);
            bVar2.o("ExpoImage");
            Map s10 = bVar2.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new G()));
            Map s11 = bVar2.s();
            EnumC5010e enumC5010e2 = EnumC5010e.MODULE_DESTROY;
            s11.put(enumC5010e2, new C5006a(enumC5010e2, new H()));
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(List.class);
            Boolean bool2 = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool2));
            if (c0792a == null) {
                cls = Float.class;
                str = "get";
                cls2 = Image.class;
                c0792a = new C0792a(new Db.M(C5142C.b(List.class), false, C1222x.f9581a));
            } else {
                str = "get";
                cls = Float.class;
                cls2 = Image.class;
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(CachePolicy.class), bool2));
            if (c0792a2 == null) {
                cls3 = CachePolicy.class;
                c0792a2 = new C0792a(new Db.M(C5142C.b(CachePolicy.class), false, C1223y.f9582a));
            } else {
                cls3 = CachePolicy.class;
            }
            kotlin.reflect.d b11 = C5142C.b(Map.class);
            Boolean bool3 = Boolean.TRUE;
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(b11, bool3));
            if (c0792a3 == null) {
                bool = bool3;
                c0792a3 = new C0792a(new Db.M(C5142C.b(Map.class), true, C1224z.f9583a));
            } else {
                bool = bool3;
            }
            bVar2.k().put("prefetch", new wb.f("prefetch", new C0792a[]{c0792a, c0792a2, c0792a3}, new A()));
            wb.d a10 = bVar2.a("loadAsync");
            String b12 = a10.b();
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(SourceMap.class), bool2));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new Db.M(C5142C.b(SourceMap.class), false, D.f9525a));
            }
            Boolean bool4 = bool;
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ImageLoadOptions.class), bool4));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new Db.M(C5142C.b(ImageLoadOptions.class), true, E.f9526a));
            }
            a10.c(new wb.o(b12, new C0792a[]{c0792a4, c0792a5}, new F(null, this)));
            kotlin.reflect.d b13 = C5142C.b(cls2);
            String simpleName = AbstractC5011a.b(b13).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls2), bool2));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new Db.M(C5142C.b(cls2), false, C.f9524a));
            }
            C4826a c4826a = new C4826a(simpleName, b13, c0792a6);
            C5190h c5190h = new C5190h(c4826a.p().d(), "width");
            C0792a[] c0792aArr = {new C0792a(c5190h.d())};
            Db.U u10 = Db.U.f1425a;
            Db.T t10 = (Db.T) u10.a().get(C5142C.b(Integer.class));
            if (t10 == null) {
                t10 = new Db.T(C5142C.b(Integer.class));
                u10.a().put(C5142C.b(Integer.class), t10);
            }
            String str2 = str;
            wb.q qVar = new wb.q(str2, c0792aArr, t10, new J());
            qVar.k(c5190h.d());
            qVar.j(true);
            c5190h.b(qVar);
            c4826a.m().put("width", c5190h);
            C5190h c5190h2 = new C5190h(c4826a.p().d(), "height");
            C0792a[] c0792aArr2 = {new C0792a(c5190h2.d())};
            Db.T t11 = (Db.T) u10.a().get(C5142C.b(Integer.class));
            if (t11 == null) {
                t11 = new Db.T(C5142C.b(Integer.class));
                u10.a().put(C5142C.b(Integer.class), t11);
            }
            wb.q qVar2 = new wb.q(str2, c0792aArr2, t11, new K());
            qVar2.k(c5190h2.d());
            qVar2.j(true);
            c5190h2.b(qVar2);
            c4826a.m().put("height", c5190h2);
            C5190h c5190h3 = new C5190h(c4826a.p().d(), "scale");
            C0792a[] c0792aArr3 = {new C0792a(c5190h3.d())};
            Db.T t12 = (Db.T) u10.a().get(C5142C.b(cls));
            if (t12 == null) {
                t12 = new Db.T(C5142C.b(cls));
                u10.a().put(C5142C.b(cls), t12);
            }
            wb.q qVar3 = new wb.q(str2, c0792aArr3, t12, new L());
            qVar3.k(c5190h3.d());
            qVar3.j(true);
            c5190h3.b(qVar3);
            c4826a.m().put("scale", c5190h3);
            C5190h c5190h4 = new C5190h(c4826a.p().d(), "isAnimated");
            C0792a[] c0792aArr4 = {new C0792a(c5190h4.d())};
            Db.T t13 = (Db.T) u10.a().get(C5142C.b(Boolean.class));
            if (t13 == null) {
                t13 = new Db.T(C5142C.b(Boolean.class));
                u10.a().put(C5142C.b(Boolean.class), t13);
            }
            wb.q qVar4 = new wb.q(str2, c0792aArr4, t13, new M());
            qVar4.k(c5190h4.d());
            qVar4.j(true);
            c5190h4.b(qVar4);
            c4826a.m().put("isAnimated", c5190h4);
            C5189g c5189g = new C5189g("mediaType");
            C0792a[] c0792aArr5 = new C0792a[0];
            Db.T t14 = (Db.T) u10.a().get(C5142C.b(Object.class));
            if (t14 == null) {
                t14 = new Db.T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t14);
            }
            c5189g.b(new wb.q(str2, c0792aArr5, t14, new N()));
            c4826a.m().put("mediaType", c5189g);
            bVar2.r().add(c4826a.o());
            wb.e eVar2 = new wb.e("clearMemoryCache", new C0792a[0], new B());
            bVar2.k().put("clearMemoryCache", eVar2);
            eVar2.m(wb.l.MAIN);
            C0792a[] c0792aArr6 = new C0792a[0];
            C1218t c1218t = new C1218t();
            Class cls5 = Integer.TYPE;
            bVar2.k().put("clearDiskCache", Intrinsics.b(Boolean.class, cls5) ? new wb.k("clearDiskCache", c0792aArr6, c1218t) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("clearDiskCache", c0792aArr6, c1218t) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("clearDiskCache", c0792aArr6, c1218t) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("clearDiskCache", c0792aArr6, c1218t) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("clearDiskCache", c0792aArr6, c1218t) : new wb.e("clearDiskCache", c0792aArr6, c1218t));
            if (Intrinsics.b(String.class, pb.m.class)) {
                eVar = new wb.f("getCachePathAsync", new C0792a[0], new C1219u());
            } else {
                C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool2));
                if (c0792a7 == null) {
                    c0792a7 = new C0792a(new Db.M(C5142C.b(String.class), false, C1220v.f9579a));
                }
                eVar = new wb.e("getCachePathAsync", new C0792a[]{c0792a7}, new C1221w());
            }
            bVar2.k().put("getCachePathAsync", eVar);
            kotlin.reflect.d b14 = C5142C.b(k.class);
            if (bVar2.t() != null) {
                throw new IllegalArgumentException("The module definition may have exported only one view manager.");
            }
            expo.modules.kotlin.views.m mVar = new expo.modules.kotlin.views.m(b14, new Db.M(C5142C.b(k.class), false, I.f9532a, 2, null));
            Jb.b.g(mVar);
            mVar.a("onLoadStart", "onProgress", "onError", "onLoad", "onDisplay");
            C1209k c1209k = new C1209k();
            Map g10 = mVar.g();
            C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(EitherOfThree.class), bool4));
            if (c0792a8 == null) {
                bVar = bVar2;
                cls4 = cls5;
                c0792a8 = new C0792a(new Db.M(C5142C.b(EitherOfThree.class), true, c0.f9550a));
            } else {
                bVar = bVar2;
                cls4 = cls5;
            }
            g10.put("source", new expo.modules.kotlin.views.c("source", c0792a8, c1209k));
            C1210l c1210l = C1210l.f9567a;
            Map g11 = mVar.g();
            C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ContentFit.class), bool4));
            if (c0792a9 == null) {
                c0792a9 = new C0792a(new Db.M(C5142C.b(ContentFit.class), true, d0.f9552a));
            }
            g11.put("contentFit", new expo.modules.kotlin.views.c("contentFit", c0792a9, c1210l));
            C1211m c1211m = C1211m.f9570a;
            Map g12 = mVar.g();
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ContentFit.class), bool4));
            if (c0792a10 == null) {
                c0792a10 = new C0792a(new Db.M(C5142C.b(ContentFit.class), true, e0.f9554a));
            }
            g12.put("placeholderContentFit", new expo.modules.kotlin.views.c("placeholderContentFit", c0792a10, c1211m));
            C1212n c1212n = C1212n.f9571a;
            Map g13 = mVar.g();
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ContentPosition.class), bool4));
            if (c0792a11 == null) {
                c0792a11 = new C0792a(new Db.M(C5142C.b(ContentPosition.class), true, f0.f9556a));
            }
            g13.put("contentPosition", new expo.modules.kotlin.views.c("contentPosition", c0792a11, c1212n));
            C1213o c1213o = C1213o.f9572a;
            Map g14 = mVar.g();
            C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool4));
            if (c0792a12 == null) {
                c0792a12 = new C0792a(new Db.M(C5142C.b(Integer.class), true, g0.f9558a));
            }
            g14.put("blurRadius", new expo.modules.kotlin.views.c("blurRadius", c0792a12, c1213o));
            C1214p c1214p = C1214p.f9573a;
            Map g15 = mVar.g();
            C0792a c0792a13 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ImageTransition.class), bool4));
            if (c0792a13 == null) {
                c0792a13 = new C0792a(new Db.M(C5142C.b(ImageTransition.class), true, h0.f9560a));
            }
            g15.put("transition", new expo.modules.kotlin.views.c("transition", c0792a13, c1214p));
            C1215q c1215q = C1215q.f9574a;
            Map g16 = mVar.g();
            C0792a c0792a14 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool4));
            if (c0792a14 == null) {
                c0792a14 = new C0792a(new Db.M(C5142C.b(Integer.class), true, i0.f9562a));
            }
            g16.put("tintColor", new expo.modules.kotlin.views.c("tintColor", c0792a14, c1215q));
            C1216r c1216r = C1216r.f9575a;
            Map g17 = mVar.g();
            C0792a c0792a15 = (C0792a) c0794c.a().get(new Pair(C5142C.b(List.class), bool4));
            if (c0792a15 == null) {
                c0792a15 = new C0792a(new Db.M(C5142C.b(List.class), true, j0.f9564a));
            }
            g17.put("placeholder", new expo.modules.kotlin.views.c("placeholder", c0792a15, c1216r));
            C1217s c1217s = C1217s.f9576a;
            Map g18 = mVar.g();
            C0792a c0792a16 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Boolean.class), bool4));
            if (c0792a16 == null) {
                c0792a16 = new C0792a(new Db.M(C5142C.b(Boolean.class), true, k0.f9566a));
            }
            g18.put("accessible", new expo.modules.kotlin.views.c("accessible", c0792a16, c1217s));
            C1202c c1202c = C1202c.f9549a;
            Map g19 = mVar.g();
            C0792a c0792a17 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool4));
            if (c0792a17 == null) {
                c0792a17 = new C0792a(new Db.M(C5142C.b(String.class), true, U.f9536a));
            }
            g19.put("accessibilityLabel", new expo.modules.kotlin.views.c("accessibilityLabel", c0792a17, c1202c));
            C1203d c1203d = C1203d.f9551a;
            Map g20 = mVar.g();
            C0792a c0792a18 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Boolean.class), bool4));
            if (c0792a18 == null) {
                c0792a18 = new C0792a(new Db.M(C5142C.b(Boolean.class), true, V.f9537a));
            }
            g20.put("focusable", new expo.modules.kotlin.views.c("focusable", c0792a18, c1203d));
            C1204e c1204e = C1204e.f9553a;
            Map g21 = mVar.g();
            C0792a c0792a19 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Priority.class), bool4));
            if (c0792a19 == null) {
                c0792a19 = new C0792a(new Db.M(C5142C.b(Priority.class), true, W.f9538a));
            }
            g21.put("priority", new expo.modules.kotlin.views.c("priority", c0792a19, c1204e));
            C1205f c1205f = C1205f.f9555a;
            Map g22 = mVar.g();
            C0792a c0792a20 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool4));
            if (c0792a20 == null) {
                c0792a20 = new C0792a(new Db.M(C5142C.b(cls3), true, X.f9539a));
            }
            g22.put("cachePolicy", new expo.modules.kotlin.views.c("cachePolicy", c0792a20, c1205f));
            C0182g c0182g = C0182g.f9557a;
            Map g23 = mVar.g();
            C0792a c0792a21 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool4));
            if (c0792a21 == null) {
                c0792a21 = new C0792a(new Db.M(C5142C.b(String.class), true, Y.f9540a));
            }
            g23.put("recyclingKey", new expo.modules.kotlin.views.c("recyclingKey", c0792a21, c0182g));
            C1206h c1206h = C1206h.f9559a;
            Map g24 = mVar.g();
            C0792a c0792a22 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Boolean.class), bool4));
            if (c0792a22 == null) {
                c0792a22 = new C0792a(new Db.M(C5142C.b(Boolean.class), true, Z.f9541a));
            }
            g24.put("allowDownscaling", new expo.modules.kotlin.views.c("allowDownscaling", c0792a22, c1206h));
            C1207i c1207i = C1207i.f9561a;
            Map g25 = mVar.g();
            C0792a c0792a23 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Boolean.class), bool4));
            if (c0792a23 == null) {
                c0792a23 = new C0792a(new Db.M(C5142C.b(Boolean.class), true, a0.f9543a));
            }
            g25.put("autoplay", new expo.modules.kotlin.views.c("autoplay", c0792a23, c1207i));
            C1208j c1208j = C1208j.f9563a;
            Map g26 = mVar.g();
            C0792a c0792a24 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DecodeFormat.class), bool4));
            if (c0792a24 == null) {
                c0792a24 = new C0792a(new Db.M(C5142C.b(DecodeFormat.class), true, b0.f9548a));
            }
            g26.put("decodeFormat", new expo.modules.kotlin.views.c("decodeFormat", c0792a24, c1208j));
            C0792a c0792a25 = (C0792a) c0794c.a().get(new Pair(C5142C.b(k.class), bool2));
            if (c0792a25 == null) {
                c0792a25 = new C0792a(new Db.M(C5142C.b(k.class), false, O.f9534a));
            }
            C0792a[] c0792aArr7 = {c0792a25};
            P p10 = new P();
            Class cls6 = cls4;
            mVar.f().put("startAnimating", Intrinsics.b(Unit.class, cls6) ? new wb.k("startAnimating", c0792aArr7, p10) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("startAnimating", c0792aArr7, p10) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("startAnimating", c0792aArr7, p10) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("startAnimating", c0792aArr7, p10) : Intrinsics.b(Unit.class, String.class) ? new wb.m("startAnimating", c0792aArr7, p10) : new wb.e("startAnimating", c0792aArr7, p10));
            C0792a c0792a26 = (C0792a) c0794c.a().get(new Pair(C5142C.b(k.class), bool2));
            if (c0792a26 == null) {
                c0792a26 = new C0792a(new Db.M(C5142C.b(k.class), false, Q.f9535a));
            }
            C0792a[] c0792aArr8 = {c0792a26};
            R r10 = new R();
            mVar.f().put("stopAnimating", Intrinsics.b(Unit.class, cls6) ? new wb.k("stopAnimating", c0792aArr8, r10) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("stopAnimating", c0792aArr8, r10) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("stopAnimating", c0792aArr8, r10) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("stopAnimating", c0792aArr8, r10) : Intrinsics.b(Unit.class, String.class) ? new wb.m("stopAnimating", c0792aArr8, r10) : new wb.e("stopAnimating", c0792aArr8, r10));
            mVar.k(new T());
            mVar.j(new S());
            xb.b bVar3 = bVar;
            bVar3.u(mVar.d());
            xb.c q10 = bVar3.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }

    public static final class l0 implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f9568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f9569b;

        public l0(View view, k kVar) {
            this.f9568a = view;
            this.f9569b = kVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f9568a.removeOnAttachStateChangeListener(this);
            this.f9569b.N();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
