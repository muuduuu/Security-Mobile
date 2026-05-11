package com.webengage.sdk.android.actions.render;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.PushUtils;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class d extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: n, reason: collision with root package name */
    private Long f30319n = null;

    /* renamed from: o, reason: collision with root package name */
    private int f30320o = 0;

    /* renamed from: p, reason: collision with root package name */
    private String f30321p = "right";

    /* renamed from: q, reason: collision with root package name */
    private int f30322q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f30323r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f30324s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f30325t = 0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f30326u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f30327v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f30328w = false;

    d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.util.Pair<java.lang.Integer, android.graphics.Bitmap>] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private Pair<Integer, Bitmap> a(int i10, int i11, int i12) {
        List<CarouselV1CallToAction> callToActions;
        InputStream inputStream;
        ?? r12 = 0;
        r12 = 0;
        r12 = 0;
        if (this.f30383b.getCarouselV1Data() != null && (callToActions = this.f30383b.getCarouselV1Data().getCallToActions()) != null) {
            int i13 = i10;
            do {
                try {
                    inputStream = (InputStream) WENetworkUtil.makeRequest(this.f30382a, new RequestObject.Builder(callToActions.get(i13).getImageURL(), RequestMethod.GET, this.f30382a).setCachePolicy(4).build(), true, true).get("data");
                    try {
                        Bitmap a10 = a(inputStream);
                        if (a10 != null) {
                            r12 = Pair.create(Integer.valueOf(i13), a10);
                            break;
                        }
                        i13 = (i11 == 1 ? i13 + 1 : (i13 - 1) + i12) % i12;
                        inputStream.close();
                    } catch (Exception unused) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                } catch (Exception unused2) {
                    inputStream = r12;
                }
            } while (i13 != i10);
        }
        return r12;
    }

    private RemoteViews m() {
        RemoteViews h10 = h();
        if (this.f30328w) {
            h10.setInt(R.id.custom_message, "setMaxLines", 2);
            h10.setInt(R.id.custom_message_native, "setMaxLines", 2);
            h10.setBoolean(R.id.custom_title, "setSingleLine", false);
            h10.setBoolean(R.id.custom_title_native, "setSingleLine", false);
            h10.setInt(R.id.custom_title, "setMaxLines", 2);
            h10.setInt(R.id.custom_title_native, "setMaxLines", 2);
        }
        h10.setViewVisibility(R.id.custom_base_container, 0);
        h10.setOnClickPendingIntent(R.id.custom_base_container, null);
        PushNotificationData.CarouselV1 carouselV1Data = this.f30383b.getCarouselV1Data();
        if (carouselV1Data != null) {
            h10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(carouselV1Data.getBigContentTitle()));
            h10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(carouselV1Data.getMessage()));
            h10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(carouselV1Data.getBigContentTitle()));
            h10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(carouselV1Data.getMessage()));
            if (TextUtils.isEmpty(carouselV1Data.getSummary())) {
                h10.setViewVisibility(R.id.custom_summary, 8);
                h10.setViewVisibility(R.id.custom_summary_native, 8);
            } else {
                h10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(carouselV1Data.getSummary()));
                h10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(carouselV1Data.getSummary()));
            }
        }
        if (this.f30328w) {
            h10.setViewVisibility(R.id.custom_small_head_container, 8);
            h10.setViewPadding(R.id.custom_head_container, !this.f30327v ? 0 : this.f30382a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg), 0, 0, 0);
        }
        if (this.f30327v) {
            h10.setInt(R.id.push_base_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
        }
        return h10;
    }

    private void n() {
        this.f30388g.setViewVisibility(R.id.app_name, 8);
        this.f30388g.setViewVisibility(R.id.custom_summary, 8);
        this.f30388g.setViewVisibility(R.id.custom_notification_time, 8);
        this.f30388g.setViewVisibility(R.id.custom_title, 8);
        this.f30388g.setViewVisibility(R.id.custom_message, 8);
    }

    private void o() {
        this.f30388g.setViewVisibility(R.id.app_name_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_summary_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_notification_time_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_title_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_message_native, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03c3  */
    @Override // com.webengage.sdk.android.actions.render.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d() {
        String str;
        String text;
        int i10;
        int i11;
        String str2 = "setBackgroundColor";
        int i12 = 8;
        if (this.f30386e.size() != this.f30325t) {
            this.f30388g = m();
            RemoteViews remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.carousel_v1);
            remoteViews.setViewVisibility(R.id.carousel_body_portrait, 8);
            remoteViews.setViewVisibility(R.id.carousel_body_landscape, 8);
            remoteViews.setViewVisibility(R.id.next, 8);
            remoteViews.setViewVisibility(R.id.prev, 8);
            this.f30388g.removeAllViews(R.id.custom_base_container);
            if (this.f30327v) {
                n();
                remoteViews.setInt(R.id.carousel_v1_body, "setBackgroundColor", this.f30383b.getBackgroundColor());
                this.f30388g.setInt(R.id.custom_small_head_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
                this.f30388g.setInt(R.id.custom_head_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
                this.f30388g.setInt(R.id.custom_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
            } else {
                o();
            }
            this.f30388g.addView(R.id.custom_base_container, remoteViews);
            return;
        }
        PushNotificationData.CarouselV1 carouselV1Data = this.f30383b.getCarouselV1Data();
        if (carouselV1Data != null) {
            Bundle customData = this.f30383b.getCustomData();
            if (this.f30319n == null) {
                this.f30319n = Long.valueOf(System.currentTimeMillis());
            }
            this.f30387f.setWhen(this.f30319n.longValue());
            boolean parseBoolean = customData != null ? Boolean.parseBoolean(customData.getString("we_dismiss")) : false;
            List<CarouselV1CallToAction> callToActions = carouselV1Data.getCallToActions();
            this.f30388g = m();
            RemoteViews remoteViews2 = new RemoteViews(this.f30382a.getPackageName(), R.layout.carousel_v1);
            Bundle bundle = new Bundle();
            bundle.putLong("when", this.f30319n.longValue());
            bundle.putBoolean("we_wk_render", true);
            PendingIntent constructCarouselBrowsePendingIntent = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f30382a, this.f30383b, this.f30322q, "right", "carousel_v1_right", bundle);
            PendingIntent constructCarouselBrowsePendingIntent2 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f30382a, this.f30383b, this.f30322q, "left", "carousel_v1_left", bundle);
            remoteViews2.setOnClickPendingIntent(R.id.next, constructCarouselBrowsePendingIntent);
            remoteViews2.setOnClickPendingIntent(R.id.prev, constructCarouselBrowsePendingIntent2);
            remoteViews2.setOnClickPendingIntent(R.id.carousel_portrait_2_container, constructCarouselBrowsePendingIntent);
            remoteViews2.setOnClickPendingIntent(R.id.carousel_portrait_0_container, constructCarouselBrowsePendingIntent2);
            String str3 = "setFlipInterval";
            String str4 = "WebEngage";
            if ("portrait".equals(carouselV1Data.getMODE())) {
                Logger.d("WebEngage", "rendering manual carousel portrait mode ");
                if (this.f30383b.getCarouselV1Data().getAutoScrollTime() == -1 || !this.f30326u) {
                    for (int i13 = 0; i13 < this.f30325t; i13++) {
                        if (i13 != 0) {
                            if (i13 == 1) {
                                a(this.f30386e.get(i13), remoteViews2, R.id.carousel_portrait_1_image);
                                a(remoteViews2, callToActions.get(this.f30322q).getText(), R.id.carousel_portrait_1_desc, R.id.carousel_portrait_1_desc_container);
                                PendingIntent constructPushClickPendingIntent = PendingIntentFactory.constructPushClickPendingIntent(this.f30382a, this.f30383b, callToActions.get(this.f30322q), parseBoolean);
                                remoteViews2.setOnClickPendingIntent(R.id.carousel_portrait_1_container, constructPushClickPendingIntent);
                                this.f30388g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent);
                            } else if (i13 == 2) {
                                a(this.f30386e.get(i13), remoteViews2, R.id.carousel_portrait_2_image);
                                text = callToActions.get(this.f30323r).getText();
                                i10 = R.id.carousel_portrait_2_desc;
                                i11 = R.id.carousel_portrait_2_desc_container;
                            }
                        } else {
                            a(this.f30386e.get(i13), remoteViews2, R.id.carousel_portrait_0_image);
                            text = callToActions.get(this.f30324s).getText();
                            i10 = R.id.carousel_portrait_0_desc;
                            i11 = R.id.carousel_portrait_0_desc_container;
                        }
                        a(remoteViews2, text, i10, i11);
                    }
                    remoteViews2.setViewVisibility(R.id.carousel_body_landscape, 8);
                } else {
                    Logger.d("WebEngage", "rendering auto carousel portrait mode ");
                    remoteViews2 = new RemoteViews(this.f30382a.getPackageName(), R.layout.autocarousel);
                    int i14 = 0;
                    while (i14 < this.f30386e.size()) {
                        int size = ((i14 - 1) + this.f30386e.size()) % this.f30386e.size();
                        int i15 = i14 + 1;
                        int size2 = i15 % this.f30386e.size();
                        RemoteViews remoteViews3 = new RemoteViews(this.f30382a.getPackageName(), R.layout.autocarousel_item);
                        remoteViews3.setViewVisibility(R.id.carousel_body_landscape, i12);
                        a(this.f30386e.get(i14), remoteViews3, R.id.carousel_portrait_1_image);
                        a(remoteViews3, callToActions.get(i14).getText(), R.id.carousel_portrait_1_desc, R.id.carousel_portrait_1_desc_container);
                        a(this.f30386e.get(size), remoteViews3, R.id.carousel_portrait_0_image);
                        a(remoteViews3, callToActions.get(size).getText(), R.id.carousel_portrait_0_desc, R.id.carousel_portrait_0_desc_container);
                        a(this.f30386e.get(size2), remoteViews3, R.id.carousel_portrait_2_image);
                        a(remoteViews3, callToActions.get(size2).getText(), R.id.carousel_portrait_2_desc, R.id.carousel_portrait_2_desc_container);
                        int i16 = i14;
                        String str5 = str3;
                        PendingIntent constructCarouselBrowsePendingIntent3 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f30382a, this.f30383b, i16, "left", "autocarousel_v1_left", bundle);
                        PendingIntent constructCarouselBrowsePendingIntent4 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f30382a, this.f30383b, i16, "right", "autocarousel_v1_right", bundle);
                        PendingIntent constructPushClickPendingIntent2 = PendingIntentFactory.constructPushClickPendingIntent(this.f30382a, this.f30383b, callToActions.get(i14), parseBoolean);
                        remoteViews3.setOnClickPendingIntent(R.id.prev, constructCarouselBrowsePendingIntent3);
                        remoteViews3.setOnClickPendingIntent(R.id.next, constructCarouselBrowsePendingIntent4);
                        remoteViews3.setOnClickPendingIntent(R.id.carousel_portrait_1_container, constructPushClickPendingIntent2);
                        this.f30388g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent2);
                        remoteViews2.addView(R.id.carousel_v1_viewflipper, remoteViews3);
                        remoteViews2.setInt(R.id.carousel_v1_viewflipper, str5, this.f30383b.getCarouselV1Data().getAutoScrollTime());
                        str3 = str5;
                        i14 = i15;
                        i12 = 8;
                    }
                }
            } else if ("landscape".equals(carouselV1Data.getMODE())) {
                if (this.f30383b.getCarouselV1Data().getAutoScrollTime() == -1 || !this.f30326u) {
                    str = "setBackgroundColor";
                    Logger.d("WebEngage", "rendering manual carousel landscape mode ");
                    remoteViews2.setViewVisibility(R.id.carousel_body_portrait, 8);
                    a(this.f30386e.get(0), remoteViews2, R.id.carousel_landscape_image);
                    a(remoteViews2, callToActions.get(this.f30322q).getText(), R.id.carousel_landscape_desc, R.id.carousel_landscape_desc_container);
                    PendingIntent constructPushClickPendingIntent3 = PendingIntentFactory.constructPushClickPendingIntent(this.f30382a, this.f30383b, callToActions.get(this.f30322q), parseBoolean);
                    remoteViews2.setOnClickPendingIntent(R.id.carousel_landscape_container, constructPushClickPendingIntent3);
                    this.f30388g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent3);
                    this.f30388g.removeAllViews(R.id.custom_base_container);
                    if (this.f30327v) {
                        o();
                    } else {
                        n();
                        String str6 = str;
                        remoteViews2.setInt(R.id.carousel_v1_body, str6, this.f30383b.getBackgroundColor());
                        this.f30388g.setInt(R.id.custom_small_head_container, str6, this.f30383b.getBackgroundColor());
                        this.f30388g.setInt(R.id.custom_head_container, str6, this.f30383b.getBackgroundColor());
                        this.f30388g.setInt(R.id.custom_container, str6, this.f30383b.getBackgroundColor());
                    }
                    this.f30388g.addView(R.id.custom_base_container, remoteViews2);
                }
                Logger.d("WebEngage", "rendering auto carousel landscape mode ");
                remoteViews2 = new RemoteViews(this.f30382a.getPackageName(), R.layout.autocarousel);
                Logger.d("WebEngage", "validImageSize " + this.f30386e.size());
                int i17 = 0;
                while (i17 < this.f30386e.size()) {
                    Logger.d(str4, "adding text - " + callToActions.get(i17));
                    RemoteViews remoteViews4 = new RemoteViews(this.f30382a.getPackageName(), R.layout.autocarousel_item);
                    remoteViews4.setViewVisibility(R.id.carousel_body_portrait, 8);
                    a(this.f30386e.get(i17), remoteViews4, R.id.carousel_landscape_image);
                    a(remoteViews4, callToActions.get(i17).getText(), R.id.carousel_landscape_desc, R.id.carousel_landscape_desc_container);
                    int i18 = i17;
                    PendingIntent constructCarouselBrowsePendingIntent5 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f30382a, this.f30383b, i18, "left", "autocarousel_v1_left", bundle);
                    PendingIntent constructCarouselBrowsePendingIntent6 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f30382a, this.f30383b, i18, "right", "autocarousel_v1_right", bundle);
                    PendingIntent constructPushClickPendingIntent4 = PendingIntentFactory.constructPushClickPendingIntent(this.f30382a, this.f30383b, callToActions.get(i17), parseBoolean);
                    remoteViews4.setOnClickPendingIntent(R.id.prev, constructCarouselBrowsePendingIntent5);
                    remoteViews4.setOnClickPendingIntent(R.id.next, constructCarouselBrowsePendingIntent6);
                    remoteViews4.setOnClickPendingIntent(R.id.carousel_landscape_container, constructPushClickPendingIntent4);
                    this.f30388g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent4);
                    remoteViews2.addView(R.id.carousel_v1_viewflipper, remoteViews4);
                    remoteViews2.setInt(R.id.carousel_v1_viewflipper, "setFlipInterval", this.f30383b.getCarouselV1Data().getAutoScrollTime());
                    i17++;
                    str4 = str4;
                    str2 = str2;
                }
            }
            str = str2;
            this.f30388g.removeAllViews(R.id.custom_base_container);
            if (this.f30327v) {
            }
            this.f30388g.addView(R.id.custom_base_container, remoteViews2);
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void g() {
        if (this.f30383b.getCarouselV1Data() != null) {
            String mode = this.f30383b.getCarouselV1Data().getMODE();
            List<CarouselV1CallToAction> callToActions = this.f30383b.getCarouselV1Data().getCallToActions();
            if (callToActions != null) {
                Iterator<CarouselV1CallToAction> it = callToActions.iterator();
                while (it.hasNext()) {
                    String imageURL = it.next().getImageURL();
                    if (imageURL != null && !imageURL.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("accept", "image/webp");
                        try {
                            ((InputStream) WENetworkUtil.makeRequest(this.f30382a, new RequestObject.Builder(imageURL, RequestMethod.GET, this.f30382a).setCachePolicy(6).b(mode).setHeaders(hashMap).a(1).build(), true, true).get("data")).close();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
            this.f30320o = this.f30383b.getCarouselV1Data().getSize() - 1;
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void j() {
        Pair<Integer, Bitmap> a10;
        String mode = this.f30383b.getCarouselV1Data().getMODE();
        int size = this.f30383b.getCarouselV1Data().getSize();
        if (this.f30326u) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f30325t = size;
                Pair<Integer, Bitmap> a11 = a(i10, -1, size);
                if (a11 != null) {
                    this.f30386e.add((Bitmap) a11.second);
                }
            }
            return;
        }
        if ("portrait".equals(mode)) {
            this.f30325t = 3;
            if (!this.f30321p.equals("left")) {
                if (this.f30321p.equals("right")) {
                    Pair<Integer, Bitmap> a12 = a(this.f30320o, 1, size);
                    if (a12 != null) {
                        this.f30324s = ((Integer) a12.first).intValue();
                    }
                    Pair<Integer, Bitmap> a13 = a((this.f30324s + 1) % size, 1, size);
                    if (a13 != null) {
                        this.f30322q = ((Integer) a13.first).intValue();
                    }
                    Pair<Integer, Bitmap> a14 = a((this.f30322q + 1) % size, 1, size);
                    if (a12 != null) {
                        this.f30386e.add((Bitmap) a12.second);
                    }
                    if (a13 != null) {
                        this.f30386e.add((Bitmap) a13.second);
                    }
                    if (a14 != null) {
                        this.f30386e.add((Bitmap) a14.second);
                        this.f30323r = ((Integer) a14.first).intValue();
                        return;
                    }
                    return;
                }
                return;
            }
            a10 = a(this.f30320o, -1, size);
            if (a10 != null) {
                this.f30323r = ((Integer) a10.first).intValue();
            }
            Pair<Integer, Bitmap> a15 = a(((this.f30323r - 1) + size) % size, -1, size);
            if (a15 != null) {
                this.f30322q = ((Integer) a15.first).intValue();
            }
            Pair<Integer, Bitmap> a16 = a(((this.f30322q - 1) + size) % size, -1, size);
            if (a16 != null) {
                this.f30324s = ((Integer) a16.first).intValue();
                this.f30386e.add((Bitmap) a16.second);
            }
            if (a15 != null) {
                this.f30386e.add((Bitmap) a15.second);
            }
            if (a10 == null) {
                return;
            }
        } else {
            if (!"landscape".equals(mode)) {
                return;
            }
            this.f30325t = 1;
            if ("left".equals(this.f30321p)) {
                a10 = a(((this.f30320o - 1) + size) % size, -1, size);
                if (a10 == null) {
                    return;
                }
            } else if (!"right".equals(this.f30321p) || (a10 = a((this.f30320o + 1) % size, 1, size)) == null) {
                return;
            }
            this.f30322q = ((Integer) a10.first).intValue();
        }
        this.f30386e.add((Bitmap) a10.second);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getCarouselV1Data().getAutoScrollTime() != -1) {
            this.f30326u = true;
        }
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f30327v = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30328w = true;
        }
        return super.onRender(context, pushNotificationData);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (bundle != null) {
            this.f30319n = Long.valueOf(bundle.getLong("when"));
            this.f30320o = bundle.getInt("current");
            this.f30321p = bundle.getString("navigation");
            this.f30326u = bundle.getBoolean("autcarousel_activated");
        }
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f30327v = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30328w = true;
        }
        return super.onRerender(context, pushNotificationData, bundle);
    }

    private void a(RemoteViews remoteViews, String str, int i10, int i11) {
        int i12;
        String removeEmptyAndSpecialChars = PushUtils.removeEmptyAndSpecialChars(new WEHtmlParserInterface().fromHtml(str).toString());
        if (TextUtils.isEmpty(removeEmptyAndSpecialChars)) {
            i12 = 8;
        } else {
            remoteViews.setTextViewText(i10, removeEmptyAndSpecialChars);
            i12 = 0;
        }
        remoteViews.setViewVisibility(i10, i12);
        remoteViews.setViewVisibility(i11, i12);
    }
}
