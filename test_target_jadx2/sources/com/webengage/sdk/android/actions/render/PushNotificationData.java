package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushNotificationData extends C2952a {
    private int accentColor;
    private String appName;
    private String autoDismissTime;
    private boolean autoExpand;
    private int backgroundColor;
    private JSONObject bigNotificationData;
    private BigPictureStyle bigPictureStyle;
    private BigTextStyle bigTextStyle;
    private List<CallToAction> callToActions;
    private CarouselV1 carouselV1;
    private JSONObject cta;
    private int currentIndex;
    private InboxStyle inboxStyle;
    private boolean isSticky;
    private Bitmap largeIcon;
    private String largeIconUrl;
    private OverlayStyle overlayStyle;
    private RatingV1 ratingV1;
    private int smallIcon;
    private String style;
    private JSONObject testingDetails;
    private TimerStyle timerStyle;

    public class BaseStyleData {
        private String bigContentTitle;
        private String message;
        private String summary;

        public BaseStyleData(JSONObject jSONObject) {
            this.bigContentTitle = null;
            this.message = null;
            this.summary = null;
            this.bigContentTitle = jSONObject.isNull("rt") ? PushNotificationData.this.getTitle() : jSONObject.optString("rt");
            this.message = jSONObject.isNull("rm") ? PushNotificationData.this.getContentText() : jSONObject.optString("rm");
            this.summary = jSONObject.isNull("rst") ? PushNotificationData.this.getContentSummary() : jSONObject.optString("rst");
        }

        public String getBigContentTitle() {
            return this.bigContentTitle;
        }

        public String getMessage() {
            return this.message;
        }

        public String getSummary() {
            return this.summary;
        }

        public void setBigContentTitle(String str) {
            this.bigContentTitle = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setSummary(String str) {
            this.summary = str;
        }
    }

    public class BigPictureStyle extends BaseStyleData {
        private String bigPictureUrl;

        public BigPictureStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.bigPictureUrl = null;
            this.bigPictureUrl = jSONObject.isNull("image") ? null : jSONObject.optString("image");
        }

        public String getBigPictureUrl() {
            return this.bigPictureUrl;
        }

        public void setBigPictureUrl(String str) {
            this.bigPictureUrl = str;
        }
    }

    public class BigTextStyle extends BaseStyleData {
        private String bigText;

        public BigTextStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.bigText = null;
            this.bigText = jSONObject.isNull("rm") ? PushNotificationData.this.getContentText() : jSONObject.optString("rm");
        }

        public String getBigText() {
            return this.bigText;
        }

        public void setBigText(String str) {
            this.bigText = str;
        }
    }

    public class CarouselV1 extends BaseStyleData {
        private final String MODE;
        private int autoScrollTime;
        private List<CarouselV1CallToAction> callToActions;
        private int size;

        public CarouselV1(JSONObject jSONObject) {
            super(jSONObject);
            this.callToActions = null;
            this.size = 0;
            this.autoScrollTime = -1;
            this.callToActions = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                this.size = optJSONArray.length();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null && !optJSONObject.isNull("id") && !optJSONObject.isNull("image")) {
                        this.callToActions.add(new CarouselV1CallToAction(optJSONObject, optJSONObject.optString("actionText"), optJSONObject.optString("image")));
                    }
                }
            }
            this.MODE = jSONObject.optString("mode", "landscape");
            this.autoScrollTime = jSONObject.optInt("ast", -1);
        }

        public int getAutoScrollTime() {
            return this.autoScrollTime;
        }

        public List<CarouselV1CallToAction> getCallToActions() {
            return this.callToActions;
        }

        public String getMODE() {
            return this.MODE;
        }

        protected int getSize() {
            return this.size;
        }

        public void setAutoScrollTime(int i10) {
            this.autoScrollTime = i10;
        }

        public void setCallToActions(List<CarouselV1CallToAction> list) {
            this.callToActions = list;
        }
    }

    public class InboxStyle extends BaseStyleData {
        private List<String> lines;

        public InboxStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.lines = null;
            JSONArray optJSONArray = jSONObject.isNull("lines") ? null : jSONObject.optJSONArray("lines");
            if (optJSONArray != null) {
                this.lines = new LinkedList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.lines.add(optJSONArray.optString(i10));
                }
            }
        }

        public List<String> getInboxLines() {
            return this.lines;
        }

        public void setLines(List<String> list) {
            this.lines = list;
        }
    }

    public class OverlayStyle extends BaseStyleData {
        private Boolean appNameVisibility;
        private String collapsedImageUrl;
        private String expandedImageUrl;
        private String subStyle;

        public OverlayStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.expandedImageUrl = null;
            this.collapsedImageUrl = null;
            this.subStyle = null;
            this.appNameVisibility = Boolean.TRUE;
            this.expandedImageUrl = jSONObject.isNull("image") ? null : jSONObject.optString("image");
            this.collapsedImageUrl = jSONObject.isNull("cm_img") ? null : jSONObject.optString("cm_img");
            this.subStyle = jSONObject.isNull("ss") ? null : jSONObject.optString("ss");
            this.appNameVisibility = jSONObject.isNull("a_n_vis") ? null : Boolean.valueOf(jSONObject.optBoolean("a_n_vis"));
        }

        public Boolean getAppNameVisibility() {
            return this.appNameVisibility;
        }

        public String getCollapsedImageUrl() {
            return this.collapsedImageUrl;
        }

        public String getExpandedImageUrl() {
            return this.expandedImageUrl;
        }

        public String getSubStyle() {
            return this.subStyle;
        }

        public void setAppNameVisibility(Boolean bool) {
            this.appNameVisibility = bool;
        }

        public void setCollapsedImageUrl(String str) {
            this.collapsedImageUrl = str;
        }

        public void setExpandedImageUrl(String str) {
            this.expandedImageUrl = str;
        }

        public void setSubStyle(String str) {
            this.subStyle = str;
        }
    }

    public class RatingV1 extends BaseStyleData {
        private int contentBackgroundColor;
        private String contentMessage;
        private int contentTextColor;
        private String contentTitle;
        private String iconUrl;
        private String imageUrl;
        private int rateScale;
        private int rateValue;
        private CallToAction submitCTA;

        public RatingV1(JSONObject jSONObject) {
            super(jSONObject);
            this.contentBackgroundColor = Color.parseColor("#00000000");
            this.imageUrl = null;
            this.contentTitle = null;
            this.contentMessage = null;
            this.iconUrl = null;
            this.rateScale = 5;
            this.contentTextColor = Color.parseColor("#000000");
            this.submitCTA = null;
            this.rateValue = -1;
            if (jSONObject != null) {
                this.imageUrl = jSONObject.isNull("image") ? null : jSONObject.optString("image");
                this.iconUrl = jSONObject.isNull("icon") ? null : jSONObject.optString("icon");
                this.rateScale = jSONObject.optInt("rateScale", 5);
                JSONObject optJSONObject = jSONObject.optJSONObject("content");
                if (optJSONObject != null) {
                    this.contentTitle = optJSONObject.isNull("title") ? null : optJSONObject.optString("title");
                    this.contentMessage = optJSONObject.isNull("message") ? null : optJSONObject.optString("message");
                    if (!optJSONObject.isNull("textColor")) {
                        this.contentTextColor = Color.parseColor(optJSONObject.optString("textColor"));
                    }
                    if (!optJSONObject.isNull("bckColor")) {
                        try {
                            this.contentBackgroundColor = Color.parseColor(optJSONObject.optString("bckColor"));
                        } catch (Exception unused) {
                            Logger.e("WebEngage", "Error parsing bckColor. Not setting background color");
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("submitCTA");
                if (optJSONObject2 != null) {
                    this.submitCTA = new CallToAction(optJSONObject2.optString("id"), optJSONObject2.isNull("actionText") ? "Submit" : optJSONObject2.optString("actionText"), optJSONObject2.optString("actionLink"), false, false);
                } else {
                    this.submitCTA = new CallToAction(null, "Submit", null, false, false);
                }
            }
        }

        public int getContentBackgroundColor() {
            return this.contentBackgroundColor;
        }

        public String getContentMessage() {
            return this.contentMessage;
        }

        public int getContentTextColor() {
            return this.contentTextColor;
        }

        public String getContentTitle() {
            return this.contentTitle;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public int getRateScale() {
            return this.rateScale;
        }

        public int getRateValue() {
            return this.rateValue;
        }

        public CallToAction getSubmitCTA() {
            return this.submitCTA;
        }

        public void setRateValue(int i10) {
            this.rateValue = i10;
        }
    }

    public class TimerStyle extends BaseStyleData {
        private String duration;
        private String futureTime;
        private String imageUrl;
        private int progressBarBackgroundColor;
        private int progressBarColor;
        private String timeZone;
        private int timerColor;

        public TimerStyle(JSONObject jSONObject, Context context) {
            super(jSONObject);
            this.imageUrl = jSONObject.isNull("image") ? null : jSONObject.optString("image");
            this.duration = jSONObject.isNull("dr") ? null : jSONObject.optString("dr");
            this.futureTime = jSONObject.isNull("ft") ? null : jSONObject.optString("ft");
            this.timeZone = jSONObject.isNull("tz") ? null : jSONObject.optString("tz");
            this.timerColor = androidx.core.content.a.c(context, R.color.we_black);
            if (!jSONObject.isNull("tc")) {
                try {
                    if (!TextUtils.isEmpty(jSONObject.getString("tc"))) {
                        this.timerColor = Color.parseColor(jSONObject.getString("tc"));
                    }
                } catch (Exception e10) {
                    Logger.e("WebEngage", "Exception while parsing timerColor " + e10);
                }
            }
            this.progressBarColor = androidx.core.content.a.c(context, R.color.we_progress);
            if (!jSONObject.isNull("pc")) {
                try {
                    if (!TextUtils.isEmpty(jSONObject.getString("pc"))) {
                        this.progressBarColor = Color.parseColor(jSONObject.getString("pc"));
                    }
                } catch (Exception e11) {
                    this.progressBarColor = androidx.core.content.a.c(context, R.color.we_progress);
                    Logger.e("WebEngage", "Exception while parsing progressBarColor " + e11);
                }
            }
            this.progressBarBackgroundColor = androidx.core.content.a.c(context, R.color.we_progress_tint);
            if (jSONObject.isNull("pbc")) {
                return;
            }
            try {
                if (TextUtils.isEmpty(jSONObject.getString("pbc"))) {
                    return;
                }
                this.progressBarBackgroundColor = Color.parseColor(jSONObject.getString("pbc"));
            } catch (Exception e12) {
                Logger.e("WebEngage", "Exception while parsing progressBarColor " + e12);
            }
        }

        public String getDuration() {
            return this.duration;
        }

        public String getFutureTime() {
            return this.futureTime;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public int getProgressBarBackgroundColor() {
            return this.progressBarBackgroundColor;
        }

        public int getProgressBarColor() {
            return this.progressBarColor;
        }

        public String getTimeZone() {
            return this.timeZone;
        }

        public int getTimerColor() {
            return this.timerColor;
        }

        public void setDuration(String str) {
            this.duration = str;
        }

        public void setFutureTime(String str) {
            this.futureTime = str;
        }

        public void setImageUrl(String str) {
            this.imageUrl = str;
        }

        public void setProgressBarBackgroundColor(int i10) {
            this.progressBarBackgroundColor = i10;
        }

        public void setProgressBarColor(int i10) {
            this.progressBarColor = i10;
        }

        public void setTimeZone(String str) {
            this.timeZone = str;
        }

        public void setTimerColor(int i10) {
            this.timerColor = i10;
        }
    }

    public PushNotificationData(JSONObject jSONObject, Context context) {
        super(jSONObject, "system_tray", context);
        this.bigNotificationData = null;
        this.testingDetails = null;
        this.bigPictureStyle = null;
        this.bigTextStyle = null;
        this.inboxStyle = null;
        this.carouselV1 = null;
        this.ratingV1 = null;
        this.overlayStyle = null;
        this.timerStyle = null;
        this.style = null;
        this.largeIcon = null;
        this.smallIcon = -1;
        this.appName = null;
        this.autoExpand = true;
        this.accentColor = -1;
        this.currentIndex = 0;
        this.isSticky = false;
        this.backgroundColor = Color.parseColor("#00000000");
        this.largeIconUrl = null;
        this.autoDismissTime = null;
        this.bigNotificationData = jSONObject.isNull("expandableDetails") ? null : jSONObject.optJSONObject("expandableDetails");
        this.testingDetails = jSONObject.isNull("testing_details") ? null : jSONObject.optJSONObject("testing_details");
        this.callToActions = readCallToActions(jSONObject, context);
        this.accentColor = WebEngage.get().getWebEngageConfig().getAccentColor();
        int pushSmallIcon = WebEngage.get().getWebEngageConfig().getPushSmallIcon();
        this.smallIcon = pushSmallIcon;
        if (pushSmallIcon == -1) {
            this.smallIcon = context.getApplicationContext().getApplicationInfo().icon;
        }
        JSONObject jSONObject2 = this.bigNotificationData;
        if (jSONObject2 != null && !jSONObject2.isNull("l_ic")) {
            this.largeIconUrl = this.bigNotificationData.getString("l_ic");
        }
        if (TextUtils.isEmpty(this.largeIconUrl)) {
            createLargeIconFromAsset(context);
        }
        if (this.appName == null) {
            try {
                this.appName = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            } catch (Exception e10) {
                Logger.e("WebEngage", e10.toString() + " loading app name");
            }
        }
        this.isSticky = jSONObject.optBoolean("s", false);
        if (!jSONObject.isNull("bckColor")) {
            try {
                if (!TextUtils.isEmpty(jSONObject.getString("bckColor"))) {
                    this.backgroundColor = Color.parseColor(jSONObject.getString("bckColor"));
                    Logger.d("WebEngage", "BackGround color : " + this.backgroundColor);
                }
            } catch (Exception e11) {
                Logger.e("WebEngage", "Exception while parsing bckColor " + e11.toString());
                this.backgroundColor = Color.parseColor("#00000000");
            }
        }
        JSONObject jSONObject3 = this.bigNotificationData;
        if (jSONObject3 != null && !jSONObject3.isNull("adms")) {
            this.autoDismissTime = this.bigNotificationData.getString("adms");
        }
        JSONObject jSONObject4 = this.bigNotificationData;
        if (jSONObject4 == null || jSONObject4.isNull("style")) {
            return;
        }
        String optString = this.bigNotificationData.optString("style");
        this.style = optString;
        if ("BIG_TEXT".equalsIgnoreCase(optString)) {
            this.bigTextStyle = new BigTextStyle(this.bigNotificationData);
            return;
        }
        if ("BIG_PICTURE".equalsIgnoreCase(this.style)) {
            this.bigPictureStyle = new BigPictureStyle(this.bigNotificationData);
            return;
        }
        if ("INBOX".equalsIgnoreCase(this.style)) {
            this.inboxStyle = new InboxStyle(this.bigNotificationData);
            return;
        }
        if ("CAROUSEL_V1".equalsIgnoreCase(this.style)) {
            CarouselV1 carouselV1 = new CarouselV1(this.bigNotificationData);
            this.carouselV1 = carouselV1;
            this.callToActions.addAll(carouselV1.getCallToActions());
            return;
        }
        if ("RATING_V1".equalsIgnoreCase(this.style)) {
            RatingV1 ratingV1 = new RatingV1(this.bigNotificationData);
            this.ratingV1 = ratingV1;
            if (ratingV1.getSubmitCTA() != null) {
                this.callToActions.add(this.ratingV1.getSubmitCTA());
                return;
            }
            return;
        }
        if ("TIMER".equalsIgnoreCase(this.style) || "PROGRESS_BAR".equalsIgnoreCase(this.style) || "BIG_TIMER".equalsIgnoreCase(this.style)) {
            this.timerStyle = new TimerStyle(this.bigNotificationData, context);
        } else if ("OVERLAY".equalsIgnoreCase(this.style)) {
            this.overlayStyle = new OverlayStyle(this.bigNotificationData);
        }
    }

    private Bitmap createBitmapFromDrawable(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CallToAction> readCallToActions(JSONObject jSONObject, Context context) {
        CallToAction callToAction;
        CallToAction callToAction2;
        CallToAction callToAction3;
        CallToAction callToAction4;
        JSONObject optJSONObject = jSONObject.isNull("expandableDetails") ? null : jSONObject.optJSONObject("expandableDetails");
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject2 = jSONObject.isNull("cta") ? null : jSONObject.optJSONObject("cta");
        this.cta = optJSONObject2;
        if (optJSONObject2 != null) {
            if (!optJSONObject2.isNull("id")) {
                callToAction = this.cta.optJSONObject("ca") != null ? new CallToAction(this.cta, getContentText(), true, true) : new CallToAction(this.cta.optString("id"), getContentText(), this.cta.optString("actionLink"), true, true);
            }
            if (optJSONObject != null) {
                JSONObject optJSONObject3 = optJSONObject.isNull("cta1") ? null : optJSONObject.optJSONObject("cta1");
                this.cta = optJSONObject3;
                if (optJSONObject3 != null) {
                    if (optJSONObject3.isNull("id") || this.cta.isNull("rat")) {
                        if (!this.cta.isNull("id") && !this.cta.isNull("actionText")) {
                            if (this.cta.optJSONObject("ca") != null) {
                                JSONObject jSONObject2 = this.cta;
                                callToAction4 = new CallToAction(jSONObject2, jSONObject2.optString("actionText"), false, true);
                            } else {
                                callToAction4 = new CallToAction(this.cta.optString("id"), this.cta.optString("actionText"), this.cta.optString("actionLink"), false, true);
                            }
                        }
                    } else if (this.cta.optJSONObject("ca") != null) {
                        JSONObject jSONObject3 = this.cta;
                        callToAction4 = new CallToAction(jSONObject3, jSONObject3.optString("rat"), false, true);
                    } else {
                        callToAction4 = new CallToAction(this.cta.optString("id"), this.cta.optString("rat"), this.cta.optString("actionLink"), false, true);
                    }
                    arrayList.add(callToAction4);
                }
                JSONObject optJSONObject4 = optJSONObject.isNull("cta2") ? null : optJSONObject.optJSONObject("cta2");
                this.cta = optJSONObject4;
                if (optJSONObject4 != null) {
                    if (optJSONObject4.isNull("id") || this.cta.isNull("rat")) {
                        if (!this.cta.isNull("id") && !this.cta.isNull("actionText")) {
                            if (this.cta.optJSONObject("ca") != null) {
                                JSONObject jSONObject4 = this.cta;
                                callToAction3 = new CallToAction(jSONObject4, jSONObject4.optString("actionText"), false, true);
                            } else {
                                callToAction3 = new CallToAction(this.cta.optString("id"), this.cta.optString("actionText"), this.cta.optString("actionLink"), false, true);
                            }
                        }
                    } else if (this.cta.optJSONObject("ca") != null) {
                        JSONObject jSONObject5 = this.cta;
                        callToAction3 = new CallToAction(jSONObject5, jSONObject5.optString("rat"), false, true);
                    } else {
                        callToAction3 = new CallToAction(this.cta.optString("id"), this.cta.optString("rat"), this.cta.optString("actionLink"), false, true);
                    }
                    arrayList.add(callToAction3);
                }
                JSONObject optJSONObject5 = optJSONObject.isNull("cta3") ? null : optJSONObject.optJSONObject("cta3");
                this.cta = optJSONObject5;
                if (optJSONObject5 != null) {
                    if (optJSONObject5.isNull("id") || this.cta.isNull("rat")) {
                        if (!this.cta.isNull("id") && !this.cta.isNull("actionText")) {
                            if (this.cta.optJSONObject("ca") != null) {
                                JSONObject jSONObject6 = this.cta;
                                callToAction2 = new CallToAction(jSONObject6, jSONObject6.optString("actionText"), false, true);
                            } else {
                                callToAction2 = new CallToAction(this.cta.optString("id"), this.cta.optString("actionText"), this.cta.optString("actionLink"), false, true);
                            }
                        }
                    } else if (this.cta.optJSONObject("ca") != null) {
                        JSONObject jSONObject7 = this.cta;
                        callToAction2 = new CallToAction(jSONObject7, jSONObject7.optString("rat"), false, true);
                    } else {
                        callToAction2 = new CallToAction(this.cta.optString("id"), this.cta.optString("rat"), this.cta.optString("actionLink"), false, true);
                    }
                    arrayList.add(callToAction2);
                }
            }
            return arrayList;
        }
        callToAction = new CallToAction(null, getContentText(), null, true, true);
        arrayList.add(callToAction);
        if (optJSONObject != null) {
        }
        return arrayList;
    }

    protected void createLargeIconFromAsset(Context context) {
        int pushLargeIcon = WebEngage.get().getWebEngageConfig().getPushLargeIcon();
        this.largeIcon = pushLargeIcon == -1 ? BitmapFactory.decodeResource(context.getApplicationContext().getResources(), context.getApplicationContext().getApplicationInfo().icon) : BitmapFactory.decodeResource(context.getApplicationContext().getResources(), pushLargeIcon);
        if (this.largeIcon == null) {
            Logger.d("WebEngage", "large icon is not available in the resources. Creating Bitmap from app icon");
            this.largeIcon = createBitmapFromDrawable(context.getPackageManager().getApplicationIcon(context.getApplicationInfo()));
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PushNotificationData) {
            return getExperimentId().equals(((PushNotificationData) obj).getExperimentId());
        }
        return false;
    }

    public int getAccentColor() {
        return this.accentColor;
    }

    public List<CallToAction> getActions() {
        List<CallToAction> list = this.callToActions;
        ArrayList arrayList = null;
        if (list != null && list.size() > 0) {
            for (CallToAction callToAction : this.callToActions) {
                if (callToAction != null && !callToAction.isPrimeAction() && callToAction.isNative()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(callToAction);
                }
            }
        }
        return arrayList;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAutoDismissTime() {
        return this.autoDismissTime;
    }

    public boolean getAutoExpand() {
        return this.autoExpand;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public BigPictureStyle getBigPictureStyleData() {
        return this.bigPictureStyle;
    }

    public BigTextStyle getBigTextStyleData() {
        return this.bigTextStyle;
    }

    public CallToAction getCallToActionById(String str) {
        List<CallToAction> list = this.callToActions;
        if (list == null || list.size() <= 0 || str == null || str.isEmpty()) {
            return null;
        }
        for (CallToAction callToAction : this.callToActions) {
            if (callToAction != null && str.equals(callToAction.getId())) {
                return callToAction;
            }
        }
        return null;
    }

    public List<CallToAction> getCallToActions() {
        return this.callToActions;
    }

    public CarouselV1 getCarouselV1Data() {
        return this.carouselV1;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getChannelId() {
        return super.getChannelId();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getCollapseKey() {
        return super.getCollapseKey();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getContentSummary() {
        return super.getContentSummary();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getContentText() {
        return super.getContentText();
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ Bundle getCustomData() {
        return super.getCustomData();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getExperimentId() {
        return super.getExperimentId();
    }

    public InboxStyle getInboxStyleData() {
        return this.inboxStyle;
    }

    public Bitmap getLargeIcon() {
        return this.largeIcon;
    }

    public String getLargeIconUrl() {
        return this.largeIconUrl;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ int getLedColor() {
        return super.getLedColor();
    }

    public OverlayStyle getOverlayStyle() {
        return this.overlayStyle;
    }

    public CallToAction getPrimeCallToAction() {
        List<CallToAction> list = this.callToActions;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (CallToAction callToAction : this.callToActions) {
            if (callToAction != null && callToAction.isPrimeAction()) {
                return callToAction;
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ int getPriority() {
        return super.getPriority();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ JSONObject getPushPayloadJSON() {
        return super.getPushPayloadJSON();
    }

    public RatingV1 getRatingV1() {
        return this.ratingV1;
    }

    public int getSmallIcon() {
        return this.smallIcon;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ Uri getSound() {
        return super.getSound();
    }

    public WebEngageConstant.STYLE getStyle() {
        try {
            return WebEngageConstant.STYLE.valueOf(this.style);
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject getTestingDetails() {
        return this.testingDetails;
    }

    public TimerStyle getTimerStyleData() {
        return this.timerStyle;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getTitle() {
        return super.getTitle();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ String getVariationId() {
        return super.getVariationId();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ boolean getVibrateFlag() {
        return super.getVibrateFlag();
    }

    public int hashCode() {
        return getExperimentId().hashCode();
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ boolean isAmplified() {
        return super.isAmplified();
    }

    public boolean isBigNotification() {
        return this.bigNotificationData != null;
    }

    public boolean isCustomRender() {
        Bundle customData = getCustomData();
        return customData != null && customData.containsKey("we_custom_render") && Boolean.parseBoolean(customData.getString("we_custom_render"));
    }

    public boolean isSticky() {
        return this.isSticky;
    }

    public void setAccentColor(int i10) {
        this.accentColor = i10;
    }

    public void setAutoDismissTime(String str) {
        this.autoDismissTime = str;
    }

    public void setAutoExpand(boolean z10) {
        this.autoExpand = z10;
    }

    public void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ void setChannelId(String str) {
        super.setChannelId(str);
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ void setContentSummary(String str) {
        super.setContentSummary(str);
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ void setContentText(String str) {
        super.setContentText(str);
    }

    public void setCurrentIndex(int i10) {
        this.currentIndex = i10;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    @Deprecated
    public /* bridge */ /* synthetic */ void setCustomData(Bundle bundle) {
        super.setCustomData(bundle);
    }

    public void setLargeIconUrl(String str) {
        this.largeIconUrl = str;
    }

    public void setLargerIcon(Bitmap bitmap) {
        this.largeIcon = bitmap;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ void setLedLight(int i10) {
        super.setLedLight(i10);
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    @Deprecated
    public /* bridge */ /* synthetic */ void setPriority(int i10) {
        super.setPriority(i10);
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ void setShouldRender(boolean z10) {
        super.setShouldRender(z10);
    }

    public void setSmallIcon(int i10) {
        this.smallIcon = i10;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    @Deprecated
    public /* bridge */ /* synthetic */ void setSound(Uri uri) {
        super.setSound(uri);
    }

    public void setSticky(boolean z10) {
        this.isSticky = z10;
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ void setTitle(String str) {
        super.setTitle(str);
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    @Deprecated
    public /* bridge */ /* synthetic */ void setVibrateFlag(boolean z10) {
        super.setVibrateFlag(z10);
    }

    @Override // com.webengage.sdk.android.actions.render.C2952a
    public /* bridge */ /* synthetic */ boolean shouldRender() {
        return super.shouldRender();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(getClass().getName() + " Object { " + property);
        sb2.append(" Experiment Id : " + getExperimentId() + property);
        sb2.append(" Variation Id : " + getVariationId() + property);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" CollapseKey : ");
        sb3.append(TextUtils.isEmpty(getCollapseKey()) ? "null" : getCollapseKey());
        sb3.append(property);
        sb2.append(sb3.toString());
        sb2.append(" Title : " + getTitle() + property);
        sb2.append(" Message : " + getContentText() + property);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Summary : ");
        sb4.append(getContentSummary() != null ? getContentSummary() : "null");
        sb4.append(property);
        sb2.append(sb4.toString());
        if (getPrimeCallToAction() != null) {
            sb2.append(" Main CTA : " + getPrimeCallToAction() + " ID : " + getPrimeCallToAction().getId() + property);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(" Custom Data : ");
        sb5.append(getCustomData() != null ? getCustomData().toString() : "null");
        sb5.append(property);
        sb2.append(sb5.toString());
        if (this.bigNotificationData != null) {
            sb2.append(" Expandable Details : " + this.bigNotificationData.toString() + property);
        }
        sb2.append(" Amplified: " + isAmplified() + property);
        sb2.append("}");
        return sb2.toString();
    }
}
