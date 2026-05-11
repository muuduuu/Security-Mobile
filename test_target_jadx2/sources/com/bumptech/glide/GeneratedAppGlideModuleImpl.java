package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.avif.AvifGlideModule;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.github.penfeizhou.animation.glide.GlideAnimationModule;
import expo.modules.image.ExpoImageAppGlideModule;
import expo.modules.image.blurhash.BlurhashModule;
import expo.modules.image.dataurls.Base64Module;
import expo.modules.image.decodedsource.DecodedModule;
import expo.modules.image.okhttp.ExpoImageOkHttpClientGlideModule;
import expo.modules.image.svg.SVGModule;
import expo.modules.image.thumbhash.ThumbhashModule;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a, reason: collision with root package name */
    private final ExpoImageAppGlideModule f20202a = new ExpoImageAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: expo.modules.image.ExpoImageAppGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.avif.AvifGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.github.penfeizhou.animation.glide.GlideAnimationModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: expo.modules.image.blurhash.BlurhashModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: expo.modules.image.dataurls.Base64Module");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: expo.modules.image.decodedsource.DecodedModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: expo.modules.image.okhttp.ExpoImageOkHttpClientGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: expo.modules.image.svg.SVGModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: expo.modules.image.thumbhash.ThumbhashModule");
        }
    }

    @Override // y2.AbstractC5165b
    public void a(Context context, c cVar, i iVar) {
        new AvifGlideModule().a(context, cVar, iVar);
        new OkHttpLibraryGlideModule().a(context, cVar, iVar);
        new GlideAnimationModule().a(context, cVar, iVar);
        new BlurhashModule().a(context, cVar, iVar);
        new Base64Module().a(context, cVar, iVar);
        new DecodedModule().a(context, cVar, iVar);
        new ExpoImageOkHttpClientGlideModule().a(context, cVar, iVar);
        new SVGModule().a(context, cVar, iVar);
        new ThumbhashModule().a(context, cVar, iVar);
        this.f20202a.a(context, cVar, iVar);
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public void b(Context context, d dVar) {
        this.f20202a.b(context, dVar);
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean c() {
        return this.f20202a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set d() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a();
    }
}
