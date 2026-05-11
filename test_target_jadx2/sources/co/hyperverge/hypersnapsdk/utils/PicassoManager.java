package co.hyperverge.hypersnapsdk.utils;

import Td.B;
import Td.C1227c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.PicassoManager;
import com.squareup.picasso.D;
import com.squareup.picasso.InterfaceC2928e;
import com.squareup.picasso.u;
import com.squareup.picasso.y;
import java.io.File;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001c\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lco/hyperverge/hypersnapsdk/utils/PicassoManager;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", BuildConfig.FLAVOR, "logError", "(Ljava/lang/Exception;)V", "Lcom/squareup/picasso/t;", "createOkHttp3Downloader", "(Landroid/content/Context;)Lcom/squareup/picasso/t;", BuildConfig.FLAVOR, "httpUrl", "prefetchImage", "(Ljava/lang/String;)V", "Lco/hyperverge/hypersnapsdk/utils/PicassoManager$ImageDownloaderCallback;", "callback", "getBitmap", "(Ljava/lang/String;Lco/hyperverge/hypersnapsdk/utils/PicassoManager$ImageDownloaderCallback;)V", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorDrawable", "Landroid/widget/ImageView;", "imageView", "loadInto", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/widget/ImageView;)V", "Lcom/squareup/picasso/u;", "picasso", "Lcom/squareup/picasso/u;", "Companion", "ImageDownloaderCallback", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PicassoManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PicassoUtils";
    private static PicassoManager instance;
    private final com.squareup.picasso.u picasso;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lco/hyperverge/hypersnapsdk/utils/PicassoManager$Companion;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "instance", "Lco/hyperverge/hypersnapsdk/utils/PicassoManager;", "getInstance", "context", "Landroid/content/Context;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PicassoManager getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (PicassoManager.instance == null) {
                PicassoManager.instance = new PicassoManager(context, defaultConstructorMarker);
            }
            PicassoManager picassoManager = PicassoManager.instance;
            if (picassoManager != null) {
                return picassoManager;
            }
            Intrinsics.v("instance");
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lco/hyperverge/hypersnapsdk/utils/PicassoManager$ImageDownloaderCallback;", BuildConfig.FLAVOR, "onError", BuildConfig.FLAVOR, Keys.ERROR_MESSAGE, BuildConfig.FLAVOR, "onSuccess", "bitmap", "Landroid/graphics/Bitmap;", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ImageDownloaderCallback {
        void onError(String errorMessage);

        void onSuccess(Bitmap bitmap);
    }

    public /* synthetic */ PicassoManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.squareup.picasso.t createOkHttp3Downloader(Context context) {
        SSLContext sSLContext;
        NoSuchAlgorithmException e10;
        KeyManagementException e11;
        File file;
        HVLogUtils.d(TAG, "createOkHttp3Downloader() called with: context = " + context);
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: co.hyperverge.hypersnapsdk.utils.PicassoManager$createOkHttp3Downloader$trustAllCertificates$1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Intrinsics.checkNotNullParameter(authType, "authType");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Intrinsics.checkNotNullParameter(authType, "authType");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            sSLContext = SSLContext.getInstance("TLS");
            try {
                sSLContext.init(null, trustManagerArr, new SecureRandom());
            } catch (KeyManagementException e12) {
                e11 = e12;
                logError(e11);
                B.a aVar = new B.a();
                if (sSLContext != null) {
                }
                file = new File(context.getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                }
                return new com.squareup.picasso.t(aVar.d(new C1227c(file, 5242880L)).c());
            } catch (NoSuchAlgorithmException e13) {
                e10 = e13;
                logError(e10);
                B.a aVar2 = new B.a();
                if (sSLContext != null) {
                }
                file = new File(context.getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                }
                return new com.squareup.picasso.t(aVar2.d(new C1227c(file, 5242880L)).c());
            }
        } catch (KeyManagementException e14) {
            sSLContext = null;
            e11 = e14;
        } catch (NoSuchAlgorithmException e15) {
            sSLContext = null;
            e10 = e15;
        }
        B.a aVar22 = new B.a();
        if (sSLContext != null) {
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            TrustManager trustManager = trustManagerArr[0];
            Intrinsics.e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            aVar22.h0(socketFactory, (X509TrustManager) trustManager);
            aVar22.Y(new HostnameVerifier() { // from class: co.hyperverge.hypersnapsdk.utils.q
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    boolean createOkHttp3Downloader$lambda$0;
                    createOkHttp3Downloader$lambda$0 = PicassoManager.createOkHttp3Downloader$lambda$0(str, sSLSession);
                    return createOkHttp3Downloader$lambda$0;
                }
            });
        }
        file = new File(context.getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new com.squareup.picasso.t(aVar22.d(new C1227c(file, 5242880L)).c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createOkHttp3Downloader$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }

    public static final PicassoManager getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public static /* synthetic */ void loadInto$default(PicassoManager picassoManager, String str, Drawable drawable, Drawable drawable2, ImageView imageView, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            drawable = null;
        }
        if ((i10 & 4) != 0) {
            drawable2 = null;
        }
        picassoManager.loadInto(str, drawable, drawable2, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logError(Exception e10) {
        HVLogUtils.d(TAG, "logError() called with: e = " + e10);
        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
        }
    }

    public final void getBitmap(String httpUrl, final ImageDownloaderCallback callback) {
        HVLogUtils.d(TAG, "getBitmap() called with: httpUrl = " + httpUrl + ", callback = " + callback);
        this.picasso.j(httpUrl).h(new D() { // from class: co.hyperverge.hypersnapsdk.utils.PicassoManager$getBitmap$1
            @Override // com.squareup.picasso.D
            public void onBitmapFailed(Exception e10, Drawable errorDrawable) {
                Intrinsics.checkNotNullParameter(e10, "e");
                this.logError(e10);
                PicassoManager.ImageDownloaderCallback imageDownloaderCallback = PicassoManager.ImageDownloaderCallback.this;
                if (imageDownloaderCallback != null) {
                    imageDownloaderCallback.onError(e10.getMessage());
                }
            }

            @Override // com.squareup.picasso.D
            public void onBitmapLoaded(Bitmap bitmap, u.e from) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Intrinsics.checkNotNullParameter(from, "from");
                PicassoManager.ImageDownloaderCallback imageDownloaderCallback = PicassoManager.ImageDownloaderCallback.this;
                if (imageDownloaderCallback != null) {
                    imageDownloaderCallback.onSuccess(bitmap);
                }
            }

            @Override // com.squareup.picasso.D
            public void onPrepareLoad(Drawable placeHolderDrawable) {
            }
        });
    }

    public final void loadInto(String httpUrl, Drawable placeholderDrawable, Drawable errorDrawable, ImageView imageView) {
        HVLogUtils.d(TAG, "loadInto() called with: httpUrl = " + httpUrl + ", placeholderDrawable = " + placeholderDrawable + ", errorDrawable = " + errorDrawable + ", imageView = " + imageView);
        y j10 = this.picasso.j(httpUrl);
        if (placeholderDrawable != null) {
            j10.i(placeholderDrawable);
        }
        if (errorDrawable != null) {
            j10.c(errorDrawable);
        }
        j10.f(imageView);
    }

    public final void prefetchImage(String httpUrl) {
        HVLogUtils.d(TAG, "prefetchImage() called with: httpUrl = " + httpUrl);
        this.picasso.j(httpUrl).d(new InterfaceC2928e() { // from class: co.hyperverge.hypersnapsdk.utils.PicassoManager$prefetchImage$1
            @Override // com.squareup.picasso.InterfaceC2928e
            public void onError(Exception e10) {
                Intrinsics.checkNotNullParameter(e10, "e");
                PicassoManager.this.logError(e10);
            }

            @Override // com.squareup.picasso.InterfaceC2928e
            public void onSuccess() {
            }
        });
    }

    private PicassoManager(Context context) {
        com.squareup.picasso.u a10 = new u.b(context).b(createOkHttp3Downloader(context)).c(false).a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder(context)\n       …lse)\n            .build()");
        this.picasso = a10;
    }
}
