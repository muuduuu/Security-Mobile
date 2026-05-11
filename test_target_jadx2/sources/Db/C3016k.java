package db;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import Jd.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OperationCanceledException;
import com.facebook.react.bridge.BaseJavaModule;
import eb.C3118a;
import eb.h;
import expo.modules.imagepicker.ImagePickerOptions;
import expo.modules.imagepicker.ImagePickerResponse;
import expo.modules.imagepicker.MediaType;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
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
import lc.o;
import mb.C3664b;
import mb.InterfaceC3663a;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import rb.InterfaceC4294b;
import rb.InterfaceC4296d;
import wc.InterfaceC5068n;
import xb.AbstractC5139a;
import xc.C5141B;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0010\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0017\u001a\u00020\u00162\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000b0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000b0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010-R\"\u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000b0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010-R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Ldb/k;", "Lxb/a;", "<init>", "()V", "Lpb/m;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lmb/c;", "z", "(Lpb/m;)Lmb/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Leb/h;", BuildConfig.FLAVOR, "pickerLauncher", "Lexpo/modules/imagepicker/ImagePickerOptions;", "options", "H", "(Lkotlin/jvm/functions/Function1;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/d;)Ljava/lang/Object;", "result", BuildConfig.FLAVOR, "G", "(Leb/h;Lexpo/modules/imagepicker/ImagePickerOptions;)V", "Leb/h$c;", "I", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "writeOnly", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "F", "(Z)[Ljava/lang/String;", "C", "(Lexpo/modules/imagepicker/ImagePickerOptions;)V", "B", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lxb/c;", "b", "()Lxb/c;", "Ldb/m;", "d", "Ldb/m;", "mediaHandler", "Lrb/e;", "Leb/b;", "e", "Lrb/e;", "cameraLauncher", "Leb/g;", "f", "imageLibraryLauncher", "Leb/e;", "g", "cropImageLauncher", "Ldb/p;", "h", "Ldb/p;", "pendingMediaPickingResult", "i", "Z", "isPickerOpen", "Ljava/io/File;", "D", "()Ljava/io/File;", "cacheDirectory", "Landroid/content/Context;", "E", "()Landroid/content/Context;", "context", "expo-image-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: db.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3016k extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C3018m mediaHandler = new C3018m(this);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private rb.e cameraLauncher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private rb.e imageLibraryLauncher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private rb.e cropImageLauncher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C3021p pendingMediaPickingResult;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPickerOpen;

    /* renamed from: db.k$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f31349a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ eb.b f31351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(eb.b bVar, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f31351c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return C3016k.this.new a(this.f31351c, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31349a;
            if (i10 == 0) {
                lc.p.b(obj);
                rb.e eVar = C3016k.this.cameraLauncher;
                if (eVar == null) {
                    Intrinsics.v("cameraLauncher");
                    eVar = null;
                }
                eb.b bVar = this.f31351c;
                this.f31349a = 1;
                obj = eVar.a(bVar, this);
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

    /* renamed from: db.k$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f31352a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ eb.g f31354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(eb.g gVar, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f31354c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return C3016k.this.new b(this.f31354c, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31352a;
            if (i10 == 0) {
                lc.p.b(obj);
                rb.e eVar = C3016k.this.imageLibraryLauncher;
                if (eVar == null) {
                    Intrinsics.v("imageLibraryLauncher");
                    eVar = null;
                }
                eb.g gVar = this.f31354c;
                this.f31352a = 1;
                obj = eVar.a(gVar, this);
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

    /* renamed from: db.k$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f31355a;

        /* renamed from: b, reason: collision with root package name */
        int f31356b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31357c;

        /* renamed from: db.k$c$a */
        static final class a implements InterfaceC4296d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3016k f31359a;

            a(C3016k c3016k) {
                this.f31359a = c3016k;
            }

            @Override // rb.InterfaceC4296d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(eb.b input, eb.h result) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(result, "result");
                this.f31359a.G(result, input.a());
            }
        }

        /* renamed from: db.k$c$b */
        static final class b implements InterfaceC4296d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3016k f31360a;

            b(C3016k c3016k) {
                this.f31360a = c3016k;
            }

            @Override // rb.InterfaceC4296d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(eb.g input, eb.h result) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(result, "result");
                this.f31360a.G(result, input.a());
            }
        }

        /* renamed from: db.k$c$c, reason: collision with other inner class name */
        static final class C0452c implements InterfaceC4296d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3016k f31361a;

            C0452c(C3016k c3016k) {
                this.f31361a = c3016k;
            }

            @Override // rb.InterfaceC4296d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(eb.e input, eb.h result) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(result, "result");
                this.f31361a.G(result, input.a());
            }
        }

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            c cVar = C3016k.this.new c(dVar);
            cVar.f31357c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4294b interfaceC4294b, kotlin.coroutines.d dVar) {
            return ((c) create(interfaceC4294b, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00a0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C3016k c3016k;
            InterfaceC4294b interfaceC4294b;
            C3016k c3016k2;
            InterfaceC4294b interfaceC4294b2;
            Object a10;
            C3016k c3016k3;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31356b;
            if (i10 == 0) {
                lc.p.b(obj);
                InterfaceC4294b interfaceC4294b3 = (InterfaceC4294b) this.f31357c;
                c3016k = C3016k.this;
                C3118a c3118a = new C3118a(c3016k);
                a aVar = new a(C3016k.this);
                this.f31357c = interfaceC4294b3;
                this.f31355a = c3016k;
                this.f31356b = 1;
                Object a11 = interfaceC4294b3.a(c3118a, aVar, this);
                if (a11 == e10) {
                    return e10;
                }
                interfaceC4294b = interfaceC4294b3;
                obj = a11;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3016k3 = (C3016k) this.f31357c;
                        lc.p.b(obj);
                        c3016k3.cropImageLauncher = (rb.e) obj;
                        return Unit.f36324a;
                    }
                    c3016k2 = (C3016k) this.f31355a;
                    interfaceC4294b2 = (InterfaceC4294b) this.f31357c;
                    lc.p.b(obj);
                    c3016k2.imageLibraryLauncher = (rb.e) obj;
                    C3016k c3016k4 = C3016k.this;
                    eb.d dVar = new eb.d(c3016k4);
                    C0452c c0452c = new C0452c(C3016k.this);
                    this.f31357c = c3016k4;
                    this.f31355a = null;
                    this.f31356b = 3;
                    a10 = interfaceC4294b2.a(dVar, c0452c, this);
                    if (a10 != e10) {
                        return e10;
                    }
                    c3016k3 = c3016k4;
                    obj = a10;
                    c3016k3.cropImageLauncher = (rb.e) obj;
                    return Unit.f36324a;
                }
                c3016k = (C3016k) this.f31355a;
                interfaceC4294b = (InterfaceC4294b) this.f31357c;
                lc.p.b(obj);
            }
            c3016k.cameraLauncher = (rb.e) obj;
            c3016k2 = C3016k.this;
            eb.f fVar = new eb.f(c3016k2);
            b bVar = new b(C3016k.this);
            this.f31357c = interfaceC4294b;
            this.f31355a = c3016k2;
            this.f31356b = 2;
            obj = interfaceC4294b.a(fVar, bVar, this);
            if (obj == e10) {
                return e10;
            }
            interfaceC4294b2 = interfaceC4294b;
            c3016k2.imageLibraryLauncher = (rb.e) obj;
            C3016k c3016k42 = C3016k.this;
            eb.d dVar2 = new eb.d(c3016k42);
            C0452c c0452c2 = new C0452c(C3016k.this);
            this.f31357c = c3016k42;
            this.f31355a = null;
            this.f31356b = 3;
            a10 = interfaceC4294b2.a(dVar2, c0452c2, this);
            if (a10 != e10) {
            }
        }
    }

    /* renamed from: db.k$d */
    public static final class d extends xc.m implements Function2 {
        public d() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            InterfaceC3663a.d(C3016k.this.a().v(), promise, "android.permission.CAMERA");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: db.k$e */
    public static final class e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f31363a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    /* renamed from: db.k$f */
    public static final class f extends xc.m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            InterfaceC3663a.d(C3016k.this.a().v(), (pb.m) objArr[0], "android.permission.CAMERA");
            return Unit.f36324a;
        }
    }

    /* renamed from: db.k$g */
    public static final class g extends xc.m implements Function2 {
        public g() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            InterfaceC3663a.a(C3016k.this.a().v(), promise, "android.permission.CAMERA");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: db.k$h */
    public static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f31366a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(pb.m.class);
        }
    }

    /* renamed from: db.k$i */
    public static final class i extends xc.m implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            InterfaceC3663a.a(C3016k.this.a().v(), (pb.m) objArr[0], "android.permission.CAMERA");
            return Unit.f36324a;
        }
    }

    /* renamed from: db.k$j */
    public static final class j extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f31368a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Boolean.TYPE);
        }
    }

    /* renamed from: db.k$k, reason: collision with other inner class name */
    public static final class C0453k extends xc.m implements Function2 {
        public C0453k() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            InterfaceC3663a v10 = C3016k.this.a().v();
            if (v10 == null) {
                throw new expo.modules.kotlin.exception.k();
            }
            String[] F10 = C3016k.this.F(booleanValue);
            v10.m(C3016k.this.z(promise), (String[]) Arrays.copyOf(F10, F10.length));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: db.k$l */
    public static final class l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f31370a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(Boolean.TYPE);
        }
    }

    /* renamed from: db.k$m */
    public static final class m extends xc.m implements Function2 {
        public m() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            InterfaceC3663a v10 = C3016k.this.a().v();
            if (v10 == null) {
                throw new expo.modules.kotlin.exception.k();
            }
            String[] F10 = C3016k.this.F(booleanValue);
            v10.g(C3016k.this.z(promise), (String[]) Arrays.copyOf(F10, F10.length));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: db.k$n */
    public static final class n extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f31372a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(ImagePickerOptions.class);
        }
    }

    /* renamed from: db.k$o */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f31373a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3016k f31375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlin.coroutines.d dVar, C3016k c3016k) {
            super(3, dVar);
            this.f31375c = c3016k;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            o oVar = new o(dVar, this.f31375c);
            oVar.f31374b = objArr;
            return oVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ImagePickerOptions imagePickerOptions;
            File c10;
            File file;
            Throwable th;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31373a;
            try {
                if (i10 == 0) {
                    lc.p.b(obj);
                    imagePickerOptions = (ImagePickerOptions) ((Object[]) this.f31374b)[0];
                    this.f31375c.C(imagePickerOptions);
                    C3016k c3016k = this.f31375c;
                    this.f31374b = imagePickerOptions;
                    this.f31373a = 1;
                    if (c3016k.B(this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        file = (File) this.f31374b;
                        try {
                            lc.p.b(obj);
                            file.delete();
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            file.delete();
                            throw th;
                        }
                    }
                    imagePickerOptions = (ImagePickerOptions) this.f31374b;
                    lc.p.b(obj);
                }
                String uri = AbstractC3017l.o(c10, this.f31375c.E()).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                eb.b cameraContractOptions = imagePickerOptions.toCameraContractOptions(uri);
                C3016k c3016k2 = this.f31375c;
                a aVar = c3016k2.new a(cameraContractOptions, null);
                this.f31374b = c10;
                this.f31373a = 2;
                Object H10 = c3016k2.H(aVar, imagePickerOptions, this);
                if (H10 == e10) {
                    return e10;
                }
                file = c10;
                obj = H10;
                file.delete();
                return obj;
            } catch (Throwable th3) {
                file = c10;
                th = th3;
                file.delete();
                throw th;
            }
            c10 = AbstractC3017l.c(this.f31375c.D(), imagePickerOptions.getNativeMediaTypes().toFileExtension());
        }
    }

    /* renamed from: db.k$p */
    public static final class p extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f31376a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(ImagePickerOptions.class);
        }
    }

    /* renamed from: db.k$q */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f31377a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31378b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3016k f31379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(kotlin.coroutines.d dVar, C3016k c3016k) {
            super(3, dVar);
            this.f31379c = c3016k;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            q qVar = new q(dVar, this.f31379c);
            qVar.f31378b = objArr;
            return qVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31377a;
            if (i10 == 0) {
                lc.p.b(obj);
                ImagePickerOptions imagePickerOptions = (ImagePickerOptions) ((Object[]) this.f31378b)[0];
                eb.g imageLibraryContractOptions = imagePickerOptions.toImageLibraryContractOptions();
                C3016k c3016k = this.f31379c;
                b bVar = c3016k.new b(imageLibraryContractOptions, null);
                this.f31377a = 1;
                obj = c3016k.H(bVar, imagePickerOptions, this);
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

    /* renamed from: db.k$r */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f31380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3016k f31381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(kotlin.coroutines.d dVar, C3016k c3016k) {
            super(3, dVar);
            this.f31381b = c3016k;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            return new r(dVar, this.f31381b).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31380a;
            if (i10 == 0) {
                lc.p.b(obj);
                C3021p c3021p = this.f31381b.pendingMediaPickingResult;
                if (c3021p == null) {
                    return null;
                }
                List a10 = c3021p.a();
                ImagePickerOptions b10 = c3021p.b();
                this.f31381b.pendingMediaPickingResult = null;
                C3018m c3018m = this.f31381b.mediaHandler;
                this.f31380a = 1;
                obj = c3018m.h(a10, b10, this);
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

    /* renamed from: db.k$s */
    static final class s implements mb.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f31382a;

        s(InterfaceC0895m interfaceC0895m) {
            this.f31382a = interfaceC0895m;
        }

        @Override // mb.c
        public final void a(Map map) {
            if (Build.VERSION.SDK_INT >= 29) {
                C3664b c3664b = (C3664b) map.get("android.permission.CAMERA");
                if ((c3664b != null ? c3664b.b() : null) == mb.d.GRANTED) {
                    InterfaceC0895m interfaceC0895m = this.f31382a;
                    o.a aVar = lc.o.f37128b;
                    interfaceC0895m.resumeWith(lc.o.b(Unit.f36324a));
                    return;
                } else {
                    InterfaceC0895m interfaceC0895m2 = this.f31382a;
                    o.a aVar2 = lc.o.f37128b;
                    interfaceC0895m2.resumeWith(lc.o.b(lc.p.a(new C3022q())));
                    return;
                }
            }
            C3664b c3664b2 = (C3664b) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
            mb.d b10 = c3664b2 != null ? c3664b2.b() : null;
            mb.d dVar = mb.d.GRANTED;
            if (b10 == dVar) {
                C3664b c3664b3 = (C3664b) map.get("android.permission.CAMERA");
                if ((c3664b3 != null ? c3664b3.b() : null) == dVar) {
                    InterfaceC0895m interfaceC0895m3 = this.f31382a;
                    o.a aVar3 = lc.o.f37128b;
                    interfaceC0895m3.resumeWith(lc.o.b(Unit.f36324a));
                    return;
                }
            }
            InterfaceC0895m interfaceC0895m4 = this.f31382a;
            o.a aVar4 = lc.o.f37128b;
            interfaceC0895m4.resumeWith(lc.o.b(lc.p.a(new C3022q())));
        }
    }

    /* renamed from: db.k$t */
    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31383a;

        /* renamed from: b, reason: collision with root package name */
        Object f31384b;

        /* renamed from: c, reason: collision with root package name */
        Object f31385c;

        /* renamed from: d, reason: collision with root package name */
        Object f31386d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f31387e;

        /* renamed from: g, reason: collision with root package name */
        int f31389g;

        t(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31387e = obj;
            this.f31389g |= Integer.MIN_VALUE;
            return C3016k.this.H(null, null, this);
        }
    }

    /* renamed from: db.k$u */
    static final class u extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f31390a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5141B f31392c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImagePickerOptions f31393d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(C5141B c5141b, ImagePickerOptions imagePickerOptions, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f31392c = c5141b;
            this.f31393d = imagePickerOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return C3016k.this.new u(this.f31392c, this.f31393d, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((u) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31390a;
            if (i10 == 0) {
                lc.p.b(obj);
                rb.e eVar = C3016k.this.cropImageLauncher;
                if (eVar == null) {
                    Intrinsics.v("cropImageLauncher");
                    eVar = null;
                }
                String uri = ((Uri) ((Pair) ((h.c) this.f31392c.f44962a).a().get(0)).d()).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                eb.e eVar2 = new eb.e(uri, this.f31393d);
                this.f31390a = 1;
                obj = eVar.a(eVar2, this);
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

    /* renamed from: db.k$v */
    static final class v extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f31394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f31395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Function1 function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f31395b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new v(this.f31395b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((v) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f31394a;
            if (i10 == 0) {
                lc.p.b(obj);
                Function1 function1 = this.f31395b;
                this.f31394a = 1;
                obj = function1.invoke(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            eb.h hVar = (eb.h) obj;
            if (hVar instanceof h.c) {
                return (h.c) hVar;
            }
            if (hVar instanceof h.a) {
                throw new OperationCanceledException();
            }
            if (hVar instanceof h.b) {
                throw new C3010e();
            }
            throw new lc.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void A(pb.m promise, WeakReference weakContext, C3016k this$0, Map map) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(weakContext, "$weakContext");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.d(map);
        boolean z12 = false;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((C3664b) ((Map.Entry) it.next()).getValue()).b() != mb.d.GRANTED) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!map.isEmpty()) {
            if (!map.isEmpty()) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    if (((C3664b) ((Map.Entry) it2.next()).getValue()).b() == mb.d.DENIED) {
                    }
                }
            }
            z11 = true;
            if (!map.isEmpty()) {
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    if (!((C3664b) ((Map.Entry) it3.next()).getValue()).a()) {
                        break;
                    }
                }
            }
            z12 = true;
            Bundle bundle = new Bundle();
            bundle.putString("expires", "never");
            bundle.putString("status", !z10 ? mb.d.GRANTED.getStatus() : z11 ? mb.d.DENIED.getStatus() : mb.d.UNDETERMINED.getStatus());
            bundle.putBoolean("canAskAgain", z12);
            bundle.putBoolean("granted", z10);
            if (!z10) {
                bundle.putString("accessPrivileges", "all");
                promise.resolve(bundle);
                return;
            }
            if (Build.VERSION.SDK_INT < 34) {
                bundle.putString("accessPrivileges", "none");
                promise.resolve(bundle);
                return;
            }
            Context context = (Context) weakContext.get();
            if (context == null) {
                promise.h(new expo.modules.kotlin.exception.l());
                return;
            }
            if (androidx.core.content.a.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                bundle.putBoolean("granted", true);
                bundle.putBoolean("canAskAgain", true);
                bundle.putString("status", mb.d.GRANTED.getStatus());
                bundle.putString("accessPrivileges", "limited");
            } else {
                bundle.putString("accessPrivileges", "none");
            }
            promise.resolve(bundle);
            return;
        }
        z11 = false;
        if (!map.isEmpty()) {
        }
        z12 = true;
        Bundle bundle2 = new Bundle();
        bundle2.putString("expires", "never");
        bundle2.putString("status", !z10 ? mb.d.GRANTED.getStatus() : z11 ? mb.d.DENIED.getStatus() : mb.d.UNDETERMINED.getStatus());
        bundle2.putBoolean("canAskAgain", z12);
        bundle2.putBoolean("granted", z10);
        if (!z10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(kotlin.coroutines.d dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        InterfaceC3663a v10 = a().v();
        if (v10 == null) {
            throw new Da.e("Permissions");
        }
        s sVar = new s(c0899o);
        String[] strArr = (String[]) CollectionsKt.o(Build.VERSION.SDK_INT < 29 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null, "android.permission.CAMERA").toArray(new String[0]);
        v10.m(sVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10 == AbstractC3868b.e() ? y10 : Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(ImagePickerOptions options) {
        Intent intent = new Intent(options.getNativeMediaTypes().toCameraIntentAction());
        if (intent.resolveActivity(a().x().getApplication().getPackageManager()) == null) {
            throw new C3019n(intent.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File D() {
        return a().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] F(boolean writeOnly) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String[0];
        }
        return (String[]) CollectionsKt.o("android.permission.WRITE_EXTERNAL_STORAGE", !writeOnly ? "android.permission.READ_EXTERNAL_STORAGE" : null).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(eb.h result, ImagePickerOptions options) {
        if (result instanceof h.c) {
            this.pendingMediaPickingResult = new C3021p(((h.c) result).a(), options);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v28, types: [db.k] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(Function1 function1, ImagePickerOptions imagePickerOptions, kotlin.coroutines.d dVar) {
        t tVar;
        Object obj;
        Object e10;
        int i10;
        C3016k c3016k;
        ImagePickerOptions imagePickerOptions2;
        C5141B c5141b;
        C5141B c5141b2;
        C5141B c5141b3;
        try {
            try {
                try {
                    if (dVar instanceof t) {
                        tVar = (t) dVar;
                        int i11 = tVar.f31389g;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            tVar.f31389g = i11 - Integer.MIN_VALUE;
                            obj = tVar.f31387e;
                            e10 = AbstractC3868b.e();
                            i10 = tVar.f31389g;
                            if (i10 != 0) {
                                lc.p.b(obj);
                                try {
                                    if (this.isPickerOpen) {
                                        ImagePickerResponse imagePickerResponse = new ImagePickerResponse(true, null, 2, null);
                                        this.isPickerOpen = false;
                                        return imagePickerResponse;
                                    }
                                    this.isPickerOpen = true;
                                    C5141B c5141b4 = new C5141B();
                                    tVar.f31383a = this;
                                    tVar.f31384b = imagePickerOptions;
                                    tVar.f31385c = c5141b4;
                                    tVar.f31386d = c5141b4;
                                    tVar.f31389g = 1;
                                    Object I10 = I(function1, tVar);
                                    if (I10 == e10) {
                                        return e10;
                                    }
                                    c3016k = this;
                                    imagePickerOptions2 = imagePickerOptions;
                                    c5141b = c5141b4;
                                    obj = I10;
                                    c5141b2 = c5141b;
                                } catch (OperationCanceledException unused) {
                                    function1 = this;
                                    ImagePickerResponse imagePickerResponse2 = new ImagePickerResponse(true, null, 2, null);
                                    function1.isPickerOpen = false;
                                    return imagePickerResponse2;
                                } catch (Throwable th) {
                                    th = th;
                                    function1 = this;
                                    function1.isPickerOpen = false;
                                    throw th;
                                }
                            } else {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        C3016k c3016k2 = (C3016k) tVar.f31383a;
                                        lc.p.b(obj);
                                        function1 = c3016k2;
                                        ImagePickerResponse imagePickerResponse3 = (ImagePickerResponse) obj;
                                        function1.isPickerOpen = false;
                                        return imagePickerResponse3;
                                    }
                                    c5141b3 = (C5141B) tVar.f31386d;
                                    c5141b = (C5141B) tVar.f31385c;
                                    imagePickerOptions2 = (ImagePickerOptions) tVar.f31384b;
                                    c3016k = (C3016k) tVar.f31383a;
                                    lc.p.b(obj);
                                    c5141b3.f44962a = obj;
                                    C3016k c3016k3 = c3016k;
                                    C3018m c3018m = c3016k3.mediaHandler;
                                    List a10 = ((h.c) c5141b.f44962a).a();
                                    tVar.f31383a = c3016k3;
                                    tVar.f31384b = null;
                                    tVar.f31385c = null;
                                    tVar.f31386d = null;
                                    tVar.f31389g = 3;
                                    obj = c3018m.h(a10, imagePickerOptions2, tVar);
                                    function1 = c3016k3;
                                    if (obj == e10) {
                                        return e10;
                                    }
                                    ImagePickerResponse imagePickerResponse32 = (ImagePickerResponse) obj;
                                    function1.isPickerOpen = false;
                                    return imagePickerResponse32;
                                }
                                c5141b2 = (C5141B) tVar.f31386d;
                                c5141b = (C5141B) tVar.f31385c;
                                imagePickerOptions2 = (ImagePickerOptions) tVar.f31384b;
                                c3016k = (C3016k) tVar.f31383a;
                                lc.p.b(obj);
                            }
                            c5141b2.f44962a = obj;
                            if (!imagePickerOptions2.getAllowsMultipleSelection() && imagePickerOptions2.getAllowsEditing() && ((h.c) c5141b.f44962a).a().size() == 1 && ((Pair) ((h.c) c5141b.f44962a).a().get(0)).c() == MediaType.IMAGE) {
                                u uVar = c3016k.new u(c5141b, imagePickerOptions2, null);
                                tVar.f31383a = c3016k;
                                tVar.f31384b = imagePickerOptions2;
                                tVar.f31385c = c5141b;
                                tVar.f31386d = c5141b;
                                tVar.f31389g = 2;
                                obj = c3016k.I(uVar, tVar);
                                if (obj != e10) {
                                    return e10;
                                }
                                c5141b3 = c5141b;
                                c5141b3.f44962a = obj;
                            }
                            C3016k c3016k32 = c3016k;
                            C3018m c3018m2 = c3016k32.mediaHandler;
                            List a102 = ((h.c) c5141b.f44962a).a();
                            tVar.f31383a = c3016k32;
                            tVar.f31384b = null;
                            tVar.f31385c = null;
                            tVar.f31386d = null;
                            tVar.f31389g = 3;
                            obj = c3018m2.h(a102, imagePickerOptions2, tVar);
                            function1 = c3016k32;
                            if (obj == e10) {
                            }
                            ImagePickerResponse imagePickerResponse322 = (ImagePickerResponse) obj;
                            function1.isPickerOpen = false;
                            return imagePickerResponse322;
                        }
                    }
                    if (i10 != 0) {
                    }
                    c5141b2.f44962a = obj;
                    if (!imagePickerOptions2.getAllowsMultipleSelection()) {
                        u uVar2 = c3016k.new u(c5141b, imagePickerOptions2, null);
                        tVar.f31383a = c3016k;
                        tVar.f31384b = imagePickerOptions2;
                        tVar.f31385c = c5141b;
                        tVar.f31386d = c5141b;
                        tVar.f31389g = 2;
                        obj = c3016k.I(uVar2, tVar);
                        if (obj != e10) {
                        }
                    }
                    C3016k c3016k322 = c3016k;
                    C3018m c3018m22 = c3016k322.mediaHandler;
                    List a1022 = ((h.c) c5141b.f44962a).a();
                    tVar.f31383a = c3016k322;
                    tVar.f31384b = null;
                    tVar.f31385c = null;
                    tVar.f31386d = null;
                    tVar.f31389g = 3;
                    obj = c3018m22.h(a1022, imagePickerOptions2, tVar);
                    function1 = c3016k322;
                    if (obj == e10) {
                    }
                    ImagePickerResponse imagePickerResponse3222 = (ImagePickerResponse) obj;
                    function1.isPickerOpen = false;
                    return imagePickerResponse3222;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (OperationCanceledException unused2) {
            }
        } catch (OperationCanceledException unused3) {
            function1 = c3016k;
        } catch (Throwable th3) {
            th = th3;
            function1 = c3016k;
        }
        tVar = new t(dVar);
        obj = tVar.f31387e;
        e10 = AbstractC3868b.e();
        i10 = tVar.f31389g;
    }

    private final Object I(Function1 function1, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(C0874b0.b(), new v(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mb.c z(final pb.m promise) {
        final WeakReference a10 = pb.t.a(a().w());
        return new mb.c() { // from class: db.j
            @Override // mb.c
            public final void a(Map map) {
                C3016k.A(pb.m.this, a10, this, map);
            }
        };
    }

    public final Context E() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        wb.g kVar2;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExponentImagePicker");
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(Boolean.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(Boolean.class), false, j.f31368a));
            }
            bVar.k().put("requestMediaLibraryPermissionsAsync", new wb.f("requestMediaLibraryPermissionsAsync", new C0792a[]{c0792a}, new C0453k()));
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(Boolean.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(Boolean.class), false, l.f31370a));
            }
            bVar.k().put("getMediaLibraryPermissionsAsync", new wb.f("getMediaLibraryPermissionsAsync", new C0792a[]{c0792a2}, new m()));
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                kVar = new wb.f("requestCameraPermissionsAsync", new C0792a[0], new d());
            } else {
                C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(pb.m.class), bool));
                if (c0792a3 == null) {
                    c0792a3 = new C0792a(new M(C5142C.b(pb.m.class), false, e.f31363a));
                }
                C0792a[] c0792aArr = {c0792a3};
                f fVar = new f();
                kVar = Intrinsics.b(Unit.class, Integer.TYPE) ? new wb.k("requestCameraPermissionsAsync", c0792aArr, fVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("requestCameraPermissionsAsync", c0792aArr, fVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("requestCameraPermissionsAsync", c0792aArr, fVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("requestCameraPermissionsAsync", c0792aArr, fVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("requestCameraPermissionsAsync", c0792aArr, fVar) : new wb.e("requestCameraPermissionsAsync", c0792aArr, fVar);
            }
            bVar.k().put("requestCameraPermissionsAsync", kVar);
            if (Intrinsics.b(pb.m.class, pb.m.class)) {
                kVar2 = new wb.f("getCameraPermissionsAsync", new C0792a[0], new g());
            } else {
                C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(pb.m.class), bool));
                if (c0792a4 == null) {
                    c0792a4 = new C0792a(new M(C5142C.b(pb.m.class), false, h.f31366a));
                }
                C0792a[] c0792aArr2 = {c0792a4};
                i iVar = new i();
                kVar2 = Intrinsics.b(Unit.class, Integer.TYPE) ? new wb.k("getCameraPermissionsAsync", c0792aArr2, iVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new wb.h("getCameraPermissionsAsync", c0792aArr2, iVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new wb.i("getCameraPermissionsAsync", c0792aArr2, iVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new wb.j("getCameraPermissionsAsync", c0792aArr2, iVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("getCameraPermissionsAsync", c0792aArr2, iVar) : new wb.e("getCameraPermissionsAsync", c0792aArr2, iVar);
            }
            bVar.k().put("getCameraPermissionsAsync", kVar2);
            wb.d a10 = bVar.a("launchCameraAsync");
            String b11 = a10.b();
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ImagePickerOptions.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(ImagePickerOptions.class), false, n.f31372a));
            }
            a10.c(new wb.o(b11, new C0792a[]{c0792a5}, new o(null, this)));
            wb.d a11 = bVar.a("launchImageLibraryAsync");
            String b12 = a11.b();
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ImagePickerOptions.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new M(C5142C.b(ImagePickerOptions.class), false, p.f31376a));
            }
            a11.c(new wb.o(b12, new C0792a[]{c0792a6}, new q(null, this)));
            wb.d a12 = bVar.a("getPendingResultAsync");
            a12.c(new wb.o(a12.b(), new C0792a[0], new r(null, this)));
            bVar.p(new c(null));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
