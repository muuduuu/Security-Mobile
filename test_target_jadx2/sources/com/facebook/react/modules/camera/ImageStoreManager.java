package com.facebook.react.modules.camera;

import K4.a;
import android.net.Uri;
import android.util.Base64OutputStream;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageStoreManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@a(name = "ImageStoreManager")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager;", "Lcom/facebook/fbreact/specs/NativeImageStoreAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", BuildConfig.FLAVOR, "uri", "Lcom/facebook/react/bridge/Callback;", "success", AppConstants.VIDEO_RECORDING_ERROR, BuildConfig.FLAVOR, "getBase64ForTag", "(Ljava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "Companion", C4870a.f43493a, "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "ImageStoreManager";

    /* renamed from: com.facebook.react.modules.camera.ImageStoreManager$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        public final String c(InputStream inputStream) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[ImageStoreManager.BUFFER_SIZE];
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= -1) {
                        b(base64OutputStream);
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        Intrinsics.checkNotNullExpressionValue(byteArrayOutputStream2, "toString(...)");
                        return byteArrayOutputStream2;
                    }
                    base64OutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    b(base64OutputStream);
                    throw th;
                }
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager this$0, String uri, Callback success, Callback error) {
        Companion companion;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        try {
            InputStream openInputStream = this$0.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(uri));
            Intrinsics.e(openInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    companion = INSTANCE;
                    success.invoke(companion.c(openInputStream));
                } catch (IOException e10) {
                    error.invoke(e10.getMessage());
                    companion = INSTANCE;
                }
                companion.b(openInputStream);
            } catch (Throwable th) {
                INSTANCE.b(openInputStream);
                throw th;
            }
        } catch (FileNotFoundException e11) {
            error.invoke(e11.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(final String uri, final Callback success, final Callback error) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: N4.a
            @Override // java.lang.Runnable
            public final void run() {
                ImageStoreManager.getBase64ForTag$lambda$0(ImageStoreManager.this, uri, success, error);
            }
        });
    }
}
