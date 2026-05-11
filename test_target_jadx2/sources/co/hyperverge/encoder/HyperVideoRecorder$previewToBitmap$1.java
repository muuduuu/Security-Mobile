package co.hyperverge.encoder;

import Jd.N;
import android.app.Application;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.m;
import co.hyperverge.encoder.utils.extensions.CoroutineExtsKt;
import co.hyperverge.encoder.utils.extensions.LogExtsKt;
import co.hyperverge.hyperlogger.HyperLogger;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.o;
import lc.p;
import pc.AbstractC3868b;
import xc.C5141B;

@f(c = "co.hyperverge.encoder.HyperVideoRecorder$previewToBitmap$1", f = "HyperVideoRecorder.kt", l = {136}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HyperVideoRecorder$previewToBitmap$1 extends l implements Function2<N, d<? super Unit>, Object> {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ HyperVideoRecorder this$0;

    @f(c = "co.hyperverge.encoder.HyperVideoRecorder$previewToBitmap$1$1", f = "HyperVideoRecorder.kt", l = {149, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: co.hyperverge.encoder.HyperVideoRecorder$previewToBitmap$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements Function2<N, d<? super Unit>, Object> {
        final /* synthetic */ View $view;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ HyperVideoRecorder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HyperVideoRecorder hyperVideoRecorder, View view, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = hyperVideoRecorder;
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$view, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0094 A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:54:0x002c, B:55:0x007d, B:57:0x0094), top: B:53:0x002c }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            HyperVideoRecorder hyperVideoRecorder;
            N n10;
            Throwable th;
            String str;
            String str2;
            N n11;
            Bitmap bitmap;
            Object b10;
            Throwable d10;
            String canonicalName;
            String str3;
            Object obj2;
            String className;
            Object e10 = AbstractC3868b.e();
            int i10 = this.label;
            if (i10 == 0) {
                p.b(obj);
                N n12 = (N) this.L$0;
                hyperVideoRecorder = this.this$0;
                View view = this.$view;
                try {
                    o.a aVar = o.f37128b;
                    str = hyperVideoRecorder.cameraPreviewTag;
                } catch (Throwable th2) {
                    n10 = n12;
                    th = th2;
                    o.a aVar2 = o.f37128b;
                    b10 = o.b(p.a(th));
                    d10 = o.d(b10);
                    if (d10 != null) {
                    }
                    return Unit.f36324a;
                }
                if (str != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    str2 = hyperVideoRecorder.cameraPreviewTag;
                    view.findViewsWithText(arrayList, str2, 2);
                    if (!arrayList.isEmpty()) {
                        View view2 = arrayList.get(0);
                        Intrinsics.checkNotNullExpressionValue(view2, "cameraPreviews[0]");
                        View view3 = view2;
                        if (!(view3 instanceof m)) {
                            if (!(view3 instanceof TextureView)) {
                                throw new IllegalArgumentException("Unsupported preview type");
                            }
                            Bitmap bitmap2 = ((TextureView) view3).getBitmap();
                            n11 = n12;
                            bitmap = bitmap2;
                            if (bitmap != null) {
                            }
                            n10 = n11;
                            b10 = o.b(Unit.f36324a);
                            d10 = o.d(b10);
                            if (d10 != null) {
                            }
                            return Unit.f36324a;
                        }
                        HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1 hyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1 = new HyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1(view3, null);
                        this.L$0 = n12;
                        this.L$1 = hyperVideoRecorder;
                        this.label = 1;
                        Object onUI$default = CoroutineExtsKt.onUI$default(null, hyperVideoRecorder$previewToBitmap$1$1$1$previewBitmap$1, this, 1, null);
                        if (onUI$default == e10) {
                            return e10;
                        }
                        n11 = n12;
                        obj = onUI$default;
                        bitmap = (Bitmap) obj;
                        if (bitmap != null) {
                        }
                        n10 = n11;
                        b10 = o.b(Unit.f36324a);
                        d10 = o.d(b10);
                        if (d10 != null) {
                        }
                        return Unit.f36324a;
                    }
                }
                n10 = n12;
                b10 = o.b(Unit.f36324a);
                d10 = o.d(b10);
                if (d10 != null) {
                }
                return Unit.f36324a;
            }
            if (i10 == 1) {
                hyperVideoRecorder = (HyperVideoRecorder) this.L$1;
                n11 = (N) this.L$0;
                try {
                    p.b(obj);
                    bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        HyperVideoRecorder$previewToBitmap$1$1$1$1 hyperVideoRecorder$previewToBitmap$1$1$1$1 = new HyperVideoRecorder$previewToBitmap$1$1$1$1(hyperVideoRecorder, bitmap, null);
                        this.L$0 = n11;
                        this.L$1 = null;
                        this.label = 2;
                        if (CoroutineExtsKt.onUI$default(null, hyperVideoRecorder$previewToBitmap$1$1$1$1, this, 1, null) == e10) {
                            return e10;
                        }
                    }
                    n10 = n11;
                    b10 = o.b(Unit.f36324a);
                } catch (Throwable th3) {
                    th = th3;
                    n10 = n11;
                    o.a aVar22 = o.f37128b;
                    b10 = o.b(p.a(th));
                    d10 = o.d(b10);
                    if (d10 != null) {
                    }
                    return Unit.f36324a;
                }
                d10 = o.d(b10);
                if (d10 != null) {
                }
                return Unit.f36324a;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n10 = (N) this.L$0;
            try {
                p.b(obj);
                b10 = o.b(Unit.f36324a);
            } catch (Throwable th4) {
                th = th4;
                o.a aVar222 = o.f37128b;
                b10 = o.b(p.a(th));
                d10 = o.d(b10);
                if (d10 != null) {
                }
                return Unit.f36324a;
            }
            d10 = o.d(b10);
            if (d10 != null) {
                HyperLogger.Level level = HyperLogger.Level.ERROR;
                HyperLogger companion = HyperLogger.INSTANCE.getInstance();
                StringBuilder sb2 = new StringBuilder();
                C5141B c5141b = new C5141B();
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                StackTraceElement stackTraceElement = (StackTraceElement) AbstractC3574i.A(stackTrace);
                if (stackTraceElement == null || (className = stackTraceElement.getClassName()) == null || (canonicalName = StringsKt.L0(className, '.', null, 2, null)) == null) {
                    canonicalName = n10 != null ? n10.getClass().getCanonicalName() : null;
                    if (canonicalName == null) {
                        canonicalName = "N/A";
                    }
                }
                c5141b.f44962a = canonicalName;
                Matcher matcher = LogExtsKt.ANON_CLASS_PATTERN.matcher((CharSequence) c5141b.f44962a);
                boolean find = matcher.find();
                Object obj3 = org.conscrypt.BuildConfig.FLAVOR;
                if (find) {
                    String replaceAll = matcher.replaceAll(org.conscrypt.BuildConfig.FLAVOR);
                    Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(\"\")");
                    c5141b.f44962a = replaceAll;
                }
                if (((String) c5141b.f44962a).length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                    str3 = (String) c5141b.f44962a;
                } else {
                    str3 = ((String) c5141b.f44962a).substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb2.append(str3);
                sb2.append(" - ");
                String str4 = "previewToBitmap() " + d10.getClass() + ": " + d10.getMessage();
                if (str4 == null) {
                    str4 = "null ";
                }
                sb2.append(str4);
                sb2.append(' ');
                sb2.append(org.conscrypt.BuildConfig.FLAVOR);
                companion.log(level, sb2.toString());
                try {
                    Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                    Intrinsics.e(invoke, "null cannot be cast to non-null type android.app.Application");
                    obj2 = o.b(((Application) invoke).getPackageName());
                } catch (Throwable th5) {
                    o.a aVar3 = o.f37128b;
                    obj2 = o.b(p.a(th5));
                }
                if (!o.f(obj2)) {
                    obj3 = obj2;
                }
            }
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperVideoRecorder$previewToBitmap$1(HyperVideoRecorder hyperVideoRecorder, View view, d<? super HyperVideoRecorder$previewToBitmap$1> dVar) {
        super(2, dVar);
        this.this$0 = hyperVideoRecorder;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperVideoRecorder$previewToBitmap$1(this.this$0, this.$view, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HyperVideoRecorder$previewToBitmap$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$view, null);
            this.label = 1;
            if (CoroutineExtsKt.onDefault$default(null, anonymousClass1, this, 1, null) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
        }
        return Unit.f36324a;
    }
}
