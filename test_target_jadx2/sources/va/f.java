package va;

import Db.C0792a;
import Db.C0794c;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import expo.modules.camera.PictureOptions;
import expo.modules.camera.RecordingOptions;
import expo.modules.camera.records.BarcodeSettings;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraMode;
import expo.modules.camera.records.CameraRatio;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.records.FlashMode;
import expo.modules.camera.records.FocusMode;
import expo.modules.camera.records.VideoQuality;
import ib.C3362a;
import java.io.File;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import lb.InterfaceC3618a;
import mb.InterfaceC3663a;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import u5.C4870a;
import vb.C5006a;
import vb.EnumC5010e;
import wa.C5048a;
import xa.InterfaceC5138a;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lva/f;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "LJd/N;", "d", "LJd/N;", "moduleScope", "Ljava/io/File;", "m", "()Ljava/io/File;", "cacheDirectory", "Lmb/a;", "n", "()Lmb/a;", "permissionsManager", "e", C4870a.f43493a, "expo-camera_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends AbstractC5139a {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final String f44069f = f.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Jd.N moduleScope = Jd.O.a(C0874b0.c());

    public static final class A extends xc.m implements Function1 {
        public A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            InterfaceC3663a.d(f.this.n(), (pb.m) objArr[0], "android.permission.RECORD_AUDIO");
            return Unit.f36324a;
        }
    }

    public static final class B extends xc.m implements Function2 {
        public B() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            InterfaceC3663a.a(f.this.n(), promise, "android.permission.CAMERA");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class C extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f44073a = new C();

        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    public static final class D extends xc.m implements Function1 {
        public D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            InterfaceC3663a.a(f.this.n(), (pb.m) objArr[0], "android.permission.CAMERA");
            return Unit.f36324a;
        }
    }

    public static final class E extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f44075a = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class F extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final F f44076a = new F();

        public F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.p(List.class, KTypeProjection.INSTANCE.d(C5142C.o(BarcodeType.class)));
        }
    }

    public static final class G extends xc.m implements Function2 {
        public G() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            List list = (List) objArr[1];
            String str = (String) obj;
            InterfaceC3618a q10 = f.this.a().q();
            if (q10 != null) {
                q10.a(str, new C4982b(list, f.this, promise, str));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class H extends xc.m implements Function0 {
        public H() {
            super(0);
        }

        public final void a() {
            try {
                Jd.O.c(f.this.moduleScope, new Da.d(null, 1, null));
            } catch (IllegalStateException unused) {
                Log.e(f.f44069f, "The scope does not have a job in it");
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
        public static final I f44079a = new I();

        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class J extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final J f44080a = new J();

        public J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class K extends xc.m implements Function1 {
        public K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((n) objArr[0]).E();
            return Unit.f36324a;
        }
    }

    public static final class L extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final L f44081a = new L();

        public L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class M extends xc.m implements Function1 {
        public M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((n) objArr[0]).getAvailablePictureSizes();
        }
    }

    public static final class N extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final N f44082a = new N();

        public N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class O extends xc.m implements Function1 {
        public O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            V.Y activeRecording = ((n) objArr[0]).getActiveRecording();
            if (activeRecording == null) {
                return null;
            }
            activeRecording.close();
            return Unit.f36324a;
        }
    }

    public static final class P extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final P f44083a = new P();

        public P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class Q extends xc.m implements Function1 {
        public Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((n) objArr[0]).I();
            return Unit.f36324a;
        }
    }

    public static final class R extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final R f44084a = new R();

        public R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class S extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final S f44085a = new S();

        public S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(PictureOptions.class);
        }
    }

    public static final class T extends xc.m implements Function2 {
        public T() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            PictureOptions pictureOptions = (PictureOptions) objArr[1];
            n nVar = (n) obj;
            if (!Ha.a.f3820a.a()) {
                nVar.K(pictureOptions, promise, f.this.m());
            } else {
                AbstractC0891k.d(f.this.moduleScope, null, null, new C4988i(e.f44067a.a(nVar.getWidth(), nVar.getHeight()), promise, pictureOptions, f.this, nVar, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class U extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final U f44087a = new U();

        public U() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(n.class);
        }
    }

    public static final class V extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final V f44088a = new V();

        public V() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(RecordingOptions.class);
        }
    }

    public static final class W extends xc.m implements Function2 {
        public W() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            RecordingOptions recordingOptions = (RecordingOptions) objArr[1];
            n nVar = (n) obj;
            if (!nVar.getMute() && !f.this.n().h("android.permission.RECORD_AUDIO")) {
                throw new expo.modules.kotlin.exception.h("android.permission.RECORD_AUDIO");
            }
            nVar.F(recordingOptions, promise, f.this.m());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class X extends xc.m implements Function1 {
        public X() {
            super(1);
        }

        public final void a(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            n nVar = (n) it;
            nVar.getOrientationEventListener().disable();
            nVar.s();
            nVar.H();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Unit.f36324a;
        }
    }

    public static final class Y extends xc.m implements Function1 {
        public Y() {
            super(1);
        }

        public final void a(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ((n) it).t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return Unit.f36324a;
        }
    }

    public static final class Z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final Z f44090a = new Z();

        public Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: va.f$a, reason: case insensitive filesystem and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return f.f44069f;
        }

        private Companion() {
        }
    }

    public static final class a0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a0 f44091a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    /* renamed from: va.f$b, reason: case insensitive filesystem */
    public static final class C4982b implements InterfaceC3618a.InterfaceC0551a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f44093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pb.m f44094c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f44095d;

        /* renamed from: va.f$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f44096a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ wa.g f44097b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bitmap f44098c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ pb.m f44099d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f44100e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(wa.g gVar, Bitmap bitmap, pb.m mVar, List list, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f44097b = gVar;
                this.f44098c = bitmap;
                this.f44099d = mVar;
                this.f44100e = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new a(this.f44097b, this.f44098c, this.f44099d, this.f44100e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Jd.N n10, kotlin.coroutines.d dVar) {
                return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f44096a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    wa.g gVar = this.f44097b;
                    Bitmap bitmap = this.f44098c;
                    this.f44096a = 1;
                    obj = gVar.d(bitmap, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                List list = this.f44100e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (list.contains(kotlin.coroutines.jvm.internal.b.b(((C3362a) obj2).f()))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C5048a.f44378a.d((C3362a) it.next(), 1.0f));
                }
                this.f44099d.d(arrayList2);
                return Unit.f36324a;
            }
        }

        C4982b(List list, f fVar, pb.m mVar, String str) {
            this.f44092a = list;
            this.f44093b = fVar;
            this.f44094c = mVar;
            this.f44095d = str;
        }

        @Override // lb.InterfaceC3618a.InterfaceC0551a
        public void onFailure(Throwable th) {
            this.f44094c.h(new C4979b(this.f44095d));
        }

        @Override // lb.InterfaceC3618a.InterfaceC0551a
        public void onSuccess(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            wa.g gVar = new wa.g();
            List list = this.f44092a;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
            }
            gVar.e(arrayList);
            AbstractC0891k.d(this.f44093b.moduleScope, null, null, new a(gVar, bitmap, this.f44094c, arrayList, null), 3, null);
        }
    }

    public static final class b0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b0 f44101a = new b0();

        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(FocusMode.class);
        }
    }

    /* renamed from: va.f$c, reason: case insensitive filesystem */
    static final class C4983c extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C4983c f44102a = new C4983c();

        C4983c() {
            super(2);
        }

        public final void a(n view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (bool != null) {
                view.setShouldScanBarcodes(bool.booleanValue());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class c0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c0 f44103a = new c0();

        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(CameraRatio.class);
        }
    }

    /* renamed from: va.f$d, reason: case insensitive filesystem */
    static final class C4984d extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44104a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4984d(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44104a = mVar;
        }

        public final void a(n view, String str) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (str != null) {
                if (!Intrinsics.b(view.getPictureSize(), str)) {
                    view.setPictureSize(str);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit != null || view.getPictureSize().length() <= 0) {
                return;
            }
            view.setPictureSize(BuildConfig.FLAVOR);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (String) obj2);
            return Unit.f36324a;
        }
    }

    public static final class d0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d0 f44105a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: va.f$e, reason: case insensitive filesystem */
    static final class C4985e extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44106a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4985e(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44106a = mVar;
        }

        public final void a(n view, FocusMode focusMode) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (focusMode != null) {
                if (view.getAutoFocus() != focusMode) {
                    view.setAutoFocus(focusMode);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                FocusMode autoFocus = view.getAutoFocus();
                FocusMode focusMode2 = FocusMode.OFF;
                if (autoFocus != focusMode2) {
                    view.setAutoFocus(focusMode2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (FocusMode) obj2);
            return Unit.f36324a;
        }
    }

    public static final class e0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e0 f44107a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Integer.class);
        }
    }

    /* renamed from: va.f$f, reason: collision with other inner class name */
    static final class C0633f extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44108a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0633f(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44108a = mVar;
        }

        public final void a(n view, CameraRatio cameraRatio) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (cameraRatio != null) {
                if (view.getRatio() != cameraRatio) {
                    view.setRatio(cameraRatio);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit != null || view.getRatio() == null) {
                return;
            }
            view.setRatio(null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (CameraRatio) obj2);
            return Unit.f36324a;
        }
    }

    public static final class f0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f0 f44109a = new f0();

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(CameraType.class);
        }
    }

    /* renamed from: va.f$g, reason: case insensitive filesystem */
    static final class C4986g extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4986g(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44110a = mVar;
        }

        public final void a(n view, Boolean bool) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (view.getMirror() != booleanValue) {
                    view.setMirror(booleanValue);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null && view.getMirror()) {
                view.setMirror(false);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class g0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g0 f44111a = new g0();

        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(FlashMode.class);
        }
    }

    /* renamed from: va.f$h, reason: case insensitive filesystem */
    static final class C4987h extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44112a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4987h(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44112a = mVar;
        }

        public final void a(n view, Integer num) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (num != null) {
                int intValue = num.intValue();
                Integer videoEncodingBitrate = view.getVideoEncodingBitrate();
                if (videoEncodingBitrate == null || videoEncodingBitrate.intValue() != intValue) {
                    view.setVideoEncodingBitrate(Integer.valueOf(intValue));
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit != null || view.getVideoEncodingBitrate() == null) {
                return;
            }
            view.setVideoEncodingBitrate(null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Integer) obj2);
            return Unit.f36324a;
        }
    }

    public static final class h0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h0 f44113a = new h0();

        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: va.f$i, reason: case insensitive filesystem */
    static final class C4988i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f44115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pb.m f44116c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PictureOptions f44117d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f44118e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f44119f;

        /* renamed from: va.f$i$a */
        static final class a implements InterfaceC5138a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f44120a;

            a(n nVar) {
                this.f44120a = nVar;
            }

            @Override // xa.InterfaceC5138a
            public final void a(Bundle response) {
                Intrinsics.checkNotNullParameter(response, "response");
                this.f44120a.C(response);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4988i(byte[] bArr, pb.m mVar, PictureOptions pictureOptions, f fVar, n nVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44115b = bArr;
            this.f44116c = mVar;
            this.f44117d = pictureOptions;
            this.f44118e = fVar;
            this.f44119f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new C4988i(this.f44115b, this.f44116c, this.f44117d, this.f44118e, this.f44119f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Jd.N n10, kotlin.coroutines.d dVar) {
            return ((C4988i) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f44114a;
            if (i10 == 0) {
                lc.p.b(obj);
                xa.b bVar = new xa.b(this.f44115b, this.f44116c, this.f44117d, false, this.f44118e.m(), new a(this.f44119f));
                this.f44114a = 1;
                if (bVar.i(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public static final class i0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i0 f44121a = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: va.f$j, reason: case insensitive filesystem */
    static final class C4989j extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44122a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4989j(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44122a = mVar;
        }

        public final void a(n view, CameraType cameraType) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (cameraType != null) {
                if (view.getLensFacing() != cameraType) {
                    view.setLensFacing(cameraType);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                CameraType lensFacing = view.getLensFacing();
                CameraType cameraType2 = CameraType.BACK;
                if (lensFacing != cameraType2) {
                    view.setLensFacing(cameraType2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (CameraType) obj2);
            return Unit.f36324a;
        }
    }

    public static final class j0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j0 f44123a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Float.class);
        }
    }

    /* renamed from: va.f$k, reason: case insensitive filesystem */
    static final class C4990k extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44124a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4990k(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44124a = mVar;
        }

        public final void a(n view, FlashMode flashMode) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (flashMode != null) {
                if (view.getFlashMode() != flashMode) {
                    view.setFlashMode(flashMode);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                FlashMode flashMode2 = view.getFlashMode();
                FlashMode flashMode3 = FlashMode.OFF;
                if (flashMode2 != flashMode3) {
                    view.setFlashMode(flashMode3);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (FlashMode) obj2);
            return Unit.f36324a;
        }
    }

    public static final class k0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k0 f44125a = new k0();

        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(CameraMode.class);
        }
    }

    /* renamed from: va.f$l, reason: case insensitive filesystem */
    static final class C4991l extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4991l(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44126a = mVar;
        }

        public final void a(n view, Boolean bool) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (view.getEnableTorch() != booleanValue) {
                    view.setEnableTorch(booleanValue);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null && view.getEnableTorch()) {
                view.setEnableTorch(false);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class l0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l0 f44127a = new l0();

        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(Boolean.class);
        }
    }

    /* renamed from: va.f$m, reason: case insensitive filesystem */
    static final class C4992m extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C4992m f44128a = new C4992m();

        C4992m() {
            super(2);
        }

        public final void a(n view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setAnimateShutter(bool != null ? bool.booleanValue() : true);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    public static final class m0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m0 f44129a = new m0();

        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(VideoQuality.class);
        }
    }

    /* renamed from: va.f$n, reason: case insensitive filesystem */
    static final class C4993n extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4993n(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44130a = mVar;
        }

        public final void a(n view, Float f10) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (f10 != null) {
                float floatValue = f10.floatValue();
                if (view.getZoom() != floatValue) {
                    view.setZoom(floatValue);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit != null || view.getZoom() == 0.0f) {
                return;
            }
            view.setZoom(0.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Float) obj2);
            return Unit.f36324a;
        }
    }

    public static final class n0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n0 f44131a = new n0();

        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(BarcodeSettings.class);
        }
    }

    /* renamed from: va.f$o, reason: case insensitive filesystem */
    static final class C4994o extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4994o(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44132a = mVar;
        }

        public final void a(n view, CameraMode cameraMode) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (cameraMode != null) {
                if (view.getCameraMode() != cameraMode) {
                    view.setCameraMode(cameraMode);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                CameraMode cameraMode2 = view.getCameraMode();
                CameraMode cameraMode3 = CameraMode.PICTURE;
                if (cameraMode2 != cameraMode3) {
                    view.setCameraMode(cameraMode3);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (CameraMode) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$p, reason: case insensitive filesystem */
    static final class C4995p extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C4995p f44133a = new C4995p();

        C4995p() {
            super(2);
        }

        public final void a(n view, Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setMute(bool != null ? bool.booleanValue() : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (Boolean) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$q, reason: case insensitive filesystem */
    static final class C4996q extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ expo.modules.kotlin.views.m f44134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4996q(expo.modules.kotlin.views.m mVar) {
            super(2);
            this.f44134a = mVar;
        }

        public final void a(n view, VideoQuality videoQuality) {
            Unit unit;
            Intrinsics.checkNotNullParameter(view, "view");
            if (videoQuality != null) {
                if (view.getVideoQuality() != videoQuality) {
                    view.setVideoQuality(videoQuality);
                }
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                VideoQuality videoQuality2 = view.getVideoQuality();
                VideoQuality videoQuality3 = VideoQuality.VIDEO1080P;
                if (videoQuality2 != videoQuality3) {
                    view.setVideoQuality(videoQuality3);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (VideoQuality) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$r, reason: case insensitive filesystem */
    static final class C4997r extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C4997r f44135a = new C4997r();

        C4997r() {
            super(2);
        }

        public final void a(n view, BarcodeSettings barcodeSettings) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (barcodeSettings != null) {
                view.setBarcodeScannerSettings(barcodeSettings);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((n) obj, (BarcodeSettings) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$s, reason: case insensitive filesystem */
    public static final class C4998s extends xc.m implements Function2 {
        public C4998s() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            InterfaceC3663a.a(f.this.n(), promise, "android.permission.RECORD_AUDIO");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$t, reason: case insensitive filesystem */
    public static final class C4999t extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C4999t f44137a = new C4999t();

        public C4999t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    /* renamed from: va.f$u, reason: case insensitive filesystem */
    public static final class C5000u extends xc.m implements Function1 {
        public C5000u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            InterfaceC3663a.a(f.this.n(), (pb.m) objArr[0], "android.permission.RECORD_AUDIO");
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$v, reason: case insensitive filesystem */
    public static final class C5001v extends xc.m implements Function2 {
        public C5001v() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            InterfaceC3663a.d(f.this.n(), promise, "android.permission.CAMERA");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$w, reason: case insensitive filesystem */
    public static final class C5002w extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C5002w f44140a = new C5002w();

        public C5002w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    /* renamed from: va.f$x, reason: case insensitive filesystem */
    public static final class C5003x extends xc.m implements Function1 {
        public C5003x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            InterfaceC3663a.d(f.this.n(), (pb.m) objArr[0], "android.permission.CAMERA");
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$y, reason: case insensitive filesystem */
    public static final class C5004y extends xc.m implements Function2 {
        public C5004y() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            InterfaceC3663a.d(f.this.n(), promise, "android.permission.RECORD_AUDIO");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: va.f$z, reason: case insensitive filesystem */
    public static final class C5005z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C5005z f44143a = new C5005z();

        public C5005z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File m() {
        return a().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3663a n() {
        InterfaceC3663a v10 = a().v();
        if (v10 != null) {
            return v10;
        }
        throw new expo.modules.kotlin.exception.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0968 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0989 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x098f A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x090d A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0835 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x085c A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x08a0 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x08e1 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0904 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:78:0x077e, B:80:0x07a7, B:81:0x07bd, B:83:0x07d0, B:85:0x0815, B:87:0x0835, B:88:0x0847, B:90:0x085c, B:91:0x0873, B:93:0x08a0, B:94:0x08b2, B:96:0x08e1, B:97:0x08f3, B:99:0x0904, B:101:0x094a, B:103:0x0968, B:104:0x097a, B:106:0x0989, B:107:0x09ca, B:111:0x098f, B:113:0x0997, B:114:0x099d, B:116:0x09a5, B:117:0x09ab, B:119:0x09b3, B:120:0x09b9, B:122:0x09bf, B:123:0x09c5, B:124:0x090d, B:126:0x0915, B:127:0x091b, B:129:0x0923, B:130:0x0929, B:132:0x0931, B:133:0x0937, B:135:0x093f, B:136:0x0945, B:138:0x07d8, B:140:0x07e0, B:141:0x07e6, B:143:0x07ee, B:144:0x07f4, B:146:0x07fc, B:147:0x0802, B:149:0x080a, B:150:0x0810, B:161:0x09eb, B:162:0x09f2), top: B:23:0x0392 }] */
    @Override // xb.AbstractC5139a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xb.c b() {
        Class cls;
        Class cls2;
        Class cls3;
        wb.g kVar;
        wb.g kVar2;
        wb.g kVar3;
        wb.g kVar4;
        Object obj;
        Class cls4;
        Object obj2;
        xb.b bVar;
        Class cls5;
        wb.g mVar;
        C0792a c0792a;
        C0792a c0792a2;
        Class cls6;
        C0792a c0792a3;
        C0792a c0792a4;
        Object obj3;
        Class cls7;
        wb.g mVar2;
        wb.g jVar;
        C0792a c0792a5;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar2 = new xb.b(this);
            bVar2.o("ExpoCamera");
            bVar2.d("onModernBarcodeScanned");
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                cls = CameraMode.class;
                kVar = new wb.f("requestCameraPermissionsAsync", new C0792a[0], new C5001v());
                cls2 = Float.class;
                cls3 = Boolean.class;
            } else {
                cls = CameraMode.class;
                cls2 = Float.class;
                C0792a c0792a6 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(pb.m.class), Boolean.FALSE));
                if (c0792a6 == null) {
                    cls3 = Boolean.class;
                    c0792a6 = new C0792a(new Db.M(C5142C.b(pb.m.class), false, C5002w.f44140a));
                } else {
                    cls3 = Boolean.class;
                }
                C0792a[] c0792aArr = {c0792a6};
                C5003x c5003x = new C5003x();
                kVar = Intrinsics.b(Unit.class, Integer.TYPE) ? new wb.k("requestCameraPermissionsAsync", c0792aArr, c5003x) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("requestCameraPermissionsAsync", c0792aArr, c5003x) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("requestCameraPermissionsAsync", c0792aArr, c5003x) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("requestCameraPermissionsAsync", c0792aArr, c5003x) : Intrinsics.b(Unit.class, String.class) ? new wb.m("requestCameraPermissionsAsync", c0792aArr, c5003x) : new wb.e("requestCameraPermissionsAsync", c0792aArr, c5003x);
            }
            bVar2.k().put("requestCameraPermissionsAsync", kVar);
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                kVar2 = new wb.f("requestMicrophonePermissionsAsync", new C0792a[0], new C5004y());
            } else {
                C0792a c0792a7 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(pb.m.class), Boolean.FALSE));
                if (c0792a7 == null) {
                    c0792a7 = new C0792a(new Db.M(C5142C.b(pb.m.class), false, C5005z.f44143a));
                }
                C0792a[] c0792aArr2 = {c0792a7};
                A a10 = new A();
                kVar2 = Intrinsics.b(Unit.class, Integer.TYPE) ? new wb.k("requestMicrophonePermissionsAsync", c0792aArr2, a10) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("requestMicrophonePermissionsAsync", c0792aArr2, a10) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("requestMicrophonePermissionsAsync", c0792aArr2, a10) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("requestMicrophonePermissionsAsync", c0792aArr2, a10) : Intrinsics.b(Unit.class, String.class) ? new wb.m("requestMicrophonePermissionsAsync", c0792aArr2, a10) : new wb.e("requestMicrophonePermissionsAsync", c0792aArr2, a10);
            }
            bVar2.k().put("requestMicrophonePermissionsAsync", kVar2);
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                kVar3 = new wb.f("getCameraPermissionsAsync", new C0792a[0], new B());
            } else {
                C0792a c0792a8 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(pb.m.class), Boolean.FALSE));
                if (c0792a8 == null) {
                    c0792a8 = new C0792a(new Db.M(C5142C.b(pb.m.class), false, C.f44073a));
                }
                C0792a[] c0792aArr3 = {c0792a8};
                D d10 = new D();
                kVar3 = Intrinsics.b(Unit.class, Integer.TYPE) ? new wb.k("getCameraPermissionsAsync", c0792aArr3, d10) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("getCameraPermissionsAsync", c0792aArr3, d10) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("getCameraPermissionsAsync", c0792aArr3, d10) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("getCameraPermissionsAsync", c0792aArr3, d10) : Intrinsics.b(Unit.class, String.class) ? new wb.m("getCameraPermissionsAsync", c0792aArr3, d10) : new wb.e("getCameraPermissionsAsync", c0792aArr3, d10);
            }
            bVar2.k().put("getCameraPermissionsAsync", kVar3);
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                kVar4 = new wb.f("getMicrophonePermissionsAsync", new C0792a[0], new C4998s());
            } else {
                C0792a c0792a9 = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(pb.m.class), Boolean.FALSE));
                if (c0792a9 == null) {
                    c0792a9 = new C0792a(new Db.M(C5142C.b(pb.m.class), false, C4999t.f44137a));
                }
                C0792a[] c0792aArr4 = {c0792a9};
                C5000u c5000u = new C5000u();
                kVar4 = Intrinsics.b(Unit.class, Integer.TYPE) ? new wb.k("getMicrophonePermissionsAsync", c0792aArr4, c5000u) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("getMicrophonePermissionsAsync", c0792aArr4, c5000u) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("getMicrophonePermissionsAsync", c0792aArr4, c5000u) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("getMicrophonePermissionsAsync", c0792aArr4, c5000u) : Intrinsics.b(Unit.class, String.class) ? new wb.m("getMicrophonePermissionsAsync", c0792aArr4, c5000u) : new wb.e("getMicrophonePermissionsAsync", c0792aArr4, c5000u);
            }
            bVar2.k().put("getMicrophonePermissionsAsync", kVar4);
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a10 == null) {
                obj = Unit.class;
                cls4 = String.class;
                c0792a10 = new C0792a(new Db.M(C5142C.b(String.class), false, E.f44075a));
            } else {
                obj = Unit.class;
                cls4 = String.class;
            }
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(List.class), bool));
            if (c0792a11 == null) {
                obj2 = List.class;
                c0792a11 = new C0792a(new Db.M(C5142C.b(List.class), false, F.f44076a));
            } else {
                obj2 = List.class;
            }
            bVar2.k().put("scanFromURLAsync", new wb.f("scanFromURLAsync", new C0792a[]{c0792a10, c0792a11}, new G()));
            Map s10 = bVar2.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_DESTROY;
            s10.put(enumC5010e, new C5006a(enumC5010e, new H()));
            kotlin.reflect.d b11 = C5142C.b(n.class);
            try {
                if (bVar2.t() != null) {
                    throw new IllegalArgumentException("The module definition may have exported only one view manager.");
                }
                expo.modules.kotlin.views.m mVar3 = new expo.modules.kotlin.views.m(b11, new Db.M(C5142C.b(n.class), false, I.f44079a, 2, null));
                Jb.b.g(mVar3);
                mVar3.b(g.a());
                C4989j c4989j = new C4989j(mVar3);
                Map g10 = mVar3.g();
                kotlin.reflect.d b12 = C5142C.b(CameraType.class);
                Boolean bool2 = Boolean.TRUE;
                C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(b12, bool2));
                if (c0792a12 == null) {
                    try {
                        bVar = bVar2;
                        c0792a12 = new C0792a(new Db.M(C5142C.b(CameraType.class), true, f0.f44109a));
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        AbstractC3901a.f();
                        throw th2;
                    }
                } else {
                    bVar = bVar2;
                }
                g10.put("facing", new expo.modules.kotlin.views.c("facing", c0792a12, c4989j));
                C4990k c4990k = new C4990k(mVar3);
                Map g11 = mVar3.g();
                C0792a c0792a13 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FlashMode.class), bool2));
                if (c0792a13 == null) {
                    c0792a13 = new C0792a(new Db.M(C5142C.b(FlashMode.class), true, g0.f44111a));
                }
                g11.put("flashMode", new expo.modules.kotlin.views.c("flashMode", c0792a13, c4990k));
                C4991l c4991l = new C4991l(mVar3);
                Map g12 = mVar3.g();
                C0792a c0792a14 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool2));
                if (c0792a14 == null) {
                    c0792a14 = new C0792a(new Db.M(C5142C.b(cls3), true, h0.f44113a));
                }
                g12.put("enableTorch", new expo.modules.kotlin.views.c("enableTorch", c0792a14, c4991l));
                C4992m c4992m = C4992m.f44128a;
                Map g13 = mVar3.g();
                C0792a c0792a15 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool2));
                if (c0792a15 == null) {
                    c0792a15 = new C0792a(new Db.M(C5142C.b(cls3), true, i0.f44121a));
                }
                g13.put("animateShutter", new expo.modules.kotlin.views.c("animateShutter", c0792a15, c4992m));
                C4993n c4993n = new C4993n(mVar3);
                Map g14 = mVar3.g();
                C0792a c0792a16 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls2), bool2));
                if (c0792a16 == null) {
                    c0792a16 = new C0792a(new Db.M(C5142C.b(cls2), true, j0.f44123a));
                }
                g14.put("zoom", new expo.modules.kotlin.views.c("zoom", c0792a16, c4993n));
                C4994o c4994o = new C4994o(mVar3);
                Map g15 = mVar3.g();
                C0792a c0792a17 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool2));
                if (c0792a17 == null) {
                    c0792a17 = new C0792a(new Db.M(C5142C.b(cls), true, k0.f44125a));
                }
                g15.put("mode", new expo.modules.kotlin.views.c("mode", c0792a17, c4994o));
                C4995p c4995p = C4995p.f44133a;
                Map g16 = mVar3.g();
                C0792a c0792a18 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool2));
                if (c0792a18 == null) {
                    c0792a18 = new C0792a(new Db.M(C5142C.b(cls3), true, l0.f44127a));
                }
                g16.put("mute", new expo.modules.kotlin.views.c("mute", c0792a18, c4995p));
                C4996q c4996q = new C4996q(mVar3);
                Map g17 = mVar3.g();
                C0792a c0792a19 = (C0792a) c0794c.a().get(new Pair(C5142C.b(VideoQuality.class), bool2));
                if (c0792a19 == null) {
                    c0792a19 = new C0792a(new Db.M(C5142C.b(VideoQuality.class), true, m0.f44129a));
                }
                g17.put("videoQuality", new expo.modules.kotlin.views.c("videoQuality", c0792a19, c4996q));
                C4997r c4997r = C4997r.f44135a;
                Map g18 = mVar3.g();
                C0792a c0792a20 = (C0792a) c0794c.a().get(new Pair(C5142C.b(BarcodeSettings.class), bool2));
                if (c0792a20 == null) {
                    c0792a20 = new C0792a(new Db.M(C5142C.b(BarcodeSettings.class), true, n0.f44131a));
                }
                g18.put("barcodeScannerSettings", new expo.modules.kotlin.views.c("barcodeScannerSettings", c0792a20, c4997r));
                C4983c c4983c = C4983c.f44102a;
                Map g19 = mVar3.g();
                C0792a c0792a21 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool2));
                if (c0792a21 == null) {
                    c0792a21 = new C0792a(new Db.M(C5142C.b(cls3), true, Z.f44090a));
                }
                g19.put("barcodeScannerEnabled", new expo.modules.kotlin.views.c("barcodeScannerEnabled", c0792a21, c4983c));
                C4984d c4984d = new C4984d(mVar3);
                Map g20 = mVar3.g();
                C0792a c0792a22 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls4), bool2));
                if (c0792a22 == null) {
                    c0792a22 = new C0792a(new Db.M(C5142C.b(cls4), true, a0.f44091a));
                }
                g20.put("pictureSize", new expo.modules.kotlin.views.c("pictureSize", c0792a22, c4984d));
                C4985e c4985e = new C4985e(mVar3);
                Map g21 = mVar3.g();
                C0792a c0792a23 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FocusMode.class), bool2));
                if (c0792a23 == null) {
                    c0792a23 = new C0792a(new Db.M(C5142C.b(FocusMode.class), true, b0.f44101a));
                }
                g21.put("autoFocus", new expo.modules.kotlin.views.c("autoFocus", c0792a23, c4985e));
                C0633f c0633f = new C0633f(mVar3);
                Map g22 = mVar3.g();
                C0792a c0792a24 = (C0792a) c0794c.a().get(new Pair(C5142C.b(CameraRatio.class), bool2));
                if (c0792a24 == null) {
                    c0792a24 = new C0792a(new Db.M(C5142C.b(CameraRatio.class), true, c0.f44103a));
                }
                g22.put("ratio", new expo.modules.kotlin.views.c("ratio", c0792a24, c0633f));
                C4986g c4986g = new C4986g(mVar3);
                Map g23 = mVar3.g();
                C0792a c0792a25 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls3), bool2));
                if (c0792a25 == null) {
                    c0792a25 = new C0792a(new Db.M(C5142C.b(cls3), true, d0.f44105a));
                }
                g23.put("mirror", new expo.modules.kotlin.views.c("mirror", c0792a25, c4986g));
                C4987h c4987h = new C4987h(mVar3);
                Map g24 = mVar3.g();
                C0792a c0792a26 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Integer.class), bool2));
                if (c0792a26 == null) {
                    c0792a26 = new C0792a(new Db.M(C5142C.b(Integer.class), true, e0.f44107a));
                }
                g24.put("videoBitrate", new expo.modules.kotlin.views.c("videoBitrate", c0792a26, c4987h));
                mVar3.k(new Y());
                C0792a c0792a27 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                if (c0792a27 == null) {
                    c0792a27 = new C0792a(new Db.M(C5142C.b(n.class), false, R.f44084a));
                }
                C0792a c0792a28 = (C0792a) c0794c.a().get(new Pair(C5142C.b(PictureOptions.class), bool));
                if (c0792a28 == null) {
                    c0792a28 = new C0792a(new Db.M(C5142C.b(PictureOptions.class), false, S.f44085a));
                }
                wb.f fVar = new wb.f("takePicture", new C0792a[]{c0792a27, c0792a28}, new T());
                mVar3.f().put("takePicture", fVar);
                wb.l lVar = wb.l.MAIN;
                fVar.m(lVar);
                C0792a c0792a29 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                if (c0792a29 == null) {
                    c0792a29 = new C0792a(new Db.M(C5142C.b(n.class), false, L.f44081a));
                }
                C0792a[] c0792aArr5 = {c0792a29};
                M m10 = new M();
                Class cls8 = Integer.TYPE;
                Object obj4 = obj2;
                if (Intrinsics.b(obj4, cls8)) {
                    mVar = new wb.k("getAvailablePictureSizes", c0792aArr5, m10);
                } else if (Intrinsics.b(obj4, Boolean.TYPE)) {
                    mVar = new wb.h("getAvailablePictureSizes", c0792aArr5, m10);
                } else if (Intrinsics.b(obj4, Double.TYPE)) {
                    mVar = new wb.i("getAvailablePictureSizes", c0792aArr5, m10);
                } else {
                    if (!Intrinsics.b(obj4, Float.TYPE)) {
                        cls5 = cls4;
                        mVar = Intrinsics.b(obj4, cls5) ? new wb.m("getAvailablePictureSizes", c0792aArr5, m10) : new wb.e("getAvailablePictureSizes", c0792aArr5, m10);
                        mVar3.f().put("getAvailablePictureSizes", mVar);
                        c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                        if (c0792a == null) {
                            c0792a = new C0792a(new Db.M(C5142C.b(n.class), false, U.f44087a));
                        }
                        c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(RecordingOptions.class), bool));
                        if (c0792a2 != null) {
                            cls6 = cls5;
                            c0792a2 = new C0792a(new Db.M(C5142C.b(RecordingOptions.class), false, V.f44088a));
                        } else {
                            cls6 = cls5;
                        }
                        wb.f fVar2 = new wb.f("record", new C0792a[]{c0792a, c0792a2}, new W());
                        mVar3.f().put("record", fVar2);
                        fVar2.m(lVar);
                        c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                        if (c0792a3 == null) {
                            c0792a3 = new C0792a(new Db.M(C5142C.b(n.class), false, N.f44082a));
                        }
                        wb.e eVar = new wb.e("stopRecording", new C0792a[]{c0792a3}, new O());
                        mVar3.f().put("stopRecording", eVar);
                        eVar.m(lVar);
                        c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                        if (c0792a4 == null) {
                            c0792a4 = new C0792a(new Db.M(C5142C.b(n.class), false, P.f44083a));
                        }
                        C0792a[] c0792aArr6 = {c0792a4};
                        Q q10 = new Q();
                        obj3 = obj;
                        if (!Intrinsics.b(obj3, cls8)) {
                            jVar = new wb.k("resumePreview", c0792aArr6, q10);
                        } else if (Intrinsics.b(obj3, Boolean.TYPE)) {
                            jVar = new wb.h("resumePreview", c0792aArr6, q10);
                        } else if (Intrinsics.b(obj3, Double.TYPE)) {
                            jVar = new wb.i("resumePreview", c0792aArr6, q10);
                        } else {
                            if (!Intrinsics.b(obj3, Float.TYPE)) {
                                cls7 = cls6;
                                mVar2 = Intrinsics.b(obj3, cls7) ? new wb.m("resumePreview", c0792aArr6, q10) : new wb.e("resumePreview", c0792aArr6, q10);
                                mVar3.f().put("resumePreview", mVar2);
                                c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                                if (c0792a5 == null) {
                                    c0792a5 = new C0792a(new Db.M(C5142C.b(n.class), false, J.f44080a));
                                }
                                C0792a[] c0792aArr7 = {c0792a5};
                                K k10 = new K();
                                mVar3.f().put("pausePreview", Intrinsics.b(obj3, cls8) ? new wb.k("pausePreview", c0792aArr7, k10) : Intrinsics.b(obj3, Boolean.TYPE) ? new wb.h("pausePreview", c0792aArr7, k10) : Intrinsics.b(obj3, Double.TYPE) ? new wb.i("pausePreview", c0792aArr7, k10) : Intrinsics.b(obj3, Float.TYPE) ? new wb.j("pausePreview", c0792aArr7, k10) : Intrinsics.b(obj3, cls7) ? new wb.m("pausePreview", c0792aArr7, k10) : new wb.e("pausePreview", c0792aArr7, k10));
                                mVar3.j(new X());
                                xb.b bVar3 = bVar;
                                bVar3.u(mVar3.d());
                                xb.c q11 = bVar3.q();
                                AbstractC3901a.f();
                                return q11;
                            }
                            jVar = new wb.j("resumePreview", c0792aArr6, q10);
                        }
                        mVar2 = jVar;
                        cls7 = cls6;
                        mVar3.f().put("resumePreview", mVar2);
                        c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                        if (c0792a5 == null) {
                        }
                        C0792a[] c0792aArr72 = {c0792a5};
                        K k102 = new K();
                        mVar3.f().put("pausePreview", Intrinsics.b(obj3, cls8) ? new wb.k("pausePreview", c0792aArr72, k102) : Intrinsics.b(obj3, Boolean.TYPE) ? new wb.h("pausePreview", c0792aArr72, k102) : Intrinsics.b(obj3, Double.TYPE) ? new wb.i("pausePreview", c0792aArr72, k102) : Intrinsics.b(obj3, Float.TYPE) ? new wb.j("pausePreview", c0792aArr72, k102) : Intrinsics.b(obj3, cls7) ? new wb.m("pausePreview", c0792aArr72, k102) : new wb.e("pausePreview", c0792aArr72, k102));
                        mVar3.j(new X());
                        xb.b bVar32 = bVar;
                        bVar32.u(mVar3.d());
                        xb.c q112 = bVar32.q();
                        AbstractC3901a.f();
                        return q112;
                    }
                    mVar = new wb.j("getAvailablePictureSizes", c0792aArr5, m10);
                }
                cls5 = cls4;
                mVar3.f().put("getAvailablePictureSizes", mVar);
                c0792a = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                if (c0792a == null) {
                }
                c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(RecordingOptions.class), bool));
                if (c0792a2 != null) {
                }
                wb.f fVar22 = new wb.f("record", new C0792a[]{c0792a, c0792a2}, new W());
                mVar3.f().put("record", fVar22);
                fVar22.m(lVar);
                c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                if (c0792a3 == null) {
                }
                wb.e eVar2 = new wb.e("stopRecording", new C0792a[]{c0792a3}, new O());
                mVar3.f().put("stopRecording", eVar2);
                eVar2.m(lVar);
                c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                if (c0792a4 == null) {
                }
                C0792a[] c0792aArr62 = {c0792a4};
                Q q102 = new Q();
                obj3 = obj;
                if (!Intrinsics.b(obj3, cls8)) {
                }
                mVar2 = jVar;
                cls7 = cls6;
                mVar3.f().put("resumePreview", mVar2);
                c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(n.class), bool));
                if (c0792a5 == null) {
                }
                C0792a[] c0792aArr722 = {c0792a5};
                K k1022 = new K();
                mVar3.f().put("pausePreview", Intrinsics.b(obj3, cls8) ? new wb.k("pausePreview", c0792aArr722, k1022) : Intrinsics.b(obj3, Boolean.TYPE) ? new wb.h("pausePreview", c0792aArr722, k1022) : Intrinsics.b(obj3, Double.TYPE) ? new wb.i("pausePreview", c0792aArr722, k1022) : Intrinsics.b(obj3, Float.TYPE) ? new wb.j("pausePreview", c0792aArr722, k1022) : Intrinsics.b(obj3, cls7) ? new wb.m("pausePreview", c0792aArr722, k1022) : new wb.e("pausePreview", c0792aArr722, k1022));
                mVar3.j(new X());
                xb.b bVar322 = bVar;
                bVar322.u(mVar3.d());
                xb.c q1122 = bVar322.q();
                AbstractC3901a.f();
                return q1122;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
