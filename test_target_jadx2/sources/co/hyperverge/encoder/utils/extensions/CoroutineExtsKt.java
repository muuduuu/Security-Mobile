package co.hyperverge.encoder.utils.extensions;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.J;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aG\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001aG\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "LJd/J;", "dispatcher", "Lkotlin/Function2;", "LJd/N;", "Lkotlin/coroutines/d;", BuildConfig.FLAVOR, "block", "onUI", "(LJd/J;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onIO", "onDefault", "hv-bitmaps-to-video_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutineExtsKt {
    public static final /* synthetic */ Object onDefault(J j10, Function2 function2, d dVar) {
        return AbstractC0887i.g(j10, new CoroutineExtsKt$onDefault$2(function2, null), dVar);
    }

    public static /* synthetic */ Object onDefault$default(J j10, Function2 function2, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = C0874b0.a();
        }
        return onDefault(j10, function2, dVar);
    }

    public static final /* synthetic */ Object onIO(J j10, Function2 function2, d dVar) {
        return AbstractC0887i.g(j10, new CoroutineExtsKt$onIO$2(function2, null), dVar);
    }

    public static /* synthetic */ Object onIO$default(J j10, Function2 function2, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = C0874b0.b();
        }
        return onIO(j10, function2, dVar);
    }

    public static final /* synthetic */ Object onUI(J j10, Function2 function2, d dVar) {
        return AbstractC0887i.g(j10, new CoroutineExtsKt$onUI$2(function2, null), dVar);
    }

    public static /* synthetic */ Object onUI$default(J j10, Function2 function2, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = C0874b0.c();
        }
        return onUI(j10, function2, dVar);
    }
}
