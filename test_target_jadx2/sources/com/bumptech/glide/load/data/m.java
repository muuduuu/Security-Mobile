package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public class m extends b {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
