package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class I extends L {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20787d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f20788e = {"_id", "_data"};

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f20789c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, e3.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f20789c = contentResolver;
    }

    private final g4.i g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f20789c.openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            g4.i d10 = d(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
            Intrinsics.checkNotNullExpressionValue(d10, "this.getEncodedImage(Fil…criptor.statSize.toInt())");
            openFileDescriptor.close();
            return d10;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected g4.i e(m4.b imageRequest) {
        g4.i g10;
        InputStream createInputStream;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Uri u10 = imageRequest.u();
        Intrinsics.checkNotNullExpressionValue(u10, "imageRequest.sourceUri");
        if (!j3.f.j(u10)) {
            if (j3.f.i(u10) && (g10 = g(u10)) != null) {
                return g10;
            }
            InputStream openInputStream = this.f20789c.openInputStream(u10);
            if (openInputStream != null) {
                return d(openInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String uri = u10.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
        if (StringsKt.q(uri, "/photo", false, 2, null)) {
            createInputStream = this.f20789c.openInputStream(u10);
        } else {
            String uri2 = u10.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            if (StringsKt.q(uri2, "/display_photo", false, 2, null)) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = this.f20789c.openAssetFileDescriptor(u10, "r");
                    if (openAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    createInputStream = openAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + u10);
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f20789c, u10);
                if (openContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + u10);
                }
                createInputStream = openContactPhotoInputStream;
            }
        }
        if (createInputStream != null) {
            return d(createInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
