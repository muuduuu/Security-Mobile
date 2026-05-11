package com.canhub.cropper;

import F2.k;
import F2.l;
import F2.q;
import F2.s;
import F2.t;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC1397a;
import androidx.appcompat.app.c;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import e.AbstractC3061c;
import e.InterfaceC3060b;
import f.C3128c;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import xc.j;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002HLB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0005J\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b'\u0010(J/\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\r2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J1\u0010>\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\r2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-2\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\u0005J1\u0010B\u001a\u00020A2\b\u0010+\u001a\u0004\u0018\u00010\r2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-2\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010F\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u00106\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010IR\"\u0010Z\u001a\u0010\u0012\f\u0012\n W*\u0004\u0018\u00010V0V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\"\u0010\\\u001a\u0010\u0012\f\u0012\n W*\u0004\u0018\u00010\r0\r0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010Y¨\u0006^"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/d;", "Lcom/canhub/cropper/CropImageView$j;", "Lcom/canhub/cropper/CropImageView$f;", "<init>", "()V", BuildConfig.FLAVOR, "S", "Lcom/canhub/cropper/CropImageActivity$b;", "source", "K", "(Lcom/canhub/cropper/CropImageActivity$b;)V", "J", "Landroid/net/Uri;", "H", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "openSource", "Q", "(Lkotlin/jvm/functions/Function1;)V", "onStart", "onStop", "outState", "onSaveInstanceState", "Landroid/view/Menu;", "menu", BuildConfig.FLAVOR, "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "resultUri", "I", "(Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView;", "view", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", AppConstants.VIDEO_RECORDING_ERROR, "d", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/CropImageView$c;", "result", "e", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$c;)V", "F", "cropImageView", "N", "(Lcom/canhub/cropper/CropImageView;)V", BuildConfig.FLAVOR, "degrees", "M", "(I)V", "sampleSize", "O", "(Landroid/net/Uri;Ljava/lang/Exception;I)V", "P", "Landroid/content/Intent;", "G", "(Landroid/net/Uri;Ljava/lang/Exception;I)Landroid/content/Intent;", "itemId", "color", "U", "(Landroid/view/Menu;II)V", C4870a.f43493a, "Landroid/net/Uri;", "cropImageUri", "LF2/l;", "b", "LF2/l;", "cropImageOptions", "c", "Lcom/canhub/cropper/CropImageView;", "LH2/a;", "LH2/a;", "binding", "latestTmpUri", "Le/c;", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "f", "Le/c;", "pickImageGallery", "g", "takePicture", "h", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public class CropImageActivity extends androidx.appcompat.app.d implements CropImageView.j, CropImageView.f {

    /* renamed from: h, reason: collision with root package name */
    private static final a f20416h = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Uri cropImageUri;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l cropImageOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CropImageView cropImageView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private H2.a binding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Uri latestTmpUri;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3061c pickImageGallery;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3061c takePicture;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        CAMERA,
        GALLERY
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20424a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.CAMERA.ordinal()] = 1;
            iArr[b.GALLERY.ordinal()] = 2;
            f20424a = iArr;
        }
    }

    /* synthetic */ class d extends j implements Function1 {
        d(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        public final void I(b p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((CropImageActivity) this.f44980b).K(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            I((b) obj);
            return Unit.f36324a;
        }
    }

    public static final class e implements k.b {
        e() {
        }

        @Override // F2.k.b
        public void a(Uri uri) {
            CropImageActivity.this.I(uri);
        }

        @Override // F2.k.b
        public void b() {
            CropImageActivity.this.P();
        }
    }

    public CropImageActivity() {
        AbstractC3061c registerForActivityResult = registerForActivityResult(new C3128c(), new InterfaceC3060b() { // from class: F2.f
            @Override // e.InterfaceC3060b
            public final void a(Object obj) {
                CropImageActivity.L(CropImageActivity.this, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…mageResult(uri)\n        }");
        this.pickImageGallery = registerForActivityResult;
        AbstractC3061c registerForActivityResult2 = registerForActivityResult(new f.k(), new InterfaceC3060b() { // from class: F2.g
            @Override // e.InterfaceC3060b
            public final void a(Object obj) {
                CropImageActivity.T(CropImageActivity.this, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResul…ckImageResult(null)\n    }");
        this.takePicture = registerForActivityResult2;
    }

    private final Uri H() {
        File tmpFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        tmpFile.createNewFile();
        tmpFile.deleteOnExit();
        Intrinsics.checkNotNullExpressionValue(tmpFile, "tmpFile");
        return I2.c.a(this, tmpFile);
    }

    private final void J() {
        Uri H10 = H();
        this.latestTmpUri = H10;
        this.takePicture.a(H10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(b source) {
        int i10 = c.f20424a[source.ordinal()];
        if (i10 == 1) {
            J();
        } else {
            if (i10 != 2) {
                return;
            }
            this.pickImageGallery.a("image/*");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(CropImageActivity this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Function1 openSource, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(openSource, "$openSource");
        openSource.invoke(i10 == 0 ? b.CAMERA : b.GALLERY);
    }

    private final void S() {
        k kVar = new k(this, new e());
        l lVar = this.cropImageOptions;
        if (lVar == null) {
            Intrinsics.v("cropImageOptions");
            lVar = null;
        }
        String str = lVar.f2360z0;
        if (str != null) {
            if (StringsKt.Z(str)) {
                str = null;
            }
            if (str != null) {
                kVar.g(str);
            }
        }
        List list = lVar.f2299A0;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                kVar.h(list);
            }
        }
        kVar.i(lVar.f2317b, lVar.f2316a, lVar.f2317b ? H() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(CropImageActivity this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.I(it.booleanValue() ? this$0.latestTmpUri : null);
    }

    public void F() {
        l lVar = this.cropImageOptions;
        l lVar2 = null;
        if (lVar == null) {
            Intrinsics.v("cropImageOptions");
            lVar = null;
        }
        if (lVar.f2334m0) {
            O(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            l lVar3 = this.cropImageOptions;
            if (lVar3 == null) {
                Intrinsics.v("cropImageOptions");
                lVar3 = null;
            }
            Bitmap.CompressFormat compressFormat = lVar3.f2324h0;
            l lVar4 = this.cropImageOptions;
            if (lVar4 == null) {
                Intrinsics.v("cropImageOptions");
                lVar4 = null;
            }
            int i10 = lVar4.f2326i0;
            l lVar5 = this.cropImageOptions;
            if (lVar5 == null) {
                Intrinsics.v("cropImageOptions");
                lVar5 = null;
            }
            int i11 = lVar5.f2328j0;
            l lVar6 = this.cropImageOptions;
            if (lVar6 == null) {
                Intrinsics.v("cropImageOptions");
                lVar6 = null;
            }
            int i12 = lVar6.f2330k0;
            l lVar7 = this.cropImageOptions;
            if (lVar7 == null) {
                Intrinsics.v("cropImageOptions");
                lVar7 = null;
            }
            CropImageView.k kVar = lVar7.f2332l0;
            l lVar8 = this.cropImageOptions;
            if (lVar8 == null) {
                Intrinsics.v("cropImageOptions");
            } else {
                lVar2 = lVar8;
            }
            cropImageView.d(compressFormat, i10, i11, i12, kVar, lVar2.f2315Z);
        }
    }

    public Intent G(Uri uri, Exception error, int sampleSize) {
        CropImageView cropImageView = this.cropImageView;
        Uri uri2 = cropImageView != null ? cropImageView.getCo.hyperverge.hypersnapsdk.activities.HVRetakeActivity.IMAGE_URI_TAG java.lang.String() : null;
        CropImageView cropImageView2 = this.cropImageView;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.cropImageView;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.cropImageView;
        int mDegreesRotated = cropImageView4 != null ? cropImageView4.getMDegreesRotated() : 0;
        CropImageView cropImageView5 = this.cropImageView;
        F2.e eVar = new F2.e(uri2, uri, error, cropPoints, cropRect, mDegreesRotated, cropImageView5 != null ? cropImageView5.getWholeImageRect() : null, sampleSize);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", eVar);
        return intent;
    }

    protected void I(Uri resultUri) {
        if (resultUri == null) {
            P();
            return;
        }
        this.cropImageUri = resultUri;
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(resultUri);
        }
    }

    public void M(int degrees) {
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.l(degrees);
        }
    }

    public void N(CropImageView cropImageView) {
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        this.cropImageView = cropImageView;
    }

    public void O(Uri uri, Exception error, int sampleSize) {
        setResult(error != null ? 204 : -1, G(uri, error, sampleSize));
        finish();
    }

    public void P() {
        setResult(0);
        finish();
    }

    public void Q(final Function1 openSource) {
        Intrinsics.checkNotNullParameter(openSource, "openSource");
        new c.a(this).d(false).n(t.f2397c).g(new String[]{getString(t.f2396b), getString(t.f2398d)}, new DialogInterface.OnClickListener() { // from class: F2.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CropImageActivity.R(Function1.this, dialogInterface, i10);
            }
        }).q();
    }

    public void U(Menu menu, int itemId, int color) {
        Drawable icon;
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem findItem = menu.findItem(itemId);
        if (findItem == null || (icon = findItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(androidx.core.graphics.a.a(color, androidx.core.graphics.b.SRC_ATOP));
            findItem.setIcon(icon);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to update menu item color", e10);
        }
    }

    @Override // com.canhub.cropper.CropImageView.j
    public void d(CropImageView view, Uri uri, Exception error) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(uri, "uri");
        l lVar = null;
        if (error != null) {
            O(null, error, 1);
            return;
        }
        l lVar2 = this.cropImageOptions;
        if (lVar2 == null) {
            Intrinsics.v("cropImageOptions");
            lVar2 = null;
        }
        if (lVar2.f2336n0 != null && (cropImageView2 = this.cropImageView) != null) {
            l lVar3 = this.cropImageOptions;
            if (lVar3 == null) {
                Intrinsics.v("cropImageOptions");
                lVar3 = null;
            }
            cropImageView2.setCropRect(lVar3.f2336n0);
        }
        l lVar4 = this.cropImageOptions;
        if (lVar4 == null) {
            Intrinsics.v("cropImageOptions");
            lVar4 = null;
        }
        if (lVar4.f2338o0 > 0 && (cropImageView = this.cropImageView) != null) {
            l lVar5 = this.cropImageOptions;
            if (lVar5 == null) {
                Intrinsics.v("cropImageOptions");
                lVar5 = null;
            }
            cropImageView.setRotatedDegrees(lVar5.f2338o0);
        }
        l lVar6 = this.cropImageOptions;
        if (lVar6 == null) {
            Intrinsics.v("cropImageOptions");
        } else {
            lVar = lVar6;
        }
        if (lVar.f2356x0) {
            F();
        }
    }

    @Override // com.canhub.cropper.CropImageView.f
    public void e(CropImageView view, CropImageView.c result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(result, "result");
        O(result.g(), result.c(), result.f());
    }

    @Override // androidx.activity.f, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        P();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Uri uri;
        CharSequence string;
        super.onCreate(savedInstanceState);
        H2.a c10 = H2.a.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(layoutInflater)");
        this.binding = c10;
        l lVar = null;
        if (c10 == null) {
            Intrinsics.v("binding");
            c10 = null;
        }
        setContentView(c10.b());
        H2.a aVar = this.binding;
        if (aVar == null) {
            Intrinsics.v("binding");
            aVar = null;
        }
        CropImageView cropImageView = aVar.f3084b;
        Intrinsics.checkNotNullExpressionValue(cropImageView, "binding.cropImageView");
        N(cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.cropImageUri = bundleExtra != null ? (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE") : null;
        l lVar2 = bundleExtra != null ? (l) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS") : null;
        if (lVar2 == null) {
            lVar2 = new l();
        }
        this.cropImageOptions = lVar2;
        if (savedInstanceState == null) {
            Uri uri2 = this.cropImageUri;
            if (uri2 == null || Intrinsics.b(uri2, Uri.EMPTY)) {
                l lVar3 = this.cropImageOptions;
                if (lVar3 == null) {
                    Intrinsics.v("cropImageOptions");
                    lVar3 = null;
                }
                if (lVar3.f2358y0) {
                    S();
                } else {
                    l lVar4 = this.cropImageOptions;
                    if (lVar4 == null) {
                        Intrinsics.v("cropImageOptions");
                        lVar4 = null;
                    }
                    if (lVar4.f2316a) {
                        l lVar5 = this.cropImageOptions;
                        if (lVar5 == null) {
                            Intrinsics.v("cropImageOptions");
                            lVar5 = null;
                        }
                        if (lVar5.f2317b) {
                            Q(new d(this));
                        }
                    }
                    l lVar6 = this.cropImageOptions;
                    if (lVar6 == null) {
                        Intrinsics.v("cropImageOptions");
                        lVar6 = null;
                    }
                    if (lVar6.f2316a) {
                        this.pickImageGallery.a("image/*");
                    } else {
                        l lVar7 = this.cropImageOptions;
                        if (lVar7 == null) {
                            Intrinsics.v("cropImageOptions");
                            lVar7 = null;
                        }
                        if (lVar7.f2317b) {
                            J();
                        } else {
                            finish();
                        }
                    }
                }
            } else {
                CropImageView cropImageView2 = this.cropImageView;
                if (cropImageView2 != null) {
                    cropImageView2.setImageUriAsync(this.cropImageUri);
                }
            }
        } else {
            String string2 = savedInstanceState.getString("bundle_key_tmp_uri");
            if (string2 != null) {
                uri = Uri.parse(string2);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
            } else {
                uri = null;
            }
            this.latestTmpUri = uri;
        }
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            l lVar8 = this.cropImageOptions;
            if (lVar8 == null) {
                Intrinsics.v("cropImageOptions");
                lVar8 = null;
            }
            if (lVar8.f2313X.length() > 0) {
                l lVar9 = this.cropImageOptions;
                if (lVar9 == null) {
                    Intrinsics.v("cropImageOptions");
                } else {
                    lVar = lVar9;
                }
                string = lVar.f2313X;
            } else {
                string = getResources().getString(t.f2395a);
            }
            setTitle(string);
            supportActionBar.s(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Drawable drawable2;
        l lVar;
        Intrinsics.checkNotNullParameter(menu, "menu");
        l lVar2 = this.cropImageOptions;
        l lVar3 = null;
        if (lVar2 == null) {
            Intrinsics.v("cropImageOptions");
            lVar2 = null;
        }
        if (lVar2.f2356x0) {
            return true;
        }
        getMenuInflater().inflate(s.f2394a, menu);
        l lVar4 = this.cropImageOptions;
        if (lVar4 == null) {
            Intrinsics.v("cropImageOptions");
            lVar4 = null;
        }
        if (lVar4.f2340p0) {
            l lVar5 = this.cropImageOptions;
            if (lVar5 == null) {
                Intrinsics.v("cropImageOptions");
                lVar5 = null;
            }
            if (lVar5.f2344r0) {
                menu.findItem(q.f2390h).setVisible(true);
            }
        } else {
            menu.removeItem(q.f2390h);
            menu.removeItem(q.f2391i);
        }
        l lVar6 = this.cropImageOptions;
        if (lVar6 == null) {
            Intrinsics.v("cropImageOptions");
            lVar6 = null;
        }
        if (!lVar6.f2342q0) {
            menu.removeItem(q.f2387e);
        }
        l lVar7 = this.cropImageOptions;
        if (lVar7 == null) {
            Intrinsics.v("cropImageOptions");
            lVar7 = null;
        }
        if (lVar7.f2352v0 != null) {
            MenuItem findItem = menu.findItem(q.f2386d);
            l lVar8 = this.cropImageOptions;
            if (lVar8 == null) {
                Intrinsics.v("cropImageOptions");
                lVar8 = null;
            }
            findItem.setTitle(lVar8.f2352v0);
        }
        try {
            l lVar9 = this.cropImageOptions;
            if (lVar9 == null) {
                Intrinsics.v("cropImageOptions");
                lVar9 = null;
            }
            if (lVar9.f2354w0 != 0) {
                l lVar10 = this.cropImageOptions;
                if (lVar10 == null) {
                    Intrinsics.v("cropImageOptions");
                    lVar10 = null;
                }
                drawable2 = androidx.core.content.a.e(this, lVar10.f2354w0);
                try {
                    menu.findItem(q.f2386d).setIcon(drawable2);
                } catch (Exception e10) {
                    drawable = drawable2;
                    e = e10;
                    Log.w("AIC", "Failed to read menu crop drawable", e);
                    drawable2 = drawable;
                    lVar = this.cropImageOptions;
                    if (lVar == null) {
                    }
                    if (lVar.f2314Y != 0) {
                    }
                    return true;
                }
            } else {
                drawable2 = null;
            }
        } catch (Exception e11) {
            e = e11;
            drawable = null;
        }
        lVar = this.cropImageOptions;
        if (lVar == null) {
            Intrinsics.v("cropImageOptions");
            lVar = null;
        }
        if (lVar.f2314Y != 0) {
            int i10 = q.f2390h;
            l lVar11 = this.cropImageOptions;
            if (lVar11 == null) {
                Intrinsics.v("cropImageOptions");
                lVar11 = null;
            }
            U(menu, i10, lVar11.f2314Y);
            int i11 = q.f2391i;
            l lVar12 = this.cropImageOptions;
            if (lVar12 == null) {
                Intrinsics.v("cropImageOptions");
                lVar12 = null;
            }
            U(menu, i11, lVar12.f2314Y);
            int i12 = q.f2387e;
            l lVar13 = this.cropImageOptions;
            if (lVar13 == null) {
                Intrinsics.v("cropImageOptions");
                lVar13 = null;
            }
            U(menu, i12, lVar13.f2314Y);
            if (drawable2 != null) {
                int i13 = q.f2386d;
                l lVar14 = this.cropImageOptions;
                if (lVar14 == null) {
                    Intrinsics.v("cropImageOptions");
                } else {
                    lVar3 = lVar14;
                }
                U(menu, i13, lVar3.f2314Y);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == q.f2386d) {
            F();
            return true;
        }
        l lVar = null;
        if (itemId == q.f2390h) {
            l lVar2 = this.cropImageOptions;
            if (lVar2 == null) {
                Intrinsics.v("cropImageOptions");
            } else {
                lVar = lVar2;
            }
            M(-lVar.f2346s0);
            return true;
        }
        if (itemId == q.f2391i) {
            l lVar3 = this.cropImageOptions;
            if (lVar3 == null) {
                Intrinsics.v("cropImageOptions");
            } else {
                lVar = lVar3;
            }
            M(lVar.f2346s0);
            return true;
        }
        if (itemId == q.f2388f) {
            CropImageView cropImageView = this.cropImageView;
            if (cropImageView == null) {
                return true;
            }
            cropImageView.e();
            return true;
        }
        if (itemId != q.f2389g) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(item);
            }
            P();
            return true;
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 == null) {
            return true;
        }
        cropImageView2.f();
        return true;
    }

    @Override // androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("bundle_key_tmp_uri", String.valueOf(this.latestTmpUri));
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }
}
